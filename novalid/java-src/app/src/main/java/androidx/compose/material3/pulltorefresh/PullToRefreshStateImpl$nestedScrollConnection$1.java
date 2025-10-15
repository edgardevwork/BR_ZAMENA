package androidx.compose.material3.pulltorefresh;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.p003ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PullToRefresh.kt */
@Metadata(m7104d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m7105d2 = {"androidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ Function0<Boolean> $enabled;
    final /* synthetic */ PullToRefreshStateImpl this$0;

    public PullToRefreshStateImpl$nestedScrollConnection$1(Function0<Boolean> function0, PullToRefreshStateImpl pullToRefreshStateImpl) {
        this.$enabled = function0;
        this.this$0 = pullToRefreshStateImpl;
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7962onPreScrollOzD1aCk(long available, int source) {
        if (!this.$enabled.invoke().booleanValue()) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        if (NestedScrollSource.m12373equalsimpl0(source, NestedScrollSource.INSTANCE.m12378getDragWNlRxjI()) && Offset.m11100getYimpl(available) < 0.0f) {
            return this.this$0.m10199consumeAvailableOffsetMKHz9U(available);
        }
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7961onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.$enabled.invoke().booleanValue()) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        if (NestedScrollSource.m12373equalsimpl0(source, NestedScrollSource.INSTANCE.m12378getDragWNlRxjI()) && Offset.m11100getYimpl(available) > 0.0f) {
            return this.this$0.m10199consumeAvailableOffsetMKHz9U(available);
        }
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8201onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
        PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1;
        float f;
        if (continuation instanceof PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1) {
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 = (PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1) continuation;
            int i = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 = new PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1(this, continuation);
            }
        }
        Object objOnRelease = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOnRelease);
            PullToRefreshStateImpl pullToRefreshStateImpl = this.this$0;
            float fM13902getYimpl = Velocity.m13902getYimpl(j);
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.F$0 = 0.0f;
            pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.label = 1;
            objOnRelease = pullToRefreshStateImpl.onRelease(fM13902getYimpl, pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1);
            if (objOnRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = 0.0f;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = pullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1.F$0;
            ResultKt.throwOnFailure(objOnRelease);
        }
        return Velocity.m13892boximpl(VelocityKt.Velocity(f, ((Number) objOnRelease).floatValue()));
    }
}
