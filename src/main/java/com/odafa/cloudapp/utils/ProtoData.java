package com.odafa.cloudapp.utils;

public final class ProtoData {
  private ProtoData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CommandOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Command)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 code = 1;</code>
     */
    int getCode();

    /**
     * <code>bytes payload = 2;</code>
     */
    com.google.protobuf.ByteString getPayload();
  }
  /**
   * Protobuf type {@code Command}
   */
  public  static final class Command extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Command)
      CommandOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Command.newBuilder() to construct.
    private Command(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Command() {
      payload_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Command();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Command(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              code_ = input.readInt32();
              break;
            }
            case 18: {

              payload_ = input.readBytes();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProtoData.internal_static_Command_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProtoData.internal_static_Command_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProtoData.Command.class, ProtoData.Command.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }

    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString payload_;
    /**
     * <code>bytes payload = 2;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
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
      if (code_ != 0) {
        output.writeInt32(1, code_);
      }
      if (!payload_.isEmpty()) {
        output.writeBytes(2, payload_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, code_);
      }
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, payload_);
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
      if (!(obj instanceof ProtoData.Command)) {
        return super.equals(obj);
      }
      ProtoData.Command other = (ProtoData.Command) obj;

      if (getCode()
          != other.getCode()) return false;
      if (!getPayload()
          .equals(other.getPayload())) return false;
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
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode();
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ProtoData.Command parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.Command parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.Command parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.Command parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.Command parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.Command parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.Command parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.Command parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.Command parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ProtoData.Command parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.Command parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.Command parseFrom(
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
    public static Builder newBuilder(ProtoData.Command prototype) {
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
     * Protobuf type {@code Command}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Command)
        ProtoData.CommandOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProtoData.internal_static_Command_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProtoData.internal_static_Command_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ProtoData.Command.class, ProtoData.Command.Builder.class);
      }

      // Construct using ProtoData.Command.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        code_ = 0;

        payload_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProtoData.internal_static_Command_descriptor;
      }

      @java.lang.Override
      public ProtoData.Command getDefaultInstanceForType() {
        return ProtoData.Command.getDefaultInstance();
      }

      @java.lang.Override
      public ProtoData.Command build() {
        ProtoData.Command result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ProtoData.Command buildPartial() {
        ProtoData.Command result = new ProtoData.Command(this);
        result.code_ = code_;
        result.payload_ = payload_;
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
        if (other instanceof ProtoData.Command) {
          return mergeFrom((ProtoData.Command)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ProtoData.Command other) {
        if (other == ProtoData.Command.getDefaultInstance()) return this;
        if (other.getCode() != 0) {
          setCode(other.getCode());
        }
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
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
        ProtoData.Command parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProtoData.Command) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int code_ ;
      /**
       * <code>int32 code = 1;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>int32 code = 1;</code>
       */
      public Builder setCode(int value) {
        
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 code = 1;</code>
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes payload = 2;</code>
       */
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>bytes payload = 2;</code>
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes payload = 2;</code>
       */
      public Builder clearPayload() {
        
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:Command)
    }

    // @@protoc_insertion_point(class_scope:Command)
    private static final ProtoData.Command DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ProtoData.Command();
    }

    public static ProtoData.Command getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Command>
        PARSER = new com.google.protobuf.AbstractParser<Command>() {
      @java.lang.Override
      public Command parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Command(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Command> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Command> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ProtoData.Command getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DroneDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DroneData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float altitude = 1;</code>
     */
    float getAltitude();

    /**
     * <code>double latitude = 2;</code>
     */
    double getLatitude();

    /**
     * <code>double longitude = 3;</code>
     */
    double getLongitude();

    /**
     * <code>float voltage = 4;</code>
     */
    float getVoltage();

    /**
     * <code>float speed = 5;</code>
     */
    float getSpeed();

    /**
     * <code>string state = 6;</code>
     */
    java.lang.String getState();
    /**
     * <code>string state = 6;</code>
     */
    com.google.protobuf.ByteString
        getStateBytes();

    /**
     * <code>int32 video_port = 7;</code>
     */
    int getVideoPort();

    /**
     * <code>string drone_id = 8;</code>
     */
    java.lang.String getDroneId();
    /**
     * <code>string drone_id = 8;</code>
     */
    com.google.protobuf.ByteString
        getDroneIdBytes();
  }
  /**
   * Protobuf type {@code DroneData}
   */
  public  static final class DroneData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DroneData)
      DroneDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DroneData.newBuilder() to construct.
    private DroneData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DroneData() {
      state_ = "";
      droneId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DroneData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DroneData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 13: {

              altitude_ = input.readFloat();
              break;
            }
            case 17: {

              latitude_ = input.readDouble();
              break;
            }
            case 25: {

              longitude_ = input.readDouble();
              break;
            }
            case 37: {

              voltage_ = input.readFloat();
              break;
            }
            case 45: {

              speed_ = input.readFloat();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              state_ = s;
              break;
            }
            case 56: {

              videoPort_ = input.readInt32();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              droneId_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProtoData.internal_static_DroneData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProtoData.internal_static_DroneData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProtoData.DroneData.class, ProtoData.DroneData.Builder.class);
    }

    public static final int ALTITUDE_FIELD_NUMBER = 1;
    private float altitude_;
    /**
     * <code>float altitude = 1;</code>
     */
    public float getAltitude() {
      return altitude_;
    }

    public static final int LATITUDE_FIELD_NUMBER = 2;
    private double latitude_;
    /**
     * <code>double latitude = 2;</code>
     */
    public double getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private double longitude_;
    /**
     * <code>double longitude = 3;</code>
     */
    public double getLongitude() {
      return longitude_;
    }

    public static final int VOLTAGE_FIELD_NUMBER = 4;
    private float voltage_;
    /**
     * <code>float voltage = 4;</code>
     */
    public float getVoltage() {
      return voltage_;
    }

    public static final int SPEED_FIELD_NUMBER = 5;
    private float speed_;
    /**
     * <code>float speed = 5;</code>
     */
    public float getSpeed() {
      return speed_;
    }

    public static final int STATE_FIELD_NUMBER = 6;
    private volatile java.lang.Object state_;
    /**
     * <code>string state = 6;</code>
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      }
    }
    /**
     * <code>string state = 6;</code>
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VIDEO_PORT_FIELD_NUMBER = 7;
    private int videoPort_;
    /**
     * <code>int32 video_port = 7;</code>
     */
    public int getVideoPort() {
      return videoPort_;
    }

    public static final int DRONE_ID_FIELD_NUMBER = 8;
    private volatile java.lang.Object droneId_;
    /**
     * <code>string drone_id = 8;</code>
     */
    public java.lang.String getDroneId() {
      java.lang.Object ref = droneId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        droneId_ = s;
        return s;
      }
    }
    /**
     * <code>string drone_id = 8;</code>
     */
    public com.google.protobuf.ByteString
        getDroneIdBytes() {
      java.lang.Object ref = droneId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        droneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (altitude_ != 0F) {
        output.writeFloat(1, altitude_);
      }
      if (latitude_ != 0D) {
        output.writeDouble(2, latitude_);
      }
      if (longitude_ != 0D) {
        output.writeDouble(3, longitude_);
      }
      if (voltage_ != 0F) {
        output.writeFloat(4, voltage_);
      }
      if (speed_ != 0F) {
        output.writeFloat(5, speed_);
      }
      if (!getStateBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, state_);
      }
      if (videoPort_ != 0) {
        output.writeInt32(7, videoPort_);
      }
      if (!getDroneIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, droneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (altitude_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, altitude_);
      }
      if (latitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, latitude_);
      }
      if (longitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, longitude_);
      }
      if (voltage_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, voltage_);
      }
      if (speed_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, speed_);
      }
      if (!getStateBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, state_);
      }
      if (videoPort_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, videoPort_);
      }
      if (!getDroneIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, droneId_);
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
      if (!(obj instanceof ProtoData.DroneData)) {
        return super.equals(obj);
      }
      ProtoData.DroneData other = (ProtoData.DroneData) obj;

      if (java.lang.Float.floatToIntBits(getAltitude())
          != java.lang.Float.floatToIntBits(
              other.getAltitude())) return false;
      if (java.lang.Double.doubleToLongBits(getLatitude())
          != java.lang.Double.doubleToLongBits(
              other.getLatitude())) return false;
      if (java.lang.Double.doubleToLongBits(getLongitude())
          != java.lang.Double.doubleToLongBits(
              other.getLongitude())) return false;
      if (java.lang.Float.floatToIntBits(getVoltage())
          != java.lang.Float.floatToIntBits(
              other.getVoltage())) return false;
      if (java.lang.Float.floatToIntBits(getSpeed())
          != java.lang.Float.floatToIntBits(
              other.getSpeed())) return false;
      if (!getState()
          .equals(other.getState())) return false;
      if (getVideoPort()
          != other.getVideoPort()) return false;
      if (!getDroneId()
          .equals(other.getDroneId())) return false;
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
      hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAltitude());
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLatitude()));
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLongitude()));
      hash = (37 * hash) + VOLTAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVoltage());
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSpeed());
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
      hash = (37 * hash) + VIDEO_PORT_FIELD_NUMBER;
      hash = (53 * hash) + getVideoPort();
      hash = (37 * hash) + DRONE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDroneId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ProtoData.DroneData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.DroneData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.DroneData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.DroneData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.DroneData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.DroneData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.DroneData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.DroneData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.DroneData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ProtoData.DroneData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.DroneData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.DroneData parseFrom(
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
    public static Builder newBuilder(ProtoData.DroneData prototype) {
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
     * Protobuf type {@code DroneData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DroneData)
        ProtoData.DroneDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProtoData.internal_static_DroneData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProtoData.internal_static_DroneData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ProtoData.DroneData.class, ProtoData.DroneData.Builder.class);
      }

      // Construct using ProtoData.DroneData.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        altitude_ = 0F;

        latitude_ = 0D;

        longitude_ = 0D;

        voltage_ = 0F;

        speed_ = 0F;

        state_ = "";

        videoPort_ = 0;

        droneId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProtoData.internal_static_DroneData_descriptor;
      }

      @java.lang.Override
      public ProtoData.DroneData getDefaultInstanceForType() {
        return ProtoData.DroneData.getDefaultInstance();
      }

      @java.lang.Override
      public ProtoData.DroneData build() {
        ProtoData.DroneData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ProtoData.DroneData buildPartial() {
        ProtoData.DroneData result = new ProtoData.DroneData(this);
        result.altitude_ = altitude_;
        result.latitude_ = latitude_;
        result.longitude_ = longitude_;
        result.voltage_ = voltage_;
        result.speed_ = speed_;
        result.state_ = state_;
        result.videoPort_ = videoPort_;
        result.droneId_ = droneId_;
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
        if (other instanceof ProtoData.DroneData) {
          return mergeFrom((ProtoData.DroneData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ProtoData.DroneData other) {
        if (other == ProtoData.DroneData.getDefaultInstance()) return this;
        if (other.getAltitude() != 0F) {
          setAltitude(other.getAltitude());
        }
        if (other.getLatitude() != 0D) {
          setLatitude(other.getLatitude());
        }
        if (other.getLongitude() != 0D) {
          setLongitude(other.getLongitude());
        }
        if (other.getVoltage() != 0F) {
          setVoltage(other.getVoltage());
        }
        if (other.getSpeed() != 0F) {
          setSpeed(other.getSpeed());
        }
        if (!other.getState().isEmpty()) {
          state_ = other.state_;
          onChanged();
        }
        if (other.getVideoPort() != 0) {
          setVideoPort(other.getVideoPort());
        }
        if (!other.getDroneId().isEmpty()) {
          droneId_ = other.droneId_;
          onChanged();
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
        ProtoData.DroneData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProtoData.DroneData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float altitude_ ;
      /**
       * <code>float altitude = 1;</code>
       */
      public float getAltitude() {
        return altitude_;
      }
      /**
       * <code>float altitude = 1;</code>
       */
      public Builder setAltitude(float value) {
        
        altitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float altitude = 1;</code>
       */
      public Builder clearAltitude() {
        
        altitude_ = 0F;
        onChanged();
        return this;
      }

      private double latitude_ ;
      /**
       * <code>double latitude = 2;</code>
       */
      public double getLatitude() {
        return latitude_;
      }
      /**
       * <code>double latitude = 2;</code>
       */
      public Builder setLatitude(double value) {
        
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double latitude = 2;</code>
       */
      public Builder clearLatitude() {
        
        latitude_ = 0D;
        onChanged();
        return this;
      }

      private double longitude_ ;
      /**
       * <code>double longitude = 3;</code>
       */
      public double getLongitude() {
        return longitude_;
      }
      /**
       * <code>double longitude = 3;</code>
       */
      public Builder setLongitude(double value) {
        
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double longitude = 3;</code>
       */
      public Builder clearLongitude() {
        
        longitude_ = 0D;
        onChanged();
        return this;
      }

      private float voltage_ ;
      /**
       * <code>float voltage = 4;</code>
       */
      public float getVoltage() {
        return voltage_;
      }
      /**
       * <code>float voltage = 4;</code>
       */
      public Builder setVoltage(float value) {
        
        voltage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float voltage = 4;</code>
       */
      public Builder clearVoltage() {
        
        voltage_ = 0F;
        onChanged();
        return this;
      }

      private float speed_ ;
      /**
       * <code>float speed = 5;</code>
       */
      public float getSpeed() {
        return speed_;
      }
      /**
       * <code>float speed = 5;</code>
       */
      public Builder setSpeed(float value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float speed = 5;</code>
       */
      public Builder clearSpeed() {
        
        speed_ = 0F;
        onChanged();
        return this;
      }

      private java.lang.Object state_ = "";
      /**
       * <code>string state = 6;</code>
       */
      public java.lang.String getState() {
        java.lang.Object ref = state_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          state_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string state = 6;</code>
       */
      public com.google.protobuf.ByteString
          getStateBytes() {
        java.lang.Object ref = state_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          state_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string state = 6;</code>
       */
      public Builder setState(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string state = 6;</code>
       */
      public Builder clearState() {
        
        state_ = getDefaultInstance().getState();
        onChanged();
        return this;
      }
      /**
       * <code>string state = 6;</code>
       */
      public Builder setStateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        state_ = value;
        onChanged();
        return this;
      }

      private int videoPort_ ;
      /**
       * <code>int32 video_port = 7;</code>
       */
      public int getVideoPort() {
        return videoPort_;
      }
      /**
       * <code>int32 video_port = 7;</code>
       */
      public Builder setVideoPort(int value) {
        
        videoPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 video_port = 7;</code>
       */
      public Builder clearVideoPort() {
        
        videoPort_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object droneId_ = "";
      /**
       * <code>string drone_id = 8;</code>
       */
      public java.lang.String getDroneId() {
        java.lang.Object ref = droneId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          droneId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string drone_id = 8;</code>
       */
      public com.google.protobuf.ByteString
          getDroneIdBytes() {
        java.lang.Object ref = droneId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          droneId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string drone_id = 8;</code>
       */
      public Builder setDroneId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        droneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string drone_id = 8;</code>
       */
      public Builder clearDroneId() {
        
        droneId_ = getDefaultInstance().getDroneId();
        onChanged();
        return this;
      }
      /**
       * <code>string drone_id = 8;</code>
       */
      public Builder setDroneIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        droneId_ = value;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:DroneData)
    }

    // @@protoc_insertion_point(class_scope:DroneData)
    private static final ProtoData.DroneData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ProtoData.DroneData();
    }

    public static ProtoData.DroneData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DroneData>
        PARSER = new com.google.protobuf.AbstractParser<DroneData>() {
      @java.lang.Override
      public DroneData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DroneData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DroneData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DroneData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ProtoData.DroneData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DataPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DataPoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string latitude = 1;</code>
     */
    java.lang.String getLatitude();
    /**
     * <code>string latitude = 1;</code>
     */
    com.google.protobuf.ByteString
        getLatitudeBytes();

    /**
     * <code>string longitude = 2;</code>
     */
    java.lang.String getLongitude();
    /**
     * <code>string longitude = 2;</code>
     */
    com.google.protobuf.ByteString
        getLongitudeBytes();

    /**
     * <code>float altitude = 3;</code>
     */
    float getAltitude();

    /**
     * <code>float speed = 4;</code>
     */
    float getSpeed();

    /**
     * <code>int32 action = 5;</code>
     */
    int getAction();
  }
  /**
   * Protobuf type {@code DataPoint}
   */
  public  static final class DataPoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DataPoint)
      DataPointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DataPoint.newBuilder() to construct.
    private DataPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DataPoint() {
      latitude_ = "";
      longitude_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DataPoint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DataPoint(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              java.lang.String s = input.readStringRequireUtf8();

              latitude_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              longitude_ = s;
              break;
            }
            case 29: {

              altitude_ = input.readFloat();
              break;
            }
            case 37: {

              speed_ = input.readFloat();
              break;
            }
            case 40: {

              action_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProtoData.internal_static_DataPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProtoData.internal_static_DataPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProtoData.DataPoint.class, ProtoData.DataPoint.Builder.class);
    }

    public static final int LATITUDE_FIELD_NUMBER = 1;
    private volatile java.lang.Object latitude_;
    /**
     * <code>string latitude = 1;</code>
     */
    public java.lang.String getLatitude() {
      java.lang.Object ref = latitude_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latitude_ = s;
        return s;
      }
    }
    /**
     * <code>string latitude = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLatitudeBytes() {
      java.lang.Object ref = latitude_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        latitude_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private volatile java.lang.Object longitude_;
    /**
     * <code>string longitude = 2;</code>
     */
    public java.lang.String getLongitude() {
      java.lang.Object ref = longitude_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        longitude_ = s;
        return s;
      }
    }
    /**
     * <code>string longitude = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLongitudeBytes() {
      java.lang.Object ref = longitude_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        longitude_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALTITUDE_FIELD_NUMBER = 3;
    private float altitude_;
    /**
     * <code>float altitude = 3;</code>
     */
    public float getAltitude() {
      return altitude_;
    }

    public static final int SPEED_FIELD_NUMBER = 4;
    private float speed_;
    /**
     * <code>float speed = 4;</code>
     */
    public float getSpeed() {
      return speed_;
    }

    public static final int ACTION_FIELD_NUMBER = 5;
    private int action_;
    /**
     * <code>int32 action = 5;</code>
     */
    public int getAction() {
      return action_;
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
      if (!getLatitudeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, latitude_);
      }
      if (!getLongitudeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, longitude_);
      }
      if (altitude_ != 0F) {
        output.writeFloat(3, altitude_);
      }
      if (speed_ != 0F) {
        output.writeFloat(4, speed_);
      }
      if (action_ != 0) {
        output.writeInt32(5, action_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getLatitudeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, latitude_);
      }
      if (!getLongitudeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, longitude_);
      }
      if (altitude_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, altitude_);
      }
      if (speed_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, speed_);
      }
      if (action_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, action_);
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
      if (!(obj instanceof ProtoData.DataPoint)) {
        return super.equals(obj);
      }
      ProtoData.DataPoint other = (ProtoData.DataPoint) obj;

      if (!getLatitude()
          .equals(other.getLatitude())) return false;
      if (!getLongitude()
          .equals(other.getLongitude())) return false;
      if (java.lang.Float.floatToIntBits(getAltitude())
          != java.lang.Float.floatToIntBits(
              other.getAltitude())) return false;
      if (java.lang.Float.floatToIntBits(getSpeed())
          != java.lang.Float.floatToIntBits(
              other.getSpeed())) return false;
      if (getAction()
          != other.getAction()) return false;
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
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + getLatitude().hashCode();
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + getLongitude().hashCode();
      hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAltitude());
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSpeed());
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ProtoData.DataPoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.DataPoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.DataPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.DataPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.DataPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.DataPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.DataPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.DataPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.DataPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ProtoData.DataPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.DataPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.DataPoint parseFrom(
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
    public static Builder newBuilder(ProtoData.DataPoint prototype) {
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
     * Protobuf type {@code DataPoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DataPoint)
        ProtoData.DataPointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProtoData.internal_static_DataPoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProtoData.internal_static_DataPoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ProtoData.DataPoint.class, ProtoData.DataPoint.Builder.class);
      }

      // Construct using ProtoData.DataPoint.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        latitude_ = "";

        longitude_ = "";

        altitude_ = 0F;

        speed_ = 0F;

        action_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProtoData.internal_static_DataPoint_descriptor;
      }

      @java.lang.Override
      public ProtoData.DataPoint getDefaultInstanceForType() {
        return ProtoData.DataPoint.getDefaultInstance();
      }

      @java.lang.Override
      public ProtoData.DataPoint build() {
        ProtoData.DataPoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ProtoData.DataPoint buildPartial() {
        ProtoData.DataPoint result = new ProtoData.DataPoint(this);
        result.latitude_ = latitude_;
        result.longitude_ = longitude_;
        result.altitude_ = altitude_;
        result.speed_ = speed_;
        result.action_ = action_;
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
        if (other instanceof ProtoData.DataPoint) {
          return mergeFrom((ProtoData.DataPoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ProtoData.DataPoint other) {
        if (other == ProtoData.DataPoint.getDefaultInstance()) return this;
        if (!other.getLatitude().isEmpty()) {
          latitude_ = other.latitude_;
          onChanged();
        }
        if (!other.getLongitude().isEmpty()) {
          longitude_ = other.longitude_;
          onChanged();
        }
        if (other.getAltitude() != 0F) {
          setAltitude(other.getAltitude());
        }
        if (other.getSpeed() != 0F) {
          setSpeed(other.getSpeed());
        }
        if (other.getAction() != 0) {
          setAction(other.getAction());
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
        ProtoData.DataPoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProtoData.DataPoint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object latitude_ = "";
      /**
       * <code>string latitude = 1;</code>
       */
      public java.lang.String getLatitude() {
        java.lang.Object ref = latitude_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          latitude_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string latitude = 1;</code>
       */
      public com.google.protobuf.ByteString
          getLatitudeBytes() {
        java.lang.Object ref = latitude_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          latitude_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string latitude = 1;</code>
       */
      public Builder setLatitude(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string latitude = 1;</code>
       */
      public Builder clearLatitude() {
        
        latitude_ = getDefaultInstance().getLatitude();
        onChanged();
        return this;
      }
      /**
       * <code>string latitude = 1;</code>
       */
      public Builder setLatitudeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        latitude_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object longitude_ = "";
      /**
       * <code>string longitude = 2;</code>
       */
      public java.lang.String getLongitude() {
        java.lang.Object ref = longitude_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          longitude_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string longitude = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLongitudeBytes() {
        java.lang.Object ref = longitude_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          longitude_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string longitude = 2;</code>
       */
      public Builder setLongitude(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string longitude = 2;</code>
       */
      public Builder clearLongitude() {
        
        longitude_ = getDefaultInstance().getLongitude();
        onChanged();
        return this;
      }
      /**
       * <code>string longitude = 2;</code>
       */
      public Builder setLongitudeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        longitude_ = value;
        onChanged();
        return this;
      }

      private float altitude_ ;
      /**
       * <code>float altitude = 3;</code>
       */
      public float getAltitude() {
        return altitude_;
      }
      /**
       * <code>float altitude = 3;</code>
       */
      public Builder setAltitude(float value) {
        
        altitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float altitude = 3;</code>
       */
      public Builder clearAltitude() {
        
        altitude_ = 0F;
        onChanged();
        return this;
      }

      private float speed_ ;
      /**
       * <code>float speed = 4;</code>
       */
      public float getSpeed() {
        return speed_;
      }
      /**
       * <code>float speed = 4;</code>
       */
      public Builder setSpeed(float value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float speed = 4;</code>
       */
      public Builder clearSpeed() {
        
        speed_ = 0F;
        onChanged();
        return this;
      }

      private int action_ ;
      /**
       * <code>int32 action = 5;</code>
       */
      public int getAction() {
        return action_;
      }
      /**
       * <code>int32 action = 5;</code>
       */
      public Builder setAction(int value) {
        
        action_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 action = 5;</code>
       */
      public Builder clearAction() {
        
        action_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:DataPoint)
    }

    // @@protoc_insertion_point(class_scope:DataPoint)
    private static final ProtoData.DataPoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ProtoData.DataPoint();
    }

    public static ProtoData.DataPoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DataPoint>
        PARSER = new com.google.protobuf.AbstractParser<DataPoint>() {
      @java.lang.Override
      public DataPoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DataPoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DataPoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DataPoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ProtoData.DataPoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MissionDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MissionData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    java.util.List<ProtoData.DataPoint> 
        getPointList();
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    ProtoData.DataPoint getPoint(int index);
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    int getPointCount();
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    java.util.List<? extends ProtoData.DataPointOrBuilder> 
        getPointOrBuilderList();
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    ProtoData.DataPointOrBuilder getPointOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code MissionData}
   */
  public  static final class MissionData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MissionData)
      MissionDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MissionData.newBuilder() to construct.
    private MissionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MissionData() {
      point_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MissionData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MissionData(
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
                point_ = new java.util.ArrayList<ProtoData.DataPoint>();
                mutable_bitField0_ |= 0x00000001;
              }
              point_.add(
                  input.readMessage(ProtoData.DataPoint.parser(), extensionRegistry));
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
          point_ = java.util.Collections.unmodifiableList(point_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProtoData.internal_static_MissionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProtoData.internal_static_MissionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProtoData.MissionData.class, ProtoData.MissionData.Builder.class);
    }

    public static final int POINT_FIELD_NUMBER = 1;
    private java.util.List<ProtoData.DataPoint> point_;
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    public java.util.List<ProtoData.DataPoint> getPointList() {
      return point_;
    }
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    public java.util.List<? extends ProtoData.DataPointOrBuilder> 
        getPointOrBuilderList() {
      return point_;
    }
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    public int getPointCount() {
      return point_.size();
    }
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    public ProtoData.DataPoint getPoint(int index) {
      return point_.get(index);
    }
    /**
     * <code>repeated .DataPoint point = 1;</code>
     */
    public ProtoData.DataPointOrBuilder getPointOrBuilder(
        int index) {
      return point_.get(index);
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
      for (int i = 0; i < point_.size(); i++) {
        output.writeMessage(1, point_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < point_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, point_.get(i));
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
      if (!(obj instanceof ProtoData.MissionData)) {
        return super.equals(obj);
      }
      ProtoData.MissionData other = (ProtoData.MissionData) obj;

      if (!getPointList()
          .equals(other.getPointList())) return false;
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
      if (getPointCount() > 0) {
        hash = (37 * hash) + POINT_FIELD_NUMBER;
        hash = (53 * hash) + getPointList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ProtoData.MissionData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.MissionData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.MissionData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.MissionData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.MissionData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoData.MissionData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoData.MissionData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.MissionData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.MissionData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ProtoData.MissionData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProtoData.MissionData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProtoData.MissionData parseFrom(
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
    public static Builder newBuilder(ProtoData.MissionData prototype) {
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
     * Protobuf type {@code MissionData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MissionData)
        ProtoData.MissionDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProtoData.internal_static_MissionData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProtoData.internal_static_MissionData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ProtoData.MissionData.class, ProtoData.MissionData.Builder.class);
      }

      // Construct using ProtoData.MissionData.newBuilder()
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
          getPointFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (pointBuilder_ == null) {
          point_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pointBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProtoData.internal_static_MissionData_descriptor;
      }

      @java.lang.Override
      public ProtoData.MissionData getDefaultInstanceForType() {
        return ProtoData.MissionData.getDefaultInstance();
      }

      @java.lang.Override
      public ProtoData.MissionData build() {
        ProtoData.MissionData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ProtoData.MissionData buildPartial() {
        ProtoData.MissionData result = new ProtoData.MissionData(this);
        int from_bitField0_ = bitField0_;
        if (pointBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            point_ = java.util.Collections.unmodifiableList(point_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.point_ = point_;
        } else {
          result.point_ = pointBuilder_.build();
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
        if (other instanceof ProtoData.MissionData) {
          return mergeFrom((ProtoData.MissionData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ProtoData.MissionData other) {
        if (other == ProtoData.MissionData.getDefaultInstance()) return this;
        if (pointBuilder_ == null) {
          if (!other.point_.isEmpty()) {
            if (point_.isEmpty()) {
              point_ = other.point_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePointIsMutable();
              point_.addAll(other.point_);
            }
            onChanged();
          }
        } else {
          if (!other.point_.isEmpty()) {
            if (pointBuilder_.isEmpty()) {
              pointBuilder_.dispose();
              pointBuilder_ = null;
              point_ = other.point_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pointBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPointFieldBuilder() : null;
            } else {
              pointBuilder_.addAllMessages(other.point_);
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
        ProtoData.MissionData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProtoData.MissionData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ProtoData.DataPoint> point_ =
        java.util.Collections.emptyList();
      private void ensurePointIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          point_ = new java.util.ArrayList<ProtoData.DataPoint>(point_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ProtoData.DataPoint, ProtoData.DataPoint.Builder, ProtoData.DataPointOrBuilder> pointBuilder_;

      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public java.util.List<ProtoData.DataPoint> getPointList() {
        if (pointBuilder_ == null) {
          return java.util.Collections.unmodifiableList(point_);
        } else {
          return pointBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public int getPointCount() {
        if (pointBuilder_ == null) {
          return point_.size();
        } else {
          return pointBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public ProtoData.DataPoint getPoint(int index) {
        if (pointBuilder_ == null) {
          return point_.get(index);
        } else {
          return pointBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder setPoint(
          int index, ProtoData.DataPoint value) {
        if (pointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointIsMutable();
          point_.set(index, value);
          onChanged();
        } else {
          pointBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder setPoint(
          int index, ProtoData.DataPoint.Builder builderForValue) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.set(index, builderForValue.build());
          onChanged();
        } else {
          pointBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder addPoint(ProtoData.DataPoint value) {
        if (pointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointIsMutable();
          point_.add(value);
          onChanged();
        } else {
          pointBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder addPoint(
          int index, ProtoData.DataPoint value) {
        if (pointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointIsMutable();
          point_.add(index, value);
          onChanged();
        } else {
          pointBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder addPoint(
          ProtoData.DataPoint.Builder builderForValue) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.add(builderForValue.build());
          onChanged();
        } else {
          pointBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder addPoint(
          int index, ProtoData.DataPoint.Builder builderForValue) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.add(index, builderForValue.build());
          onChanged();
        } else {
          pointBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder addAllPoint(
          java.lang.Iterable<? extends ProtoData.DataPoint> values) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, point_);
          onChanged();
        } else {
          pointBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder clearPoint() {
        if (pointBuilder_ == null) {
          point_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pointBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public Builder removePoint(int index) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.remove(index);
          onChanged();
        } else {
          pointBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public ProtoData.DataPoint.Builder getPointBuilder(
          int index) {
        return getPointFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public ProtoData.DataPointOrBuilder getPointOrBuilder(
          int index) {
        if (pointBuilder_ == null) {
          return point_.get(index);  } else {
          return pointBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public java.util.List<? extends ProtoData.DataPointOrBuilder> 
           getPointOrBuilderList() {
        if (pointBuilder_ != null) {
          return pointBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(point_);
        }
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public ProtoData.DataPoint.Builder addPointBuilder() {
        return getPointFieldBuilder().addBuilder(
            ProtoData.DataPoint.getDefaultInstance());
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public ProtoData.DataPoint.Builder addPointBuilder(
          int index) {
        return getPointFieldBuilder().addBuilder(
            index, ProtoData.DataPoint.getDefaultInstance());
      }
      /**
       * <code>repeated .DataPoint point = 1;</code>
       */
      public java.util.List<ProtoData.DataPoint.Builder> 
           getPointBuilderList() {
        return getPointFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ProtoData.DataPoint, ProtoData.DataPoint.Builder, ProtoData.DataPointOrBuilder> 
          getPointFieldBuilder() {
        if (pointBuilder_ == null) {
          pointBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ProtoData.DataPoint, ProtoData.DataPoint.Builder, ProtoData.DataPointOrBuilder>(
                  point_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          point_ = null;
        }
        return pointBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MissionData)
    }

    // @@protoc_insertion_point(class_scope:MissionData)
    private static final ProtoData.MissionData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ProtoData.MissionData();
    }

    public static ProtoData.MissionData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MissionData>
        PARSER = new com.google.protobuf.AbstractParser<MissionData>() {
      @java.lang.Override
      public MissionData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MissionData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MissionData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MissionData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ProtoData.MissionData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Command_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Command_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DroneData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DroneData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DataPoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DataPoint_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MissionData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MissionData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ProtoData.proto\"(\n\007Command\022\014\n\004code\030\001 \001" +
      "(\005\022\017\n\007payload\030\002 \001(\014\"\227\001\n\tDroneData\022\020\n\010alt" +
      "itude\030\001 \001(\002\022\020\n\010latitude\030\002 \001(\001\022\021\n\tlongitu" +
      "de\030\003 \001(\001\022\017\n\007voltage\030\004 \001(\002\022\r\n\005speed\030\005 \001(\002" +
      "\022\r\n\005state\030\006 \001(\t\022\022\n\nvideo_port\030\007 \001(\005\022\020\n\010d" +
      "rone_id\030\010 \001(\t\"a\n\tDataPoint\022\020\n\010latitude\030\001" +
      " \001(\t\022\021\n\tlongitude\030\002 \001(\t\022\020\n\010altitude\030\003 \001(" +
      "\002\022\r\n\005speed\030\004 \001(\002\022\016\n\006action\030\005 \001(\005\"(\n\013Miss" +
      "ionData\022\031\n\005point\030\001 \003(\0132\n.DataPointb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Command_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Command_descriptor,
        new java.lang.String[] { "Code", "Payload", });
    internal_static_DroneData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DroneData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DroneData_descriptor,
        new java.lang.String[] { "Altitude", "Latitude", "Longitude", "Voltage", "Speed", "State", "VideoPort", "DroneId", });
    internal_static_DataPoint_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DataPoint_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", "Altitude", "Speed", "Action", });
    internal_static_MissionData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MissionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MissionData_descriptor,
        new java.lang.String[] { "Point", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
