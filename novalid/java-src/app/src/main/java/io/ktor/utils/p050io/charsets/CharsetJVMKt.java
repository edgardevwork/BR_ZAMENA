package io.ktor.utils.p050io.charsets;

import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.BufferPrimitivesKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.StringsKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UTF8Kt;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import io.ktor.utils.p050io.internal.jvm.ErrorsKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: CharsetJVM.kt */
@Metadata(m7104d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0015\u001a\u00020\u0001*\u00060\nj\u0002`\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u0001\u001a6\u0010\u001c\u001a\u00020\u0001*\u00060\nj\u0002`\u000b2\u0006\u0010\u0016\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0000\u001a\u001e\u0010!\u001a\u00020\u0012*\u00060\nj\u0002`\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0001\u001a \u0010#\u001a\u00020\u0012*\u00060\nj\u0002`\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0001H\u0002\u001a \u0010$\u001a\u00020\u0012*\u00060\nj\u0002`\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0001H\u0002\u001a\u0018\u0010%\u001a\u00020 *\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0018\u001a\u00020\u001dH\u0000\u001a0\u0010&\u001a\u00020\u0001*\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0016\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u001dH\u0000\u001a*\u0010*\u001a\u00020+*\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0016\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u0001\u001a,\u0010,\u001a\u00020+*\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0016\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u0001H\u0000\u001a(\u0010-\u001a\u00020+*\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0016\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002\u001a\u001e\u0010.\u001a\u00020/*\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0016\u001a\u0002002\u0006\u0010\u0018\u001a\u000201\u001a\f\u00102\u001a\u00020/*\u000203H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\u0007\u001a\u00060\bj\u0002`\t*\u00060\nj\u0002`\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0007\u001a\u00060\bj\u0002`\t*\u00060\u000ej\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010\"\u0019\u0010\u0011\u001a\u00020\u0012*\u00060\bj\u0002`\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014*\n\u00104\"\u00020\b2\u00020\b*\n\u00105\"\u00020\n2\u00020\n*\n\u00106\"\u00020\u000e2\u00020\u000e*\n\u00107\"\u0002082\u000208¨\u00069"}, m7105d2 = {"DECODE_CHAR_BUFFER_SIZE", "", "EmptyByteBuffer", "Ljava/nio/ByteBuffer;", "EmptyCharBuffer", "Ljava/nio/CharBuffer;", "kotlin.jvm.PlatformType", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "getCharset", "(Ljava/nio/charset/CharsetDecoder;)Ljava/nio/charset/Charset;", "Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "(Ljava/nio/charset/CharsetEncoder;)Ljava/nio/charset/Charset;", "name", "", "getName", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "decode", "input", "Lio/ktor/utils/io/core/Input;", "dst", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "max", "decodeBuffer", "Lio/ktor/utils/io/core/Buffer;", "out", "lastBuffer", "", "decodeExactBytes", "inputLength", "decodeImplByteBuffer", "decodeImplSlow", "encodeComplete", "encodeImpl", "", "fromIndex", "toIndex", "encodeToByteArray", "", "encodeToByteArrayImpl1", "encodeToByteArraySlow", "encodeUTF8", "", "Lio/ktor/utils/io/core/ByteReadPacket;", "Lio/ktor/utils/io/core/Output;", "throwExceptionWrapped", "Ljava/nio/charset/CoderResult;", "Charset", "CharsetDecoder", "CharsetEncoder", "Charsets", "Lkotlin/text/Charsets;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCharsetJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharsetJVM.kt\nio/ktor/utils/io/charsets/CharsetJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n+ 4 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 6 UTF8.kt\nio/ktor/utils/io/core/internal/UTF8Kt\n+ 7 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 8 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 9 Output.kt\nio/ktor/utils/io/core/OutputKt\n+ 10 BufferPrimitives.kt\nio/ktor/utils/io/core/BufferPrimitivesKt\n+ 11 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 12 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 13 Input.kt\nio/ktor/utils/io/core/Input\n+ 14 StringsJVM.kt\nio/ktor/utils/io/core/StringsJVMKt\n*L\n1#1,389:1\n1#2:390\n1#2:404\n1#2:411\n1#2:517\n1#2:548\n1#2:578\n1#2:595\n1#2:643\n1#2:701\n111#3,5:391\n116#3,3:401\n120#3:405\n44#3:408\n45#3:410\n46#3,7:412\n111#3,5:504\n116#3,3:514\n120#3:518\n111#3,5:535\n116#3,3:545\n120#3:549\n54#3,6:559\n111#3,5:565\n116#3,3:575\n120#3:579\n95#3,5:582\n100#3,3:592\n104#3:596\n95#3,5:630\n100#3,3:640\n104#3:644\n95#3,5:688\n100#3,3:698\n104#3:702\n390#4,5:396\n395#4,2:406\n372#4,5:424\n377#4,2:494\n390#4,5:509\n395#4,2:519\n390#4,5:540\n395#4,2:550\n390#4,5:570\n395#4,2:580\n372#4,5:587\n377#4,2:597\n372#4,5:635\n377#4,2:645\n372#4,5:693\n377#4,2:703\n74#5:409\n69#5:599\n69#5:626\n59#5:658\n69#5:684\n59#5:716\n123#6,5:419\n128#6,2:429\n130#6,61:433\n193#6:496\n84#7:431\n26#8:432\n506#9,7:497\n513#9,7:521\n506#9,7:528\n513#9,7:552\n256#10,7:600\n12#11,11:607\n852#12,8:618\n862#12,3:627\n866#12,11:647\n877#12,15:659\n852#12,8:676\n862#12,3:685\n866#12,11:705\n877#12,15:717\n77#13:674\n11#14:675\n*S KotlinDebug\n*F\n+ 1 CharsetJVM.kt\nio/ktor/utils/io/charsets/CharsetJVMKt\n*L\n52#1:404\n71#1:411\n99#1:517\n121#1:548\n141#1:578\n160#1:595\n231#1:643\n323#1:701\n52#1:391,5\n52#1:401,3\n52#1:405\n71#1:408\n71#1:410\n71#1:412,7\n99#1:504,5\n99#1:514,3\n99#1:518\n121#1:535,5\n121#1:545,3\n121#1:549\n71#1:559,6\n141#1:565,5\n141#1:575,3\n141#1:579\n160#1:582,5\n160#1:592,3\n160#1:596\n231#1:630,5\n231#1:640,3\n231#1:644\n323#1:688,5\n323#1:698,3\n323#1:702\n52#1:396,5\n52#1:406,2\n83#1:424,5\n83#1:494,2\n99#1:509,5\n99#1:519,2\n121#1:540,5\n121#1:550,2\n141#1:570,5\n141#1:580,2\n160#1:587,5\n160#1:597,2\n231#1:635,5\n231#1:645,2\n323#1:693,5\n323#1:703,2\n71#1:409\n199#1:599\n227#1:626\n227#1:658\n320#1:684\n320#1:716\n83#1:419,5\n83#1:429,2\n83#1:433,61\n83#1:496\n83#1:431\n83#1:432\n98#1:497,7\n98#1:521,7\n120#1:528,7\n120#1:552,7\n200#1:600,7\n204#1:607,11\n227#1:618,8\n227#1:627,3\n227#1:647,11\n227#1:659,15\n320#1:676,8\n320#1:685,3\n320#1:705,11\n320#1:717,15\n274#1:674\n282#1:675\n*E\n"})
/* loaded from: classes8.dex */
public final class CharsetJVMKt {
    public static final int DECODE_CHAR_BUFFER_SIZE = 8192;

    @NotNull
    public static final ByteBuffer EmptyByteBuffer;
    public static final CharBuffer EmptyCharBuffer = CharBuffer.allocate(0);

    public static /* synthetic */ void Charset$annotations() {
    }

    @NotNull
    public static final String getName(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name()");
        return strName;
    }

    @NotNull
    public static final Charset getCharset(@NotNull CharsetEncoder charsetEncoder) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Charset charset = charsetEncoder.charset();
        Intrinsics.checkNotNullExpressionValue(charset, "charset()");
        return charset;
    }

    @NotNull
    public static final byte[] encodeToByteArray(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof String) {
            if (i == 0 && i2 == input.length()) {
                byte[] bytes = ((String) input).getBytes(charsetEncoder.charset());
                Intrinsics.checkNotNullExpressionValue(bytes, "input as java.lang.String).getBytes(charset())");
                return bytes;
            }
            String strSubstring = ((String) input).substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
            return bytes2;
        }
        return encodeToByteArraySlow(charsetEncoder, input, i, i2);
    }

    public static final byte[] encodeToByteArraySlow(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return encodeToByteArray(charsetEncoder, charSequence, i, i2);
    }

    public static final int encodeImpl(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i, int i2, @NotNull Buffer dst) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i, i2);
        int iRemaining = charBufferWrap.remaining();
        ByteBuffer memory = dst.getMemory();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
        CoderResult result = charsetEncoder.encode(charBufferWrap, byteBufferM15433slice87lwejk, false);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            throwExceptionWrapped(result);
        }
        if (byteBufferM15433slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        dst.commitWritten(byteBufferM15433slice87lwejk.position());
        return iRemaining - charBufferWrap.remaining();
    }

    /* JADX WARN: Finally extract failed */
    public static final void encodeUTF8(@NotNull CharsetEncoder charsetEncoder, @NotNull ByteReadPacket input, @NotNull Output dst) throws Throwable {
        ChunkBuffer chunkBuffer;
        int i;
        int i2;
        int i3;
        char cLowSurrogate;
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (getCharset(charsetEncoder) == Charsets.UTF_8) {
            dst.writePacket(input);
            return;
        }
        ChunkBuffer chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
        try {
            int limit = chunkBufferBorrow.getLimit() - chunkBufferBorrow.getWritePosition();
            if (limit < 0) {
                throw new IllegalArgumentException(("size 0 is greater than buffer's remaining capacity " + limit).toString());
            }
            ByteBuffer byteBufferDuplicate = chunkBufferBorrow.getMemory().duplicate();
            Intrinsics.checkNotNull(byteBufferDuplicate);
            int writePosition = chunkBufferBorrow.getWritePosition();
            byteBufferDuplicate.limit(chunkBufferBorrow.getLimit());
            byteBufferDuplicate.position(writePosition);
            CharBuffer charBufferAsCharBuffer = byteBufferDuplicate.asCharBuffer();
            while (input.getRemaining() > 0) {
                try {
                    charBufferAsCharBuffer.clear();
                    ChunkBuffer chunkBufferPrepareReadHead$ktor_io = input.prepareReadHead$ktor_io(1);
                    if (chunkBufferPrepareReadHead$ktor_io == null) {
                        break;
                    }
                    ByteBuffer memory = chunkBufferPrepareReadHead$ktor_io.getMemory();
                    int readPosition = chunkBufferPrepareReadHead$ktor_io.getReadPosition();
                    int writePosition2 = chunkBufferPrepareReadHead$ktor_io.getWritePosition();
                    int i4 = readPosition;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i4 >= writePosition2) {
                            chunkBuffer = chunkBufferBorrow;
                            i = limit;
                            i2 = writePosition;
                            chunkBufferPrepareReadHead$ktor_io.discardExact(writePosition2 - readPosition);
                            i3 = 0;
                            break;
                        }
                        byte b = memory.get(i4);
                        ByteBuffer byteBuffer = memory;
                        int i8 = b & 255;
                        chunkBuffer = chunkBufferBorrow;
                        i3 = -1;
                        if ((b & 128) == 0) {
                            if (i5 != 0) {
                                UTF8Kt.malformedByteCount(i5);
                                throw new KotlinNothingValueException();
                            }
                            char c = (char) i8;
                            try {
                                if (!charBufferAsCharBuffer.hasRemaining()) {
                                    chunkBufferPrepareReadHead$ktor_io.discardExact(i4 - readPosition);
                                    i = limit;
                                    i2 = writePosition;
                                    break;
                                }
                                charBufferAsCharBuffer.put(c);
                                i = limit;
                                i2 = writePosition;
                                i4++;
                                memory = byteBuffer;
                                chunkBufferBorrow = chunkBuffer;
                                limit = i;
                                writePosition = i2;
                            } catch (Throwable th) {
                                th = th;
                                chunkBufferBorrow = chunkBuffer;
                                chunkBufferBorrow.release(ChunkBuffer.INSTANCE.getPool());
                                throw th;
                            }
                        } else if (i5 == 0) {
                            int i9 = 128;
                            i = limit;
                            i2 = writePosition;
                            int i10 = i5;
                            for (int i11 = 1; i11 < 7 && (i8 & i9) != 0; i11++) {
                                i8 &= ~i9;
                                i9 >>= 1;
                                i10++;
                            }
                            int i12 = i10 - 1;
                            if (i10 > writePosition2 - i4) {
                                chunkBufferPrepareReadHead$ktor_io.discardExact(i4 - readPosition);
                                i3 = i10;
                                break;
                            }
                            i5 = i12;
                            i7 = i10;
                            i6 = i8;
                            i4++;
                            memory = byteBuffer;
                            chunkBufferBorrow = chunkBuffer;
                            limit = i;
                            writePosition = i2;
                        } else {
                            i = limit;
                            i2 = writePosition;
                            int i13 = (i6 << 6) | (b & Byte.MAX_VALUE);
                            i5--;
                            if (i5 != 0) {
                                i6 = i13;
                            } else if (UTF8Kt.isBmpCodePoint(i13)) {
                                cLowSurrogate = (char) i13;
                                if (!charBufferAsCharBuffer.hasRemaining()) {
                                    chunkBufferPrepareReadHead$ktor_io.discardExact(((i4 - readPosition) - i7) + 1);
                                    break;
                                }
                                charBufferAsCharBuffer.put(cLowSurrogate);
                                i6 = 0;
                            } else {
                                if (!UTF8Kt.isValidCodePoint(i13)) {
                                    UTF8Kt.malformedCodePoint(i13);
                                    throw new KotlinNothingValueException();
                                }
                                char cHighSurrogate = (char) UTF8Kt.highSurrogate(i13);
                                if (!charBufferAsCharBuffer.hasRemaining()) {
                                    break;
                                }
                                charBufferAsCharBuffer.put(cHighSurrogate);
                                cLowSurrogate = (char) UTF8Kt.lowSurrogate(i13);
                                if (!charBufferAsCharBuffer.hasRemaining()) {
                                    break;
                                }
                                charBufferAsCharBuffer.put(cLowSurrogate);
                                i6 = 0;
                            }
                            i4++;
                            memory = byteBuffer;
                            chunkBufferBorrow = chunkBuffer;
                            limit = i;
                            writePosition = i2;
                        }
                    }
                    chunkBufferPrepareReadHead$ktor_io.discardExact(((i4 - readPosition) - i7) + 1);
                    input.setHeadPosition(chunkBufferPrepareReadHead$ktor_io.getReadPosition());
                    charBufferAsCharBuffer.flip();
                    if (charBufferAsCharBuffer.hasRemaining()) {
                        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, null);
                        int i14 = 1;
                        while (true) {
                            try {
                                ByteBuffer memory2 = chunkBufferPrepareWriteHead.getMemory();
                                int writePosition3 = chunkBufferPrepareWriteHead.getWritePosition();
                                int limit2 = chunkBufferPrepareWriteHead.getLimit() - writePosition3;
                                ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory2, writePosition3, limit2);
                                CoderResult cr = charsetEncoder.encode(charBufferAsCharBuffer, byteBufferM15433slice87lwejk, false);
                                if (cr.isUnmappable() || cr.isMalformed()) {
                                    Intrinsics.checkNotNullExpressionValue(cr, "cr");
                                    throwExceptionWrapped(cr);
                                }
                                i14 = (cr.isOverflow() && byteBufferM15433slice87lwejk.hasRemaining()) ? i14 + 1 : 1;
                                if (byteBufferM15433slice87lwejk.limit() != limit2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                                }
                                chunkBufferPrepareWriteHead.commitWritten(byteBufferM15433slice87lwejk.position());
                                int i15 = charBufferAsCharBuffer.hasRemaining() ? i14 : 0;
                                if (i15 <= 0) {
                                    dst.afterHeadWrite();
                                    break;
                                }
                                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, i15, chunkBufferPrepareWriteHead);
                            } catch (Throwable th2) {
                                dst.afterHeadWrite();
                                throw th2;
                            }
                        }
                    }
                    if (i3 > 0) {
                        break;
                    }
                    chunkBufferBorrow = chunkBuffer;
                    limit = i;
                    writePosition = i2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            chunkBuffer = chunkBufferBorrow;
            i = limit;
            i2 = writePosition;
            charBufferAsCharBuffer.clear();
            charBufferAsCharBuffer.flip();
            ChunkBuffer chunkBufferPrepareWriteHead2 = UnsafeKt.prepareWriteHead(dst, 1, null);
            int i16 = 1;
            while (true) {
                try {
                    ByteBuffer memory3 = chunkBufferPrepareWriteHead2.getMemory();
                    int writePosition4 = chunkBufferPrepareWriteHead2.getWritePosition();
                    int limit3 = chunkBufferPrepareWriteHead2.getLimit() - writePosition4;
                    ByteBuffer byteBufferM15433slice87lwejk2 = Memory.m15433slice87lwejk(memory3, writePosition4, limit3);
                    CoderResult cr2 = charsetEncoder.encode(charBufferAsCharBuffer, byteBufferM15433slice87lwejk2, true);
                    if (cr2.isMalformed() || cr2.isUnmappable()) {
                        Intrinsics.checkNotNullExpressionValue(cr2, "cr");
                        throwExceptionWrapped(cr2);
                    }
                    i16 = cr2.isOverflow() ? i16 + 1 : 0;
                    if (byteBufferM15433slice87lwejk2.limit() != limit3) {
                        try {
                            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                        } catch (Throwable th4) {
                            th = th4;
                            dst.afterHeadWrite();
                            throw th;
                        }
                    }
                    chunkBufferPrepareWriteHead2.commitWritten(byteBufferM15433slice87lwejk2.position());
                    if (i16 <= 0) {
                        dst.afterHeadWrite();
                        int iPosition = byteBufferDuplicate.position() - i2;
                        if (iPosition < 0 || iPosition > i) {
                            ErrorsKt.wrongBufferPositionChangeError(iPosition, 0);
                            throw new KotlinNothingValueException();
                        }
                        ChunkBuffer chunkBuffer2 = chunkBuffer;
                        chunkBuffer2.commitWritten(iPosition);
                        chunkBuffer2.release(ChunkBuffer.INSTANCE.getPool());
                        return;
                    }
                    chunkBufferPrepareWriteHead2 = UnsafeKt.prepareWriteHead(dst, i16, chunkBufferPrepareWriteHead2);
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static /* synthetic */ byte[] encodeToByteArrayImpl1$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return encodeToByteArrayImpl1(charsetEncoder, charSequence, i, i2);
    }

    public static /* synthetic */ int decodeBuffer$default(CharsetDecoder charsetDecoder, Buffer buffer, Appendable appendable, boolean z, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        return decodeBuffer(charsetDecoder, buffer, appendable, z, i);
    }

    @NotNull
    public static final byte[] encodeToByteArrayImpl1(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i >= i2) {
            return UnsafeKt.EmptyByteArray;
        }
        ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
        ChunkBuffer chunkBufferBorrow = companion.getPool().borrow();
        try {
            int iEncodeImpl = i + encodeImpl(charsetEncoder, input, i, i2, chunkBufferBorrow);
            if (iEncodeImpl == i2) {
                int writePosition = chunkBufferBorrow.getWritePosition() - chunkBufferBorrow.getReadPosition();
                byte[] bArr = new byte[writePosition];
                Intrinsics.checkNotNull(chunkBufferBorrow, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
                BufferPrimitivesKt.readFully((Buffer) chunkBufferBorrow, bArr, 0, writePosition);
                chunkBufferBorrow.release(companion.getPool());
                return bArr;
            }
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            try {
                bytePacketBuilder.appendSingleChunk$ktor_io(chunkBufferBorrow.duplicate());
                EncodingKt.encodeToImpl(charsetEncoder, bytePacketBuilder, input, iEncodeImpl, i2);
                byte[] bytes$default = StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null);
                chunkBufferBorrow.release(companion.getPool());
                return bytes$default;
            } catch (Throwable th) {
                bytePacketBuilder.release();
                throw th;
            }
        } catch (Throwable th2) {
            chunkBufferBorrow.release(ChunkBuffer.INSTANCE.getPool());
            throw th2;
        }
    }

    @NotNull
    public static final Charset getCharset(@NotNull CharsetDecoder charsetDecoder) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        Intrinsics.checkNotNull(charset);
        return charset;
    }

    public static final int decode(@NotNull CharsetDecoder charsetDecoder, @NotNull Input input, @NotNull Appendable dst, int i) {
        CoderResult cr;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        int iRemaining = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            int i2 = 1;
            int i3 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i2) {
                        int i4 = i - iRemaining2;
                        if (i4 == 0) {
                            i2 = 0;
                        } else {
                            try {
                                ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                                int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition() - readPosition;
                                ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition, writePosition2);
                                charBufferAllocate.clear();
                                if (i4 < 8192) {
                                    charBufferAllocate.limit(i4);
                                }
                                CoderResult rc = charsetDecoder.decode(byteBufferM15433slice87lwejk, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                dst.append(charBufferAllocate);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                    throwExceptionWrapped(rc);
                                }
                                i3 = (rc.isUnderflow() && byteBufferM15433slice87lwejk.hasRemaining()) ? i3 + 1 : 1;
                                if (byteBufferM15433slice87lwejk.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                                }
                                chunkBufferPrepareReadFirstHead.discardExact(byteBufferM15433slice87lwejk.position());
                                i2 = i3;
                            } finally {
                                chunkBufferPrepareReadFirstHead.getWritePosition();
                                chunkBufferPrepareReadFirstHead.getReadPosition();
                            }
                        }
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i2 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i2);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    if (i2 <= 0) {
                        iRemaining = 1;
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (iRemaining != 0) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i5 = i - iRemaining;
            if (i5 == 0) {
                break;
            }
            if (i5 < 8192) {
                charBufferAllocate.limit(i5);
            }
            cr = charsetDecoder.decode(EmptyByteBuffer, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            dst.append(charBufferAllocate);
            if (cr.isUnmappable() || cr.isMalformed()) {
                Intrinsics.checkNotNullExpressionValue(cr, "cr");
                throwExceptionWrapped(cr);
            }
        } while (cr.isOverflow());
        return iRemaining;
    }

    @NotNull
    public static final String decodeExactBytes(@NotNull CharsetDecoder charsetDecoder, @NotNull Input input, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i == 0) {
            return "";
        }
        if (input.getHeadEndExclusive() - input.getHeadPosition() >= i) {
            if (input.getHeadMemory().hasArray()) {
                ByteBuffer headMemory = input.getHeadMemory();
                byte[] bArrArray = headMemory.array();
                Intrinsics.checkNotNullExpressionValue(bArrArray, "bb.array()");
                int iArrayOffset = headMemory.arrayOffset() + headMemory.position() + input.getHead().getReadPosition();
                Charset charset = charsetDecoder.charset();
                Intrinsics.checkNotNullExpressionValue(charset, "charset()");
                String str = new String(bArrArray, iArrayOffset, i, charset);
                input.discardExact(i);
                return str;
            }
            return decodeImplByteBuffer(charsetDecoder, input, i);
        }
        return decodeImplSlow(charsetDecoder, input, i);
    }

    public static final String decodeImplByteBuffer(CharsetDecoder charsetDecoder, Input input, int i) throws CharacterCodingException, EOFException {
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(input.getHeadMemory(), input.getHead().getReadPosition(), i);
        CoderResult rc = charsetDecoder.decode(byteBufferM15433slice87lwejk, charBufferAllocate, true);
        if (rc.isMalformed() || rc.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(rc, "rc");
            throwExceptionWrapped(rc);
        }
        charBufferAllocate.flip();
        input.discardExact(byteBufferM15433slice87lwejk.position());
        String string = charBufferAllocate.toString();
        Intrinsics.checkNotNullExpressionValue(string, "cb.toString()");
        return string;
    }

    public static final String decodeImplSlow(CharsetDecoder charsetDecoder, Input input, int i) throws Throwable {
        int iPosition;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        boolean z2 = false;
        if (chunkBufferPrepareReadFirstHead == null) {
            iPosition = i;
        } else {
            iPosition = i;
            int i2 = 1;
            int i3 = 1;
            boolean z3 = false;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i2) {
                        try {
                            if (!charBufferAllocate.hasRemaining() || iPosition == 0) {
                                i2 = 0;
                            } else {
                                ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                                int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition() - readPosition;
                                ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition, writePosition2);
                                int iLimit = byteBufferM15433slice87lwejk.limit();
                                int iPosition2 = byteBufferM15433slice87lwejk.position();
                                boolean z4 = iLimit - iPosition2 >= iPosition;
                                if (z4) {
                                    byteBufferM15433slice87lwejk.limit(iPosition2 + iPosition);
                                }
                                CoderResult rc = charsetDecoder.decode(byteBufferM15433slice87lwejk, charBufferAllocate, z4);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                    throwExceptionWrapped(rc);
                                }
                                i3 = (rc.isUnderflow() && byteBufferM15433slice87lwejk.hasRemaining()) ? i3 + 1 : 1;
                                byteBufferM15433slice87lwejk.limit(iLimit);
                                iPosition -= byteBufferM15433slice87lwejk.position() - iPosition2;
                                if (byteBufferM15433slice87lwejk.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                                }
                                chunkBufferPrepareReadFirstHead.discardExact(byteBufferM15433slice87lwejk.position());
                                i2 = i3;
                                z3 = z4;
                            }
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
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
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i2 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i2);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    if (i2 <= 0) {
                        z2 = true;
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z2) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
            z2 = z3;
        }
        if (charBufferAllocate.hasRemaining() && !z2) {
            CoderResult rc2 = charsetDecoder.decode(EmptyByteBuffer, charBufferAllocate, true);
            if (rc2.isMalformed() || rc2.isUnmappable()) {
                Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                throwExceptionWrapped(rc2);
            }
        }
        if (iPosition <= 0) {
            if (iPosition < 0) {
                throw new AssertionError("remainingInputBytes < 0");
            }
            charBufferAllocate.flip();
            String string = charBufferAllocate.toString();
            Intrinsics.checkNotNullExpressionValue(string, "cb.toString()");
            return string;
        }
        throw new EOFException("Not enough bytes available: had only " + (i - iPosition) + " instead of " + i);
    }

    public static final void throwExceptionWrapped(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new MalformedInputException(message);
        }
    }

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNull(byteBufferAllocate);
        EmptyByteBuffer = byteBufferAllocate;
    }

    public static final boolean encodeComplete(@NotNull CharsetEncoder charsetEncoder, @NotNull Buffer dst) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = dst.getMemory();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
        CoderResult result = charsetEncoder.encode(EmptyCharBuffer, byteBufferM15433slice87lwejk, true);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            throwExceptionWrapped(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (byteBufferM15433slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        dst.commitWritten(byteBufferM15433slice87lwejk.position());
        return zIsUnderflow;
    }

    public static final int decodeBuffer(@NotNull CharsetDecoder charsetDecoder, @NotNull Buffer input, @NotNull Appendable out, boolean z, int i) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(out, "out");
        ByteBuffer memory = input.getMemory();
        int readPosition = input.getReadPosition();
        int writePosition = input.getWritePosition() - readPosition;
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition, writePosition);
        ChunkBuffer chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
        CharBuffer charBufferAsCharBuffer = chunkBufferBorrow.getMemory().asCharBuffer();
        int i2 = 0;
        while (byteBufferM15433slice87lwejk.hasRemaining() && i2 < i) {
            try {
                int iMin = Math.min(charBufferAsCharBuffer.capacity(), i - i2);
                charBufferAsCharBuffer.clear();
                charBufferAsCharBuffer.limit(iMin);
                CoderResult result = charsetDecoder.decode(byteBufferM15433slice87lwejk, charBufferAsCharBuffer, z);
                if (result.isMalformed() || result.isUnmappable()) {
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    throwExceptionWrapped(result);
                }
                i2 += iMin;
            } catch (Throwable th) {
                chunkBufferBorrow.release(ChunkBuffer.INSTANCE.getPool());
                throw th;
            }
        }
        chunkBufferBorrow.release(ChunkBuffer.INSTANCE.getPool());
        if (byteBufferM15433slice87lwejk.limit() != writePosition) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        input.discardExact(byteBufferM15433slice87lwejk.position());
        return i2;
    }
}
