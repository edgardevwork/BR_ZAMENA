package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import io.ktor.websocket.Frame;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketWriter.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00010B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020#H\u0002J!\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0011\u0010)\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020#2\u0006\u0010'\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m7105d2 = {"Lio/ktor/websocket/WebSocketWriter;", "Lkotlinx/coroutines/CoroutineScope;", "writeChannel", "Lio/ktor/utils/io/ByteWriteChannel;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "masking", "", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLio/ktor/utils/io/pool/ObjectPool;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getMasking", "()Z", "setMasking", "(Z)V", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "queue", "Lkotlinx/coroutines/channels/Channel;", "", "serializer", "Lio/ktor/websocket/Serializer;", "writeLoopJob", "Lkotlinx/coroutines/Job;", "getWriteLoopJob$annotations", "()V", "close", "", "drainQueueAndDiscard", "drainQueueAndSerialize", "firstMsg", "buffer", "(Lio/ktor/websocket/Frame;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", TypedValues.AttributesType.S_FRAME, "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLoop", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FlushRequest", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class WebSocketWriter implements CoroutineScope {

    @NotNull
    public final CoroutineContext coroutineContext;
    public boolean masking;

    @NotNull
    public final ObjectPool<ByteBuffer> pool;

    @NotNull
    public final Channel<Object> queue;

    @NotNull
    public final Serializer serializer;

    @NotNull
    public final ByteWriteChannel writeChannel;

    @NotNull
    public final Job writeLoopJob;

    /* compiled from: WebSocketWriter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketWriter", m7120f = "WebSocketWriter.kt", m7121i = {0, 0, 0, 0}, m7122l = {121}, m7123m = "drainQueueAndSerialize", m7124n = {"this", "buffer", "flush", "closeSent"}, m7125s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1 */
    /* loaded from: classes6.dex */
    public static final class C105371 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105371(Continuation<? super C105371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.drainQueueAndSerialize(null, null, this);
        }
    }

    /* compiled from: WebSocketWriter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketWriter", m7120f = "WebSocketWriter.kt", m7121i = {0, 0}, m7122l = {155, Cea708Decoder.COMMAND_DF6, MatroskaExtractor.ID_SIMPLE_BLOCK}, m7123m = "flush", m7124n = {"this", "it"}, m7125s = {"L$0", "L$2"})
    /* renamed from: io.ktor.websocket.WebSocketWriter$flush$1 */
    /* loaded from: classes6.dex */
    public static final class C105381 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105381(Continuation<? super C105381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.flush(this);
        }
    }

    /* compiled from: WebSocketWriter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketWriter", m7120f = "WebSocketWriter.kt", m7121i = {0, 0, 1, 1}, m7122l = {46, 48}, m7123m = "writeLoop", m7124n = {"this", "buffer", "this", "buffer"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.WebSocketWriter$writeLoop$1 */
    /* loaded from: classes6.dex */
    public static final class C105391 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105391(Continuation<? super C105391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.writeLoop(null, this);
        }
    }

    public static /* synthetic */ void getWriteLoopJob$annotations() {
    }

    public WebSocketWriter(@NotNull ByteWriteChannel writeChannel, @NotNull CoroutineContext coroutineContext, boolean z, @NotNull ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.writeChannel = writeChannel;
        this.coroutineContext = coroutineContext;
        this.masking = z;
        this.pool = pool;
        this.queue = ChannelKt.Channel$default(8, null, null, 6, null);
        this.serializer = new Serializer();
        this.writeLoopJob = BuildersKt.launch(this, new CoroutineName("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final boolean getMasking() {
        return this.masking;
    }

    public final void setMasking(boolean z) {
        this.masking = z;
    }

    public /* synthetic */ WebSocketWriter(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteWriteChannel, coroutineContext, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    @NotNull
    public final ObjectPool<ByteBuffer> getPool() {
        return this.pool;
    }

    @NotNull
    public final SendChannel<Frame> getOutgoing() {
        return this.queue;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: all -> 0x0040, ChannelWriteException -> 0x0043, TryCatch #5 {ChannelWriteException -> 0x0043, all -> 0x0040, blocks: (B:13:0x0037, B:39:0x00a3, B:28:0x006f, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:43:0x00af, B:45:0x00b3, B:46:0x00b9, B:47:0x00cf, B:22:0x005a), top: B:63:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a0 -> B:39:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b3 -> B:42:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeLoop(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        C105391 c105391;
        WebSocketWriter webSocketWriter;
        ChannelIterator<Object> it;
        C105391 c1053912;
        ChannelIterator<Object> channelIterator;
        C105391 c1053913;
        Object objHasNext;
        if (continuation instanceof C105391) {
            c105391 = (C105391) continuation;
            int i = c105391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105391.label = i - Integer.MIN_VALUE;
            } else {
                c105391 = new C105391(continuation);
            }
        }
        Object objDrainQueueAndSerialize = c105391.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105391.label;
        try {
            try {
            } catch (ChannelWriteException e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    ChannelIterator<Object> channelIterator2 = (ChannelIterator) c105391.L$2;
                    ByteBuffer byteBuffer2 = (ByteBuffer) c105391.L$1;
                    webSocketWriter = (WebSocketWriter) c105391.L$0;
                    ResultKt.throwOnFailure(objDrainQueueAndSerialize);
                    c1053912 = c105391;
                    channelIterator = channelIterator2;
                    byteBuffer = byteBuffer2;
                    c1053913 = c1053912;
                    if (((Boolean) objDrainQueueAndSerialize).booleanValue()) {
                    }
                    webSocketWriter.drainQueueAndDiscard();
                    return Unit.INSTANCE;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChannelIterator<Object> channelIterator3 = (ChannelIterator) c105391.L$2;
                ByteBuffer byteBuffer3 = (ByteBuffer) c105391.L$1;
                webSocketWriter = (WebSocketWriter) c105391.L$0;
                ResultKt.throwOnFailure(objDrainQueueAndSerialize);
                C105391 c1053914 = c105391;
                channelIterator = channelIterator3;
                byteBuffer = byteBuffer3;
                c1053913 = c1053914;
                if (((Boolean) objDrainQueueAndSerialize).booleanValue()) {
                    webSocketWriter.drainQueueAndDiscard();
                    return Unit.INSTANCE;
                }
                it = channelIterator;
                c105391 = c1053913;
                c105391.L$0 = webSocketWriter;
                c105391.L$1 = byteBuffer;
                c105391.L$2 = it;
                c105391.label = 1;
                objHasNext = it.hasNext(c105391);
                if (objHasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                c1053912 = c105391;
                channelIterator = it;
                objDrainQueueAndSerialize = objHasNext;
                c1053913 = c1053912;
                if (((Boolean) objDrainQueueAndSerialize).booleanValue()) {
                    Object next = channelIterator.next();
                    if (next instanceof Frame) {
                        c1053913.L$0 = webSocketWriter;
                        c1053913.L$1 = byteBuffer;
                        c1053913.L$2 = channelIterator;
                        c1053913.label = 2;
                        objDrainQueueAndSerialize = webSocketWriter.drainQueueAndSerialize((Frame) next, byteBuffer, c1053913);
                        if (objDrainQueueAndSerialize == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) objDrainQueueAndSerialize).booleanValue()) {
                        }
                        it = channelIterator;
                        c105391 = c1053913;
                        c105391.L$0 = webSocketWriter;
                        c105391.L$1 = byteBuffer;
                        c105391.L$2 = it;
                        c105391.label = 1;
                        objHasNext = it.hasNext(c105391);
                        if (objHasNext != coroutine_suspended) {
                        }
                    } else if (next instanceof FlushRequest) {
                        ((FlushRequest) next).complete();
                        it = channelIterator;
                        c105391 = c1053913;
                        c105391.L$0 = webSocketWriter;
                        c105391.L$1 = byteBuffer;
                        c105391.L$2 = it;
                        c105391.label = 1;
                        objHasNext = it.hasNext(c105391);
                        if (objHasNext != coroutine_suspended) {
                        }
                    } else {
                        throw new IllegalArgumentException("unknown message " + next);
                    }
                }
                webSocketWriter.drainQueueAndDiscard();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objDrainQueueAndSerialize);
            byteBuffer.clear();
            try {
                it = this.queue.iterator();
                webSocketWriter = this;
                c105391.L$0 = webSocketWriter;
                c105391.L$1 = byteBuffer;
                c105391.L$2 = it;
                c105391.label = 1;
                objHasNext = it.hasNext(c105391);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (ChannelWriteException e2) {
                e = e2;
                webSocketWriter = this;
                webSocketWriter.queue.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                webSocketWriter.drainQueueAndDiscard();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                webSocketWriter = this;
                webSocketWriter.queue.close(th);
                webSocketWriter.drainQueueAndDiscard();
                return Unit.INSTANCE;
            }
        } finally {
            webSocketWriter.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
            ByteWriteChannelKt.close(webSocketWriter.writeChannel);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drainQueueAndDiscard() {
        SendChannel.DefaultImpls.close$default(this.queue, null, 1, null);
        while (true) {
            try {
                Object objM17216getOrNullimpl = ChannelResult.m17216getOrNullimpl(this.queue.mo17206tryReceivePtdJZtk());
                if (objM17216getOrNullimpl != null) {
                    if (!(objM17216getOrNullimpl instanceof Frame.Close)) {
                        if (!(objM17216getOrNullimpl instanceof Frame.Ping ? true : objM17216getOrNullimpl instanceof Frame.Pong)) {
                            if (!(objM17216getOrNullimpl instanceof FlushRequest)) {
                                if (!(objM17216getOrNullimpl instanceof Frame.Text ? true : objM17216getOrNullimpl instanceof Frame.Binary)) {
                                    break;
                                }
                            } else {
                                ((FlushRequest) objM17216getOrNullimpl).complete();
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    return;
                }
            } catch (CancellationException unused) {
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x0055
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:62:0x011b, B:63:0x011d], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v13, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f6 -> B:53:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object drainQueueAndSerialize(io.ktor.websocket.Frame r8, java.nio.ByteBuffer r9, kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.drainQueueAndSerialize(io.ktor.websocket.Frame, java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object send(@NotNull Frame frame, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.queue.send(frame, continuation);
        return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flush(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105381 c105381;
        FlushRequest flushRequest;
        WebSocketWriter webSocketWriter;
        FlushRequest flushRequest2;
        Job job;
        if (continuation instanceof C105381) {
            c105381 = (C105381) continuation;
            int i = c105381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105381.label = i - Integer.MIN_VALUE;
            } else {
                c105381 = new C105381(continuation);
            }
        }
        Object obj = c105381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c105381.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                flushRequest = new FlushRequest((Job) getCoroutineContext().get(Job.INSTANCE));
                try {
                    Channel<Object> channel = this.queue;
                    c105381.L$0 = this;
                    c105381.L$1 = flushRequest;
                    c105381.L$2 = flushRequest;
                    c105381.label = 1;
                    if (channel.send(flushRequest, c105381) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (ClosedSendChannelException unused) {
                    webSocketWriter = this;
                    flushRequest2 = flushRequest;
                    flushRequest.complete();
                    job = webSocketWriter.writeLoopJob;
                    c105381.L$0 = flushRequest2;
                    c105381.L$1 = null;
                    c105381.L$2 = null;
                    c105381.label = 2;
                    if (job.join(c105381) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flushRequest = flushRequest2;
                    flushRequest2 = flushRequest;
                    c105381.L$0 = null;
                    c105381.L$1 = null;
                    c105381.L$2 = null;
                    c105381.label = 3;
                    if (flushRequest2.await(c105381) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                flushRequest2 = flushRequest;
                c105381.L$0 = null;
                c105381.L$1 = null;
                c105381.L$2 = null;
                c105381.label = 3;
                if (flushRequest2.await(c105381) == coroutine_suspended) {
                }
            } else if (r2 == 1) {
                flushRequest = (FlushRequest) c105381.L$2;
                flushRequest2 = (FlushRequest) c105381.L$1;
                webSocketWriter = (WebSocketWriter) c105381.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (ClosedSendChannelException unused2) {
                    flushRequest.complete();
                    job = webSocketWriter.writeLoopJob;
                    c105381.L$0 = flushRequest2;
                    c105381.L$1 = null;
                    c105381.L$2 = null;
                    c105381.label = 2;
                    if (job.join(c105381) != coroutine_suspended) {
                    }
                }
                c105381.L$0 = null;
                c105381.L$1 = null;
                c105381.L$2 = null;
                c105381.label = 3;
                if (flushRequest2.await(c105381) == coroutine_suspended) {
                }
            } else if (r2 == 2) {
                flushRequest = (FlushRequest) c105381.L$0;
                ResultKt.throwOnFailure(obj);
                flushRequest2 = flushRequest;
                c105381.L$0 = null;
                c105381.L$1 = null;
                c105381.L$2 = null;
                c105381.label = 3;
                if (flushRequest2.await(c105381) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            r2.complete();
            throw th;
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Will be removed")
    public final void close() {
        SendChannel.DefaultImpls.close$default(this.queue, null, 1, null);
    }

    /* compiled from: WebSocketWriter.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", "", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "done", "Lkotlinx/coroutines/CompletableJob;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class FlushRequest {

        @NotNull
        public final CompletableJob done;

        public FlushRequest(@Nullable Job job) {
            this.done = JobKt.Job(job);
        }

        public final boolean complete() {
            return this.done.complete();
        }

        @Nullable
        public final Object await(@NotNull Continuation<? super Unit> continuation) {
            Object objJoin = this.done.join(continuation);
            return objJoin == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoin : Unit.INSTANCE;
        }
    }
}
