// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface CrashLogInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.CrashLogInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string bundle_id = 2;</code>
   * @return The bundleId.
   */
  java.lang.String getBundleId();
  /**
   * <code>string bundle_id = 2;</code>
   * @return The bytes for bundleId.
   */
  com.google.protobuf.ByteString
      getBundleIdBytes();

  /**
   * <code>string process_name = 3;</code>
   * @return The processName.
   */
  java.lang.String getProcessName();
  /**
   * <code>string process_name = 3;</code>
   * @return The bytes for processName.
   */
  com.google.protobuf.ByteString
      getProcessNameBytes();

  /**
   * <code>string parent_process_name = 4;</code>
   * @return The parentProcessName.
   */
  java.lang.String getParentProcessName();
  /**
   * <code>string parent_process_name = 4;</code>
   * @return The bytes for parentProcessName.
   */
  com.google.protobuf.ByteString
      getParentProcessNameBytes();

  /**
   * <code>uint64 process_identifier = 5;</code>
   * @return The processIdentifier.
   */
  long getProcessIdentifier();

  /**
   * <code>uint64 parent_process_identifier = 6;</code>
   * @return The parentProcessIdentifier.
   */
  long getParentProcessIdentifier();

  /**
   * <code>uint64 timestamp = 7;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
