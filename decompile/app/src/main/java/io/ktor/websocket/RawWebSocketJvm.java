package io.ktor.websocket;

import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.pool.ObjectPool;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketSession;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RawWebSocketJvm.kt */
@Metadata(m7104d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0011\u00108\u001a\u000209H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u000209H\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR+\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, m7105d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "input", "Lio/ktor/utils/io/ByteReadChannel;", P2ArtifactParser.RuleHandler.OUTPUT, "Lio/ktor/utils/io/ByteWriteChannel;", "maxFrameSize", "", "masking", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "extensions", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "filtered", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "<set-?>", "getMasking", "()Z", "setMasking", "(Z)V", "masking$delegate", "Lkotlin/properties/ReadWriteProperty;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize$delegate", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "reader", "Lio/ktor/websocket/WebSocketReader;", "getReader$ktor_websockets", "()Lio/ktor/websocket/WebSocketReader;", "socketJob", "Lkotlinx/coroutines/CompletableJob;", "writer", "Lio/ktor/websocket/WebSocketWriter;", "getWriter$ktor_websockets", "()Lio/ktor/websocket/WebSocketWriter;", "flush", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRawWebSocketJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,100:1\n33#2,3:101\n33#2,3:104\n*S KotlinDebug\n*F\n+ 1 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n53#1:101,3\n57#1:104,3\n*E\n"})
/* loaded from: classes6.dex */
public final class RawWebSocketJvm implements WebSocketSession {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RawWebSocketJvm.class, "masking", "getMasking()Z", 0))};

    @NotNull
    public final CoroutineContext coroutineContext;

    @NotNull
    public final Channel<Frame> filtered;

    /* renamed from: masking$delegate, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty masking;

    /* renamed from: maxFrameSize$delegate, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty maxFrameSize;

    @NotNull
    public final WebSocketReader reader;

    @NotNull
    public final CompletableJob socketJob;

    @NotNull
    public final WebSocketWriter writer;

    public RawWebSocketJvm(@NotNull ByteReadChannel input, @NotNull ByteWriteChannel output, long j, boolean z, @NotNull CoroutineContext coroutineContext, @NotNull ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        this.socketJob = completableJobJob;
        this.filtered = ChannelKt.Channel$default(0, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(completableJobJob).plus(new CoroutineName("raw-ws"));
        Delegates delegates = Delegates.INSTANCE;
        final Long lValueOf = Long.valueOf(j);
        this.maxFrameSize = new ObservableProperty<Long>(lValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Long oldValue, Long newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                long jLongValue = newValue.longValue();
                oldValue.longValue();
                this.getReader().setMaxFrameSize(jLongValue);
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(z);
        this.masking = new ObservableProperty<Boolean>(boolValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.getWriter().setMasking(zBooleanValue);
            }
        };
        this.writer = new WebSocketWriter(output, getCoroutineContext(), z, pool);
        this.reader = new WebSocketReader(input, getCoroutineContext(), j, pool);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new C105291(null), 3, null);
        completableJobJob.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Nullable
    public Object send(@NotNull Frame frame, @NotNull Continuation<? super Unit> continuation) {
        return WebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    public /* synthetic */ RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? 2147483647L : j, (i & 8) != 0 ? false : z, coroutineContext, (i & 32) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public ReceiveChannel<Frame> getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public SendChannel<Frame> getOutgoing() {
        return this.writer.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    @NotNull
    public List<WebSocketExtension<?>> getExtensions() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return ((Number) this.maxFrameSize.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.maxFrameSize.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return ((Boolean) this.masking.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z) {
        this.masking.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @NotNull
    /* renamed from: getWriter$ktor_websockets, reason: from getter */
    public final WebSocketWriter getWriter() {
        return this.writer;
    }

    @NotNull
    /* renamed from: getReader$ktor_websockets, reason: from getter */
    public final WebSocketReader getReader() {
        return this.reader;
    }

    /* compiled from: RawWebSocketJvm.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.RawWebSocketJvm$1", m7120f = "RawWebSocketJvm.kt", m7121i = {2, 3}, m7122l = {67, 68, 71, 74}, m7123m = "invokeSuspend", m7124n = {"cause", "cause"}, m7125s = {"L$0", "L$0"})
    /* renamed from: io.ktor.websocket.RawWebSocketJvm$1 */
    /* loaded from: classes7.dex */
    public static final class C105291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C105291(Continuation<? super C105291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RawWebSocketJvm.this.new C105291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[Catch: all -> 0x003b, CancellationException -> 0x003d, ProtocolViolationException -> 0x003f, FrameTooBigException -> 0x0042, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x0042, CancellationException -> 0x003d, blocks: (B:19:0x0036, B:34:0x005e, B:38:0x006c, B:40:0x0074, B:30:0x0049, B:33:0x0050), top: B:61:0x000b, outer: #4 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0088 -> B:20:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProtocolViolationException protocolViolationException;
            FrameTooBigException frameTooBigException;
            ChannelIterator<Frame> it;
            ChannelIterator<Frame> channelIterator;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    try {
                    } catch (ProtocolViolationException e) {
                        SendChannel<Frame> outgoing = RawWebSocketJvm.this.getOutgoing();
                        Frame.Close close = new Frame.Close(new CloseReason(CloseReason.Codes.PROTOCOL_ERROR, e.getMessage()));
                        this.L$0 = e;
                        this.label = 4;
                        if (outgoing.send(close, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        protocolViolationException = e;
                    } catch (Throwable th) {
                        RawWebSocketJvm.this.filtered.close(th);
                    }
                } catch (FrameTooBigException e2) {
                    SendChannel<Frame> outgoing2 = RawWebSocketJvm.this.getOutgoing();
                    Frame.Close close2 = new Frame.Close(new CloseReason(CloseReason.Codes.TOO_BIG, e2.getMessage()));
                    this.L$0 = e2;
                    this.label = 3;
                    if (outgoing2.send(close2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    frameTooBigException = e2;
                } catch (CancellationException e3) {
                    RawWebSocketJvm.this.getReader().getIncoming().cancel(e3);
                }
                if (i != 0) {
                    if (i == 1) {
                        channelIterator = (ChannelIterator) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        if (i == 3) {
                            frameTooBigException = (FrameTooBigException) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            RawWebSocketJvm.this.filtered.close(frameTooBigException);
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        protocolViolationException = (ProtocolViolationException) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        RawWebSocketJvm.this.filtered.close(protocolViolationException);
                        return Unit.INSTANCE;
                    }
                    channelIterator = (ChannelIterator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = channelIterator;
                    this.L$0 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelIterator = it;
                    obj = objHasNext;
                    if (((Boolean) obj).booleanValue()) {
                        Frame next = channelIterator.next();
                        Channel channel = RawWebSocketJvm.this.filtered;
                        this.L$0 = channelIterator;
                        this.label = 2;
                        if (channel.send(next, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        this.L$0 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                it = RawWebSocketJvm.this.getReader().getIncoming().iterator();
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
            } finally {
                SendChannel.DefaultImpls.close$default(RawWebSocketJvm.this.filtered, null, 1, null);
            }
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Nullable
    public Object flush(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objFlush = this.writer.flush(continuation);
        return objFlush == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlush : Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void terminate() {
        SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.socketJob.complete();
    }
}
