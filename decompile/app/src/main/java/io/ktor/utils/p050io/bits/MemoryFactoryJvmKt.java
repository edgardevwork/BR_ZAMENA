package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.utils.p050io.bits.Memory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryFactoryJvm.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aQ\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\r0\u000fH\u0086\bø\u0001\u0001ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0002\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m7105d2 = {"of", "Lio/ktor/utils/io/bits/Memory;", "Lio/ktor/utils/io/bits/Memory$Companion;", "buffer", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/bits/Memory$Companion;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "array", "", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "(Lio/ktor/utils/io/bits/Memory$Companion;[BII)Ljava/nio/ByteBuffer;", "useMemory", "R", "block", "Lkotlin/Function1;", "([BIILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class MemoryFactoryJvmKt {
    public static /* synthetic */ Object useMemory$default(byte[] bArr, int i, int i2, Function1 block, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        return block.invoke(Memory.m15422boximpl(Memory.m15423constructorimpl(byteBufferOrder)));
    }

    public static final <R> R useMemory(@NotNull byte[] bArr, int i, int i2, @NotNull Function1<? super Memory, ? extends R> block) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        return block.invoke(Memory.m15422boximpl(Memory.m15423constructorimpl(byteBufferOrder)));
    }

    public static /* synthetic */ ByteBuffer of$default(Memory.Companion companion, byte[] array, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = array.length - i;
        }
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(array, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(array, offset, leng…der(ByteOrder.BIG_ENDIAN)");
        return Memory.m15423constructorimpl(byteBufferOrder);
    }

    @NotNull
    /* renamed from: of */
    public static final ByteBuffer m7094of(@NotNull Memory.Companion companion, @NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(array, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(array, offset, leng…der(ByteOrder.BIG_ENDIAN)");
        return Memory.m15423constructorimpl(byteBufferOrder);
    }

    @NotNull
    /* renamed from: of */
    public static final ByteBuffer m7093of(@NotNull Memory.Companion companion, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ByteBuffer byteBufferOrder = buffer.slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return Memory.m15423constructorimpl(byteBufferOrder);
    }
}
