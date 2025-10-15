package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.OutputKt;
import io.ktor.utils.p050io.core.StringsKt;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(m7104d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\b\u0000\u0018\u0000 e2\u00020g2\u00020\u0001:\u0001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010'\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\f2\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0017¢\u0006\u0004\b.\u0010 J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001e\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR$\u0010S\u001a\u00020/2\u0006\u0010O\u001a\u00020/8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u00101\"\u0004\bQ\u0010RR$\u0010X\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\n0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\n0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010JR*\u0010^\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010U\"\u0004\ba\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010bR*\u0010\u0005\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010_\u001a\u0004\bc\u0010U\"\u0004\bd\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, m7105d2 = {"Lio/ktor/websocket/DefaultWebSocketSessionImpl;", "Lio/ktor/websocket/WebSocketSession;", "raw", "", "pingInterval", "timeoutMillis", SegmentConstantPool.INITSTRING, "(Lio/ktor/websocket/WebSocketSession;JJ)V", "Lio/ktor/utils/io/core/BytePacketBuilder;", "packet", "Lio/ktor/websocket/Frame;", TypedValues.AttributesType.S_FRAME, "", "checkMaxFrameSize", "(Lio/ktor/utils/io/core/BytePacketBuilder;Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "goingAway", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "outgoingProcessorLoop", "processIncomingExtensions", "(Lio/ktor/websocket/Frame;)Lio/ktor/websocket/Frame;", "processOutgoingExtensions", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame$Ping;", "ponger", "Lkotlinx/coroutines/Job;", "runIncomingProcessor", "(Lkotlinx/coroutines/channels/SendChannel;)Lkotlinx/coroutines/Job;", "runOrCancelPinger", "()V", "runOutgoingProcessor", "()Lkotlinx/coroutines/Job;", "Lio/ktor/websocket/CloseReason;", "reason", "", "exception", "sendCloseSequence", "(Lio/ktor/websocket/CloseReason;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", TtmlNode.START, "(Ljava/util/List;)V", "terminate", "", "tryClose", "()Z", "", "_extensions", "Ljava/util/List;", "Lkotlinx/coroutines/Deferred;", "closeReason", "Lkotlinx/coroutines/Deferred;", "getCloseReason", "()Lkotlinx/coroutines/Deferred;", "Lkotlinx/coroutines/CompletableDeferred;", "closeReasonRef", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableJob;", "context", "Lkotlinx/coroutines/CompletableJob;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getExtensions", "()Ljava/util/List;", "extensions", "Lkotlinx/coroutines/channels/Channel;", "filtered", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "value", "getMasking", "setMasking", "(Z)V", "masking", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "outgoingToBeProcessed", "newValue", "pingIntervalMillis", "J", "getPingIntervalMillis", "setPingIntervalMillis", "Lio/ktor/websocket/WebSocketSession;", "getTimeoutMillis", "setTimeoutMillis", "Companion", "ktor-websockets", "Lio/ktor/websocket/DefaultWebSocketSession;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n1789#2,3:345\n1789#2,3:348\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl\n*L\n333#1:345,3\n336#1:348,3\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultWebSocketSessionImpl implements DefaultWebSocketSession, WebSocketSession {

    @NotNull
    public final List<WebSocketExtension<?>> _extensions;

    @NotNull
    public final Deferred<CloseReason> closeReason;

    @NotNull
    public final CompletableDeferred<CloseReason> closeReasonRef;

    @NotNull
    private volatile /* synthetic */ int closed;

    @NotNull
    public final CompletableJob context;

    @NotNull
    public final CoroutineContext coroutineContext;

    @NotNull
    public final Channel<Frame> filtered;

    @NotNull
    public final Channel<Frame> outgoingToBeProcessed;
    public long pingIntervalMillis;

    @NotNull
    volatile /* synthetic */ Object pinger;

    @NotNull
    public final WebSocketSession raw;

    @NotNull
    private volatile /* synthetic */ int started;
    public long timeoutMillis;

    @NotNull
    public static final Frame.Pong EmptyPong = new Frame.Pong(new byte[0], NonDisposableHandle.INSTANCE);
    public static final /* synthetic */ AtomicReferenceFieldUpdater pinger$FU = AtomicReferenceFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, Object.class, "pinger");
    public static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "closed");
    public static final /* synthetic */ AtomicIntegerFieldUpdater started$FU = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "started");

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.DefaultWebSocketSessionImpl", m7120f = "DefaultWebSocketSession.kt", m7121i = {0}, m7122l = {327}, m7123m = "checkMaxFrameSize", m7124n = {"size"}, m7125s = {"I$0"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 */
    public static final class C105171 extends ContinuationImpl {
        public int I$0;
        public int label;
        public /* synthetic */ Object result;

        public C105171(Continuation<? super C105171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.checkMaxFrameSize(null, null, this);
        }
    }

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.DefaultWebSocketSessionImpl", m7120f = "DefaultWebSocketSession.kt", m7121i = {0, 2}, m7122l = {SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, 256, 266}, m7123m = "outgoingProcessorLoop", m7124n = {"this", "this"}, m7125s = {"L$0", "L$0"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1 */
    public static final class C105181 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C105181(Continuation<? super C105181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.outgoingProcessorLoop(this);
        }
    }

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.DefaultWebSocketSessionImpl", m7120f = "DefaultWebSocketSession.kt", m7121i = {0, 0, 0}, m7122l = {281}, m7123m = "sendCloseSequence", m7124n = {"this", "exception", "reasonToSend"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1 */
    public static final class C105211 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105211(Continuation<? super C105211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.sendCloseSequence(null, null, this);
        }
    }

    public DefaultWebSocketSessionImpl(@NotNull WebSocketSession raw, long j, long j2) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.raw = raw;
        this.pinger = null;
        CompletableDeferred<CloseReason> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.closeReasonRef = completableDeferredCompletableDeferred$default;
        this.filtered = ChannelKt.Channel$default(8, null, null, 6, null);
        this.outgoingToBeProcessed = ChannelKt.Channel$default(UtilsKt.getOUTGOING_CHANNEL_CAPACITY(), null, null, 6, null);
        this.closed = 0;
        CompletableJob completableJobJob = JobKt.Job((Job) raw.getCoroutineContext().get(Job.INSTANCE));
        this.context = completableJobJob;
        this._extensions = new ArrayList();
        this.started = 0;
        this.coroutineContext = raw.getCoroutineContext().plus(completableJobJob).plus(new CoroutineName("ws-default"));
        this.pingIntervalMillis = j;
        this.timeoutMillis = j2;
        this.closeReason = completableDeferredCompletableDeferred$default;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Nullable
    public Object send(@NotNull Frame frame, @NotNull Continuation<? super Unit> continuation) {
        return DefaultWebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public ReceiveChannel<Frame> getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public SendChannel<Frame> getOutgoing() {
        return this.outgoingToBeProcessed;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public List<WebSocketExtension<?>> getExtensions() {
        return this._extensions;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.raw.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z) {
        this.raw.setMasking(z);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.raw.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.raw.setMaxFrameSize(j);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j) {
        this.pingIntervalMillis = j;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j) {
        this.timeoutMillis = j;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    @NotNull
    public Deferred<CloseReason> getCloseReason() {
        return this.closeReason;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void start(@NotNull List<? extends WebSocketExtension<?>> negotiatedExtensions) {
        Intrinsics.checkNotNullParameter(negotiatedExtensions, "negotiatedExtensions");
        if (!started$FU.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        DefaultWebSocketSessionKt.getLOGGER().trace("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + CollectionsKt___CollectionsKt.joinToString$default(negotiatedExtensions, null, null, null, 0, null, null, 63, null));
        this._extensions.addAll(negotiatedExtensions);
        runOrCancelPinger();
        runIncomingProcessor(PingPongKt.ponger(this, getOutgoing()));
        runOutgoingProcessor();
    }

    public static /* synthetic */ Object goingAway$default(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Server is going down";
        }
        return defaultWebSocketSessionImpl.goingAway(str, continuation);
    }

    @Nullable
    public final Object goingAway(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSendCloseSequence$default = sendCloseSequence$default(this, new CloseReason(CloseReason.Codes.GOING_AWAY, str), null, continuation, 2, null);
        return objSendCloseSequence$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendCloseSequence$default : Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Nullable
    public Object flush(@NotNull Continuation<? super Unit> continuation) {
        Object objFlush = this.raw.flush(continuation);
        return objFlush == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlush : Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void terminate() {
        Job.DefaultImpls.cancel$default((Job) this.context, (CancellationException) null, 1, (Object) null);
        CoroutineScopeKt.cancel$default(this.raw, null, 1, null);
    }

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", m7120f = "DefaultWebSocketSession.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, m7122l = {352, TsExtractor.TS_STREAM_TYPE_AC4, 226, 178, 179, 181, BcBands.WIDE, 211, 226, 226, 226, 226}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", TypedValues.AttributesType.S_FRAME, "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
    @SourceDebugExtension({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,344:1\n105#2:345\n82#2,6:346\n106#2:352\n92#2:353\n107#2:354\n88#2,3:355\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1\n*L\n167#1:345\n167#1:346,6\n167#1:352\n167#1:353\n167#1:354\n167#1:355,3\n*E\n"})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1 */
    /* loaded from: classes7.dex */
    public static final class C105191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SendChannel<Frame.Ping> $ponger;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C105191(SendChannel<? super Frame.Ping> sendChannel, Continuation<? super C105191> continuation) {
            super(2, continuation);
            this.$ponger = sendChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C105191 c105191 = DefaultWebSocketSessionImpl.this.new C105191(this.$ponger, continuation);
            c105191.L$0 = obj;
            return c105191;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:156:0x039d, code lost:
        
            r4 = r11.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
            io.ktor.utils.p050io.core.OutputKt.writeFully$default((io.ktor.utils.p050io.core.Output) r4, r0.getData(), 0, 0, 6, (java.lang.Object) null);
            r0 = r13;
            r29 = r12;
            r12 = r6;
            r6 = r29;
            r30 = r11;
            r11 = r8;
            r8 = r9;
            r9 = r10;
            r10 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x0251, code lost:
        
            r0 = r6;
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
            r10 = r11;
            r11 = r12;
            r12 = r13;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x016a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x017e A[Catch: all -> 0x004a, TryCatch #6 {all -> 0x004a, blocks: (B:9:0x0045, B:37:0x0176, B:39:0x017e, B:41:0x01a8, B:43:0x01b2, B:45:0x01c0, B:46:0x01c4, B:49:0x01e1, B:62:0x022b, B:64:0x022f, B:66:0x0235, B:69:0x024f, B:71:0x025e, B:73:0x0262, B:76:0x027c, B:99:0x03a0, B:21:0x00e0, B:25:0x00fd, B:28:0x0122), top: B:153:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02ae A[Catch: all -> 0x0098, TryCatch #3 {all -> 0x0098, blocks: (B:80:0x02a8, B:82:0x02ae, B:84:0x02b2, B:85:0x02b4, B:87:0x02b8, B:88:0x02c0, B:89:0x02e7, B:91:0x02eb, B:95:0x0319, B:15:0x0093), top: B:149:0x0093 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x02e7 A[Catch: all -> 0x0098, TryCatch #3 {all -> 0x0098, blocks: (B:80:0x02a8, B:82:0x02ae, B:84:0x02b2, B:85:0x02b4, B:87:0x02b8, B:88:0x02c0, B:89:0x02e7, B:91:0x02eb, B:95:0x0319, B:15:0x0093), top: B:149:0x0093 }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x03a0 A[Catch: all -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x004a, blocks: (B:9:0x0045, B:37:0x0176, B:39:0x017e, B:41:0x01a8, B:43:0x01b2, B:45:0x01c0, B:46:0x01c4, B:49:0x01e1, B:62:0x022b, B:64:0x022f, B:66:0x0235, B:69:0x024f, B:71:0x025e, B:73:0x0262, B:76:0x027c, B:99:0x03a0, B:21:0x00e0, B:25:0x00fd, B:28:0x0122), top: B:153:0x000c }] */
        /* JADX WARN: Type inference failed for: r0v42, types: [T, io.ktor.websocket.Frame] */
        /* JADX WARN: Type inference failed for: r0v74 */
        /* JADX WARN: Type inference failed for: r0v91 */
        /* JADX WARN: Type inference failed for: r4v29, types: [T, io.ktor.utils.io.core.BytePacketBuilder] */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
        /* JADX WARN: Type inference failed for: r7v28 */
        /* JADX WARN: Type inference failed for: r7v30 */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v35 */
        /* JADX WARN: Type inference failed for: r7v36 */
        /* JADX WARN: Type inference failed for: r7v37 */
        /* JADX WARN: Type inference failed for: r7v38 */
        /* JADX WARN: Type inference failed for: r7v8, types: [kotlinx.coroutines.channels.SendChannel] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0233 -> B:70:0x0251). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0279 -> B:70:0x0251). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th;
            ReceiveChannel<Frame> receiveChannel;
            CoroutineScope coroutineScope;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.BooleanRef booleanRef;
            ReceiveChannel<Frame> incoming;
            DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
            SendChannel<Frame.Ping> sendChannel;
            ChannelIterator<Frame> it;
            ChannelIterator<Frame> channelIterator;
            ReceiveChannel<Frame> receiveChannel2;
            Ref.ObjectRef objectRef3;
            CoroutineScope coroutineScope2;
            Object objHasNext;
            ?? r7;
            ChannelIterator<Frame> channelIterator2;
            SendChannel<Frame.Ping> sendChannel2;
            DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2;
            Ref.BooleanRef booleanRef2;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            CoroutineScope coroutineScope3;
            ?? r0;
            BytePacketBuilder bytePacketBuilder;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = 1;
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        objectRef = new Ref.ObjectRef();
                        objectRef2 = new Ref.ObjectRef();
                        booleanRef = new Ref.BooleanRef();
                        try {
                            incoming = DefaultWebSocketSessionImpl.this.raw.getIncoming();
                            defaultWebSocketSessionImpl = DefaultWebSocketSessionImpl.this;
                            sendChannel = this.$ponger;
                        } catch (ClosedSendChannelException unused) {
                            SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            BytePacketBuilder bytePacketBuilder2 = (BytePacketBuilder) objectRef2.element;
                            if (bytePacketBuilder2 != null) {
                                bytePacketBuilder2.release();
                                Unit unit = Unit.INSTANCE;
                            }
                            SendChannel.DefaultImpls.close$default(DefaultWebSocketSessionImpl.this.filtered, null, 1, null);
                            if (!booleanRef.element) {
                                DefaultWebSocketSessionImpl defaultWebSocketSessionImpl3 = DefaultWebSocketSessionImpl.this;
                                CloseReason closeReason = new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 10;
                                if (WebSocketSessionKt.close(defaultWebSocketSessionImpl3, closeReason, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                                DefaultWebSocketSessionImpl.this.filtered.close(th2);
                                SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                                BytePacketBuilder bytePacketBuilder3 = (BytePacketBuilder) objectRef2.element;
                                if (bytePacketBuilder3 != null) {
                                    bytePacketBuilder3.release();
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                SendChannel.DefaultImpls.close$default(DefaultWebSocketSessionImpl.this.filtered, null, 1, null);
                                if (!booleanRef.element) {
                                    DefaultWebSocketSessionImpl defaultWebSocketSessionImpl4 = DefaultWebSocketSessionImpl.this;
                                    CloseReason closeReason2 = new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.L$8 = null;
                                    this.label = 11;
                                    if (WebSocketSessionKt.close(defaultWebSocketSessionImpl4, closeReason2, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } catch (Throwable th3) {
                                SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                                BytePacketBuilder bytePacketBuilder4 = (BytePacketBuilder) objectRef2.element;
                                if (bytePacketBuilder4 != null) {
                                    bytePacketBuilder4.release();
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                SendChannel.DefaultImpls.close$default(DefaultWebSocketSessionImpl.this.filtered, null, 1, null);
                                if (booleanRef.element) {
                                    throw th3;
                                }
                                DefaultWebSocketSessionImpl defaultWebSocketSessionImpl5 = DefaultWebSocketSessionImpl.this;
                                CloseReason closeReason3 = new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                this.L$0 = th3;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 12;
                                if (WebSocketSessionKt.close(defaultWebSocketSessionImpl5, closeReason3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th3;
                            }
                        }
                        try {
                            it = incoming.iterator();
                            this.L$0 = coroutineScope;
                            this.L$1 = objectRef;
                            this.L$2 = objectRef2;
                            this.L$3 = booleanRef;
                            this.L$4 = defaultWebSocketSessionImpl;
                            this.L$5 = sendChannel;
                            this.L$6 = incoming;
                            this.L$7 = it;
                            this.L$8 = null;
                            this.label = i;
                            objHasNext = it.hasNext(this);
                            if (objHasNext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ChannelIterator<Frame> channelIterator3 = it;
                            coroutineScope2 = coroutineScope;
                            channelIterator = channelIterator3;
                            SendChannel<Frame.Ping> sendChannel3 = sendChannel;
                            objectRef3 = objectRef;
                            receiveChannel2 = incoming;
                            r7 = sendChannel3;
                            if (((Boolean) objHasNext).booleanValue()) {
                                Unit unit4 = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed(receiveChannel2, null);
                                SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                                BytePacketBuilder bytePacketBuilder5 = (BytePacketBuilder) objectRef2.element;
                                if (bytePacketBuilder5 != null) {
                                    bytePacketBuilder5.release();
                                }
                                SendChannel.DefaultImpls.close$default(DefaultWebSocketSessionImpl.this.filtered, null, 1, null);
                                if (!booleanRef.element) {
                                    DefaultWebSocketSessionImpl defaultWebSocketSessionImpl6 = DefaultWebSocketSessionImpl.this;
                                    CloseReason closeReason4 = new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.label = 9;
                                    if (WebSocketSessionKt.close(defaultWebSocketSessionImpl6, closeReason4, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            Frame next = channelIterator.next();
                            DefaultWebSocketSessionKt.getLOGGER().trace("WebSocketSession(" + coroutineScope2 + ") receiving frame " + next);
                            if (next instanceof Frame.Close) {
                                if (!defaultWebSocketSessionImpl.getOutgoing().isClosedForSend()) {
                                    SendChannel<Frame> outgoing = defaultWebSocketSessionImpl.getOutgoing();
                                    CloseReason reason = FrameCommonKt.readReason((Frame.Close) next);
                                    if (reason == null) {
                                        reason = DefaultWebSocketSessionKt.NORMAL_CLOSE;
                                    }
                                    Frame.Close close = new Frame.Close(reason);
                                    this.L$0 = objectRef2;
                                    this.L$1 = booleanRef;
                                    this.L$2 = receiveChannel2;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.label = 2;
                                    if (outgoing.send(close, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                booleanRef.element = true;
                                Unit unit5 = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed(receiveChannel2, null);
                                SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                                bytePacketBuilder = (BytePacketBuilder) objectRef2.element;
                                if (bytePacketBuilder != null) {
                                    bytePacketBuilder.release();
                                }
                                SendChannel.DefaultImpls.close$default(DefaultWebSocketSessionImpl.this.filtered, null, 1, null);
                                if (!booleanRef.element) {
                                    return unit5;
                                }
                                DefaultWebSocketSessionImpl defaultWebSocketSessionImpl7 = DefaultWebSocketSessionImpl.this;
                                CloseReason closeReason5 = new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                this.L$0 = unit5;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.label = 3;
                                return WebSocketSessionKt.close(defaultWebSocketSessionImpl7, closeReason5, this) == coroutine_suspended ? coroutine_suspended : unit5;
                            }
                            if (next instanceof Frame.Pong) {
                                SendChannel sendChannel4 = (SendChannel) defaultWebSocketSessionImpl.pinger;
                                if (sendChannel4 != null) {
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = objectRef3;
                                    this.L$2 = objectRef2;
                                    this.L$3 = booleanRef;
                                    this.L$4 = defaultWebSocketSessionImpl;
                                    this.L$5 = r7;
                                    this.L$6 = receiveChannel2;
                                    this.L$7 = channelIterator;
                                    this.label = 4;
                                    if (sendChannel4.send(next, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    Unit unit6 = Unit.INSTANCE;
                                }
                            } else if (next instanceof Frame.Ping) {
                                this.L$0 = coroutineScope2;
                                this.L$1 = objectRef3;
                                this.L$2 = objectRef2;
                                this.L$3 = booleanRef;
                                this.L$4 = defaultWebSocketSessionImpl;
                                this.L$5 = r7;
                                this.L$6 = receiveChannel2;
                                this.L$7 = channelIterator;
                                this.label = 5;
                                if (r7.send(next, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                BytePacketBuilder bytePacketBuilder6 = (BytePacketBuilder) objectRef2.element;
                                this.L$0 = coroutineScope2;
                                this.L$1 = objectRef3;
                                this.L$2 = objectRef2;
                                this.L$3 = booleanRef;
                                this.L$4 = defaultWebSocketSessionImpl;
                                this.L$5 = r7;
                                this.L$6 = receiveChannel2;
                                this.L$7 = channelIterator;
                                this.L$8 = next;
                                this.label = 6;
                                if (defaultWebSocketSessionImpl.checkMaxFrameSize(bytePacketBuilder6, next, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ReceiveChannel<Frame> receiveChannel3 = receiveChannel2;
                                channelIterator2 = channelIterator;
                                r0 = next;
                                coroutineScope3 = coroutineScope2;
                                objectRef5 = objectRef3;
                                objectRef4 = objectRef2;
                                booleanRef2 = booleanRef;
                                defaultWebSocketSessionImpl2 = defaultWebSocketSessionImpl;
                                sendChannel2 = r7;
                                incoming = receiveChannel3;
                                if (!r0.getFin()) {
                                    if (objectRef5.element == null) {
                                        objectRef5.element = r0;
                                    }
                                    if (objectRef4.element == null) {
                                        objectRef4.element = new BytePacketBuilder(null, 1, null);
                                        Object obj2 = objectRef4.element;
                                        Intrinsics.checkNotNull(obj2);
                                        OutputKt.writeFully$default((Output) obj2, r0.getData(), 0, 0, 6, (Object) null);
                                        coroutineScope = coroutineScope3;
                                        Ref.ObjectRef objectRef6 = objectRef5;
                                        it = channelIterator2;
                                        objectRef = objectRef6;
                                        Ref.ObjectRef objectRef7 = objectRef4;
                                        sendChannel = sendChannel2;
                                        defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                        booleanRef = booleanRef2;
                                        objectRef2 = objectRef7;
                                    } else {
                                        Object obj22 = objectRef4.element;
                                        Intrinsics.checkNotNull(obj22);
                                        OutputKt.writeFully$default((Output) obj22, r0.getData(), 0, 0, 6, (Object) null);
                                        coroutineScope = coroutineScope3;
                                        Ref.ObjectRef objectRef62 = objectRef5;
                                        it = channelIterator2;
                                        objectRef = objectRef62;
                                        Ref.ObjectRef objectRef72 = objectRef4;
                                        sendChannel = sendChannel2;
                                        defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                        booleanRef = booleanRef2;
                                        objectRef2 = objectRef72;
                                    }
                                    i = 1;
                                    this.L$0 = coroutineScope;
                                    this.L$1 = objectRef;
                                    this.L$2 = objectRef2;
                                    this.L$3 = booleanRef;
                                    this.L$4 = defaultWebSocketSessionImpl;
                                    this.L$5 = sendChannel;
                                    this.L$6 = incoming;
                                    this.L$7 = it;
                                    this.L$8 = null;
                                    this.label = i;
                                    objHasNext = it.hasNext(this);
                                    if (objHasNext == coroutine_suspended) {
                                    }
                                } else if (objectRef5.element == null) {
                                    Channel channel = defaultWebSocketSessionImpl2.filtered;
                                    Frame frameProcessIncomingExtensions = defaultWebSocketSessionImpl2.processIncomingExtensions(r0);
                                    this.L$0 = coroutineScope3;
                                    this.L$1 = objectRef5;
                                    this.L$2 = objectRef4;
                                    this.L$3 = booleanRef2;
                                    this.L$4 = defaultWebSocketSessionImpl2;
                                    this.L$5 = sendChannel2;
                                    this.L$6 = incoming;
                                    this.L$7 = channelIterator2;
                                    this.L$8 = null;
                                    this.label = 7;
                                    if (channel.send(frameProcessIncomingExtensions, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelIterator = channelIterator2;
                                    receiveChannel2 = incoming;
                                    r7 = sendChannel2;
                                    defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                    booleanRef = booleanRef2;
                                    objectRef2 = objectRef4;
                                    objectRef3 = objectRef5;
                                    coroutineScope2 = coroutineScope3;
                                } else {
                                    Object obj3 = objectRef4.element;
                                    Intrinsics.checkNotNull(obj3);
                                    OutputKt.writeFully$default((Output) obj3, r0.getData(), 0, 0, 6, (Object) null);
                                    Frame.Companion companion = Frame.INSTANCE;
                                    Object obj4 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj4);
                                    FrameType frameType = ((Frame) obj4).getFrameType();
                                    Object obj5 = objectRef4.element;
                                    Intrinsics.checkNotNull(obj5);
                                    byte[] bytes$default = StringsKt.readBytes$default(((BytePacketBuilder) obj5).build(), 0, 1, null);
                                    Object obj6 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj6);
                                    boolean rsv1 = ((Frame) obj6).getRsv1();
                                    Object obj7 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj7);
                                    boolean rsv2 = ((Frame) obj7).getRsv2();
                                    Object obj8 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj8);
                                    Frame frameByType = companion.byType(true, frameType, bytes$default, rsv1, rsv2, ((Frame) obj8).getRsv3());
                                    objectRef5.element = null;
                                    Channel channel2 = defaultWebSocketSessionImpl2.filtered;
                                    Frame frameProcessIncomingExtensions2 = defaultWebSocketSessionImpl2.processIncomingExtensions(frameByType);
                                    this.L$0 = coroutineScope3;
                                    this.L$1 = objectRef5;
                                    this.L$2 = objectRef4;
                                    this.L$3 = booleanRef2;
                                    this.L$4 = defaultWebSocketSessionImpl2;
                                    this.L$5 = sendChannel2;
                                    this.L$6 = incoming;
                                    this.L$7 = channelIterator2;
                                    this.L$8 = null;
                                    this.label = 8;
                                    if (channel2.send(frameProcessIncomingExtensions2, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelIterator = channelIterator2;
                                    receiveChannel2 = incoming;
                                    r7 = sendChannel2;
                                    defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                    booleanRef = booleanRef2;
                                    objectRef2 = objectRef4;
                                    objectRef3 = objectRef5;
                                    coroutineScope2 = coroutineScope3;
                                }
                            }
                            CoroutineScope coroutineScope4 = coroutineScope2;
                            it = channelIterator;
                            coroutineScope = coroutineScope4;
                            SendChannel<Frame.Ping> sendChannel5 = r7;
                            incoming = receiveChannel2;
                            objectRef = objectRef3;
                            sendChannel = sendChannel5;
                            i = 1;
                            this.L$0 = coroutineScope;
                            this.L$1 = objectRef;
                            this.L$2 = objectRef2;
                            this.L$3 = booleanRef;
                            this.L$4 = defaultWebSocketSessionImpl;
                            this.L$5 = sendChannel;
                            this.L$6 = incoming;
                            this.L$7 = it;
                            this.L$8 = null;
                            this.label = i;
                            objHasNext = it.hasNext(this);
                            if (objHasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            receiveChannel = incoming;
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                ChannelsKt.cancelConsumed(receiveChannel, th);
                                throw th5;
                            }
                        }
                        break;
                    case 1:
                        channelIterator = (ChannelIterator) this.L$7;
                        receiveChannel2 = (ReceiveChannel) this.L$6;
                        SendChannel sendChannel6 = (SendChannel) this.L$5;
                        defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                        booleanRef = (Ref.BooleanRef) this.L$3;
                        objectRef2 = (Ref.ObjectRef) this.L$2;
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objHasNext = obj;
                        r7 = sendChannel6;
                        if (((Boolean) objHasNext).booleanValue()) {
                        }
                        break;
                    case 2:
                        receiveChannel2 = (ReceiveChannel) this.L$2;
                        booleanRef = (Ref.BooleanRef) this.L$1;
                        objectRef2 = (Ref.ObjectRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        booleanRef.element = true;
                        Unit unit52 = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel2, null);
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        bytePacketBuilder = (BytePacketBuilder) objectRef2.element;
                        if (bytePacketBuilder != null) {
                        }
                        SendChannel.DefaultImpls.close$default(DefaultWebSocketSessionImpl.this.filtered, null, 1, null);
                        if (!booleanRef.element) {
                        }
                        break;
                    case 3:
                        Unit unit7 = (Unit) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        return unit7;
                    case 4:
                        channelIterator = (ChannelIterator) this.L$7;
                        receiveChannel2 = (ReceiveChannel) this.L$6;
                        r7 = (SendChannel) this.L$5;
                        defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                        booleanRef = (Ref.BooleanRef) this.L$3;
                        objectRef2 = (Ref.ObjectRef) this.L$2;
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        Unit unit8 = Unit.INSTANCE;
                        CoroutineScope coroutineScope42 = coroutineScope2;
                        it = channelIterator;
                        coroutineScope = coroutineScope42;
                        SendChannel<Frame.Ping> sendChannel52 = r7;
                        incoming = receiveChannel2;
                        objectRef = objectRef3;
                        sendChannel = sendChannel52;
                        i = 1;
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef2;
                        this.L$3 = booleanRef;
                        this.L$4 = defaultWebSocketSessionImpl;
                        this.L$5 = sendChannel;
                        this.L$6 = incoming;
                        this.L$7 = it;
                        this.L$8 = null;
                        this.label = i;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        break;
                    case 5:
                        channelIterator = (ChannelIterator) this.L$7;
                        receiveChannel2 = (ReceiveChannel) this.L$6;
                        SendChannel sendChannel7 = (SendChannel) this.L$5;
                        defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                        booleanRef = (Ref.BooleanRef) this.L$3;
                        objectRef2 = (Ref.ObjectRef) this.L$2;
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        r7 = sendChannel7;
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope422 = coroutineScope2;
                        it = channelIterator;
                        coroutineScope = coroutineScope422;
                        SendChannel<Frame.Ping> sendChannel522 = r7;
                        incoming = receiveChannel2;
                        objectRef = objectRef3;
                        sendChannel = sendChannel522;
                        i = 1;
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef2;
                        this.L$3 = booleanRef;
                        this.L$4 = defaultWebSocketSessionImpl;
                        this.L$5 = sendChannel;
                        this.L$6 = incoming;
                        this.L$7 = it;
                        this.L$8 = null;
                        this.label = i;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        break;
                    case 6:
                        Frame frame = (Frame) this.L$8;
                        channelIterator2 = (ChannelIterator) this.L$7;
                        incoming = (ReceiveChannel) this.L$6;
                        sendChannel2 = (SendChannel) this.L$5;
                        defaultWebSocketSessionImpl2 = (DefaultWebSocketSessionImpl) this.L$4;
                        booleanRef2 = (Ref.BooleanRef) this.L$3;
                        objectRef4 = (Ref.ObjectRef) this.L$2;
                        objectRef5 = (Ref.ObjectRef) this.L$1;
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r0 = frame;
                            if (!r0.getFin()) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            receiveChannel = incoming;
                            throw th;
                        }
                        break;
                    case 7:
                        channelIterator = (ChannelIterator) this.L$7;
                        receiveChannel2 = (ReceiveChannel) this.L$6;
                        SendChannel sendChannel8 = (SendChannel) this.L$5;
                        defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                        booleanRef = (Ref.BooleanRef) this.L$3;
                        objectRef2 = (Ref.ObjectRef) this.L$2;
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        r7 = sendChannel8;
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope4222 = coroutineScope2;
                        it = channelIterator;
                        coroutineScope = coroutineScope4222;
                        SendChannel<Frame.Ping> sendChannel5222 = r7;
                        incoming = receiveChannel2;
                        objectRef = objectRef3;
                        sendChannel = sendChannel5222;
                        i = 1;
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef2;
                        this.L$3 = booleanRef;
                        this.L$4 = defaultWebSocketSessionImpl;
                        this.L$5 = sendChannel;
                        this.L$6 = incoming;
                        this.L$7 = it;
                        this.L$8 = null;
                        this.label = i;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        break;
                    case 8:
                        channelIterator = (ChannelIterator) this.L$7;
                        receiveChannel2 = (ReceiveChannel) this.L$6;
                        SendChannel sendChannel9 = (SendChannel) this.L$5;
                        defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                        booleanRef = (Ref.BooleanRef) this.L$3;
                        objectRef2 = (Ref.ObjectRef) this.L$2;
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        r7 = sendChannel9;
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope42222 = coroutineScope2;
                        it = channelIterator;
                        coroutineScope = coroutineScope42222;
                        SendChannel<Frame.Ping> sendChannel52222 = r7;
                        incoming = receiveChannel2;
                        objectRef = objectRef3;
                        sendChannel = sendChannel52222;
                        i = 1;
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef2;
                        this.L$3 = booleanRef;
                        this.L$4 = defaultWebSocketSessionImpl;
                        this.L$5 = sendChannel;
                        this.L$6 = incoming;
                        this.L$7 = it;
                        this.L$8 = null;
                        this.label = i;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        break;
                    case 9:
                    case 10:
                    case 11:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 12:
                        Throwable th7 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th7;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public final Job runIncomingProcessor(SendChannel<? super Frame.Ping> ponger) {
        return BuildersKt__Builders_commonKt.launch$default(this, DefaultWebSocketSessionKt.IncomingProcessorCoroutineName.plus(Dispatchers.getUnconfined()), null, new C105191(ponger, null), 2, null);
    }

    public final Job runOutgoingProcessor() {
        return BuildersKt.launch(this, DefaultWebSocketSessionKt.OutgoingProcessorCoroutineName.plus(Dispatchers.getUnconfined()), CoroutineStart.UNDISPATCHED, new C105201(null));
    }

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", m7120f = "DefaultWebSocketSession.kt", m7121i = {}, m7122l = {236, 247, 247, 247, 240, 247, 247, SnappyCompressorOutputStream.TWO_SIZE_BYTE_MARKER, 247, 247}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1 */
    /* loaded from: classes7.dex */
    public static final class C105201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C105201(Continuation<? super C105201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DefaultWebSocketSessionImpl.this.new C105201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            WebSocketSession webSocketSession;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                try {
                    try {
                    } catch (ClosedReceiveChannelException unused) {
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                        WebSocketSession webSocketSession2 = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 4;
                        if (WebSocketSessionKt.close$default(webSocketSession2, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (ClosedSendChannelException unused2) {
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                        WebSocketSession webSocketSession3 = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 3;
                        if (WebSocketSessionKt.close$default(webSocketSession3, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        DefaultWebSocketSessionImpl.this.outgoingToBeProcessed.cancel(ExceptionsKt.CancellationException("Failed to send frame", th));
                        WebSocketSession webSocketSession4 = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 8;
                        if (WebSocketSessionKt.closeExceptionally(webSocketSession4, th, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } catch (ChannelIOException unused3) {
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                    WebSocketSession webSocketSession5 = DefaultWebSocketSessionImpl.this.raw;
                    this.label = 7;
                    if (WebSocketSessionKt.close$default(webSocketSession5, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException unused4) {
                    DefaultWebSocketSessionImpl defaultWebSocketSessionImpl = DefaultWebSocketSessionImpl.this;
                    CloseReason closeReason = new CloseReason(CloseReason.Codes.NORMAL, "");
                    this.label = 5;
                    if (DefaultWebSocketSessionImpl.sendCloseSequence$default(defaultWebSocketSessionImpl, closeReason, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2 = DefaultWebSocketSessionImpl.this;
                        this.label = 1;
                        if (defaultWebSocketSessionImpl2.outgoingProcessorLoop(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                        webSocketSession = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 2;
                        if (WebSocketSessionKt.close$default(webSocketSession, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                        webSocketSession = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 2;
                        if (WebSocketSessionKt.close$default(webSocketSession, null, this, 1, null) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                        WebSocketSession webSocketSession6 = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 6;
                        if (WebSocketSessionKt.close$default(webSocketSession6, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                        WebSocketSession webSocketSession7 = DefaultWebSocketSessionImpl.this.raw;
                        this.label = 9;
                        if (WebSocketSessionKt.close$default(webSocketSession7, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 10:
                        Throwable th2 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) DefaultWebSocketSessionImpl.this.outgoingToBeProcessed, (CancellationException) null, 1, (Object) null);
                WebSocketSession webSocketSession8 = DefaultWebSocketSessionImpl.this.raw;
                this.L$0 = th3;
                this.label = 10;
                if (WebSocketSessionKt.close$default(webSocketSession8, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d9 -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object outgoingProcessorLoop(Continuation<? super Unit> continuation) throws Throwable {
        C105181 c105181;
        ChannelIterator<Frame> it;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        C105181 c1051812;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2;
        ChannelIterator<Frame> channelIterator;
        if (continuation instanceof C105181) {
            c105181 = (C105181) continuation;
            int i = c105181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105181.label = i - Integer.MIN_VALUE;
            } else {
                c105181 = new C105181(continuation);
            }
        }
        Object obj = c105181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.outgoingToBeProcessed.iterator();
            defaultWebSocketSessionImpl = this;
        } else {
            if (i2 == 1) {
                channelIterator = (ChannelIterator) c105181.L$1;
                defaultWebSocketSessionImpl2 = (DefaultWebSocketSessionImpl) c105181.L$0;
                ResultKt.throwOnFailure(obj);
                c1051812 = c105181;
                if (((Boolean) obj).booleanValue()) {
                    Frame next = channelIterator.next();
                    DefaultWebSocketSessionKt.getLOGGER().trace("Sending " + next + " from session " + defaultWebSocketSessionImpl2);
                    if (next instanceof Frame.Close) {
                        CloseReason reason = FrameCommonKt.readReason((Frame.Close) next);
                        c1051812.L$0 = null;
                        c1051812.L$1 = null;
                        c1051812.label = 2;
                        if (sendCloseSequence$default(defaultWebSocketSessionImpl2, reason, null, c1051812, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (next instanceof Frame.Text ? true : next instanceof Frame.Binary) {
                            next = defaultWebSocketSessionImpl2.processOutgoingExtensions(next);
                        }
                        SendChannel<Frame> outgoing = defaultWebSocketSessionImpl2.raw.getOutgoing();
                        c1051812.L$0 = defaultWebSocketSessionImpl2;
                        c1051812.L$1 = channelIterator;
                        c1051812.label = 3;
                        if (outgoing.send(next, c1051812) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                        c105181 = c1051812;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator<Frame> channelIterator2 = (ChannelIterator) c105181.L$1;
            DefaultWebSocketSessionImpl defaultWebSocketSessionImpl3 = (DefaultWebSocketSessionImpl) c105181.L$0;
            ResultKt.throwOnFailure(obj);
            it = channelIterator2;
            defaultWebSocketSessionImpl = defaultWebSocketSessionImpl3;
        }
        c105181.L$0 = defaultWebSocketSessionImpl;
        c105181.L$1 = it;
        c105181.label = 1;
        Object objHasNext = it.hasNext(c105181);
        if (objHasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        c1051812 = c105181;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl4 = defaultWebSocketSessionImpl;
        channelIterator = it;
        obj = objHasNext;
        defaultWebSocketSessionImpl2 = defaultWebSocketSessionImpl4;
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object sendCloseSequence$default(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, CloseReason closeReason, Throwable th, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return defaultWebSocketSessionImpl.sendCloseSequence(closeReason, th, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendCloseSequence(CloseReason closeReason, Throwable th, Continuation<? super Unit> continuation) throws Throwable {
        C105211 c105211;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        if (continuation instanceof C105211) {
            c105211 = (C105211) continuation;
            int i = c105211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105211.label = i - Integer.MIN_VALUE;
            } else {
                c105211 = new C105211(continuation);
            }
        }
        Object obj = c105211.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105211.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeReason = (CloseReason) c105211.L$2;
            th = (Throwable) c105211.L$1;
            defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) c105211.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                defaultWebSocketSessionImpl.closeReasonRef.complete(closeReason);
                if (th != null) {
                    defaultWebSocketSessionImpl.outgoingToBeProcessed.close(th);
                    defaultWebSocketSessionImpl.filtered.close(th);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                defaultWebSocketSessionImpl.closeReasonRef.complete(closeReason);
                if (th != null) {
                    defaultWebSocketSessionImpl.outgoingToBeProcessed.close(th);
                    defaultWebSocketSessionImpl.filtered.close(th);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (!tryClose()) {
            return Unit.INSTANCE;
        }
        DefaultWebSocketSessionKt.getLOGGER().trace("Sending Close Sequence for session " + this + " with reason " + closeReason + " and exception " + th);
        this.context.complete();
        if (closeReason == null) {
            closeReason = new CloseReason(CloseReason.Codes.NORMAL, "");
        }
        try {
            runOrCancelPinger();
            if (closeReason.getCode() != CloseReason.Codes.CLOSED_ABNORMALLY.getCode()) {
                SendChannel<Frame> outgoing = this.raw.getOutgoing();
                Frame.Close close = new Frame.Close(closeReason);
                c105211.L$0 = this;
                c105211.L$1 = th;
                c105211.L$2 = closeReason;
                c105211.label = 1;
                if (outgoing.send(close, c105211) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            defaultWebSocketSessionImpl = this;
            defaultWebSocketSessionImpl.closeReasonRef.complete(closeReason);
            if (th != null) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            defaultWebSocketSessionImpl = this;
            defaultWebSocketSessionImpl.closeReasonRef.complete(closeReason);
            if (th != null) {
            }
            throw th;
        }
    }

    public final boolean tryClose() {
        return closed$FU.compareAndSet(this, 0, 1);
    }

    public final void runOrCancelPinger() {
        long pingIntervalMillis = getPingIntervalMillis();
        SendChannel<Frame.Pong> sendChannelPinger = (this.closed == 0 && pingIntervalMillis > 0) ? PingPongKt.pinger(this, this.raw.getOutgoing(), pingIntervalMillis, getTimeoutMillis(), new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this, null)) : null;
        SendChannel sendChannel = (SendChannel) pinger$FU.getAndSet(this, sendChannelPinger);
        if (sendChannel != null) {
            SendChannel.DefaultImpls.close$default(sendChannel, null, 1, null);
        }
        if (sendChannelPinger != null) {
            ChannelResult.m17221isSuccessimpl(sendChannelPinger.mo17201trySendJP2dKIU(EmptyPong));
        }
        if (this.closed == 0 || sendChannelPinger == null) {
            return;
        }
        runOrCancelPinger();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkMaxFrameSize(BytePacketBuilder bytePacketBuilder, Frame frame, Continuation<? super Unit> continuation) throws Throwable {
        C105171 c105171;
        int i;
        if (continuation instanceof C105171) {
            c105171 = (C105171) continuation;
            int i2 = c105171.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c105171.label = i2 - Integer.MIN_VALUE;
            } else {
                c105171 = new C105171(continuation);
            }
        }
        Object obj = c105171.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c105171.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int length = frame.getData().length + (bytePacketBuilder != null ? bytePacketBuilder.getSize() : 0);
            if (length > getMaxFrameSize()) {
                if (bytePacketBuilder != null) {
                    bytePacketBuilder.release();
                }
                CloseReason closeReason = new CloseReason(CloseReason.Codes.TOO_BIG, "Frame is too big: " + length + ". Max size is " + getMaxFrameSize());
                c105171.I$0 = length;
                c105171.label = 1;
                if (WebSocketSessionKt.close(this, closeReason, c105171) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = length;
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c105171.I$0;
            ResultKt.throwOnFailure(obj);
        }
        throw new FrameTooBigException(i);
    }

    public final Frame processIncomingExtensions(Frame frame) {
        Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((WebSocketExtension) it.next()).processIncomingFrame(frame);
        }
        return frame;
    }

    public final Frame processOutgoingExtensions(Frame frame) {
        Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((WebSocketExtension) it.next()).processOutgoingFrame(frame);
        }
        return frame;
    }
}
