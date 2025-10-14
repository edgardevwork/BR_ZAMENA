package io.ktor.utils.p050io.core;

import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputArraysJvm.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001¨\u0006\b"}, m7105d2 = {"readAvailable", "", "Lio/ktor/utils/io/core/Input;", "dst", "Ljava/nio/ByteBuffer;", CacheFileMetadataIndex.COLUMN_LENGTH, "readFully", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInputArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputArraysJvm.kt\nio/ktor/utils/io/core/InputArraysJvmKt\n+ 2 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 3 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,30:1\n823#2,6:31\n829#2,13:38\n69#3:37\n*S KotlinDebug\n*F\n+ 1 InputArraysJvm.kt\nio/ktor/utils/io/core/InputArraysJvmKt\n*L\n17#1:31,6\n17#1:38,13\n19#1:37\n*E\n"})
/* loaded from: classes5.dex */
public final class InputArraysJvmKt {
    public static /* synthetic */ void readFully$default(Input input, ByteBuffer byteBuffer, int i, int i2, Object obj) throws EOFException {
        if ((i2 & 2) != 0) {
            i = byteBuffer.remaining();
        }
        readFully(input, byteBuffer, i);
    }

    public static final void readFully(@NotNull Input input, @NotNull ByteBuffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (readAvailable(input, dst, i) >= i) {
            return;
        }
        StringsKt.prematureEndOfStream(i);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ int readAvailable$default(Input input, ByteBuffer byteBuffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = byteBuffer.remaining();
        }
        return readAvailable(input, byteBuffer, i);
    }

    public static final int readAvailable(@NotNull Input input, @NotNull ByteBuffer dst, int i) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return 0;
        }
        int i2 = 0;
        do {
            try {
                int iLimit = dst.limit();
                dst.limit(Math.min(iLimit, dst.position() + (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition())));
                int iRemaining = dst.remaining();
                MemoryJvmKt.m15440copyTo62zg_DM(chunkBufferPrepareReadFirstHead.getMemory(), dst, chunkBufferPrepareReadFirstHead.getReadPosition());
                dst.limit(iLimit);
                i2 += iRemaining;
                if (dst.hasRemaining() && i2 < i) {
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                } else {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    break;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } while (chunkBufferPrepareReadFirstHead != null);
        return i2;
    }
}
