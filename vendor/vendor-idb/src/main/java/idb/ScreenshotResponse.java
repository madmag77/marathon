// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

/**
 * Protobuf type {@code idb.ScreenshotResponse}
 */
public  final class ScreenshotResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:idb.ScreenshotResponse)
    ScreenshotResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScreenshotResponse.newBuilder() to construct.
  private ScreenshotResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScreenshotResponse() {
    imageData_ = com.google.protobuf.ByteString.EMPTY;
    imageFormat_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScreenshotResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScreenshotResponse(
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
          case 10: {

            imageData_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            imageFormat_ = s;
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
    return idb.Idb.internal_static_idb_ScreenshotResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return idb.Idb.internal_static_idb_ScreenshotResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            idb.ScreenshotResponse.class, idb.ScreenshotResponse.Builder.class);
  }

  public static final int IMAGE_DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString imageData_;
  /**
   * <code>bytes image_data = 1;</code>
   * @return The imageData.
   */
  public com.google.protobuf.ByteString getImageData() {
    return imageData_;
  }

  public static final int IMAGE_FORMAT_FIELD_NUMBER = 2;
  private volatile java.lang.Object imageFormat_;
  /**
   * <code>string image_format = 2;</code>
   * @return The imageFormat.
   */
  public java.lang.String getImageFormat() {
    java.lang.Object ref = imageFormat_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageFormat_ = s;
      return s;
    }
  }
  /**
   * <code>string image_format = 2;</code>
   * @return The bytes for imageFormat.
   */
  public com.google.protobuf.ByteString
      getImageFormatBytes() {
    java.lang.Object ref = imageFormat_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageFormat_ = b;
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
    if (!imageData_.isEmpty()) {
      output.writeBytes(1, imageData_);
    }
    if (!getImageFormatBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imageFormat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!imageData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, imageData_);
    }
    if (!getImageFormatBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, imageFormat_);
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
    if (!(obj instanceof idb.ScreenshotResponse)) {
      return super.equals(obj);
    }
    idb.ScreenshotResponse other = (idb.ScreenshotResponse) obj;

    if (!getImageData()
        .equals(other.getImageData())) return false;
    if (!getImageFormat()
        .equals(other.getImageFormat())) return false;
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
    hash = (37 * hash) + IMAGE_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getImageData().hashCode();
    hash = (37 * hash) + IMAGE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getImageFormat().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static idb.ScreenshotResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.ScreenshotResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.ScreenshotResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.ScreenshotResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.ScreenshotResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.ScreenshotResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.ScreenshotResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.ScreenshotResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.ScreenshotResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static idb.ScreenshotResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.ScreenshotResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.ScreenshotResponse parseFrom(
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
  public static Builder newBuilder(idb.ScreenshotResponse prototype) {
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
   * Protobuf type {@code idb.ScreenshotResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:idb.ScreenshotResponse)
      idb.ScreenshotResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return idb.Idb.internal_static_idb_ScreenshotResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return idb.Idb.internal_static_idb_ScreenshotResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              idb.ScreenshotResponse.class, idb.ScreenshotResponse.Builder.class);
    }

    // Construct using idb.ScreenshotResponse.newBuilder()
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
      imageData_ = com.google.protobuf.ByteString.EMPTY;

      imageFormat_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return idb.Idb.internal_static_idb_ScreenshotResponse_descriptor;
    }

    @java.lang.Override
    public idb.ScreenshotResponse getDefaultInstanceForType() {
      return idb.ScreenshotResponse.getDefaultInstance();
    }

    @java.lang.Override
    public idb.ScreenshotResponse build() {
      idb.ScreenshotResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public idb.ScreenshotResponse buildPartial() {
      idb.ScreenshotResponse result = new idb.ScreenshotResponse(this);
      result.imageData_ = imageData_;
      result.imageFormat_ = imageFormat_;
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
      if (other instanceof idb.ScreenshotResponse) {
        return mergeFrom((idb.ScreenshotResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(idb.ScreenshotResponse other) {
      if (other == idb.ScreenshotResponse.getDefaultInstance()) return this;
      if (other.getImageData() != com.google.protobuf.ByteString.EMPTY) {
        setImageData(other.getImageData());
      }
      if (!other.getImageFormat().isEmpty()) {
        imageFormat_ = other.imageFormat_;
        onChanged();
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
      idb.ScreenshotResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (idb.ScreenshotResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString imageData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes image_data = 1;</code>
     * @return The imageData.
     */
    public com.google.protobuf.ByteString getImageData() {
      return imageData_;
    }
    /**
     * <code>bytes image_data = 1;</code>
     * @param value The imageData to set.
     * @return This builder for chaining.
     */
    public Builder setImageData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes image_data = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageData() {
      
      imageData_ = getDefaultInstance().getImageData();
      onChanged();
      return this;
    }

    private java.lang.Object imageFormat_ = "";
    /**
     * <code>string image_format = 2;</code>
     * @return The imageFormat.
     */
    public java.lang.String getImageFormat() {
      java.lang.Object ref = imageFormat_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageFormat_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_format = 2;</code>
     * @return The bytes for imageFormat.
     */
    public com.google.protobuf.ByteString
        getImageFormatBytes() {
      java.lang.Object ref = imageFormat_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageFormat_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_format = 2;</code>
     * @param value The imageFormat to set.
     * @return This builder for chaining.
     */
    public Builder setImageFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_format = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageFormat() {
      
      imageFormat_ = getDefaultInstance().getImageFormat();
      onChanged();
      return this;
    }
    /**
     * <code>string image_format = 2;</code>
     * @param value The bytes for imageFormat to set.
     * @return This builder for chaining.
     */
    public Builder setImageFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageFormat_ = value;
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


    // @@protoc_insertion_point(builder_scope:idb.ScreenshotResponse)
  }

  // @@protoc_insertion_point(class_scope:idb.ScreenshotResponse)
  private static final idb.ScreenshotResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new idb.ScreenshotResponse();
  }

  public static idb.ScreenshotResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScreenshotResponse>
      PARSER = new com.google.protobuf.AbstractParser<ScreenshotResponse>() {
    @java.lang.Override
    public ScreenshotResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScreenshotResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScreenshotResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScreenshotResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public idb.ScreenshotResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

