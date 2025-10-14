package io.ktor.utils.p050io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteReadChannelJVM.kt */
@Metadata(m7104d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 [2\u00020\u0001:\u0001[J\u0011\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H&J\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J,\u0010\u001a\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u001b0\u001d¢\u0006\u0002\b\u001fH'¢\u0006\u0002\u0010 J@\u0010!\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u001b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0$\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\u0002\b\u001fH§@ø\u0001\u0000¢\u0006\u0002\u0010%JG\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH¦@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-J/\u0010.\u001a\u00020\u00132\b\b\u0002\u0010+\u001a\u00020\u00032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00130\u001dH¦@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u000204H¦@ø\u0001\u0000¢\u0006\u0002\u00105J\u0019\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u000200H¦@ø\u0001\u0000¢\u0006\u0002\u00106J)\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u0002072\u0006\u0010*\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u00109J&\u00102\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00130\u001dH&J\u0011\u0010;\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010<\u001a\u00020=H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010>\u001a\u00020?H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010@\u001a\u00020AH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010B\u001a\u00020\u00132\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010DJ\u0019\u0010B\u001a\u00020\u00032\u0006\u00103\u001a\u000200H¦@ø\u0001\u0000¢\u0006\u0002\u00106J)\u0010B\u001a\u00020\u00132\u0006\u00103\u001a\u0002072\u0006\u0010*\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u00109J\u0011\u0010E\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010F\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u001b\u0010K\u001a\u00020H2\b\b\u0002\u0010L\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J!\u0010M\u001a\u00020\u00132\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0002\b\u001fH'J\u0011\u0010O\u001a\u00020PH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J:\u0010Q\u001a\u00020\u00132'\u0010/\u001a#\b\u0001\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130$\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\u0002\b\u001fH§@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010L\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ/\u0010U\u001a\u00020\u000b\"\f\b\u0000\u0010V*\u00060Wj\u0002`X2\u0006\u0010Y\u001a\u0002HV2\u0006\u0010L\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010ZR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, m7105d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "availableForRead", "", "getAvailableForRead", "()I", "closedCause", "", "getClosedCause", "()Ljava/lang/Throwable;", "isClosedForRead", "", "()Z", "isClosedForWrite", "totalBytesRead", "", "getTotalBytesRead", "()J", "awaitContent", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "cause", ClientCookie.DISCARD_ATTR, "max", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookAhead", "R", "visitor", "Lkotlin/Function1;", "Lio/ktor/utils/io/LookAheadSession;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lookAheadSuspend", "Lkotlin/Function2;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peekTo", FirebaseAnalytics.Param.DESTINATION, "Lio/ktor/utils/io/bits/Memory;", "destinationOffset", TypedValues.CycleType.S_WAVE_OFFSET, "min", "peekTo-lBXzO7A", "(Ljava/nio/ByteBuffer;JJJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "consumer", "Ljava/nio/ByteBuffer;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvailable", "dst", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", CacheFileMetadataIndex.COLUMN_LENGTH, "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "block", "readBoolean", "readByte", "", "readDouble", "", "readFloat", "", "readFully", "n", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readInt", "readLong", "readPacket", "Lio/ktor/utils/io/core/ByteReadPacket;", "size", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRemaining", "limit", "readSession", "Lio/ktor/utils/io/ReadSession;", "readShort", "", "readSuspendableSession", "Lio/ktor/utils/io/SuspendableReadSession;", "readUTF8Line", "", "readUTF8LineTo", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "(Ljava/lang/Appendable;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface ByteReadChannel {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Nullable
    Object awaitContent(@NotNull Continuation<? super Unit> continuation);

    boolean cancel(@Nullable Throwable cause);

    @Nullable
    Object discard(long j, @NotNull Continuation<? super Long> continuation);

    /* renamed from: getAvailableForRead */
    int get_availableForRead();

    @Nullable
    Throwable getClosedCause();

    /* renamed from: getTotalBytesRead */
    long get_totalBytesRead();

    boolean isClosedForRead();

    boolean isClosedForWrite();

    @Deprecated(message = "Use read { } instead.")
    <R> R lookAhead(@NotNull Function1<? super LookAheadSession, ? extends R> visitor);

    @Deprecated(message = "Use read { } instead.")
    @Nullable
    <R> Object lookAheadSuspend(@NotNull Function2<? super LookAheadSuspendSession, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation);

    @Nullable
    /* renamed from: peekTo-lBXzO7A */
    Object mo15412peekTolBXzO7A(@NotNull ByteBuffer byteBuffer, long j, long j2, long j3, long j4, @NotNull Continuation<? super Long> continuation);

    @Nullable
    Object read(int i, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    int readAvailable(int min, @NotNull Function1<? super ByteBuffer, Unit> block);

    @Nullable
    Object readAvailable(@NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object readAvailable(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object readAvailable(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object readBoolean(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object readByte(@NotNull Continuation<? super Byte> continuation);

    @Nullable
    Object readDouble(@NotNull Continuation<? super Double> continuation);

    @Nullable
    Object readFloat(@NotNull Continuation<? super Float> continuation);

    @Nullable
    Object readFully(@NotNull ChunkBuffer chunkBuffer, int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object readFully(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object readFully(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object readInt(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object readLong(@NotNull Continuation<? super Long> continuation);

    @Nullable
    Object readPacket(int i, @NotNull Continuation<? super ByteReadPacket> continuation);

    @Nullable
    Object readRemaining(long j, @NotNull Continuation<? super ByteReadPacket> continuation);

    @Deprecated(message = "Use read { } instead.")
    void readSession(@NotNull Function1<? super ReadSession, Unit> consumer);

    @Nullable
    Object readShort(@NotNull Continuation<? super Short> continuation);

    @Deprecated(message = "Use read { } instead.")
    @Nullable
    Object readSuspendableSession(@NotNull Function2<? super SuspendableReadSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object readUTF8Line(int i, @NotNull Continuation<? super String> continuation);

    @Nullable
    <A extends Appendable> Object readUTF8LineTo(@NotNull A a2, int i, @NotNull Continuation<? super Boolean> continuation);

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ int readAvailable$default(ByteReadChannel byteReadChannel, int i, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAvailable");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return byteReadChannel.readAvailable(i, (Function1<? super ByteBuffer, Unit>) function1);
        }

        public static /* synthetic */ Object readRemaining$default(ByteReadChannel byteReadChannel, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            return byteReadChannel.readRemaining(j, continuation);
        }

        public static /* synthetic */ Object read$default(ByteReadChannel byteReadChannel, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return byteReadChannel.read(i, function1, continuation);
        }

        /* renamed from: peekTo-lBXzO7A$default */
        public static /* synthetic */ Object m15415peekTolBXzO7A$default(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, long j, long j2, long j3, long j4, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return byteReadChannel.mo15412peekTolBXzO7A(byteBuffer, j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 1L : j3, (i & 16) != 0 ? Long.MAX_VALUE : j4, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekTo-lBXzO7A");
        }
    }

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lio/ktor/utils/io/ByteReadChannel$Companion;", "", "()V", "Empty", "Lio/ktor/utils/io/ByteReadChannel;", "getEmpty", "()Lio/ktor/utils/io/ByteReadChannel;", "Empty$delegate", "Lkotlin/Lazy;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: Empty$delegate, reason: from kotlin metadata */
        @NotNull
        public static final Lazy<ByteChannel> Empty = LazyKt__LazyJVMKt.lazy(new Function0<ByteChannel>() { // from class: io.ktor.utils.io.ByteReadChannel$Companion$Empty$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ByteChannel invoke() {
                ByteChannel byteChannelByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
                ByteWriteChannelKt.close(byteChannelByteChannel$default);
                return byteChannelByteChannel$default;
            }
        });

        @NotNull
        public final ByteReadChannel getEmpty() {
            return Empty.getValue();
        }
    }
}
