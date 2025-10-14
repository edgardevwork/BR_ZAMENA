package io.ktor.utils.p050io.jvm.nio;

import io.ktor.utils.p050io.ByteWriteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reading.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m7105d2 = {"copyTo", "", "Ljava/nio/channels/Pipe;", "ch", "Lio/ktor/utils/io/ByteWriteChannel;", "limit", "(Ljava/nio/channels/Pipe;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/channels/ReadableByteChannel;", "(Ljava/nio/channels/ReadableByteChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reading.kt\nio/ktor/utils/io/jvm/nio/ReadingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/* loaded from: classes5.dex */
public final class ReadingKt {

    /* compiled from: Reading.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.jvm.nio.ReadingKt", m7120f = "Reading.kt", m7121i = {0, 0, 0, 0, 0, 0}, m7122l = {42}, m7123m = "copyTo", m7124n = {"ch", "copied", "eof", "copy", "limit", "needFlush"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0"})
    /* renamed from: io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$1 */
    /* loaded from: classes6.dex */
    public static final class C105111 extends ContinuationImpl {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C105111(Continuation<? super C105111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadingKt.copyTo((ReadableByteChannel) null, (ByteWriteChannel) null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:31:0x00a0). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(@NotNull final ReadableByteChannel readableByteChannel, @NotNull ByteWriteChannel byteWriteChannel, final long j, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C105111 c105111;
        final Ref.BooleanRef booleanRef;
        Function1<ByteBuffer, Unit> function1;
        int i;
        Ref.LongRef longRef;
        long j2;
        if (continuation instanceof C105111) {
            c105111 = (C105111) continuation;
            int i2 = c105111.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c105111.label = i2 - Integer.MIN_VALUE;
            } else {
                c105111 = new C105111(continuation);
            }
        }
        Object obj = c105111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c105111.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (j < 0) {
                throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
            }
            if ((readableByteChannel instanceof SelectableChannel) && !((SelectableChannel) readableByteChannel).isBlocking()) {
                throw new IllegalArgumentException("Non-blocking channels are not supported");
            }
            final Ref.LongRef longRef2 = new Ref.LongRef();
            booleanRef = new Ref.BooleanRef();
            function1 = new Function1<ByteBuffer, Unit>() { // from class: io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$copy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) throws IOException {
                    invoke2(byteBuffer);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ByteBuffer bb) throws IOException {
                    Intrinsics.checkNotNullParameter(bb, "bb");
                    long j3 = j - longRef2.element;
                    if (j3 < bb.remaining()) {
                        int iLimit = bb.limit();
                        bb.limit(bb.position() + ((int) j3));
                        int i4 = readableByteChannel.read(bb);
                        if (i4 == -1) {
                            booleanRef.element = true;
                        } else {
                            longRef2.element += i4;
                        }
                        bb.limit(iLimit);
                        return;
                    }
                    int i5 = readableByteChannel.read(bb);
                    if (i5 == -1) {
                        booleanRef.element = true;
                    } else {
                        longRef2.element += i5;
                    }
                }
            };
            i = !byteWriteChannel.getAutoFlush() ? 1 : 0;
            longRef = longRef2;
            j2 = longRef.element;
            if (j2 >= j) {
            }
            return Boxing.boxLong(j2);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = c105111.I$0;
        long j3 = c105111.J$0;
        Function1<ByteBuffer, Unit> function12 = (Function1) c105111.L$3;
        booleanRef = (Ref.BooleanRef) c105111.L$2;
        longRef = (Ref.LongRef) c105111.L$1;
        ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) c105111.L$0;
        ResultKt.throwOnFailure(obj);
        function1 = function12;
        j = j3;
        byteWriteChannel = byteWriteChannel2;
        if (i != 0) {
            byteWriteChannel.flush();
        }
        j2 = longRef.element;
        if (j2 >= j && !booleanRef.element) {
            c105111.L$0 = byteWriteChannel;
            c105111.L$1 = longRef;
            c105111.L$2 = booleanRef;
            c105111.L$3 = function1;
            c105111.J$0 = j;
            c105111.I$0 = i;
            c105111.label = 1;
            if (byteWriteChannel.write(1, function1, c105111) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (i != 0) {
            }
            j2 = longRef.element;
            if (j2 >= j) {
            }
            return Boxing.boxLong(j2);
        }
        return Boxing.boxLong(j2);
    }

    public static /* synthetic */ Object copyTo$default(ReadableByteChannel readableByteChannel, ByteWriteChannel byteWriteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(readableByteChannel, byteWriteChannel, j, (Continuation<? super Long>) continuation);
    }

    @Nullable
    public static final Object copyTo(@NotNull Pipe pipe, @NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull Continuation<? super Long> continuation) {
        Pipe.SourceChannel sourceChannelSource = pipe.source();
        Intrinsics.checkNotNullExpressionValue(sourceChannelSource, "source()");
        return copyTo(sourceChannelSource, byteWriteChannel, j, continuation);
    }

    public static /* synthetic */ Object copyTo$default(Pipe pipe, ByteWriteChannel byteWriteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(pipe, byteWriteChannel, j, (Continuation<? super Long>) continuation);
    }
}
