package io.ktor.utils.p050io;

import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.Buffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConsumeEach.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u0001*\u00020\u00022:\u0010\u0003\u001a6\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\u000bH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\f*j\u0010\r\"2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\t0\u000422\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\t0\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m7105d2 = {"consumeEachBufferRange", "", "Lio/ktor/utils/io/ByteReadChannel;", "visitor", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "buffer", "", "last", "Lio/ktor/utils/io/ConsumeEachBufferVisitor;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumeEachBufferVisitor", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nConsumeEach.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumeEach.kt\nio/ktor/utils/io/ConsumeEachKt\n+ 2 ReadSession.kt\nio/ktor/utils/io/ReadSessionKt\n*L\n1#1,41:1\n20#2,13:42\n*S KotlinDebug\n*F\n+ 1 ConsumeEach.kt\nio/ktor/utils/io/ConsumeEachKt\n*L\n24#1:42,13\n*E\n"})
/* loaded from: classes8.dex */
public final class ConsumeEachKt {

    /* compiled from: ConsumeEach.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ConsumeEachKt", m7120f = "ConsumeEach.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2}, m7122l = {46, 50, 53}, m7123m = "consumeEachBufferRange", m7124n = {"$this$consumeEachBufferRange", "visitor", "continueFlag", "lastChunkReported", "$this$read_u24default$iv", "$this$consumeEachBufferRange", "visitor", "continueFlag", "lastChunkReported", "$this$read_u24default$iv", "buffer$iv", "bytesRead$iv", "cause$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0"})
    @SourceDebugExtension({"SMAP\nConsumeEach.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumeEach.kt\nio/ktor/utils/io/ConsumeEachKt$consumeEachBufferRange$1\n*L\n1#1,41:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ConsumeEachKt$consumeEachBufferRange$1 */
    /* loaded from: classes7.dex */
    public static final class C104831 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C104831(Continuation<? super C104831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsumeEachKt.consumeEachBufferRange(null, null, this);
        }
    }

    /* JADX WARN: Path cross not found for [B:39:0x00ed, B:42:0x00f5], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:42:0x00f5, B:39:0x00ed], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[Catch: all -> 0x00da, TryCatch #1 {all -> 0x00da, blocks: (B:31:0x00c2, B:33:0x00d4, B:37:0x00e3, B:39:0x00ed, B:43:0x00f6, B:36:0x00dd), top: B:63:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[Catch: all -> 0x00da, TryCatch #1 {all -> 0x00da, blocks: (B:31:0x00c2, B:33:0x00d4, B:37:0x00e3, B:39:0x00ed, B:43:0x00f6, B:36:0x00dd), top: B:63:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed A[Catch: all -> 0x00da, TryCatch #1 {all -> 0x00da, blocks: (B:31:0x00c2, B:33:0x00d4, B:37:0x00e3, B:39:0x00ed, B:43:0x00f6, B:36:0x00dd), top: B:63:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0123 -> B:47:0x0126). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeEachBufferRange(@NotNull ByteReadChannel byteReadChannel, @NotNull Function2<? super ByteBuffer, ? super Boolean, Boolean> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104831 c104831;
        C104831 c1048312;
        Ref.BooleanRef booleanRef;
        Function2<? super ByteBuffer, ? super Boolean, Boolean> function22;
        Ref.BooleanRef booleanRef2;
        ByteReadChannel byteReadChannel2;
        ByteReadChannel byteReadChannel3;
        Throwable th;
        C104831 c1048313;
        ByteReadChannel byteReadChannel4;
        Function2<? super ByteBuffer, ? super Boolean, Boolean> function23;
        Buffer empty;
        Buffer buffer;
        long readPosition;
        long writePosition;
        ByteBuffer byteBufferM15439getEmptySK3TCg8;
        int iPosition;
        Object objRequestBuffer;
        if (continuation instanceof C104831) {
            c104831 = (C104831) continuation;
            int i = c104831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104831.label = i - Integer.MIN_VALUE;
            } else {
                c104831 = new C104831(continuation);
            }
        }
        Object obj = c104831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104831.label;
        boolean z = false;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            c1048312 = c104831;
            booleanRef = new Ref.BooleanRef();
            function22 = function2;
            booleanRef2 = booleanRef3;
            byteReadChannel2 = byteReadChannel;
            booleanRef2.element = z;
            c1048312.L$0 = byteReadChannel2;
            c1048312.L$1 = function22;
            c1048312.L$2 = booleanRef2;
            c1048312.L$3 = booleanRef;
            c1048312.L$4 = byteReadChannel2;
            c1048312.L$5 = null;
            c1048312.label = i3;
            objRequestBuffer = ReadSessionKt.requestBuffer(byteReadChannel2, i3, c1048312);
            if (objRequestBuffer != coroutine_suspended) {
            }
        } else if (i2 == 1) {
            ByteReadChannel byteReadChannel5 = (ByteReadChannel) c104831.L$4;
            Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) c104831.L$3;
            Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) c104831.L$2;
            function23 = (Function2) c104831.L$1;
            byteReadChannel4 = (ByteReadChannel) c104831.L$0;
            ResultKt.throwOnFailure(obj);
            byteReadChannel3 = byteReadChannel5;
            booleanRef2 = booleanRef5;
            booleanRef = booleanRef4;
            empty = (Buffer) obj;
            if (empty == null) {
            }
            buffer = empty;
            ByteBuffer memory = buffer.getMemory();
            readPosition = buffer.getReadPosition();
            writePosition = buffer.getWritePosition();
            if (writePosition > readPosition) {
            }
            if (byteBufferM15439getEmptySK3TCg8.remaining() != byteReadChannel4.get_availableForRead()) {
            }
            booleanRef.element = z;
            booleanRef2.element = function23.invoke(byteBufferM15439getEmptySK3TCg8, Boxing.boxBoolean(z)).booleanValue();
            iPosition = byteBufferM15439getEmptySK3TCg8.position();
            c104831.L$0 = byteReadChannel4;
            c104831.L$1 = function23;
            c104831.L$2 = booleanRef2;
            c104831.L$3 = booleanRef;
            c104831.L$4 = byteReadChannel3;
            c104831.L$5 = buffer;
            c104831.I$0 = iPosition;
            c104831.label = 2;
            if (ReadSessionKt.completeReadingFromBuffer(byteReadChannel3, buffer, iPosition, c104831) == coroutine_suspended) {
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) c104831.L$0;
                ResultKt.throwOnFailure(obj);
                throw th2;
            }
            Buffer buffer2 = (Buffer) c104831.L$5;
            byteReadChannel3 = (ByteReadChannel) c104831.L$4;
            booleanRef = (Ref.BooleanRef) c104831.L$3;
            Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) c104831.L$2;
            Function2<? super ByteBuffer, ? super Boolean, Boolean> function24 = (Function2) c104831.L$1;
            ByteReadChannel byteReadChannel6 = (ByteReadChannel) c104831.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                c1048312 = c104831;
                booleanRef2 = booleanRef6;
                function22 = function24;
                byteReadChannel2 = byteReadChannel6;
                if ((booleanRef.element || !byteReadChannel2.isClosedForRead()) && booleanRef2.element) {
                    z = false;
                    i3 = 1;
                    booleanRef2.element = z;
                    c1048312.L$0 = byteReadChannel2;
                    c1048312.L$1 = function22;
                    c1048312.L$2 = booleanRef2;
                    c1048312.L$3 = booleanRef;
                    c1048312.L$4 = byteReadChannel2;
                    c1048312.L$5 = null;
                    c1048312.label = i3;
                    objRequestBuffer = ReadSessionKt.requestBuffer(byteReadChannel2, i3, c1048312);
                    if (objRequestBuffer != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    try {
                        byteReadChannel4 = byteReadChannel2;
                        obj = objRequestBuffer;
                        function23 = function22;
                        c104831 = c1048312;
                        byteReadChannel3 = byteReadChannel4;
                        empty = (Buffer) obj;
                        if (empty == null) {
                            empty = Buffer.INSTANCE.getEmpty();
                        }
                        ByteBuffer memory2 = buffer.getMemory();
                        readPosition = buffer.getReadPosition();
                        writePosition = buffer.getWritePosition();
                        if (writePosition > readPosition) {
                            byteBufferM15439getEmptySK3TCg8 = Memory.m15434slice87lwejk(memory2, readPosition, writePosition - readPosition);
                        } else {
                            byteBufferM15439getEmptySK3TCg8 = Memory.INSTANCE.m15439getEmptySK3TCg8();
                        }
                        boolean z2 = byteBufferM15439getEmptySK3TCg8.remaining() != byteReadChannel4.get_availableForRead() && byteReadChannel4.isClosedForWrite();
                        booleanRef.element = z2;
                        booleanRef2.element = function23.invoke(byteBufferM15439getEmptySK3TCg8, Boxing.boxBoolean(z2)).booleanValue();
                        iPosition = byteBufferM15439getEmptySK3TCg8.position();
                        c104831.L$0 = byteReadChannel4;
                        c104831.L$1 = function23;
                        c104831.L$2 = booleanRef2;
                        c104831.L$3 = booleanRef;
                        c104831.L$4 = byteReadChannel3;
                        c104831.L$5 = buffer;
                        c104831.I$0 = iPosition;
                        c104831.label = 2;
                        if (ReadSessionKt.completeReadingFromBuffer(byteReadChannel3, buffer, iPosition, c104831) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c1048312 = c104831;
                        function22 = function23;
                        byteReadChannel2 = byteReadChannel4;
                        if (booleanRef.element) {
                            z = false;
                            i3 = 1;
                            booleanRef2.element = z;
                            c1048312.L$0 = byteReadChannel2;
                            c1048312.L$1 = function22;
                            c1048312.L$2 = booleanRef2;
                            c1048312.L$3 = booleanRef;
                            c1048312.L$4 = byteReadChannel2;
                            c1048312.L$5 = null;
                            c1048312.label = i3;
                            objRequestBuffer = ReadSessionKt.requestBuffer(byteReadChannel2, i3, c1048312);
                            if (objRequestBuffer != coroutine_suspended) {
                            }
                        } else {
                            z = false;
                            i3 = 1;
                            booleanRef2.element = z;
                            c1048312.L$0 = byteReadChannel2;
                            c1048312.L$1 = function22;
                            c1048312.L$2 = booleanRef2;
                            c1048312.L$3 = booleanRef;
                            c1048312.L$4 = byteReadChannel2;
                            c1048312.L$5 = null;
                            c1048312.label = i3;
                            objRequestBuffer = ReadSessionKt.requestBuffer(byteReadChannel2, i3, c1048312);
                            if (objRequestBuffer != coroutine_suspended) {
                            }
                        }
                        empty = (Buffer) obj;
                        if (empty == null) {
                        }
                        buffer = empty;
                        ByteBuffer memory22 = buffer.getMemory();
                        readPosition = buffer.getReadPosition();
                        writePosition = buffer.getWritePosition();
                        if (writePosition > readPosition) {
                        }
                        if (byteBufferM15439getEmptySK3TCg8.remaining() != byteReadChannel4.get_availableForRead()) {
                        }
                        booleanRef.element = z2;
                        booleanRef2.element = function23.invoke(byteBufferM15439getEmptySK3TCg8, Boxing.boxBoolean(z2)).booleanValue();
                        iPosition = byteBufferM15439getEmptySK3TCg8.position();
                        c104831.L$0 = byteReadChannel4;
                        c104831.L$1 = function23;
                        c104831.L$2 = booleanRef2;
                        c104831.L$3 = booleanRef;
                        c104831.L$4 = byteReadChannel3;
                        c104831.L$5 = buffer;
                        c104831.I$0 = iPosition;
                        c104831.label = 2;
                        if (ReadSessionKt.completeReadingFromBuffer(byteReadChannel3, buffer, iPosition, c104831) == coroutine_suspended) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        buffer2 = buffer;
                        c1048313 = c104831;
                        Throwable th4 = th;
                        c1048313.L$0 = th4;
                        c1048313.L$1 = null;
                        c1048313.L$2 = null;
                        c1048313.L$3 = null;
                        c1048313.L$4 = null;
                        c1048313.L$5 = null;
                        c1048313.label = 3;
                        if (ReadSessionKt.completeReadingFromBuffer(byteReadChannel3, buffer2, 0, c1048313) != coroutine_suspended) {
                        }
                    }
                    buffer = empty;
                } else {
                    return Unit.INSTANCE;
                }
            } catch (Throwable th5) {
                th = th5;
                c1048313 = c104831;
                Throwable th42 = th;
                c1048313.L$0 = th42;
                c1048313.L$1 = null;
                c1048313.L$2 = null;
                c1048313.L$3 = null;
                c1048313.L$4 = null;
                c1048313.L$5 = null;
                c1048313.label = 3;
                if (ReadSessionKt.completeReadingFromBuffer(byteReadChannel3, buffer2, 0, c1048313) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th42;
            }
        }
    }

    public static final Object consumeEachBufferRange$$forInline(ByteReadChannel byteReadChannel, Function2<? super ByteBuffer, ? super Boolean, Boolean> function2, Continuation<? super Unit> continuation) {
        ByteBuffer byteBufferM15439getEmptySK3TCg8;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        do {
            booleanRef.element = false;
            InlineMarker.mark(0);
            Object objRequestBuffer = ReadSessionKt.requestBuffer(byteReadChannel, 1, continuation);
            InlineMarker.mark(1);
            Buffer empty = (Buffer) objRequestBuffer;
            if (empty == null) {
                empty = Buffer.INSTANCE.getEmpty();
            }
            try {
                Memory memoryM15422boximpl = Memory.m15422boximpl(empty.getMemory());
                Long lValueOf = Long.valueOf(empty.getReadPosition());
                long jLongValue = Long.valueOf(empty.getWritePosition()).longValue();
                long jLongValue2 = lValueOf.longValue();
                ByteBuffer byteBufferM15438unboximpl = memoryM15422boximpl.m15438unboximpl();
                if (jLongValue > jLongValue2) {
                    byteBufferM15439getEmptySK3TCg8 = Memory.m15434slice87lwejk(byteBufferM15438unboximpl, jLongValue2, jLongValue - jLongValue2);
                } else {
                    byteBufferM15439getEmptySK3TCg8 = Memory.INSTANCE.m15439getEmptySK3TCg8();
                }
                boolean z = byteBufferM15439getEmptySK3TCg8.remaining() == byteReadChannel.get_availableForRead() && byteReadChannel.isClosedForWrite();
                booleanRef2.element = z;
                booleanRef.element = function2.invoke(byteBufferM15439getEmptySK3TCg8, Boolean.valueOf(z)).booleanValue();
                int iIntValue = Integer.valueOf(byteBufferM15439getEmptySK3TCg8.position()).intValue();
                InlineMarker.mark(0);
                ReadSessionKt.completeReadingFromBuffer(byteReadChannel, empty, iIntValue, continuation);
                InlineMarker.mark(1);
                if (booleanRef2.element && byteReadChannel.isClosedForRead()) {
                    break;
                }
            } catch (Throwable th) {
                InlineMarker.mark(0);
                ReadSessionKt.completeReadingFromBuffer(byteReadChannel, empty, 0, continuation);
                InlineMarker.mark(1);
                throw th;
            }
        } while (booleanRef.element);
        return Unit.INSTANCE;
    }
}
