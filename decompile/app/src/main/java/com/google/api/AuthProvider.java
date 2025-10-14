package com.google.api;

import com.google.api.JwtLocation;
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
public final class AuthProvider extends GeneratedMessageLite<AuthProvider, Builder> implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser<AuthProvider> PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private Internal.ProtobufList<JwtLocation> jwtLocations_ = GeneratedMessageLite.emptyProtobufList();

    @Override // com.google.api.AuthProviderOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public final void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    public final void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    public final void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getIssuer() {
        return this.issuer_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getIssuerBytes() {
        return ByteString.copyFromUtf8(this.issuer_);
    }

    public final void setIssuer(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    public final void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    public final void setIssuerBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.issuer_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getJwksUri() {
        return this.jwksUri_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getJwksUriBytes() {
        return ByteString.copyFromUtf8(this.jwksUri_);
    }

    public final void setJwksUri(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    public final void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    public final void setJwksUriBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jwksUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAudiences() {
        return this.audiences_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    public final void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    public final void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    public final void setAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.audiences_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getAuthorizationUrlBytes() {
        return ByteString.copyFromUtf8(this.authorizationUrl_);
    }

    public final void setAuthorizationUrl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    public final void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    public final void setAuthorizationUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.authorizationUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public JwtLocation getJwtLocations(int i) {
        return this.jwtLocations_.get(i);
    }

    public JwtLocationOrBuilder getJwtLocationsOrBuilder(int i) {
        return this.jwtLocations_.get(i);
    }

    public final void ensureJwtLocationsIsMutable() {
        Internal.ProtobufList<JwtLocation> protobufList = this.jwtLocations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.jwtLocations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setJwtLocations(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i, jwtLocation);
    }

    public final void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    public final void addJwtLocations(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i, jwtLocation);
    }

    public final void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.jwtLocations_);
    }

    public final void clearJwtLocations() {
        this.jwtLocations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeJwtLocations(int i) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuthProvider authProvider) {
        return DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthProvider, Builder> implements AuthProviderOrBuilder {
        public /* synthetic */ Builder(C70921 c70921) {
            this();
        }

        public Builder() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getId() {
            return ((AuthProvider) this.instance).getId();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getIdBytes() {
            return ((AuthProvider) this.instance).getIdBytes();
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setId(str);
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearId();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((AuthProvider) this.instance).setIdBytes(byteString);
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getIssuer() {
            return ((AuthProvider) this.instance).getIssuer();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getIssuerBytes() {
            return ((AuthProvider) this.instance).getIssuerBytes();
        }

        public Builder setIssuer(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIssuer(str);
            return this;
        }

        public Builder clearIssuer() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearIssuer();
            return this;
        }

        public Builder setIssuerBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((AuthProvider) this.instance).setIssuerBytes(byteString);
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getJwksUri() {
            return ((AuthProvider) this.instance).getJwksUri();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getJwksUriBytes() {
            return ((AuthProvider) this.instance).getJwksUriBytes();
        }

        public Builder setJwksUri(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwksUri(str);
            return this;
        }

        public Builder clearJwksUri() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearJwksUri();
            return this;
        }

        public Builder setJwksUriBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwksUriBytes(byteString);
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAudiences() {
            return ((AuthProvider) this.instance).getAudiences();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getAudiencesBytes() {
            return ((AuthProvider) this.instance).getAudiencesBytes();
        }

        public Builder setAudiences(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAudiences(str);
            return this;
        }

        public Builder clearAudiences() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearAudiences();
            return this;
        }

        public Builder setAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((AuthProvider) this.instance).setAudiencesBytes(byteString);
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAuthorizationUrl() {
            return ((AuthProvider) this.instance).getAuthorizationUrl();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getAuthorizationUrlBytes() {
            return ((AuthProvider) this.instance).getAuthorizationUrlBytes();
        }

        public Builder setAuthorizationUrl(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAuthorizationUrl(str);
            return this;
        }

        public Builder clearAuthorizationUrl() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearAuthorizationUrl();
            return this;
        }

        public Builder setAuthorizationUrlBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((AuthProvider) this.instance).setAuthorizationUrlBytes(byteString);
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public List<JwtLocation> getJwtLocationsList() {
            return Collections.unmodifiableList(((AuthProvider) this.instance).getJwtLocationsList());
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public int getJwtLocationsCount() {
            return ((AuthProvider) this.instance).getJwtLocationsCount();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public JwtLocation getJwtLocations(int i) {
            return ((AuthProvider) this.instance).getJwtLocations(i);
        }

        public Builder setJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwtLocations(i, jwtLocation);
            return this;
        }

        public Builder setJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwtLocations(i, builder.build());
            return this;
        }

        public Builder addJwtLocations(JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(jwtLocation);
            return this;
        }

        public Builder addJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(i, jwtLocation);
            return this;
        }

        public Builder addJwtLocations(JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(builder.build());
            return this;
        }

        public Builder addJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(i, builder.build());
            return this;
        }

        public Builder addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
            copyOnWrite();
            ((AuthProvider) this.instance).addAllJwtLocations(iterable);
            return this;
        }

        public Builder clearJwtLocations() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearJwtLocations();
            return this;
        }

        public Builder removeJwtLocations(int i) {
            copyOnWrite();
            ((AuthProvider) this.instance).removeJwtLocations(i);
            return this;
        }
    }

    /* renamed from: com.google.api.AuthProvider$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C70921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f726xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f726xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f726xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f726xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f726xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f726xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f726xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f726xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C70921 c70921 = null;
        switch (C70921.f726xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new Builder(c70921);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuthProvider> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AuthProvider.class) {
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
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuthProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
