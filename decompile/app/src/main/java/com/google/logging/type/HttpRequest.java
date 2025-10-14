package com.google.logging.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class HttpRequest extends GeneratedMessageLite<HttpRequest, Builder> implements HttpRequestOrBuilder {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser<HttpRequest> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private long requestSize_;
    private long responseSize_;
    private int status_;
    private String requestMethod_ = "";
    private String requestUrl_ = "";
    private String userAgent_ = "";
    private String remoteIp_ = "";
    private String serverIp_ = "";
    private String referer_ = "";
    private String protocol_ = "";

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getRequestMethod() {
        return this.requestMethod_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRequestMethodBytes() {
        return ByteString.copyFromUtf8(this.requestMethod_);
    }

    public final void setRequestMethod(String str) {
        str.getClass();
        this.requestMethod_ = str;
    }

    public final void clearRequestMethod() {
        this.requestMethod_ = getDefaultInstance().getRequestMethod();
    }

    public final void setRequestMethodBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestMethod_ = byteString.toStringUtf8();
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getRequestUrl() {
        return this.requestUrl_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRequestUrlBytes() {
        return ByteString.copyFromUtf8(this.requestUrl_);
    }

    public final void setRequestUrl(String str) {
        str.getClass();
        this.requestUrl_ = str;
    }

    public final void clearRequestUrl() {
        this.requestUrl_ = getDefaultInstance().getRequestUrl();
    }

    public final void setRequestUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public long getRequestSize() {
        return this.requestSize_;
    }

    public final void setRequestSize(long j) {
        this.requestSize_ = j;
    }

    public final void clearRequestSize() {
        this.requestSize_ = 0L;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public final void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public long getResponseSize() {
        return this.responseSize_;
    }

    public final void setResponseSize(long j) {
        this.responseSize_ = j;
    }

    public final void clearResponseSize() {
        this.responseSize_ = 0L;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    public final void setUserAgent(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    public final void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public final void setUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userAgent_ = byteString.toStringUtf8();
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getRemoteIp() {
        return this.remoteIp_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRemoteIpBytes() {
        return ByteString.copyFromUtf8(this.remoteIp_);
    }

    public final void setRemoteIp(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    public final void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    public final void setRemoteIpBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.remoteIp_ = byteString.toStringUtf8();
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getServerIp() {
        return this.serverIp_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getServerIpBytes() {
        return ByteString.copyFromUtf8(this.serverIp_);
    }

    public final void setServerIp(String str) {
        str.getClass();
        this.serverIp_ = str;
    }

    public final void clearServerIp() {
        this.serverIp_ = getDefaultInstance().getServerIp();
    }

    public final void setServerIpBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.serverIp_ = byteString.toStringUtf8();
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getReferer() {
        return this.referer_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRefererBytes() {
        return ByteString.copyFromUtf8(this.referer_);
    }

    public final void setReferer(String str) {
        str.getClass();
        this.referer_ = str;
    }

    public final void clearReferer() {
        this.referer_ = getDefaultInstance().getReferer();
    }

    public final void setRefererBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.referer_ = byteString.toStringUtf8();
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean hasLatency() {
        return this.latency_ != null;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public Duration getLatency() {
        Duration duration = this.latency_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public final void setLatency(Duration duration) {
        duration.getClass();
        this.latency_ = duration;
    }

    public final void mergeLatency(Duration duration) {
        duration.getClass();
        Duration duration2 = this.latency_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.latency_ = Duration.newBuilder(this.latency_).mergeFrom((Duration.Builder) duration).buildPartial();
        } else {
            this.latency_ = duration;
        }
    }

    public final void clearLatency() {
        this.latency_ = null;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    public final void setCacheLookup(boolean z) {
        this.cacheLookup_ = z;
    }

    public final void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    public final void setCacheHit(boolean z) {
        this.cacheHit_ = z;
    }

    public final void clearCacheHit() {
        this.cacheHit_ = false;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    public final void setCacheValidatedWithOriginServer(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    public final void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    public final void setCacheFillBytes(long j) {
        this.cacheFillBytes_ = j;
    }

    public final void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0L;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getProtocol() {
        return this.protocol_;
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.protocol_ = byteString.toStringUtf8();
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HttpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HttpRequest httpRequest) {
        return DEFAULT_INSTANCE.createBuilder(httpRequest);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpRequest, Builder> implements HttpRequestOrBuilder {
        public /* synthetic */ Builder(C78911 c78911) {
            this();
        }

        public Builder() {
            super(HttpRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getRequestMethod() {
            return ((HttpRequest) this.instance).getRequestMethod();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRequestMethodBytes() {
            return ((HttpRequest) this.instance).getRequestMethodBytes();
        }

        public Builder setRequestMethod(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestMethod(str);
            return this;
        }

        public Builder clearRequestMethod() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRequestMethod();
            return this;
        }

        public Builder setRequestMethodBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestMethodBytes(byteString);
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getRequestUrl() {
            return ((HttpRequest) this.instance).getRequestUrl();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRequestUrlBytes() {
            return ((HttpRequest) this.instance).getRequestUrlBytes();
        }

        public Builder setRequestUrl(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestUrl(str);
            return this;
        }

        public Builder clearRequestUrl() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRequestUrl();
            return this;
        }

        public Builder setRequestUrlBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestUrlBytes(byteString);
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public long getRequestSize() {
            return ((HttpRequest) this.instance).getRequestSize();
        }

        public Builder setRequestSize(long j) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestSize(j);
            return this;
        }

        public Builder clearRequestSize() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRequestSize();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public int getStatus() {
            return ((HttpRequest) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((HttpRequest) this.instance).setStatus(i);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearStatus();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public long getResponseSize() {
            return ((HttpRequest) this.instance).getResponseSize();
        }

        public Builder setResponseSize(long j) {
            copyOnWrite();
            ((HttpRequest) this.instance).setResponseSize(j);
            return this;
        }

        public Builder clearResponseSize() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearResponseSize();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getUserAgent() {
            return ((HttpRequest) this.instance).getUserAgent();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getUserAgentBytes() {
            return ((HttpRequest) this.instance).getUserAgentBytes();
        }

        public Builder setUserAgent(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setUserAgent(str);
            return this;
        }

        public Builder clearUserAgent() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearUserAgent();
            return this;
        }

        public Builder setUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setUserAgentBytes(byteString);
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getRemoteIp() {
            return ((HttpRequest) this.instance).getRemoteIp();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRemoteIpBytes() {
            return ((HttpRequest) this.instance).getRemoteIpBytes();
        }

        public Builder setRemoteIp(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRemoteIp(str);
            return this;
        }

        public Builder clearRemoteIp() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRemoteIp();
            return this;
        }

        public Builder setRemoteIpBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setRemoteIpBytes(byteString);
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getServerIp() {
            return ((HttpRequest) this.instance).getServerIp();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getServerIpBytes() {
            return ((HttpRequest) this.instance).getServerIpBytes();
        }

        public Builder setServerIp(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setServerIp(str);
            return this;
        }

        public Builder clearServerIp() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearServerIp();
            return this;
        }

        public Builder setServerIpBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setServerIpBytes(byteString);
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getReferer() {
            return ((HttpRequest) this.instance).getReferer();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRefererBytes() {
            return ((HttpRequest) this.instance).getRefererBytes();
        }

        public Builder setReferer(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setReferer(str);
            return this;
        }

        public Builder clearReferer() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearReferer();
            return this;
        }

        public Builder setRefererBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setRefererBytes(byteString);
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean hasLatency() {
            return ((HttpRequest) this.instance).hasLatency();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public Duration getLatency() {
            return ((HttpRequest) this.instance).getLatency();
        }

        public Builder setLatency(Duration duration) {
            copyOnWrite();
            ((HttpRequest) this.instance).setLatency(duration);
            return this;
        }

        public Builder setLatency(Duration.Builder builder) {
            copyOnWrite();
            ((HttpRequest) this.instance).setLatency(builder.build());
            return this;
        }

        public Builder mergeLatency(Duration duration) {
            copyOnWrite();
            ((HttpRequest) this.instance).mergeLatency(duration);
            return this;
        }

        public Builder clearLatency() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearLatency();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean getCacheLookup() {
            return ((HttpRequest) this.instance).getCacheLookup();
        }

        public Builder setCacheLookup(boolean z) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheLookup(z);
            return this;
        }

        public Builder clearCacheLookup() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheLookup();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean getCacheHit() {
            return ((HttpRequest) this.instance).getCacheHit();
        }

        public Builder setCacheHit(boolean z) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheHit(z);
            return this;
        }

        public Builder clearCacheHit() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheHit();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean getCacheValidatedWithOriginServer() {
            return ((HttpRequest) this.instance).getCacheValidatedWithOriginServer();
        }

        public Builder setCacheValidatedWithOriginServer(boolean z) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheValidatedWithOriginServer(z);
            return this;
        }

        public Builder clearCacheValidatedWithOriginServer() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheValidatedWithOriginServer();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public long getCacheFillBytes() {
            return ((HttpRequest) this.instance).getCacheFillBytes();
        }

        public Builder setCacheFillBytes(long j) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheFillBytes(j);
            return this;
        }

        public Builder clearCacheFillBytes() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheFillBytes();
            return this;
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getProtocol() {
            return ((HttpRequest) this.instance).getProtocol();
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getProtocolBytes() {
            return ((HttpRequest) this.instance).getProtocolBytes();
        }

        public Builder setProtocol(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setProtocol(str);
            return this;
        }

        public Builder clearProtocol() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearProtocol();
            return this;
        }

        public Builder setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((HttpRequest) this.instance).setProtocolBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.logging.type.HttpRequest$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C78911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f895xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f895xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f895xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f895xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f895xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f895xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f895xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f895xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C78911 c78911 = null;
        switch (C78911.f895xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HttpRequest();
            case 2:
                return new Builder(c78911);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000e\t\u000fȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HttpRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HttpRequest.class) {
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
        HttpRequest httpRequest = new HttpRequest();
        DEFAULT_INSTANCE = httpRequest;
        GeneratedMessageLite.registerDefaultInstance(HttpRequest.class, httpRequest);
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HttpRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
