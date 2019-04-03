// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface SupportedLanguageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.SupportedLanguage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Supported language code, generally consisting of its ISO 639-1
   * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
   * including language and region identifiers are returned (for example,
   * 'zh-TW' and 'zh-CN')
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Supported language code, generally consisting of its ISO 639-1
   * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
   * including language and region identifiers are returned (for example,
   * 'zh-TW' and 'zh-CN')
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Human readable name of the language localized in the display language
   * specified in the request.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human readable name of the language localized in the display language
   * specified in the request.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Can be used as source language.
   * </pre>
   *
   * <code>bool support_source = 3;</code>
   */
  boolean getSupportSource();

  /**
   *
   *
   * <pre>
   * Can be used as target language.
   * </pre>
   *
   * <code>bool support_target = 4;</code>
   */
  boolean getSupportTarget();
}
