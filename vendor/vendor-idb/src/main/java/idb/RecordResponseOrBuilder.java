// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface RecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.RecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes log_output = 1;</code>
   * @return The logOutput.
   */
  com.google.protobuf.ByteString getLogOutput();

  /**
   * <code>.idb.Payload payload = 2;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <code>.idb.Payload payload = 2;</code>
   * @return The payload.
   */
  idb.Payload getPayload();
  /**
   * <code>.idb.Payload payload = 2;</code>
   */
  idb.PayloadOrBuilder getPayloadOrBuilder();

  public idb.RecordResponse.OutputCase getOutputCase();
}
