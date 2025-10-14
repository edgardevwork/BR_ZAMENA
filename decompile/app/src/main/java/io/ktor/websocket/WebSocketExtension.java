package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketExtension.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bH&R&\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/websocket/WebSocketExtension;", "ConfigType", "", "factory", "Lio/ktor/websocket/WebSocketExtensionFactory;", "getFactory", "()Lio/ktor/websocket/WebSocketExtensionFactory;", "protocols", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "getProtocols", "()Ljava/util/List;", "clientNegotiation", "", "negotiatedProtocols", "processIncomingFrame", "Lio/ktor/websocket/Frame;", TypedValues.AttributesType.S_FRAME, "processOutgoingFrame", "serverNegotiation", "requestedProtocols", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface WebSocketExtension<ConfigType> {
    boolean clientNegotiation(@NotNull List<WebSocketExtensionHeader> negotiatedProtocols);

    @NotNull
    WebSocketExtensionFactory<ConfigType, ? extends WebSocketExtension<ConfigType>> getFactory();

    @NotNull
    List<WebSocketExtensionHeader> getProtocols();

    @NotNull
    Frame processIncomingFrame(@NotNull Frame frame);

    @NotNull
    Frame processOutgoingFrame(@NotNull Frame frame);

    @NotNull
    List<WebSocketExtensionHeader> serverNegotiation(@NotNull List<WebSocketExtensionHeader> requestedProtocols);
}
