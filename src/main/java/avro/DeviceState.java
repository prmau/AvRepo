/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package main.java.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DeviceState extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3474598969559763448L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceState\",\"namespace\":\"main.java.avro\",\"fields\":[{\"name\":\"NamespaceId\",\"type\":\"string\"},{\"name\":\"DeviceId\",\"type\":\"string\"},{\"name\":\"Date\",\"type\":\"string\"},{\"name\":\"ReportedState\",\"type\":[\"null\",\"string\"]},{\"name\":\"DesiredState\",\"type\":[\"null\",\"string\"]},{\"name\":\"Timestamp\",\"type\":\"string\",\"logicalType\":\"timestamp-millis\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DeviceState> ENCODER =
      new BinaryMessageEncoder<DeviceState>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DeviceState> DECODER =
      new BinaryMessageDecoder<DeviceState>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DeviceState> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DeviceState> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DeviceState> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DeviceState>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DeviceState to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DeviceState from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DeviceState instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DeviceState fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence NamespaceId;
   private java.lang.CharSequence DeviceId;
   private java.lang.CharSequence Date;
   private java.lang.CharSequence ReportedState;
   private java.lang.CharSequence DesiredState;
   private java.lang.CharSequence Timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeviceState() {}

  /**
   * All-args constructor.
   * @param NamespaceId The new value for NamespaceId
   * @param DeviceId The new value for DeviceId
   * @param Date The new value for Date
   * @param ReportedState The new value for ReportedState
   * @param DesiredState The new value for DesiredState
   * @param Timestamp The new value for Timestamp
   */
  public DeviceState(java.lang.CharSequence NamespaceId, java.lang.CharSequence DeviceId, java.lang.CharSequence Date, java.lang.CharSequence ReportedState, java.lang.CharSequence DesiredState, java.lang.CharSequence Timestamp) {
    this.NamespaceId = NamespaceId;
    this.DeviceId = DeviceId;
    this.Date = Date;
    this.ReportedState = ReportedState;
    this.DesiredState = DesiredState;
    this.Timestamp = Timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return NamespaceId;
    case 1: return DeviceId;
    case 2: return Date;
    case 3: return ReportedState;
    case 4: return DesiredState;
    case 5: return Timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: NamespaceId = (java.lang.CharSequence)value$; break;
    case 1: DeviceId = (java.lang.CharSequence)value$; break;
    case 2: Date = (java.lang.CharSequence)value$; break;
    case 3: ReportedState = (java.lang.CharSequence)value$; break;
    case 4: DesiredState = (java.lang.CharSequence)value$; break;
    case 5: Timestamp = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'NamespaceId' field.
   * @return The value of the 'NamespaceId' field.
   */
  public java.lang.CharSequence getNamespaceId() {
    return NamespaceId;
  }


  /**
   * Sets the value of the 'NamespaceId' field.
   * @param value the value to set.
   */
  public void setNamespaceId(java.lang.CharSequence value) {
    this.NamespaceId = value;
  }

  /**
   * Gets the value of the 'DeviceId' field.
   * @return The value of the 'DeviceId' field.
   */
  public java.lang.CharSequence getDeviceId() {
    return DeviceId;
  }


  /**
   * Sets the value of the 'DeviceId' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.CharSequence value) {
    this.DeviceId = value;
  }

  /**
   * Gets the value of the 'Date' field.
   * @return The value of the 'Date' field.
   */
  public java.lang.CharSequence getDate() {
    return Date;
  }


  /**
   * Sets the value of the 'Date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.Date = value;
  }

  /**
   * Gets the value of the 'ReportedState' field.
   * @return The value of the 'ReportedState' field.
   */
  public java.lang.CharSequence getReportedState() {
    return ReportedState;
  }


  /**
   * Sets the value of the 'ReportedState' field.
   * @param value the value to set.
   */
  public void setReportedState(java.lang.CharSequence value) {
    this.ReportedState = value;
  }

  /**
   * Gets the value of the 'DesiredState' field.
   * @return The value of the 'DesiredState' field.
   */
  public java.lang.CharSequence getDesiredState() {
    return DesiredState;
  }


  /**
   * Sets the value of the 'DesiredState' field.
   * @param value the value to set.
   */
  public void setDesiredState(java.lang.CharSequence value) {
    this.DesiredState = value;
  }

  /**
   * Gets the value of the 'Timestamp' field.
   * @return The value of the 'Timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return Timestamp;
  }


  /**
   * Sets the value of the 'Timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.Timestamp = value;
  }

  /**
   * Creates a new DeviceState RecordBuilder.
   * @return A new DeviceState RecordBuilder
   */
  public static main.java.avro.DeviceState.Builder newBuilder() {
    return new main.java.avro.DeviceState.Builder();
  }

  /**
   * Creates a new DeviceState RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeviceState RecordBuilder
   */
  public static main.java.avro.DeviceState.Builder newBuilder(main.java.avro.DeviceState.Builder other) {
    if (other == null) {
      return new main.java.avro.DeviceState.Builder();
    } else {
      return new main.java.avro.DeviceState.Builder(other);
    }
  }

  /**
   * Creates a new DeviceState RecordBuilder by copying an existing DeviceState instance.
   * @param other The existing instance to copy.
   * @return A new DeviceState RecordBuilder
   */
  public static main.java.avro.DeviceState.Builder newBuilder(main.java.avro.DeviceState other) {
    if (other == null) {
      return new main.java.avro.DeviceState.Builder();
    } else {
      return new main.java.avro.DeviceState.Builder(other);
    }
  }

  /**
   * RecordBuilder for DeviceState instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceState>
    implements org.apache.avro.data.RecordBuilder<DeviceState> {

    private java.lang.CharSequence NamespaceId;
    private java.lang.CharSequence DeviceId;
    private java.lang.CharSequence Date;
    private java.lang.CharSequence ReportedState;
    private java.lang.CharSequence DesiredState;
    private java.lang.CharSequence Timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(main.java.avro.DeviceState.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.NamespaceId)) {
        this.NamespaceId = data().deepCopy(fields()[0].schema(), other.NamespaceId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.DeviceId)) {
        this.DeviceId = data().deepCopy(fields()[1].schema(), other.DeviceId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.Date)) {
        this.Date = data().deepCopy(fields()[2].schema(), other.Date);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.ReportedState)) {
        this.ReportedState = data().deepCopy(fields()[3].schema(), other.ReportedState);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.DesiredState)) {
        this.DesiredState = data().deepCopy(fields()[4].schema(), other.DesiredState);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.Timestamp)) {
        this.Timestamp = data().deepCopy(fields()[5].schema(), other.Timestamp);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing DeviceState instance
     * @param other The existing instance to copy.
     */
    private Builder(main.java.avro.DeviceState other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.NamespaceId)) {
        this.NamespaceId = data().deepCopy(fields()[0].schema(), other.NamespaceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DeviceId)) {
        this.DeviceId = data().deepCopy(fields()[1].schema(), other.DeviceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Date)) {
        this.Date = data().deepCopy(fields()[2].schema(), other.Date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ReportedState)) {
        this.ReportedState = data().deepCopy(fields()[3].schema(), other.ReportedState);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.DesiredState)) {
        this.DesiredState = data().deepCopy(fields()[4].schema(), other.DesiredState);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Timestamp)) {
        this.Timestamp = data().deepCopy(fields()[5].schema(), other.Timestamp);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'NamespaceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getNamespaceId() {
      return NamespaceId;
    }


    /**
      * Sets the value of the 'NamespaceId' field.
      * @param value The value of 'NamespaceId'.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder setNamespaceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.NamespaceId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'NamespaceId' field has been set.
      * @return True if the 'NamespaceId' field has been set, false otherwise.
      */
    public boolean hasNamespaceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'NamespaceId' field.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder clearNamespaceId() {
      NamespaceId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'DeviceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeviceId() {
      return DeviceId;
    }


    /**
      * Sets the value of the 'DeviceId' field.
      * @param value The value of 'DeviceId'.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder setDeviceId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.DeviceId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'DeviceId' field has been set.
      * @return True if the 'DeviceId' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'DeviceId' field.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder clearDeviceId() {
      DeviceId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return Date;
    }


    /**
      * Sets the value of the 'Date' field.
      * @param value The value of 'Date'.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.Date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Date' field has been set.
      * @return True if the 'Date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'Date' field.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder clearDate() {
      Date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ReportedState' field.
      * @return The value.
      */
    public java.lang.CharSequence getReportedState() {
      return ReportedState;
    }


    /**
      * Sets the value of the 'ReportedState' field.
      * @param value The value of 'ReportedState'.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder setReportedState(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.ReportedState = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ReportedState' field has been set.
      * @return True if the 'ReportedState' field has been set, false otherwise.
      */
    public boolean hasReportedState() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ReportedState' field.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder clearReportedState() {
      ReportedState = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'DesiredState' field.
      * @return The value.
      */
    public java.lang.CharSequence getDesiredState() {
      return DesiredState;
    }


    /**
      * Sets the value of the 'DesiredState' field.
      * @param value The value of 'DesiredState'.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder setDesiredState(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.DesiredState = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'DesiredState' field has been set.
      * @return True if the 'DesiredState' field has been set, false otherwise.
      */
    public boolean hasDesiredState() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'DesiredState' field.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder clearDesiredState() {
      DesiredState = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return Timestamp;
    }


    /**
      * Sets the value of the 'Timestamp' field.
      * @param value The value of 'Timestamp'.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.Timestamp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Timestamp' field has been set.
      * @return True if the 'Timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Timestamp' field.
      * @return This builder.
      */
    public main.java.avro.DeviceState.Builder clearTimestamp() {
      Timestamp = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DeviceState build() {
      try {
        DeviceState record = new DeviceState();
        record.NamespaceId = fieldSetFlags()[0] ? this.NamespaceId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.DeviceId = fieldSetFlags()[1] ? this.DeviceId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Date = fieldSetFlags()[2] ? this.Date : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ReportedState = fieldSetFlags()[3] ? this.ReportedState : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.DesiredState = fieldSetFlags()[4] ? this.DesiredState : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.Timestamp = fieldSetFlags()[5] ? this.Timestamp : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DeviceState>
    WRITER$ = (org.apache.avro.io.DatumWriter<DeviceState>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DeviceState>
    READER$ = (org.apache.avro.io.DatumReader<DeviceState>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.NamespaceId);

    out.writeString(this.DeviceId);

    out.writeString(this.Date);

    if (this.ReportedState == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.ReportedState);
    }

    if (this.DesiredState == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.DesiredState);
    }

    out.writeString(this.Timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.NamespaceId = in.readString(this.NamespaceId instanceof Utf8 ? (Utf8)this.NamespaceId : null);

      this.DeviceId = in.readString(this.DeviceId instanceof Utf8 ? (Utf8)this.DeviceId : null);

      this.Date = in.readString(this.Date instanceof Utf8 ? (Utf8)this.Date : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.ReportedState = null;
      } else {
        this.ReportedState = in.readString(this.ReportedState instanceof Utf8 ? (Utf8)this.ReportedState : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.DesiredState = null;
      } else {
        this.DesiredState = in.readString(this.DesiredState instanceof Utf8 ? (Utf8)this.DesiredState : null);
      }

      this.Timestamp = in.readString(this.Timestamp instanceof Utf8 ? (Utf8)this.Timestamp : null);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.NamespaceId = in.readString(this.NamespaceId instanceof Utf8 ? (Utf8)this.NamespaceId : null);
          break;

        case 1:
          this.DeviceId = in.readString(this.DeviceId instanceof Utf8 ? (Utf8)this.DeviceId : null);
          break;

        case 2:
          this.Date = in.readString(this.Date instanceof Utf8 ? (Utf8)this.Date : null);
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ReportedState = null;
          } else {
            this.ReportedState = in.readString(this.ReportedState instanceof Utf8 ? (Utf8)this.ReportedState : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.DesiredState = null;
          } else {
            this.DesiredState = in.readString(this.DesiredState instanceof Utf8 ? (Utf8)this.DesiredState : null);
          }
          break;

        case 5:
          this.Timestamp = in.readString(this.Timestamp instanceof Utf8 ? (Utf8)this.Timestamp : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










