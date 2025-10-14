package io.ktor.utils.p050io.streams;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Output.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J-\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/utils/io/streams/OutputStreamAdapter;", "Lio/ktor/utils/io/core/Output;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "stream", "Ljava/io/OutputStream;", "(Lio/ktor/utils/io/pool/ObjectPool;Ljava/io/OutputStream;)V", "closeDestination", "", "flush", "source", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "flush-62zg_DM", "(Ljava/nio/ByteBuffer;II)V", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class OutputStreamAdapter extends Output {

    @NotNull
    public final OutputStream stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputStreamAdapter(@NotNull ObjectPool<ChunkBuffer> pool, @NotNull OutputStream stream) {
        super(pool);
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
    }

    @Override // io.ktor.utils.p050io.core.Output
    /* renamed from: flush-62zg_DM */
    public void mo15602flush62zg_DM(@NotNull ByteBuffer source, int offset, int length) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.hasArray() && !source.isReadOnly()) {
            this.stream.write(source.array(), source.arrayOffset() + offset, length);
            return;
        }
        byte[] bArrBorrow = ByteArraysKt.getByteArrayPool().borrow();
        ByteBuffer byteBufferSliceSafe = MemoryJvmKt.sliceSafe(source, offset, length);
        while (true) {
            try {
                int iMin = Math.min(byteBufferSliceSafe.remaining(), bArrBorrow.length);
                if (iMin == 0) {
                    return;
                }
                byteBufferSliceSafe.get(bArrBorrow, 0, iMin);
                this.stream.write(bArrBorrow, 0, iMin);
            } finally {
                ByteArraysKt.getByteArrayPool().recycle(bArrBorrow);
            }
        }
    }

    @Override // io.ktor.utils.p050io.core.Output
    public void closeDestination() throws IOException {
        this.stream.close();
    }
}
