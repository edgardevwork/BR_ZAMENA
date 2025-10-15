package androidx.room.util;

import androidx.annotation.RestrictTo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UUIDUtil.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, m7105d2 = {"convertByteToUUID", "Ljava/util/UUID;", "bytes", "", "convertUUIDToByte", CommonUrlParts.UUID, "room-runtime_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName(name = "UUIDUtil")
/* loaded from: classes3.dex */
public final class UUIDUtil {
    @NotNull
    public static final UUID convertByteToUUID(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    @NotNull
    public static final byte[] convertUUIDToByte(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "buffer.array()");
        return bArrArray;
    }
}
