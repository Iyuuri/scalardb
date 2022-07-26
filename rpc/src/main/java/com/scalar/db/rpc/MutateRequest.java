// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf type {@code rpc.MutateRequest}
 */
public final class MutateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.MutateRequest)
    MutateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateRequest.newBuilder() to construct.
  private MutateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateRequest() {
    mutation_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mutation_ = new java.util.ArrayList<com.scalar.db.rpc.Mutation>();
              mutable_bitField0_ |= 0x00000001;
            }
            mutation_.add(
                input.readMessage(com.scalar.db.rpc.Mutation.parser(), extensionRegistry));
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
        mutation_ = java.util.Collections.unmodifiableList(mutation_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.db.rpc.MutateRequest.class, com.scalar.db.rpc.MutateRequest.Builder.class);
  }

  public static final int MUTATION_FIELD_NUMBER = 1;
  private java.util.List<com.scalar.db.rpc.Mutation> mutation_;
  /**
   * <code>repeated .rpc.Mutation mutation = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.scalar.db.rpc.Mutation> getMutationList() {
    return mutation_;
  }
  /**
   * <code>repeated .rpc.Mutation mutation = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalar.db.rpc.MutationOrBuilder> 
      getMutationOrBuilderList() {
    return mutation_;
  }
  /**
   * <code>repeated .rpc.Mutation mutation = 1;</code>
   */
  @java.lang.Override
  public int getMutationCount() {
    return mutation_.size();
  }
  /**
   * <code>repeated .rpc.Mutation mutation = 1;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.Mutation getMutation(int index) {
    return mutation_.get(index);
  }
  /**
   * <code>repeated .rpc.Mutation mutation = 1;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.MutationOrBuilder getMutationOrBuilder(
      int index) {
    return mutation_.get(index);
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
    for (int i = 0; i < mutation_.size(); i++) {
      output.writeMessage(1, mutation_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mutation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mutation_.get(i));
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
    if (!(obj instanceof com.scalar.db.rpc.MutateRequest)) {
      return super.equals(obj);
    }
    com.scalar.db.rpc.MutateRequest other = (com.scalar.db.rpc.MutateRequest) obj;

    if (!getMutationList()
        .equals(other.getMutationList())) return false;
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
    if (getMutationCount() > 0) {
      hash = (37 * hash) + MUTATION_FIELD_NUMBER;
      hash = (53 * hash) + getMutationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.db.rpc.MutateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateRequest parseFrom(
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
  public static Builder newBuilder(com.scalar.db.rpc.MutateRequest prototype) {
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
   * Protobuf type {@code rpc.MutateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.MutateRequest)
      com.scalar.db.rpc.MutateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.db.rpc.MutateRequest.class, com.scalar.db.rpc.MutateRequest.Builder.class);
    }

    // Construct using com.scalar.db.rpc.MutateRequest.newBuilder()
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
        getMutationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mutationBuilder_ == null) {
        mutation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mutationBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateRequest_descriptor;
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateRequest getDefaultInstanceForType() {
      return com.scalar.db.rpc.MutateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateRequest build() {
      com.scalar.db.rpc.MutateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateRequest buildPartial() {
      com.scalar.db.rpc.MutateRequest result = new com.scalar.db.rpc.MutateRequest(this);
      int from_bitField0_ = bitField0_;
      if (mutationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mutation_ = java.util.Collections.unmodifiableList(mutation_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mutation_ = mutation_;
      } else {
        result.mutation_ = mutationBuilder_.build();
      }
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
      if (other instanceof com.scalar.db.rpc.MutateRequest) {
        return mergeFrom((com.scalar.db.rpc.MutateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.db.rpc.MutateRequest other) {
      if (other == com.scalar.db.rpc.MutateRequest.getDefaultInstance()) return this;
      if (mutationBuilder_ == null) {
        if (!other.mutation_.isEmpty()) {
          if (mutation_.isEmpty()) {
            mutation_ = other.mutation_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMutationIsMutable();
            mutation_.addAll(other.mutation_);
          }
          onChanged();
        }
      } else {
        if (!other.mutation_.isEmpty()) {
          if (mutationBuilder_.isEmpty()) {
            mutationBuilder_.dispose();
            mutationBuilder_ = null;
            mutation_ = other.mutation_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mutationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMutationFieldBuilder() : null;
          } else {
            mutationBuilder_.addAllMessages(other.mutation_);
          }
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
      com.scalar.db.rpc.MutateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.scalar.db.rpc.MutateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.scalar.db.rpc.Mutation> mutation_ =
      java.util.Collections.emptyList();
    private void ensureMutationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mutation_ = new java.util.ArrayList<com.scalar.db.rpc.Mutation>(mutation_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalar.db.rpc.Mutation, com.scalar.db.rpc.Mutation.Builder, com.scalar.db.rpc.MutationOrBuilder> mutationBuilder_;

    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public java.util.List<com.scalar.db.rpc.Mutation> getMutationList() {
      if (mutationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mutation_);
      } else {
        return mutationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public int getMutationCount() {
      if (mutationBuilder_ == null) {
        return mutation_.size();
      } else {
        return mutationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public com.scalar.db.rpc.Mutation getMutation(int index) {
      if (mutationBuilder_ == null) {
        return mutation_.get(index);
      } else {
        return mutationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder setMutation(
        int index, com.scalar.db.rpc.Mutation value) {
      if (mutationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationIsMutable();
        mutation_.set(index, value);
        onChanged();
      } else {
        mutationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder setMutation(
        int index, com.scalar.db.rpc.Mutation.Builder builderForValue) {
      if (mutationBuilder_ == null) {
        ensureMutationIsMutable();
        mutation_.set(index, builderForValue.build());
        onChanged();
      } else {
        mutationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder addMutation(com.scalar.db.rpc.Mutation value) {
      if (mutationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationIsMutable();
        mutation_.add(value);
        onChanged();
      } else {
        mutationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder addMutation(
        int index, com.scalar.db.rpc.Mutation value) {
      if (mutationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationIsMutable();
        mutation_.add(index, value);
        onChanged();
      } else {
        mutationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder addMutation(
        com.scalar.db.rpc.Mutation.Builder builderForValue) {
      if (mutationBuilder_ == null) {
        ensureMutationIsMutable();
        mutation_.add(builderForValue.build());
        onChanged();
      } else {
        mutationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder addMutation(
        int index, com.scalar.db.rpc.Mutation.Builder builderForValue) {
      if (mutationBuilder_ == null) {
        ensureMutationIsMutable();
        mutation_.add(index, builderForValue.build());
        onChanged();
      } else {
        mutationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder addAllMutation(
        java.lang.Iterable<? extends com.scalar.db.rpc.Mutation> values) {
      if (mutationBuilder_ == null) {
        ensureMutationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mutation_);
        onChanged();
      } else {
        mutationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder clearMutation() {
      if (mutationBuilder_ == null) {
        mutation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mutationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public Builder removeMutation(int index) {
      if (mutationBuilder_ == null) {
        ensureMutationIsMutable();
        mutation_.remove(index);
        onChanged();
      } else {
        mutationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public com.scalar.db.rpc.Mutation.Builder getMutationBuilder(
        int index) {
      return getMutationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public com.scalar.db.rpc.MutationOrBuilder getMutationOrBuilder(
        int index) {
      if (mutationBuilder_ == null) {
        return mutation_.get(index);  } else {
        return mutationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public java.util.List<? extends com.scalar.db.rpc.MutationOrBuilder> 
         getMutationOrBuilderList() {
      if (mutationBuilder_ != null) {
        return mutationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mutation_);
      }
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public com.scalar.db.rpc.Mutation.Builder addMutationBuilder() {
      return getMutationFieldBuilder().addBuilder(
          com.scalar.db.rpc.Mutation.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public com.scalar.db.rpc.Mutation.Builder addMutationBuilder(
        int index) {
      return getMutationFieldBuilder().addBuilder(
          index, com.scalar.db.rpc.Mutation.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.Mutation mutation = 1;</code>
     */
    public java.util.List<com.scalar.db.rpc.Mutation.Builder> 
         getMutationBuilderList() {
      return getMutationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalar.db.rpc.Mutation, com.scalar.db.rpc.Mutation.Builder, com.scalar.db.rpc.MutationOrBuilder> 
        getMutationFieldBuilder() {
      if (mutationBuilder_ == null) {
        mutationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalar.db.rpc.Mutation, com.scalar.db.rpc.Mutation.Builder, com.scalar.db.rpc.MutationOrBuilder>(
                mutation_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mutation_ = null;
      }
      return mutationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpc.MutateRequest)
  }

  // @@protoc_insertion_point(class_scope:rpc.MutateRequest)
  private static final com.scalar.db.rpc.MutateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.db.rpc.MutateRequest();
  }

  public static com.scalar.db.rpc.MutateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateRequest>() {
    @java.lang.Override
    public MutateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.db.rpc.MutateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

