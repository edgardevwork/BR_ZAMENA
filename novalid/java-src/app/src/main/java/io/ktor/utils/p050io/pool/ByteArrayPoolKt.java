package io.ktor.utils.p050io.pool;

import com.bumptech.glide.load.engine.bitmap_recycle.ByteArrayAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteArrayPool.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m7105d2 = {ByteArrayAdapter.TAG, "Lio/ktor/utils/io/pool/ObjectPool;", "", "getByteArrayPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ByteArrayPoolKt {

    @NotNull
    public static final ObjectPool<byte[]> ByteArrayPool = new DefaultPool<byte[]>() { // from class: io.ktor.utils.io.pool.ByteArrayPoolKt$ByteArrayPool$1
        @Override // io.ktor.utils.p050io.pool.DefaultPool
        @NotNull
        public byte[] produceInstance() {
            return new byte[4096];
        }
    };

    @NotNull
    public static final ObjectPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
