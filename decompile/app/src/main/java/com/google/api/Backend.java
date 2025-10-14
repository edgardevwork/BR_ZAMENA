package com.google.api;

import com.google.api.BackendRule;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class Backend extends GeneratedMessageLite<Backend, Builder> implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE;
    private static volatile Parser<Backend> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<BackendRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    @Override // com.google.api.BackendOrBuilder
    public List<BackendRule> getRulesList() {
        return this.rules_;
    }

    public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // com.google.api.BackendOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.BackendOrBuilder
    public BackendRule getRules(int i) {
        return this.rules_.get(i);
    }

    public BackendRuleOrBuilder getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<BackendRule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setRules(int i, BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, backendRule);
    }

    public final void addRules(BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(backendRule);
    }

    public final void addRules(int i, BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, backendRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends BackendRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Backend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Backend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Backend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Backend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Backend parseFrom(InputStream inputStream) throws IOException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Backend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Backend backend) {
        return DEFAULT_INSTANCE.createBuilder(backend);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Backend, Builder> implements BackendOrBuilder {
        public /* synthetic */ Builder(C70961 c70961) {
            this();
        }

        public Builder() {
            super(Backend.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.BackendOrBuilder
        public List<BackendRule> getRulesList() {
            return Collections.unmodifiableList(((Backend) this.instance).getRulesList());
        }

        @Override // com.google.api.BackendOrBuilder
        public int getRulesCount() {
            return ((Backend) this.instance).getRulesCount();
        }

        @Override // com.google.api.BackendOrBuilder
        public BackendRule getRules(int i) {
            return ((Backend) this.instance).getRules(i);
        }

        public Builder setRules(int i, BackendRule backendRule) {
            copyOnWrite();
            ((Backend) this.instance).setRules(i, backendRule);
            return this;
        }

        public Builder setRules(int i, BackendRule.Builder builder) {
            copyOnWrite();
            ((Backend) this.instance).setRules(i, builder.build());
            return this;
        }

        public Builder addRules(BackendRule backendRule) {
            copyOnWrite();
            ((Backend) this.instance).addRules(backendRule);
            return this;
        }

        public Builder addRules(int i, BackendRule backendRule) {
            copyOnWrite();
            ((Backend) this.instance).addRules(i, backendRule);
            return this;
        }

        public Builder addRules(BackendRule.Builder builder) {
            copyOnWrite();
            ((Backend) this.instance).addRules(builder.build());
            return this;
        }

        public Builder addRules(int i, BackendRule.Builder builder) {
            copyOnWrite();
            ((Backend) this.instance).addRules(i, builder.build());
            return this;
        }

        public Builder addAllRules(Iterable<? extends BackendRule> iterable) {
            copyOnWrite();
            ((Backend) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Backend) this.instance).clearRules();
            return this;
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Backend) this.instance).removeRules(i);
            return this;
        }
    }

    /* renamed from: com.google.api.Backend$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C70961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f730xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f730xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f730xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f730xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f730xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f730xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f730xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f730xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C70961 c70961 = null;
        switch (C70961.f730xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Backend();
            case 2:
                return new Builder(c70961);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", BackendRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Backend> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Backend.class) {
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
        Backend backend = new Backend();
        DEFAULT_INSTANCE = backend;
        GeneratedMessageLite.registerDefaultInstance(Backend.class, backend);
    }

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Backend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
