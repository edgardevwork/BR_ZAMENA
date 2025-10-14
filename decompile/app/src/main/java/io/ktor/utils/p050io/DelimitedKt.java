package io.ktor.utils.p050io;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.p050io.internal.UtilsKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delimited.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a-\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"readUntilDelimiter", "", "Lio/ktor/utils/io/ByteReadChannel;", TtmlNode.RUBY_DELIMITER, "Ljava/nio/ByteBuffer;", "dst", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readUntilDelimiterSuspend", "copied0", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipDelimiter", "", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipDelimiterSuspend", "startsWithDelimiter", "Lio/ktor/utils/io/LookAheadSession;", "tryCopyUntilDelimiter", "tryEnsureDelimiter", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class DelimitedKt {

    /* compiled from: Delimited.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.DelimitedKt", m7120f = "Delimited.kt", m7121i = {0, 0, 0}, m7122l = {81, 113}, m7123m = "readUntilDelimiterSuspend", m7124n = {"$this$readUntilDelimiterSuspend", "dst", "endFound"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104861 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C104861(Continuation<? super C104861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DelimitedKt.readUntilDelimiterSuspend(null, null, null, 0, this);
        }
    }

    @Nullable
    public static final Object readUntilDelimiter(@NotNull ByteReadChannel byteReadChannel, @NotNull final ByteBuffer byteBuffer, @NotNull final ByteBuffer byteBuffer2, @NotNull Continuation<? super Integer> continuation) {
        int i;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (byteBuffer == byteBuffer2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        byteReadChannel.lookAhead(new Function1<LookAheadSession, Unit>() { // from class: io.ktor.utils.io.DelimitedKt.readUntilDelimiter.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LookAheadSession lookAheadSession) {
                invoke2(lookAheadSession);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LookAheadSession lookAhead) {
                Intrinsics.checkNotNullParameter(lookAhead, "$this$lookAhead");
                do {
                    int iTryCopyUntilDelimiter = DelimitedKt.tryCopyUntilDelimiter(lookAhead, byteBuffer, byteBuffer2);
                    if (iTryCopyUntilDelimiter == 0) {
                        return;
                    }
                    if (iTryCopyUntilDelimiter < 0) {
                        booleanRef.element = true;
                        iTryCopyUntilDelimiter = -iTryCopyUntilDelimiter;
                    }
                    intRef.element += iTryCopyUntilDelimiter;
                    if (!byteBuffer2.hasRemaining()) {
                        return;
                    }
                } while (!booleanRef.element);
            }
        });
        if (intRef.element == 0 && byteReadChannel.isClosedForRead()) {
            i = -1;
        } else if (!byteBuffer2.hasRemaining() || booleanRef.element) {
            i = intRef.element;
        } else {
            return readUntilDelimiterSuspend(byteReadChannel, byteBuffer, byteBuffer2, intRef.element, continuation);
        }
        return Boxing.boxInt(i);
    }

    @Nullable
    public static final Object skipDelimiter(@NotNull ByteReadChannel byteReadChannel, @NotNull final ByteBuffer byteBuffer, @NotNull Continuation<? super Unit> continuation) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        byteReadChannel.lookAhead(new Function1<LookAheadSession, Unit>() { // from class: io.ktor.utils.io.DelimitedKt.skipDelimiter.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LookAheadSession lookAheadSession) {
                invoke2(lookAheadSession);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LookAheadSession lookAhead) {
                Intrinsics.checkNotNullParameter(lookAhead, "$this$lookAhead");
                booleanRef.element = DelimitedKt.tryEnsureDelimiter(lookAhead, byteBuffer) == byteBuffer.remaining();
            }
        });
        if (!booleanRef.element) {
            Object objSkipDelimiterSuspend = skipDelimiterSuspend(byteReadChannel, byteBuffer, continuation);
            return objSkipDelimiterSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSkipDelimiterSuspend : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Delimited.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/LookAheadSuspendSession;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.DelimitedKt$skipDelimiterSuspend$2", m7120f = "Delimited.kt", m7121i = {0}, m7122l = {66}, m7123m = "invokeSuspend", m7124n = {"$this$lookAheadSuspend"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.DelimitedKt$skipDelimiterSuspend$2 */
    /* loaded from: classes7.dex */
    public static final class C104882 extends SuspendLambda implements Function2<LookAheadSuspendSession, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ByteBuffer $delimiter;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104882(ByteBuffer byteBuffer, Continuation<? super C104882> continuation) {
            super(2, continuation);
            this.$delimiter = byteBuffer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C104882 c104882 = new C104882(this.$delimiter, continuation);
            c104882.L$0 = obj;
            return c104882;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LookAheadSuspendSession lookAheadSuspendSession, @Nullable Continuation<? super Unit> continuation) {
            return ((C104882) create(lookAheadSuspendSession, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LookAheadSuspendSession lookAheadSuspendSession;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LookAheadSuspendSession lookAheadSuspendSession2 = (LookAheadSuspendSession) this.L$0;
                int iRemaining = this.$delimiter.remaining();
                this.L$0 = lookAheadSuspendSession2;
                this.label = 1;
                if (lookAheadSuspendSession2.awaitAtLeast(iRemaining, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lookAheadSuspendSession = lookAheadSuspendSession2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lookAheadSuspendSession = (LookAheadSuspendSession) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (DelimitedKt.tryEnsureDelimiter(lookAheadSuspendSession, this.$delimiter) != this.$delimiter.remaining()) {
                throw new IOException("Broken delimiter occurred");
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object skipDelimiterSuspend(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, Continuation<? super Unit> continuation) {
        Object objLookAheadSuspend = byteReadChannel.lookAheadSuspend(new C104882(byteBuffer, null), continuation);
        return objLookAheadSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLookAheadSuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readUntilDelimiterSuspend(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, Continuation<? super Integer> continuation) throws Throwable {
        C104861 c104861;
        ByteReadChannel byteReadChannel2;
        ByteBuffer byteBuffer3;
        Ref.BooleanRef booleanRef;
        int iIntValue;
        int i2;
        if (continuation instanceof C104861) {
            c104861 = (C104861) continuation;
            int i3 = c104861.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104861.label = i3 - Integer.MIN_VALUE;
            } else {
                c104861 = new C104861(continuation);
            }
        }
        C104861 c1048612 = c104861;
        Object objLookAheadSuspend = c1048612.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c1048612.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objLookAheadSuspend);
            if (byteBuffer == byteBuffer2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$1 = new DelimitedKt$readUntilDelimiterSuspend$copied$1(i, byteBuffer, byteBuffer2, booleanRef2, byteReadChannel, null);
            c1048612.L$0 = byteReadChannel;
            c1048612.L$1 = byteBuffer2;
            c1048612.L$2 = booleanRef2;
            c1048612.label = 1;
            objLookAheadSuspend = byteReadChannel.lookAheadSuspend(delimitedKt$readUntilDelimiterSuspend$copied$1, c1048612);
            if (objLookAheadSuspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteReadChannel2 = byteReadChannel;
            byteBuffer3 = byteBuffer2;
            booleanRef = booleanRef2;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c1048612.I$0;
                ResultKt.throwOnFailure(objLookAheadSuspend);
                iIntValue = RangesKt___RangesKt.coerceAtLeast(((Number) objLookAheadSuspend).intValue(), 0) + i2;
                return Boxing.boxInt(iIntValue);
            }
            booleanRef = (Ref.BooleanRef) c1048612.L$2;
            byteBuffer3 = (ByteBuffer) c1048612.L$1;
            byteReadChannel2 = (ByteReadChannel) c1048612.L$0;
            ResultKt.throwOnFailure(objLookAheadSuspend);
        }
        iIntValue = ((Number) objLookAheadSuspend).intValue();
        if (iIntValue <= 0 || !byteReadChannel2.isClosedForWrite() || booleanRef.element) {
            if (iIntValue == 0 && byteReadChannel2.isClosedForRead()) {
                iIntValue = -1;
            }
            return Boxing.boxInt(iIntValue);
        }
        c1048612.L$0 = null;
        c1048612.L$1 = null;
        c1048612.L$2 = null;
        c1048612.I$0 = iIntValue;
        c1048612.label = 2;
        Object available = byteReadChannel2.readAvailable(byteBuffer3, c1048612);
        if (available == coroutine_suspended) {
            return coroutine_suspended;
        }
        i2 = iIntValue;
        objLookAheadSuspend = available;
        iIntValue = RangesKt___RangesKt.coerceAtLeast(((Number) objLookAheadSuspend).intValue(), 0) + i2;
        return Boxing.boxInt(iIntValue);
    }

    public static final int tryCopyUntilDelimiter(LookAheadSession lookAheadSession, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iPutAtMost$default;
        boolean z = false;
        ByteBuffer byteBufferRequest = lookAheadSession.request(0, 1);
        if (byteBufferRequest == null) {
            return 0;
        }
        int iIndexOfPartial = UtilsKt.indexOfPartial(byteBufferRequest, byteBuffer);
        if (iIndexOfPartial != -1) {
            int iMin = Math.min(byteBufferRequest.remaining() - iIndexOfPartial, byteBuffer.remaining());
            int iRemaining = byteBuffer.remaining() - iMin;
            if (iRemaining == 0) {
                iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, byteBufferRequest, byteBufferRequest.position() + iIndexOfPartial);
            } else {
                ByteBuffer remembered = byteBufferRequest.duplicate();
                ByteBuffer byteBufferRequest2 = lookAheadSession.request(iIndexOfPartial + iMin, 1);
                if (byteBufferRequest2 == null) {
                    Intrinsics.checkNotNullExpressionValue(remembered, "remembered");
                    iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial);
                } else if (UtilsKt.startsWith(byteBufferRequest2, byteBuffer, iMin)) {
                    if (byteBufferRequest2.remaining() >= iRemaining) {
                        Intrinsics.checkNotNullExpressionValue(remembered, "remembered");
                        iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(remembered, "remembered");
                        iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial);
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(remembered, "remembered");
                    iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial + 1);
                }
            }
            z = true;
        } else {
            iPutAtMost$default = UtilsKt.putAtMost$default(byteBuffer2, byteBufferRequest, 0, 2, null);
        }
        lookAheadSession.mo15689consumed(iPutAtMost$default);
        return z ? -iPutAtMost$default : iPutAtMost$default;
    }

    public static final int tryEnsureDelimiter(LookAheadSession lookAheadSession, ByteBuffer byteBuffer) throws IOException {
        int iStartsWithDelimiter = startsWithDelimiter(lookAheadSession, byteBuffer);
        if (iStartsWithDelimiter == -1) {
            throw new IOException("Failed to skip delimiter: actual bytes differ from delimiter bytes");
        }
        if (iStartsWithDelimiter < byteBuffer.remaining()) {
            return iStartsWithDelimiter;
        }
        lookAheadSession.mo15689consumed(byteBuffer.remaining());
        return byteBuffer.remaining();
    }

    public static final int startsWithDelimiter(LookAheadSession lookAheadSession, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferRequest = lookAheadSession.request(0, 1);
        if (byteBufferRequest == null) {
            return 0;
        }
        int iIndexOfPartial = UtilsKt.indexOfPartial(byteBufferRequest, byteBuffer);
        if (iIndexOfPartial != 0) {
            return -1;
        }
        int iMin = Math.min(byteBufferRequest.remaining() - iIndexOfPartial, byteBuffer.remaining());
        int iRemaining = byteBuffer.remaining() - iMin;
        if (iRemaining > 0) {
            ByteBuffer byteBufferRequest2 = lookAheadSession.request(iIndexOfPartial + iMin, iRemaining);
            if (byteBufferRequest2 == null) {
                return iMin;
            }
            if (!UtilsKt.startsWith(byteBufferRequest2, byteBuffer, iMin)) {
                return -1;
            }
        }
        return byteBuffer.remaining();
    }
}
