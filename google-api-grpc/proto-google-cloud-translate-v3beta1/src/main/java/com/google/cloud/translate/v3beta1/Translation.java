// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

/**
 *
 *
 * <pre>
 * A single translation response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.Translation}
 */
public final class Translation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.Translation)
    TranslationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Translation.newBuilder() to construct.
  private Translation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Translation() {
    translatedText_ = "";
    model_ = "";
    detectedLanguageCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Translation(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              translatedText_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              model_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder subBuilder =
                  null;
              if (glossaryConfig_ != null) {
                subBuilder = glossaryConfig_.toBuilder();
              }
              glossaryConfig_ =
                  input.readMessage(
                      com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(glossaryConfig_);
                glossaryConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              detectedLanguageCode_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_Translation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_Translation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.Translation.class,
            com.google.cloud.translate.v3beta1.Translation.Builder.class);
  }

  public static final int TRANSLATED_TEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object translatedText_;
  /**
   *
   *
   * <pre>
   * Text translated into the target language.
   * </pre>
   *
   * <code>string translated_text = 1;</code>
   */
  public java.lang.String getTranslatedText() {
    java.lang.Object ref = translatedText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      translatedText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Text translated into the target language.
   * </pre>
   *
   * <code>string translated_text = 1;</code>
   */
  public com.google.protobuf.ByteString getTranslatedTextBytes() {
    java.lang.Object ref = translatedText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      translatedText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object model_;
  /**
   *
   *
   * <pre>
   * Only present when `model` is present in the request.
   * This is same as `model` provided in the request.
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Only present when `model` is present in the request.
   * This is same as `model` provided in the request.
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  public com.google.protobuf.ByteString getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETECTED_LANGUAGE_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object detectedLanguageCode_;
  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source text in the initial request, detected
   * automatically, if no source language was passed within the initial
   * request. If the source language was passed, auto-detection of the language
   * does not occur and this field will be empty.
   * </pre>
   *
   * <code>string detected_language_code = 4;</code>
   */
  public java.lang.String getDetectedLanguageCode() {
    java.lang.Object ref = detectedLanguageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detectedLanguageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source text in the initial request, detected
   * automatically, if no source language was passed within the initial
   * request. If the source language was passed, auto-detection of the language
   * does not occur and this field will be empty.
   * </pre>
   *
   * <code>string detected_language_code = 4;</code>
   */
  public com.google.protobuf.ByteString getDetectedLanguageCodeBytes() {
    java.lang.Object ref = detectedLanguageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      detectedLanguageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GLOSSARY_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig glossaryConfig_;
  /**
   *
   *
   * <pre>
   * The `glossary_config` used for this translation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;</code>
   */
  public boolean hasGlossaryConfig() {
    return glossaryConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The `glossary_config` used for this translation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;</code>
   */
  public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getGlossaryConfig() {
    return glossaryConfig_ == null
        ? com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.getDefaultInstance()
        : glossaryConfig_;
  }
  /**
   *
   *
   * <pre>
   * The `glossary_config` used for this translation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;</code>
   */
  public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfigOrBuilder
      getGlossaryConfigOrBuilder() {
    return getGlossaryConfig();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getTranslatedTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, translatedText_);
    }
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, model_);
    }
    if (glossaryConfig_ != null) {
      output.writeMessage(3, getGlossaryConfig());
    }
    if (!getDetectedLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, detectedLanguageCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTranslatedTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, translatedText_);
    }
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, model_);
    }
    if (glossaryConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getGlossaryConfig());
    }
    if (!getDetectedLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, detectedLanguageCode_);
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
    if (!(obj instanceof com.google.cloud.translate.v3beta1.Translation)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.Translation other =
        (com.google.cloud.translate.v3beta1.Translation) obj;

    if (!getTranslatedText().equals(other.getTranslatedText())) return false;
    if (!getModel().equals(other.getModel())) return false;
    if (!getDetectedLanguageCode().equals(other.getDetectedLanguageCode())) return false;
    if (hasGlossaryConfig() != other.hasGlossaryConfig()) return false;
    if (hasGlossaryConfig()) {
      if (!getGlossaryConfig().equals(other.getGlossaryConfig())) return false;
    }
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
    hash = (37 * hash) + TRANSLATED_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getTranslatedText().hashCode();
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + DETECTED_LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getDetectedLanguageCode().hashCode();
    if (hasGlossaryConfig()) {
      hash = (37 * hash) + GLOSSARY_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getGlossaryConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.Translation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.translate.v3beta1.Translation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A single translation response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.Translation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.Translation)
      com.google.cloud.translate.v3beta1.TranslationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_Translation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_Translation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.Translation.class,
              com.google.cloud.translate.v3beta1.Translation.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.Translation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      translatedText_ = "";

      model_ = "";

      detectedLanguageCode_ = "";

      if (glossaryConfigBuilder_ == null) {
        glossaryConfig_ = null;
      } else {
        glossaryConfig_ = null;
        glossaryConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_Translation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.Translation getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.Translation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.Translation build() {
      com.google.cloud.translate.v3beta1.Translation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.Translation buildPartial() {
      com.google.cloud.translate.v3beta1.Translation result =
          new com.google.cloud.translate.v3beta1.Translation(this);
      result.translatedText_ = translatedText_;
      result.model_ = model_;
      result.detectedLanguageCode_ = detectedLanguageCode_;
      if (glossaryConfigBuilder_ == null) {
        result.glossaryConfig_ = glossaryConfig_;
      } else {
        result.glossaryConfig_ = glossaryConfigBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.translate.v3beta1.Translation) {
        return mergeFrom((com.google.cloud.translate.v3beta1.Translation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3beta1.Translation other) {
      if (other == com.google.cloud.translate.v3beta1.Translation.getDefaultInstance()) return this;
      if (!other.getTranslatedText().isEmpty()) {
        translatedText_ = other.translatedText_;
        onChanged();
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (!other.getDetectedLanguageCode().isEmpty()) {
        detectedLanguageCode_ = other.detectedLanguageCode_;
        onChanged();
      }
      if (other.hasGlossaryConfig()) {
        mergeGlossaryConfig(other.getGlossaryConfig());
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
      com.google.cloud.translate.v3beta1.Translation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.translate.v3beta1.Translation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object translatedText_ = "";
    /**
     *
     *
     * <pre>
     * Text translated into the target language.
     * </pre>
     *
     * <code>string translated_text = 1;</code>
     */
    public java.lang.String getTranslatedText() {
      java.lang.Object ref = translatedText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        translatedText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Text translated into the target language.
     * </pre>
     *
     * <code>string translated_text = 1;</code>
     */
    public com.google.protobuf.ByteString getTranslatedTextBytes() {
      java.lang.Object ref = translatedText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        translatedText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Text translated into the target language.
     * </pre>
     *
     * <code>string translated_text = 1;</code>
     */
    public Builder setTranslatedText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      translatedText_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Text translated into the target language.
     * </pre>
     *
     * <code>string translated_text = 1;</code>
     */
    public Builder clearTranslatedText() {

      translatedText_ = getDefaultInstance().getTranslatedText();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Text translated into the target language.
     * </pre>
     *
     * <code>string translated_text = 1;</code>
     */
    public Builder setTranslatedTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      translatedText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     *
     *
     * <pre>
     * Only present when `model` is present in the request.
     * This is same as `model` provided in the request.
     * </pre>
     *
     * <code>string model = 2;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Only present when `model` is present in the request.
     * This is same as `model` provided in the request.
     * </pre>
     *
     * <code>string model = 2;</code>
     */
    public com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Only present when `model` is present in the request.
     * This is same as `model` provided in the request.
     * </pre>
     *
     * <code>string model = 2;</code>
     */
    public Builder setModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      model_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only present when `model` is present in the request.
     * This is same as `model` provided in the request.
     * </pre>
     *
     * <code>string model = 2;</code>
     */
    public Builder clearModel() {

      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only present when `model` is present in the request.
     * This is same as `model` provided in the request.
     * </pre>
     *
     * <code>string model = 2;</code>
     */
    public Builder setModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      model_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object detectedLanguageCode_ = "";
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source text in the initial request, detected
     * automatically, if no source language was passed within the initial
     * request. If the source language was passed, auto-detection of the language
     * does not occur and this field will be empty.
     * </pre>
     *
     * <code>string detected_language_code = 4;</code>
     */
    public java.lang.String getDetectedLanguageCode() {
      java.lang.Object ref = detectedLanguageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detectedLanguageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source text in the initial request, detected
     * automatically, if no source language was passed within the initial
     * request. If the source language was passed, auto-detection of the language
     * does not occur and this field will be empty.
     * </pre>
     *
     * <code>string detected_language_code = 4;</code>
     */
    public com.google.protobuf.ByteString getDetectedLanguageCodeBytes() {
      java.lang.Object ref = detectedLanguageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        detectedLanguageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source text in the initial request, detected
     * automatically, if no source language was passed within the initial
     * request. If the source language was passed, auto-detection of the language
     * does not occur and this field will be empty.
     * </pre>
     *
     * <code>string detected_language_code = 4;</code>
     */
    public Builder setDetectedLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      detectedLanguageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source text in the initial request, detected
     * automatically, if no source language was passed within the initial
     * request. If the source language was passed, auto-detection of the language
     * does not occur and this field will be empty.
     * </pre>
     *
     * <code>string detected_language_code = 4;</code>
     */
    public Builder clearDetectedLanguageCode() {

      detectedLanguageCode_ = getDefaultInstance().getDetectedLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source text in the initial request, detected
     * automatically, if no source language was passed within the initial
     * request. If the source language was passed, auto-detection of the language
     * does not occur and this field will be empty.
     * </pre>
     *
     * <code>string detected_language_code = 4;</code>
     */
    public Builder setDetectedLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      detectedLanguageCode_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig glossaryConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig,
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder,
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfigOrBuilder>
        glossaryConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public boolean hasGlossaryConfig() {
      return glossaryConfigBuilder_ != null || glossaryConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getGlossaryConfig() {
      if (glossaryConfigBuilder_ == null) {
        return glossaryConfig_ == null
            ? com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.getDefaultInstance()
            : glossaryConfig_;
      } else {
        return glossaryConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public Builder setGlossaryConfig(
        com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig value) {
      if (glossaryConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        glossaryConfig_ = value;
        onChanged();
      } else {
        glossaryConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public Builder setGlossaryConfig(
        com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder builderForValue) {
      if (glossaryConfigBuilder_ == null) {
        glossaryConfig_ = builderForValue.build();
        onChanged();
      } else {
        glossaryConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public Builder mergeGlossaryConfig(
        com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig value) {
      if (glossaryConfigBuilder_ == null) {
        if (glossaryConfig_ != null) {
          glossaryConfig_ =
              com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.newBuilder(
                      glossaryConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          glossaryConfig_ = value;
        }
        onChanged();
      } else {
        glossaryConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public Builder clearGlossaryConfig() {
      if (glossaryConfigBuilder_ == null) {
        glossaryConfig_ = null;
        onChanged();
      } else {
        glossaryConfig_ = null;
        glossaryConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder
        getGlossaryConfigBuilder() {

      onChanged();
      return getGlossaryConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    public com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfigOrBuilder
        getGlossaryConfigOrBuilder() {
      if (glossaryConfigBuilder_ != null) {
        return glossaryConfigBuilder_.getMessageOrBuilder();
      } else {
        return glossaryConfig_ == null
            ? com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.getDefaultInstance()
            : glossaryConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The `glossary_config` used for this translation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3beta1.TranslateTextGlossaryConfig glossary_config = 3;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig,
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder,
            com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfigOrBuilder>
        getGlossaryConfigFieldBuilder() {
      if (glossaryConfigBuilder_ == null) {
        glossaryConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig,
                com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig.Builder,
                com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfigOrBuilder>(
                getGlossaryConfig(), getParentForChildren(), isClean());
        glossaryConfig_ = null;
      }
      return glossaryConfigBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.Translation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.Translation)
  private static final com.google.cloud.translate.v3beta1.Translation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.Translation();
  }

  public static com.google.cloud.translate.v3beta1.Translation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Translation> PARSER =
      new com.google.protobuf.AbstractParser<Translation>() {
        @java.lang.Override
        public Translation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Translation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Translation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Translation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.Translation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
