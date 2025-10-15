package com.google.type;

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

/* loaded from: classes5.dex */
public final class Expr extends GeneratedMessageLite<Expr, Builder> implements ExprOrBuilder {
    private static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile Parser<Expr> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String expression_ = "";
    private String title_ = "";
    private String description_ = "";
    private String location_ = "";

    @Override // com.google.type.ExprOrBuilder
    public String getExpression() {
        return this.expression_;
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getExpressionBytes() {
        return ByteString.copyFromUtf8(this.expression_);
    }

    public final void setExpression(String str) {
        str.getClass();
        this.expression_ = str;
    }

    public final void clearExpression() {
        this.expression_ = getDefaultInstance().getExpression();
    }

    public final void setExpressionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.expression_ = byteString.toStringUtf8();
    }

    @Override // com.google.type.ExprOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.type.ExprOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    @Override // com.google.type.ExprOrBuilder
    public String getLocation() {
        return this.location_;
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getLocationBytes() {
        return ByteString.copyFromUtf8(this.location_);
    }

    public final void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    public final void setLocationBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.location_ = byteString.toStringUtf8();
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Expr parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Expr parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Expr parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expr parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Expr parseFrom(InputStream inputStream) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expr parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Expr parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Expr expr) {
        return DEFAULT_INSTANCE.createBuilder(expr);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Expr, Builder> implements ExprOrBuilder {
        public /* synthetic */ Builder(C79991 c79991) {
            this();
        }

        public Builder() {
            super(Expr.DEFAULT_INSTANCE);
        }

        @Override // com.google.type.ExprOrBuilder
        public String getExpression() {
            return ((Expr) this.instance).getExpression();
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getExpressionBytes() {
            return ((Expr) this.instance).getExpressionBytes();
        }

        public Builder setExpression(String str) {
            copyOnWrite();
            ((Expr) this.instance).setExpression(str);
            return this;
        }

        public Builder clearExpression() {
            copyOnWrite();
            ((Expr) this.instance).clearExpression();
            return this;
        }

        public Builder setExpressionBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((Expr) this.instance).setExpressionBytes(byteString);
            return this;
        }

        @Override // com.google.type.ExprOrBuilder
        public String getTitle() {
            return ((Expr) this.instance).getTitle();
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getTitleBytes() {
            return ((Expr) this.instance).getTitleBytes();
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Expr) this.instance).setTitle(str);
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Expr) this.instance).clearTitle();
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((Expr) this.instance).setTitleBytes(byteString);
            return this;
        }

        @Override // com.google.type.ExprOrBuilder
        public String getDescription() {
            return ((Expr) this.instance).getDescription();
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getDescriptionBytes() {
            return ((Expr) this.instance).getDescriptionBytes();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((Expr) this.instance).setDescription(str);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((Expr) this.instance).clearDescription();
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((Expr) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        @Override // com.google.type.ExprOrBuilder
        public String getLocation() {
            return ((Expr) this.instance).getLocation();
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getLocationBytes() {
            return ((Expr) this.instance).getLocationBytes();
        }

        public Builder setLocation(String str) {
            copyOnWrite();
            ((Expr) this.instance).setLocation(str);
            return this;
        }

        public Builder clearLocation() {
            copyOnWrite();
            ((Expr) this.instance).clearLocation();
            return this;
        }

        public Builder setLocationBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((Expr) this.instance).setLocationBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.type.Expr$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C79991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f949xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f949xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f949xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f949xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f949xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C79991 c79991 = null;
        switch (C79991.f949xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Expr();
            case 2:
                return new Builder(c79991);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Expr> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Expr.class) {
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
        Expr expr = new Expr();
        DEFAULT_INSTANCE = expr;
        GeneratedMessageLite.registerDefaultInstance(Expr.class, expr);
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Expr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
