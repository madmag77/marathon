// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface HIDEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.HIDEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.idb.HIDEvent.HIDPress press = 1;</code>
   * @return Whether the press field is set.
   */
  boolean hasPress();
  /**
   * <code>.idb.HIDEvent.HIDPress press = 1;</code>
   * @return The press.
   */
  idb.HIDEvent.HIDPress getPress();
  /**
   * <code>.idb.HIDEvent.HIDPress press = 1;</code>
   */
  idb.HIDEvent.HIDPressOrBuilder getPressOrBuilder();

  /**
   * <code>.idb.HIDEvent.HIDSwipe swipe = 2;</code>
   * @return Whether the swipe field is set.
   */
  boolean hasSwipe();
  /**
   * <code>.idb.HIDEvent.HIDSwipe swipe = 2;</code>
   * @return The swipe.
   */
  idb.HIDEvent.HIDSwipe getSwipe();
  /**
   * <code>.idb.HIDEvent.HIDSwipe swipe = 2;</code>
   */
  idb.HIDEvent.HIDSwipeOrBuilder getSwipeOrBuilder();

  /**
   * <code>.idb.HIDEvent.HIDDelay delay = 3;</code>
   * @return Whether the delay field is set.
   */
  boolean hasDelay();
  /**
   * <code>.idb.HIDEvent.HIDDelay delay = 3;</code>
   * @return The delay.
   */
  idb.HIDEvent.HIDDelay getDelay();
  /**
   * <code>.idb.HIDEvent.HIDDelay delay = 3;</code>
   */
  idb.HIDEvent.HIDDelayOrBuilder getDelayOrBuilder();

  public idb.HIDEvent.EventCase getEventCase();
}
