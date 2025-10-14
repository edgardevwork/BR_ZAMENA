package io.ktor.util.cio;

import io.ktor.utils.p050io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteBufferPool.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"DEFAULT_BUFFER_SIZE", "", "DEFAULT_KTOR_POOL_SIZE", "KtorDefaultPool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "getKtorDefaultPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ByteBufferPoolKt {
    public static final int DEFAULT_BUFFER_SIZE = 4098;
    public static final int DEFAULT_KTOR_POOL_SIZE = 2048;

    @NotNull
    public static final ObjectPool<ByteBuffer> KtorDefaultPool = new io.ktor.utils.p050io.pool.ByteBufferPool(2048, 4098);

    @NotNull
    public static final ObjectPool<ByteBuffer> getKtorDefaultPool() {
        return KtorDefaultPool;
    }
}
