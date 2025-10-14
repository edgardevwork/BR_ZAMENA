package io.ktor.utils.p050io.internal;

import io.ktor.utils.p050io.ByteChannelSequentialBase;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SequentialCopyTo.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"copyToSequentialImpl", "", "Lio/ktor/utils/io/ByteChannelSequentialBase;", "dst", "limit", "(Lio/ktor/utils/io/ByteChannelSequentialBase;Lio/ktor/utils/io/ByteChannelSequentialBase;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToTail", "joinToImpl", "", "closeOnEnd", "", "(Lio/ktor/utils/io/ByteChannelSequentialBase;Lio/ktor/utils/io/ByteChannelSequentialBase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class SequentialCopyToKt {

    /* compiled from: SequentialCopyTo.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.internal.SequentialCopyToKt", m7120f = "SequentialCopyTo.kt", m7121i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m7122l = {26, 31, 39}, m7123m = "copyToSequentialImpl", m7124n = {"$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "transferred"}, m7125s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$2"})
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$copyToSequentialImpl$1 */
    /* loaded from: classes6.dex */
    public static final class C105031 extends ContinuationImpl {
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C105031(Continuation<? super C105031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyToKt.copyToSequentialImpl(null, null, 0L, this);
        }
    }

    /* compiled from: SequentialCopyTo.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.internal.SequentialCopyToKt", m7120f = "SequentialCopyTo.kt", m7121i = {0, 0, 1, 1}, m7122l = {60, 66}, m7123m = "copyToTail", m7124n = {"dst", "lastPiece", "lastPiece", "rc"}, m7125s = {"L$0", "L$1", "L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$copyToTail$1 */
    /* loaded from: classes6.dex */
    public static final class C105041 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C105041(Continuation<? super C105041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyToKt.copyToTail(null, null, 0L, this);
        }
    }

    /* compiled from: SequentialCopyTo.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.internal.SequentialCopyToKt", m7120f = "SequentialCopyTo.kt", m7121i = {0, 0}, m7122l = {7}, m7123m = "joinToImpl", m7124n = {"dst", "closeOnEnd"}, m7125s = {"L$0", "Z$0"})
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$joinToImpl$1 */
    /* loaded from: classes6.dex */
    public static final class C105051 extends ContinuationImpl {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C105051(Continuation<? super C105051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyToKt.joinToImpl(null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinToImpl(@NotNull ByteChannelSequentialBase byteChannelSequentialBase, @NotNull ByteChannelSequentialBase byteChannelSequentialBase2, boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105051 c105051;
        if (continuation instanceof C105051) {
            c105051 = (C105051) continuation;
            int i = c105051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105051.label = i - Integer.MIN_VALUE;
            } else {
                c105051 = new C105051(continuation);
            }
        }
        Object obj = c105051.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c105051.L$0 = byteChannelSequentialBase2;
            c105051.Z$0 = z;
            c105051.label = 1;
            if (copyToSequentialImpl(byteChannelSequentialBase, byteChannelSequentialBase2, Long.MAX_VALUE, c105051) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c105051.Z$0;
            byteChannelSequentialBase2 = (ByteChannelSequentialBase) c105051.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (z) {
            ByteWriteChannelKt.close(byteChannelSequentialBase2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x00d8 -> B:107:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00de -> B:106:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x00f0 -> B:106:0x00f3). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToSequentialImpl(@NotNull ByteChannelSequentialBase byteChannelSequentialBase, @NotNull ByteChannelSequentialBase byteChannelSequentialBase2, long j, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C105031 c105031;
        ByteChannelSequentialBase byteChannelSequentialBase3;
        long j2;
        long j3;
        ByteChannelSequentialBase byteChannelSequentialBase4;
        long jLongValue;
        long j4;
        long j5;
        ByteChannelSequentialBase byteChannelSequentialBase5 = byteChannelSequentialBase2;
        if (continuation instanceof C105031) {
            c105031 = (C105031) continuation;
            int i = c105031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105031.label = i - Integer.MIN_VALUE;
            } else {
                c105031 = new C105031(continuation);
            }
        }
        Object objCopyToTail = c105031.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCopyToTail);
            byteChannelSequentialBase3 = byteChannelSequentialBase;
            if (byteChannelSequentialBase3 == byteChannelSequentialBase5) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (byteChannelSequentialBase.getClosedCause() != null) {
                byteChannelSequentialBase5.close(byteChannelSequentialBase.getClosedCause());
                return Boxing.boxLong(0L);
            }
            j2 = j;
            j3 = j2;
            if (j2 > 0) {
            }
            return Boxing.boxLong(j3 - j2);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j2 = c105031.J$1;
                j3 = c105031.J$0;
                byteChannelSequentialBase5 = (ByteChannelSequentialBase) c105031.L$1;
                byteChannelSequentialBase4 = (ByteChannelSequentialBase) c105031.L$0;
                ResultKt.throwOnFailure(objCopyToTail);
                jLongValue = ((Number) objCopyToTail).longValue();
                if (jLongValue != 0) {
                }
                return Boxing.boxLong(j3 - j2);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long jTransferTo$ktor_io = c105031.J$2;
            j5 = c105031.J$1;
            j4 = c105031.J$0;
            byteChannelSequentialBase5 = (ByteChannelSequentialBase) c105031.L$1;
            byteChannelSequentialBase4 = (ByteChannelSequentialBase) c105031.L$0;
            ResultKt.throwOnFailure(objCopyToTail);
            byteChannelSequentialBase3 = byteChannelSequentialBase4;
            long j6 = j5;
            j3 = j4;
            jLongValue = jTransferTo$ktor_io;
            j2 = j6;
            j2 -= jLongValue;
            if (jLongValue > 0) {
                byteChannelSequentialBase5.flush();
            }
            if (j2 > 0) {
                c105031.L$0 = byteChannelSequentialBase3;
                c105031.L$1 = byteChannelSequentialBase5;
                c105031.J$0 = j3;
                c105031.J$1 = j2;
                c105031.label = 1;
                Object objAwaitInternalAtLeast1$ktor_io = byteChannelSequentialBase3.awaitInternalAtLeast1$ktor_io(c105031);
                if (objAwaitInternalAtLeast1$ktor_io == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = j3;
                j5 = j2;
                byteChannelSequentialBase4 = byteChannelSequentialBase3;
                objCopyToTail = objAwaitInternalAtLeast1$ktor_io;
                if (((Boolean) objCopyToTail).booleanValue()) {
                    j2 = j5;
                    j3 = j4;
                } else {
                    jTransferTo$ktor_io = byteChannelSequentialBase4.transferTo$ktor_io(byteChannelSequentialBase5, j5);
                    if (jTransferTo$ktor_io == 0) {
                        c105031.L$0 = byteChannelSequentialBase4;
                        c105031.L$1 = byteChannelSequentialBase5;
                        c105031.J$0 = j4;
                        c105031.J$1 = j5;
                        c105031.label = 2;
                        objCopyToTail = copyToTail(byteChannelSequentialBase4, byteChannelSequentialBase5, j5, c105031);
                        if (objCopyToTail == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = j5;
                        j3 = j4;
                        jLongValue = ((Number) objCopyToTail).longValue();
                        if (jLongValue != 0) {
                            byteChannelSequentialBase3 = byteChannelSequentialBase4;
                            j2 -= jLongValue;
                            if (jLongValue > 0) {
                            }
                            if (j2 > 0) {
                            }
                        }
                    } else {
                        if (byteChannelSequentialBase5.getAvailableForWrite() == 0) {
                            c105031.L$0 = byteChannelSequentialBase4;
                            c105031.L$1 = byteChannelSequentialBase5;
                            c105031.J$0 = j4;
                            c105031.J$1 = j5;
                            c105031.J$2 = jTransferTo$ktor_io;
                            c105031.label = 3;
                            if (byteChannelSequentialBase5.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c105031) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        byteChannelSequentialBase3 = byteChannelSequentialBase4;
                        long j62 = j5;
                        j3 = j4;
                        jLongValue = jTransferTo$ktor_io;
                        j2 = j62;
                        j2 -= jLongValue;
                        if (jLongValue > 0) {
                        }
                        if (j2 > 0) {
                        }
                    }
                }
            }
            return Boxing.boxLong(j3 - j2);
        }
        long j7 = c105031.J$1;
        long j8 = c105031.J$0;
        byteChannelSequentialBase5 = (ByteChannelSequentialBase) c105031.L$1;
        byteChannelSequentialBase4 = (ByteChannelSequentialBase) c105031.L$0;
        ResultKt.throwOnFailure(objCopyToTail);
        j4 = j8;
        j5 = j7;
        if (((Boolean) objCopyToTail).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Type inference failed for: r9v10, types: [io.ktor.utils.io.core.internal.ChunkBuffer] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToTail(ByteChannelSequentialBase byteChannelSequentialBase, ByteChannelSequentialBase byteChannelSequentialBase2, long j, Continuation<? super Long> continuation) throws Throwable {
        C105041 c105041;
        ChunkBuffer chunkBufferBorrow;
        Object available;
        ByteChannelSequentialBase byteChannelSequentialBase3;
        int iIntValue;
        if (continuation instanceof C105041) {
            c105041 = (C105041) continuation;
            int i = c105041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105041.label = i - Integer.MIN_VALUE;
            } else {
                c105041 = new C105041(continuation);
            }
        }
        Object obj = c105041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105041.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
                try {
                    chunkBufferBorrow.resetForWrite((int) RangesKt___RangesKt.coerceAtMost(j, chunkBufferBorrow.getCapacity()));
                    c105041.L$0 = byteChannelSequentialBase2;
                    c105041.L$1 = chunkBufferBorrow;
                    c105041.label = 1;
                    available = byteChannelSequentialBase.readAvailable(chunkBufferBorrow, c105041);
                    byteChannelSequentialBase3 = byteChannelSequentialBase2;
                    if (available == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    byteChannelSequentialBase2 = chunkBufferBorrow;
                    byteChannelSequentialBase2.release(ChunkBuffer.INSTANCE.getPool());
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iIntValue = c105041.I$0;
                    ChunkBuffer chunkBuffer = (ChunkBuffer) c105041.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteChannelSequentialBase2 = chunkBuffer;
                    Long lBoxLong = Boxing.boxLong(iIntValue);
                    byteChannelSequentialBase2.release(ChunkBuffer.INSTANCE.getPool());
                    return lBoxLong;
                }
                ChunkBuffer chunkBuffer2 = (ChunkBuffer) c105041.L$1;
                ByteChannelSequentialBase byteChannelSequentialBase4 = (ByteChannelSequentialBase) c105041.L$0;
                ResultKt.throwOnFailure(obj);
                byteChannelSequentialBase3 = byteChannelSequentialBase4;
                available = obj;
                chunkBufferBorrow = chunkBuffer2;
            }
            iIntValue = ((Number) available).intValue();
            if (iIntValue == -1) {
                ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
                chunkBufferBorrow.release(companion.getPool());
                Long lBoxLong2 = Boxing.boxLong(0L);
                chunkBufferBorrow.release(companion.getPool());
                return lBoxLong2;
            }
            c105041.L$0 = chunkBufferBorrow;
            c105041.L$1 = null;
            c105041.I$0 = iIntValue;
            c105041.label = 2;
            if (byteChannelSequentialBase3.writeFully(chunkBufferBorrow, c105041) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase2 = chunkBufferBorrow;
            Long lBoxLong3 = Boxing.boxLong(iIntValue);
            byteChannelSequentialBase2.release(ChunkBuffer.INSTANCE.getPool());
            return lBoxLong3;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
