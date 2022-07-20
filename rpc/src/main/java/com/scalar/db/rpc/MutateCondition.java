// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf type {@code rpc.MutateCondition}
 */
public final class MutateCondition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.MutateCondition)
    MutateConditionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCondition.newBuilder() to construct.
  private MutateCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCondition() {
    type_ = 0;
    expression_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCondition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCondition(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              expression_ = new java.util.ArrayList<com.scalar.db.rpc.ConditionalExpression>();
              mutable_bitField0_ |= 0x00000001;
            }
            expression_.add(
                input.readMessage(com.scalar.db.rpc.ConditionalExpression.parser(), extensionRegistry));
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
        expression_ = java.util.Collections.unmodifiableList(expression_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.db.rpc.MutateCondition.class, com.scalar.db.rpc.MutateCondition.Builder.class);
  }

  /**
   * Protobuf enum {@code rpc.MutateCondition.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PUT_IF = 0;</code>
     */
    PUT_IF(0),
    /**
     * <code>PUT_IF_EXISTS = 1;</code>
     */
    PUT_IF_EXISTS(1),
    /**
     * <code>PUT_IF_NOT_EXISTS = 2;</code>
     */
    PUT_IF_NOT_EXISTS(2),
    /**
     * <code>DELETE_IF = 3;</code>
     */
    DELETE_IF(3),
    /**
     * <code>DELETE_IF_EXISTS = 4;</code>
     */
    DELETE_IF_EXISTS(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PUT_IF = 0;</code>
     */
    public static final int PUT_IF_VALUE = 0;
    /**
     * <code>PUT_IF_EXISTS = 1;</code>
     */
    public static final int PUT_IF_EXISTS_VALUE = 1;
    /**
     * <code>PUT_IF_NOT_EXISTS = 2;</code>
     */
    public static final int PUT_IF_NOT_EXISTS_VALUE = 2;
    /**
     * <code>DELETE_IF = 3;</code>
     */
    public static final int DELETE_IF_VALUE = 3;
    /**
     * <code>DELETE_IF_EXISTS = 4;</code>
     */
    public static final int DELETE_IF_EXISTS_VALUE = 4;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return PUT_IF;
        case 1: return PUT_IF_EXISTS;
        case 2: return PUT_IF_NOT_EXISTS;
        case 3: return DELETE_IF;
        case 4: return DELETE_IF_EXISTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.scalar.db.rpc.MutateCondition.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:rpc.MutateCondition.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.rpc.MutateCondition.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.rpc.MutateCondition.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.scalar.db.rpc.MutateCondition.Type getType() {
    @SuppressWarnings("deprecation")
    com.scalar.db.rpc.MutateCondition.Type result = com.scalar.db.rpc.MutateCondition.Type.valueOf(type_);
    return result == null ? com.scalar.db.rpc.MutateCondition.Type.UNRECOGNIZED : result;
  }

  public static final int EXPRESSION_FIELD_NUMBER = 2;
  private java.util.List<com.scalar.db.rpc.ConditionalExpression> expression_;
  /**
   * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.scalar.db.rpc.ConditionalExpression> getExpressionList() {
    return expression_;
  }
  /**
   * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalar.db.rpc.ConditionalExpressionOrBuilder> 
      getExpressionOrBuilderList() {
    return expression_;
  }
  /**
   * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
   */
  @java.lang.Override
  public int getExpressionCount() {
    return expression_.size();
  }
  /**
   * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.ConditionalExpression getExpression(int index) {
    return expression_.get(index);
  }
  /**
   * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
   */
  @java.lang.Override
  public com.scalar.db.rpc.ConditionalExpressionOrBuilder getExpressionOrBuilder(
      int index) {
    return expression_.get(index);
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
    if (type_ != com.scalar.db.rpc.MutateCondition.Type.PUT_IF.getNumber()) {
      output.writeEnum(1, type_);
    }
    for (int i = 0; i < expression_.size(); i++) {
      output.writeMessage(2, expression_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.scalar.db.rpc.MutateCondition.Type.PUT_IF.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    for (int i = 0; i < expression_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, expression_.get(i));
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
    if (!(obj instanceof com.scalar.db.rpc.MutateCondition)) {
      return super.equals(obj);
    }
    com.scalar.db.rpc.MutateCondition other = (com.scalar.db.rpc.MutateCondition) obj;

    if (type_ != other.type_) return false;
    if (!getExpressionList()
        .equals(other.getExpressionList())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (getExpressionCount() > 0) {
      hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getExpressionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.db.rpc.MutateCondition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateCondition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateCondition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.db.rpc.MutateCondition parseFrom(
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
  public static Builder newBuilder(com.scalar.db.rpc.MutateCondition prototype) {
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
   * Protobuf type {@code rpc.MutateCondition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.MutateCondition)
      com.scalar.db.rpc.MutateConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.db.rpc.MutateCondition.class, com.scalar.db.rpc.MutateCondition.Builder.class);
    }

    // Construct using com.scalar.db.rpc.MutateCondition.newBuilder()
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
        getExpressionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      if (expressionBuilder_ == null) {
        expression_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        expressionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.db.rpc.ScalarDbProto.internal_static_rpc_MutateCondition_descriptor;
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateCondition getDefaultInstanceForType() {
      return com.scalar.db.rpc.MutateCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateCondition build() {
      com.scalar.db.rpc.MutateCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.db.rpc.MutateCondition buildPartial() {
      com.scalar.db.rpc.MutateCondition result = new com.scalar.db.rpc.MutateCondition(this);
      int from_bitField0_ = bitField0_;
      result.type_ = type_;
      if (expressionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          expression_ = java.util.Collections.unmodifiableList(expression_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.expression_ = expression_;
      } else {
        result.expression_ = expressionBuilder_.build();
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
      if (other instanceof com.scalar.db.rpc.MutateCondition) {
        return mergeFrom((com.scalar.db.rpc.MutateCondition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.db.rpc.MutateCondition other) {
      if (other == com.scalar.db.rpc.MutateCondition.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (expressionBuilder_ == null) {
        if (!other.expression_.isEmpty()) {
          if (expression_.isEmpty()) {
            expression_ = other.expression_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExpressionIsMutable();
            expression_.addAll(other.expression_);
          }
          onChanged();
        }
      } else {
        if (!other.expression_.isEmpty()) {
          if (expressionBuilder_.isEmpty()) {
            expressionBuilder_.dispose();
            expressionBuilder_ = null;
            expression_ = other.expression_;
            bitField0_ = (bitField0_ & ~0x00000001);
            expressionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExpressionFieldBuilder() : null;
          } else {
            expressionBuilder_.addAllMessages(other.expression_);
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
      com.scalar.db.rpc.MutateCondition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.scalar.db.rpc.MutateCondition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>.rpc.MutateCondition.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.rpc.MutateCondition.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rpc.MutateCondition.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.scalar.db.rpc.MutateCondition.Type getType() {
      @SuppressWarnings("deprecation")
      com.scalar.db.rpc.MutateCondition.Type result = com.scalar.db.rpc.MutateCondition.Type.valueOf(type_);
      return result == null ? com.scalar.db.rpc.MutateCondition.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.rpc.MutateCondition.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.scalar.db.rpc.MutateCondition.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rpc.MutateCondition.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.scalar.db.rpc.ConditionalExpression> expression_ =
      java.util.Collections.emptyList();
    private void ensureExpressionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        expression_ = new java.util.ArrayList<com.scalar.db.rpc.ConditionalExpression>(expression_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalar.db.rpc.ConditionalExpression, com.scalar.db.rpc.ConditionalExpression.Builder, com.scalar.db.rpc.ConditionalExpressionOrBuilder> expressionBuilder_;

    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public java.util.List<com.scalar.db.rpc.ConditionalExpression> getExpressionList() {
      if (expressionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(expression_);
      } else {
        return expressionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public int getExpressionCount() {
      if (expressionBuilder_ == null) {
        return expression_.size();
      } else {
        return expressionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public com.scalar.db.rpc.ConditionalExpression getExpression(int index) {
      if (expressionBuilder_ == null) {
        return expression_.get(index);
      } else {
        return expressionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder setExpression(
        int index, com.scalar.db.rpc.ConditionalExpression value) {
      if (expressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionIsMutable();
        expression_.set(index, value);
        onChanged();
      } else {
        expressionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder setExpression(
        int index, com.scalar.db.rpc.ConditionalExpression.Builder builderForValue) {
      if (expressionBuilder_ == null) {
        ensureExpressionIsMutable();
        expression_.set(index, builderForValue.build());
        onChanged();
      } else {
        expressionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder addExpression(com.scalar.db.rpc.ConditionalExpression value) {
      if (expressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionIsMutable();
        expression_.add(value);
        onChanged();
      } else {
        expressionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder addExpression(
        int index, com.scalar.db.rpc.ConditionalExpression value) {
      if (expressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionIsMutable();
        expression_.add(index, value);
        onChanged();
      } else {
        expressionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder addExpression(
        com.scalar.db.rpc.ConditionalExpression.Builder builderForValue) {
      if (expressionBuilder_ == null) {
        ensureExpressionIsMutable();
        expression_.add(builderForValue.build());
        onChanged();
      } else {
        expressionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder addExpression(
        int index, com.scalar.db.rpc.ConditionalExpression.Builder builderForValue) {
      if (expressionBuilder_ == null) {
        ensureExpressionIsMutable();
        expression_.add(index, builderForValue.build());
        onChanged();
      } else {
        expressionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder addAllExpression(
        java.lang.Iterable<? extends com.scalar.db.rpc.ConditionalExpression> values) {
      if (expressionBuilder_ == null) {
        ensureExpressionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, expression_);
        onChanged();
      } else {
        expressionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder clearExpression() {
      if (expressionBuilder_ == null) {
        expression_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        expressionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public Builder removeExpression(int index) {
      if (expressionBuilder_ == null) {
        ensureExpressionIsMutable();
        expression_.remove(index);
        onChanged();
      } else {
        expressionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public com.scalar.db.rpc.ConditionalExpression.Builder getExpressionBuilder(
        int index) {
      return getExpressionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public com.scalar.db.rpc.ConditionalExpressionOrBuilder getExpressionOrBuilder(
        int index) {
      if (expressionBuilder_ == null) {
        return expression_.get(index);  } else {
        return expressionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public java.util.List<? extends com.scalar.db.rpc.ConditionalExpressionOrBuilder> 
         getExpressionOrBuilderList() {
      if (expressionBuilder_ != null) {
        return expressionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(expression_);
      }
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public com.scalar.db.rpc.ConditionalExpression.Builder addExpressionBuilder() {
      return getExpressionFieldBuilder().addBuilder(
          com.scalar.db.rpc.ConditionalExpression.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public com.scalar.db.rpc.ConditionalExpression.Builder addExpressionBuilder(
        int index) {
      return getExpressionFieldBuilder().addBuilder(
          index, com.scalar.db.rpc.ConditionalExpression.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.ConditionalExpression expression = 2;</code>
     */
    public java.util.List<com.scalar.db.rpc.ConditionalExpression.Builder> 
         getExpressionBuilderList() {
      return getExpressionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalar.db.rpc.ConditionalExpression, com.scalar.db.rpc.ConditionalExpression.Builder, com.scalar.db.rpc.ConditionalExpressionOrBuilder> 
        getExpressionFieldBuilder() {
      if (expressionBuilder_ == null) {
        expressionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalar.db.rpc.ConditionalExpression, com.scalar.db.rpc.ConditionalExpression.Builder, com.scalar.db.rpc.ConditionalExpressionOrBuilder>(
                expression_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        expression_ = null;
      }
      return expressionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpc.MutateCondition)
  }

  // @@protoc_insertion_point(class_scope:rpc.MutateCondition)
  private static final com.scalar.db.rpc.MutateCondition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.db.rpc.MutateCondition();
  }

  public static com.scalar.db.rpc.MutateCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCondition>
      PARSER = new com.google.protobuf.AbstractParser<MutateCondition>() {
    @java.lang.Override
    public MutateCondition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCondition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.db.rpc.MutateCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

