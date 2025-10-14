package io.ktor.utils.p050io.charsets;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: UTF.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\"\u0010\u001f\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001\u001a&\u0010#\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a$\u0010$\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a$\u0010%\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a$\u0010&\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a9\u0010&\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150(H\u0082\b\u001a$\u0010*\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a9\u0010*\u001a\u00020\u0007*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150(H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, m7105d2 = {"HighSurrogateMagic", "", "MaxCodePoint", "MinHighSurrogate", "MinLowSurrogate", "MinSupplementary", "decodeUtf8Result", "", "numberOfChars", "requireBytes", "decodeUtf8ResultAcc", "preDecoded", "result", "highSurrogate", CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY, "indexOutOfBounds", "", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "arrayLength", "isBmpCodePoint", "", "isValidCodePoint", "codePoint", "lowSurrogate", "malformedCodePoint", "", "value", "unsupportedByteCount", "b", "", "decodeUTF", "Ljava/nio/ByteBuffer;", "out", "", "decodeUTF8Line", "decodeUTF8Line_array", "decodeUTF8Line_buffer", "decodeUTF8_array", "predicate", "Lkotlin/Function1;", "", "decodeUTF8_buffer", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUTF.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UTF.kt\nio/ktor/utils/io/charsets/UTFKt\n*L\n1#1,544:1\n305#1,109:545\n426#1,97:654\n*S KotlinDebug\n*F\n+ 1 UTF.kt\nio/ktor/utils/io/charsets/UTFKt\n*L\n35#1:545,109\n78#1:654,97\n*E\n"})
/* loaded from: classes8.dex */
public final class UTFKt {
    public static final int HighSurrogateMagic = 55232;
    public static final int MaxCodePoint = 1114111;
    public static final int MinHighSurrogate = 55296;
    public static final int MinLowSurrogate = 56320;
    public static final int MinSupplementary = 65536;

