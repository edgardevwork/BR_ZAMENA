package io.ktor.websocket;

import io.ktor.utils.p050io.charsets.EncodingKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.InputPrimitivesKt;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.OutputKt;
import io.ktor.websocket.Frame;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FrameCommon.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m7105d2 = {"readBytes", "", "Lio/ktor/websocket/Frame;", "readReason", "Lio/ktor/websocket/CloseReason;", "Lio/ktor/websocket/Frame$Close;", "readText", "", "Lio/ktor/websocket/Frame$Text;", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFrameCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameCommon.kt\nio/ktor/websocket/FrameCommonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,173:1\n1#2:174\n12#3,11:175\n12#3,11:186\n*S KotlinDebug\n*F\n+ 1 FrameCommon.kt\nio/ktor/websocket/FrameCommonKt\n*L\n142#1:175,11\n161#1:186,11\n*E\n"})
/* loaded from: classes5.dex */
public final class FrameCommonKt {
    @NotNull
    public static final String readText(@NotNull Frame.Text text) {
        Intrinsics.checkNotNullParameter(text, "<this>");
        if (!text.getFin()) {
            throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame".toString());
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "UTF_8.newDecoder()");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            OutputKt.writeFully$default((Output) bytePacketBuilder, text.getData(), 0, 0, 6, (Object) null);
            return EncodingKt.decode$default(charsetDecoderNewDecoder, bytePacketBuilder.build(), 0, 2, null);
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    @NotNull
    public static final byte[] readBytes(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "<this>");
        byte[] data = frame.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @Nullable
    public static final CloseReason readReason(@NotNull Frame.Close close) {
        Intrinsics.checkNotNullParameter(close, "<this>");
        if (close.getData().length < 2) {
            return null;
        }
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            OutputKt.writeFully$default((Output) bytePacketBuilder, close.getData(), 0, 0, 6, (Object) null);
            ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
            return new CloseReason(InputPrimitivesKt.readShort(byteReadPacketBuild), Input.readText$default(byteReadPacketBuild, 0, 0, 3, null));
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }
}
