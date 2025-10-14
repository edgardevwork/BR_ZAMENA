package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.pool.SingleInstancePool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteReadPacketExtensions.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/utils/io/core/SingleByteBufferPool;", "Lio/ktor/utils/io/pool/SingleInstancePool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "instance", "Ljava/nio/ByteBuffer;", "release", "Lkotlin/Function1;", "", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function1;)V", "getInstance", "()Ljava/nio/ByteBuffer;", "getRelease", "()Lkotlin/jvm/functions/Function1;", "disposeInstance", "produceInstance", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class SingleByteBufferPool extends SingleInstancePool<ChunkBuffer> {

    @NotNull
    public final ByteBuffer instance;

    @NotNull
    public final Function1<ByteBuffer, Unit> release;

    @NotNull
    public final ByteBuffer getInstance() {
        return this.instance;
    }

    @NotNull
    public final Function1<ByteBuffer, Unit> getRelease() {
        return this.release;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleByteBufferPool(@NotNull ByteBuffer instance, @NotNull Function1<? super ByteBuffer, Unit> release) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(release, "release");
        this.instance = instance;
        this.release = release;
    }

    @Override // io.ktor.utils.p050io.pool.SingleInstancePool
    @NotNull
    public ChunkBuffer produceInstance() {
        return BufferUtilsJvmKt.ChunkBuffer(this.instance, this);
    }

    @Override // io.ktor.utils.p050io.pool.SingleInstancePool
    public void disposeInstance(@NotNull ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.release.invoke(this.instance);
    }
}
