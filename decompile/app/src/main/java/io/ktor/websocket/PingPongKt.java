package io.ktor.websocket;

import io.ktor.util.CryptoKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PingPong.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m7105d2 = {"PingerCoroutineName", "Lkotlinx/coroutines/CoroutineName;", "PongerCoroutineName", "pinger", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame$Pong;", "Lkotlinx/coroutines/CoroutineScope;", "outgoing", "Lio/ktor/websocket/Frame;", "periodMillis", "", "timeoutMillis", "onTimeout", "Lkotlin/Function2;", "Lio/ktor/websocket/CloseReason;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;JJLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "ponger", "Lio/ktor/websocket/Frame$Ping;", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class PingPongKt {

    @NotNull
    public static final CoroutineName PongerCoroutineName = new CoroutineName("ws-ponger");

    @NotNull
    public static final CoroutineName PingerCoroutineName = new CoroutineName("ws-pinger");

    @NotNull
    public static final SendChannel<Frame.Ping> ponger(@NotNull CoroutineScope coroutineScope, @NotNull SendChannel<? super Frame.Pong> outgoing) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        Channel channelChannel$default = ChannelKt.Channel$default(5, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, PongerCoroutineName, null, new C105241(channelChannel$default, outgoing, null), 2, null);
        return channelChannel$default;
    }

    /* compiled from: PingPong.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.PingPongKt$ponger$1", m7120f = "PingPong.kt", m7121i = {0, 1}, m7122l = {119, 32}, m7123m = "invokeSuspend", m7124n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, m7125s = {"L$1", "L$1"})
    @SourceDebugExtension({"SMAP\nPingPong.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$ponger$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,111:1\n105#2:112\n82#2,6:113\n106#2,2:119\n92#2:121\n88#2,3:122\n*S KotlinDebug\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$ponger$1\n*L\n30#1:112\n30#1:113,6\n30#1:119,2\n30#1:121\n30#1:122,3\n*E\n"})
    /* renamed from: io.ktor.websocket.PingPongKt$ponger$1 */
    /* loaded from: classes7.dex */
    public static final class C105241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Channel<Frame.Ping> $channel;
        public final /* synthetic */ SendChannel<Frame.Pong> $outgoing;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C105241(Channel<Frame.Ping> channel, SendChannel<? super Frame.Pong> sendChannel, Continuation<? super C105241> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$outgoing = sendChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C105241(this.$channel, this.$outgoing, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0052 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x005f A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:49:0x001a, B:61:0x0044, B:65:0x0056, B:67:0x005f, B:70:0x0086, B:56:0x0035, B:60:0x0040), top: B:80:0x0008, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0086 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:49:0x001a, B:61:0x0044, B:65:0x0056, B:67:0x005f, B:70:0x0086, B:56:0x0035, B:60:0x0040), top: B:80:0x0008, outer: #0 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0083 -> B:50:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ReceiveChannel receiveChannel;
            SendChannel<Frame.Pong> sendChannel;
            ChannelIterator it;
            SendChannel<Frame.Pong> sendChannel2;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } finally {
                }
            } catch (ClosedSendChannelException unused) {
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                receiveChannel = this.$channel;
                sendChannel = this.$outgoing;
                it = receiveChannel.iterator();
                this.L$0 = sendChannel;
                this.L$1 = receiveChannel;
                this.L$2 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
            } else if (i == 1) {
                it = (ChannelIterator) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                sendChannel2 = (SendChannel) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                sendChannel2 = (SendChannel) this.L$0;
                ResultKt.throwOnFailure(obj);
                sendChannel = sendChannel2;
                this.L$0 = sendChannel;
                this.L$1 = receiveChannel;
                this.L$2 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sendChannel2 = sendChannel;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    Frame.Ping ping = (Frame.Ping) it.next();
                    DefaultWebSocketSessionKt.getLOGGER().trace("Received ping message, sending pong message");
                    Frame.Pong pong = new Frame.Pong(ping.getData(), (DisposableHandle) null, 2, (DefaultConstructorMarker) null);
                    this.L$0 = sendChannel2;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.label = 2;
                    if (sendChannel2.send(pong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sendChannel = sendChannel2;
                    this.L$0 = sendChannel;
                    this.L$1 = receiveChannel;
                    this.L$2 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @NotNull
    public static final SendChannel<Frame.Pong> pinger(@NotNull CoroutineScope coroutineScope, @NotNull SendChannel<? super Frame> outgoing, long j, long j2, @NotNull Function2<? super CloseReason, ? super Continuation<? super Unit>, ? extends Object> onTimeout) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobJob$default.plus(PingerCoroutineName), null, new C105221(j, j2, onTimeout, channelChannel$default, outgoing, null), 2, null);
        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        ((Job) element).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.websocket.PingPongKt.pinger.2
            public C105232() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) {
                Job.DefaultImpls.cancel$default((Job) completableJob, (CancellationException) null, 1, (Object) null);
            }
        });
        return channelChannel$default;
    }

    /* compiled from: PingPong.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.PingPongKt$pinger$1", m7120f = "PingPong.kt", m7121i = {0, 0, 1, 1}, m7122l = {64, 73, 95}, m7123m = "invokeSuspend", m7124n = {"random", "pingIdBytes", "random", "pingIdBytes"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$1 */
    /* loaded from: classes7.dex */
    public static final class C105221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Channel<Frame.Pong> $channel;
        public final /* synthetic */ Function2<CloseReason, Continuation<? super Unit>, Object> $onTimeout;
        public final /* synthetic */ SendChannel<Frame> $outgoing;
        public final /* synthetic */ long $periodMillis;
        public final /* synthetic */ long $timeoutMillis;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C105221(long j, long j2, Function2<? super CloseReason, ? super Continuation<? super Unit>, ? extends Object> function2, Channel<Frame.Pong> channel, SendChannel<? super Frame> sendChannel, Continuation<? super C105221> continuation) {
            super(2, continuation);
            this.$periodMillis = j;
            this.$timeoutMillis = j2;
            this.$onTimeout = function2;
            this.$channel = channel;
            this.$outgoing = sendChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C105221(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00bb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c0 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, blocks: (B:42:0x0012, B:47:0x0027, B:47:0x0027, B:47:0x0027, B:60:0x00bc, B:60:0x00bc, B:60:0x00bc, B:62:0x00c0, B:62:0x00c0, B:62:0x00c0, B:53:0x0070, B:53:0x0070, B:53:0x0070, B:57:0x0087, B:57:0x0087, B:57:0x0087, B:50:0x0034, B:50:0x0034, B:50:0x0034), top: B:69:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00b9 -> B:60:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Random Random;
            byte[] bArr;
            Random random;
            long j;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DefaultWebSocketSessionKt.getLOGGER().trace("Starting WebSocket pinger coroutine with period " + this.$periodMillis + " ms and timeout " + this.$timeoutMillis + " ms");
                Random = RandomKt.Random(DateJvmKt.getTimeMillis());
                bArr = new byte[32];
                j = this.$periodMillis;
                anonymousClass1 = new AnonymousClass1(this.$channel, null);
                this.L$0 = Random;
                this.L$1 = bArr;
                this.label = 1;
                if (TimeoutKt.withTimeoutOrNull(j, anonymousClass1, this) != coroutine_suspended) {
                }
            } else if (i == 1) {
                bArr = (byte[]) this.L$1;
                random = (Random) this.L$0;
                ResultKt.throwOnFailure(obj);
                random.nextBytes(bArr);
                String str = "[ping " + CryptoKt.hex(bArr) + " ping]";
                long j2 = this.$timeoutMillis;
                PingPongKt$pinger$1$rc$1 pingPongKt$pinger$1$rc$1 = new PingPongKt$pinger$1$rc$1(this.$outgoing, str, this.$channel, null);
                this.L$0 = random;
                this.L$1 = bArr;
                this.label = 2;
                obj = TimeoutKt.withTimeoutOrNull(j2, pingPongKt$pinger$1$rc$1, this);
                if (obj == coroutine_suspended) {
                }
                if (((Unit) obj) != null) {
                }
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                bArr = (byte[]) this.L$1;
                random = (Random) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Unit) obj) != null) {
                    Random = random;
                    j = this.$periodMillis;
                    anonymousClass1 = new AnonymousClass1(this.$channel, null);
                    this.L$0 = Random;
                    this.L$1 = bArr;
                    this.label = 1;
                    if (TimeoutKt.withTimeoutOrNull(j, anonymousClass1, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    random = Random;
                    random.nextBytes(bArr);
                    String str2 = "[ping " + CryptoKt.hex(bArr) + " ping]";
                    long j22 = this.$timeoutMillis;
                    PingPongKt$pinger$1$rc$1 pingPongKt$pinger$1$rc$12 = new PingPongKt$pinger$1$rc$1(this.$outgoing, str2, this.$channel, null);
                    this.L$0 = random;
                    this.L$1 = bArr;
                    this.label = 2;
                    obj = TimeoutKt.withTimeoutOrNull(j22, pingPongKt$pinger$1$rc$12, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Unit) obj) != null) {
                    }
                } else {
                    DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket pinger has timed out");
                    Function2<CloseReason, Continuation<? super Unit>, Object> function2 = this.$onTimeout;
                    CloseReason closeReason = new CloseReason(CloseReason.Codes.INTERNAL_ERROR, "Ping timeout");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (function2.invoke(closeReason, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: PingPong.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "io.ktor.websocket.PingPongKt$pinger$1$1", m7120f = "PingPong.kt", m7121i = {}, m7122l = {66}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: io.ktor.websocket.PingPongKt$pinger$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Channel<Frame.Pong> $channel;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Channel<Frame.Pong> channel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$channel = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$channel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Channel<Frame.Pong> channel;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                do {
                    channel = this.$channel;
                    this.label = 1;
                } while (channel.receive(this) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
    }

    /* compiled from: PingPong.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$2 */
    /* loaded from: classes6.dex */
    public static final class C105232 extends Lambda implements Function1<Throwable, Unit> {
        public C105232() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            Job.DefaultImpls.cancel$default((Job) completableJob, (CancellationException) null, 1, (Object) null);
        }
    }
}
