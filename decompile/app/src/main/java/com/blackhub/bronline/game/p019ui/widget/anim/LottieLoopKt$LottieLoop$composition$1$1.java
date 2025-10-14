package com.blackhub.bronline.game.p019ui.widget.anim;

import com.airbnb.lottie.compose.LottieRetrySignal;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieLoop.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m7105d2 = {"<anonymous>", "", "failCount", "", "exception", ""}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt$LottieLoop$composition$1$1", m7120f = "LottieLoop.kt", m7121i = {}, m7122l = {34}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class LottieLoopKt$LottieLoop$composition$1$1 extends SuspendLambda implements Function3<Integer, Throwable, Continuation<? super Boolean>, Object> {
    public final /* synthetic */ int $animResId;
    public final /* synthetic */ LottieRetrySignal $retrySignal;
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieLoopKt$LottieLoop$composition$1$1(int i, LottieRetrySignal lottieRetrySignal, Continuation<? super LottieLoopKt$LottieLoop$composition$1$1> continuation) {
        super(3, continuation);
        this.$animResId = i;
        this.$retrySignal = lottieRetrySignal;
    }

    @Nullable
    public final Object invoke(int i, @NotNull Throwable th, @Nullable Continuation<? super Boolean> continuation) {
        LottieLoopKt$LottieLoop$composition$1$1 lottieLoopKt$LottieLoop$composition$1$1 = new LottieLoopKt$LottieLoop$composition$1$1(this.$animResId, this.$retrySignal, continuation);
        lottieLoopKt$LottieLoop$composition$1$1.I$0 = i;
        lottieLoopKt$LottieLoop$composition$1$1.L$0 = th;
        return lottieLoopKt$LottieLoop$composition$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th, Continuation<? super Boolean> continuation) {
        return invoke(num.intValue(), th, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.I$0;
            Throwable th = (Throwable) this.L$0;
            UtilsKt.crashlyticsLog("LottieLoop: animResId " + this.$animResId + " failCount " + i2 + " exception " + th);
            LottieRetrySignal lottieRetrySignal = this.$retrySignal;
            this.label = 1;
            if (lottieRetrySignal.awaitRetry(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
