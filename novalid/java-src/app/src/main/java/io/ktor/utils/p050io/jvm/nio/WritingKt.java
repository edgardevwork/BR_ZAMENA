package io.ktor.utils.p050io.jvm.nio;

import io.ktor.utils.p050io.ByteReadChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
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

/* compiled from: Writing.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"copyTo", "", "Lio/ktor/utils/io/ByteReadChannel;", "pipe", "Ljava/nio/channels/Pipe;", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/channels/Pipe;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channel", "Ljava/nio/channels/WritableByteChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/channels/WritableByteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Writing.kt\nio/ktor/utils/io/jvm/nio/WritingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes5.dex */
public final class WritingKt {

    /* compiled from: Writing.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.jvm.nio.WritingKt", m7120f = "Writing.kt", m7121i = {0, 0, 0, 0}, m7122l = {50}, m7123m = "copyTo", m7124n = {"$this$copyTo", "copied", "copy", "limit"}, m7125s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: io.ktor.utils.io.jvm.nio.WritingKt$copyTo$1 */
    /* loaded from: classes6.dex */
    public static final class C105121 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105121(Continuation<? super C105121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WritingKt.copyTo((ByteReadChannel) null, (WritableByteChannel) null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007f A[PHI: r2 r7 r9 r11
  0x007f: PHI (r2v2 kotlin.jvm.functions.Function1<java.nio.ByteBuffer, kotlin.Unit>) = 
  (r2v1 kotlin.jvm.functions.Function1<java.nio.ByteBuffer, kotlin.Unit>)
  (r2v3 kotlin.jvm.functions.Function1<java.nio.ByteBuffer, kotlin.Unit>)
 binds: [B:75:0x0075, B:82:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r7v11 io.ktor.utils.io.ByteReadChannel) = (r7v0 io.ktor.utils.io.ByteReadChannel), (r7v12 io.ktor.utils.io.ByteReadChannel) binds: [B:75:0x0075, B:82:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r9v1 long) = (r9v0 long), (r9v2 long) binds: [B:75:0x0075, B:82:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r11v10 kotlin.jvm.internal.Ref$LongRef) = (r11v5 kotlin.jvm.internal.Ref$LongRef), (r11v11 kotlin.jvm.internal.Ref$LongRef) binds: [B:75:0x0075, B:82:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0094 -> B:81:0x0097). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(@NotNull ByteReadChannel byteReadChannel, @NotNull final WritableByteChannel writableByteChannel, final long j, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C105121 c105121;
        final Ref.LongRef longRef;
        Function1<ByteBuffer, Unit> function1;
        Throwable closedCause;
        if (continuation instanceof C105121) {
            c105121 = (C105121) continuation;
            int i = c105121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105121.label = i - Integer.MIN_VALUE;
            } else {
                c105121 = new C105121(continuation);
            }
        }
        Object obj = c105121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105121.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = c105121.J$0;
            Function1<ByteBuffer, Unit> function12 = (Function1) c105121.L$2;
            Ref.LongRef longRef2 = (Ref.LongRef) c105121.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c105121.L$0;
            ResultKt.throwOnFailure(obj);
            longRef = longRef2;
            function1 = function12;
            j = j2;
            byteReadChannel = byteReadChannel2;
            if (!byteReadChannel.isClosedForRead()) {
                if (longRef.element < j) {
                    c105121.L$0 = byteReadChannel;
                    c105121.L$1 = longRef;
                    c105121.L$2 = function1;
                    c105121.J$0 = j;
                    c105121.label = 1;
                    if (byteReadChannel.read(0, function1, c105121) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                }
            }
            closedCause = byteReadChannel.getClosedCause();
            if (closedCause == null) {
                throw closedCause;
            }
            return Boxing.boxLong(longRef.element);
        }
        ResultKt.throwOnFailure(obj);
        if (j < 0) {
            throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
        }
        if ((writableByteChannel instanceof SelectableChannel) && !((SelectableChannel) writableByteChannel).isBlocking()) {
            throw new IllegalArgumentException("Non-blocking channels are not supported");
        }
        if (byteReadChannel.isClosedForRead()) {
            Throwable closedCause2 = byteReadChannel.getClosedCause();
            if (closedCause2 != null) {
                throw closedCause2;
            }
            return Boxing.boxLong(0L);
        }
        longRef = new Ref.LongRef();
        function1 = new Function1<ByteBuffer, Unit>() { // from class: io.ktor.utils.io.jvm.nio.WritingKt$copyTo$copy$1
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
                long j3 = j - longRef.element;
                if (j3 < bb.remaining()) {
                    int iLimit = bb.limit();
                    bb.limit(bb.position() + ((int) j3));
                    while (bb.hasRemaining()) {
                        writableByteChannel.write(bb);
                    }
                    bb.limit(iLimit);
                    longRef.element += j3;
                    return;
                }
                long jWrite = 0;
                while (bb.hasRemaining()) {
                    jWrite += writableByteChannel.write(bb);
                }
                longRef.element += jWrite;
            }
        };
        if (longRef.element < j) {
        }
        closedCause = byteReadChannel.getClosedCause();
        if (closedCause == null) {
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, WritableByteChannel writableByteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, writableByteChannel, j, (Continuation<? super Long>) continuation);
    }

    @Nullable
    public static final Object copyTo(@NotNull ByteReadChannel byteReadChannel, @NotNull Pipe pipe, long j, @NotNull Continuation<? super Long> continuation) {
        Pipe.SinkChannel sinkChannelSink = pipe.sink();
        Intrinsics.checkNotNullExpressionValue(sinkChannelSink, "pipe.sink()");
        return copyTo(byteReadChannel, sinkChannelSink, j, continuation);
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, Pipe pipe, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, pipe, j, (Continuation<? super Long>) continuation);
    }
}
