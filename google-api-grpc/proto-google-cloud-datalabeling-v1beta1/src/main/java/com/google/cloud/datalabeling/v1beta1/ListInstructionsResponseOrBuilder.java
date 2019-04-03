// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ListInstructionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListInstructionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.Instruction> getInstructionsList();
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Instruction getInstructions(int index);
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  int getInstructionsCount();
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder>
      getInstructionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder getInstructionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
