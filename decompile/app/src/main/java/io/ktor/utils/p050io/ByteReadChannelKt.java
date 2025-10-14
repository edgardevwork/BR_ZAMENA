package io.ktor.utils.p050io;

import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteReadChannel.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a'\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u001d\u0010\u0015\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a!\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"cancel", "", "Lio/ktor/utils/io/ByteReadChannel;", "copyAndClose", "", "dst", "Lio/ktor/utils/io/ByteWriteChannel;", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DISCARD_ATTR, "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardExact", "", "n", "(Lio/ktor/utils/io/ByteReadChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvailable", "", "", "(Lio/ktor/utils/io/ByteReadChannel;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFully", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRemaining", "Lio/ktor/utils/io/core/ByteReadPacket;", "readUTF8Line", "", "readUTF8LineTo", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteReadChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannel.kt\nio/ktor/utils/io/ByteReadChannelKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,265:1\n74#2:266\n*S KotlinDebug\n*F\n+ 1 ByteReadChannel.kt\nio/ktor/utils/io/ByteReadChannelKt\n*L\n210#1:266\n*E\n"})
/* loaded from: classes8.dex */
public final class ByteReadChannelKt {

    /* compiled from: ByteReadChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteReadChannelKt", m7120f = "ByteReadChannel.kt", m7121i = {0}, m7122l = {261}, m7123m = "copyAndClose", m7124n = {"dst"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelKt$copyAndClose$1 */
    /* loaded from: classes7.dex */
    public static final class C104701 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104701(Continuation<? super C104701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelKt.copyAndClose(null, null, 0L, this);
        }
    }

    /* compiled from: ByteReadChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteReadChannelKt", m7120f = "ByteReadChannel.kt", m7121i = {0}, m7122l = {232}, m7123m = "discardExact", m7124n = {"n"}, m7125s = {"J$0"})
    @SourceDebugExtension({"SMAP\nByteReadChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannel.kt\nio/ktor/utils/io/ByteReadChannelKt$discardExact$1\n*L\n1#1,265:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelKt$discardExact$1 */
    /* loaded from: classes7.dex */
    public static final class C104711 extends ContinuationImpl {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C104711(Continuation<? super C104711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelKt.discardExact(null, 0L, this);
        }
    }

    @Nullable
    public static final Object readRemaining(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super ByteReadPacket> continuation) {
        return byteReadChannel.readRemaining(Long.MAX_VALUE, continuation);
    }

    @Nullable
    public static final Object readUTF8LineTo(@NotNull ByteReadChannel byteReadChannel, @NotNull Appendable appendable, @NotNull Continuation<? super Boolean> continuation) {
        return byteReadChannel.readUTF8LineTo(appendable, Integer.MAX_VALUE, continuation);
    }

    @Nullable
    public static final Object readUTF8Line(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super String> continuation) {
        return byteReadChannel.readUTF8Line(Integer.MAX_VALUE, continuation);
    }

    public static final boolean cancel(@NotNull ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return byteReadChannel.cancel(null);
    }

    @Nullable
    public static final Object discard(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Long> continuation) {
        return byteReadChannel.discard(Long.MAX_VALUE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object discardExact(@NotNull ByteReadChannel byteReadChannel, long j, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104711 c104711;
        if (continuation instanceof C104711) {
            c104711 = (C104711) continuation;
            int i = c104711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104711.label = i - Integer.MIN_VALUE;
            } else {
                c104711 = new C104711(continuation);
            }
        }
        Object objDiscard = c104711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDiscard);
            c104711.J$0 = j;
            c104711.label = 1;
            objDiscard = byteReadChannel.discard(j, c104711);
            if (objDiscard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c104711.J$0;
            ResultKt.throwOnFailure(objDiscard);
        }
        if (((Number) objDiscard).longValue() != j) {
            throw new EOFException("Unable to discard " + j + " bytes");
        }
        return Unit.INSTANCE;
    }

    public static final Object discardExact$$forInline(ByteReadChannel byteReadChannel, long j, Continuation<? super Unit> continuation) throws EOFException {
        InlineMarker.mark(0);
        Object objDiscard = byteReadChannel.discard(j, continuation);
        InlineMarker.mark(1);
        if (((Number) objDiscard).longValue() != j) {
            throw new EOFException("Unable to discard " + j + " bytes");
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object readAvailable(@NotNull ByteReadChannel byteReadChannel, @NotNull byte[] bArr, @NotNull Continuation<? super Integer> continuation) {
        return byteReadChannel.readAvailable(bArr, 0, bArr.length, continuation);
    }

    @Nullable
    public static final Object readFully(@NotNull ByteReadChannel byteReadChannel, @NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        Object fully = byteReadChannel.readFully(bArr, 0, bArr.length, continuation);
        return fully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fully : Unit.INSTANCE;
    }

    @Nullable
    public static final Object copyTo(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteWriteChannel byteWriteChannel, @NotNull Continuation<? super Long> continuation) {
        return ByteReadChannelJVMKt.copyTo(byteReadChannel, byteWriteChannel, Long.MAX_VALUE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyAndClose(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C104701 c104701;
        if (continuation instanceof C104701) {
            c104701 = (C104701) continuation;
            int i = c104701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104701.label = i - Integer.MIN_VALUE;
            } else {
                c104701 = new C104701(continuation);
            }
        }
        Object objCopyTo = c104701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCopyTo);
            c104701.L$0 = byteWriteChannel;
            c104701.label = 1;
            objCopyTo = ByteReadChannelJVMKt.copyTo(byteReadChannel, byteWriteChannel, j, c104701);
            if (objCopyTo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteWriteChannel = (ByteWriteChannel) c104701.L$0;
            ResultKt.throwOnFailure(objCopyTo);
        }
        long jLongValue = ((Number) objCopyTo).longValue();
        ByteWriteChannelKt.close(byteWriteChannel);
        return Boxing.boxLong(jLongValue);
    }

    public static /* synthetic */ Object copyAndClose$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyAndClose(byteReadChannel, byteWriteChannel, j, continuation);
    }

    @Nullable
    public static final Object readFully(@NotNull ByteReadChannel byteReadChannel, @NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Unit> continuation) {
        Object fully = byteReadChannel.readFully(chunkBuffer, chunkBuffer.getLimit() - chunkBuffer.getWritePosition(), continuation);
        return fully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fully : Unit.INSTANCE;
    }
}
