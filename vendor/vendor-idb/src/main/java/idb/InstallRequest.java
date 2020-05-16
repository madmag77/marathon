// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

/**
 * Protobuf type {@code idb.InstallRequest}
 */
public  final class InstallRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:idb.InstallRequest)
    InstallRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstallRequest.newBuilder() to construct.
  private InstallRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstallRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstallRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstallRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
            valueCase_ = 1;
            value_ = rawValue;
            break;
          }
          case 18: {
            idb.Payload.Builder subBuilder = null;
            if (valueCase_ == 2) {
              subBuilder = ((idb.Payload) value_).toBuilder();
            }
            value_ =
                input.readMessage(idb.Payload.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((idb.Payload) value_);
              value_ = subBuilder.buildPartial();
            }
            valueCase_ = 2;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            valueCase_ = 3;
            value_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return idb.Idb.internal_static_idb_InstallRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return idb.Idb.internal_static_idb_InstallRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            idb.InstallRequest.class, idb.InstallRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code idb.InstallRequest.Destination}
   */
  public enum Destination
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>APP = 0;</code>
     */
    APP(0),
    /**
     * <code>XCTEST = 1;</code>
     */
    XCTEST(1),
    /**
     * <code>DYLIB = 2;</code>
     */
    DYLIB(2),
    /**
     * <code>DSYM = 3;</code>
     */
    DSYM(3),
    /**
     * <code>FRAMEWORK = 4;</code>
     */
    FRAMEWORK(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>APP = 0;</code>
     */
    public static final int APP_VALUE = 0;
    /**
     * <code>XCTEST = 1;</code>
     */
    public static final int XCTEST_VALUE = 1;
    /**
     * <code>DYLIB = 2;</code>
     */
    public static final int DYLIB_VALUE = 2;
    /**
     * <code>DSYM = 3;</code>
     */
    public static final int DSYM_VALUE = 3;
    /**
     * <code>FRAMEWORK = 4;</code>
     */
    public static final int FRAMEWORK_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Destination valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Destination forNumber(int value) {
      switch (value) {
        case 0: return APP;
        case 1: return XCTEST;
        case 2: return DYLIB;
        case 3: return DSYM;
        case 4: return FRAMEWORK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Destination>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Destination> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Destination>() {
            public Destination findValueByNumber(int number) {
              return Destination.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return idb.InstallRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Destination[] VALUES = values();

    public static Destination valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Destination(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:idb.InstallRequest.Destination)
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DESTINATION(1),
    PAYLOAD(2),
    NAME_HINT(3),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return DESTINATION;
        case 2: return PAYLOAD;
        case 3: return NAME_HINT;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int DESTINATION_FIELD_NUMBER = 1;
  /**
   * <code>.idb.InstallRequest.Destination destination = 1;</code>
   * @return The enum numeric value on the wire for destination.
   */
  public int getDestinationValue() {
    if (valueCase_ == 1) {
      return (java.lang.Integer) value_;
    }
    return 0;
  }
  /**
   * <code>.idb.InstallRequest.Destination destination = 1;</code>
   * @return The destination.
   */
  public idb.InstallRequest.Destination getDestination() {
    if (valueCase_ == 1) {
      @SuppressWarnings("deprecation")
      idb.InstallRequest.Destination result = idb.InstallRequest.Destination.valueOf(
          (java.lang.Integer) value_);
      return result == null ? idb.InstallRequest.Destination.UNRECOGNIZED : result;
    }
    return idb.InstallRequest.Destination.APP;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  /**
   * <code>.idb.Payload payload = 2;</code>
   * @return Whether the payload field is set.
   */
  public boolean hasPayload() {
    return valueCase_ == 2;
  }
  /**
   * <code>.idb.Payload payload = 2;</code>
   * @return The payload.
   */
  public idb.Payload getPayload() {
    if (valueCase_ == 2) {
       return (idb.Payload) value_;
    }
    return idb.Payload.getDefaultInstance();
  }
  /**
   * <code>.idb.Payload payload = 2;</code>
   */
  public idb.PayloadOrBuilder getPayloadOrBuilder() {
    if (valueCase_ == 2) {
       return (idb.Payload) value_;
    }
    return idb.Payload.getDefaultInstance();
  }

  public static final int NAME_HINT_FIELD_NUMBER = 3;
  /**
   * <code>string name_hint = 3;</code>
   * @return The nameHint.
   */
  public java.lang.String getNameHint() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 3) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string name_hint = 3;</code>
   * @return The bytes for nameHint.
   */
  public com.google.protobuf.ByteString
      getNameHintBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 3) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (valueCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) value_));
    }
    if (valueCase_ == 2) {
      output.writeMessage(2, (idb.Payload) value_);
    }
    if (valueCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) value_));
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (idb.Payload) value_);
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof idb.InstallRequest)) {
      return super.equals(obj);
    }
    idb.InstallRequest other = (idb.InstallRequest) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (getDestinationValue()
            != other.getDestinationValue()) return false;
        break;
      case 2:
        if (!getPayload()
            .equals(other.getPayload())) return false;
        break;
      case 3:
        if (!getNameHint()
            .equals(other.getNameHint())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
        hash = (53 * hash) + getDestinationValue();
        break;
      case 2:
        hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
        hash = (53 * hash) + getPayload().hashCode();
        break;
      case 3:
        hash = (37 * hash) + NAME_HINT_FIELD_NUMBER;
        hash = (53 * hash) + getNameHint().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static idb.InstallRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.InstallRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.InstallRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.InstallRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.InstallRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.InstallRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.InstallRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.InstallRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.InstallRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static idb.InstallRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.InstallRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.InstallRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(idb.InstallRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code idb.InstallRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:idb.InstallRequest)
      idb.InstallRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return idb.Idb.internal_static_idb_InstallRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return idb.Idb.internal_static_idb_InstallRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              idb.InstallRequest.class, idb.InstallRequest.Builder.class);
    }

    // Construct using idb.InstallRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return idb.Idb.internal_static_idb_InstallRequest_descriptor;
    }

    @java.lang.Override
    public idb.InstallRequest getDefaultInstanceForType() {
      return idb.InstallRequest.getDefaultInstance();
    }

    @java.lang.Override
    public idb.InstallRequest build() {
      idb.InstallRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public idb.InstallRequest buildPartial() {
      idb.InstallRequest result = new idb.InstallRequest(this);
      if (valueCase_ == 1) {
        result.value_ = value_;
      }
      if (valueCase_ == 2) {
        if (payloadBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = payloadBuilder_.build();
        }
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof idb.InstallRequest) {
        return mergeFrom((idb.InstallRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(idb.InstallRequest other) {
      if (other == idb.InstallRequest.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case DESTINATION: {
          setDestinationValue(other.getDestinationValue());
          break;
        }
        case PAYLOAD: {
          mergePayload(other.getPayload());
          break;
        }
        case NAME_HINT: {
          valueCase_ = 3;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      idb.InstallRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (idb.InstallRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.idb.InstallRequest.Destination destination = 1;</code>
     * @return The enum numeric value on the wire for destination.
     */
    public int getDestinationValue() {
      if (valueCase_ == 1) {
        return ((java.lang.Integer) value_).intValue();
      }
      return 0;
    }
    /**
     * <code>.idb.InstallRequest.Destination destination = 1;</code>
     * @param value The enum numeric value on the wire for destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationValue(int value) {
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.idb.InstallRequest.Destination destination = 1;</code>
     * @return The destination.
     */
    public idb.InstallRequest.Destination getDestination() {
      if (valueCase_ == 1) {
        @SuppressWarnings("deprecation")
        idb.InstallRequest.Destination result = idb.InstallRequest.Destination.valueOf(
            (java.lang.Integer) value_);
        return result == null ? idb.InstallRequest.Destination.UNRECOGNIZED : result;
      }
      return idb.InstallRequest.Destination.APP;
    }
    /**
     * <code>.idb.InstallRequest.Destination destination = 1;</code>
     * @param value The destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestination(idb.InstallRequest.Destination value) {
      if (value == null) {
        throw new NullPointerException();
      }
      valueCase_ = 1;
      value_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.idb.InstallRequest.Destination destination = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestination() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        idb.Payload, idb.Payload.Builder, idb.PayloadOrBuilder> payloadBuilder_;
    /**
     * <code>.idb.Payload payload = 2;</code>
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return valueCase_ == 2;
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     * @return The payload.
     */
    public idb.Payload getPayload() {
      if (payloadBuilder_ == null) {
        if (valueCase_ == 2) {
          return (idb.Payload) value_;
        }
        return idb.Payload.getDefaultInstance();
      } else {
        if (valueCase_ == 2) {
          return payloadBuilder_.getMessage();
        }
        return idb.Payload.getDefaultInstance();
      }
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    public Builder setPayload(idb.Payload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }
      valueCase_ = 2;
      return this;
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    public Builder setPayload(
        idb.Payload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 2;
      return this;
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    public Builder mergePayload(idb.Payload value) {
      if (payloadBuilder_ == null) {
        if (valueCase_ == 2 &&
            value_ != idb.Payload.getDefaultInstance()) {
          value_ = idb.Payload.newBuilder((idb.Payload) value_)
              .mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 2) {
          payloadBuilder_.mergeFrom(value);
        }
        payloadBuilder_.setMessage(value);
      }
      valueCase_ = 2;
      return this;
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        if (valueCase_ == 2) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 2) {
          valueCase_ = 0;
          value_ = null;
        }
        payloadBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    public idb.Payload.Builder getPayloadBuilder() {
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    public idb.PayloadOrBuilder getPayloadOrBuilder() {
      if ((valueCase_ == 2) && (payloadBuilder_ != null)) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 2) {
          return (idb.Payload) value_;
        }
        return idb.Payload.getDefaultInstance();
      }
    }
    /**
     * <code>.idb.Payload payload = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        idb.Payload, idb.Payload.Builder, idb.PayloadOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        if (!(valueCase_ == 2)) {
          value_ = idb.Payload.getDefaultInstance();
        }
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            idb.Payload, idb.Payload.Builder, idb.PayloadOrBuilder>(
                (idb.Payload) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 2;
      onChanged();;
      return payloadBuilder_;
    }

    /**
     * <code>string name_hint = 3;</code>
     * @return The nameHint.
     */
    public java.lang.String getNameHint() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 3) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name_hint = 3;</code>
     * @return The bytes for nameHint.
     */
    public com.google.protobuf.ByteString
        getNameHintBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 3) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name_hint = 3;</code>
     * @param value The nameHint to set.
     * @return This builder for chaining.
     */
    public Builder setNameHint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name_hint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNameHint() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string name_hint = 3;</code>
     * @param value The bytes for nameHint to set.
     * @return This builder for chaining.
     */
    public Builder setNameHintBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:idb.InstallRequest)
  }

  // @@protoc_insertion_point(class_scope:idb.InstallRequest)
  private static final idb.InstallRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new idb.InstallRequest();
  }

  public static idb.InstallRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstallRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstallRequest>() {
    @java.lang.Override
    public InstallRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstallRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstallRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstallRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public idb.InstallRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

