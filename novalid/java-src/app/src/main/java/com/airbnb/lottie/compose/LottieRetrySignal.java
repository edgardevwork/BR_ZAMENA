package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieRetrySignal.kt */
@Stable
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "()V", "channel", "Lkotlinx/coroutines/channels/Channel;", "", "<set-?>", "", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/MutableState;", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLottieRetrySignal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieRetrySignal.kt\ncom/airbnb/lottie/compose/LottieRetrySignal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,50:1\n81#2:51\n107#2,2:52\n*S KotlinDebug\n*F\n+ 1 LottieRetrySignal.kt\ncom/airbnb/lottie/compose/LottieRetrySignal\n*L\n35#1:51\n35#1:52,2\n*E\n"})
/* loaded from: classes.dex */
public final class LottieRetrySignal {
    public static final int $stable = 0;

    @NotNull
    public final Channel<Unit> channel = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);

    /* renamed from: isAwaitingRetry$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState isAwaitingRetry = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* compiled from: LottieRetrySignal.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.LottieRetrySignal", m7120f = "LottieRetrySignal.kt", m7121i = {0}, m7122l = {45}, m7123m = "awaitRetry", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1 */
    /* loaded from: classes2.dex */
    public static final class C34591 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C34591(Continuation<? super C34591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LottieRetrySignal.this.awaitRetry(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAwaitingRetry() {
        return ((Boolean) this.isAwaitingRetry.getValue()).booleanValue();
    }

    public final void setAwaitingRetry(boolean z) {
        this.isAwaitingRetry.setValue(Boolean.valueOf(z));
    }

    public final void retry() {
        ChannelsKt.trySendBlocking(this.channel, Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitRetry(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C34591 c34591;
        LottieRetrySignal lottieRetrySignal;
        if (continuation instanceof C34591) {
            c34591 = (C34591) continuation;
            int i = c34591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34591.label = i - Integer.MIN_VALUE;
            } else {
                c34591 = new C34591(continuation);
            }
        }
        Object obj = c34591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34591.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lottieRetrySignal = (LottieRetrySignal) c34591.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                lottieRetrySignal.setAwaitingRetry(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                lottieRetrySignal.setAwaitingRetry(false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            setAwaitingRetry(true);
            Channel<Unit> channel = this.channel;
            c34591.L$0 = this;
            c34591.label = 1;
            if (channel.receive(c34591) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lottieRetrySignal = this;
            lottieRetrySignal.setAwaitingRetry(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            lottieRetrySignal = this;
            lottieRetrySignal.setAwaitingRetry(false);
            throw th;
        }
    }
}
