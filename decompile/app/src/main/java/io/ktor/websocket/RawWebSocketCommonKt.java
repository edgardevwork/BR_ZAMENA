package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.H262Reader;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.Ascii;
import io.ktor.util.InternalAPI;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.bits.DefaultAllocator;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.ByteReadPacketExtensionsKt;
import io.ktor.utils.p050io.core.StringsKt;
import io.ktor.websocket.Frame;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a%\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"mask", "Lio/ktor/utils/io/core/ByteReadPacket;", "maskKey", "", "readFrame", "Lio/ktor/websocket/Frame;", "Lio/ktor/utils/io/ByteReadChannel;", "maxFrameSize", "", "lastOpcode", "(Lio/ktor/utils/io/ByteReadChannel;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFrame", "", "Lio/ktor/utils/io/ByteWriteChannel;", TypedValues.AttributesType.S_FRAME, "masking", "", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/websocket/Frame;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRawWebSocketCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawWebSocketCommon.kt\nio/ktor/websocket/RawWebSocketCommonKt\n+ 2 MemoryFactory.kt\nio/ktor/utils/io/bits/MemoryFactoryKt\n+ 3 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n+ 4 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 5 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 6 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 7 Utils.kt\nio/ktor/websocket/UtilsKt__UtilsKt\n+ 8 ByteReadPacket.kt\nio/ktor/utils/io/core/ByteReadPacketKt\n+ 9 ByteReadPacketExtensions.kt\nio/ktor/utils/io/core/ByteReadPacketExtensionsKt\n*L\n1#1,264:1\n33#2,5:265\n48#2,8:270\n57#2,2:293\n51#3,2:278\n12#4,7:280\n19#4,4:289\n84#5:287\n26#6:288\n14#7:295\n14#7:296\n14#7:297\n14#7:298\n14#7:299\n59#8,2:300\n15#9:302\n*S KotlinDebug\n*F\n+ 1 RawWebSocketCommon.kt\nio/ktor/websocket/RawWebSocketCommonKt\n*L\n151#1:265,5\n151#1:270,8\n151#1:293,2\n152#1:278,2\n153#1:280,7\n153#1:289,4\n155#1:287\n155#1:288\n168#1:295\n169#1:296\n170#1:297\n171#1:298\n182#1:299\n191#1:300,2\n191#1:302\n*E\n"})
/* loaded from: classes5.dex */
public final class RawWebSocketCommonKt {

    /* compiled from: RawWebSocketCommon.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.RawWebSocketCommonKt", m7120f = "RawWebSocketCommon.kt", m7121i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, m7122l = {212, 213, 232, 233, MatroskaExtractor.ID_CUE_CLUSTER_POSITION, GifHeaderParser.LABEL_GRAPHIC_CONTROL_EXTENSION}, m7123m = "readFrame", m7124n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "fin", CacheFileMetadataIndex.COLUMN_LENGTH, "frameType", "flagsAndOpcode", "fin", "maskKey"}, m7125s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "I$0", "J$1", "L$0", "B$0", "I$0", "I$1"})
    /* renamed from: io.ktor.websocket.RawWebSocketCommonKt$readFrame$1 */
    /* loaded from: classes6.dex */
    public static final class C105271 extends ContinuationImpl {
        public byte B$0;
        public byte B$1;
        public int I$0;
        public int I$1;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C105271(Continuation<? super C105271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.readFrame(null, 0L, 0, this);
        }
    }

