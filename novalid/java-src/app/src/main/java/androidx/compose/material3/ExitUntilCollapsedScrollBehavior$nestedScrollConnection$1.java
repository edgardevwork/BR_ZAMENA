package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@Metadata(m7104d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m7105d2 = {"androidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitUntilCollapsedScrollBehavior this$0;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.this$0 = exitUntilCollapsedScrollBehavior;
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7962onPreScrollOzD1aCk(long available, int source) {
        if (!this.this$0.getCanScroll().invoke().booleanValue() || Offset.m11100getYimpl(available) > 0.0f) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m11100getYimpl(available));
        if (heightOffset != this.this$0.getState().getHeightOffset()) {
            return Offset.m11093copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
        }
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7961onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        state.setContentOffset(state.getContentOffset() + Offset.m11100getYimpl(consumed));
        if (Offset.m11100getYimpl(available) < 0.0f || Offset.m11100getYimpl(consumed) < 0.0f) {
            float heightOffset = this.this$0.getState().getHeightOffset();
            this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m11100getYimpl(consumed));
            return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset);
        }
        if (Offset.m11100getYimpl(consumed) == 0.0f && Offset.m11100getYimpl(available) > 0.0f) {
            this.this$0.getState().setContentOffset(0.0f);
        }
        if (Offset.m11100getYimpl(available) > 0.0f) {
            float heightOffset2 = this.this$0.getState().getHeightOffset();
            this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m11100getYimpl(available));
            return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset2);
        }
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7960onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
        C1440x78ae0263 c1440x78ae0263;
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
        long j3;
        if (continuation instanceof C1440x78ae0263) {
            c1440x78ae0263 = (C1440x78ae0263) continuation;
            int i = c1440x78ae0263.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1440x78ae0263.label = i - Integer.MIN_VALUE;
            } else {
                c1440x78ae0263 = new C1440x78ae0263(this, continuation);
            }
        }
        Object objMo7960onPostFlingRZ2iAVY = c1440x78ae0263.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1440x78ae0263.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo7960onPostFlingRZ2iAVY);
            c1440x78ae0263.L$0 = this;
            c1440x78ae0263.J$0 = j2;
            c1440x78ae0263.label = 1;
            objMo7960onPostFlingRZ2iAVY = super.mo7960onPostFlingRZ2iAVY(j, j2, c1440x78ae0263);
            if (objMo7960onPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = c1440x78ae0263.J$0;
                ResultKt.throwOnFailure(objMo7960onPostFlingRZ2iAVY);
                return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j3, ((Velocity) objMo7960onPostFlingRZ2iAVY).getPackedValue()));
            }
            j2 = c1440x78ae0263.J$0;
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = (ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) c1440x78ae0263.L$0;
            ResultKt.throwOnFailure(objMo7960onPostFlingRZ2iAVY);
        }
        long packedValue = ((Velocity) objMo7960onPostFlingRZ2iAVY).getPackedValue();
        TopAppBarState state = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getState();
        float fM13902getYimpl = Velocity.m13902getYimpl(j2);
        DecayAnimationSpec<Float> flingAnimationSpec = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getFlingAnimationSpec();
        AnimationSpec<Float> snapAnimationSpec = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getSnapAnimationSpec();
        c1440x78ae0263.L$0 = null;
        c1440x78ae0263.J$0 = packedValue;
        c1440x78ae0263.label = 2;
        objMo7960onPostFlingRZ2iAVY = AppBarKt.settleAppBar(state, fM13902getYimpl, flingAnimationSpec, snapAnimationSpec, c1440x78ae0263);
        if (objMo7960onPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        j3 = packedValue;
        return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j3, ((Velocity) objMo7960onPostFlingRZ2iAVY).getPackedValue()));
    }
}
