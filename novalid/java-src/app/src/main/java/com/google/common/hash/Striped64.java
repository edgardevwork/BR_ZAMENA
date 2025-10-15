package com.google.common.hash;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class Striped64 extends Number {
    public static final Unsafe UNSAFE;
    public static final long baseOffset;
    public static final long busyOffset;
    public volatile transient long base;
    public volatile transient int busy;

    @CheckForNull
    public volatile transient Cell[] cells;
    public static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    public static final Random rng = new Random();
    public static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* renamed from: fn */
    public abstract long mo1290fn(long currentValue, long newValue);

    public static final class Cell {
        public static final Unsafe UNSAFE;
        public static final long valueOffset;

        /* renamed from: p0 */
        public volatile long f844p0;

        /* renamed from: p1 */
        public volatile long f845p1;

        /* renamed from: p2 */
        public volatile long f846p2;

        /* renamed from: p3 */
        public volatile long f847p3;

        /* renamed from: p4 */
        public volatile long f848p4;

        /* renamed from: p5 */
        public volatile long f849p5;

        /* renamed from: p6 */
        public volatile long f850p6;

        /* renamed from: q0 */
        public volatile long f851q0;

        /* renamed from: q1 */
        public volatile long f852q1;

        /* renamed from: q2 */
        public volatile long f853q2;

        /* renamed from: q3 */
        public volatile long f854q3;

        /* renamed from: q4 */
        public volatile long f855q4;

        /* renamed from: q5 */
        public volatile long f856q5;

        /* renamed from: q6 */
        public volatile long f857q6;
        public volatile long value;

        public Cell(long x) {
            this.value = x;
        }

        public final boolean cas(long cmp, long val) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, cmp, val);
        }

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(TtmlNode.RUBY_BASE));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public final boolean casBase(long cmp, long val) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, cmp, val);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void retryUpdate(long x, @CheckForNull int[] hc, boolean wasUncontended) {
        int iNextInt;
        int[] iArr;
        boolean z;
        int length;
        boolean z2;
        int length2;
        if (hc == null) {
            iArr = new int[1];
            threadHashCode.set(iArr);
            iNextInt = rng.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = hc[0];
            iArr = hc;
        }
        boolean z3 = false;
        int i = iNextInt;
        boolean z4 = wasUncontended;
        while (true) {
            Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                Cell cell = cellArr[(length - 1) & i];
                if (cell == null) {
                    if (this.busy == 0) {
                        Cell cell2 = new Cell(x);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                Cell[] cellArr2 = this.cells;
                                if (cellArr2 == null || (length2 = cellArr2.length) <= 0) {
                                    z2 = false;
                                    if (!z2) {
                                        return;
                                    }
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (cellArr2[i2] == null) {
                                        cellArr2[i2] = cell2;
                                        z2 = true;
                                    }
                                    if (!z2) {
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    z3 = false;
                } else if (z4) {
                    long j = cell.value;
                    if (cell.cas(j, mo1290fn(j, x))) {
                        return;
                    }
                    if (length >= NCPU || this.cells != cellArr) {
                        z3 = false;
                    } else if (!z3) {
                        z3 = true;
                    } else if (this.busy == 0 && casBusy()) {
                        try {
                            if (this.cells == cellArr) {
                                Cell[] cellArr3 = new Cell[length << 1];
                                for (int i3 = 0; i3 < length; i3++) {
                                    cellArr3[i3] = cellArr[i3];
                                }
                                this.cells = cellArr3;
                            }
                            this.busy = 0;
                            z3 = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    z4 = true;
                }
                int i4 = i ^ (i << 13);
                int i5 = i4 ^ (i4 >>> 17);
                i = i5 ^ (i5 << 5);
                iArr[0] = i;
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        Cell[] cellArr4 = new Cell[2];
                        cellArr4[i & 1] = new Cell(x);
                        this.cells = cellArr4;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                } finally {
                }
            } else {
                long j2 = this.base;
                if (casBase(j2, mo1290fn(j2, x))) {
                    return;
                }
            }
        }
    }

    public final void internalReset(long initialValue) {
        Cell[] cellArr = this.cells;
        this.base = initialValue;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = initialValue;
                }
            }
        }
    }

    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.Striped64.1
                    @Override // java.security.PrivilegedExceptionAction
                    public Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }
}
