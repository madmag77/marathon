// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface CrashLogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.CrashLogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .idb.CrashLogInfo list = 1;</code>
   */
  java.util.List<idb.CrashLogInfo> 
      getListList();
  /**
   * <code>repeated .idb.CrashLogInfo list = 1;</code>
   */
  idb.CrashLogInfo getList(int index);
  /**
   * <code>repeated .idb.CrashLogInfo list = 1;</code>
   */
  int getListCount();
  /**
   * <code>repeated .idb.CrashLogInfo list = 1;</code>
   */
  java.util.List<? extends idb.CrashLogInfoOrBuilder> 
      getListOrBuilderList();
  /**
   * <code>repeated .idb.CrashLogInfo list = 1;</code>
   */
  idb.CrashLogInfoOrBuilder getListOrBuilder(
      int index);
}
