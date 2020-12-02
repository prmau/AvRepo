/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.java;
import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.hadoop.util.Time;

import com.google.protobuf.ByteString;

import main.java.avro.DeviceState;

public class SpecificMain{
  public static void main(String[] args) throws IOException {
    //DeviceState ds = new DeviceState();
    //ds.setDeviceId("0x1");
    //ds.setDate("10.12.90");

    //Construct via builder
	//Device State Example : "monitoring": "02.12.2020 16:24:38"
	  
    DeviceState ds = DeviceState.newBuilder()
                    .setDate("sff")
                    .setDeviceId("0x26")
                    .setNamespaceId("afefa")
                    .setReportedState(ByteString.EMPTY.toString())
                    .setDesiredState(ByteString.EMPTY.toString())
                    .setTimestamp(Time.formatTime(Time.getUtcTime()))
                    .build();

    // Serialize user1 and user2 to disk
    File file = new File("src//test//java//devicestate.avro");
    DatumWriter<DeviceState> userDatumWriter = new SpecificDatumWriter<DeviceState>(DeviceState.class);
    DataFileWriter<DeviceState> dataFileWriter = new DataFileWriter<DeviceState>(userDatumWriter);
    dataFileWriter.create(ds.getSchema(), file);
    dataFileWriter.close();

    // Deserialize Users from disk
    DatumReader<DeviceState> userDatumReader = new SpecificDatumReader<DeviceState>(DeviceState.class);
    DeviceState ds1 = null;
    try(DataFileReader<DeviceState> dataFileReader = new DataFileReader<DeviceState>(file, userDatumReader)){
      while (dataFileReader.hasNext()) {
        // Reuse user object by passing it to next(). This saves us from
        // allocating and garbage collecting many objects for files with
        // many items.
        ds1 = dataFileReader.next(ds1);
        System.out.println(ds1);
      }
    }
  }
}
