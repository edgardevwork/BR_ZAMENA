package io.ktor.websocket;

import io.ktor.websocket.Frame;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketDeflateExtension.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"CLIENT_MAX_WINDOW_BITS", "", "CLIENT_NO_CONTEXT_TAKEOVER", "MAX_WINDOW_BITS", "", "MIN_WINDOW_BITS", "PERMESSAGE_DEFLATE", "SERVER_MAX_WINDOW_BITS", "SERVER_NO_CONTEXT_TAKEOVER", "isCompressed", "", "Lio/ktor/websocket/Frame;", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketDeflateExtensionKt {

    @NotNull
    public static final String CLIENT_MAX_WINDOW_BITS = "client_max_window_bits";

    @NotNull
    public static final String CLIENT_NO_CONTEXT_TAKEOVER = "client_no_context_takeover";
    public static final int MAX_WINDOW_BITS = 15;
    public static final int MIN_WINDOW_BITS = 8;

    @NotNull
    public static final String PERMESSAGE_DEFLATE = "permessage-deflate";

    @NotNull
    public static final String SERVER_MAX_WINDOW_BITS = "server_max_window_bits";

    @NotNull
    public static final String SERVER_NO_CONTEXT_TAKEOVER = "server_no_context_takeover";

    public static final boolean isCompressed(Frame frame) {
        return frame.getRsv1() && ((frame instanceof Frame.Text) || (frame instanceof Frame.Binary));
    }
}
