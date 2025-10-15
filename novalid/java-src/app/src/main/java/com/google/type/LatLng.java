package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class LatLng extends GeneratedMessageLite<LatLng, Builder> implements LatLngOrBuilder {
    private static final LatLng DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser<LatLng> PARSER;
    private double latitude_;
    private double longitude_;

    @Override // com.google.type.LatLngOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    public final void setLatitude(double d) {
        this.latitude_ = d;
    }

    public final void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    @Override // com.google.type.LatLngOrBuilder
    public double getLongitude() {
        return this.longitude_;
    }

    public final void setLongitude(double d) {
        this.longitude_ = d;
    }

    public final void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LatLng parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LatLng parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LatLng parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LatLng parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LatLng parseFrom(InputStream inputStream) throws IOException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatLng parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LatLng) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LatLng) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LatLng) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LatLng latLng) {
        return DEFAULT_INSTANCE.createBuilder(latLng);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LatLng, Builder> implements LatLngOrBuilder {
        public /* synthetic */ Builder(C80011 c80011) {
            this();
        }

        public Builder() {
            super(LatLng.DEFAULT_INSTANCE);
        }

        @Override // com.google.type.LatLngOrBuilder
        public double getLatitude() {
            return ((LatLng) this.instance).getLatitude();
        }

        public Builder setLatitude(double d) {
            copyOnWrite();
            ((LatLng) this.instance).setLatitude(d);
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((LatLng) this.instance).clearLatitude();
            return this;
        }

        @Override // com.google.type.LatLngOrBuilder
        public double getLongitude() {
            return ((LatLng) this.instance).getLongitude();
        }

        public Builder setLongitude(double d) {
            copyOnWrite();
            ((LatLng) this.instance).setLongitude(d);
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((LatLng) this.instance).clearLongitude();
            return this;
        }
    }

    /* renamed from: com.google.type.LatLng$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C80011 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f951xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f951xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f951xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f951xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f951xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f951xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f951xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f951xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C80011 c80011 = null;
        switch (C80011.f951xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LatLng();
            case 2:
                return new Builder(c80011);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LatLng> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LatLng.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } finally {
                        }
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        LatLng latLng = new LatLng();
        DEFAULT_INSTANCE = latLng;
        GeneratedMessageLite.registerDefaultInstance(LatLng.class, latLng);
    }

    public static LatLng getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LatLng> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
