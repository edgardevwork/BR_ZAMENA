package io.ktor.client.plugins.websocket;

import io.ktor.client.request.ClientUpgradeContent;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.websocket.UtilsKt;
import io.ktor.util.Base64Kt;
import io.ktor.util.CryptoKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketContent.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/plugins/websocket/WebSocketContent;", "Lio/ktor/client/request/ClientUpgradeContent;", "()V", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "nonce", "", "toString", "verify", "", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketContent extends ClientUpgradeContent {

    @NotNull
    public final Headers headers;

    @NotNull
    public final String nonce;

    public WebSocketContent() {
        String str = Base64Kt.encodeBase64(CryptoKt.generateNonce(16));
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        this.nonce = str;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        headersBuilder.append(httpHeaders.getUpgrade(), "websocket");
        headersBuilder.append(httpHeaders.getConnection(), "Upgrade");
        headersBuilder.append(httpHeaders.getSecWebSocketKey(), str);
        headersBuilder.append(httpHeaders.getSecWebSocketVersion(), WebSocketContentKt.WEBSOCKET_VERSION);
        this.headers = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.request.ClientUpgradeContent
    public void verify(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headers.get(httpHeaders.getSecWebSocketAccept());
        if (str == null) {
            throw new IllegalStateException(("Server should specify header " + httpHeaders.getSecWebSocketAccept()).toString());
        }
        String strWebsocketServerAccept = UtilsKt.websocketServerAccept(this.nonce);
        if (Intrinsics.areEqual(strWebsocketServerAccept, str)) {
            return;
        }
        throw new IllegalStateException(("Failed to verify server accept header. Expected: " + strWebsocketServerAccept + ", received: " + str).toString());
    }

    @NotNull
    public String toString() {
        return "WebSocketContent";
    }
}
