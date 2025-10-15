package io.ktor.client.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CIOJvm.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"HttpClientDefaultPool", "Lio/ktor/utils/io/pool/ByteBufferPool;", "getHttpClientDefaultPool", "()Lio/ktor/utils/io/pool/ByteBufferPool;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class CIOJvmKt {

    @NotNull
    public static final io.ktor.utils.p050io.pool.ByteBufferPool HttpClientDefaultPool = new io.ktor.utils.p050io.pool.ByteBufferPool(0, 0, 3, null);

    @NotNull
    public static final io.ktor.utils.p050io.pool.ByteBufferPool getHttpClientDefaultPool() {
        return HttpClientDefaultPool;
    }
}
