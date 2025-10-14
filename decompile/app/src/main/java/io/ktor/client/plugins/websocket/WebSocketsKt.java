package io.ktor.client.plugins.websocket;

import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.websocket.WebSocketExtension;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/* compiled from: WebSockets.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\"\u0018\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;", "REQUEST_EXTENSIONS_KEY", "Lio/ktor/util/AttributeKey;", "", "Lio/ktor/websocket/WebSocketExtension;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketsKt {

    @NotNull
    public static final AttributeKey<List<WebSocketExtension<?>>> REQUEST_EXTENSIONS_KEY = new AttributeKey<>("Websocket extensions");

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.websocket.WebSockets");

    @NotNull
    public static final Logger getLOGGER() {
        return LOGGER;
    }
}
