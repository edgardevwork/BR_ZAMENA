package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferedChannel.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "kotlinx.coroutines.channels.BufferedChannel", m7120f = "BufferedChannel.kt", m7121i = {}, m7122l = {739}, m7123m = "receiveCatching-JP2dKIU$suspendImpl", m7124n = {}, m7125s = {})
/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM17203receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m17203receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM17203receiveCatchingJP2dKIU$suspendImpl == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17203receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m17211boximpl(objM17203receiveCatchingJP2dKIU$suspendImpl);
    }
}
