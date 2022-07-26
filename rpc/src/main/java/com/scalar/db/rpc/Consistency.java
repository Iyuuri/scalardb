// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

/**
 * Protobuf enum {@code rpc.Consistency}
 */
public enum Consistency
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONSISTENCY_SEQUENTIAL = 0;</code>
   */
  CONSISTENCY_SEQUENTIAL(0),
  /**
   * <code>CONSISTENCY_EVENTUAL = 1;</code>
   */
  CONSISTENCY_EVENTUAL(1),
  /**
   * <code>CONSISTENCY_LINEARIZABLE = 2;</code>
   */
  CONSISTENCY_LINEARIZABLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONSISTENCY_SEQUENTIAL = 0;</code>
   */
  public static final int CONSISTENCY_SEQUENTIAL_VALUE = 0;
  /**
   * <code>CONSISTENCY_EVENTUAL = 1;</code>
   */
  public static final int CONSISTENCY_EVENTUAL_VALUE = 1;
  /**
   * <code>CONSISTENCY_LINEARIZABLE = 2;</code>
   */
  public static final int CONSISTENCY_LINEARIZABLE_VALUE = 2;


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
  public static Consistency valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Consistency forNumber(int value) {
    switch (value) {
      case 0: return CONSISTENCY_SEQUENTIAL;
      case 1: return CONSISTENCY_EVENTUAL;
      case 2: return CONSISTENCY_LINEARIZABLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Consistency>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Consistency> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Consistency>() {
          public Consistency findValueByNumber(int number) {
            return Consistency.forNumber(number);
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
    return com.scalar.db.rpc.ScalarDbProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Consistency[] VALUES = values();

  public static Consistency valueOf(
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

  private Consistency(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:rpc.Consistency)
}

