package io.ktor.utils.p050io;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReadSession.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001ao\u0010\b\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062K\u0010\n\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u000bH\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0002H\u0002\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u0004*\u00020\u00152\u0006\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m7105d2 = {"completeReadingFromBuffer", "", "Lio/ktor/utils/io/ByteReadChannel;", "buffer", "Lio/ktor/utils/io/core/Buffer;", "bytesRead", "", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/core/Buffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "desiredSize", "block", "Lkotlin/Function3;", "Lio/ktor/utils/io/bits/Memory;", "Lkotlin/ParameterName;", "name", "source", "", TtmlNode.START, "endExclusive", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readSessionFor", "Lio/ktor/utils/io/SuspendableReadSession;", "requestBuffer", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestBufferFallback", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "requestBufferSuspend", "(Lio/ktor/utils/io/SuspendableReadSession;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReadSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadSession.kt\nio/ktor/utils/io/ReadSessionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,151:1\n1#2:152\n74#3:153\n*S KotlinDebug\n*F\n+ 1 ReadSession.kt\nio/ktor/utils/io/ReadSessionKt\n*L\n133#1:153\n*E\n"})
/* loaded from: classes8.dex */
public final class ReadSessionKt {

    /* compiled from: ReadSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ReadSessionKt", m7120f = "ReadSession.kt", m7121i = {0, 0, 1, 1, 1, 2}, m7122l = {24, 28, 31}, m7123m = "read", m7124n = {"$this$read", "block", "$this$read", "buffer", "bytesRead", "cause"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0"})
    @SourceDebugExtension({"SMAP\nReadSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadSession.kt\nio/ktor/utils/io/ReadSessionKt$read$1\n*L\n1#1,151:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ReadSessionKt$read$1 */
    /* loaded from: classes7.dex */
    public static final class C104921 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104921(Continuation<? super C104921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadSessionKt.read(null, 0, null, this);
        }
    }

    /* compiled from: ReadSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ReadSessionKt", m7120f = "ReadSession.kt", m7121i = {0}, m7122l = {Cea708Decoder.COMMAND_CW5}, m7123m = "requestBufferFallback", m7124n = {"chunk"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ReadSessionKt$requestBufferFallback$1 */
    /* loaded from: classes7.dex */
    public static final class C104931 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104931(Continuation<? super C104931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadSessionKt.requestBufferFallback(null, 0, this);
        }
    }

    /* compiled from: ReadSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ReadSessionKt", m7120f = "ReadSession.kt", m7121i = {0}, m7122l = {125}, m7123m = "requestBufferSuspend", m7124n = {"$this$requestBufferSuspend"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ReadSessionKt$requestBufferSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104941 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104941(Continuation<? super C104941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadSessionKt.requestBufferSuspend(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object read(@NotNull ByteReadChannel byteReadChannel, int i, @NotNull Function3<? super Memory, ? super Long, ? super Long, Integer> function3, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        C104921 c104921;
        Buffer empty;
        ByteReadChannel byteReadChannel2;
        Throwable th;
        int i2;
        if (continuation instanceof C104921) {
            c104921 = (C104921) continuation;
            int i3 = c104921.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104921.label = i3 - Integer.MIN_VALUE;
            } else {
                c104921 = new C104921(continuation);
            }
        }
        Object objRequestBuffer = c104921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c104921.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objRequestBuffer);
                c104921.L$0 = byteReadChannel;
                c104921.L$1 = function3;
                c104921.label = 1;
                objRequestBuffer = requestBuffer(byteReadChannel, i, c104921);
                if (objRequestBuffer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 == 1) {
                function3 = (Function3) c104921.L$1;
                byteReadChannel = (ByteReadChannel) c104921.L$0;
                ResultKt.throwOnFailure(objRequestBuffer);
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) c104921.L$0;
                    ResultKt.throwOnFailure(objRequestBuffer);
                    throw th2;
                }
                i2 = c104921.I$0;
                empty = (Buffer) c104921.L$1;
                byteReadChannel2 = (ByteReadChannel) c104921.L$0;
                try {
                    ResultKt.throwOnFailure(objRequestBuffer);
                    return Boxing.boxInt(i2);
                } catch (Throwable th3) {
                    th = th3;
                    c104921.L$0 = th;
                    c104921.L$1 = null;
                    c104921.label = 3;
                    if (completeReadingFromBuffer(byteReadChannel2, empty, 0, c104921) != coroutine_suspended) {
                    }
                }
            }
            int iIntValue = function3.invoke(Memory.m15422boximpl(empty.getMemory()), Boxing.boxLong(empty.getReadPosition()), Boxing.boxLong(empty.getWritePosition())).intValue();
            c104921.L$0 = byteReadChannel;
            c104921.L$1 = empty;
            c104921.I$0 = iIntValue;
            c104921.label = 2;
            if (completeReadingFromBuffer(byteReadChannel, empty, iIntValue, c104921) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteReadChannel2 = byteReadChannel;
            i2 = iIntValue;
            return Boxing.boxInt(i2);
        } catch (Throwable th4) {
            byteReadChannel2 = byteReadChannel;
            th = th4;
            c104921.L$0 = th;
            c104921.L$1 = null;
            c104921.label = 3;
            if (completeReadingFromBuffer(byteReadChannel2, empty, 0, c104921) != coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th;
        }
        Buffer buffer = (Buffer) objRequestBuffer;
        empty = buffer == null ? Buffer.INSTANCE.getEmpty() : buffer;
    }

    public static final Object read$$forInline(ByteReadChannel byteReadChannel, int i, Function3<? super Memory, ? super Long, ? super Long, Integer> function3, Continuation<? super Integer> continuation) {
        InlineMarker.mark(0);
        Object objRequestBuffer = requestBuffer(byteReadChannel, i, continuation);
        InlineMarker.mark(1);
        Buffer empty = (Buffer) objRequestBuffer;
        if (empty == null) {
            empty = Buffer.INSTANCE.getEmpty();
        }
        try {
            int iIntValue = function3.invoke(Memory.m15422boximpl(empty.getMemory()), Long.valueOf(empty.getReadPosition()), Long.valueOf(empty.getWritePosition())).intValue();
            InlineMarker.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, iIntValue, continuation);
            InlineMarker.mark(1);
            return Integer.valueOf(iIntValue);
        } catch (Throwable th) {
            InlineMarker.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, 0, continuation);
            InlineMarker.mark(1);
            throw th;
        }
    }

    public static /* synthetic */ Object read$default(ByteReadChannel byteReadChannel, int i, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        InlineMarker.mark(0);
        Object objRequestBuffer = requestBuffer(byteReadChannel, i, continuation);
        InlineMarker.mark(1);
        Buffer empty = (Buffer) objRequestBuffer;
        if (empty == null) {
            empty = Buffer.INSTANCE.getEmpty();
        }
        try {
            int iIntValue = ((Number) function3.invoke(Memory.m15422boximpl(empty.getMemory()), Long.valueOf(empty.getReadPosition()), Long.valueOf(empty.getWritePosition()))).intValue();
            InlineMarker.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, iIntValue, continuation);
            InlineMarker.mark(1);
            return Integer.valueOf(iIntValue);
        } catch (Throwable th) {
            InlineMarker.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, 0, continuation);
            InlineMarker.mark(1);
            throw th;
        }
    }

    @PublishedApi
    @Nullable
    public static final Object requestBuffer(@NotNull ByteReadChannel byteReadChannel, int i, @NotNull Continuation<? super Buffer> continuation) {
        SuspendableReadSession suspendableReadSessionStartReadSession;
        if (byteReadChannel instanceof SuspendableReadSession) {
            suspendableReadSessionStartReadSession = (SuspendableReadSession) byteReadChannel;
        } else {
            suspendableReadSessionStartReadSession = byteReadChannel instanceof HasReadSession ? ((HasReadSession) byteReadChannel).startReadSession() : null;
        }
        if (suspendableReadSessionStartReadSession != null) {
            ChunkBuffer chunkBufferRequest = suspendableReadSessionStartReadSession.request(RangesKt___RangesKt.coerceAtMost(i, 8));
            return chunkBufferRequest != null ? chunkBufferRequest : requestBufferSuspend(suspendableReadSessionStartReadSession, i, continuation);
        }
        return requestBufferFallback(byteReadChannel, i, continuation);
    }

    @PublishedApi
    @Nullable
    public static final Object completeReadingFromBuffer(@NotNull ByteReadChannel byteReadChannel, @Nullable Buffer buffer, int i, @NotNull Continuation<? super Unit> continuation) {
        if (i < 0) {
            throw new IllegalStateException(("bytesRead shouldn't be negative: " + i).toString());
        }
        SuspendableReadSession sessionFor = readSessionFor(byteReadChannel);
        if (sessionFor != null) {
            sessionFor.discard(i);
            if (byteReadChannel instanceof HasReadSession) {
                ((HasReadSession) byteReadChannel).endReadSession();
            }
            return Unit.INSTANCE;
        }
        if (buffer instanceof ChunkBuffer) {
            ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
            if (buffer != companion.getEmpty()) {
                ((ChunkBuffer) buffer).release(companion.getPool());
                Object objDiscard = byteReadChannel.discard(i, continuation);
                return objDiscard == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDiscard : Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object requestBufferSuspend(SuspendableReadSession suspendableReadSession, int i, Continuation<? super Buffer> continuation) throws Throwable {
        C104941 c104941;
        if (continuation instanceof C104941) {
            c104941 = (C104941) continuation;
            int i2 = c104941.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104941.label = i2 - Integer.MIN_VALUE;
            } else {
                c104941 = new C104941(continuation);
            }
        }
        Object obj = c104941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104941.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c104941.L$0 = suspendableReadSession;
            c104941.label = 1;
            if (suspendableReadSession.await(i, c104941) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            suspendableReadSession = (SuspendableReadSession) c104941.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return suspendableReadSession.request(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object requestBufferFallback(ByteReadChannel byteReadChannel, int i, Continuation<? super ChunkBuffer> continuation) throws Throwable {
        C104931 c104931;
        ChunkBuffer chunkBuffer;
        if (continuation instanceof C104931) {
            c104931 = (C104931) continuation;
            int i2 = c104931.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104931.label = i2 - Integer.MIN_VALUE;
            } else {
                c104931 = new C104931(continuation);
            }
        }
        C104931 c1049312 = c104931;
        Object obj = c1049312.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1049312.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ChunkBuffer chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
            long limit = chunkBufferBorrow.getLimit() - chunkBufferBorrow.getWritePosition();
            c1049312.L$0 = chunkBufferBorrow;
            c1049312.label = 1;
            Object objMo15412peekTolBXzO7A = byteReadChannel.mo15412peekTolBXzO7A(chunkBufferBorrow.getMemory(), chunkBufferBorrow.getWritePosition(), 0L, i, limit, c1049312);
            if (objMo15412peekTolBXzO7A == coroutine_suspended) {
                return coroutine_suspended;
            }
            chunkBuffer = chunkBufferBorrow;
            obj = objMo15412peekTolBXzO7A;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chunkBuffer = (ChunkBuffer) c1049312.L$0;
            ResultKt.throwOnFailure(obj);
        }
        chunkBuffer.commitWritten((int) ((Number) obj).longValue());
        return chunkBuffer;
    }

    public static final SuspendableReadSession readSessionFor(ByteReadChannel byteReadChannel) {
        if (byteReadChannel instanceof HasReadSession) {
            return ((HasReadSession) byteReadChannel).startReadSession();
        }
        return null;
    }
}
