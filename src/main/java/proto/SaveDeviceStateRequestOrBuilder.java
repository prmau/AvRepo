// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: avrorepo.proto

package main.java.proto;

public interface SaveDeviceStateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SaveDeviceStateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string deviceId = 1;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <code>string deviceId = 1;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <code>.proto.DeviceState ds = 2;</code>
   * @return Whether the ds field is set.
   */
  boolean hasDs();
  /**
   * <code>.proto.DeviceState ds = 2;</code>
   * @return The ds.
   */
  main.java.proto.DeviceState getDs();
  /**
   * <code>.proto.DeviceState ds = 2;</code>
   */
  main.java.proto.DeviceStateOrBuilder getDsOrBuilder();
}
