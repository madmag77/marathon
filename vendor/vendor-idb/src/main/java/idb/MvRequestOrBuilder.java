// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface MvRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.MvRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bundle_id = 1;</code>
   * @return The bundleId.
   */
  java.lang.String getBundleId();
  /**
   * <code>string bundle_id = 1;</code>
   * @return The bytes for bundleId.
   */
  com.google.protobuf.ByteString
      getBundleIdBytes();

  /**
   * <code>repeated string src_paths = 2;</code>
   * @return A list containing the srcPaths.
   */
  java.util.List<java.lang.String>
      getSrcPathsList();
  /**
   * <code>repeated string src_paths = 2;</code>
   * @return The count of srcPaths.
   */
  int getSrcPathsCount();
  /**
   * <code>repeated string src_paths = 2;</code>
   * @param index The index of the element to return.
   * @return The srcPaths at the given index.
   */
  java.lang.String getSrcPaths(int index);
  /**
   * <code>repeated string src_paths = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the srcPaths at the given index.
   */
  com.google.protobuf.ByteString
      getSrcPathsBytes(int index);

  /**
   * <code>string dst_path = 3;</code>
   * @return The dstPath.
   */
  java.lang.String getDstPath();
  /**
   * <code>string dst_path = 3;</code>
   * @return The bytes for dstPath.
   */
  com.google.protobuf.ByteString
      getDstPathBytes();
}
