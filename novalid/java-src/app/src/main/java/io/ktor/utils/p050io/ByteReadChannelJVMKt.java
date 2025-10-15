package io.ktor.utils.p050io;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.internal.SequentialCopyToKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteReadChannelJVM.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a%\u0010\r\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"copyTo", "", "Lio/ktor/utils/io/ByteReadChannel;", "dst", "Lio/ktor/utils/io/ByteWriteChannel;", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToImpl", "joinTo", "", "closeOnEnd", "", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinToImplSuspend", "close", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ByteReadChannelJVMKt {

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteReadChannelJVMKt", m7120f = "ByteReadChannelJVM.kt", m7121i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m7122l = {309, 312}, m7123m = "copyToImpl", m7124n = {"$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "size"}, m7125s = {"L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelJVMKt$copyToImpl$1 */
    /* loaded from: classes7.dex */
    public static final class C104681 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C104681(Continuation<? super C104681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelJVMKt.copyToImpl(null, null, 0L, this);
        }
    }

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteReadChannelJVMKt", m7120f = "ByteReadChannelJVM.kt", m7121i = {0, 0}, m7122l = {267}, m7123m = "joinToImplSuspend", m7124n = {"dst", "close"}, m7125s = {"L$0", "Z$0"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelJVMKt$joinToImplSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104691 extends ContinuationImpl {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C104691(Continuation<? super C104691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelJVMKt.joinToImplSuspend(null, null, false, this);
        }
    }

    @Nullable
    public static final Object joinTo(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteWriteChannel byteWriteChannel, boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (byteWriteChannel == byteReadChannel) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if ((byteReadChannel instanceof ByteBufferChannel) && (byteWriteChannel instanceof ByteBufferChannel)) {
            Object objJoinFrom$ktor_io = ((ByteBufferChannel) byteWriteChannel).joinFrom$ktor_io((ByteBufferChannel) byteReadChannel, z, continuation);
            return objJoinFrom$ktor_io == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinFrom$ktor_io : Unit.INSTANCE;
        }
        Object objJoinToImplSuspend = joinToImplSuspend(byteReadChannel, byteWriteChannel, z, continuation);
        return objJoinToImplSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinToImplSuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinToImplSuspend(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        C104691 c104691;
        if (continuation instanceof C104691) {
            c104691 = (C104691) continuation;
            int i = c104691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104691.label = i - Integer.MIN_VALUE;
            } else {
                c104691 = new C104691(continuation);
            }
        }
        Object obj = c104691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104691.L$0 = byteWriteChannel;
            c104691.Z$0 = z;
            c104691.label = 1;
            if (copyTo(byteReadChannel, byteWriteChannel, Long.MAX_VALUE, c104691) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c104691.Z$0;
            byteWriteChannel = (ByteWriteChannel) c104691.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (z) {
            ByteWriteChannelKt.close(byteWriteChannel);
        } else {
            byteWriteChannel.flush();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object copyTo(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull Continuation<? super Long> continuation) {
        if (byteReadChannel == byteWriteChannel) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j == 0) {
            return Boxing.boxLong(0L);
        }
        if ((byteReadChannel instanceof ByteBufferChannel) && (byteWriteChannel instanceof ByteBufferChannel)) {
            return ((ByteBufferChannel) byteWriteChannel).copyDirect$ktor_io((ByteBufferChannel) byteReadChannel, j, null, continuation);
        }
        if ((byteReadChannel instanceof ByteChannelSequentialBase) && (byteWriteChannel instanceof ByteChannelSequentialBase)) {
            return SequentialCopyToKt.copyToSequentialImpl((ByteChannelSequentialBase) byteReadChannel, (ByteChannelSequentialBase) byteWriteChannel, Long.MAX_VALUE, continuation);
        }
        return copyToImpl(byteReadChannel, byteWriteChannel, j, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:37:0x00e8, B:39:0x00ee, B:25:0x008f), top: B:54:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0040, B:29:0x00bb, B:31:0x00c4, B:46:0x0101, B:20:0x0067), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00db -> B:35:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToImpl(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation<? super Long> continuation) throws Throwable {
        C104681 c104681;
        ByteWriteChannel byteWriteChannel2;
        ChunkBuffer chunkBufferBorrow;
        long j2;
        ?? r10;
        long j3;
        ByteReadChannel byteReadChannel2;
        C104681 c1046812;
        ByteWriteChannel byteWriteChannel3;
        ByteReadChannel byteReadChannel3;
        long j4;
        long j5;
        int i;
        int iIntValue;
        long j6;
        if (continuation instanceof C104681) {
            c104681 = (C104681) continuation;
            int i2 = c104681.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104681.label = i2 - Integer.MIN_VALUE;
            } else {
                c104681 = new C104681(continuation);
            }
        }
        Object obj = c104681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104681.label;
        long j7 = 0;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                j2 = j;
                chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
                r10 = !byteWriteChannel.getAutoFlush();
                j3 = 0;
                byteReadChannel2 = byteReadChannel;
                c1046812 = c104681;
                byteWriteChannel3 = byteWriteChannel;
                j6 = j2 - j3;
                if (j6 != j7) {
                }
            } else if (i3 == 1) {
                j5 = c104681.J$1;
                i = c104681.I$0;
                j4 = c104681.J$0;
                chunkBufferBorrow = (ChunkBuffer) c104681.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c104681.L$1;
                byteReadChannel3 = (ByteReadChannel) c104681.L$0;
                ResultKt.throwOnFailure(obj);
                iIntValue = ((Number) obj).intValue();
                if (iIntValue == -1) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = c104681.I$1;
                j5 = c104681.J$1;
                int i5 = c104681.I$0;
                long j8 = c104681.J$0;
                chunkBufferBorrow = (ChunkBuffer) c104681.L$2;
                ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) c104681.L$1;
                ByteReadChannel byteReadChannel4 = (ByteReadChannel) c104681.L$0;
                ResultKt.throwOnFailure(obj);
                C104681 c1046813 = c104681;
                byteWriteChannel3 = byteWriteChannel4;
                byteReadChannel2 = byteReadChannel4;
                int i6 = i5;
                long j9 = j5 + i4;
                if (i6 != 0) {
                    try {
                        if (byteReadChannel2.get_availableForRead() == 0) {
                            byteWriteChannel3.flush();
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteWriteChannel2 = byteWriteChannel3;
                        try {
                            byteWriteChannel2.close(th);
                            throw th;
                        } finally {
                            chunkBufferBorrow.release(ChunkBuffer.INSTANCE.getPool());
                        }
                    }
                }
                c1046812 = c1046813;
                j7 = 0;
                j2 = j8;
                j3 = j9;
                r10 = i6;
                j6 = j2 - j3;
                if (j6 != j7) {
                    chunkBufferBorrow.resetForWrite((int) Math.min(chunkBufferBorrow.getCapacity(), j6));
                    c1046812.L$0 = byteReadChannel2;
                    c1046812.L$1 = byteWriteChannel3;
                    c1046812.L$2 = chunkBufferBorrow;
                    c1046812.J$0 = j2;
                    c1046812.I$0 = r10;
                    c1046812.J$1 = j3;
                    c1046812.label = 1;
                    Object available = byteReadChannel2.readAvailable(chunkBufferBorrow, c1046812);
                    if (available == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteWriteChannel2 = byteWriteChannel3;
                    c104681 = c1046812;
                    i = r10;
                    byteReadChannel3 = byteReadChannel2;
                    obj = available;
                    j4 = j2;
                    j5 = j3;
                    iIntValue = ((Number) obj).intValue();
                    if (iIntValue == -1) {
                        c104681.L$0 = byteReadChannel3;
                        c104681.L$1 = byteWriteChannel2;
                        c104681.L$2 = chunkBufferBorrow;
                        c104681.J$0 = j4;
                        c104681.I$0 = i;
                        c104681.J$1 = j5;
                        c104681.I$1 = iIntValue;
                        c104681.label = 2;
                        if (byteWriteChannel2.writeFully(chunkBufferBorrow, c104681) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c1046813 = c104681;
                        byteWriteChannel3 = byteWriteChannel2;
                        int i7 = i;
                        i4 = iIntValue;
                        byteReadChannel2 = byteReadChannel3;
                        j8 = j4;
                        i6 = i7;
                        long j92 = j5 + i4;
                        if (i6 != 0) {
                        }
                        c1046812 = c1046813;
                        j7 = 0;
                        j2 = j8;
                        j3 = j92;
                        r10 = i6;
                        j6 = j2 - j3;
                        if (j6 != j7) {
                            byteWriteChannel2 = byteWriteChannel3;
                            return Boxing.boxLong(j3);
                        }
                    } else {
                        j3 = j5;
                        return Boxing.boxLong(j3);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
