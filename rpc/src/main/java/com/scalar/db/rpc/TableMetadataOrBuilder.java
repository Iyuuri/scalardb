// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

public interface TableMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.TableMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */
  int getColumnCount();
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */
  boolean containsColumn(
      java.lang.String key);
  /**
   * Use {@link #getColumnMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.scalar.db.rpc.DataType>
  getColumn();
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */
  java.util.Map<java.lang.String, com.scalar.db.rpc.DataType>
  getColumnMap();
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */
  com.scalar.db.rpc.DataType getColumnOrDefault(
      java.lang.String key,
      com.scalar.db.rpc.DataType defaultValue);
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */
  com.scalar.db.rpc.DataType getColumnOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getColumnValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getColumnValue();
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getColumnValueMap();
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */

  int getColumnValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, .rpc.DataType&gt; column = 1;</code>
   */

  int getColumnValueOrThrow(
      java.lang.String key);

  /**
   * <code>repeated string partition_key_name = 2;</code>
   * @return A list containing the partitionKeyName.
   */
  java.util.List<java.lang.String>
      getPartitionKeyNameList();
  /**
   * <code>repeated string partition_key_name = 2;</code>
   * @return The count of partitionKeyName.
   */
  int getPartitionKeyNameCount();
  /**
   * <code>repeated string partition_key_name = 2;</code>
   * @param index The index of the element to return.
   * @return The partitionKeyName at the given index.
   */
  java.lang.String getPartitionKeyName(int index);
  /**
   * <code>repeated string partition_key_name = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the partitionKeyName at the given index.
   */
  com.google.protobuf.ByteString
      getPartitionKeyNameBytes(int index);

  /**
   * <code>repeated string clustering_key_name = 3;</code>
   * @return A list containing the clusteringKeyName.
   */
  java.util.List<java.lang.String>
      getClusteringKeyNameList();
  /**
   * <code>repeated string clustering_key_name = 3;</code>
   * @return The count of clusteringKeyName.
   */
  int getClusteringKeyNameCount();
  /**
   * <code>repeated string clustering_key_name = 3;</code>
   * @param index The index of the element to return.
   * @return The clusteringKeyName at the given index.
   */
  java.lang.String getClusteringKeyName(int index);
  /**
   * <code>repeated string clustering_key_name = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the clusteringKeyName at the given index.
   */
  com.google.protobuf.ByteString
      getClusteringKeyNameBytes(int index);

  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */
  int getClusteringOrderCount();
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */
  boolean containsClusteringOrder(
      java.lang.String key);
  /**
   * Use {@link #getClusteringOrderMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.scalar.db.rpc.Order>
  getClusteringOrder();
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */
  java.util.Map<java.lang.String, com.scalar.db.rpc.Order>
  getClusteringOrderMap();
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */
  com.scalar.db.rpc.Order getClusteringOrderOrDefault(
      java.lang.String key,
      com.scalar.db.rpc.Order defaultValue);
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */
  com.scalar.db.rpc.Order getClusteringOrderOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getClusteringOrderValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getClusteringOrderValue();
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getClusteringOrderValueMap();
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */

  int getClusteringOrderValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, .rpc.Order&gt; clustering_order = 4;</code>
   */

  int getClusteringOrderValueOrThrow(
      java.lang.String key);

  /**
   * <code>repeated string secondary_index_name = 5;</code>
   * @return A list containing the secondaryIndexName.
   */
  java.util.List<java.lang.String>
      getSecondaryIndexNameList();
  /**
   * <code>repeated string secondary_index_name = 5;</code>
   * @return The count of secondaryIndexName.
   */
  int getSecondaryIndexNameCount();
  /**
   * <code>repeated string secondary_index_name = 5;</code>
   * @param index The index of the element to return.
   * @return The secondaryIndexName at the given index.
   */
  java.lang.String getSecondaryIndexName(int index);
  /**
   * <code>repeated string secondary_index_name = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the secondaryIndexName at the given index.
   */
  com.google.protobuf.ByteString
      getSecondaryIndexNameBytes(int index);
}
