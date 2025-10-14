package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class ResourceReference extends GeneratedMessageLite<ResourceReference, Builder> implements ResourceReferenceOrBuilder {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE;
    private static volatile Parser<ResourceReference> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String childType_ = "";

    @Override // com.google.api.ResourceReferenceOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public String getChildType() {
        return this.childType_;
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public ByteString getChildTypeBytes() {
        return ByteString.copyFromUtf8(this.childType_);
    }

    public final void setChildType(String str) {
        str.getClass();
        this.childType_ = str;
    }

    public final void clearChildType() {
        this.childType_ = getDefaultInstance().getChildType();
    }

    public final void setChildTypeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.childType_ = byteString.toStringUtf8();
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResourceReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceReference parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(InputStream inputStream) throws IOException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceReference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceReference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ResourceReference resourceReference) {
        return DEFAULT_INSTANCE.createBuilder(resourceReference);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceReference, Builder> implements ResourceReferenceOrBuilder {
        public /* synthetic */ Builder(C71381 c71381) {
            this();
        }

        public Builder() {
            super(ResourceReference.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public String getType() {
            return ((ResourceReference) this.instance).getType();
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public ByteString getTypeBytes() {
            return ((ResourceReference) this.instance).getTypeBytes();
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((ResourceReference) this.instance).setType(str);
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((ResourceReference) this.instance).clearType();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((ResourceReference) this.instance).setTypeBytes(byteString);
            return this;
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public String getChildType() {
            return ((ResourceReference) this.instance).getChildType();
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public ByteString getChildTypeBytes() {
            return ((ResourceReference) this.instance).getChildTypeBytes();
        }

        public Builder setChildType(String str) {
            copyOnWrite();
            ((ResourceReference) this.instance).setChildType(str);
            return this;
        }

        public Builder clearChildType() {
            copyOnWrite();
            ((ResourceReference) this.instance).clearChildType();
            return this;
        }

        public Builder setChildTypeBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((ResourceReference) this.instance).setChildTypeBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.api.ResourceReference$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C71381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f764xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f764xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f764xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f764xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f764xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f764xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f764xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f764xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C71381 c71381 = null;
        switch (C71381.f764xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceReference();
            case 2:
                return new Builder(c71381);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResourceReference> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResourceReference.class) {
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
        ResourceReference resourceReference = new ResourceReference();
        DEFAULT_INSTANCE = resourceReference;
        GeneratedMessageLite.registerDefaultInstance(ResourceReference.class, resourceReference);
    }

    public static ResourceReference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ResourceReference> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
