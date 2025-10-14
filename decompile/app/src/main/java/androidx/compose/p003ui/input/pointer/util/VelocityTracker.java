package androidx.compose.p003ui.input.pointer.util;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.p003ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: VelocityTracker.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0018ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "()V", "currentPointerPositionAccumulator", "Landroidx/compose/ui/geometry/Offset;", "getCurrentPointerPositionAccumulator-F1C5BW0$ui_release", "()J", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release", "(J)V", "J", "lastMoveEventTimeStamp", "", "getLastMoveEventTimeStamp$ui_release", "setLastMoveEventTimeStamp$ui_release", "xVelocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "yVelocityTracker", "addPosition", "", "timeMillis", "position", "addPosition-Uv8p0NA", "(JJ)V", "calculateVelocity", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "resetTracking", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private long lastMoveEventTimeStamp;

    @NotNull
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(false, null, 3, null);

    @NotNull
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(false, null, 3, null);
    private long currentPointerPositionAccumulator = Offset.INSTANCE.m11115getZeroF1C5BW0();

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name and from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m12586setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j) {
        this.currentPointerPositionAccumulator = j;
    }

    /* renamed from: getLastMoveEventTimeStamp$ui_release, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j) {
        this.lastMoveEventTimeStamp = j;
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m12582addPositionUv8p0NA(long timeMillis, long position) {
        this.xVelocityTracker.addDataPoint(timeMillis, Offset.m11099getXimpl(position));
        this.yVelocityTracker.addDataPoint(timeMillis, Offset.m11100getYimpl(position));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m12583calculateVelocity9UxMQ8M() {
        return m12584calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m12584calculateVelocityAH228Gc(long maximumVelocity) {
        if (Velocity.m13901getXimpl(maximumVelocity) <= 0.0f || Velocity.m13902getYimpl(maximumVelocity) <= 0.0f) {
            throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m13908toStringimpl(maximumVelocity))).toString());
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m13901getXimpl(maximumVelocity)), this.yVelocityTracker.calculateVelocity(Velocity.m13902getYimpl(maximumVelocity)));
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }
}
