package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieCompositionResult.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"awaitOrNull", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class LottieCompositionResultKt {

    /* compiled from: LottieCompositionResult.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.LottieCompositionResultKt", m7120f = "LottieCompositionResult.kt", m7121i = {}, m7122l = {85}, m7123m = "awaitOrNull", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1 */
    /* loaded from: classes2.dex */
    public static final class C34561 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C34561(Continuation<? super C34561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LottieCompositionResultKt.awaitOrNull(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitOrNull(@NotNull LottieCompositionResult lottieCompositionResult, @NotNull Continuation<? super LottieComposition> continuation) throws Throwable {
        C34561 c34561;
        if (continuation instanceof C34561) {
            c34561 = (C34561) continuation;
            int i = c34561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34561.label = i - Integer.MIN_VALUE;
            } else {
                c34561 = new C34561(continuation);
            }
        }
        Object objAwait = c34561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34561.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                c34561.label = 1;
                objAwait = lottieCompositionResult.await(c34561);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            return (LottieComposition) objAwait;
        } catch (Throwable unused) {
            return null;
        }
    }
}
