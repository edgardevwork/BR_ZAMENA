package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\tJ8\u0010)\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ$\u0010*\u001a\u00020\"*\u00020+2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0014\u00101\u001a\u00020\"*\u00020\"ø\u0001\u0000¢\u0006\u0004\b2\u0010%J\n\u00101\u001a\u000203*\u000203J\u0014\u00104\u001a\u00020\"*\u00020\"ø\u0001\u0000¢\u0006\u0004\b5\u0010%J\u0014\u00106\u001a\u00020\u0019*\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b7\u0010%J\u0014\u00108\u001a\u000203*\u00020\"ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0014\u00108\u001a\u000203*\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\"*\u000203ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001c\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m7105d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "reverseDirection", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "shouldDispatchOverscroll", "getShouldDispatchOverscroll", "()Z", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "initialVelocity", "onDragStopped-sF-c-tU", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "registerNestedFling", "isFlinging", "shouldScrollImmediately", "update", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialAvailableDelta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "", "singleAxisOffset", "singleAxisOffset-MK-Hz9U", "singleAxisVelocity", "singleAxisVelocity-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ScrollingLogic {

    @NotNull
    public FlingBehavior flingBehavior;

    @NotNull
    public final MutableState<Boolean> isNestedFlinging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    public NestedScrollDispatcher nestedScrollDispatcher;

    @NotNull
    public Orientation orientation;

    @Nullable
    public OverscrollEffect overscrollEffect;
    public boolean reverseDirection;

    @NotNull
    public ScrollableState scrollableState;

    public ScrollingLogic(@NotNull ScrollableState scrollableState, @NotNull Orientation orientation, @Nullable OverscrollEffect overscrollEffect, boolean z, @NotNull FlingBehavior flingBehavior, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = z;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final void setScrollableState(@NotNull ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    /* renamed from: toOffset-tuRUvjQ */
    public final long m7972toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: singleAxisOffset-MK-Hz9U */
    public final long m7968singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m11093copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m11093copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M */
    public final float m7971toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m11099getXimpl(j) : Offset.m11100getYimpl(j);
    }

    /* renamed from: toFloat-TH1AsA0 */
    public final float m7970toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m13901getXimpl(j) : Velocity.m13902getYimpl(j);
    }

    /* renamed from: singleAxisVelocity-AH228Gc */
    public final long m7969singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m13897copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m13897copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: update-QWom1Mo */
    public final long m7973updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m13897copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m13897copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U */
    public final long m7967reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m11106timestuRUvjQ(j, -1.0f) : j;
    }

    /* renamed from: dispatchScroll-3eAAhYA */
    public final long m7963dispatchScroll3eAAhYA(@NotNull final ScrollScope scrollScope, long j, final int i) {
        Function1<Offset, Offset> function1 = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                return Offset.m11088boximpl(m7974invokeMKHz9U(offset.getPackedValue()));
            }

            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
            public final long m7974invokeMKHz9U(long j2) {
                long jM12369dispatchPreScrollOzD1aCk = this.this$0.nestedScrollDispatcher.m12369dispatchPreScrollOzD1aCk(j2, i);
                long jM11103minusMKHz9U = Offset.m11103minusMKHz9U(j2, jM12369dispatchPreScrollOzD1aCk);
                ScrollingLogic scrollingLogic = this.this$0;
                float fM7971toFloatk4lQ0M = scrollingLogic.m7971toFloatk4lQ0M(scrollingLogic.m7967reverseIfNeededMKHz9U(scrollingLogic.m7968singleAxisOffsetMKHz9U(jM11103minusMKHz9U)));
                ScrollingLogic scrollingLogic2 = this.this$0;
                long jM7967reverseIfNeededMKHz9U = scrollingLogic2.m7967reverseIfNeededMKHz9U(scrollingLogic2.m7972toOffsettuRUvjQ(scrollScope.scrollBy(fM7971toFloatk4lQ0M)));
                return Offset.m11104plusMKHz9U(Offset.m11104plusMKHz9U(jM12369dispatchPreScrollOzD1aCk, jM7967reverseIfNeededMKHz9U), this.this$0.nestedScrollDispatcher.m12367dispatchPostScrollDzOQY0M(jM7967reverseIfNeededMKHz9U, Offset.m11103minusMKHz9U(jM11103minusMKHz9U, jM7967reverseIfNeededMKHz9U), i));
            }
        };
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (NestedScrollSource.m12373equalsimpl0(i, NestedScrollSource.INSTANCE.m12381getWheelWNlRxjI())) {
            return function1.invoke(Offset.m11088boximpl(j)).getPackedValue();
        }
        if (overscrollEffect != null && getShouldDispatchOverscroll()) {
            return overscrollEffect.mo7752applyToScrollRhakbz0(j, i, function1);
        }
        return function1.invoke(Offset.m11088boximpl(j)).getPackedValue();
    }

    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* renamed from: performRawScroll-MK-Hz9U */
    public final long m7966performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        return m7972toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m7971toFloatk4lQ0M(scroll)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    @Nullable
    /* renamed from: onDragStopped-sF-c-tU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7965onDragStoppedsFctU(long j, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        ScrollingLogic scrollingLogic;
        if (continuation instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) continuation;
            int i = scrollingLogic$onDragStopped$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, continuation);
            }
        }
        Object obj = scrollingLogic$onDragStopped$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = scrollingLogic$onDragStopped$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            registerNestedFling(true);
            long jM7969singleAxisVelocityAH228Gc = m7969singleAxisVelocityAH228Gc(j);
            ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this, null);
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (overscrollEffect != null && getShouldDispatchOverscroll()) {
                scrollingLogic$onDragStopped$1.L$0 = this;
                scrollingLogic$onDragStopped$1.label = 1;
                if (overscrollEffect.mo7751applyToFlingBMRW4eQ(jM7969singleAxisVelocityAH228Gc, scrollingLogic$onDragStopped$performFling$1, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Velocity velocityM13892boximpl = Velocity.m13892boximpl(jM7969singleAxisVelocityAH228Gc);
                scrollingLogic$onDragStopped$1.L$0 = this;
                scrollingLogic$onDragStopped$1.label = 2;
                if (scrollingLogic$onDragStopped$performFling$1.invoke(velocityM13892boximpl, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            scrollingLogic = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        scrollingLogic.registerNestedFling(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0014  */
    @Nullable
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7964doFlingAnimationQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            int i = scrollingLogic$doFlingAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
            }
        }
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$12 = scrollingLogic$doFlingAnimation$1;
        Object obj = scrollingLogic$doFlingAnimation$12.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = scrollingLogic$doFlingAnimation$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j;
            ScrollableState scrollableState = this.scrollableState;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null);
            scrollingLogic$doFlingAnimation$12.L$0 = longRef2;
            scrollingLogic$doFlingAnimation$12.label = 1;
            if (ScrollableState.scroll$default(scrollableState, null, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$12, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$12.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m13892boximpl(longRef.element);
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    public final void registerNestedFling(boolean isFlinging) {
        this.isNestedFlinging.setValue(Boolean.valueOf(isFlinging));
    }

    public final void update(@NotNull ScrollableState scrollableState, @NotNull Orientation orientation, @Nullable OverscrollEffect overscrollEffect, boolean reverseDirection, @NotNull FlingBehavior flingBehavior, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = reverseDirection;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }
}
