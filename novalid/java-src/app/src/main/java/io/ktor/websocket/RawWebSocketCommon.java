package io.ktor.websocket;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(m7104d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00014B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u00100\u001a\u000201H\u0096@ø\u0001\u0000¢\u0006\u0002\u00102J\b\u00103\u001a\u000201H\u0017R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, m7105d2 = {"Lio/ktor/websocket/RawWebSocketCommon;", "Lio/ktor/websocket/WebSocketSession;", "input", "Lio/ktor/utils/io/ByteReadChannel;", P2ArtifactParser.RuleHandler.OUTPUT, "Lio/ktor/utils/io/ByteWriteChannel;", "maxFrameSize", "", "masking", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;)V", "_incoming", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "_outgoing", "", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "extensions", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "lastOpcode", "", "getMasking", "()Z", "setMasking", "(Z)V", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "readerJob", "Lkotlinx/coroutines/Job;", "socketJob", "Lkotlinx/coroutines/CompletableJob;", "writerJob", "flush", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "FlushRequest", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class RawWebSocketCommon implements WebSocketSession {

    @NotNull
    public final Channel<Frame> _incoming;

    @NotNull
    public final Channel<Object> _outgoing;

    @NotNull
    public final CoroutineContext coroutineContext;

    @NotNull
    public final ByteReadChannel input;
    public int lastOpcode;
    public boolean masking;
    public long maxFrameSize;

    @NotNull
    public final ByteWriteChannel output;

    @NotNull
    public final Job readerJob;

    @NotNull
    public final CompletableJob socketJob;

    @NotNull
    public final Job writerJob;

    /* compiled from: RawWebSocketCommon.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.RawWebSocketCommon", m7120f = "RawWebSocketCommon.kt", m7121i = {0, 0}, m7122l = {123, 126, 131}, m7123m = "flush", m7124n = {"this", "it"}, m7125s = {"L$0", "L$2"})
    /* renamed from: io.ktor.websocket.RawWebSocketCommon$flush$1 */
    public static final class C105251 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105251(Continuation<? super C105251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommon.this.flush(this);
        }
    }

    public RawWebSocketCommon(@NotNull ByteReadChannel input, @NotNull ByteWriteChannel output, long j, boolean z, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.input = input;
        this.output = output;
        this.maxFrameSize = j;
        this.masking = z;
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        this.socketJob = completableJobJob;
        this._incoming = ChannelKt.Channel$default(8, null, null, 6, null);
        this._outgoing = ChannelKt.Channel$default(8, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(completableJobJob).plus(new CoroutineName("raw-ws"));
        CoroutineName coroutineName = new CoroutineName("ws-writer");
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        this.writerJob = BuildersKt.launch(this, coroutineName, coroutineStart, new RawWebSocketCommon$writerJob$1(this, null));
        this.readerJob = BuildersKt.launch(this, new CoroutineName("ws-reader"), coroutineStart, new RawWebSocketCommon$readerJob$1(this, null));
        completableJobJob.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Nullable
    public Object send(@NotNull Frame frame, @NotNull Continuation<? super Unit> continuation) {
        return WebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    public /* synthetic */ RawWebSocketCommon(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? ParserMinimalBase.MAX_INT_L : j, (i & 8) != 0 ? false : z, coroutineContext);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.maxFrameSize = j;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.masking;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z) {
        this.masking = z;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public ReceiveChannel<Frame> getIncoming() {
        return this._incoming;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public SendChannel<Frame> getOutgoing() {
        return this._outgoing;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public List<WebSocketExtension<?>> getExtensions() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.RawWebSocketCommon$FlushRequest] */
    @Override // io.ktor.websocket.WebSocketSession
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flush(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105251 c105251;
        FlushRequest flushRequest;
        RawWebSocketCommon rawWebSocketCommon;
        FlushRequest flushRequest2;
        Job job;
        if (continuation instanceof C105251) {
            c105251 = (C105251) continuation;
            int i = c105251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105251.label = i - Integer.MIN_VALUE;
            } else {
                c105251 = new C105251(continuation);
            }
        }
        Object obj = c105251.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c105251.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                flushRequest = new FlushRequest((Job) getCoroutineContext().get(Job.INSTANCE));
                try {
                    Channel<Object> channel = this._outgoing;
                    c105251.L$0 = this;
                    c105251.L$1 = flushRequest;
                    c105251.L$2 = flushRequest;
                    c105251.label = 1;
                    if (channel.send(flushRequest, c105251) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (ClosedSendChannelException unused) {
                    rawWebSocketCommon = this;
                    flushRequest2 = flushRequest;
                    flushRequest.complete();
                    job = rawWebSocketCommon.writerJob;
                    c105251.L$0 = flushRequest2;
                    c105251.L$1 = null;
                    c105251.L$2 = null;
                    c105251.label = 2;
                    if (job.join(c105251) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flushRequest = flushRequest2;
                    flushRequest2 = flushRequest;
                    c105251.L$0 = null;
                    c105251.L$1 = null;
                    c105251.L$2 = null;
                    c105251.label = 3;
                    if (flushRequest2.await(c105251) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                flushRequest2 = flushRequest;
                c105251.L$0 = null;
                c105251.L$1 = null;
                c105251.L$2 = null;
                c105251.label = 3;
                if (flushRequest2.await(c105251) == coroutine_suspended) {
                }
            } else if (r2 == 1) {
                flushRequest = (FlushRequest) c105251.L$2;
                flushRequest2 = (FlushRequest) c105251.L$1;
                rawWebSocketCommon = (RawWebSocketCommon) c105251.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (ClosedSendChannelException unused2) {
                    flushRequest.complete();
                    job = rawWebSocketCommon.writerJob;
                    c105251.L$0 = flushRequest2;
                    c105251.L$1 = null;
                    c105251.L$2 = null;
                    c105251.label = 2;
                    if (job.join(c105251) != coroutine_suspended) {
                    }
                }
                c105251.L$0 = null;
                c105251.L$1 = null;
                c105251.L$2 = null;
                c105251.label = 3;
                if (flushRequest2.await(c105251) == coroutine_suspended) {
                }
            } else if (r2 == 2) {
                flushRequest = (FlushRequest) c105251.L$0;
                ResultKt.throwOnFailure(obj);
                flushRequest2 = flushRequest;
                c105251.L$0 = null;
                c105251.L$1 = null;
                c105251.L$2 = null;
                c105251.label = 3;
                if (flushRequest2.await(c105251) == coroutine_suspended) {
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

    @Override // io.ktor.websocket.WebSocketSession
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void terminate() {
        SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.socketJob.complete();
    }

    /* compiled from: RawWebSocketCommon.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"Lio/ktor/websocket/RawWebSocketCommon$FlushRequest;", "", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "done", "Lkotlinx/coroutines/CompletableJob;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
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
