package io.ktor.websocket;

import io.ktor.util.cio.ChannelIOException;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketReader.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.websocket.WebSocketReader$readerJob$1", m7120f = "WebSocketReader.kt", m7121i = {0}, m7122l = {40}, m7123m = "invokeSuspend", m7124n = {"buffer"}, m7125s = {"L$0"})
/* loaded from: classes7.dex */
public final class WebSocketReader$readerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ObjectPool<ByteBuffer> $pool;
    public Object L$0;
    public int label;
    public final /* synthetic */ WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(ObjectPool<ByteBuffer> objectPool, WebSocketReader webSocketReader, Continuation<? super WebSocketReader$readerJob$1> continuation) {
        super(2, continuation);
        this.$pool = objectPool;
        this.this$0 = webSocketReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WebSocketReader$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th;
        ByteBuffer byteBuffer;
        ProtocolViolationException e;
        FrameTooBigException e2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ByteBuffer byteBufferBorrow = this.$pool.borrow();
                try {
                    WebSocketReader webSocketReader = this.this$0;
                    this.L$0 = byteBufferBorrow;
                    this.label = 1;
                    if (webSocketReader.readLoop(byteBufferBorrow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (ChannelIOException unused) {
                    byteBuffer = byteBufferBorrow;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.this$0.queue, (CancellationException) null, 1, (Object) null);
                    this.$pool.recycle(byteBuffer);
                    SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
                    return Unit.INSTANCE;
                } catch (FrameTooBigException e3) {
                    byteBuffer = byteBufferBorrow;
                    e2 = e3;
                    this.this$0.queue.close(e2);
                    this.$pool.recycle(byteBuffer);
                    SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
                    return Unit.INSTANCE;
                } catch (ProtocolViolationException e4) {
                    byteBuffer = byteBufferBorrow;
                    e = e4;
                    this.this$0.queue.close(e);
                    this.$pool.recycle(byteBuffer);
                    SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
                    return Unit.INSTANCE;
                } catch (ClosedChannelException | CancellationException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                byteBuffer = byteBufferBorrow;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (ChannelIOException unused3) {
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.this$0.queue, (CancellationException) null, 1, (Object) null);
                } catch (FrameTooBigException e5) {
                    e2 = e5;
                    this.this$0.queue.close(e2);
                } catch (ProtocolViolationException e6) {
                    e = e6;
                    this.this$0.queue.close(e);
                } catch (ClosedChannelException | CancellationException unused4) {
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            this.$pool.recycle(byteBuffer);
            SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            this.$pool.recycle(coroutine_suspended);
            SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
            throw th4;
        }
    }
}
