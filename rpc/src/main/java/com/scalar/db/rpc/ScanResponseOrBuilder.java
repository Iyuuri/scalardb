// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalardb.proto

package com.scalar.db.rpc;

public interface ScanResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.ScanResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .rpc.Result result = 2;</code>
   */
  java.util.List<com.scalar.db.rpc.Result> 
      getResultList();
  /**
   * <code>repeated .rpc.Result result = 2;</code>
   */
  com.scalar.db.rpc.Result getResult(int index);
  /**
   * <code>repeated .rpc.Result result = 2;</code>
   */
  int getResultCount();
  /**
   * <code>repeated .rpc.Result result = 2;</code>
   */
  java.util.List<? extends com.scalar.db.rpc.ResultOrBuilder> 
      getResultOrBuilderList();
  /**
   * <code>repeated .rpc.Result result = 2;</code>
   */
  com.scalar.db.rpc.ResultOrBuilder getResultOrBuilder(
      int index);

  /**
   * <code>bool has_more_results = 3;</code>
   * @return The hasMoreResults.
   */
  boolean getHasMoreResults();
}
