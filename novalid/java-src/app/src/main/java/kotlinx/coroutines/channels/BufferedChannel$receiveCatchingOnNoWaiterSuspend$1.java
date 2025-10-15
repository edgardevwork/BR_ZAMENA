package kotlinx.coroutines.channels;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferedChannel.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "kotlinx.coroutines.channels.BufferedChannel", m7120f = "BufferedChannel.kt", m7121i = {0, 0, 0, 0}, m7122l = {3056}, m7123m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m7124n = {"this", "segment", FirebaseAnalytics.Param.INDEX, "r"}, m7125s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM17205receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m17205receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM17205receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17205receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m17211boximpl(objM17205receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
