package io.ktor.client.plugins.websocket;

import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.HttpHeaders;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.DefaultWebSocketSessionKt;
import io.ktor.websocket.WebSocketExtension;
import io.ktor.websocket.WebSocketExtensionHeader;
import io.ktor.websocket.WebSocketExtensionHeaderKt;
import io.ktor.websocket.WebSocketExtensionsConfig;
import io.ktor.websocket.WebSocketSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jfrog.filespecs.properties.PropertiesParser;

/* compiled from: WebSockets.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006$"}, m7105d2 = {"Lio/ktor/client/plugins/websocket/WebSockets;", "", "pingInterval", "", "maxFrameSize", "(JJ)V", "()V", "extensionsConfig", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "contentConverter", "Lio/ktor/serialization/WebsocketContentConverter;", "(JJLio/ktor/websocket/WebSocketExtensionsConfig;Lio/ktor/serialization/WebsocketContentConverter;)V", "getContentConverter", "()Lio/ktor/serialization/WebsocketContentConverter;", "getMaxFrameSize", "()J", "getPingInterval", "addNegotiatedProtocols", "", "context", "Lio/ktor/client/request/HttpRequestBuilder;", "protocols", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "completeNegotiation", "Lio/ktor/websocket/WebSocketExtension;", NotificationCompat.CATEGORY_CALL, "Lio/ktor/client/call/HttpClientCall;", "convertSessionToDefault", "Lio/ktor/websocket/DefaultWebSocketSession;", "session", "Lio/ktor/websocket/WebSocketSession;", "convertSessionToDefault$ktor_client_core", "installExtensions", "Config", "Plugin", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1360#2:224\n1446#2,5:225\n766#2:231\n857#2,2:232\n1#3:230\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets\n*L\n72#1:224\n72#1:225,5\n86#1:231\n86#1:232,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WebSockets {

    /* renamed from: Plugin, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<WebSockets> key = new AttributeKey<>("Websocket");

    @Nullable
    public final WebsocketContentConverter contentConverter;

    @NotNull
    public final WebSocketExtensionsConfig extensionsConfig;
    public final long maxFrameSize;
    public final long pingInterval;

    public WebSockets(long j, long j2, @NotNull WebSocketExtensionsConfig extensionsConfig, @Nullable WebsocketContentConverter websocketContentConverter) {
        Intrinsics.checkNotNullParameter(extensionsConfig, "extensionsConfig");
        this.pingInterval = j;
        this.maxFrameSize = j2;
        this.extensionsConfig = extensionsConfig;
        this.contentConverter = websocketContentConverter;
    }

    public /* synthetic */ WebSockets(long j, long j2, WebSocketExtensionsConfig webSocketExtensionsConfig, WebsocketContentConverter websocketContentConverter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, webSocketExtensionsConfig, (i & 8) != 0 ? null : websocketContentConverter);
    }

    public final long getPingInterval() {
        return this.pingInterval;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    @Nullable
    public final WebsocketContentConverter getContentConverter() {
        return this.contentConverter;
    }

    public /* synthetic */ WebSockets(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? ParserMinimalBase.MAX_INT_L : j2);
    }

    public WebSockets(long j, long j2) {
        this(j, j2, new WebSocketExtensionsConfig(), null, 8, null);
    }

    public WebSockets() {
        this(-1L, ParserMinimalBase.MAX_INT_L, new WebSocketExtensionsConfig(), null, 8, null);
    }

    public final void installExtensions(HttpRequestBuilder context) throws IOException {
        List<WebSocketExtension<?>> listBuild = this.extensionsConfig.build();
        context.getAttributes().put(WebSocketsKt.REQUEST_EXTENSIONS_KEY, listBuild);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listBuild.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((WebSocketExtension) it.next()).getProtocols());
        }
        addNegotiatedProtocols(context, arrayList);
    }

    public final List<WebSocketExtension<?>> completeNegotiation(HttpClientCall call) {
        List<WebSocketExtensionHeader> listEmptyList;
        String str = call.getResponse().getHeaders().get(HttpHeaders.INSTANCE.getSecWebSocketExtensions());
        if (str == null || (listEmptyList = WebSocketExtensionHeaderKt.parseWebSocketExtensions(str)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = (List) call.getAttributes().get(WebSocketsKt.REQUEST_EXTENSIONS_KEY);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WebSocketExtension) obj).clientNegotiation(listEmptyList)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void addNegotiatedProtocols(HttpRequestBuilder context, List<WebSocketExtensionHeader> protocols) throws IOException {
        if (protocols.isEmpty()) {
            return;
        }
        UtilsKt.header(context, HttpHeaders.INSTANCE.getSecWebSocketExtensions(), CollectionsKt___CollectionsKt.joinToString$default(protocols, PropertiesParser.PROPS_SEPARATOR, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public final DefaultWebSocketSession convertSessionToDefault$ktor_client_core(@NotNull WebSocketSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (session instanceof DefaultWebSocketSession) {
            return (DefaultWebSocketSession) session;
        }
        long j = this.pingInterval;
        DefaultWebSocketSession DefaultWebSocketSession = DefaultWebSocketSessionKt.DefaultWebSocketSession(session, j, 2 * j);
        DefaultWebSocketSession.setMaxFrameSize(this.maxFrameSize);
        return DefaultWebSocketSession;
    }

    /* compiled from: WebSockets.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0016\u001a\u00020\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, m7105d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "()V", "contentConverter", "Lio/ktor/serialization/WebsocketContentConverter;", "getContentConverter", "()Lio/ktor/serialization/WebsocketContentConverter;", "setContentConverter", "(Lio/ktor/serialization/WebsocketContentConverter;)V", "extensionsConfig", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "getExtensionsConfig$ktor_client_core", "()Lio/ktor/websocket/WebSocketExtensionsConfig;", "maxFrameSize", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "pingInterval", "getPingInterval", "setPingInterval", "extensions", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {

        @Nullable
        public WebsocketContentConverter contentConverter;

        @NotNull
        public final WebSocketExtensionsConfig extensionsConfig = new WebSocketExtensionsConfig();
        public long pingInterval = -1;
        public long maxFrameSize = ParserMinimalBase.MAX_INT_L;

        @NotNull
        /* renamed from: getExtensionsConfig$ktor_client_core, reason: from getter */
        public final WebSocketExtensionsConfig getExtensionsConfig() {
            return this.extensionsConfig;
        }

        public final long getPingInterval() {
            return this.pingInterval;
        }

        public final void setPingInterval(long j) {
            this.pingInterval = j;
        }

        public final long getMaxFrameSize() {
            return this.maxFrameSize;
        }

        public final void setMaxFrameSize(long j) {
            this.maxFrameSize = j;
        }

        @Nullable
        public final WebsocketContentConverter getContentConverter() {
            return this.contentConverter;
        }

        public final void setContentConverter(@Nullable WebsocketContentConverter websocketContentConverter) {
            this.contentConverter = websocketContentConverter;
        }

        public final void extensions(@NotNull Function1<? super WebSocketExtensionsConfig, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(this.extensionsConfig);
        }
    }

    /* compiled from: WebSockets.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "Lio/ktor/client/plugins/websocket/WebSockets;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.websocket.WebSockets$Plugin, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, WebSockets> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<WebSockets> getKey() {
            return WebSockets.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public WebSockets prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new WebSockets(config.getPingInterval(), config.getMaxFrameSize(), config.getExtensionsConfig(), config.getContentConverter());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull WebSockets plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            boolean zContains = scope.getEngine().getSupportedCapabilities().contains(WebSocketExtensionsCapability.INSTANCE);
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new WebSockets$Plugin$install$1(zContains, plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getTransform(), new WebSockets$Plugin$install$2(plugin, zContains, null));
        }
    }
}
