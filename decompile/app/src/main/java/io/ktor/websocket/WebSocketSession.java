package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketSession.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u001c\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001dH'R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m7105d2 = {"Lio/ktor/websocket/WebSocketSession;", "Lkotlinx/coroutines/CoroutineScope;", "extensions", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/websocket/Frame;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "masking", "", "getMasking", "()Z", "setMasking", "(Z)V", "maxFrameSize", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "flush", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", TypedValues.AttributesType.S_FRAME, "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface WebSocketSession extends CoroutineScope {
    @Nullable
    Object flush(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    List<WebSocketExtension<?>> getExtensions();

    @NotNull
    ReceiveChannel<Frame> getIncoming();

    boolean getMasking();

    long getMaxFrameSize();

    @NotNull
    SendChannel<Frame> getOutgoing();

    @Nullable
    Object send(@NotNull Frame frame, @NotNull Continuation<? super Unit> continuation);

    void setMasking(boolean z);

    void setMaxFrameSize(long j);

    @Deprecated(message = "Use cancel() instead.", replaceWith = @ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    void terminate();

    /* compiled from: WebSocketSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @Nullable
        public static Object send(@NotNull WebSocketSession webSocketSession, @NotNull Frame frame, @NotNull Continuation<? super Unit> continuation) {
            Object objSend = webSocketSession.getOutgoing().send(frame, continuation);
            return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
    }
}
