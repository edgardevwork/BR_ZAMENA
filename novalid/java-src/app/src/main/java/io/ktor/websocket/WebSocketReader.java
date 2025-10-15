package io.ktor.websocket;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.util.NIOKt;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketReader.kt */
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0011\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020$2\u0006\u0010'\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m7105d2 = {"Lio/ktor/websocket/WebSocketReader;", "Lkotlinx/coroutines/CoroutineScope;", "byteChannel", "Lio/ktor/utils/io/ByteReadChannel;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "maxFrameSize", "", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;JLio/ktor/utils/io/pool/ObjectPool;)V", "collector", "Lio/ktor/websocket/SimpleFrameCollector;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "frameParser", "Lio/ktor/websocket/FrameParser;", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/websocket/Frame;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "queue", "Lkotlinx/coroutines/channels/Channel;", "readerJob", "Lkotlinx/coroutines/Job;", "getReaderJob$annotations", "()V", "state", "Lio/ktor/websocket/WebSocketReader$State;", "handleFrameIfProduced", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseLoop", "buffer", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readLoop", "State", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class WebSocketReader implements CoroutineScope {

    @NotNull
    public final ByteReadChannel byteChannel;

    @NotNull
    public final SimpleFrameCollector collector;

    @NotNull
    public final CoroutineContext coroutineContext;

    @NotNull
    public final FrameParser frameParser;
    public long maxFrameSize;

    @NotNull
    public final Channel<Frame> queue;

    @NotNull
    public final Job readerJob;

    @NotNull
    public State state;

    /* compiled from: WebSocketReader.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lio/ktor/websocket/WebSocketReader$State;", "", "(Ljava/lang/String;I)V", "HEADER", "BODY", "CLOSED", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public enum State {
        HEADER,
        BODY,
        CLOSED
    }

    /* compiled from: WebSocketReader.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WebSocketReader.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketReader", m7120f = "WebSocketReader.kt", m7121i = {0}, m7122l = {115}, m7123m = "handleFrameIfProduced", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 */
    /* loaded from: classes6.dex */
    public static final class C105331 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C105331(Continuation<? super C105331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.handleFrameIfProduced(this);
        }
    }

    /* compiled from: WebSocketReader.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketReader", m7120f = "WebSocketReader.kt", m7121i = {0, 0, 1, 1}, m7122l = {92, 100}, m7123m = "parseLoop", m7124n = {"this", "buffer", "this", "buffer"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.WebSocketReader$parseLoop$1 */
    /* loaded from: classes6.dex */
    public static final class C105341 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C105341(Continuation<? super C105341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.parseLoop(null, this);
        }
    }

    /* compiled from: WebSocketReader.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketReader", m7120f = "WebSocketReader.kt", m7121i = {0, 0, 1, 1}, m7122l = {68, 74}, m7123m = "readLoop", m7124n = {"this", "buffer", "this", "buffer"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.WebSocketReader$readLoop$1 */
    /* loaded from: classes6.dex */
    public static final class C105351 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C105351(Continuation<? super C105351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.readLoop(null, this);
        }
    }

    public static /* synthetic */ void getReaderJob$annotations() {
    }

    public WebSocketReader(@NotNull ByteReadChannel byteChannel, @NotNull CoroutineContext coroutineContext, long j, @NotNull ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(byteChannel, "byteChannel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.byteChannel = byteChannel;
        this.coroutineContext = coroutineContext;
        this.maxFrameSize = j;
        this.state = State.HEADER;
        this.frameParser = new FrameParser();
        this.collector = new SimpleFrameCollector();
        this.queue = ChannelKt.Channel$default(8, null, null, 6, null);
        this.readerJob = BuildersKt.launch(this, new CoroutineName("ws-reader"), CoroutineStart.ATOMIC, new WebSocketReader$readerJob$1(pool, this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void setMaxFrameSize(long j) {
        this.maxFrameSize = j;
    }

    public /* synthetic */ WebSocketReader(ByteReadChannel byteReadChannel, CoroutineContext coroutineContext, long j, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, coroutineContext, j, (i & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    @NotNull
    public final ReceiveChannel<Frame> getIncoming() {
        return this.queue;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0083 -> B:46:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readLoop(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        C105351 c105351;
        WebSocketReader webSocketReader;
        WebSocketReader webSocketReader2;
        if (continuation instanceof C105351) {
            c105351 = (C105351) continuation;
            int i = c105351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105351.label = i - Integer.MIN_VALUE;
            } else {
                c105351 = new C105351(continuation);
            }
        }
        Object obj = c105351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBuffer.clear();
            webSocketReader = this;
            if (webSocketReader.state != State.CLOSED) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c105351.L$1;
            webSocketReader2 = (WebSocketReader) c105351.L$0;
            ResultKt.throwOnFailure(obj);
            webSocketReader = webSocketReader2;
            byteBuffer.compact();
            if (webSocketReader.state != State.CLOSED) {
                ByteReadChannel byteReadChannel = webSocketReader.byteChannel;
                c105351.L$0 = webSocketReader;
                c105351.L$1 = byteBuffer;
                c105351.label = 1;
                Object available = byteReadChannel.readAvailable(byteBuffer, c105351);
                if (available == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webSocketReader2 = webSocketReader;
                obj = available;
                if (((Number) obj).intValue() != -1) {
                    webSocketReader2.state = State.CLOSED;
                } else {
                    byteBuffer.flip();
                    c105351.L$0 = webSocketReader2;
                    c105351.L$1 = byteBuffer;
                    c105351.label = 2;
                    if (webSocketReader2.parseLoop(byteBuffer, c105351) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    webSocketReader = webSocketReader2;
                    byteBuffer.compact();
                    if (webSocketReader.state != State.CLOSED) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        byteBuffer = (ByteBuffer) c105351.L$1;
        webSocketReader2 = (WebSocketReader) c105351.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Number) obj).intValue() != -1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseLoop(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        C105341 c105341;
        WebSocketReader webSocketReader;
        if (continuation instanceof C105341) {
            c105341 = (C105341) continuation;
            int i = c105341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105341.label = i - Integer.MIN_VALUE;
            } else {
                c105341 = new C105341(continuation);
            }
        }
        Object obj = c105341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            webSocketReader = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c105341.L$1;
            webSocketReader = (WebSocketReader) c105341.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteBuffer.hasRemaining()) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[webSocketReader.state.ordinal()];
            if (i3 == 1) {
                webSocketReader.frameParser.frame(byteBuffer);
                if (webSocketReader.frameParser.getBodyReady()) {
                    webSocketReader.state = State.BODY;
                    if (webSocketReader.frameParser.getLength() > ParserMinimalBase.MAX_INT_L || webSocketReader.frameParser.getLength() > webSocketReader.maxFrameSize) {
                        throw new FrameTooBigException(webSocketReader.frameParser.getLength());
                    }
                    webSocketReader.collector.start((int) webSocketReader.frameParser.getLength(), byteBuffer);
                    c105341.L$0 = webSocketReader;
                    c105341.L$1 = byteBuffer;
                    c105341.label = 1;
                    if (webSocketReader.handleFrameIfProduced(c105341) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else if (i3 == 2) {
                webSocketReader.collector.handle(byteBuffer);
                c105341.L$0 = webSocketReader;
                c105341.L$1 = byteBuffer;
                c105341.label = 2;
                if (webSocketReader.handleFrameIfProduced(c105341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == 3) {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleFrameIfProduced(Continuation<? super Unit> continuation) throws Throwable {
        C105331 c105331;
        WebSocketReader webSocketReader;
        if (continuation instanceof C105331) {
            c105331 = (C105331) continuation;
            int i = c105331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105331.label = i - Integer.MIN_VALUE;
            } else {
                c105331 = new C105331(continuation);
            }
        }
        Object obj = c105331.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.collector.getHasRemaining()) {
                this.state = this.frameParser.getFrameType() == FrameType.CLOSE ? State.CLOSED : State.HEADER;
                FrameParser frameParser = this.frameParser;
                Frame frameByType = Frame.INSTANCE.byType(frameParser.getFin(), frameParser.getFrameType(), NIOKt.moveToByteArray(this.collector.take(frameParser.getMaskKey())), frameParser.getRsv1(), frameParser.getRsv2(), frameParser.getRsv3());
                Channel<Frame> channel = this.queue;
                c105331.L$0 = this;
                c105331.label = 1;
                if (channel.send(frameByType, c105331) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webSocketReader = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        webSocketReader = (WebSocketReader) c105331.L$0;
        ResultKt.throwOnFailure(obj);
        webSocketReader.frameParser.bodyComplete();
        return Unit.INSTANCE;
    }
}
