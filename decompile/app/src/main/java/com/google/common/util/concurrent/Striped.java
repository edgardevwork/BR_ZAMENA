package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import com.google.common.util.concurrent.Striped;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
/* loaded from: classes6.dex */
public abstract class Striped<L> {
    public static final int ALL_SET = -1;
    public static final int LARGE_LAZY_CUTOFF = 1024;

    public static int smear(int hashCode) {
        int i = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return (i >>> 4) ^ ((i >>> 7) ^ i);
    }

    public abstract L get(Object key);

    public abstract L getAt(int index);

    public abstract int indexFor(Object key);

    public abstract int size();

    public Striped() {
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> keys) {
        ArrayList arrayListNewArrayList = Lists.newArrayList(keys);
        if (arrayListNewArrayList.isEmpty()) {
            return ImmutableList.m1171of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i = 0; i < arrayListNewArrayList.size(); i++) {
            iArr[i] = indexFor(arrayListNewArrayList.get(i));
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i2));
        for (int i3 = 1; i3 < arrayListNewArrayList.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                arrayListNewArrayList.set(i3, arrayListNewArrayList.get(i3 - 1));
            } else {
                arrayListNewArrayList.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(arrayListNewArrayList);
    }

    public static <L> Striped<L> custom(int stripes, Supplier<L> supplier) {
        return new CompactStriped(stripes, supplier);
    }

    public static Striped<Lock> lock(int stripes) {
        return custom(stripes, new Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    public static Striped<Lock> lazyWeakLock(int stripes) {
        return lazy(stripes, new Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.lambda$lazyWeakLock$0();
            }
        });
    }

    public static <L> Striped<L> lazy(int stripes, Supplier<L> supplier) {
        if (stripes < 1024) {
            return new SmallLazyStriped(stripes, supplier);
        }
        return new LargeLazyStriped(stripes, supplier);
    }

    public static /* synthetic */ Semaphore lambda$semaphore$1(int i) {
        return new PaddedSemaphore(i);
    }

    public static Striped<Semaphore> semaphore(int stripes, final int permits) {
        return custom(stripes, new Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.lambda$semaphore$1(permits);
            }
        });
    }

    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i) {
        return new Semaphore(i, false);
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int stripes, final int permits) {
        return lazy(stripes, new Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.lambda$lazyWeakSemaphore$2(permits);
            }
        });
    }

    public static Striped<ReadWriteLock> readWriteLock(int stripes) {
        return custom(stripes, new Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda5
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int stripes) {
        return lazy(stripes, new Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.WeakSafeReadWriteLock();
            }
        });
    }

    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        public final ReadWriteLock delegate = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    /* loaded from: classes7.dex */
    public static final class WeakSafeLock extends ForwardingLock {
        public final Lock delegate;
        public final WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(Lock delegate, WeakSafeReadWriteLock strongReference) {
            this.delegate = delegate;
            this.strongReference = strongReference;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    /* loaded from: classes7.dex */
    public static final class WeakSafeCondition extends ForwardingCondition {
        public final Condition delegate;
        public final WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(Condition delegate, WeakSafeReadWriteLock strongReference) {
            this.delegate = delegate;
            this.strongReference = strongReference;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
            return this.delegate;
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        public final int mask;

        public PowerOfTwoStriped(int stripes) {
            super();
            Preconditions.checkArgument(stripes > 0, "Stripes must be positive");
            this.mask = stripes > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(stripes) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object key) {
            return Striped.smear(key.hashCode()) & this.mask;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object key) {
            return getAt(indexFor(key));
        }
    }

    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        public final Object[] array;

        public CompactStriped(int stripes, Supplier<L> supplier) {
            super(stripes);
            int i = 0;
            Preconditions.checkArgument(stripes <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i >= objArr.length) {
                    return;
                }
                objArr[i] = supplier.get();
                i++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            return (L) this.array[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }
    }

    @VisibleForTesting
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        public final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        public final ReferenceQueue<L> queue;
        public final int size;
        public final Supplier<L> supplier;

        public SmallLazyStriped(int stripes, Supplier<L> supplier) {
            super(stripes);
            this.queue = new ReferenceQueue<>();
            int i = this.mask;
            int i2 = i == -1 ? Integer.MAX_VALUE : i + 1;
            this.size = i2;
            this.locks = new AtomicReferenceArray<>(i2);
            this.supplier = supplier;
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int index) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(index, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(index);
            L l = arrayReference == null ? null : arrayReference.get();
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            ArrayReference arrayReference2 = new ArrayReference(l2, index, this.queue);
            while (!C7609xa7a47114.m1346m(this.locks, index, arrayReference, arrayReference2)) {
                arrayReference = this.locks.get(index);
                L l3 = arrayReference == null ? null : arrayReference.get();
                if (l3 != null) {
                    return l3;
                }
            }
            drainQueue();
            return l2;
        }

        public final void drainQueue() {
            while (true) {
                Reference<? extends L> referencePoll = this.queue.poll();
                if (referencePoll == null) {
                    return;
                }
                ArrayReference arrayReference = (ArrayReference) referencePoll;
                C7609xa7a47114.m1346m(this.locks, arrayReference.index, arrayReference, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }

        public static final class ArrayReference<L> extends WeakReference<L> {
            public final int index;

            public ArrayReference(L referent, int index, ReferenceQueue<L> queue) {
                super(referent, queue);
                this.index = index;
            }
        }
    }

    @VisibleForTesting
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        public final ConcurrentMap<Integer, L> locks;
        public final int size;
        public final Supplier<L> supplier;

        public LargeLazyStriped(int stripes, Supplier<L> supplier) {
            super(stripes);
            int i = this.mask;
            this.size = i == -1 ? Integer.MAX_VALUE : i + 1;
            this.supplier = supplier;
            this.locks = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            L l = this.locks.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            return (L) MoreObjects.firstNonNull(this.locks.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    public static int ceilToPowerOfTwo(int x) {
        return 1 << IntMath.log2(x, RoundingMode.CEILING);
    }

    public static class PaddedLock extends ReentrantLock {
        public long unused1;
        public long unused2;
        public long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    public static class PaddedSemaphore extends Semaphore {
        public long unused1;
        public long unused2;
        public long unused3;

        public PaddedSemaphore(int permits) {
            super(permits, false);
        }
    }
}
