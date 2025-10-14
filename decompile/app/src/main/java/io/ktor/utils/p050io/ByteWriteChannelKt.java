package io.ktor.utils.p050io;

import io.ktor.utils.p050io.core.ByteOrder;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteWriteChannel.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a%\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a.\u0010\u001a\u001a\u00020\t*\u00020\u00022\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u001c¢\u0006\u0002\b\u001eH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a>\u0010 \u001a\u00020\t*\u00020\u00022'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!¢\u0006\u0002\b\u001eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$\u001a\u001d\u0010%\u001a\u00020\t*\u00020\u00022\u0006\u0010&\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a%\u0010%\u001a\u00020\t*\u00020\u00022\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010'\u001a\u001d\u0010(\u001a\u00020\t*\u00020\u00022\u0006\u0010&\u001a\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u001d\u0010(\u001a\u00020\t*\u00020\u00022\u0006\u0010&\u001a\u00020+H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m7105d2 = {"close", "", "Lio/ktor/utils/io/ByteWriteChannel;", "writeAvailable", "", "src", "", "(Lio/ktor/utils/io/ByteWriteChannel;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeBoolean", "", "b", "(Lio/ktor/utils/io/ByteWriteChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeByte", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeChar", "ch", "", "(Lio/ktor/utils/io/ByteWriteChannel;CLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFully", "writeInt", "i", "", "(Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "byteOrder", "Lio/ktor/utils/io/core/ByteOrder;", "(Lio/ktor/utils/io/ByteWriteChannel;JLio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writePacket", "builder", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/BytePacketBuilder;", "Lkotlin/ExtensionFunctionType;", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writePacketSuspend", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeShort", "s", "(Lio/ktor/utils/io/ByteWriteChannel;ILio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeStringUtf8", "", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/CharSequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteWriteChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannel.kt\nio/ktor/utils/io/ByteWriteChannelKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,211:1\n12#2,11:212\n12#2,11:223\n12#2,11:234\n12#2,11:245\n*S KotlinDebug\n*F\n+ 1 ByteWriteChannel.kt\nio/ktor/utils/io/ByteWriteChannelKt\n*L\n171#1:212,11\n179#1:223,11\n198#1:234,11\n202#1:245,11\n*E\n"})
/* loaded from: classes8.dex */
public final class ByteWriteChannelKt {

    /* compiled from: ByteWriteChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteWriteChannelKt", m7120f = "ByteWriteChannel.kt", m7121i = {0}, m7122l = {202, 202}, m7123m = "writePacketSuspend", m7124n = {"builder$iv"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteWriteChannelKt$writePacketSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104721 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104721(Continuation<? super C104721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteWriteChannelKt.writePacketSuspend(null, null, this);
        }
    }

    @Nullable
    public static final Object writeAvailable(@NotNull ByteWriteChannel byteWriteChannel, @NotNull byte[] bArr, @NotNull Continuation<? super Integer> continuation) {
        return byteWriteChannel.writeAvailable(bArr, 0, bArr.length, continuation);
    }

    @Nullable
    public static final Object writeFully(@NotNull ByteWriteChannel byteWriteChannel, @NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteFully = byteWriteChannel.writeFully(bArr, 0, bArr.length, continuation);
        return objWriteFully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeShort(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteShort = byteWriteChannel.writeShort((short) (i & 65535), continuation);
        return objWriteShort == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteShort : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeShort(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteShort = ChannelLittleEndianKt.writeShort(byteWriteChannel, (short) (i & 65535), byteOrder, continuation);
        return objWriteShort == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteShort : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeByte(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteByte = byteWriteChannel.writeByte((byte) (i & 255), continuation);
        return objWriteByte == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteByte : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeInt(@NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteInt = byteWriteChannel.writeInt((int) j, continuation);
        return objWriteInt == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteInt : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeInt(@NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteInt = ChannelLittleEndianKt.writeInt(byteWriteChannel, (int) j, byteOrder, continuation);
        return objWriteInt == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteInt : Unit.INSTANCE;
    }

    public static final boolean close(@NotNull ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return byteWriteChannel.close(null);
    }

    @Nullable
    public static final Object writeBoolean(@NotNull ByteWriteChannel byteWriteChannel, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteByte = byteWriteChannel.writeByte(z ? (byte) 1 : (byte) 0, continuation);
        return objWriteByte == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteByte : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeChar(@NotNull ByteWriteChannel byteWriteChannel, char c, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteShort = writeShort(byteWriteChannel, c, continuation);
        return objWriteShort == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteShort : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writePacketSuspend(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Function2<? super BytePacketBuilder, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104721 c104721;
        BytePacketBuilder bytePacketBuilder;
        if (continuation instanceof C104721) {
            c104721 = (C104721) continuation;
            int i = c104721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104721.label = i - Integer.MIN_VALUE;
            } else {
                c104721 = new C104721(continuation);
            }
        }
        Object obj = c104721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            BytePacketBuilder bytePacketBuilder2 = new BytePacketBuilder(null, 1, null);
            try {
                c104721.L$0 = bytePacketBuilder2;
                c104721.L$1 = byteWriteChannel;
                c104721.label = 1;
                if (function2.invoke(bytePacketBuilder2, c104721) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bytePacketBuilder = bytePacketBuilder2;
            } catch (Throwable th) {
                th = th;
                bytePacketBuilder = bytePacketBuilder2;
                bytePacketBuilder.release();
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            byteWriteChannel = (ByteWriteChannel) c104721.L$1;
            bytePacketBuilder = (BytePacketBuilder) c104721.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                bytePacketBuilder.release();
                throw th;
            }
        }
        ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
        c104721.L$0 = null;
        c104721.L$1 = null;
        c104721.label = 2;
        if (byteWriteChannel.writePacket(byteReadPacketBuild, c104721) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeStringUtf8(@NotNull ByteWriteChannel byteWriteChannel, @NotNull CharSequence charSequence, @NotNull Continuation<? super Unit> continuation) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            StringsKt.writeText$default(bytePacketBuilder, charSequence, 0, 0, (Charset) null, 14, (Object) null);
            Object objWritePacket = byteWriteChannel.writePacket(bytePacketBuilder.build(), continuation);
            return objWritePacket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket : Unit.INSTANCE;
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    @Nullable
    public static final Object writeStringUtf8(@NotNull ByteWriteChannel byteWriteChannel, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            StringsKt.writeText$default(bytePacketBuilder, str, 0, 0, (Charset) null, 14, (Object) null);
            Object objWritePacket = byteWriteChannel.writePacket(bytePacketBuilder.build(), continuation);
            return objWritePacket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket : Unit.INSTANCE;
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    @Nullable
    public static final Object writePacket(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Function1<? super BytePacketBuilder, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            function1.invoke(bytePacketBuilder);
            Object objWritePacket = byteWriteChannel.writePacket(bytePacketBuilder.build(), continuation);
            return objWritePacket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket : Unit.INSTANCE;
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    public static final Object writePacket$$forInline(ByteWriteChannel byteWriteChannel, Function1<? super BytePacketBuilder, Unit> function1, Continuation<? super Unit> continuation) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            function1.invoke(bytePacketBuilder);
            ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
            InlineMarker.mark(0);
            byteWriteChannel.writePacket(byteReadPacketBuild, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }
}
