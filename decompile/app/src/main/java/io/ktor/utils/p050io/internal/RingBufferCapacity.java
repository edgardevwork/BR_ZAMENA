package io.ktor.utils.p050io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: RingBufferCapacity.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u000203B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0004J\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0013J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010$\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0015\u0010%\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b%\u0010\"R&\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00018Æ\u0002@Â\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0004R&\u0010-\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00018Æ\u0002@Â\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010(\"\u0004\b,\u0010\u0004R&\u00100\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00018Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010(\"\u0004\b/\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00101¨\u00062"}, m7105d2 = {"Lio/ktor/utils/io/internal/RingBufferCapacity;", "", "totalCapacity", SegmentConstantPool.INITSTRING, "(I)V", "n", "", "completeRead", "remaining", "update", "", "completeReadOverflow", "(III)Ljava/lang/Void;", "completeWrite", "pending", "completeWriteOverflow", "(II)Ljava/lang/Void;", "", "flush", "()Z", "forceLockForRelease", "()V", "isEmpty", "isFull", "resetForRead", "resetForWrite", "", "toString", "()Ljava/lang/String;", "tryLockForRelease", "tryReadAtLeast", "(I)I", "tryReadAtMost", "tryReadExact", "(I)Z", "tryWriteAtLeast", "tryWriteAtMost", "tryWriteExact", "value", "getAvailableForRead", "()I", "setAvailableForRead", "availableForRead", "getAvailableForWrite", "setAvailableForWrite", "availableForWrite", "getPendingToFlush", "setPendingToFlush", "pendingToFlush", "I", "ktor-io", ""}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRingBufferCapacity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RingBufferCapacity.kt\nio/ktor/utils/io/internal/RingBufferCapacity\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,152:1\n24#1:188\n12#1:189\n12#1,7:191\n24#1:198\n371#2,4:153\n360#2,4:157\n371#2,4:161\n371#2,4:165\n360#2,4:169\n371#2,4:173\n360#2,4:177\n360#2,4:181\n360#2,3:185\n363#2:190\n*S KotlinDebug\n*F\n+ 1 RingBufferCapacity.kt\nio/ktor/utils/io/internal/RingBufferCapacity\n*L\n130#1:188\n130#1:189\n149#1:191,7\n150#1:198\n43#1:153,4\n51#1:157,4\n59#1:161,4\n68#1:165,4\n76#1:169,4\n84#1:173,4\n93#1:177,4\n105#1:181,4\n129#1:185,3\n129#1:190\n*E\n"})
/* loaded from: classes5.dex */
public final class RingBufferCapacity {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForRead$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForWrite$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForWrite$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _pendingToFlush$FU = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_pendingToFlush");

    @NotNull
    public volatile /* synthetic */ int _availableForWrite$internal;
    public final int totalCapacity;

    @NotNull
    public volatile /* synthetic */ int _availableForRead$internal = 0;

    @NotNull
    volatile /* synthetic */ int _pendingToFlush = 0;

    public RingBufferCapacity(int i) {
        this.totalCapacity = i;
        this._availableForWrite$internal = i;
    }

    /* renamed from: getAvailableForRead, reason: from getter */
    public final int get_availableForRead$internal() {
        return this._availableForRead$internal;
    }

    public final void setAvailableForRead(int i) {
        this._availableForRead$internal = i;
    }

    /* renamed from: getAvailableForWrite, reason: from getter */
    public final int get_availableForWrite$internal() {
        return this._availableForWrite$internal;
    }

    public final void setAvailableForWrite(int i) {
        this._availableForWrite$internal = i;
    }

    /* renamed from: getPendingToFlush, reason: from getter */
    public final int get_pendingToFlush() {
        return this._pendingToFlush;
    }

    public final void setPendingToFlush(int i) {
        this._pendingToFlush = i;
    }

    public final void resetForWrite() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.totalCapacity;
    }

    public final void resetForRead() {
        this._availableForRead$internal = this.totalCapacity;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final Void completeReadOverflow(int remaining, int update, int n) {
        throw new IllegalArgumentException("Completed read overflow: " + remaining + " + " + n + " = " + update + " > " + this.totalCapacity);
    }

    public final Void completeWriteOverflow(int pending, int n) {
        throw new IllegalArgumentException("Complete write overflow: " + pending + " + " + n + " > " + this.totalCapacity);
    }

    public final boolean flush() {
        int andSet = _pendingToFlush$FU.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : _availableForRead$FU$internal.addAndGet(this, andSet) > 0;
    }

    public final void forceLockForRelease() {
        _availableForWrite$FU$internal.getAndSet(this, 0);
    }

    public final boolean isEmpty() {
        return this._availableForWrite$internal == this.totalCapacity;
    }

    public final boolean isFull() {
        return this._availableForWrite$internal == 0;
    }

    @NotNull
    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.totalCapacity + AbstractJsonLexerKt.END_LIST;
    }

    public final int tryReadAtLeast(int n) {
        int i;
        do {
            i = this._availableForRead$internal;
            if (i < n) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, 0));
        return i;
    }

    public final boolean tryReadExact(int n) {
        int i;
        do {
            i = this._availableForRead$internal;
            if (i < n) {
                return false;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, i - n));
        return true;
    }

    public final int tryReadAtMost(int n) {
        int i;
        int iMin;
        do {
            i = this._availableForRead$internal;
            iMin = Math.min(n, i);
            if (iMin == 0) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, i - iMin));
        return Math.min(n, i);
    }

    public final int tryWriteAtLeast(int n) {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (i < n) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, 0));
        return i;
    }

    public final boolean tryWriteExact(int n) {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (i < n) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i - n));
        return true;
    }

    public final int tryWriteAtMost(int n) {
        int i;
        int iMin;
        do {
            i = this._availableForWrite$internal;
            iMin = Math.min(n, i);
            if (iMin == 0) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i - iMin));
        return Math.min(n, i);
    }

    public final void completeRead(int n) {
        int i;
        int i2;
        do {
            i = this._availableForWrite$internal;
            i2 = i + n;
            if (i2 > this.totalCapacity) {
                completeReadOverflow(i, i2, n);
                throw new KotlinNothingValueException();
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i2));
    }

    public final void completeWrite(int n) {
        int i;
        int i2;
        do {
            i = this._pendingToFlush;
            i2 = i + n;
            if (i2 > this.totalCapacity) {
                completeWriteOverflow(i, n);
                throw new KotlinNothingValueException();
            }
        } while (!_pendingToFlush$FU.compareAndSet(this, i, i2));
    }

    public final boolean tryLockForRelease() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.totalCapacity) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, 0));
        return true;
    }
}
