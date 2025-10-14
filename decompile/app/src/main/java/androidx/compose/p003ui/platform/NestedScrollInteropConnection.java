package androidx.compose.p003ui.platform;

import android.view.View;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NestedScrollInteropConnection.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J#\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", SVG.View.NODE_NAME, "Landroid/view/View;", "(Landroid/view/View;)V", "consumedScrollCache", "", "nestedScrollChildHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "interruptOngoingScrolls", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;

    @NotNull
    private final int[] consumedScrollCache;

    @NotNull
    private final NestedScrollingChildHelper nestedScrollChildHelper;

    @NotNull
    private final View view;

    public NestedScrollInteropConnection(@NotNull View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7962onPreScrollOzD1aCk(long available, int source) {
        if (this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m12961getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m12963toViewTypeGyEprt8(source))) {
            ArraysKt___ArraysJvmKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
            this.nestedScrollChildHelper.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m11099getXimpl(available)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m11100getYimpl(available)), this.consumedScrollCache, null, NestedScrollInteropConnectionKt.m12963toViewTypeGyEprt8(source));
            return NestedScrollInteropConnectionKt.m12962toOffsetUv8p0NA(this.consumedScrollCache, available);
        }
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7961onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m12961getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m12963toViewTypeGyEprt8(source))) {
            ArraysKt___ArraysJvmKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
            this.nestedScrollChildHelper.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m11099getXimpl(consumed)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m11100getYimpl(consumed)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m11099getXimpl(available)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m11100getYimpl(available)), null, NestedScrollInteropConnectionKt.m12963toViewTypeGyEprt8(source), this.consumedScrollCache);
            return NestedScrollInteropConnectionKt.m12962toOffsetUv8p0NA(this.consumedScrollCache, available);
        }
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo8201onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        if (!this.nestedScrollChildHelper.dispatchNestedPreFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13901getXimpl(j)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13902getYimpl(j)))) {
            j = Velocity.INSTANCE.m13912getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m13892boximpl(j);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo7960onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        if (!this.nestedScrollChildHelper.dispatchNestedFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13901getXimpl(j2)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m13902getYimpl(j2)), true)) {
            j2 = Velocity.INSTANCE.m13912getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m13892boximpl(j2);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }
}
