package io.ktor.utils.p050io.pool;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pool.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/utils/io/pool/SingleInstancePool;", "", ExifInterface.GPS_DIRECTION_TRUE, SegmentConstantPool.INITSTRING, "()V", "borrow", "()Ljava/lang/Object;", "", "dispose", "instance", "disposeInstance", "(Ljava/lang/Object;)V", "produceInstance", "recycle", "", "getCapacity", "()I", "capacity", "ktor-io", "Lio/ktor/utils/io/pool/ObjectPool;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/SingleInstancePool\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,166:1\n360#2,4:167\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/SingleInstancePool\n*L\n72#1:167,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class SingleInstancePool<T> implements ObjectPool<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater borrowed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "borrowed");
    public static final /* synthetic */ AtomicIntegerFieldUpdater disposed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "disposed");

    @NotNull
    private volatile /* synthetic */ int borrowed = 0;

    @NotNull
    private volatile /* synthetic */ int disposed = 0;

    @NotNull
    private volatile /* synthetic */ Object instance = null;

    public abstract void disposeInstance(@NotNull T instance);

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public final int getCapacity() {
        return 1;
    }

    @NotNull
    public abstract T produceInstance();

    @Override // io.ktor.utils.p050io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public final void recycle(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!disposed$FU.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        disposeInstance(instance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public final void dispose() {
        Object obj;
        if (!disposed$FU.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        disposeInstance(obj);
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    @NotNull
    public final T borrow() {
        int i;
        do {
            i = this.borrowed;
            if (i != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!borrowed$FU.compareAndSet(this, i, 1));
        T tProduceInstance = produceInstance();
        this.instance = tProduceInstance;
        return tProduceInstance;
    }
}
