package io.ktor.utils.p050io.streams;

import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Input.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m7105d2 = {"asInput", "Lio/ktor/utils/io/core/Input;", "Ljava/io/InputStream;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class InputKt {
    @NotNull
    public static final Input asInput(@NotNull InputStream inputStream, @NotNull ObjectPool<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new InputStreamAsInput(inputStream, pool);
    }

    public static /* synthetic */ Input asInput$default(InputStream inputStream, ObjectPool objectPool, int i, Object obj) {
        if ((i & 1) != 0) {
            objectPool = ChunkBuffer.INSTANCE.getPool();
        }
        return asInput(inputStream, objectPool);
    }
}
