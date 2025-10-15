package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.EventLoop_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TickerChannels.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes8.dex */
public final class TickerChannelsKt {

    /* compiled from: TickerChannels.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.TickerChannelsKt", m7120f = "TickerChannels.kt", m7121i = {0, 0, 1, 1, 2, 2}, m7122l = {106, 108, 109}, m7123m = "fixedDelayTicker", m7124n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m7125s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 */
    /* loaded from: classes5.dex */
    public static final class C107791 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C107791(Continuation<? super C107791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TickerChannelsKt.fixedDelayTicker(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.TickerChannelsKt", m7120f = "TickerChannels.kt", m7121i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, m7122l = {84, 88, 94, 96}, m7123m = "fixedPeriodTicker", m7124n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, m7125s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 */
    /* loaded from: classes5.dex */
    public static final class C107801 extends ContinuationImpl {
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C107801(Continuation<? super C107801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TickerChannelsKt.fixedPeriodTicker(0L, 0L, null, this);
        }
    }

    public static /* synthetic */ ReceiveChannel ticker$default(long j, long j2, CoroutineContext coroutineContext, TickerMode tickerMode, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return ticker(j, j2, coroutineContext, tickerMode);
    }

    @ObsoleteCoroutinesApi
    @NotNull
    public static final ReceiveChannel<Unit> ticker(long j, long j2, @NotNull CoroutineContext coroutineContext, @NotNull TickerMode tickerMode) {
        if (j < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        return ProduceKt.produce(GlobalScope.INSTANCE, Dispatchers.getUnconfined().plus(coroutineContext), 0, new C107813(tickerMode, j, j2, null));
    }

    /* compiled from: TickerChannels.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m7120f = "TickerChannels.kt", m7121i = {}, m7122l = {72, 73}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 */
    /* loaded from: classes5.dex */
    public static final class C107813 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ long $delayMillis;
        public final /* synthetic */ long $initialDelayMillis;
        public final /* synthetic */ TickerMode $mode;
        public /* synthetic */ Object L$0;
        public int label;

        /* compiled from: TickerChannels.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* loaded from: classes8.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TickerMode.values().length];
                try {
                    iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107813(TickerMode tickerMode, long j, long j2, Continuation<? super C107813> continuation) {
            super(2, continuation);
            this.$mode = tickerMode;
            this.$delayMillis = j;
            this.$initialDelayMillis = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107813 c107813 = new C107813(this.$mode, this.$delayMillis, this.$initialDelayMillis, continuation);
            c107813.L$0 = obj;
            return c107813;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super Unit> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107813) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$mode.ordinal()];
                if (i2 == 1) {
                    long j = this.$delayMillis;
                    long j2 = this.$initialDelayMillis;
                    SendChannel channel = producerScope.getChannel();
                    this.label = 1;
                    if (TickerChannelsKt.fixedPeriodTicker(j, j2, channel, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 2) {
                    long j3 = this.$delayMillis;
                    long j4 = this.$initialDelayMillis;
                    SendChannel channel2 = producerScope.getChannel();
                    this.label = 2;
                    if (TickerChannelsKt.fixedDelayTicker(j3, j4, channel2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fixedPeriodTicker(long j, long j2, SendChannel<? super Unit> sendChannel, Continuation<? super Unit> continuation) throws Throwable {
        C107801 c107801;
        SendChannel sendChannel2;
        long j3;
        long j4;
        long jDelayToNanos;
        long j5;
        long j6;
        SendChannel sendChannel3;
        char c;
        long j7;
        long jCoerceAtLeast;
        char c2;
        long jDelayNanosToMillis;
        char c3;
        Unit unit;
        if (continuation instanceof C107801) {
            c107801 = (C107801) continuation;
            int i = c107801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107801.label = i - Integer.MIN_VALUE;
            } else {
                c107801 = new C107801(continuation);
            }
        }
        Object obj = c107801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = (timeSource != null ? timeSource.nanoTime() : System.nanoTime()) + EventLoop_commonKt.delayToNanos(j2);
            sendChannel2 = sendChannel;
            c107801.L$0 = sendChannel2;
            j3 = j;
            c107801.J$0 = j3;
            c107801.J$1 = jNanoTime;
            c107801.label = 1;
            if (DelayKt.delay(j2, c107801) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j4 = jNanoTime;
        } else if (i2 == 1) {
            j4 = c107801.J$1;
            long j8 = c107801.J$0;
            SendChannel sendChannel4 = (SendChannel) c107801.L$0;
            ResultKt.throwOnFailure(obj);
            sendChannel2 = sendChannel4;
            j3 = j8;
        } else if (i2 == 2) {
            j6 = c107801.J$1;
            j7 = c107801.J$0;
            sendChannel3 = (SendChannel) c107801.L$0;
            ResultKt.throwOnFailure(obj);
            AbstractTimeSource timeSource2 = AbstractTimeSourceKt.getTimeSource();
            if (timeSource2 == null) {
            }
            jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j7 - jNanoTime, 0L);
            if (jCoerceAtLeast != 0) {
            }
            c2 = 3;
            jDelayNanosToMillis = EventLoop_commonKt.delayNanosToMillis(jCoerceAtLeast);
            c107801.L$0 = sendChannel3;
            c107801.J$0 = j7;
            c107801.J$1 = j6;
            c3 = 4;
            c107801.label = 4;
            if (DelayKt.delay(jDelayNanosToMillis, c107801) == coroutine_suspended) {
            }
            long j9 = j6;
            j4 = j7;
            jDelayToNanos = j9;
            sendChannel2 = sendChannel3;
            long j10 = j4 + jDelayToNanos;
            unit = Unit.INSTANCE;
            c107801.L$0 = sendChannel2;
            c107801.J$0 = j10;
            c107801.J$1 = jDelayToNanos;
            c107801.label = 2;
            if (sendChannel2.send(unit, c107801) != coroutine_suspended) {
            }
        } else if (i2 == 3) {
            j6 = c107801.J$1;
            j5 = c107801.J$0;
            sendChannel3 = (SendChannel) c107801.L$0;
            ResultKt.throwOnFailure(obj);
            c = 3;
            long j11 = j6;
            j4 = j5;
            jDelayToNanos = j11;
            sendChannel2 = sendChannel3;
            long j102 = j4 + jDelayToNanos;
            unit = Unit.INSTANCE;
            c107801.L$0 = sendChannel2;
            c107801.J$0 = j102;
            c107801.J$1 = jDelayToNanos;
            c107801.label = 2;
            if (sendChannel2.send(unit, c107801) != coroutine_suspended) {
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = c107801.J$1;
            j7 = c107801.J$0;
            sendChannel3 = (SendChannel) c107801.L$0;
            ResultKt.throwOnFailure(obj);
            c3 = 4;
            c2 = 3;
            long j92 = j6;
            j4 = j7;
            jDelayToNanos = j92;
            sendChannel2 = sendChannel3;
            long j1022 = j4 + jDelayToNanos;
            unit = Unit.INSTANCE;
            c107801.L$0 = sendChannel2;
            c107801.J$0 = j1022;
            c107801.J$1 = jDelayToNanos;
            c107801.label = 2;
            if (sendChannel2.send(unit, c107801) != coroutine_suspended) {
                return coroutine_suspended;
            }
            sendChannel3 = sendChannel2;
            j6 = jDelayToNanos;
            j7 = j1022;
            AbstractTimeSource timeSource22 = AbstractTimeSourceKt.getTimeSource();
            long jNanoTime2 = timeSource22 == null ? timeSource22.nanoTime() : System.nanoTime();
            jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j7 - jNanoTime2, 0L);
            if (jCoerceAtLeast != 0 && j6 != 0) {
                long j12 = j6 - ((jNanoTime2 - j7) % j6);
                j5 = jNanoTime2 + j12;
                long jDelayNanosToMillis2 = EventLoop_commonKt.delayNanosToMillis(j12);
                c107801.L$0 = sendChannel3;
                c107801.J$0 = j5;
                c107801.J$1 = j6;
                c = 3;
                c107801.label = 3;
                if (DelayKt.delay(jDelayNanosToMillis2, c107801) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j112 = j6;
                j4 = j5;
                jDelayToNanos = j112;
                sendChannel2 = sendChannel3;
                long j10222 = j4 + jDelayToNanos;
                unit = Unit.INSTANCE;
                c107801.L$0 = sendChannel2;
                c107801.J$0 = j10222;
                c107801.J$1 = jDelayToNanos;
                c107801.label = 2;
                if (sendChannel2.send(unit, c107801) != coroutine_suspended) {
                }
            } else {
                c2 = 3;
                jDelayNanosToMillis = EventLoop_commonKt.delayNanosToMillis(jCoerceAtLeast);
                c107801.L$0 = sendChannel3;
                c107801.J$0 = j7;
                c107801.J$1 = j6;
                c3 = 4;
                c107801.label = 4;
                if (DelayKt.delay(jDelayNanosToMillis, c107801) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j922 = j6;
                j4 = j7;
                jDelayToNanos = j922;
                sendChannel2 = sendChannel3;
                long j102222 = j4 + jDelayToNanos;
                unit = Unit.INSTANCE;
                c107801.L$0 = sendChannel2;
                c107801.J$0 = j102222;
                c107801.J$1 = jDelayToNanos;
                c107801.label = 2;
                if (sendChannel2.send(unit, c107801) != coroutine_suspended) {
                }
            }
        }
        jDelayToNanos = EventLoop_commonKt.delayToNanos(j3);
        long j1022222 = j4 + jDelayToNanos;
        unit = Unit.INSTANCE;
        c107801.L$0 = sendChannel2;
        c107801.J$0 = j1022222;
        c107801.J$1 = jDelayToNanos;
        c107801.label = 2;
        if (sendChannel2.send(unit, c107801) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fixedDelayTicker(long j, long j2, SendChannel<? super Unit> sendChannel, Continuation<? super Unit> continuation) throws Throwable {
        C107791 c107791;
        SendChannel<? super Unit> sendChannel2;
        if (continuation instanceof C107791) {
            c107791 = (C107791) continuation;
            int i = c107791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107791.label = i - Integer.MIN_VALUE;
            } else {
                c107791 = new C107791(continuation);
            }
        }
        Object obj = c107791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c107791.L$0 = sendChannel;
            c107791.J$0 = j;
            c107791.label = 1;
            if (DelayKt.delay(j2, c107791) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            j = c107791.J$0;
            sendChannel = (SendChannel) c107791.L$0;
            ResultKt.throwOnFailure(obj);
        } else if (i2 == 2) {
            j = c107791.J$0;
            sendChannel2 = (SendChannel) c107791.L$0;
            ResultKt.throwOnFailure(obj);
            c107791.L$0 = sendChannel2;
            c107791.J$0 = j;
            c107791.label = 3;
            if (DelayKt.delay(j, c107791) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sendChannel = sendChannel2;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c107791.J$0;
            sendChannel2 = (SendChannel) c107791.L$0;
            ResultKt.throwOnFailure(obj);
            sendChannel = sendChannel2;
        }
        Unit unit = Unit.INSTANCE;
        c107791.L$0 = sendChannel;
        c107791.J$0 = j;
        c107791.label = 2;
        if (sendChannel.send(unit, c107791) != coroutine_suspended) {
            return coroutine_suspended;
        }
        sendChannel2 = sendChannel;
        c107791.L$0 = sendChannel2;
        c107791.J$0 = j;
        c107791.label = 3;
        if (DelayKt.delay(j, c107791) == coroutine_suspended) {
        }
        sendChannel = sendChannel2;
        Unit unit2 = Unit.INSTANCE;
        c107791.L$0 = sendChannel;
        c107791.J$0 = j;
        c107791.label = 2;
        if (sendChannel.send(unit2, c107791) != coroutine_suspended) {
        }
    }
}
