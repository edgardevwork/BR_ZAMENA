package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Duration extends GeneratedMessageLite<Duration, Builder> implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public final void setSeconds(long j) {
        this.seconds_ = j;
    }

    public final void clearSeconds() {
        this.seconds_ = 0L;
    }

    @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    public final void setNanos(int i) {
        this.nanos_ = i;
    }

    public final void clearNanos() {
        this.nanos_ = 0;
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Duration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Duration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Duration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Duration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Duration parseFrom(InputStream inputStream) throws IOException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Duration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Duration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Duration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Duration duration) {
        return DEFAULT_INSTANCE.createBuilder(duration);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Duration, Builder> implements DurationOrBuilder {
        public /* synthetic */ Builder(C24501 c24501) {
            this();
        }

        public Builder() {
            super(Duration.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public long getSeconds() {
            return ((Duration) this.instance).getSeconds();
        }

        public Builder setSeconds(long j) {
            copyOnWrite();
            ((Duration) this.instance).setSeconds(j);
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            ((Duration) this.instance).clearSeconds();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public int getNanos() {
            return ((Duration) this.instance).getNanos();
        }

        public Builder setNanos(int i) {
            copyOnWrite();
            ((Duration) this.instance).setNanos(i);
            return this;
        }

        public Builder clearNanos() {
            copyOnWrite();
            ((Duration) this.instance).clearNanos();
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Duration$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C24501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f265xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f265xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f265xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f265xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f265xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f265xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f265xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f265xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C24501 c24501 = null;
        switch (C24501.f265xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Duration();
            case 2:
                return new Builder(c24501);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Duration> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Duration.class) {
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
        Duration duration = new Duration();
        DEFAULT_INSTANCE = duration;
        GeneratedMessageLite.registerDefaultInstance(Duration.class, duration);
    }

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Duration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
