package io.ktor.utils.p050io;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WriterSession.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a#\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a%\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001ao\u0010\u0012\u001a\u00020\u0006*\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00062K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u0014H\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\nH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m7105d2 = {"writeBufferFallback", "Lio/ktor/utils/io/core/Buffer;", "writeBufferSuspend", "session", "Lio/ktor/utils/io/WriterSuspendSession;", "desiredSpace", "", "(Lio/ktor/utils/io/WriterSuspendSession;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeWriting", "", "Lio/ktor/utils/io/ByteWriteChannel;", "buffer", "written", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/core/Buffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeWritingFallback", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/core/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestWriteBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "write", "block", "Lkotlin/Function3;", "Lio/ktor/utils/io/bits/Memory;", "Lkotlin/ParameterName;", "name", "freeSpace", "", "startOffset", "endExclusive", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeSessionFor", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class WriterSessionKt {

    /* compiled from: WriterSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.WriterSessionKt", m7120f = "WriterSession.kt", m7121i = {0}, m7122l = {83}, m7123m = "completeWritingFallback", m7124n = {"buffer"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.WriterSessionKt$completeWritingFallback$1 */
    /* loaded from: classes7.dex */
    public static final class C104951 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104951(Continuation<? super C104951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSessionKt.completeWritingFallback(null, null, this);
        }
    }

    /* compiled from: WriterSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.WriterSessionKt", m7120f = "WriterSession.kt", m7121i = {0, 0}, m7122l = {22, 29, 29}, m7123m = "write", m7124n = {"$this$write", "block"}, m7125s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nWriterSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriterSession.kt\nio/ktor/utils/io/WriterSessionKt$write$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.WriterSessionKt$write$1 */
    /* loaded from: classes7.dex */
    public static final class C104961 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104961(Continuation<? super C104961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSessionKt.write(null, 0, null, this);
        }
    }

    /* compiled from: WriterSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.WriterSessionKt", m7120f = "WriterSession.kt", m7121i = {0, 0}, m7122l = {93}, m7123m = "writeBufferSuspend", m7124n = {"session", "desiredSpace"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.WriterSessionKt$writeBufferSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104971 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104971(Continuation<? super C104971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSessionKt.writeBufferSuspend(null, 0, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:13|14)(3:15|37|38))(3:16|30|31))(1:17))(2:18|(1:20))|21|(1:23)|24|39|25|26|(1:28)(3:29|30|31)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        r0.L$0 = r12;
        r0.L$1 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (completeWriting(r10, r13, r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object write(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull Function3<? super Memory, ? super Long, ? super Long, Integer> function3, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        C104961 c104961;
        Integer num;
        if (continuation instanceof C104961) {
            c104961 = (C104961) continuation;
            int i2 = c104961.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104961.label = i2 - Integer.MIN_VALUE;
            } else {
                c104961 = new C104961(continuation);
            }
        }
        Object objRequestWriteBuffer = c104961.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104961.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRequestWriteBuffer);
            c104961.L$0 = byteWriteChannel;
            c104961.L$1 = function3;
            c104961.label = 1;
            objRequestWriteBuffer = requestWriteBuffer(byteWriteChannel, i, c104961);
            if (objRequestWriteBuffer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    num = (Integer) c104961.L$0;
                    ResultKt.throwOnFailure(objRequestWriteBuffer);
                    InlineMarker.finallyEnd(1);
                    return num;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) c104961.L$0;
                ResultKt.throwOnFailure(objRequestWriteBuffer);
                InlineMarker.finallyEnd(1);
                throw th;
            }
            function3 = (Function3) c104961.L$1;
            byteWriteChannel = (ByteWriteChannel) c104961.L$0;
            ResultKt.throwOnFailure(objRequestWriteBuffer);
        }
        Buffer empty = (Buffer) objRequestWriteBuffer;
        if (empty == null) {
            empty = Buffer.INSTANCE.getEmpty();
        }
        int iIntValue = 0;
        iIntValue = function3.invoke(Memory.m15422boximpl(empty.getMemory()), Boxing.boxLong(empty.getWritePosition()), Boxing.boxLong(empty.getLimit())).intValue();
        empty.commitWritten(iIntValue);
        Integer numBoxInt = Boxing.boxInt(iIntValue);
        InlineMarker.finallyStart(1);
        c104961.L$0 = numBoxInt;
        c104961.L$1 = null;
        c104961.label = 2;
        if (completeWriting(byteWriteChannel, empty, iIntValue, c104961) == coroutine_suspended) {
            return coroutine_suspended;
        }
        num = numBoxInt;
        InlineMarker.finallyEnd(1);
        return num;
    }

    public static final Object write$$forInline(ByteWriteChannel byteWriteChannel, int i, Function3<? super Memory, ? super Long, ? super Long, Integer> function3, Continuation<? super Integer> continuation) throws Throwable {
        int iIntValue;
        InlineMarker.mark(0);
        Object objRequestWriteBuffer = requestWriteBuffer(byteWriteChannel, i, continuation);
        InlineMarker.mark(1);
        Buffer empty = (Buffer) objRequestWriteBuffer;
        if (empty == null) {
            empty = Buffer.INSTANCE.getEmpty();
        }
        try {
            iIntValue = function3.invoke(Memory.m15422boximpl(empty.getMemory()), Long.valueOf(empty.getWritePosition()), Long.valueOf(empty.getLimit())).intValue();
        } catch (Throwable th) {
            th = th;
            iIntValue = 0;
        }
        try {
            empty.commitWritten(iIntValue);
            Integer numValueOf = Integer.valueOf(iIntValue);
            InlineMarker.finallyStart(1);
            InlineMarker.mark(0);
            completeWriting(byteWriteChannel, empty, iIntValue, continuation);
            InlineMarker.mark(1);
            InlineMarker.finallyEnd(1);
            return numValueOf;
        } catch (Throwable th2) {
            th = th2;
            InlineMarker.finallyStart(1);
            InlineMarker.mark(0);
            completeWriting(byteWriteChannel, empty, iIntValue, continuation);
            InlineMarker.mark(1);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, int i, Function3 function3, Continuation continuation, int i2, Object obj) throws Throwable {
        int iIntValue;
        if ((i2 & 1) != 0) {
            i = 1;
        }
        InlineMarker.mark(0);
        Object objRequestWriteBuffer = requestWriteBuffer(byteWriteChannel, i, continuation);
        InlineMarker.mark(1);
        Buffer empty = (Buffer) objRequestWriteBuffer;
        if (empty == null) {
            empty = Buffer.INSTANCE.getEmpty();
        }
        try {
            iIntValue = ((Number) function3.invoke(Memory.m15422boximpl(empty.getMemory()), Long.valueOf(empty.getWritePosition()), Long.valueOf(empty.getLimit()))).intValue();
        } catch (Throwable th) {
            th = th;
            iIntValue = 0;
        }
        try {
            empty.commitWritten(iIntValue);
            Integer numValueOf = Integer.valueOf(iIntValue);
            InlineMarker.finallyStart(1);
            InlineMarker.mark(0);
            completeWriting(byteWriteChannel, empty, iIntValue, continuation);
            InlineMarker.mark(1);
            InlineMarker.finallyEnd(1);
            return numValueOf;
        } catch (Throwable th2) {
            th = th2;
            InlineMarker.finallyStart(1);
            InlineMarker.mark(0);
            completeWriting(byteWriteChannel, empty, iIntValue, continuation);
            InlineMarker.mark(1);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @PublishedApi
    @Nullable
    public static final Object requestWriteBuffer(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull Continuation<? super Buffer> continuation) {
        WriterSuspendSession writerSuspendSessionWriteSessionFor = writeSessionFor(byteWriteChannel);
        if (writerSuspendSessionWriteSessionFor != null) {
            ChunkBuffer chunkBufferRequest = writerSuspendSessionWriteSessionFor.request(i);
            return chunkBufferRequest != null ? chunkBufferRequest : writeBufferSuspend(writerSuspendSessionWriteSessionFor, i, continuation);
        }
        return writeBufferFallback();
    }

    @PublishedApi
    @Nullable
    public static final Object completeWriting(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Buffer buffer, int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (byteWriteChannel instanceof HasWriteSession) {
            ((HasWriteSession) byteWriteChannel).endWriteSession(i);
            return Unit.INSTANCE;
        }
        Object objCompleteWritingFallback = completeWritingFallback(byteWriteChannel, buffer, continuation);
        return objCompleteWritingFallback == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCompleteWritingFallback : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object completeWritingFallback(ByteWriteChannel byteWriteChannel, Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        C104951 c104951;
        if (continuation instanceof C104951) {
            c104951 = (C104951) continuation;
            int i = c104951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104951.label = i - Integer.MIN_VALUE;
            } else {
                c104951 = new C104951(continuation);
            }
        }
        Object obj = c104951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (buffer instanceof ChunkBuffer) {
                c104951.L$0 = buffer;
                c104951.label = 1;
                if (byteWriteChannel.writeFully(buffer, c104951) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new UnsupportedOperationException("Only ChunkBuffer instance is supported.");
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = (Buffer) c104951.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ((ChunkBuffer) buffer).release(ChunkBuffer.INSTANCE.getPool());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeBufferSuspend(WriterSuspendSession writerSuspendSession, int i, Continuation<? super Buffer> continuation) throws Throwable {
        C104971 c104971;
        if (continuation instanceof C104971) {
            c104971 = (C104971) continuation;
            int i2 = c104971.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104971.label = i2 - Integer.MIN_VALUE;
            } else {
                c104971 = new C104971(continuation);
            }
        }
        Object obj = c104971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104971.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c104971.L$0 = writerSuspendSession;
            c104971.I$0 = i;
            c104971.label = 1;
            if (writerSuspendSession.tryAwait(i, c104971) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104971.I$0;
            writerSuspendSession = (WriterSuspendSession) c104971.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChunkBuffer chunkBufferRequest = writerSuspendSession.request(i);
        return chunkBufferRequest != null ? chunkBufferRequest : writerSuspendSession.request(1);
    }

    public static final Buffer writeBufferFallback() {
        ChunkBuffer chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
        ChunkBuffer chunkBuffer = chunkBufferBorrow;
        chunkBuffer.resetForWrite();
        chunkBuffer.reserveEndGap(8);
        return chunkBufferBorrow;
    }

    public static final WriterSuspendSession writeSessionFor(ByteWriteChannel byteWriteChannel) {
        if (byteWriteChannel instanceof HasWriteSession) {
            return ((HasWriteSession) byteWriteChannel).beginWriteSession();
        }
        return null;
    }
}
