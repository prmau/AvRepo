package main.java.server;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.hadoop.util.Time;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import main.java.avro.DeviceState;
import main.java.proto.AvroreposGrpc;
import main.java.proto.SaveDeviceStateRequest;
import main.java.proto.SaveDeviceStateResponse;

public class AvroServer {
    private static final Logger logger = Logger.getLogger(AvroServer.class.getName());
    private Server server;
    
    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50054;//new AvroRepoServer()
        server = ServerBuilder.forPort(port)
        .addService(new AvroreposImpl())
        .build()
        .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
          @Override
          public void run() {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
              AvroServer.this.stop();
            } catch (InterruptedException e) {
              e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
          }
        });
      }

      private void stop() throws InterruptedException {
        if (server != null) {
          server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
      }
    
      /**
       * Await termination on the main thread since the grpc library uses daemon threads.
       */
      private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
          server.awaitTermination();
        }
      }
    
      /**
       * Main launches the server from the command line.
       */
      public static void main(String[] args) throws IOException, InterruptedException {
        final AvroServer aserver = new AvroServer();
        aserver.start();
        aserver.blockUntilShutdown();
      }
    
      static class AvroreposImpl extends AvroreposGrpc.AvroreposImplBase{

        @Override
        public void setDeviceState(SaveDeviceStateRequest request,
            StreamObserver<SaveDeviceStateResponse> responseObserver) {
              try{
                saveDatoToAvroFile(request);
              }
              catch(IOException e){
                System.out.println(e.getMessage());
              }
              SaveDeviceStateResponse response = SaveDeviceStateResponse.newBuilder().setStatus(true).build();
              responseObserver.onNext(response);
              responseObserver.onCompleted();
        }
        private void saveDatoToAvroFile(SaveDeviceStateRequest req) throws IOException{
          // Serialize ds1, ds2 to disk
          Schema schema = new Parser().parse(new File("src//main/java//schema//DeviceState.avsc"));
          DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<GenericRecord>(schema);

          //Construct via builder
          DeviceState ds = DeviceState.newBuilder()
                          .setDate(req.getDs().getDate())
                          .setDeviceId(req.getDs().getDeviceId())
                          .setNamespaceId(req.getDs().getNamespaceId())
                          .setReportedState(req.getDs().getReportedState().toString())
                          .setDesiredState(req.getDs().getDesiredState().toString())
                          .setTimestamp(req.getDs().getTimestamp().toString())
                          .build();
          
          File file = new File("devicestate.avro");
          DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter);
          dataFileWriter.create(schema, file);
          dataFileWriter.append(ds);
          dataFileWriter.close();

          // Deserialize users from disk
          DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
          GenericRecord ds3 = null;
          try(DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(file, datumReader)){
            while (dataFileReader.hasNext()) {
              // Reuse user object by passing it to next(). This saves us from
              // allocating and garbage collecting many objects for files with
              // many items.
              ds3 = dataFileReader.next(ds3);
              System.out.println(ds3);
            }
          }
        }
      }
}
