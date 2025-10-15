package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthenticationRule;
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
public final class Authentication extends GeneratedMessageLite<Authentication, Builder> implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile Parser<Authentication> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal.ProtobufList<AuthenticationRule> rules_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<AuthProvider> providers_ = GeneratedMessageLite.emptyProtobufList();

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public List<? extends AuthenticationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthenticationRule getRules(int i) {
        return this.rules_.get(i);
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public final void ensureRulesIsMutable() {
        Internal.ProtobufList<AuthenticationRule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setRules(int i, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, authenticationRule);
    }

    public final void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    public final void addRules(int i, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, authenticationRule);
    }

    public final void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    public final void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public List<? extends AuthProviderOrBuilder> getProvidersOrBuilderList() {
        return this.providers_;
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getProvidersCount() {
        return this.providers_.size();
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthProvider getProviders(int i) {
        return this.providers_.get(i);
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int i) {
        return this.providers_.get(i);
    }

    public final void ensureProvidersIsMutable() {
        Internal.ProtobufList<AuthProvider> protobufList = this.providers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.providers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setProviders(int i, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.set(i, authProvider);
    }

    public final void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    public final void addProviders(int i, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(i, authProvider);
    }

    public final void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        ensureProvidersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.providers_);
    }

    public final void clearProviders() {
        this.providers_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeProviders(int i) {
        ensureProvidersIsMutable();
        this.providers_.remove(i);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Authentication parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Authentication parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Authentication parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Authentication authentication) {
        return DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Authentication, Builder> implements AuthenticationOrBuilder {
        public /* synthetic */ Builder(C70941 c70941) {
            this();
        }

        public Builder() {
            super(Authentication.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthenticationRule> getRulesList() {
            return Collections.unmodifiableList(((Authentication) this.instance).getRulesList());
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getRulesCount() {
            return ((Authentication) this.instance).getRulesCount();
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthenticationRule getRules(int i) {
            return ((Authentication) this.instance).getRules(i);
        }

        public Builder setRules(int i, AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).setRules(i, authenticationRule);
            return this;
        }

        public Builder setRules(int i, AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).setRules(i, builder.build());
            return this;
        }

        public Builder addRules(AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(authenticationRule);
            return this;
        }

        public Builder addRules(int i, AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(i, authenticationRule);
            return this;
        }

        public Builder addRules(AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(builder.build());
            return this;
        }

        public Builder addRules(int i, AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(i, builder.build());
            return this;
        }

        public Builder addAllRules(Iterable<? extends AuthenticationRule> iterable) {
            copyOnWrite();
            ((Authentication) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Authentication) this.instance).clearRules();
            return this;
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Authentication) this.instance).removeRules(i);
            return this;
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthProvider> getProvidersList() {
            return Collections.unmodifiableList(((Authentication) this.instance).getProvidersList());
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getProvidersCount() {
            return ((Authentication) this.instance).getProvidersCount();
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthProvider getProviders(int i) {
            return ((Authentication) this.instance).getProviders(i);
        }

        public Builder setProviders(int i, AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).setProviders(i, authProvider);
            return this;
        }

        public Builder setProviders(int i, AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).setProviders(i, builder.build());
            return this;
        }

        public Builder addProviders(AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(authProvider);
            return this;
        }

        public Builder addProviders(int i, AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(i, authProvider);
            return this;
        }

        public Builder addProviders(AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(builder.build());
            return this;
        }

        public Builder addProviders(int i, AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(i, builder.build());
            return this;
        }

        public Builder addAllProviders(Iterable<? extends AuthProvider> iterable) {
            copyOnWrite();
            ((Authentication) this.instance).addAllProviders(iterable);
            return this;
        }

        public Builder clearProviders() {
            copyOnWrite();
            ((Authentication) this.instance).clearProviders();
            return this;
        }

        public Builder removeProviders(int i) {
            copyOnWrite();
            ((Authentication) this.instance).removeProviders(i);
            return this;
        }
    }

    /* renamed from: com.google.api.Authentication$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C70941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f728xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f728xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f728xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f728xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f728xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f728xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f728xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f728xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C70941 c70941 = null;
        switch (C70941.f728xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Authentication();
            case 2:
                return new Builder(c70941);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Authentication> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Authentication.class) {
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
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        GeneratedMessageLite.registerDefaultInstance(Authentication.class, authentication);
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Authentication> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
