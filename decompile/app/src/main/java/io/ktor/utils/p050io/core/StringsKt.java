package io.ktor.utils.p050io.core;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.charsets.EncodingKt;
import io.ktor.utils.p050io.core.internal.CharArraySequence;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.EncodeResult;
import io.ktor.utils.p050io.core.internal.UTF8Kt;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Strings.kt */
@Metadata(m7104d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\r\u0010\t\u001a\u00020\n*\u00020\u000bH\u0082\b\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0010\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003\u001a\u001e\u0010\u0011\u001a\u00020\r*\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00102\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00102\n\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u0007\u001a.\u0010\u0014\u001a\u00020\u0003*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u001a\"\u0010 \u001a\u00020\u0015*\u00020\u00102\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0007\u001a\"\u0010!\u001a\u00020\u0015*\u00020\u00102\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\"\u001a\u00020\u0003H\u0007\u001a \u0010!\u001a\u00020\u0015*\u00020\u00102\u0006\u0010#\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a \u0010$\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\b\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a \u0010%\u001a\u0004\u0018\u00010\u0015*\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a \u0010%\u001a\u0004\u0018\u00010\u0015*\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010'\u001a\u00020\n*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010(\u001a\u00020\u0015*\u00020\u00102\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a$\u0010*\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u001d\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a(\u0010*\u001a\u00020\u0003*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a,\u0010,\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u001d\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a0\u0010,\u001a\u00020\u0003*\u00020\u00102\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a$\u0010.\u001a\u00020\u0003*\u00020\u00102\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020+H\u0002\u001a\u001b\u0010/\u001a\u00020\r*\u00020\u00152\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0086\b\u001a4\u00100\u001a\u000201*\u00020+2\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a4\u00100\u001a\u000201*\u00020+2\u0006\u00102\u001a\u0002062\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\f\b\u0002\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019\u001a$\u00107\u001a\u000201*\u00020+2\u0006\u00102\u001a\u0002062\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0002¨\u00068"}, m7105d2 = {"bufferLimitExceeded", "", "limit", "", "prematureEndOfStream", "size", "", "prematureEndOfStreamToReadChars", "charactersCount", "isAsciiChar", "", "", "readBytes", "", "Lio/ktor/utils/io/core/ByteReadPacket;", "n", "Lio/ktor/utils/io/core/Input;", "readBytesOf", "min", "max", "readText", "", "Lio/ktor/utils/io/core/Buffer;", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "decoder", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "readTextExact", "readTextExactBytes", "bytes", "bytesCount", "readTextExactCharacters", "readUTF8Line", "estimate", "readUTF8LineTo", "readUTF8UntilDelimiter", "delimiters", "readUTF8UntilDelimiterTo", "Lio/ktor/utils/io/core/Output;", "readUTF8UntilDelimiterToSlowUtf8", "decoded0", "readUTFUntilDelimiterToSlowAscii", "toByteArray", "writeText", "", "text", "", "fromIndex", "toIndex", "", "writeTextUtf8", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/core/StringsKt\n+ 2 Packet.kt\nio/ktor/utils/io/core/PacketKt\n+ 3 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 4 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 5 UTF8.kt\nio/ktor/utils/io/core/internal/UTF8Kt\n+ 6 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 7 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 8 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Buffers.kt\nio/ktor/utils/io/core/BuffersKt\n+ 11 Output.kt\nio/ktor/utils/io/core/OutputKt\n*L\n1#1,482:1\n358#1:640\n358#1:641\n39#2:483\n852#3,8:484\n862#3,3:493\n866#3,11:574\n877#3,15:586\n823#3,6:601\n829#3,13:627\n823#3,6:658\n829#3,13:686\n852#3,8:699\n862#3,3:708\n866#3,11:791\n877#3,15:803\n852#3,8:818\n862#3,3:827\n866#3,11:908\n877#3,15:920\n69#4:492\n59#4:585\n69#4:664\n69#4:685\n69#4:707\n69#4:711\n69#4:790\n59#4:802\n69#4:826\n59#4:919\n123#5,5:496\n128#5,2:506\n130#5,61:510\n193#5:573\n9#5:607\n10#5,2:613\n12#5,7:617\n21#5:626\n9#5:665\n10#5,2:671\n12#5,7:675\n21#5:684\n123#5,5:712\n128#5,2:722\n130#5,61:726\n193#5:789\n123#5,5:830\n128#5,2:840\n130#5,61:844\n193#5:907\n372#6,5:501\n377#6,2:571\n372#6,5:608\n377#6,2:624\n372#6,5:666\n377#6,2:682\n372#6,5:717\n377#6,2:787\n372#6,5:835\n377#6,2:905\n84#7:508\n84#7:615\n84#7:673\n84#7:724\n84#7:842\n26#8:509\n26#8:616\n26#8:674\n26#8:725\n26#8:843\n1#9:642\n98#10,2:643\n507#11,13:645\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n156#1:640\n158#1:641\n30#1:483\n57#1:484,8\n57#1:493,3\n57#1:574,11\n57#1:586,15\n125#1:601,6\n125#1:627,13\n365#1:658,6\n365#1:686,13\n405#1:699,8\n405#1:708,3\n405#1:791,11\n405#1:803,15\n445#1:818,8\n445#1:827,3\n445#1:908,11\n445#1:920,15\n57#1:492\n57#1:585\n366#1:664\n379#1:685\n405#1:707\n406#1:711\n420#1:790\n405#1:802\n445#1:826\n445#1:919\n59#1:496,5\n59#1:506,2\n59#1:510,61\n59#1:573\n126#1:607\n126#1:613,2\n126#1:617,7\n126#1:626\n368#1:665\n368#1:671,2\n368#1:675,7\n368#1:684\n408#1:712,5\n408#1:722,2\n408#1:726,61\n408#1:789\n446#1:830,5\n446#1:840,2\n446#1:844,61\n446#1:907\n59#1:501,5\n59#1:571,2\n126#1:608,5\n126#1:624,2\n368#1:666,5\n368#1:682,2\n408#1:717,5\n408#1:787,2\n446#1:835,5\n446#1:905,2\n59#1:508\n126#1:615\n368#1:673\n408#1:724\n446#1:842\n59#1:509\n126#1:616\n368#1:674\n408#1:725\n446#1:843\n170#1:643,2\n337#1:645,13\n*E\n"})
/* loaded from: classes5.dex */
public final class StringsKt {
    public static final boolean isAsciiChar(char c) {
        return c <= 127;
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return StringsKt__StringsJVMKt.encodeToByteArray(str);
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        return CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull String str, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return StringsKt__StringsJVMKt.encodeToByteArray(str);
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        return CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
    }

    public static /* synthetic */ String readUTF8Line$default(ByteReadPacket byteReadPacket, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 16;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return readUTF8Line(byteReadPacket, i, i2);
    }

    public static /* synthetic */ String readUTF8Line$default(Input input, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 16;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return readUTF8Line(input, i, i2);
    }

    @Nullable
    public static final String readUTF8Line(@NotNull Input input, int i, int i2) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        StringBuilder sb = new StringBuilder(i);
        if (readUTF8LineTo(input, sb, i2)) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ String readUTF8UntilDelimiter$default(Input input, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiter(input, str, i);
    }

    @NotNull
    public static final String readUTF8UntilDelimiter(@NotNull Input input, @NotNull String delimiters, int i) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        StringBuilder sb = new StringBuilder();
        readUTF8UntilDelimiterTo(input, sb, delimiters, i);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ int readUTF8UntilDelimiterTo$default(Input input, Appendable appendable, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiterTo(input, appendable, str, i);
    }

    public static /* synthetic */ int readUTF8UntilDelimiterTo$default(Input input, Output output, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiterTo(input, output, str, i);
    }

    public static final int readUTF8UntilDelimiterTo(@NotNull Input input, @NotNull Output out, @NotNull String delimiters, int i) {
        long untilDelimiters;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        int length = delimiters.length();
        if (length == 1 && delimiters.charAt(0) <= 127) {
            untilDelimiters = ScannerKt.readUntilDelimiter(input, (byte) delimiters.charAt(0), out);
        } else if (length == 2 && delimiters.charAt(0) <= 127 && delimiters.charAt(1) <= 127) {
            untilDelimiters = ScannerKt.readUntilDelimiters(input, (byte) delimiters.charAt(0), (byte) delimiters.charAt(1), out);
        } else {
            return readUTFUntilDelimiterToSlowAscii(input, delimiters, i, out);
        }
        return (int) untilDelimiters;
    }

    public static /* synthetic */ byte[] readBytes$default(ByteReadPacket byteReadPacket, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            long remaining = byteReadPacket.getRemaining();
            if (remaining > ParserMinimalBase.MAX_INT_L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i = (int) remaining;
        }
        return readBytes(byteReadPacket, i);
    }

    @NotNull
    public static final byte[] readBytes(@NotNull ByteReadPacket byteReadPacket, int i) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        if (i != 0) {
            byte[] bArr = new byte[i];
            InputArraysKt.readFully((Input) byteReadPacket, bArr, 0, i);
            return bArr;
        }
        return UnsafeKt.EmptyByteArray;
    }

    @NotNull
    public static final byte[] readBytes(@NotNull Input input, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return readBytesOf(input, i, i);
    }

    @NotNull
    public static final byte[] readBytes(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return readBytesOf$default(input, 0, 0, 3, null);
    }

    public static /* synthetic */ byte[] readBytesOf$default(Input input, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return readBytesOf(input, i, i2);
    }

    @NotNull
    public static final byte[] readBytesOf(@NotNull Input input, int i, int i2) throws EOFException {
        int available;
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (i == i2 && i == 0) {
            return UnsafeKt.EmptyByteArray;
        }
        int i3 = 0;
        if (i == i2) {
            byte[] bArr = new byte[i];
            InputArraysKt.readFully(input, bArr, 0, i);
            return bArr;
        }
        byte[] bArrCopyOf = new byte[(int) RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(i2, EncodingKt.sizeEstimate(input)), i)];
        while (i3 < i2 && (available = InputArraysKt.readAvailable(input, bArrCopyOf, i3, Math.min(i2, bArrCopyOf.length) - i3)) > 0) {
            i3 += available;
            if (bArrCopyOf.length == i3) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3 * 2);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
            }
        }
        if (i3 < i) {
            throw new EOFException("Not enough bytes available to read " + i + " bytes: " + (i - i3) + " more required");
        }
        if (i3 == bArrCopyOf.length) {
            return bArrCopyOf;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i3);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    public static /* synthetic */ int readText$default(Input input, Appendable appendable, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, appendable, charset, i);
    }

    public static final int readText(@NotNull Input input, @NotNull Appendable out, @NotNull Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return CharsetJVMKt.decode(charsetDecoderNewDecoder, input, out, i);
    }

    public static /* synthetic */ String readText$default(Input input, CharsetDecoder charsetDecoder, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, charsetDecoder, i);
    }

    @Deprecated(message = "Use CharsetDecoder.decode instead", replaceWith = @ReplaceWith(expression = "decoder.decode(this, max)", imports = {"io.ktor.utils.io.charsets.decode"}))
    @NotNull
    public static final String readText(@NotNull Input input, @NotNull CharsetDecoder decoder, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return EncodingKt.decode(decoder, input, i);
    }

    public static /* synthetic */ String readText$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, charset, i);
    }

    @NotNull
    public static final String readText(@NotNull Input input, @NotNull Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return EncodingKt.decode(charsetDecoderNewDecoder, input, i);
    }

    @NotNull
    public static final String readText(@NotNull Buffer buffer, @NotNull Charset charset, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        CharsetJVMKt.decodeBuffer(charsetDecoderNewDecoder, buffer, sb, true, i);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String readText$default(Buffer buffer, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(buffer, charset, i);
    }

    public static /* synthetic */ String readTextExact$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExact(input, charset, i);
    }

    @Deprecated(message = "Use readTextExactCharacters instead.", replaceWith = @ReplaceWith(expression = "readTextExactCharacters(n, charset)", imports = {}))
    @NotNull
    public static final String readTextExact(@NotNull Input input, @NotNull Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readTextExactCharacters(input, i, charset);
    }

    public static /* synthetic */ String readTextExactCharacters$default(Input input, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactCharacters(input, i, charset);
    }

    @NotNull
    public static final String readTextExactCharacters(@NotNull Input input, int i, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String text = readText(input, charset, i);
        if (text.length() >= i) {
            return text;
        }
        prematureEndOfStreamToReadChars(i);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactBytes(input, charset, i);
    }

    @Deprecated(message = "Parameters order is changed.", replaceWith = @ReplaceWith(expression = "readTextExactBytes(bytes, charset)", imports = {}))
    @NotNull
    public static final String readTextExactBytes(@NotNull Input input, @NotNull Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readTextExactBytes(input, i, charset);
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactBytes(input, i, charset);
    }

    @NotNull
    public static final String readTextExactBytes(@NotNull Input input, int i, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return CharsetJVMKt.decodeExactBytes(charsetDecoderNewDecoder, input, i);
    }

    public static /* synthetic */ void writeText$default(Output output, CharSequence charSequence, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(output, charSequence, i, i2, charset);
    }

    public static final void writeText(@NotNull Output output, @NotNull CharSequence text, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            writeTextUtf8(output, text, i, i2);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        EncodingKt.encodeToImpl(charsetEncoderNewEncoder, output, text, i, i2);
    }

    public static /* synthetic */ void writeText$default(Output output, char[] cArr, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(output, cArr, i, i2, charset);
    }

    public static final void writeText(@NotNull Output output, @NotNull char[] text, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            writeTextUtf8(output, new CharArraySequence(text, 0, text.length), i, i2);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        EncodingKt.encode(charsetEncoderNewEncoder, text, i, i2, output);
    }

    public static final Void bufferLimitExceeded(int i) throws BufferLimitExceededException {
        throw new BufferLimitExceededException("Too many characters before delimiter: limit " + i + " exceeded");
    }

    @PublishedApi
    @NotNull
    public static final Void prematureEndOfStream(int i) throws EOFException {
        throw new EOFException("Premature end of stream: expected " + i + " bytes");
    }

    @PublishedApi
    @NotNull
    public static final Void prematureEndOfStream(long j) throws EOFException {
        throw new EOFException("Premature end of stream: expected " + j + " bytes");
    }

    public static final Void prematureEndOfStreamToReadChars(int i) throws EOFException {
        throw new EOFException("Not enough input bytes to read " + i + " characters.");
    }

    @Nullable
    public static final String readUTF8Line(@NotNull ByteReadPacket byteReadPacket, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        if (byteReadPacket.getEndOfInput()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(i);
        if (readUTF8LineTo(byteReadPacket, sb, i2)) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x007c, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0169, code lost:
    
        r4.discardExact(((r12 - r9) - r15) + 1);
        r3 = r16;
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x019c, code lost:
    
        if (r3 <= 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x019e, code lost:
    
        r4.discardExact(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01a1, code lost:
    
        if (r10 == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01a3, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01aa, code lost:
    
        r6 = kotlin.ranges.RangesKt___RangesKt.coerceAtLeast(r9, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01ab, code lost:
    
        r11 = r4.getWritePosition() - r4.getReadPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01b7, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x01eb, code lost:
    
        if (r3 == 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x01ed, code lost:
    
        io.ktor.utils.p050io.core.internal.UnsafeKt.completeReadHead(r20, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x01f0, code lost:
    
        r3 = r9;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x020e, code lost:
    
        io.ktor.utils.p050io.core.internal.UnsafeKt.completeReadHead(r20, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0136 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:190:0x002b, B:192:0x003f, B:195:0x0053, B:208:0x0078, B:292:0x019e, B:295:0x01a5, B:289:0x018a, B:206:0x006e, B:213:0x0085, B:214:0x008d, B:215:0x008e, B:216:0x0096, B:221:0x00a0, B:223:0x00a4, B:224:0x00ad, B:226:0x00b3, B:228:0x00c4, B:230:0x00ce, B:232:0x00d4, B:245:0x00f9, B:243:0x00ef, B:246:0x0102, B:247:0x010a, B:248:0x010b, B:250:0x0111, B:264:0x0136, B:276:0x0153, B:281:0x0160, B:282:0x0168, B:283:0x0169, B:262:0x012e, B:284:0x0176, B:285:0x017e, B:286:0x017f, B:287:0x0187, B:290:0x0191), top: B:334:0x002b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0169 A[EDGE_INSN: B:349:0x0169->B:283:0x0169 BREAK  A[LOOP:1: B:191:0x003d->B:289:0x018a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x015b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x018a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean readUTF8LineTo(@NotNull Input input, @NotNull Appendable out, int i) throws Throwable {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        int i4;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        int i5 = 1;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i4 = 1;
            i2 = 0;
        } else {
            int iCoerceAtLeast = 1;
            int i6 = 1;
            boolean z5 = false;
            i2 = 0;
            boolean z6 = false;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= iCoerceAtLeast) {
                        try {
                            ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                            int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                            int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition();
                            int i7 = readPosition;
                            int i8 = 0;
                            int i9 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i7 >= writePosition2) {
                                    chunkBufferPrepareReadFirstHead.discardExact(writePosition2 - readPosition);
                                    i3 = i11;
                                    z6 = z6;
                                    i6 = 0;
                                    break;
                                }
                                byte b = memory.get(i7);
                                int i12 = b & 255;
                                ByteBuffer byteBuffer = memory;
                                boolean z7 = z6;
                                if ((b & 128) != 0) {
                                    if (i8 == 0) {
                                        int i13 = 128;
                                        i9 = i12;
                                        for (int i14 = 1; i14 < 7 && (i9 & i13) != 0; i14++) {
                                            i9 &= ~i13;
                                            i13 >>= 1;
                                            i8++;
                                        }
                                        int i15 = i8 - 1;
                                        if (i8 > writePosition2 - i7) {
                                            chunkBufferPrepareReadFirstHead.discardExact(i7 - readPosition);
                                            i6 = i8;
                                            i3 = i11;
                                            z6 = z7;
                                            break;
                                        }
                                        i10 = i8;
                                        z6 = z7;
                                        i8 = i15;
                                    } else {
                                        i9 = (i9 << 6) | (b & Byte.MAX_VALUE);
                                        i8--;
                                        if (i8 == 0) {
                                            if (UTF8Kt.isBmpCodePoint(i9)) {
                                                char c = (char) i9;
                                                if (c == '\r') {
                                                    if (z5) {
                                                        z3 = false;
                                                        z6 = true;
                                                    } else {
                                                        z6 = z7;
                                                        z3 = true;
                                                        z5 = true;
                                                    }
                                                    if (!z3) {
                                                        chunkBufferPrepareReadFirstHead.discardExact(((i7 - readPosition) - i10) + 1);
                                                        break;
                                                    }
                                                } else {
                                                    if (c == '\n') {
                                                        z3 = false;
                                                        z6 = true;
                                                        i11 = 1;
                                                    } else if (z5) {
                                                        z3 = false;
                                                        z6 = true;
                                                    } else {
                                                        if (i2 == i) {
                                                            bufferLimitExceeded(i);
                                                            throw new KotlinNothingValueException();
                                                        }
                                                        i2++;
                                                        out.append(c);
                                                        z6 = z7;
                                                        z3 = true;
                                                    }
                                                    if (!z3) {
                                                    }
                                                }
                                            } else {
                                                if (!UTF8Kt.isValidCodePoint(i9)) {
                                                    UTF8Kt.malformedCodePoint(i9);
                                                    throw new KotlinNothingValueException();
                                                }
                                                char cHighSurrogate = (char) UTF8Kt.highSurrogate(i9);
                                                if (cHighSurrogate == '\r') {
                                                    if (!z5) {
                                                        z = true;
                                                        z5 = true;
                                                        if (!z) {
                                                            break;
                                                        }
                                                        char cLowSurrogate = (char) UTF8Kt.lowSurrogate(i9);
                                                        if (cLowSurrogate == '\r') {
                                                            if (!z5) {
                                                                z2 = true;
                                                                z5 = true;
                                                                if (!z2) {
                                                                    break;
                                                                }
                                                                z6 = z7;
                                                            }
                                                            z2 = false;
                                                            z7 = true;
                                                            if (!z2) {
                                                            }
                                                        } else if (cLowSurrogate == '\n') {
                                                            z2 = false;
                                                            i11 = 1;
                                                            z7 = true;
                                                            if (!z2) {
                                                            }
                                                        } else if (z5) {
                                                            z2 = false;
                                                            z7 = true;
                                                            if (!z2) {
                                                            }
                                                        } else {
                                                            if (i2 == i) {
                                                                bufferLimitExceeded(i);
                                                                throw new KotlinNothingValueException();
                                                            }
                                                            i2++;
                                                            out.append(cLowSurrogate);
                                                            z2 = true;
                                                            if (!z2) {
                                                            }
                                                        }
                                                    }
                                                    z = false;
                                                    z7 = true;
                                                    if (!z) {
                                                    }
                                                } else if (cHighSurrogate == '\n') {
                                                    z = false;
                                                    i11 = 1;
                                                    z7 = true;
                                                    if (!z) {
                                                    }
                                                } else if (z5) {
                                                    z = false;
                                                    z7 = true;
                                                    if (!z) {
                                                    }
                                                } else {
                                                    if (i2 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i2++;
                                                    out.append(cHighSurrogate);
                                                    z = true;
                                                    if (!z) {
                                                    }
                                                }
                                            }
                                            i9 = 0;
                                        } else {
                                            z6 = z7;
                                        }
                                    }
                                    i7++;
                                    memory = byteBuffer;
                                } else {
                                    if (i8 != 0) {
                                        UTF8Kt.malformedByteCount(i8);
                                        throw new KotlinNothingValueException();
                                    }
                                    char c2 = (char) i12;
                                    if (c2 == '\r') {
                                        if (z5) {
                                            z4 = false;
                                            z6 = true;
                                        } else {
                                            z6 = z7;
                                            z4 = true;
                                            z5 = true;
                                        }
                                        if (z4) {
                                            chunkBufferPrepareReadFirstHead.discardExact(i7 - readPosition);
                                            break;
                                        }
                                        i7++;
                                        memory = byteBuffer;
                                    } else {
                                        if (c2 == '\n') {
                                            z4 = false;
                                            z6 = true;
                                            i11 = 1;
                                        } else if (z5) {
                                            z4 = false;
                                            z6 = true;
                                        } else {
                                            if (i2 == i) {
                                                bufferLimitExceeded(i);
                                                throw new KotlinNothingValueException();
                                            }
                                            i2++;
                                            out.append(c2);
                                            z6 = z7;
                                            z4 = true;
                                        }
                                        if (z4) {
                                        }
                                    }
                                }
                                i6 = -1;
                            }
                        } finally {
                            chunkBufferPrepareReadFirstHead.getWritePosition();
                            chunkBufferPrepareReadFirstHead.getReadPosition();
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            i5 = 0;
                            if (i5 != 0) {
                            }
                            throw th;
                        }
                    } else if (writePosition < iCoerceAtLeast || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, iCoerceAtLeast);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        i5 = 0;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    i5 = 1;
                    if (iCoerceAtLeast <= 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (i5 > i4) {
            prematureEndOfStream(i5);
            throw new KotlinNothingValueException();
        }
        if (i2 > 0 || !input.getEndOfInput()) {
            return i4;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0052, code lost:
    
        bufferLimitExceeded(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readUTF8UntilDelimiterTo(@NotNull Input input, @NotNull Appendable out, @NotNull String delimiters, int i) throws Throwable {
        int i2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        boolean z3 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        boolean z4 = false;
        if (chunkBufferPrepareReadFirstHead == null) {
            i2 = 0;
        } else {
            i2 = 0;
            boolean z5 = false;
            loop0: while (true) {
                try {
                    ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                    int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition();
                    for (int i3 = readPosition; i3 < writePosition; i3++) {
                        byte b = memory.get(i3);
                        int i4 = b & 255;
                        if ((b & 128) != 128) {
                            char c = (char) i4;
                            if (!StringsKt__StringsKt.contains$default((CharSequence) delimiters, c, false, 2, (Object) null)) {
                                if (i2 == i) {
                                    break loop0;
                                }
                                i2++;
                                out.append(c);
                                z2 = true;
                            } else {
                                z5 = true;
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                        chunkBufferPrepareReadFirstHead.discardExact(i3 - readPosition);
                        z = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead.discardExact(writePosition - readPosition);
                    z = true;
                    if (z) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z3 = false;
                            if (z3) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            z4 = z5;
        }
        return !z4 ? readUTF8UntilDelimiterToSlowUtf8(input, out, delimiters, i, i2) : i2;
    }

    public static final void writeTextUtf8(Output output, CharSequence charSequence, int i, int i2) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iM15685encodeUTF8lBXzO7A = UTF8Kt.m15685encodeUTF8lBXzO7A(chunkBufferPrepareWriteHead.getMemory(), charSequence, i, i2, chunkBufferPrepareWriteHead.getWritePosition(), chunkBufferPrepareWriteHead.getLimit());
                short sM15674component1Mh2AYeg = EncodeResult.m15674component1Mh2AYeg(iM15685encodeUTF8lBXzO7A);
                short sM15675component2Mh2AYeg = EncodeResult.m15675component2Mh2AYeg(iM15685encodeUTF8lBXzO7A);
                int i3 = sM15674component1Mh2AYeg & UShort.MAX_VALUE;
                i += i3;
                chunkBufferPrepareWriteHead.commitWritten(sM15675component2Mh2AYeg & UShort.MAX_VALUE);
                int i4 = (i3 != 0 || i >= i2) ? i < i2 ? 1 : 0 : 8;
                if (i4 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i4, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0050, code lost:
    
        bufferLimitExceeded(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0058, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readUTFUntilDelimiterToSlowAscii(Input input, String str, int i, Output output) throws Throwable {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        boolean z4 = false;
        if (chunkBufferPrepareReadFirstHead == null) {
            i2 = 0;
        } else {
            i2 = 0;
            boolean z5 = false;
            loop0: while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                    int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                    int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition();
                    for (int i3 = readPosition; i3 < writePosition2; i3++) {
                        byte b = memory.get(i3);
                        int i4 = b & 255;
                        if ((b & 128) != 128) {
                            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (char) i4, false, 2, (Object) null)) {
                                if (i2 == i) {
                                    break loop0;
                                }
                                i2++;
                                z3 = true;
                            } else {
                                z3 = false;
                                z5 = true;
                            }
                            if (z3) {
                            }
                        }
                        chunkBufferPrepareReadFirstHead.discardExact(i3 - readPosition);
                        z2 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead.discardExact(writePosition2 - readPosition);
                    z2 = true;
                    int writePosition3 = writePosition - (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    if (writePosition3 > 0) {
                        chunkBufferPrepareReadFirstHead.rewind(writePosition3);
                        OutputKt.writeFully(output, chunkBufferPrepareReadFirstHead, writePosition3);
                    }
                    if (z2) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
            z4 = z5;
        }
        return (z4 || input.getEndOfInput()) ? i2 : readUTF8UntilDelimiterToSlowUtf8(input, output, str, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0062, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readUTF8UntilDelimiterToSlowUtf8(Input input, Output output, String str, int i, int i2) throws Throwable {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        int i5;
        int i6 = 1;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i3 = i2;
            i5 = 1;
        } else {
            int iCoerceAtLeast = 1;
            int i7 = 1;
            ChunkBuffer chunkBuffer = chunkBufferPrepareReadFirstHead;
            i3 = i2;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= iCoerceAtLeast) {
                        try {
                            int writePosition2 = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                            ByteBuffer memory = chunkBuffer.getMemory();
                            int readPosition = chunkBuffer.getReadPosition();
                            int writePosition3 = chunkBuffer.getWritePosition();
                            int i8 = readPosition;
                            int i9 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i8 >= writePosition3) {
                                    i4 = 0;
                                    chunkBuffer.discardExact(writePosition3 - readPosition);
                                    i9 = 0;
                                    break;
                                }
                                byte b = memory.get(i8);
                                int i12 = b & 255;
                                ByteBuffer byteBuffer = memory;
                                if ((b & 128) != 0) {
                                    if (i9 == 0) {
                                        int i13 = 128;
                                        i10 = i12;
                                        for (int i14 = 1; i14 < 7 && (i10 & i13) != 0; i14++) {
                                            i10 &= ~i13;
                                            i13 >>= 1;
                                            i9++;
                                        }
                                        int i15 = i9 - 1;
                                        if (i9 > writePosition3 - i8) {
                                            chunkBuffer.discardExact(i8 - readPosition);
                                            i4 = 0;
                                            break;
                                        }
                                        i11 = i9;
                                        i9 = i15;
                                    } else {
                                        i10 = (i10 << 6) | (b & Byte.MAX_VALUE);
                                        i9--;
                                        if (i9 == 0) {
                                            if (!UTF8Kt.isBmpCodePoint(i10)) {
                                                if (!UTF8Kt.isValidCodePoint(i10)) {
                                                    UTF8Kt.malformedCodePoint(i10);
                                                    throw new KotlinNothingValueException();
                                                }
                                                if (StringsKt__StringsKt.contains$default((CharSequence) str, (char) UTF8Kt.highSurrogate(i10), false, 2, (Object) null)) {
                                                    z = false;
                                                } else {
                                                    if (i3 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i3++;
                                                    z = true;
                                                }
                                                if (!z) {
                                                    i4 = 0;
                                                    break;
                                                }
                                                i4 = 0;
                                                if (StringsKt__StringsKt.contains$default((CharSequence) str, (char) UTF8Kt.lowSurrogate(i10), false, 2, (Object) null)) {
                                                    z2 = false;
                                                } else {
                                                    if (i3 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i3++;
                                                    z2 = true;
                                                }
                                                if (!z2) {
                                                    break;
                                                }
                                            } else {
                                                if (StringsKt__StringsKt.contains$default((CharSequence) str, (char) i10, false, 2, (Object) null)) {
                                                    z3 = false;
                                                } else {
                                                    if (i3 == i) {
                                                        bufferLimitExceeded(i);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    i3++;
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                    chunkBuffer.discardExact(((i8 - readPosition) - i11) + 1);
                                                    break;
                                                }
                                                i4 = 0;
                                            }
                                            i10 = i4;
                                        }
                                    }
                                    i8++;
                                    memory = byteBuffer;
                                } else {
                                    if (i9 != 0) {
                                        UTF8Kt.malformedByteCount(i9);
                                        throw new KotlinNothingValueException();
                                    }
                                    if (StringsKt__StringsKt.contains$default((CharSequence) str, (char) i12, false, 2, (Object) null)) {
                                        z4 = false;
                                    } else {
                                        if (i3 == i) {
                                            bufferLimitExceeded(i);
                                            throw new KotlinNothingValueException();
                                        }
                                        i3++;
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        chunkBuffer.discardExact(i8 - readPosition);
                                        break;
                                    }
                                    i8++;
                                    memory = byteBuffer;
                                }
                            }
                            chunkBuffer.discardExact(((i8 - readPosition) - i11) + 1);
                            i9 = -1;
                            int writePosition4 = writePosition2 - (chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
                            if (writePosition4 > 0) {
                                chunkBuffer.rewind(writePosition4);
                                OutputKt.writeFully(output, chunkBuffer, writePosition4);
                            }
                            iCoerceAtLeast = i9 == -1 ? i4 : RangesKt___RangesKt.coerceAtLeast(i9, 1);
                            try {
                                writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                                i7 = iCoerceAtLeast;
                            } catch (Throwable th) {
                                th = th;
                                i6 = 1;
                                if (i6 != 0) {
                                    UnsafeKt.completeReadHead(input, chunkBuffer);
                                }
                                throw th;
                            }
                        } finally {
                            chunkBuffer.getWritePosition();
                            chunkBuffer.getReadPosition();
                        }
                    } else {
                        i4 = 0;
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBuffer);
                        } catch (Throwable th2) {
                            th = th2;
                            i6 = i4;
                            if (i6 != 0) {
                            }
                            throw th;
                        }
                    } else if (writePosition < iCoerceAtLeast || chunkBuffer.getCapacity() - chunkBuffer.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBuffer);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, iCoerceAtLeast);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBuffer;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    chunkBuffer = chunkBufferPrepareReadNextHead;
                    if (iCoerceAtLeast <= 0) {
                        i4 = 1;
                        break;
                    }
                    i6 = 1;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (i4 != 0) {
                UnsafeKt.completeReadHead(input, chunkBuffer);
            }
            i6 = i7;
            i5 = 1;
        }
        if (i6 <= i5) {
            return i3;
        }
        prematureEndOfStream(i6);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x005e, code lost:
    
        r4 = -1;
        r10 = 0;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int readUTF8UntilDelimiterToSlowUtf8(Input input, Appendable appendable, String str, int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        int i6;
        int i7 = 1;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i3 = i2;
            i6 = 1;
        } else {
            int iCoerceAtLeast = 1;
            int i8 = 1;
            ChunkBuffer chunkBuffer = chunkBufferPrepareReadFirstHead;
            i3 = i2;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= iCoerceAtLeast) {
                        try {
                            try {
                                ByteBuffer memory = chunkBuffer.getMemory();
                                int readPosition = chunkBuffer.getReadPosition();
                                int writePosition2 = chunkBuffer.getWritePosition();
                                int i9 = readPosition;
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    if (i9 >= writePosition2) {
                                        i4 = 0;
                                        chunkBuffer.discardExact(writePosition2 - readPosition);
                                        i10 = 0;
                                        i5 = -1;
                                        break;
                                    }
                                    byte b = memory.get(i9);
                                    int i13 = b & 255;
                                    ByteBuffer byteBuffer = memory;
                                    if ((b & 128) != 0) {
                                        if (i10 == 0) {
                                            int i14 = 128;
                                            i11 = i13;
                                            for (int i15 = 1; i15 < 7 && (i11 & i14) != 0; i15++) {
                                                i11 &= ~i14;
                                                i14 >>= 1;
                                                i10++;
                                            }
                                            int i16 = i10 - 1;
                                            if (i10 > writePosition2 - i9) {
                                                chunkBuffer.discardExact(i9 - readPosition);
                                                i5 = -1;
                                                i4 = 0;
                                                break;
                                            }
                                            i12 = i10;
                                            i10 = i16;
                                        } else {
                                            i11 = (i11 << 6) | (b & Byte.MAX_VALUE);
                                            i10--;
                                            if (i10 == 0) {
                                                if (!UTF8Kt.isBmpCodePoint(i11)) {
                                                    if (!UTF8Kt.isValidCodePoint(i11)) {
                                                        UTF8Kt.malformedCodePoint(i11);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    char cHighSurrogate = (char) UTF8Kt.highSurrogate(i11);
                                                    if (StringsKt__StringsKt.contains$default((CharSequence) str, cHighSurrogate, false, 2, (Object) null)) {
                                                        z = false;
                                                    } else {
                                                        if (i3 == i) {
                                                            bufferLimitExceeded(i);
                                                            throw new KotlinNothingValueException();
                                                        }
                                                        i3++;
                                                        appendable.append(cHighSurrogate);
                                                        z = true;
                                                    }
                                                    if (!z) {
                                                        i4 = 0;
                                                        break;
                                                    }
                                                    char cLowSurrogate = (char) UTF8Kt.lowSurrogate(i11);
                                                    i4 = 0;
                                                    if (StringsKt__StringsKt.contains$default((CharSequence) str, cLowSurrogate, false, 2, (Object) null)) {
                                                        z2 = false;
                                                    } else {
                                                        if (i3 == i) {
                                                            bufferLimitExceeded(i);
                                                            throw new KotlinNothingValueException();
                                                        }
                                                        i3++;
                                                        appendable.append(cLowSurrogate);
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                        break;
                                                    }
                                                } else {
                                                    char c = (char) i11;
                                                    if (StringsKt__StringsKt.contains$default((CharSequence) str, c, false, 2, (Object) null)) {
                                                        z3 = false;
                                                    } else {
                                                        if (i3 == i) {
                                                            bufferLimitExceeded(i);
                                                            throw new KotlinNothingValueException();
                                                        }
                                                        i3++;
                                                        appendable.append(c);
                                                        z3 = true;
                                                    }
                                                    if (!z3) {
                                                        chunkBuffer.discardExact(((i9 - readPosition) - i12) + 1);
                                                        break;
                                                    }
                                                    i4 = 0;
                                                }
                                                i11 = i4;
                                            }
                                        }
                                        i9++;
                                        memory = byteBuffer;
                                    } else {
                                        if (i10 != 0) {
                                            UTF8Kt.malformedByteCount(i10);
                                            throw new KotlinNothingValueException();
                                        }
                                        char c2 = (char) i13;
                                        if (StringsKt__StringsKt.contains$default((CharSequence) str, c2, false, 2, (Object) null)) {
                                            z4 = false;
                                        } else {
                                            if (i3 == i) {
                                                bufferLimitExceeded(i);
                                                throw new KotlinNothingValueException();
                                            }
                                            i3++;
                                            appendable.append(c2);
                                            z4 = true;
                                        }
                                        if (!z4) {
                                            chunkBuffer.discardExact(i9 - readPosition);
                                            break;
                                        }
                                        i9++;
                                        memory = byteBuffer;
                                    }
                                }
                                chunkBuffer.discardExact(((i9 - readPosition) - i12) + 1);
                                i5 = -1;
                                i10 = -1;
                                iCoerceAtLeast = i10 == i5 ? i4 : RangesKt___RangesKt.coerceAtLeast(i10, 1);
                                writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                                i8 = iCoerceAtLeast;
                            } catch (Throwable th) {
                                chunkBuffer.getWritePosition();
                                chunkBuffer.getReadPosition();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i7 = 1;
                            if (i7 != 0) {
                                UnsafeKt.completeReadHead(input, chunkBuffer);
                            }
                            throw th;
                        }
                    } else {
                        i4 = 0;
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBuffer);
                        } catch (Throwable th3) {
                            th = th3;
                            i7 = i4;
                            if (i7 != 0) {
                            }
                            throw th;
                        }
                    } else if (writePosition < iCoerceAtLeast || chunkBuffer.getCapacity() - chunkBuffer.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBuffer);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, iCoerceAtLeast);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBuffer;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    chunkBuffer = chunkBufferPrepareReadNextHead;
                    if (iCoerceAtLeast <= 0) {
                        i4 = 1;
                        break;
                    }
                    i7 = 1;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (i4 != 0) {
                UnsafeKt.completeReadHead(input, chunkBuffer);
            }
            i7 = i8;
            i6 = 1;
        }
        if (i7 <= i6) {
            return i3;
        }
        prematureEndOfStream(i7);
        throw new KotlinNothingValueException();
    }
}