    public static final long decodeUtf8Result(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final int highSurrogate(int i) {
        return (i >>> 10) + 55232;
    }

    public static final boolean isBmpCodePoint(int i) {
        return (i >>> 16) == 0;
    }

    public static final boolean isValidCodePoint(int i) {
        return i <= 1114111;
    }

    public static final int lowSurrogate(int i) {
        return (i & 1023) + 56320;
    }

    public static final long decodeUtf8ResultAcc(int i, long j) {
        return decodeUtf8Result(i + ((int) (j >> 32)), (int) (j & 4294967295L));
    }

    public static final long decodeUTF(@NotNull ByteBuffer byteBuffer, @NotNull char[] out, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        int iDecodeASCII = StringsKt.decodeASCII(byteBuffer, out, i, i2);
        if (!byteBuffer.hasRemaining() || iDecodeASCII == i2) {
            return decodeUtf8Result(iDecodeASCII, 0);
        }
        return byteBuffer.hasArray() ? decodeUtf8ResultAcc(iDecodeASCII, decodeUTF8_array(byteBuffer, out, i + iDecodeASCII, i2 - iDecodeASCII)) : decodeUtf8ResultAcc(iDecodeASCII, decodeUTF8_buffer(byteBuffer, out, i + iDecodeASCII, i2 - iDecodeASCII));
    }

    public static /* synthetic */ long decodeUTF8Line$default(ByteBuffer byteBuffer, char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return decodeUTF8Line(byteBuffer, cArr, i, i2);
    }

    public static final long decodeUTF8Line(@NotNull ByteBuffer byteBuffer, @NotNull char[] out, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        return byteBuffer.hasArray() ? decodeUTF8Line_array(byteBuffer, out, i, i2) : decodeUTF8Line_buffer(byteBuffer, out, i, i2);
    }

    public static final long decodeUTF8_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2) throws Throwable {
        int i3;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (iArrayOffset > iRemaining) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iRemaining > bArrArray.length) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i4 = i + i2;
        if (i4 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i5 = i;
        while (iArrayOffset < iRemaining && i5 < i4) {
            int i6 = iArrayOffset + 1;
            byte b = bArrArray[iArrayOffset];
            if (b >= 0) {
                cArr[i5] = (char) b;
                i5++;
                iArrayOffset = i6;
            } else {
                if ((b & 224) == 192) {
                    if (i6 >= iRemaining) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i5 - i, 2);
                    }
                    iArrayOffset += 2;
                    byte b2 = bArrArray[i6];
                    i3 = i5 + 1;
                    cArr[i5] = (char) ((b2 & 63) | ((b & 31) << 6));
                } else if ((b & 240) == 224) {
                    if (iRemaining - i6 < 2) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i5 - i, 3);
                    }
                    int i7 = iArrayOffset + 2;
                    byte b3 = bArrArray[i6];
                    iArrayOffset += 3;
                    byte b4 = bArrArray[i7];
                    int i8 = b & Ascii.f786SI;
                    int i9 = b4 & 63;
                    int i10 = i9 | ((b3 & 63) << 6) | (i8 << 12);
                    if (i8 == 0 || isBmpCodePoint(i10)) {
                        i3 = i5 + 1;
                        cArr[i5] = (char) i10;
                    } else {
                        malformedCodePoint(i10);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    if ((b & 248) != 240) {
                        unsupportedByteCount(b);
                        throw new KotlinNothingValueException();
                    }
                    if (iRemaining - i6 < 3) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i5 - i, 4);
                    }
                    byte b5 = bArrArray[i6];
                    int i11 = iArrayOffset + 4;
                    int i12 = (b5 & 63) << 12;
                    int i13 = i12 | ((b & 7) << 18) | ((bArrArray[iArrayOffset + 2] & 63) << 6) | (bArrArray[iArrayOffset + 3] & 63);
                    if (!isValidCodePoint(i13)) {
                        malformedCodePoint(i13);
                        throw new KotlinNothingValueException();
                    }
                    if (i4 - i5 >= 2) {
                        int iHighSurrogate = highSurrogate(i13);
                        int iLowSurrogate = lowSurrogate(i13);
                        int i14 = i5 + 1;
                        cArr[i5] = (char) iHighSurrogate;
                        i5 += 2;
                        cArr[i14] = (char) iLowSurrogate;
                        iArrayOffset = i11;
                    } else {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i5 - i, 0);
                    }
                }
                i5 = i3;
            }
        }
        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
        return decodeUtf8Result(i5 - i, 0);
    }

    public static final long decodeUTF8_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2) throws Throwable {
        int i3 = i + i2;
        if (i3 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i4 = i;
        while (byteBuffer.hasRemaining() && i4 < i3) {
            byte b = byteBuffer.get();
            if (b >= 0) {
                cArr[i4] = (char) b;
                i4++;
            } else if ((b & 224) == 192) {
                if (byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i4 - i, 2);
                }
                cArr[i4] = (char) (((b & 31) << 6) | (byteBuffer.get() & 63));
                i4++;
            } else if ((b & 240) == 224) {
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i4 - i, 3);
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                int i5 = b & Ascii.f786SI;
                int i6 = ((b2 & 63) << 6) | (i5 << 12) | (b3 & 63);
                if (i5 == 0 || isBmpCodePoint(i6)) {
                    cArr[i4] = (char) i6;
                    i4++;
                } else {
                    malformedCodePoint(i6);
                    throw new KotlinNothingValueException();
                }
            } else if ((b & 248) == 240) {
                if (byteBuffer.remaining() < 3) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i4 - i, 4);
                }
                int i7 = ((b & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                if (!isValidCodePoint(i7)) {
                    malformedCodePoint(i7);
                    throw new KotlinNothingValueException();
                }
                if (i3 - i4 >= 2) {
                    int iHighSurrogate = highSurrogate(i7);
                    int iLowSurrogate = lowSurrogate(i7);
                    int i8 = i4 + 1;
                    cArr[i4] = (char) iHighSurrogate;
                    i4 += 2;
                    cArr[i8] = (char) iLowSurrogate;
                } else {
                    byteBuffer.position(byteBuffer.position() - 4);
                    return decodeUtf8Result(i4 - i, 0);
                }
            } else {
                unsupportedByteCount(b);
                throw new KotlinNothingValueException();
            }
        }
        return decodeUtf8Result(i4 - i, 0);
    }

    public static final long decodeUTF8_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2, Function1<? super Character, Boolean> function1) throws Throwable {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (iArrayOffset > iRemaining) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iRemaining > bArrArray.length) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i + i2;
        if (i3 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i4 = i;
        while (iArrayOffset < iRemaining && i4 < i3) {
            int i5 = iArrayOffset + 1;
            byte b = bArrArray[iArrayOffset];
            if (b >= 0) {
                char c = (char) b;
                if (!function1.invoke(Character.valueOf(c)).booleanValue()) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, -1);
                }
                cArr[i4] = c;
                i4++;
                iArrayOffset = i5;
            } else if ((b & 224) == 192) {
                if (i5 >= iRemaining) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 2);
                }
                int i6 = iArrayOffset + 2;
                char c2 = (char) ((bArrArray[i5] & 63) | ((b & 31) << 6));
                if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, -1);
                }
                cArr[i4] = c2;
                i4++;
                iArrayOffset = i6;
            } else if ((b & 240) == 224) {
                if (iRemaining - i5 < 2) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 3);
                }
                byte b2 = bArrArray[i5];
                int i7 = iArrayOffset + 3;
                byte b3 = bArrArray[iArrayOffset + 2];
                int i8 = b & Ascii.f786SI;
                int i9 = (b3 & 63) | ((b2 & 63) << 6) | (i8 << 12);
                if (i8 == 0 || isBmpCodePoint(i9)) {
                    char c3 = (char) i9;
                    if (!function1.invoke(Character.valueOf(c3)).booleanValue()) {
                        byteBuffer.position((iArrayOffset - 1) - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i4 - i, -1);
                    }
                    cArr[i4] = c3;
                    i4++;
                    iArrayOffset = i7;
                } else {
                    malformedCodePoint(i9);
                    throw new KotlinNothingValueException();
                }
            } else {
                if ((b & 248) != 240) {
                    unsupportedByteCount(b);
                    throw new KotlinNothingValueException();
                }
                if (iRemaining - i5 < 3) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 4);
                }
                byte b4 = bArrArray[i5];
                int i10 = iArrayOffset + 4;
                int i11 = ((bArrArray[iArrayOffset + 2] & 63) << 6) | ((b4 & 63) << 12) | ((b & 7) << 18) | (bArrArray[iArrayOffset + 3] & 63);
                if (!isValidCodePoint(i11)) {
                    malformedCodePoint(i11);
                    throw new KotlinNothingValueException();
                }
                if (i3 - i4 >= 2) {
                    char cHighSurrogate = (char) highSurrogate(i11);
                    char cLowSurrogate = (char) lowSurrogate(i11);
                    if (!function1.invoke(Character.valueOf(cHighSurrogate)).booleanValue() || !function1.invoke(Character.valueOf(cLowSurrogate)).booleanValue()) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        return decodeUtf8Result(i4 - i, -1);
                    }
                    int i12 = i4 + 1;
                    cArr[i4] = cHighSurrogate;
                    i4 += 2;
                    cArr[i12] = cLowSurrogate;
                    iArrayOffset = i10;
                } else {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return decodeUtf8Result(i4 - i, 0);
                }
            }
        }
        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
        return decodeUtf8Result(i4 - i, 0);
    }

    public static final long decodeUTF8_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2, Function1<? super Character, Boolean> function1) throws Throwable {
        int i3;
        int i4 = i + i2;
        if (i4 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i5 = i;
        while (byteBuffer.hasRemaining() && i5 < i4) {
            byte b = byteBuffer.get();
            if (b >= 0) {
                char c = (char) b;
                if (!function1.invoke(Character.valueOf(c)).booleanValue()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, -1);
                }
                i3 = i5 + 1;
                cArr[i5] = c;
            } else if ((b & 224) == 192) {
                if (!byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, 2);
                }
                char c2 = (char) (((b & 31) << 6) | (byteBuffer.get() & 63));
                if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                    byteBuffer.position(byteBuffer.position() - 2);
                    return decodeUtf8Result(i5 - i, -1);
                }
                i3 = i5 + 1;
                cArr[i5] = c2;
            } else if ((b & 240) == 224) {
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, 3);
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                int i6 = b & Ascii.f786SI;
                int i7 = ((b2 & 63) << 6) | (i6 << 12) | (b3 & 63);
                if (i6 == 0 || isBmpCodePoint(i7)) {
                    char c3 = (char) i7;
                    if (!function1.invoke(Character.valueOf(c3)).booleanValue()) {
                        byteBuffer.position(byteBuffer.position() - 3);
                        return decodeUtf8Result(i5 - i, -1);
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c3;
                } else {
                    malformedCodePoint(i7);
                    throw new KotlinNothingValueException();
                }
            } else if ((b & 248) == 240) {
                if (byteBuffer.remaining() < 3) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return decodeUtf8Result(i5 - i, 4);
                }
                int i8 = ((b & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                if (!isValidCodePoint(i8)) {
                    malformedCodePoint(i8);
                    throw new KotlinNothingValueException();
                }
                if (i4 - i5 >= 2) {
                    char cHighSurrogate = (char) highSurrogate(i8);
                    char cLowSurrogate = (char) lowSurrogate(i8);
                    if (!function1.invoke(Character.valueOf(cHighSurrogate)).booleanValue() || !function1.invoke(Character.valueOf(cLowSurrogate)).booleanValue()) {
                        byteBuffer.position(byteBuffer.position() - 4);
                        return decodeUtf8Result(i5 - i, -1);
                    }
                    int i9 = i5 + 1;
                    cArr[i5] = cHighSurrogate;
                    i5 += 2;
                    cArr[i9] = cLowSurrogate;
                } else {
                    byteBuffer.position(byteBuffer.position() - 4);
                    return decodeUtf8Result(i5 - i, 0);
                }
            } else {
                unsupportedByteCount(b);
                throw new KotlinNothingValueException();
            }
            i5 = i3;
        }
        return decodeUtf8Result(i5 - i, 0);
    }

    public static final Throwable indexOutOfBounds(int i, int i2, int i3) {
        return new IndexOutOfBoundsException(i + " (offset) + " + i2 + " (length) > " + i3 + " (array.length)");
    }

    public static final Void malformedCodePoint(int i) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i) + " found");
    }

    public static final Void unsupportedByteCount(byte b) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported byte code, first byte is 0x");
        String string = Integer.toString(b & 255, CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(StringsKt__StringsKt.padStart(string, 2, '0'));
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final long decodeUTF8Line_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2) throws Throwable {
        long jDecodeUtf8Result;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        char c;
        boolean z6;
        boolean z7;
        boolean z8;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (iArrayOffset > iRemaining) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iRemaining > bArrArray.length) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i + i2;
        if (i3 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i4 = i;
        boolean z9 = false;
        while (iArrayOffset < iRemaining && i4 < i3) {
            int i5 = iArrayOffset + 1;
            byte b = bArrArray[iArrayOffset];
            if (b >= 0) {
                char c2 = (char) b;
                if (c2 == '\r') {
                    z2 = true;
                    z = true;
                } else if (c2 == '\n') {
                    z2 = false;
                    z = false;
                } else if (z9) {
                    z = z9;
                    z2 = false;
                } else {
                    z = z9;
                    z2 = true;
                }
                if (!z2) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jDecodeUtf8Result = decodeUtf8Result(i4 - i, -1);
                    z9 = z;
                    break;
                }
                cArr[i4] = c2;
                i4++;
                z9 = z;
                iArrayOffset = i5;
            } else if ((b & 224) == 192) {
                if (i5 >= iRemaining) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jDecodeUtf8Result = decodeUtf8Result(i4 - i, 2);
                    break;
                }
                int i6 = iArrayOffset + 2;
                char c3 = (char) ((bArrArray[i5] & 63) | ((b & 31) << 6));
                if (c3 == '\r') {
                    z3 = true;
                    z = true;
                } else if (c3 == '\n') {
                    z3 = false;
                    z = false;
                } else if (z9) {
                    z = z9;
                    z3 = false;
                } else {
                    z = z9;
                    z3 = true;
                }
                if (!z3) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jDecodeUtf8Result = decodeUtf8Result(i4 - i, -1);
                    z9 = z;
                    break;
                }
                cArr[i4] = c3;
                i4++;
                z9 = z;
                iArrayOffset = i6;
            } else {
                if ((b & 240) != 224) {
                    if ((b & 248) != 240) {
                        unsupportedByteCount(b);
                        throw new KotlinNothingValueException();
                    }
                    if (iRemaining - i5 < 3) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        jDecodeUtf8Result = decodeUtf8Result(i4 - i, 4);
                        break;
                    }
                    byte b2 = bArrArray[i5];
                    int i7 = iArrayOffset + 4;
                    int i8 = ((bArrArray[iArrayOffset + 2] & 63) << 6) | ((b2 & 63) << 12) | ((b & 7) << 18) | (bArrArray[iArrayOffset + 3] & 63);
                    if (!isValidCodePoint(i8)) {
                        malformedCodePoint(i8);
                        throw new KotlinNothingValueException();
                    }
                    if (i3 - i4 >= 2) {
                        char cHighSurrogate = (char) highSurrogate(i8);
                        char cLowSurrogate = (char) lowSurrogate(i8);
                        if (cHighSurrogate == '\r') {
                            z7 = true;
                            c = '\n';
                            z6 = true;
                        } else {
                            c = '\n';
                            if (cHighSurrogate == '\n') {
                                z7 = false;
                                z6 = false;
                            } else if (z9) {
                                z6 = z9;
                                z7 = false;
                            } else {
                                z6 = z9;
                                z7 = true;
                            }
                        }
                        if (z7) {
                            if (cLowSurrogate == '\r') {
                                z8 = true;
                                z6 = true;
                            } else if (cLowSurrogate == c) {
                                z8 = false;
                                z6 = false;
                            } else {
                                z8 = !z6;
                            }
                            if (z8) {
                                int i9 = i4 + 1;
                                cArr[i4] = cHighSurrogate;
                                i4 += 2;
                                cArr[i9] = cLowSurrogate;
                                iArrayOffset = i7;
                                z9 = z6;
                            }
                        }
                        z9 = z6;
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        jDecodeUtf8Result = decodeUtf8Result(i4 - i, -1);
                        break;
                    }
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jDecodeUtf8Result = decodeUtf8Result(i4 - i, 0);
                    break;
                }
                if (iRemaining - i5 < 2) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jDecodeUtf8Result = decodeUtf8Result(i4 - i, 3);
                    break;
                }
                byte b3 = bArrArray[i5];
                int i10 = iArrayOffset + 3;
                byte b4 = bArrArray[iArrayOffset + 2];
                int i11 = b & Ascii.f786SI;
                int i12 = (b4 & 63) | ((b3 & 63) << 6) | (i11 << 12);
                if (i11 != 0 && !isBmpCodePoint(i12)) {
                    malformedCodePoint(i12);
                    throw new KotlinNothingValueException();
                }
                char c4 = (char) i12;
                if (c4 == '\r') {
                    z5 = true;
                    z4 = true;
                } else if (c4 == '\n') {
                    z5 = false;
                    z4 = false;
                } else if (z9) {
                    z4 = z9;
                    z5 = false;
                } else {
                    z4 = z9;
                    z5 = true;
                }
                if (!z5) {
                    byteBuffer.position((iArrayOffset - 1) - byteBuffer.arrayOffset());
                    jDecodeUtf8Result = decodeUtf8Result(i4 - i, -1);
                    z9 = z4;
                    break;
                }
                cArr[i4] = c4;
                i4++;
                z9 = z4;
                iArrayOffset = i10;
            }
        }
        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
        jDecodeUtf8Result = decodeUtf8Result(i4 - i, 0);
        int i13 = (int) (4294967295L & jDecodeUtf8Result);
        if (i13 == -1) {
            int i14 = (int) (jDecodeUtf8Result >> 32);
            if (z9) {
                return decodeUtf8Result(i14 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i14 > 0) {
                int i15 = i14 - 1;
                if (cArr[i15] == '\r') {
                    return decodeUtf8Result(i15, -1);
                }
            }
        } else if (i13 == 0 && z9) {
            int i16 = (int) (jDecodeUtf8Result >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return decodeUtf8Result(i16 - 1, 2);
        }
        return jDecodeUtf8Result;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long decodeUTF8Line_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2) throws Throwable {
        long jDecodeUtf8Result;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4 = i + i2;
        if (i4 > cArr.length) {
            throw indexOutOfBounds(i, i2, cArr.length);
        }
        int i5 = i;
        boolean z6 = false;
        while (byteBuffer.hasRemaining() && i5 < i4) {
            byte b = byteBuffer.get();
            if (b >= 0) {
                char c = (char) b;
                if (c == '\r') {
                    z6 = true;
                } else if (c == '\n') {
                    z6 = false;
                } else {
                    z = !z6;
                    if (z) {
                        byteBuffer.position(byteBuffer.position() - 1);
                        jDecodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                        break;
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c;
                    i5 = i3;
                }
                z = z6;
                if (z) {
                }
            } else if ((b & 224) == 192) {
                if (!byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    jDecodeUtf8Result = decodeUtf8Result(i5 - i, 2);
                    break;
                }
                char c2 = (char) (((b & 31) << 6) | (byteBuffer.get() & 63));
                if (c2 == '\r') {
                    z6 = true;
                } else if (c2 == '\n') {
                    z6 = false;
                } else {
                    z2 = !z6;
                    if (z2) {
                        byteBuffer.position(byteBuffer.position() - 2);
                        jDecodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                        break;
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c2;
                    i5 = i3;
                }
                z2 = z6;
                if (z2) {
                }
            } else {
                if ((b & 240) != 224) {
                    if ((b & 248) == 240) {
                        if (byteBuffer.remaining() < 3) {
                            byteBuffer.position(byteBuffer.position() - 1);
                            jDecodeUtf8Result = decodeUtf8Result(i5 - i, 4);
                            break;
                        }
                        int i6 = ((b & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                        if (!isValidCodePoint(i6)) {
                            malformedCodePoint(i6);
                            throw new KotlinNothingValueException();
                        }
                        if (i4 - i5 >= 2) {
                            char cHighSurrogate = (char) highSurrogate(i6);
                            char cLowSurrogate = (char) lowSurrogate(i6);
                            if (cHighSurrogate != '\r') {
                                if (cHighSurrogate != '\n') {
                                    z4 = !z6;
                                    if (z4) {
                                        if (cLowSurrogate == '\r') {
                                            z6 = true;
                                        } else if (cLowSurrogate == '\n') {
                                            z6 = false;
                                        } else {
                                            z5 = !z6;
                                            if (!z5) {
                                                int i7 = i5 + 1;
                                                cArr[i5] = cHighSurrogate;
                                                i5 += 2;
                                                cArr[i7] = cLowSurrogate;
                                            }
                                        }
                                        z5 = z6;
                                        if (!z5) {
                                        }
                                    }
                                    byteBuffer.position(byteBuffer.position() - 4);
                                    jDecodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                                    break;
                                }
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            z4 = z6;
                            if (z4) {
                            }
                            byteBuffer.position(byteBuffer.position() - 4);
                            jDecodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                            break;
                        }
                        byteBuffer.position(byteBuffer.position() - 4);
                        jDecodeUtf8Result = decodeUtf8Result(i5 - i, 0);
                        break;
                    }
                    unsupportedByteCount(b);
                    throw new KotlinNothingValueException();
                }
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    jDecodeUtf8Result = decodeUtf8Result(i5 - i, 3);
                    break;
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                int i8 = b & Ascii.f786SI;
                int i9 = (i8 << 12) | ((b2 & 63) << 6) | (b3 & 63);
                if (i8 != 0 && !isBmpCodePoint(i9)) {
                    malformedCodePoint(i9);
                    throw new KotlinNothingValueException();
                }
                char c3 = (char) i9;
                if (c3 == '\r') {
                    z6 = true;
                } else if (c3 == '\n') {
                    z6 = false;
                } else {
                    z3 = !z6;
                    if (z3) {
                        byteBuffer.position(byteBuffer.position() - 3);
                        jDecodeUtf8Result = decodeUtf8Result(i5 - i, -1);
                        break;
                    }
                    i3 = i5 + 1;
                    cArr[i5] = c3;
                    i5 = i3;
                }
                z3 = z6;
                if (z3) {
                }
            }
        }
        jDecodeUtf8Result = decodeUtf8Result(i5 - i, 0);
        int i10 = (int) (4294967295L & jDecodeUtf8Result);
        if (i10 == -1) {
            int i11 = (int) (jDecodeUtf8Result >> 32);
            if (z6) {
                return decodeUtf8Result(i11 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (cArr[i12] == '\r') {
                    return decodeUtf8Result(i12, -1);
                }
            }
        } else if (i10 == 0 && z6) {
            int i13 = (int) (jDecodeUtf8Result >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return decodeUtf8Result(i13 - 1, 2);
        }
        return jDecodeUtf8Result;
    }
}
