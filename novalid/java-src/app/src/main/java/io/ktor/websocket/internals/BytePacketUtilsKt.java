package io.ktor.websocket.internals;

import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BytePacketUtils.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m7105d2 = {"endsWith", "", "Lio/ktor/utils/io/core/ByteReadPacket;", "data", "", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class BytePacketUtilsKt {
    public static final boolean endsWith(@NotNull ByteReadPacket byteReadPacket, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        ByteReadPacket byteReadPacketCopy = byteReadPacket.copy();
        byteReadPacketCopy.discard(byteReadPacketCopy.getRemaining() - data.length);
        return Arrays.equals(StringsKt.readBytes$default(byteReadPacketCopy, 0, 1, null), data);
    }
}
