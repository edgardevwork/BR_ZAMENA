package com.google.rpc.context;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AttributeContext extends GeneratedMessageLite<AttributeContext, Builder> implements AttributeContextOrBuilder {
    public static final int API_FIELD_NUMBER = 6;
    private static final AttributeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile Parser<AttributeContext> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private Api api_;
    private Peer destination_;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private Response response_;
    private Peer source_;

    /* loaded from: classes6.dex */
    public interface ApiOrBuilder extends MessageLiteOrBuilder {
        String getOperation();

        ByteString getOperationBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getService();

        ByteString getServiceBytes();

        String getVersion();

        ByteString getVersionBytes();
    }

    /* loaded from: classes6.dex */
    public interface AuthOrBuilder extends MessageLiteOrBuilder {
        String getAccessLevels(int i);

        ByteString getAccessLevelsBytes(int i);

        int getAccessLevelsCount();

        List<String> getAccessLevelsList();

        String getAudiences(int i);

        ByteString getAudiencesBytes(int i);

        int getAudiencesCount();

        List<String> getAudiencesList();

        Struct getClaims();

        String getPresenter();

        ByteString getPresenterBytes();

        String getPrincipal();

        ByteString getPrincipalBytes();

        boolean hasClaims();
    }

    /* loaded from: classes6.dex */
    public interface PeerOrBuilder extends MessageLiteOrBuilder {
        boolean containsLabels(String str);

        String getIp();

        ByteString getIpBytes();

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        long getPort();

        String getPrincipal();

        ByteString getPrincipalBytes();

        String getRegionCode();

        ByteString getRegionCodeBytes();
    }

    /* loaded from: classes6.dex */
    public interface RequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsHeaders(String str);

        Auth getAuth();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        String getHost();

        ByteString getHostBytes();

        String getId();

        ByteString getIdBytes();

        String getMethod();

        ByteString getMethodBytes();

        String getPath();

        ByteString getPathBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getQuery();

        ByteString getQueryBytes();

        String getReason();

        ByteString getReasonBytes();

        String getScheme();

        ByteString getSchemeBytes();

        long getSize();

        Timestamp getTime();

        boolean hasAuth();

        boolean hasTime();
    }

    /* loaded from: classes6.dex */
    public interface ResourceOrBuilder extends MessageLiteOrBuilder {
        boolean containsLabels(String str);

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        String getName();

        ByteString getNameBytes();

        String getService();

        ByteString getServiceBytes();

        String getType();

        ByteString getTypeBytes();
    }

    /* loaded from: classes6.dex */
    public interface ResponseOrBuilder extends MessageLiteOrBuilder {
        boolean containsHeaders(String str);

        long getCode();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        long getSize();

        Timestamp getTime();

        boolean hasTime();
    }

    public static final class Peer extends GeneratedMessageLite<Peer, Builder> implements PeerOrBuilder {
        private static final Peer DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile Parser<Peer> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private long port_;
        private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
        private String ip_ = "";
        private String principal_ = "";
        private String regionCode_ = "";

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getIp() {
            return this.ip_;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getIpBytes() {
            return ByteString.copyFromUtf8(this.ip_);
        }

        public final void setIp(String str) {
            str.getClass();
            this.ip_ = str;
        }

        public final void clearIp() {
            this.ip_ = getDefaultInstance().getIp();
        }

        public final void setIpBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ip_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public long getPort() {
            return this.port_;
        }

        public final void setPort(long j) {
            this.port_ = j;
        }

        public final void clearPort() {
            this.port_ = 0L;
        }

        /* loaded from: classes8.dex */
        public static final class LabelsDefaultEntryHolder {
            public static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        private MapFieldLite<String, String> internalGetLabels() {
            return this.labels_;
        }

        private MapFieldLite<String, String> internalGetMutableLabels() {
            if (!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetLabels = internalGetLabels();
            return mapFieldLiteInternalGetLabels.containsKey(str) ? mapFieldLiteInternalGetLabels.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getLabelsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetLabels = internalGetLabels();
            if (!mapFieldLiteInternalGetLabels.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return mapFieldLiteInternalGetLabels.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getPrincipal() {
            return this.principal_;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getPrincipalBytes() {
            return ByteString.copyFromUtf8(this.principal_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipalBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.principal_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getRegionCode() {
            return this.regionCode_;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getRegionCodeBytes() {
            return ByteString.copyFromUtf8(this.regionCode_);
        }

        public final void setRegionCode(String str) {
            str.getClass();
            this.regionCode_ = str;
        }

        public final void clearRegionCode() {
            this.regionCode_ = getDefaultInstance().getRegionCode();
        }

        public final void setRegionCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.regionCode_ = byteString.toStringUtf8();
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Peer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Peer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Peer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Peer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Peer parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Peer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Peer peer) {
            return DEFAULT_INSTANCE.createBuilder(peer);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Peer, Builder> implements PeerOrBuilder {
            public /* synthetic */ Builder(C79931 c79931) {
                this();
            }

            public Builder() {
                super(Peer.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getIp() {
                return ((Peer) this.instance).getIp();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getIpBytes() {
                return ((Peer) this.instance).getIpBytes();
            }

            public Builder setIp(String str) {
                copyOnWrite();
                ((Peer) this.instance).setIp(str);
                return this;
            }

            public Builder clearIp() {
                copyOnWrite();
                ((Peer) this.instance).clearIp();
                return this;
            }

            public Builder setIpBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Peer) this.instance).setIpBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public long getPort() {
                return ((Peer) this.instance).getPort();
            }

            public Builder setPort(long j) {
                copyOnWrite();
                ((Peer) this.instance).setPort(j);
                return this;
            }

            public Builder clearPort() {
                copyOnWrite();
                ((Peer) this.instance).clearPort();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public int getLabelsCount() {
                return ((Peer) this.instance).getLabelsMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public boolean containsLabels(String str) {
                str.getClass();
                return ((Peer) this.instance).getLabelsMap().containsKey(str);
            }

            public Builder clearLabels() {
                copyOnWrite();
                ((Peer) this.instance).getMutableLabelsMap().clear();
                return this;
            }

            public Builder removeLabels(String str) {
                str.getClass();
                copyOnWrite();
                ((Peer) this.instance).getMutableLabelsMap().remove(str);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((Peer) this.instance).getLabelsMap());
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getLabelsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> labelsMap = ((Peer) this.instance).getLabelsMap();
                return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getLabelsOrThrow(String str) {
                str.getClass();
                Map<String, String> labelsMap = ((Peer) this.instance).getLabelsMap();
                if (!labelsMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return labelsMap.get(str);
            }

            public Builder putLabels(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Peer) this.instance).getMutableLabelsMap().put(str, str2);
                return this;
            }

            public Builder putAllLabels(Map<String, String> map) {
                copyOnWrite();
                ((Peer) this.instance).getMutableLabelsMap().putAll(map);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getPrincipal() {
                return ((Peer) this.instance).getPrincipal();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getPrincipalBytes() {
                return ((Peer) this.instance).getPrincipalBytes();
            }

            public Builder setPrincipal(String str) {
                copyOnWrite();
                ((Peer) this.instance).setPrincipal(str);
                return this;
            }

            public Builder clearPrincipal() {
                copyOnWrite();
                ((Peer) this.instance).clearPrincipal();
                return this;
            }

            public Builder setPrincipalBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Peer) this.instance).setPrincipalBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getRegionCode() {
                return ((Peer) this.instance).getRegionCode();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getRegionCodeBytes() {
                return ((Peer) this.instance).getRegionCodeBytes();
            }

            public Builder setRegionCode(String str) {
                copyOnWrite();
                ((Peer) this.instance).setRegionCode(str);
                return this;
            }

            public Builder clearRegionCode() {
                copyOnWrite();
                ((Peer) this.instance).clearRegionCode();
                return this;
            }

            public Builder setRegionCodeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Peer) this.instance).setRegionCodeBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C79931 c79931 = null;
            switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Peer();
                case 2:
                    return new Builder(c79931);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", LabelsDefaultEntryHolder.defaultEntry, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Peer> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Peer.class) {
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
            Peer peer = new Peer();
            DEFAULT_INSTANCE = peer;
            GeneratedMessageLite.registerDefaultInstance(Peer.class, peer);
        }

        public static Peer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Peer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.rpc.context.AttributeContext$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C79931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f945xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f945xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f945xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f945xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f945xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Api extends GeneratedMessageLite<Api, Builder> implements ApiOrBuilder {
        private static final Api DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile Parser<Api> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String service_ = "";
        private String operation_ = "";
        private String protocol_ = "";
        private String version_ = "";

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getService() {
            return this.service_;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getServiceBytes() {
            return ByteString.copyFromUtf8(this.service_);
        }

        public final void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        public final void setServiceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.service_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getOperation() {
            return this.operation_;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getOperationBytes() {
            return ByteString.copyFromUtf8(this.operation_);
        }

        public final void setOperation(String str) {
            str.getClass();
            this.operation_ = str;
        }

        public final void clearOperation() {
            this.operation_ = getDefaultInstance().getOperation();
        }

        public final void setOperationBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.operation_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getProtocol() {
            return this.protocol_;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
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

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Api api) {
            return DEFAULT_INSTANCE.createBuilder(api);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
            public /* synthetic */ Builder(C79931 c79931) {
                this();
            }

            public Builder() {
                super(Api.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getService() {
                return ((Api) this.instance).getService();
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getServiceBytes() {
                return ((Api) this.instance).getServiceBytes();
            }

            public Builder setService(String str) {
                copyOnWrite();
                ((Api) this.instance).setService(str);
                return this;
            }

            public Builder clearService() {
                copyOnWrite();
                ((Api) this.instance).clearService();
                return this;
            }

            public Builder setServiceBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Api) this.instance).setServiceBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getOperation() {
                return ((Api) this.instance).getOperation();
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getOperationBytes() {
                return ((Api) this.instance).getOperationBytes();
            }

            public Builder setOperation(String str) {
                copyOnWrite();
                ((Api) this.instance).setOperation(str);
                return this;
            }

            public Builder clearOperation() {
                copyOnWrite();
                ((Api) this.instance).clearOperation();
                return this;
            }

            public Builder setOperationBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Api) this.instance).setOperationBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getProtocol() {
                return ((Api) this.instance).getProtocol();
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getProtocolBytes() {
                return ((Api) this.instance).getProtocolBytes();
            }

            public Builder setProtocol(String str) {
                copyOnWrite();
                ((Api) this.instance).setProtocol(str);
                return this;
            }

            public Builder clearProtocol() {
                copyOnWrite();
                ((Api) this.instance).clearProtocol();
                return this;
            }

            public Builder setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Api) this.instance).setProtocolBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getVersion() {
                return ((Api) this.instance).getVersion();
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getVersionBytes() {
                return ((Api) this.instance).getVersionBytes();
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((Api) this.instance).setVersion(str);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Api) this.instance).clearVersion();
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Api) this.instance).setVersionBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C79931 c79931 = null;
            switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Api();
                case 2:
                    return new Builder(c79931);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Api> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Api.class) {
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
            Api api = new Api();
            DEFAULT_INSTANCE = api;
            GeneratedMessageLite.registerDefaultInstance(Api.class, api);
        }

        public static Api getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Api> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Auth extends GeneratedMessageLite<Auth, Builder> implements AuthOrBuilder {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final Auth DEFAULT_INSTANCE;
        private static volatile Parser<Auth> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private Struct claims_;
        private String principal_ = "";
        private Internal.ProtobufList<String> audiences_ = GeneratedMessageLite.emptyProtobufList();
        private String presenter_ = "";
        private Internal.ProtobufList<String> accessLevels_ = GeneratedMessageLite.emptyProtobufList();

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getPrincipal() {
            return this.principal_;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getPrincipalBytes() {
            return ByteString.copyFromUtf8(this.principal_);
        }

        public final void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        public final void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        public final void setPrincipalBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.principal_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public List<String> getAudiencesList() {
            return this.audiences_;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public int getAudiencesCount() {
            return this.audiences_.size();
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getAudiences(int i) {
            return this.audiences_.get(i);
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getAudiencesBytes(int i) {
            return ByteString.copyFromUtf8(this.audiences_.get(i));
        }

        public final void ensureAudiencesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.audiences_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.audiences_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public final void setAudiences(int i, String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.set(i, str);
        }

        public final void addAudiences(String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.add(str);
        }

        public final void addAllAudiences(Iterable<String> iterable) {
            ensureAudiencesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.audiences_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudiences() {
            this.audiences_ = GeneratedMessageLite.emptyProtobufList();
        }

        public final void addAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAudiencesIsMutable();
            this.audiences_.add(byteString.toStringUtf8());
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getPresenter() {
            return this.presenter_;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getPresenterBytes() {
            return ByteString.copyFromUtf8(this.presenter_);
        }

        public final void setPresenter(String str) {
            str.getClass();
            this.presenter_ = str;
        }

        public final void clearPresenter() {
            this.presenter_ = getDefaultInstance().getPresenter();
        }

        public final void setPresenterBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.presenter_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public boolean hasClaims() {
            return this.claims_ != null;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public Struct getClaims() {
            Struct struct = this.claims_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public final void setClaims(Struct struct) {
            struct.getClass();
            this.claims_ = struct;
        }

        public final void mergeClaims(Struct struct) {
            struct.getClass();
            Struct struct2 = this.claims_;
            if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
                this.claims_ = Struct.newBuilder(this.claims_).mergeFrom((Struct.Builder) struct).buildPartial();
            } else {
                this.claims_ = struct;
            }
        }

        public final void clearClaims() {
            this.claims_ = null;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public List<String> getAccessLevelsList() {
            return this.accessLevels_;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getAccessLevels(int i) {
            return this.accessLevels_.get(i);
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getAccessLevelsBytes(int i) {
            return ByteString.copyFromUtf8(this.accessLevels_.get(i));
        }

        public final void ensureAccessLevelsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.accessLevels_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.accessLevels_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public final void setAccessLevels(int i, String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.set(i, str);
        }

        public final void addAccessLevels(String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(str);
        }

        public final void addAllAccessLevels(Iterable<String> iterable) {
            ensureAccessLevelsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.accessLevels_);
        }

        public final void clearAccessLevels() {
            this.accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        }

        public final void addAccessLevelsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(byteString.toStringUtf8());
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Auth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Auth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Auth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Auth parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Auth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Auth auth) {
            return DEFAULT_INSTANCE.createBuilder(auth);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Auth, Builder> implements AuthOrBuilder {
            public /* synthetic */ Builder(C79931 c79931) {
                this();
            }

            public Builder() {
                super(Auth.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getPrincipal() {
                return ((Auth) this.instance).getPrincipal();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getPrincipalBytes() {
                return ((Auth) this.instance).getPrincipalBytes();
            }

            public Builder setPrincipal(String str) {
                copyOnWrite();
                ((Auth) this.instance).setPrincipal(str);
                return this;
            }

            public Builder clearPrincipal() {
                copyOnWrite();
                ((Auth) this.instance).clearPrincipal();
                return this;
            }

            public Builder setPrincipalBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Auth) this.instance).setPrincipalBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public List<String> getAudiencesList() {
                return Collections.unmodifiableList(((Auth) this.instance).getAudiencesList());
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public int getAudiencesCount() {
                return ((Auth) this.instance).getAudiencesCount();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getAudiences(int i) {
                return ((Auth) this.instance).getAudiences(i);
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getAudiencesBytes(int i) {
                return ((Auth) this.instance).getAudiencesBytes(i);
            }

            public Builder setAudiences(int i, String str) {
                copyOnWrite();
                ((Auth) this.instance).setAudiences(i, str);
                return this;
            }

            public Builder addAudiences(String str) {
                copyOnWrite();
                ((Auth) this.instance).addAudiences(str);
                return this;
            }

            public Builder addAllAudiences(Iterable<String> iterable) {
                copyOnWrite();
                ((Auth) this.instance).addAllAudiences(iterable);
                return this;
            }

            public Builder clearAudiences() {
                copyOnWrite();
                ((Auth) this.instance).clearAudiences();
                return this;
            }

            public Builder addAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Auth) this.instance).addAudiencesBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getPresenter() {
                return ((Auth) this.instance).getPresenter();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getPresenterBytes() {
                return ((Auth) this.instance).getPresenterBytes();
            }

            public Builder setPresenter(String str) {
                copyOnWrite();
                ((Auth) this.instance).setPresenter(str);
                return this;
            }

            public Builder clearPresenter() {
                copyOnWrite();
                ((Auth) this.instance).clearPresenter();
                return this;
            }

            public Builder setPresenterBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Auth) this.instance).setPresenterBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public boolean hasClaims() {
                return ((Auth) this.instance).hasClaims();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public Struct getClaims() {
                return ((Auth) this.instance).getClaims();
            }

            public Builder setClaims(Struct struct) {
                copyOnWrite();
                ((Auth) this.instance).setClaims(struct);
                return this;
            }

            public Builder setClaims(Struct.Builder builder) {
                copyOnWrite();
                ((Auth) this.instance).setClaims(builder.build());
                return this;
            }

            public Builder mergeClaims(Struct struct) {
                copyOnWrite();
                ((Auth) this.instance).mergeClaims(struct);
                return this;
            }

            public Builder clearClaims() {
                copyOnWrite();
                ((Auth) this.instance).clearClaims();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public List<String> getAccessLevelsList() {
                return Collections.unmodifiableList(((Auth) this.instance).getAccessLevelsList());
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public int getAccessLevelsCount() {
                return ((Auth) this.instance).getAccessLevelsCount();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getAccessLevels(int i) {
                return ((Auth) this.instance).getAccessLevels(i);
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getAccessLevelsBytes(int i) {
                return ((Auth) this.instance).getAccessLevelsBytes(i);
            }

            public Builder setAccessLevels(int i, String str) {
                copyOnWrite();
                ((Auth) this.instance).setAccessLevels(i, str);
                return this;
            }

            public Builder addAccessLevels(String str) {
                copyOnWrite();
                ((Auth) this.instance).addAccessLevels(str);
                return this;
            }

            public Builder addAllAccessLevels(Iterable<String> iterable) {
                copyOnWrite();
                ((Auth) this.instance).addAllAccessLevels(iterable);
                return this;
            }

            public Builder clearAccessLevels() {
                copyOnWrite();
                ((Auth) this.instance).clearAccessLevels();
                return this;
            }

            public Builder addAccessLevelsBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Auth) this.instance).addAccessLevelsBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C79931 c79931 = null;
            switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Auth();
                case 2:
                    return new Builder(c79931);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\t\u0005Ț", new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Auth> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Auth.class) {
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
            Auth auth = new Auth();
            DEFAULT_INSTANCE = auth;
            GeneratedMessageLite.registerDefaultInstance(Auth.class, auth);
        }

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Auth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Request extends GeneratedMessageLite<Request, Builder> implements RequestOrBuilder {
        public static final int AUTH_FIELD_NUMBER = 13;
        private static final Request DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile Parser<Request> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private Auth auth_;
        private long size_;
        private Timestamp time_;
        private MapFieldLite<String, String> headers_ = MapFieldLite.emptyMapField();
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String host_ = "";
        private String scheme_ = "";
        private String query_ = "";
        private String protocol_ = "";
        private String reason_ = "";

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getMethod() {
            return this.method_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getMethodBytes() {
            return ByteString.copyFromUtf8(this.method_);
        }

        public final void setMethod(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        public final void setMethodBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.method_ = byteString.toStringUtf8();
        }

        /* loaded from: classes8.dex */
        public static final class HeadersDefaultEntryHolder {
            public static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        public final MapFieldLite<String, String> internalGetHeaders() {
            return this.headers_;
        }

        public final MapFieldLite<String, String> internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetHeaders = internalGetHeaders();
            return mapFieldLiteInternalGetHeaders.containsKey(str) ? mapFieldLiteInternalGetHeaders.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHeadersOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetHeaders = internalGetHeaders();
            if (!mapFieldLiteInternalGetHeaders.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return mapFieldLiteInternalGetHeaders.get(str);
        }

        public final Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getPath() {
            return this.path_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getPathBytes() {
            return ByteString.copyFromUtf8(this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPathBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.path_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHost() {
            return this.host_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getHostBytes() {
            return ByteString.copyFromUtf8(this.host_);
        }

        public final void setHost(String str) {
            str.getClass();
            this.host_ = str;
        }

        public final void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        public final void setHostBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.host_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getScheme() {
            return this.scheme_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getSchemeBytes() {
            return ByteString.copyFromUtf8(this.scheme_);
        }

        public final void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        public final void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        public final void setSchemeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.scheme_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getQuery() {
            return this.query_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getQueryBytes() {
            return ByteString.copyFromUtf8(this.query_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuery(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.query_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean hasTime() {
            return this.time_ != null;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public final void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.time_ = Timestamp.newBuilder(this.time_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.time_ = timestamp;
            }
        }

        public final void clearTime() {
            this.time_ = null;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public long getSize() {
            return this.size_;
        }

        public final void setSize(long j) {
            this.size_ = j;
        }

        public final void clearSize() {
            this.size_ = 0L;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getProtocol() {
            return this.protocol_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
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

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean hasAuth() {
            return this.auth_ != null;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Auth getAuth() {
            Auth auth = this.auth_;
            return auth == null ? Auth.getDefaultInstance() : auth;
        }

        public final void setAuth(Auth auth) {
            auth.getClass();
            this.auth_ = auth;
        }

        public final void mergeAuth(Auth auth) {
            auth.getClass();
            Auth auth2 = this.auth_;
            if (auth2 != null && auth2 != Auth.getDefaultInstance()) {
                this.auth_ = Auth.newBuilder(this.auth_).mergeFrom((Auth.Builder) auth).buildPartial();
            } else {
                this.auth_ = auth;
            }
        }

        public final void clearAuth() {
            this.auth_ = null;
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Request request) {
            return DEFAULT_INSTANCE.createBuilder(request);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Request, Builder> implements RequestOrBuilder {
            public /* synthetic */ Builder(C79931 c79931) {
                this();
            }

            public Builder() {
                super(Request.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getId() {
                return ((Request) this.instance).getId();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getIdBytes() {
                return ((Request) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Request) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Request) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getMethod() {
                return ((Request) this.instance).getMethod();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getMethodBytes() {
                return ((Request) this.instance).getMethodBytes();
            }

            public Builder setMethod(String str) {
                copyOnWrite();
                ((Request) this.instance).setMethod(str);
                return this;
            }

            public Builder clearMethod() {
                copyOnWrite();
                ((Request) this.instance).clearMethod();
                return this;
            }

            public Builder setMethodBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setMethodBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public int getHeadersCount() {
                return ((Request) this.instance).getHeadersMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean containsHeaders(String str) {
                str.getClass();
                return ((Request) this.instance).getHeadersMap().containsKey(str);
            }

            public Builder clearHeaders() {
                copyOnWrite();
                ((Request) this.instance).getMutableHeadersMap().clear();
                return this;
            }

            public Builder removeHeaders(String str) {
                str.getClass();
                copyOnWrite();
                ((Request) this.instance).getMutableHeadersMap().remove(str);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((Request) this.instance).getHeadersMap());
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> headersMap = ((Request) this.instance).getHeadersMap();
                return headersMap.containsKey(str) ? headersMap.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHeadersOrThrow(String str) {
                str.getClass();
                Map<String, String> headersMap = ((Request) this.instance).getHeadersMap();
                if (!headersMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return headersMap.get(str);
            }

            public Builder putHeaders(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Request) this.instance).getMutableHeadersMap().put(str, str2);
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                copyOnWrite();
                ((Request) this.instance).getMutableHeadersMap().putAll(map);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getPath() {
                return ((Request) this.instance).getPath();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getPathBytes() {
                return ((Request) this.instance).getPathBytes();
            }

            public Builder setPath(String str) {
                copyOnWrite();
                ((Request) this.instance).setPath(str);
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((Request) this.instance).clearPath();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setPathBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHost() {
                return ((Request) this.instance).getHost();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getHostBytes() {
                return ((Request) this.instance).getHostBytes();
            }

            public Builder setHost(String str) {
                copyOnWrite();
                ((Request) this.instance).setHost(str);
                return this;
            }

            public Builder clearHost() {
                copyOnWrite();
                ((Request) this.instance).clearHost();
                return this;
            }

            public Builder setHostBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setHostBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getScheme() {
                return ((Request) this.instance).getScheme();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getSchemeBytes() {
                return ((Request) this.instance).getSchemeBytes();
            }

            public Builder setScheme(String str) {
                copyOnWrite();
                ((Request) this.instance).setScheme(str);
                return this;
            }

            public Builder clearScheme() {
                copyOnWrite();
                ((Request) this.instance).clearScheme();
                return this;
            }

            public Builder setSchemeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setSchemeBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getQuery() {
                return ((Request) this.instance).getQuery();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getQueryBytes() {
                return ((Request) this.instance).getQueryBytes();
            }

            public Builder setQuery(String str) {
                copyOnWrite();
                ((Request) this.instance).setQuery(str);
                return this;
            }

            public Builder clearQuery() {
                copyOnWrite();
                ((Request) this.instance).clearQuery();
                return this;
            }

            public Builder setQueryBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setQueryBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean hasTime() {
                return ((Request) this.instance).hasTime();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Timestamp getTime() {
                return ((Request) this.instance).getTime();
            }

            public Builder setTime(Timestamp timestamp) {
                copyOnWrite();
                ((Request) this.instance).setTime(timestamp);
                return this;
            }

            public Builder setTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((Request) this.instance).setTime(builder.build());
                return this;
            }

            public Builder mergeTime(Timestamp timestamp) {
                copyOnWrite();
                ((Request) this.instance).mergeTime(timestamp);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((Request) this.instance).clearTime();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public long getSize() {
                return ((Request) this.instance).getSize();
            }

            public Builder setSize(long j) {
                copyOnWrite();
                ((Request) this.instance).setSize(j);
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((Request) this.instance).clearSize();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getProtocol() {
                return ((Request) this.instance).getProtocol();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getProtocolBytes() {
                return ((Request) this.instance).getProtocolBytes();
            }

            public Builder setProtocol(String str) {
                copyOnWrite();
                ((Request) this.instance).setProtocol(str);
                return this;
            }

            public Builder clearProtocol() {
                copyOnWrite();
                ((Request) this.instance).clearProtocol();
                return this;
            }

            public Builder setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setProtocolBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getReason() {
                return ((Request) this.instance).getReason();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getReasonBytes() {
                return ((Request) this.instance).getReasonBytes();
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((Request) this.instance).setReason(str);
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((Request) this.instance).clearReason();
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Request) this.instance).setReasonBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean hasAuth() {
                return ((Request) this.instance).hasAuth();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Auth getAuth() {
                return ((Request) this.instance).getAuth();
            }

            public Builder setAuth(Auth auth) {
                copyOnWrite();
                ((Request) this.instance).setAuth(auth);
                return this;
            }

            public Builder setAuth(Auth.Builder builder) {
                copyOnWrite();
                ((Request) this.instance).setAuth(builder.build());
                return this;
            }

            public Builder mergeAuth(Auth auth) {
                copyOnWrite();
                ((Request) this.instance).mergeAuth(auth);
                return this;
            }

            public Builder clearAuth() {
                copyOnWrite();
                ((Request) this.instance).clearAuth();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C79931 c79931 = null;
            switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Request();
                case 2:
                    return new Builder(c79931);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\t\t\n\u0002\u000bȈ\fȈ\r\t", new Object[]{"id_", "method_", "headers_", HeadersDefaultEntryHolder.defaultEntry, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Request> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Request.class) {
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
            Request request = new Request();
            DEFAULT_INSTANCE = request;
            GeneratedMessageLite.registerDefaultInstance(Request.class, request);
        }

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Request> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Response extends GeneratedMessageLite<Response, Builder> implements ResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Response DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile Parser<Response> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private MapFieldLite<String, String> headers_ = MapFieldLite.emptyMapField();
        private long size_;
        private Timestamp time_;

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public long getCode() {
            return this.code_;
        }

        public final void setCode(long j) {
            this.code_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0L;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public long getSize() {
            return this.size_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        /* loaded from: classes8.dex */
        public static final class HeadersDefaultEntryHolder {
            public static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        private MapFieldLite<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetHeaders = internalGetHeaders();
            return mapFieldLiteInternalGetHeaders.containsKey(str) ? mapFieldLiteInternalGetHeaders.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public String getHeadersOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetHeaders = internalGetHeaders();
            if (!mapFieldLiteInternalGetHeaders.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return mapFieldLiteInternalGetHeaders.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean hasTime() {
            return this.time_ != null;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.time_ = Timestamp.newBuilder(this.time_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.time_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Response response) {
            return DEFAULT_INSTANCE.createBuilder(response);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Response, Builder> implements ResponseOrBuilder {
            public /* synthetic */ Builder(C79931 c79931) {
                this();
            }

            public Builder() {
                super(Response.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public long getCode() {
                return ((Response) this.instance).getCode();
            }

            public Builder setCode(long j) {
                copyOnWrite();
                ((Response) this.instance).setCode(j);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Response) this.instance).clearCode();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public long getSize() {
                return ((Response) this.instance).getSize();
            }

            public Builder setSize(long j) {
                copyOnWrite();
                ((Response) this.instance).setSize(j);
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((Response) this.instance).clearSize();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public int getHeadersCount() {
                return ((Response) this.instance).getHeadersMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean containsHeaders(String str) {
                str.getClass();
                return ((Response) this.instance).getHeadersMap().containsKey(str);
            }

            public Builder clearHeaders() {
                copyOnWrite();
                ((Response) this.instance).getMutableHeadersMap().clear();
                return this;
            }

            public Builder removeHeaders(String str) {
                str.getClass();
                copyOnWrite();
                ((Response) this.instance).getMutableHeadersMap().remove(str);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((Response) this.instance).getHeadersMap());
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> headersMap = ((Response) this.instance).getHeadersMap();
                return headersMap.containsKey(str) ? headersMap.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public String getHeadersOrThrow(String str) {
                str.getClass();
                Map<String, String> headersMap = ((Response) this.instance).getHeadersMap();
                if (!headersMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return headersMap.get(str);
            }

            public Builder putHeaders(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Response) this.instance).getMutableHeadersMap().put(str, str2);
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                copyOnWrite();
                ((Response) this.instance).getMutableHeadersMap().putAll(map);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean hasTime() {
                return ((Response) this.instance).hasTime();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Timestamp getTime() {
                return ((Response) this.instance).getTime();
            }

            public Builder setTime(Timestamp timestamp) {
                copyOnWrite();
                ((Response) this.instance).setTime(timestamp);
                return this;
            }

            public Builder setTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((Response) this.instance).setTime(builder.build());
                return this;
            }

            public Builder mergeTime(Timestamp timestamp) {
                copyOnWrite();
                ((Response) this.instance).mergeTime(timestamp);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((Response) this.instance).clearTime();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C79931 c79931 = null;
            switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Response();
                case 2:
                    return new Builder(c79931);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", new Object[]{"code_", "size_", "headers_", HeadersDefaultEntryHolder.defaultEntry, "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Response> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Response.class) {
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
            Response response = new Response();
            DEFAULT_INSTANCE = response;
            GeneratedMessageLite.registerDefaultInstance(Response.class, response);
        }

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Response> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Resource extends GeneratedMessageLite<Resource, Builder> implements ResourceOrBuilder {
        private static final Resource DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Resource> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
        private String service_ = "";
        private String name_ = "";
        private String type_ = "";

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getService() {
            return this.service_;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getServiceBytes() {
            return ByteString.copyFromUtf8(this.service_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.service_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
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

        /* loaded from: classes8.dex */
        public static final class LabelsDefaultEntryHolder {
            public static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        private MapFieldLite<String, String> internalGetLabels() {
            return this.labels_;
        }

        private MapFieldLite<String, String> internalGetMutableLabels() {
            if (!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetLabels = internalGetLabels();
            return mapFieldLiteInternalGetLabels.containsKey(str) ? mapFieldLiteInternalGetLabels.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLabelsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetLabels = internalGetLabels();
            if (!mapFieldLiteInternalGetLabels.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return mapFieldLiteInternalGetLabels.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Resource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Resource parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Resource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Resource resource) {
            return DEFAULT_INSTANCE.createBuilder(resource);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Resource, Builder> implements ResourceOrBuilder {
            public /* synthetic */ Builder(C79931 c79931) {
                this();
            }

            public Builder() {
                super(Resource.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getService() {
                return ((Resource) this.instance).getService();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getServiceBytes() {
                return ((Resource) this.instance).getServiceBytes();
            }

            public Builder setService(String str) {
                copyOnWrite();
                ((Resource) this.instance).setService(str);
                return this;
            }

            public Builder clearService() {
                copyOnWrite();
                ((Resource) this.instance).clearService();
                return this;
            }

            public Builder setServiceBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Resource) this.instance).setServiceBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getName() {
                return ((Resource) this.instance).getName();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getNameBytes() {
                return ((Resource) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Resource) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Resource) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Resource) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getType() {
                return ((Resource) this.instance).getType();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getTypeBytes() {
                return ((Resource) this.instance).getTypeBytes();
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Resource) this.instance).setType(str);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Resource) this.instance).clearType();
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Resource) this.instance).setTypeBytes(byteString);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public int getLabelsCount() {
                return ((Resource) this.instance).getLabelsMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean containsLabels(String str) {
                str.getClass();
                return ((Resource) this.instance).getLabelsMap().containsKey(str);
            }

            public Builder clearLabels() {
                copyOnWrite();
                ((Resource) this.instance).getMutableLabelsMap().clear();
                return this;
            }

            public Builder removeLabels(String str) {
                str.getClass();
                copyOnWrite();
                ((Resource) this.instance).getMutableLabelsMap().remove(str);
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((Resource) this.instance).getLabelsMap());
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLabelsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> labelsMap = ((Resource) this.instance).getLabelsMap();
                return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLabelsOrThrow(String str) {
                str.getClass();
                Map<String, String> labelsMap = ((Resource) this.instance).getLabelsMap();
                if (!labelsMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return labelsMap.get(str);
            }

            public Builder putLabels(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Resource) this.instance).getMutableLabelsMap().put(str, str2);
                return this;
            }

            public Builder putAllLabels(Map<String, String> map) {
                copyOnWrite();
                ((Resource) this.instance).getMutableLabelsMap().putAll(map);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C79931 c79931 = null;
            switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Resource();
                case 2:
                    return new Builder(c79931);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", LabelsDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Resource> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Resource.class) {
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
            Resource resource = new Resource();
            DEFAULT_INSTANCE = resource;
            GeneratedMessageLite.registerDefaultInstance(Resource.class, resource);
        }

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Resource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasOrigin() {
        return this.origin_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getOrigin() {
        Peer peer = this.origin_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    public final void setOrigin(Peer peer) {
        peer.getClass();
        this.origin_ = peer;
    }

    public final void mergeOrigin(Peer peer) {
        peer.getClass();
        Peer peer2 = this.origin_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.origin_ = Peer.newBuilder(this.origin_).mergeFrom((Peer.Builder) peer).buildPartial();
        } else {
            this.origin_ = peer;
        }
    }

    public final void clearOrigin() {
        this.origin_ = null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasSource() {
        return this.source_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getSource() {
        Peer peer = this.source_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    public final void setSource(Peer peer) {
        peer.getClass();
        this.source_ = peer;
    }

    public final void mergeSource(Peer peer) {
        peer.getClass();
        Peer peer2 = this.source_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.source_ = Peer.newBuilder(this.source_).mergeFrom((Peer.Builder) peer).buildPartial();
        } else {
            this.source_ = peer;
        }
    }

    public final void clearSource() {
        this.source_ = null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasDestination() {
        return this.destination_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getDestination() {
        Peer peer = this.destination_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    public final void setDestination(Peer peer) {
        peer.getClass();
        this.destination_ = peer;
    }

    public final void mergeDestination(Peer peer) {
        peer.getClass();
        Peer peer2 = this.destination_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.destination_ = Peer.newBuilder(this.destination_).mergeFrom((Peer.Builder) peer).buildPartial();
        } else {
            this.destination_ = peer;
        }
    }

    public final void clearDestination() {
        this.destination_ = null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasRequest() {
        return this.request_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Request getRequest() {
        Request request = this.request_;
        return request == null ? Request.getDefaultInstance() : request;
    }

    public final void setRequest(Request request) {
        request.getClass();
        this.request_ = request;
    }

    public final void mergeRequest(Request request) {
        request.getClass();
        Request request2 = this.request_;
        if (request2 != null && request2 != Request.getDefaultInstance()) {
            this.request_ = Request.newBuilder(this.request_).mergeFrom((Request.Builder) request).buildPartial();
        } else {
            this.request_ = request;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasResponse() {
        return this.response_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Response getResponse() {
        Response response = this.response_;
        return response == null ? Response.getDefaultInstance() : response;
    }

    public final void setResponse(Response response) {
        response.getClass();
        this.response_ = response;
    }

    public final void mergeResponse(Response response) {
        response.getClass();
        Response response2 = this.response_;
        if (response2 != null && response2 != Response.getDefaultInstance()) {
            this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.Builder) response).buildPartial();
        } else {
            this.response_ = response;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasResource() {
        return this.resource_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Resource getResource() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    public final void setResource(Resource resource) {
        resource.getClass();
        this.resource_ = resource;
    }

    public final void mergeResource(Resource resource) {
        resource.getClass();
        Resource resource2 = this.resource_;
        if (resource2 != null && resource2 != Resource.getDefaultInstance()) {
            this.resource_ = Resource.newBuilder(this.resource_).mergeFrom((Resource.Builder) resource).buildPartial();
        } else {
            this.resource_ = resource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasApi() {
        return this.api_ != null;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Api getApi() {
        Api api = this.api_;
        return api == null ? Api.getDefaultInstance() : api;
    }

    public final void setApi(Api api) {
        api.getClass();
        this.api_ = api;
    }

    public final void mergeApi(Api api) {
        api.getClass();
        Api api2 = this.api_;
        if (api2 != null && api2 != Api.getDefaultInstance()) {
            this.api_ = Api.newBuilder(this.api_).mergeFrom((Api.Builder) api).buildPartial();
        } else {
            this.api_ = api;
        }
    }

    public final void clearApi() {
        this.api_ = null;
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AttributeContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AttributeContext attributeContext) {
        return DEFAULT_INSTANCE.createBuilder(attributeContext);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AttributeContext, Builder> implements AttributeContextOrBuilder {
        public /* synthetic */ Builder(C79931 c79931) {
            this();
        }

        public Builder() {
            super(AttributeContext.DEFAULT_INSTANCE);
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasOrigin() {
            return ((AttributeContext) this.instance).hasOrigin();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getOrigin() {
            return ((AttributeContext) this.instance).getOrigin();
        }

        public Builder setOrigin(Peer peer) {
            copyOnWrite();
            ((AttributeContext) this.instance).setOrigin(peer);
            return this;
        }

        public Builder setOrigin(Peer.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setOrigin(builder.build());
            return this;
        }

        public Builder mergeOrigin(Peer peer) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeOrigin(peer);
            return this;
        }

        public Builder clearOrigin() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearOrigin();
            return this;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasSource() {
            return ((AttributeContext) this.instance).hasSource();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getSource() {
            return ((AttributeContext) this.instance).getSource();
        }

        public Builder setSource(Peer peer) {
            copyOnWrite();
            ((AttributeContext) this.instance).setSource(peer);
            return this;
        }

        public Builder setSource(Peer.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setSource(builder.build());
            return this;
        }

        public Builder mergeSource(Peer peer) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeSource(peer);
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearSource();
            return this;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasDestination() {
            return ((AttributeContext) this.instance).hasDestination();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getDestination() {
            return ((AttributeContext) this.instance).getDestination();
        }

        public Builder setDestination(Peer peer) {
            copyOnWrite();
            ((AttributeContext) this.instance).setDestination(peer);
            return this;
        }

        public Builder setDestination(Peer.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setDestination(builder.build());
            return this;
        }

        public Builder mergeDestination(Peer peer) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeDestination(peer);
            return this;
        }

        public Builder clearDestination() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearDestination();
            return this;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasRequest() {
            return ((AttributeContext) this.instance).hasRequest();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Request getRequest() {
            return ((AttributeContext) this.instance).getRequest();
        }

        public Builder setRequest(Request request) {
            copyOnWrite();
            ((AttributeContext) this.instance).setRequest(request);
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setRequest(builder.build());
            return this;
        }

        public Builder mergeRequest(Request request) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeRequest(request);
            return this;
        }

        public Builder clearRequest() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearRequest();
            return this;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasResponse() {
            return ((AttributeContext) this.instance).hasResponse();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Response getResponse() {
            return ((AttributeContext) this.instance).getResponse();
        }

        public Builder setResponse(Response response) {
            copyOnWrite();
            ((AttributeContext) this.instance).setResponse(response);
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setResponse(builder.build());
            return this;
        }

        public Builder mergeResponse(Response response) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeResponse(response);
            return this;
        }

        public Builder clearResponse() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearResponse();
            return this;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasResource() {
            return ((AttributeContext) this.instance).hasResource();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Resource getResource() {
            return ((AttributeContext) this.instance).getResource();
        }

        public Builder setResource(Resource resource) {
            copyOnWrite();
            ((AttributeContext) this.instance).setResource(resource);
            return this;
        }

        public Builder setResource(Resource.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setResource(builder.build());
            return this;
        }

        public Builder mergeResource(Resource resource) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeResource(resource);
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearResource();
            return this;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasApi() {
            return ((AttributeContext) this.instance).hasApi();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Api getApi() {
            return ((AttributeContext) this.instance).getApi();
        }

        public Builder setApi(Api api) {
            copyOnWrite();
            ((AttributeContext) this.instance).setApi(api);
            return this;
        }

        public Builder setApi(Api.Builder builder) {
            copyOnWrite();
            ((AttributeContext) this.instance).setApi(builder.build());
            return this;
        }

        public Builder mergeApi(Api api) {
            copyOnWrite();
            ((AttributeContext) this.instance).mergeApi(api);
            return this;
        }

        public Builder clearApi() {
            copyOnWrite();
            ((AttributeContext) this.instance).clearApi();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C79931 c79931 = null;
        switch (C79931.f945xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AttributeContext();
            case 2:
                return new Builder(c79931);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AttributeContext> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AttributeContext.class) {
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
        AttributeContext attributeContext = new AttributeContext();
        DEFAULT_INSTANCE = attributeContext;
        GeneratedMessageLite.registerDefaultInstance(AttributeContext.class, attributeContext);
    }

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AttributeContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
