// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

public interface SearchUrisResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.SearchUrisResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The threat list matches. This may be empty if the URI is on no list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.SearchUrisResponse.ThreatUri threat = 1;</code>
   */
  boolean hasThreat();
  /**
   *
   *
   * <pre>
   * The threat list matches. This may be empty if the URI is on no list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.SearchUrisResponse.ThreatUri threat = 1;</code>
   */
  com.google.webrisk.v1beta1.SearchUrisResponse.ThreatUri getThreat();
  /**
   *
   *
   * <pre>
   * The threat list matches. This may be empty if the URI is on no list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.SearchUrisResponse.ThreatUri threat = 1;</code>
   */
  com.google.webrisk.v1beta1.SearchUrisResponse.ThreatUriOrBuilder getThreatOrBuilder();
}
