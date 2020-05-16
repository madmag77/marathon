// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

/**
 * Protobuf type {@code idb.MvRequest}
 */
public  final class MvRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:idb.MvRequest)
    MvRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MvRequest.newBuilder() to construct.
  private MvRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MvRequest() {
    bundleId_ = "";
    srcPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    dstPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MvRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MvRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            bundleId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              srcPaths_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            srcPaths_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dstPath_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        srcPaths_ = srcPaths_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return idb.Idb.internal_static_idb_MvRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return idb.Idb.internal_static_idb_MvRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            idb.MvRequest.class, idb.MvRequest.Builder.class);
  }

  public static final int BUNDLE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object bundleId_;
  /**
   * <code>string bundle_id = 1;</code>
   * @return The bundleId.
   */
  public java.lang.String getBundleId() {
    java.lang.Object ref = bundleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bundleId_ = s;
      return s;
    }
  }
  /**
   * <code>string bundle_id = 1;</code>
   * @return The bytes for bundleId.
   */
  public com.google.protobuf.ByteString
      getBundleIdBytes() {
    java.lang.Object ref = bundleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bundleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SRC_PATHS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList srcPaths_;
  /**
   * <code>repeated string src_paths = 2;</code>
   * @return A list containing the srcPaths.
   */
  public com.google.protobuf.ProtocolStringList
      getSrcPathsList() {
    return srcPaths_;
  }
  /**
   * <code>repeated string src_paths = 2;</code>
   * @return The count of srcPaths.
   */
  public int getSrcPathsCount() {
    return srcPaths_.size();
  }
  /**
   * <code>repeated string src_paths = 2;</code>
   * @param index The index of the element to return.
   * @return The srcPaths at the given index.
   */
  public java.lang.String getSrcPaths(int index) {
    return srcPaths_.get(index);
  }
  /**
   * <code>repeated string src_paths = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the srcPaths at the given index.
   */
  public com.google.protobuf.ByteString
      getSrcPathsBytes(int index) {
    return srcPaths_.getByteString(index);
  }

  public static final int DST_PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object dstPath_;
  /**
   * <code>string dst_path = 3;</code>
   * @return The dstPath.
   */
  public java.lang.String getDstPath() {
    java.lang.Object ref = dstPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dstPath_ = s;
      return s;
    }
  }
  /**
   * <code>string dst_path = 3;</code>
   * @return The bytes for dstPath.
   */
  public com.google.protobuf.ByteString
      getDstPathBytes() {
    java.lang.Object ref = dstPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dstPath_ = b;
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
    if (!getBundleIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bundleId_);
    }
    for (int i = 0; i < srcPaths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, srcPaths_.getRaw(i));
    }
    if (!getDstPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dstPath_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBundleIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bundleId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < srcPaths_.size(); i++) {
        dataSize += computeStringSizeNoTag(srcPaths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSrcPathsList().size();
    }
    if (!getDstPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dstPath_);
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
    if (!(obj instanceof idb.MvRequest)) {
      return super.equals(obj);
    }
    idb.MvRequest other = (idb.MvRequest) obj;

    if (!getBundleId()
        .equals(other.getBundleId())) return false;
    if (!getSrcPathsList()
        .equals(other.getSrcPathsList())) return false;
    if (!getDstPath()
        .equals(other.getDstPath())) return false;
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
    hash = (37 * hash) + BUNDLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBundleId().hashCode();
    if (getSrcPathsCount() > 0) {
      hash = (37 * hash) + SRC_PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getSrcPathsList().hashCode();
    }
    hash = (37 * hash) + DST_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getDstPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static idb.MvRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.MvRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.MvRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.MvRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.MvRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.MvRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.MvRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.MvRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.MvRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static idb.MvRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.MvRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.MvRequest parseFrom(
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
  public static Builder newBuilder(idb.MvRequest prototype) {
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
   * Protobuf type {@code idb.MvRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:idb.MvRequest)
      idb.MvRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return idb.Idb.internal_static_idb_MvRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return idb.Idb.internal_static_idb_MvRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              idb.MvRequest.class, idb.MvRequest.Builder.class);
    }

    // Construct using idb.MvRequest.newBuilder()
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
      bundleId_ = "";

      srcPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      dstPath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return idb.Idb.internal_static_idb_MvRequest_descriptor;
    }

    @java.lang.Override
    public idb.MvRequest getDefaultInstanceForType() {
      return idb.MvRequest.getDefaultInstance();
    }

    @java.lang.Override
    public idb.MvRequest build() {
      idb.MvRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public idb.MvRequest buildPartial() {
      idb.MvRequest result = new idb.MvRequest(this);
      int from_bitField0_ = bitField0_;
      result.bundleId_ = bundleId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        srcPaths_ = srcPaths_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.srcPaths_ = srcPaths_;
      result.dstPath_ = dstPath_;
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
      if (other instanceof idb.MvRequest) {
        return mergeFrom((idb.MvRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(idb.MvRequest other) {
      if (other == idb.MvRequest.getDefaultInstance()) return this;
      if (!other.getBundleId().isEmpty()) {
        bundleId_ = other.bundleId_;
        onChanged();
      }
      if (!other.srcPaths_.isEmpty()) {
        if (srcPaths_.isEmpty()) {
          srcPaths_ = other.srcPaths_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSrcPathsIsMutable();
          srcPaths_.addAll(other.srcPaths_);
        }
        onChanged();
      }
      if (!other.getDstPath().isEmpty()) {
        dstPath_ = other.dstPath_;
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
      idb.MvRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (idb.MvRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object bundleId_ = "";
    /**
     * <code>string bundle_id = 1;</code>
     * @return The bundleId.
     */
    public java.lang.String getBundleId() {
      java.lang.Object ref = bundleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bundleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bundle_id = 1;</code>
     * @return The bytes for bundleId.
     */
    public com.google.protobuf.ByteString
        getBundleIdBytes() {
      java.lang.Object ref = bundleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bundleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bundle_id = 1;</code>
     * @param value The bundleId to set.
     * @return This builder for chaining.
     */
    public Builder setBundleId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bundleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bundle_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBundleId() {
      
      bundleId_ = getDefaultInstance().getBundleId();
      onChanged();
      return this;
    }
    /**
     * <code>string bundle_id = 1;</code>
     * @param value The bytes for bundleId to set.
     * @return This builder for chaining.
     */
    public Builder setBundleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bundleId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList srcPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSrcPathsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        srcPaths_ = new com.google.protobuf.LazyStringArrayList(srcPaths_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @return A list containing the srcPaths.
     */
    public com.google.protobuf.ProtocolStringList
        getSrcPathsList() {
      return srcPaths_.getUnmodifiableView();
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @return The count of srcPaths.
     */
    public int getSrcPathsCount() {
      return srcPaths_.size();
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @param index The index of the element to return.
     * @return The srcPaths at the given index.
     */
    public java.lang.String getSrcPaths(int index) {
      return srcPaths_.get(index);
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the srcPaths at the given index.
     */
    public com.google.protobuf.ByteString
        getSrcPathsBytes(int index) {
      return srcPaths_.getByteString(index);
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @param index The index to set the value at.
     * @param value The srcPaths to set.
     * @return This builder for chaining.
     */
    public Builder setSrcPaths(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSrcPathsIsMutable();
      srcPaths_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @param value The srcPaths to add.
     * @return This builder for chaining.
     */
    public Builder addSrcPaths(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSrcPathsIsMutable();
      srcPaths_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @param values The srcPaths to add.
     * @return This builder for chaining.
     */
    public Builder addAllSrcPaths(
        java.lang.Iterable<java.lang.String> values) {
      ensureSrcPathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, srcPaths_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSrcPaths() {
      srcPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string src_paths = 2;</code>
     * @param value The bytes of the srcPaths to add.
     * @return This builder for chaining.
     */
    public Builder addSrcPathsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSrcPathsIsMutable();
      srcPaths_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object dstPath_ = "";
    /**
     * <code>string dst_path = 3;</code>
     * @return The dstPath.
     */
    public java.lang.String getDstPath() {
      java.lang.Object ref = dstPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dstPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dst_path = 3;</code>
     * @return The bytes for dstPath.
     */
    public com.google.protobuf.ByteString
        getDstPathBytes() {
      java.lang.Object ref = dstPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dstPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dst_path = 3;</code>
     * @param value The dstPath to set.
     * @return This builder for chaining.
     */
    public Builder setDstPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dstPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dst_path = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDstPath() {
      
      dstPath_ = getDefaultInstance().getDstPath();
      onChanged();
      return this;
    }
    /**
     * <code>string dst_path = 3;</code>
     * @param value The bytes for dstPath to set.
     * @return This builder for chaining.
     */
    public Builder setDstPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dstPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:idb.MvRequest)
  }

  // @@protoc_insertion_point(class_scope:idb.MvRequest)
  private static final idb.MvRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new idb.MvRequest();
  }

  public static idb.MvRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MvRequest>
      PARSER = new com.google.protobuf.AbstractParser<MvRequest>() {
    @java.lang.Override
    public MvRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MvRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MvRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MvRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public idb.MvRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

