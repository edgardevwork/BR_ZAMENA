package io.ktor.utils.p050io.pool;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.C7609xa7a47114;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultPool.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 $*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001$B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\r\u0010\u001b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0013\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u0012J\u0015\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m7105d2 = {"Lio/ktor/utils/io/pool/DefaultPool;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/ktor/utils/io/pool/ObjectPool;", "capacity", "", "(I)V", "getCapacity", "()I", "instances", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "maxIndex", LinkHeader.Rel.Next, "", "shift", "top", "", "borrow", "()Ljava/lang/Object;", "clearInstance", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "dispose", "", "disposeInstance", "(Ljava/lang/Object;)V", "popTop", "produceInstance", "pushTop", FirebaseAnalytics.Param.INDEX, "recycle", "tryPop", "tryPush", "", "(Ljava/lang/Object;)Z", "validateInstance", "Companion", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDefaultPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPool.kt\nio/ktor/utils/io/pool/DefaultPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Atomic.kt\nio/ktor/utils/io/utils/AtomicKt\n*L\n1#1,114:1\n1#2:115\n7#3:116\n*S KotlinDebug\n*F\n+ 1 DefaultPool.kt\nio/ktor/utils/io/pool/DefaultPool\n*L\n111#1:116\n*E\n"})
/* loaded from: classes8.dex */
public abstract class DefaultPool<T> implements ObjectPool<T> {

    @NotNull
    public static final AtomicLongFieldUpdater<DefaultPool<?>> Top;
    public final int capacity;

    @NotNull
    public final AtomicReferenceArray<T> instances;
    public final int maxIndex;

    @NotNull
    public final int[] next;
    public final int shift;
    private volatile long top;

    @NotNull
    public T clearInstance(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    public void disposeInstance(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @NotNull
    public abstract T produceInstance();

    public void validateInstance(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    public DefaultPool(int i) {
        this.capacity = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i).toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i).toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.maxIndex = iHighestOneBit;
        this.shift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.instances = new AtomicReferenceArray<>(iHighestOneBit + 1);
        this.next = new int[iHighestOneBit + 1];
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    @NotNull
    public final T borrow() {
        T tClearInstance;
        T tTryPop = tryPop();
        return (tTryPop == null || (tClearInstance = clearInstance(tTryPop)) == null) ? produceInstance() : tClearInstance;
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public final void recycle(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        validateInstance(instance);
        if (tryPush(instance)) {
            return;
        }
        disposeInstance(instance);
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public final void dispose() {
        while (true) {
            T tTryPop = tryPop();
            if (tTryPop == null) {
                return;
            } else {
                disposeInstance(tTryPop);
            }
        }
    }

    public final boolean tryPush(T instance) {
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.shift) + 1;
        for (int i = 0; i < 8; i++) {
            if (C7609xa7a47114.m1346m(this.instances, iIdentityHashCode, null, instance)) {
                pushTop(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.maxIndex;
            }
        }
        return false;
    }

    public final T tryPop() {
        int iPopTop = popTop();
        if (iPopTop == 0) {
            return null;
        }
        return this.instances.getAndSet(iPopTop, null);
    }

    public final void pushTop(int i) {
        long j;
        if (i <= 0) {
            throw new IllegalArgumentException("index should be positive".toString());
        }
        do {
            j = this.top;
            this.next[i] = (int) (4294967295L & j);
        } while (!Top.compareAndSet(this, j, ((((j >> 32) & 4294967295L) + 1) << 32) | i));
    }

    public final int popTop() {
        long j;
        long j2;
        int i;
        do {
            j = this.top;
            if (j == 0) {
                return 0;
            }
            j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                return 0;
            }
        } while (!Top.compareAndSet(this, j, (j2 << 32) | this.next[i]));
        return i;
    }

    static {
        AtomicLongFieldUpdater<DefaultPool<?>> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, new MutablePropertyReference1Impl() { // from class: io.ktor.utils.io.pool.DefaultPool$Companion$Top$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Long.valueOf(((DefaultPool) obj).top);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(@Nullable Object obj, @Nullable Object obj2) {
                ((DefaultPool) obj).top = ((Number) obj2).longValue();
            }
        }.getName());
        Intrinsics.checkNotNullExpressionValue(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        Top = atomicLongFieldUpdaterNewUpdater;
    }
}
