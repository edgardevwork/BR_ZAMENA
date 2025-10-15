package io.ktor.utils.p050io.core.internal;

import androidx.concurrent.futures.C2081xc40028dd;
import io.ktor.http.LinkHeader;
import io.ktor.utils.p050io.DeprecationKt;
import io.ktor.utils.p050io.bits.DefaultAllocator;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.BufferFactoryKt;
import io.ktor.utils.p050io.pool.NoPoolImpl;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChunkBuffer.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0017\u0018\u0000 +2\u00020-:\u0001+B,\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\nR(\u0010 \u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u000eR(\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m7105d2 = {"Lio/ktor/utils/io/core/internal/ChunkBuffer;", "Lio/ktor/utils/io/bits/Memory;", "memory", "origin", "Lio/ktor/utils/io/pool/ObjectPool;", "parentPool", SegmentConstantPool.INITSTRING, "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/core/internal/ChunkBuffer;Lio/ktor/utils/io/pool/ObjectPool;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "acquire$ktor_io", "()V", "acquire", "chunk", "appendNext", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "cleanNext", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "duplicate", "", "release$ktor_io", "()Z", "release", "pool", "(Lio/ktor/utils/io/pool/ObjectPool;)V", "reset", "unlink$ktor_io", "unlink", "unpark$ktor_io", "unpark", "newValue", "getNext", "setNext", LinkHeader.Rel.Next, "<set-?>", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getOrigin", "Lio/ktor/utils/io/pool/ObjectPool;", "getParentPool$ktor_io", "()Lio/ktor/utils/io/pool/ObjectPool;", "", "getReferenceCount", "()I", "referenceCount", "Companion", "ktor-io", "Lio/ktor/utils/io/core/Buffer;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
@SourceDebugExtension({"SMAP\nChunkBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkBuffer.kt\nio/ktor/utils/io/core/internal/ChunkBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,180:1\n1#2:181\n360#3,4:182\n360#3,4:186\n382#3,4:190\n*S KotlinDebug\n*F\n+ 1 ChunkBuffer.kt\nio/ktor/utils/io/core/internal/ChunkBuffer\n*L\n89#1:182,4\n99#1:186,4\n116#1:190,4\n*E\n"})
/* loaded from: classes7.dex */
public class ChunkBuffer extends Buffer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ChunkBuffer Empty;

    @NotNull
    public static final ObjectPool<ChunkBuffer> EmptyPool;

    @NotNull
    public static final ObjectPool<ChunkBuffer> NoPool;

    @NotNull
    public static final ObjectPool<ChunkBuffer> NoPoolManuallyManaged;
    public static final /* synthetic */ AtomicReferenceFieldUpdater nextRef$FU;
    public static final /* synthetic */ AtomicIntegerFieldUpdater refCount$FU;

    @NotNull
    private volatile /* synthetic */ Object nextRef;

    @Nullable
    public ChunkBuffer origin;

    @Nullable
    public final ObjectPool<ChunkBuffer> parentPool;

    @NotNull
    private volatile /* synthetic */ int refCount;

    public /* synthetic */ ChunkBuffer(ByteBuffer byteBuffer, ChunkBuffer chunkBuffer, ObjectPool objectPool, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, chunkBuffer, objectPool);
    }

    @Nullable
    public final ObjectPool<ChunkBuffer> getParentPool$ktor_io() {
        return this.parentPool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChunkBuffer(ByteBuffer memory, ChunkBuffer chunkBuffer, ObjectPool<ChunkBuffer> objectPool) {
        super(memory, null);
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.parentPool = objectPool;
        if (chunkBuffer == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.".toString());
        }
        this.nextRef = null;
        this.refCount = 1;
        this.origin = chunkBuffer;
    }

    @Nullable
    public final ChunkBuffer getOrigin() {
        return this.origin;
    }

    @Nullable
    public final ChunkBuffer getNext() {
        return (ChunkBuffer) this.nextRef;
    }

    public final void setNext(@Nullable ChunkBuffer chunkBuffer) {
        if (chunkBuffer == null) {
            cleanNext();
        } else {
            appendNext(chunkBuffer);
        }
    }

    /* renamed from: getReferenceCount, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    public final void appendNext(ChunkBuffer chunk) {
        if (!C2081xc40028dd.m347m(nextRef$FU, this, null, chunk)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    @Nullable
    public final ChunkBuffer cleanNext() {
        return (ChunkBuffer) nextRef$FU.getAndSet(this, null);
    }

    @Override // io.ktor.utils.p050io.core.Buffer
    @NotNull
    public ChunkBuffer duplicate() {
        ChunkBuffer chunkBuffer = this.origin;
        if (chunkBuffer == null) {
            chunkBuffer = this;
        }
        chunkBuffer.acquire$ktor_io();
        ChunkBuffer chunkBuffer2 = new ChunkBuffer(getMemory(), chunkBuffer, this.parentPool, null);
        duplicateTo(chunkBuffer2);
        return chunkBuffer2;
    }

    public void release(@NotNull ObjectPool<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (release$ktor_io()) {
            ChunkBuffer chunkBuffer = this.origin;
            if (chunkBuffer != null) {
                unlink$ktor_io();
                chunkBuffer.release(pool);
            } else {
                ObjectPool<ChunkBuffer> objectPool = this.parentPool;
                if (objectPool != null) {
                    pool = objectPool;
                }
                pool.recycle(this);
            }
        }
    }

    public final void unlink$ktor_io() {
        if (!refCount$FU.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        cleanNext();
        this.origin = null;
    }

    @Override // io.ktor.utils.p050io.core.Buffer
    public final void reset() {
        if (this.origin != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin".toString());
        }
        super.reset();
        this.nextRef = null;
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/utils/io/core/internal/ChunkBuffer$Companion;", "", "()V", "Empty", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getEmpty", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "EmptyPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getEmptyPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "NoPool", "getNoPool$ktor_io", "NoPoolManuallyManaged", "getNoPoolManuallyManaged$ktor_io", "Pool", "getPool", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ObjectPool<ChunkBuffer> getPool() {
            return BufferFactoryKt.getDefaultChunkedBufferPool();
        }

        @NotNull
        public final ObjectPool<ChunkBuffer> getEmptyPool() {
            return ChunkBuffer.EmptyPool;
        }

        @NotNull
        public final ChunkBuffer getEmpty() {
            return ChunkBuffer.Empty;
        }

        @NotNull
        public final ObjectPool<ChunkBuffer> getNoPool$ktor_io() {
            return ChunkBuffer.NoPool;
        }

        @NotNull
        public final ObjectPool<ChunkBuffer> getNoPoolManuallyManaged$ktor_io() {
            return ChunkBuffer.NoPoolManuallyManaged;
        }
    }

    static {
        ObjectPool<ChunkBuffer> objectPool = new ObjectPool<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$EmptyPool$1
            @Override // io.ktor.utils.p050io.pool.ObjectPool
            public void dispose() {
            }

            @Override // io.ktor.utils.p050io.pool.ObjectPool
            public int getCapacity() {
                return 1;
            }

            @Override // io.ktor.utils.p050io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ObjectPool.DefaultImpls.close(this);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ktor.utils.p050io.pool.ObjectPool
            @NotNull
            public ChunkBuffer borrow() {
                return ChunkBuffer.INSTANCE.getEmpty();
            }

            @Override // io.ktor.utils.p050io.pool.ObjectPool
            public void recycle(@NotNull ChunkBuffer instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                if (instance != ChunkBuffer.INSTANCE.getEmpty()) {
                    throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.".toString());
                }
            }
        };
        EmptyPool = objectPool;
        Empty = new ChunkBuffer(Memory.INSTANCE.m15439getEmptySK3TCg8(), null, objectPool, null);
        NoPool = new NoPoolImpl<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$NoPool$1
            @Override // io.ktor.utils.p050io.pool.ObjectPool
            @NotNull
            public ChunkBuffer borrow() {
                return new ChunkBuffer(DefaultAllocator.INSTANCE.mo15416allocgFvZug(4096), null, this, null);
            }

            @Override // io.ktor.utils.p050io.pool.NoPoolImpl, io.ktor.utils.p050io.pool.ObjectPool
            public void recycle(@NotNull ChunkBuffer instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                DefaultAllocator.INSTANCE.mo15418free3GNKZMM(instance.getMemory());
            }
        };
        NoPoolManuallyManaged = new NoPoolImpl<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$NoPoolManuallyManaged$1
            @Override // io.ktor.utils.p050io.pool.NoPoolImpl, io.ktor.utils.p050io.pool.ObjectPool
            public void recycle(@NotNull ChunkBuffer instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
            }

            @Override // io.ktor.utils.p050io.pool.ObjectPool
            @NotNull
            public ChunkBuffer borrow() {
                throw new UnsupportedOperationException("This pool doesn't support borrow");
            }
        };
        nextRef$FU = AtomicReferenceFieldUpdater.newUpdater(ChunkBuffer.class, Object.class, "nextRef");
        refCount$FU = AtomicIntegerFieldUpdater.newUpdater(ChunkBuffer.class, "refCount");
    }

    public final void acquire$ktor_io() {
        int i;
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!refCount$FU.compareAndSet(this, i, i + 1));
    }

    public final void unpark$ktor_io() {
        int i;
        do {
            i = this.refCount;
            if (i < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!refCount$FU.compareAndSet(this, i, 1));
    }

    public final boolean release$ktor_io() {
        int i;
        int i2;
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i2 = i - 1;
        } while (!refCount$FU.compareAndSet(this, i, i2));
        return i2 == 0;
    }
}
