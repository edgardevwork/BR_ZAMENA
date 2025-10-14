package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p003ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m7120f = "Scrollable.kt", m7121i = {0, 1, 1, 2, 2}, m7122l = {804, 807, 810}, m7123m = "invokeSuspend", m7124n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, m7125s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes3.dex */
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    public /* synthetic */ long J$0;
    public long J$1;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m7976invokesFctU(velocity.getPackedValue(), continuation);
    }

    @Nullable
    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m7976invokesFctU(long j, @Nullable Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m13892boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM12368dispatchPreFlingQWom1Mo;
        long j;
        Object objM7964doFlingAnimationQWom1Mo;
        long j2;
        long j3;
        long packedValue;
        Object objM12366dispatchPostFlingRZ2iAVY;
        long j4;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j5 = this.J$0;
            NestedScrollDispatcher nestedScrollDispatcher = this.this$0.nestedScrollDispatcher;
            this.J$0 = j5;
            this.label = 1;
            objM12368dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m12368dispatchPreFlingQWom1Mo(j5, this);
            if (objM12368dispatchPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j5;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j6 = this.J$1;
                    j4 = this.J$0;
                    ResultKt.throwOnFailure(obj);
                    packedValue = j6;
                    objM12366dispatchPostFlingRZ2iAVY = obj;
                    return Velocity.m13892boximpl(Velocity.m13904minusAH228Gc(j4, Velocity.m13904minusAH228Gc(packedValue, ((Velocity) objM12366dispatchPostFlingRZ2iAVY).getPackedValue())));
                }
                j2 = this.J$1;
                long j7 = this.J$0;
                ResultKt.throwOnFailure(obj);
                objM7964doFlingAnimationQWom1Mo = obj;
                j3 = j7;
                packedValue = ((Velocity) objM7964doFlingAnimationQWom1Mo).getPackedValue();
                NestedScrollDispatcher nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
                long jM13904minusAH228Gc = Velocity.m13904minusAH228Gc(j2, packedValue);
                this.J$0 = j3;
                this.J$1 = packedValue;
                this.label = 3;
                objM12366dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m12366dispatchPostFlingRZ2iAVY(jM13904minusAH228Gc, packedValue, this);
                if (objM12366dispatchPostFlingRZ2iAVY != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = j3;
                return Velocity.m13892boximpl(Velocity.m13904minusAH228Gc(j4, Velocity.m13904minusAH228Gc(packedValue, ((Velocity) objM12366dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            objM12368dispatchPreFlingQWom1Mo = obj;
        }
        long jM13904minusAH228Gc2 = Velocity.m13904minusAH228Gc(j, ((Velocity) objM12368dispatchPreFlingQWom1Mo).getPackedValue());
        ScrollingLogic scrollingLogic = this.this$0;
        this.J$0 = j;
        this.J$1 = jM13904minusAH228Gc2;
        this.label = 2;
        objM7964doFlingAnimationQWom1Mo = scrollingLogic.m7964doFlingAnimationQWom1Mo(jM13904minusAH228Gc2, this);
        if (objM7964doFlingAnimationQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = jM13904minusAH228Gc2;
        j3 = j;
        packedValue = ((Velocity) objM7964doFlingAnimationQWom1Mo).getPackedValue();
        NestedScrollDispatcher nestedScrollDispatcher22 = this.this$0.nestedScrollDispatcher;
        long jM13904minusAH228Gc3 = Velocity.m13904minusAH228Gc(j2, packedValue);
        this.J$0 = j3;
        this.J$1 = packedValue;
        this.label = 3;
        objM12366dispatchPostFlingRZ2iAVY = nestedScrollDispatcher22.m12366dispatchPostFlingRZ2iAVY(jM13904minusAH228Gc3, packedValue, this);
        if (objM12366dispatchPostFlingRZ2iAVY != coroutine_suspended) {
        }
    }
}