    /* compiled from: RawWebSocketCommon.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.RawWebSocketCommonKt", m7120f = "RawWebSocketCommon.kt", m7121i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, m7122l = {MatroskaExtractor.ID_TRACK_ENTRY, H262Reader.START_GROUP, MatroskaExtractor.ID_CUE_POINT, TsExtractor.TS_PACKET_SIZE, BcBands.WIDE, 201}, m7123m = "writeFrame", m7124n = {"$this$writeFrame", TypedValues.AttributesType.S_FRAME, "masking", CacheFileMetadataIndex.COLUMN_LENGTH, "$this$writeFrame", TypedValues.AttributesType.S_FRAME, "masking", CacheFileMetadataIndex.COLUMN_LENGTH, "formattedLength", "$this$writeFrame", TypedValues.AttributesType.S_FRAME, "masking", "$this$writeFrame", TypedValues.AttributesType.S_FRAME, "masking", "$this$writeFrame", "data", "maskKey"}, m7125s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "I$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1 */
    /* loaded from: classes6.dex */
    public static final class C105281 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C105281(Continuation<? super C105281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.writeFrame(null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InternalAPI
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeFrame(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Frame frame, boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105281 c105281;
        Frame frame2;
        int i;
        boolean z2;
        int i2;
        int i3;
        ByteWriteChannel byteWriteChannel2;
        int i4;
        Frame frame3;
        boolean z3;
        boolean z4;
        Frame frame4;
        ByteWriteChannel byteWriteChannel3;
        ByteReadPacket ByteReadPacket;
        int iNextInt;
        ByteWriteChannel byteWriteChannel4;
        if (continuation instanceof C105281) {
            c105281 = (C105281) continuation;
            int i5 = c105281.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c105281.label = i5 - Integer.MIN_VALUE;
            } else {
                c105281 = new C105281(continuation);
            }
        }
        Object obj = c105281.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c105281.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                int length = frame.getData().length;
                byte opcode = (byte) ((frame.getFin() ? 128 : 0) | (frame.getRsv1() ? 64 : 0) | (frame.getRsv2() ? 32 : 0) | (frame.getRsv3() ? 16 : 0) | frame.getFrameType().getOpcode());
                c105281.L$0 = byteWriteChannel;
                c105281.L$1 = frame;
                c105281.Z$0 = z;
                c105281.I$0 = length;
                c105281.label = 1;
                if (byteWriteChannel.writeByte(opcode, c105281) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                frame2 = frame;
                i = length;
                z2 = z;
                i2 = i >= 126 ? i : i <= 65535 ? 126 : 127;
                i3 = z2 ? 128 : 0;
                c105281.L$0 = byteWriteChannel;
                c105281.L$1 = frame2;
                c105281.Z$0 = z2;
                c105281.I$0 = i;
                c105281.I$1 = i2;
                c105281.label = 2;
                if (byteWriteChannel.writeByte((byte) (i3 | i2), c105281) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteWriteChannel2 = byteWriteChannel;
                i4 = i2;
                frame3 = frame2;
                z3 = z2;
                if (i4 != 126) {
                    c105281.L$0 = byteWriteChannel2;
                    c105281.L$1 = frame3;
                    c105281.Z$0 = z3;
                    c105281.label = 3;
                    if (byteWriteChannel2.writeShort((short) i, c105281) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 == 127) {
                        c105281.L$0 = byteWriteChannel2;
                        c105281.L$1 = frame3;
                        c105281.Z$0 = z3;
                        c105281.label = 4;
                        if (byteWriteChannel2.writeLong(i, c105281) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    final byte[] data = frame3.getData();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(data, 0, data.length);
                    Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
                    ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ByteBuffer it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                            invoke2(byteBuffer);
                            return Unit.INSTANCE;
                        }
                    });
                    if (!z3) {
                        iNextInt = Random.INSTANCE.nextInt();
                        c105281.L$0 = byteWriteChannel2;
                        c105281.L$1 = ByteReadPacket;
                        c105281.I$0 = iNextInt;
                        c105281.label = 5;
                        if (byteWriteChannel2.writeInt(iNextInt, c105281) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteWriteChannel4 = byteWriteChannel2;
                        ByteReadPacket = mask(ByteReadPacket, iNextInt);
                        byteWriteChannel2 = byteWriteChannel4;
                        c105281.L$0 = null;
                        c105281.L$1 = null;
                        c105281.label = 6;
                        if (byteWriteChannel2.writePacket(ByteReadPacket, c105281) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c105281.L$0 = null;
                    c105281.L$1 = null;
                    c105281.label = 6;
                    if (byteWriteChannel2.writePacket(ByteReadPacket, c105281) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                z4 = z3;
                frame4 = frame3;
                byteWriteChannel3 = byteWriteChannel2;
                frame3 = frame4;
                byteWriteChannel2 = byteWriteChannel3;
                z3 = z4;
                final byte[] data2 = frame3.getData();
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(data2, 0, data2.length);
                Intrinsics.checkNotNullExpressionValue(byteBufferWrap2, "wrap(array, offset, length)");
                ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap2, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ByteBuffer it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                        invoke2(byteBuffer);
                        return Unit.INSTANCE;
                    }
                });
                if (!z3) {
                }
            case 1:
                int i6 = c105281.I$0;
                boolean z5 = c105281.Z$0;
                Frame frame5 = (Frame) c105281.L$1;
                ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) c105281.L$0;
                ResultKt.throwOnFailure(obj);
                z2 = z5;
                frame2 = frame5;
                i = i6;
                byteWriteChannel = byteWriteChannel5;
                if (i >= 126) {
                }
                if (z2) {
                }
                c105281.L$0 = byteWriteChannel;
                c105281.L$1 = frame2;
                c105281.Z$0 = z2;
                c105281.I$0 = i;
                c105281.I$1 = i2;
                c105281.label = 2;
                if (byteWriteChannel.writeByte((byte) (i3 | i2), c105281) != coroutine_suspended) {
                }
                break;
            case 2:
                i4 = c105281.I$1;
                i = c105281.I$0;
                z3 = c105281.Z$0;
                frame3 = (Frame) c105281.L$1;
                byteWriteChannel2 = (ByteWriteChannel) c105281.L$0;
                ResultKt.throwOnFailure(obj);
                if (i4 != 126) {
                }
                z4 = z3;
                frame4 = frame3;
                byteWriteChannel3 = byteWriteChannel2;
                frame3 = frame4;
                byteWriteChannel2 = byteWriteChannel3;
                z3 = z4;
                final byte[] data22 = frame3.getData();
                ByteBuffer byteBufferWrap22 = ByteBuffer.wrap(data22, 0, data22.length);
                Intrinsics.checkNotNullExpressionValue(byteBufferWrap22, "wrap(array, offset, length)");
                ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap22, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ByteBuffer it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                        invoke2(byteBuffer);
                        return Unit.INSTANCE;
                    }
                });
                if (!z3) {
                }
                break;
            case 3:
            case 4:
                z4 = c105281.Z$0;
                frame4 = (Frame) c105281.L$1;
                byteWriteChannel3 = (ByteWriteChannel) c105281.L$0;
                ResultKt.throwOnFailure(obj);
                frame3 = frame4;
                byteWriteChannel2 = byteWriteChannel3;
                z3 = z4;
                final byte[] data222 = frame3.getData();
                ByteBuffer byteBufferWrap222 = ByteBuffer.wrap(data222, 0, data222.length);
                Intrinsics.checkNotNullExpressionValue(byteBufferWrap222, "wrap(array, offset, length)");
                ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap222, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ByteBuffer it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                        invoke2(byteBuffer);
                        return Unit.INSTANCE;
                    }
                });
                if (!z3) {
                }
                break;
            case 5:
                iNextInt = c105281.I$0;
                ByteReadPacket = (ByteReadPacket) c105281.L$1;
                byteWriteChannel4 = (ByteWriteChannel) c105281.L$0;
                ResultKt.throwOnFailure(obj);
                ByteReadPacket = mask(ByteReadPacket, iNextInt);
                byteWriteChannel2 = byteWriteChannel4;
                c105281.L$0 = null;
                c105281.L$1 = null;
                c105281.label = 6;
                if (byteWriteChannel2.writePacket(ByteReadPacket, c105281) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38 */
    @InternalAPI
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFrame(@NotNull ByteReadChannel byteReadChannel, long j, int i, @NotNull Continuation<? super Frame> continuation) throws Throwable {
        C105271 c105271;
        long j2;
        int i2;
        Object obj;
        Object obj2;
        ByteReadChannel byteReadChannel2;
        int i3;
        long j3;
        byte b;
        byte bByteValue;
        int i4;
        FrameType frameType;
        int i5;
        FrameType frameType2;
        byte b2;
        int i6;
        byte b3;
        long j4;
        long j5;
        ByteReadChannel byteReadChannel3;
        FrameType frameType3;
        long jShortValue;
        boolean z;
        int i7;
        int i8;
        int i9;
        FrameType frameType4;
        ?? r0;
        boolean z2;
        ByteReadChannel byteReadChannel4 = byteReadChannel;
        if (continuation instanceof C105271) {
            c105271 = (C105271) continuation;
            int i10 = c105271.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c105271.label = i10 - Integer.MIN_VALUE;
            } else {
                c105271 = new C105271(continuation);
            }
        }
        Object obj3 = c105271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c105271.label) {
            case 0:
                ResultKt.throwOnFailure(obj3);
                c105271.L$0 = byteReadChannel4;
                j2 = j;
                c105271.J$0 = j2;
                i2 = i;
                c105271.I$0 = i2;
                c105271.label = 1;
                obj = byteReadChannel4.readByte(c105271);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byte bByteValue2 = ((Number) obj).byteValue();
                c105271.L$0 = byteReadChannel4;
                c105271.J$0 = j2;
                c105271.I$0 = i2;
                c105271.B$0 = bByteValue2;
                c105271.label = 2;
                obj2 = byteReadChannel4.readByte(c105271);
                if (obj2 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadChannel2 = byteReadChannel4;
                i3 = i2;
                obj3 = obj2;
                j3 = j2;
                b = bByteValue2;
                bByteValue = ((Number) obj3).byteValue();
                i4 = b & Ascii.f786SI;
                if (i4 != 0 && i3 == 0) {
                    throw new ProtocolViolationException("Can't continue finished frames");
                }
                int i11 = i4 != 0 ? i3 : i4;
                frameType = FrameType.INSTANCE.get(i11);
                if (frameType != null) {
                    throw new IllegalStateException("Unsupported opcode: " + i11);
                }
                if (i4 != 0 && i3 != 0 && !frameType.getControlFrame()) {
                    throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
                }
                i5 = (b & 128) != 0 ? 1 : 0;
                if (frameType.getControlFrame() && i5 == 0) {
                    throw new ProtocolViolationException("control frames can't be fragmented");
                }
                int i12 = bByteValue & Byte.MAX_VALUE;
                if (i12 == 126) {
                    c105271.L$0 = byteReadChannel2;
                    c105271.L$1 = frameType;
                    c105271.J$0 = j3;
                    c105271.B$0 = b;
                    c105271.B$1 = bByteValue;
                    c105271.I$0 = i5;
                    c105271.label = 3;
                    Object obj4 = byteReadChannel2.readShort(c105271);
                    if (obj4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    frameType2 = frameType;
                    b2 = bByteValue;
                    i6 = i5;
                    obj3 = obj4;
                    jShortValue = ((Number) obj3).shortValue() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                    i5 = i6;
                    bByteValue = b2;
                    b3 = b;
                    byteReadChannel3 = byteReadChannel2;
                    frameType3 = frameType2;
                    j4 = j3;
                    j5 = jShortValue;
                    if (!frameType3.getControlFrame()) {
                    }
                    if ((bByteValue & 128) != 0) {
                    }
                    if (!z) {
                    }
                } else if (i12 == 127) {
                    c105271.L$0 = byteReadChannel2;
                    c105271.L$1 = frameType;
                    c105271.J$0 = j3;
                    c105271.B$0 = b;
                    c105271.B$1 = bByteValue;
                    c105271.I$0 = i5;
                    c105271.label = 4;
                    Object obj5 = byteReadChannel2.readLong(c105271);
                    if (obj5 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    frameType2 = frameType;
                    b2 = bByteValue;
                    i6 = i5;
                    obj3 = obj5;
                    jShortValue = ((Number) obj3).longValue();
                    i5 = i6;
                    bByteValue = b2;
                    b3 = b;
                    byteReadChannel3 = byteReadChannel2;
                    frameType3 = frameType2;
                    j4 = j3;
                    j5 = jShortValue;
                    if (!frameType3.getControlFrame()) {
                    }
                    if ((bByteValue & 128) != 0) {
                    }
                    if (!z) {
                    }
                } else {
                    long j6 = i12;
                    b3 = b;
                    j4 = j3;
                    j5 = j6;
                    byteReadChannel3 = byteReadChannel2;
                    frameType3 = frameType;
                    if (!frameType3.getControlFrame() && j5 > 125) {
                        throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
                    }
                    z = (bByteValue & 128) != 0;
                    if (!z) {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i7 = -1;
                        if (j5 <= ParserMinimalBase.MAX_INT_L) {
                        }
                        throw new FrameTooBigException(j5);
                    }
                    c105271.L$0 = byteReadChannel3;
                    c105271.L$1 = frameType3;
                    c105271.J$0 = j4;
                    c105271.B$0 = b3;
                    c105271.I$0 = i5;
                    c105271.J$1 = j5;
                    c105271.label = 5;
                    Object obj6 = byteReadChannel3.readInt(c105271);
                    if (obj6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i13 = i5;
                    obj3 = obj6;
                    i8 = i13;
                    int iIntValue = ((Number) obj3).intValue();
                    i5 = i8;
                    i7 = iIntValue;
                    if (j5 <= ParserMinimalBase.MAX_INT_L || j5 > j4) {
                        throw new FrameTooBigException(j5);
                    }
                    c105271.L$0 = frameType3;
                    c105271.L$1 = null;
                    c105271.B$0 = b3;
                    c105271.I$0 = i5;
                    c105271.I$1 = i7;
                    c105271.label = 6;
                    Object packet = byteReadChannel3.readPacket((int) j5, c105271);
                    if (packet == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i9 = i5;
                    obj3 = packet;
                    frameType4 = frameType3;
                    ByteReadPacket byteReadPacketMask = (ByteReadPacket) obj3;
                    if (i7 != -1) {
                        byteReadPacketMask = mask(byteReadPacketMask, i7);
                    }
                    Frame.Companion companion = Frame.INSTANCE;
                    if (i9 == 0) {
                        z2 = true;
                        r0 = 0;
                    } else {
                        r0 = 0;
                        z2 = false;
                    }
                    return companion.byType(z2, frameType4, StringsKt.readBytes$default(byteReadPacketMask, r0, 1, null), (b3 & 64) == 0 ? true : r0, (b3 & 32) == 0 ? true : r0, (b3 & 16) == 0 ? true : r0);
                }
            case 1:
                int i14 = c105271.I$0;
                j2 = c105271.J$0;
                ByteReadChannel byteReadChannel5 = (ByteReadChannel) c105271.L$0;
                ResultKt.throwOnFailure(obj3);
                i2 = i14;
                byteReadChannel4 = byteReadChannel5;
                obj = obj3;
                byte bByteValue22 = ((Number) obj).byteValue();
                c105271.L$0 = byteReadChannel4;
                c105271.J$0 = j2;
                c105271.I$0 = i2;
                c105271.B$0 = bByteValue22;
                c105271.label = 2;
                obj2 = byteReadChannel4.readByte(c105271);
                if (obj2 != coroutine_suspended) {
                }
                break;
            case 2:
                byte b4 = c105271.B$0;
                i3 = c105271.I$0;
                long j7 = c105271.J$0;
                ByteReadChannel byteReadChannel6 = (ByteReadChannel) c105271.L$0;
                ResultKt.throwOnFailure(obj3);
                byteReadChannel2 = byteReadChannel6;
                j3 = j7;
                b = b4;
                bByteValue = ((Number) obj3).byteValue();
                i4 = b & Ascii.f786SI;
                if (i4 != 0) {
                }
                if (i4 != 0) {
                }
                frameType = FrameType.INSTANCE.get(i11);
                if (frameType != null) {
                }
                break;
            case 3:
                i6 = c105271.I$0;
                b2 = c105271.B$1;
                b = c105271.B$0;
                j3 = c105271.J$0;
                frameType2 = (FrameType) c105271.L$1;
                byteReadChannel2 = (ByteReadChannel) c105271.L$0;
                ResultKt.throwOnFailure(obj3);
                jShortValue = ((Number) obj3).shortValue() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                i5 = i6;
                bByteValue = b2;
                b3 = b;
                byteReadChannel3 = byteReadChannel2;
                frameType3 = frameType2;
                j4 = j3;
                j5 = jShortValue;
                if (!frameType3.getControlFrame()) {
                }
                if ((bByteValue & 128) != 0) {
                }
                if (!z) {
                }
                break;
            case 4:
                i6 = c105271.I$0;
                b2 = c105271.B$1;
                b = c105271.B$0;
                j3 = c105271.J$0;
                frameType2 = (FrameType) c105271.L$1;
                byteReadChannel2 = (ByteReadChannel) c105271.L$0;
                ResultKt.throwOnFailure(obj3);
                jShortValue = ((Number) obj3).longValue();
                i5 = i6;
                bByteValue = b2;
                b3 = b;
                byteReadChannel3 = byteReadChannel2;
                frameType3 = frameType2;
                j4 = j3;
                j5 = jShortValue;
                if (!frameType3.getControlFrame()) {
                }
                if ((bByteValue & 128) != 0) {
                }
                if (!z) {
                }
                break;
            case 5:
                j5 = c105271.J$1;
                i8 = c105271.I$0;
                b3 = c105271.B$0;
                j4 = c105271.J$0;
                frameType3 = (FrameType) c105271.L$1;
                byteReadChannel3 = (ByteReadChannel) c105271.L$0;
                ResultKt.throwOnFailure(obj3);
                int iIntValue2 = ((Number) obj3).intValue();
                i5 = i8;
                i7 = iIntValue2;
                if (j5 <= ParserMinimalBase.MAX_INT_L) {
                }
                throw new FrameTooBigException(j5);
            case 6:
                i7 = c105271.I$1;
                i9 = c105271.I$0;
                b3 = c105271.B$0;
                FrameType frameType5 = (FrameType) c105271.L$0;
                ResultKt.throwOnFailure(obj3);
                frameType4 = frameType5;
                ByteReadPacket byteReadPacketMask2 = (ByteReadPacket) obj3;
                if (i7 != -1) {
                }
                Frame.Companion companion2 = Frame.INSTANCE;
                if (i9 == 0) {
                }
                return companion2.byType(z2, frameType4, StringsKt.readBytes$default(byteReadPacketMask2, r0, 1, null), (b3 & 64) == 0 ? true : r0, (b3 & 32) == 0 ? true : r0, (b3 & 16) == 0 ? true : r0);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final ByteReadPacket mask(ByteReadPacket byteReadPacket, int i) {
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer byteBufferMo15417allocgFvZug = defaultAllocator.mo15417allocgFvZug(4);
        try {
            byteBufferMo15417allocgFvZug.putInt(0, i);
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            try {
                int remaining = (int) byteReadPacket.getRemaining();
                for (int i2 = 0; i2 < remaining; i2++) {
                    bytePacketBuilder.writeByte((byte) (byteReadPacket.readByte() ^ byteBufferMo15417allocgFvZug.get(i2 % 4)));
                }
                return bytePacketBuilder.build();
            } catch (Throwable th) {
                bytePacketBuilder.release();
                throw th;
            }
        } finally {
            defaultAllocator.mo15418free3GNKZMM(byteBufferMo15417allocgFvZug);
        }
    }
}
