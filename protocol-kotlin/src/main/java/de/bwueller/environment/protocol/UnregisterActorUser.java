// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: unregister_actor_user.proto

package de.bwueller.environment.protocol;

public final class UnregisterActorUser {
  private UnregisterActorUser() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnregisterActorUserRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnregisterActorUserRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Unique user identifier.
     * </pre>
     *
     * <code>optional string identifier = 1;</code>
     */
    java.lang.String getIdentifier();
    /**
     * <pre>
     * Unique user identifier.
     * </pre>
     *
     * <code>optional string identifier = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdentifierBytes();
  }
  /**
   * Protobuf type {@code UnregisterActorUserRequest}
   */
  public  static final class UnregisterActorUserRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnregisterActorUserRequest)
      UnregisterActorUserRequestOrBuilder {
    // Use UnregisterActorUserRequest.newBuilder() to construct.
    private UnregisterActorUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnregisterActorUserRequest() {
      identifier_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UnregisterActorUserRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              identifier_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.bwueller.environment.protocol.UnregisterActorUser.internal_static_UnregisterActorUserRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.bwueller.environment.protocol.UnregisterActorUser.internal_static_UnregisterActorUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.class, de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.Builder.class);
    }

    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private volatile java.lang.Object identifier_;
    /**
     * <pre>
     * Unique user identifier.
     * </pre>
     *
     * <code>optional string identifier = 1;</code>
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identifier_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Unique user identifier.
     * </pre>
     *
     * <code>optional string identifier = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getIdentifierBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identifier_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdentifierBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identifier_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest)) {
        return super.equals(obj);
      }
      de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest other = (de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest) obj;

      boolean result = true;
      result = result && getIdentifier()
          .equals(other.getIdentifier());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifier().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code UnregisterActorUserRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnregisterActorUserRequest)
        de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return de.bwueller.environment.protocol.UnregisterActorUser.internal_static_UnregisterActorUserRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return de.bwueller.environment.protocol.UnregisterActorUser.internal_static_UnregisterActorUserRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.class, de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.Builder.class);
      }

      // Construct using de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.newBuilder()
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
      public Builder clear() {
        super.clear();
        identifier_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return de.bwueller.environment.protocol.UnregisterActorUser.internal_static_UnregisterActorUserRequest_descriptor;
      }

      public de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest getDefaultInstanceForType() {
        return de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.getDefaultInstance();
      }

      public de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest build() {
        de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest buildPartial() {
        de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest result = new de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest(this);
        result.identifier_ = identifier_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest) {
          return mergeFrom((de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest other) {
        if (other == de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest.getDefaultInstance()) return this;
        if (!other.getIdentifier().isEmpty()) {
          identifier_ = other.identifier_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object identifier_ = "";
      /**
       * <pre>
       * Unique user identifier.
       * </pre>
       *
       * <code>optional string identifier = 1;</code>
       */
      public java.lang.String getIdentifier() {
        java.lang.Object ref = identifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          identifier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Unique user identifier.
       * </pre>
       *
       * <code>optional string identifier = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifierBytes() {
        java.lang.Object ref = identifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Unique user identifier.
       * </pre>
       *
       * <code>optional string identifier = 1;</code>
       */
      public Builder setIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        identifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unique user identifier.
       * </pre>
       *
       * <code>optional string identifier = 1;</code>
       */
      public Builder clearIdentifier() {
        
        identifier_ = getDefaultInstance().getIdentifier();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unique user identifier.
       * </pre>
       *
       * <code>optional string identifier = 1;</code>
       */
      public Builder setIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        identifier_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:UnregisterActorUserRequest)
    }

    // @@protoc_insertion_point(class_scope:UnregisterActorUserRequest)
    private static final de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest();
    }

    public static de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnregisterActorUserRequest>
        PARSER = new com.google.protobuf.AbstractParser<UnregisterActorUserRequest>() {
      public UnregisterActorUserRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new UnregisterActorUserRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnregisterActorUserRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnregisterActorUserRequest> getParserForType() {
      return PARSER;
    }

    public de.bwueller.environment.protocol.UnregisterActorUser.UnregisterActorUserRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnregisterActorUserRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnregisterActorUserRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033unregister_actor_user.proto\032\rgeneral.p" +
      "roto\"0\n\032UnregisterActorUserRequest\022\022\n\nid" +
      "entifier\030\001 \001(\tB\"\n de.bwueller.environmen" +
      "t.protocolb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          de.bwueller.environment.protocol.General.getDescriptor(),
        }, assigner);
    internal_static_UnregisterActorUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnregisterActorUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnregisterActorUserRequest_descriptor,
        new java.lang.String[] { "Identifier", });
    de.bwueller.environment.protocol.General.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
