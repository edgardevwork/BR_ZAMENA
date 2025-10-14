package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"io/ktor/websocket/UtilsKt__UtilsJvmKt", "io/ktor/websocket/UtilsKt__UtilsKt"}, m7106k = 4, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class UtilsKt {
    public static final int flagAt(boolean z, int i) {
        return UtilsKt__UtilsKt.flagAt(z, i);
    }

    public static final int getOUTGOING_CHANNEL_CAPACITY() {
        return UtilsKt__UtilsJvmKt.getOUTGOING_CHANNEL_CAPACITY();
    }

    public static final byte xor(byte b, byte b2) {
        return UtilsKt__UtilsKt.xor(b, b2);
    }

    public static final void xor(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2) {
        UtilsKt__UtilsJvmKt.xor(byteBuffer, byteBuffer2);
    }
}
