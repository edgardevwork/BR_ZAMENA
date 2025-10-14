package io.ktor.util;

import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.InputArraysKt;
import io.ktor.utils.p050io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Base64.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\n\u001a\u00020\r*\u00020\u0001\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\r\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0010\u001a\u00020\u0005*\u00020\u0005H\u0080\b\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0007H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"BASE64_ALPHABET", "", "BASE64_INVERSE_ALPHABET", "", "BASE64_MASK", "", "BASE64_MASK_INT", "", "BASE64_PAD", "", "decodeBase64Bytes", "Lio/ktor/utils/io/core/Input;", "Lio/ktor/utils/io/core/ByteReadPacket;", "", "decodeBase64String", "encodeBase64", "fromBase64", "toBase64", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nio/ktor/util/Base64Kt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StringsJVM.kt\nio/ktor/utils/io/core/StringsJVMKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n108#1:124\n108#1:125\n111#1:158\n12#2,11:113\n12#2,7:133\n19#2,4:144\n12#2,7:148\n19#2,4:160\n1#3:126\n10#4,6:127\n384#5,4:140\n13133#6,3:155\n13136#6:159\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nio/ktor/util/Base64Kt\n*L\n45#1:124\n61#1:125\n97#1:158\n23#1:113,11\n82#1:133,7\n82#1:144,4\n90#1:148,7\n90#1:160,4\n77#1:127,6\n83#1:140,4\n96#1:155,3\n96#1:159\n*E\n"})
/* loaded from: classes7.dex */
public final class Base64Kt {

    @NotNull
    public static final String BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    @NotNull
    public static final int[] BASE64_INVERSE_ALPHABET;
    public static final byte BASE64_MASK = 63;
    public static final int BASE64_MASK_INT = 63;
    public static final char BASE64_PAD = '=';

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = StringsKt__StringsKt.indexOf$default((CharSequence) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, false, 6, (Object) null);
        }
        BASE64_INVERSE_ALPHABET = iArr;
    }

    @NotNull
    public static final String encodeBase64(@NotNull byte[] bArr) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i3 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 3;
            if (i6 > bArr.length) {
                break;
            }
            int i7 = (bArr[i4 + 2] & 255) | ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8);
            int i8 = 3;
            while (-1 < i8) {
                cArr[i5] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i7 >> (i8 * 6)) & 63);
                i8--;
                i5++;
            }
            i4 = i6;
        }
        int length = bArr.length - i4;
        if (length == 0) {
            return StringsKt__StringsJVMKt.concatToString(cArr, 0, i5);
        }
        if (length == 1) {
            i = (bArr[i4] & 255) << 16;
        } else {
            i = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
        }
        int i9 = ((3 - length) * 8) / 6;
        if (i9 <= 3) {
            while (true) {
                i2 = i5 + 1;
                cArr[i5] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i >> (i3 * 6)) & 63);
                if (i3 == i9) {
                    break;
                }
                i3--;
                i5 = i2;
            }
            i5 = i2;
        }
        int i10 = 0;
        while (i10 < i9) {
            cArr[i5] = '=';
            i10++;
            i5++;
        }
        return StringsKt__StringsJVMKt.concatToString(cArr, 0, i5);
    }

    @NotNull
    public static final String encodeBase64(@NotNull ByteReadPacket byteReadPacket) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        return encodeBase64(StringsKt.readBytes$default(byteReadPacket, 0, 1, null));
    }

    @NotNull
    public static final String decodeBase64String(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64Bytes = decodeBase64Bytes(str);
        return new String(bArrDecodeBase64Bytes, 0, bArrDecodeBase64Bytes.length, Charsets.UTF_8);
    }

    public static final char toBase64(int i) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i);
    }

    public static final byte fromBase64(byte b) {
        return (byte) (((byte) BASE64_INVERSE_ALPHABET[b & 255]) & 63);
    }

    @NotNull
    public static final String encodeBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            StringsKt.writeText$default(bytePacketBuilder, str, 0, 0, (Charset) null, 14, (Object) null);
            return encodeBase64(bytePacketBuilder.build());
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    @NotNull
    public static final byte[] decodeBase64Bytes(@NotNull String str) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(str, "<this>");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            int lastIndex = StringsKt__StringsKt.getLastIndex(str);
            while (true) {
                if (-1 < lastIndex) {
                    if (str.charAt(lastIndex) != '=') {
                        strSubstring = str.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        break;
                    }
                    lastIndex--;
                } else {
                    strSubstring = "";
                    break;
                }
            }
            StringsKt.writeText$default(bytePacketBuilder, strSubstring, 0, 0, (Charset) null, 14, (Object) null);
            return StringsKt.readBytes(decodeBase64Bytes(bytePacketBuilder.build()));
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    @NotNull
    public static final Input decodeBase64Bytes(@NotNull ByteReadPacket byteReadPacket) {
        int i;
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            byte[] bArr = new byte[4];
            while (byteReadPacket.getRemaining() > 0) {
                int available$default = InputArraysKt.readAvailable$default((Input) byteReadPacket, bArr, 0, 0, 6, (Object) null);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < 4) {
                    i3 |= ((byte) (((byte) BASE64_INVERSE_ALPHABET[bArr[i2] & 255]) & 63)) << ((3 - i4) * 6);
                    i2++;
                    i4++;
                }
                int i5 = 4 - available$default;
                if (i5 <= 2) {
                    while (true) {
                        bytePacketBuilder.writeByte((byte) ((i3 >> (i * 8)) & 255));
                        i = i != i5 ? i - 1 : 2;
                    }
                }
            }
            return bytePacketBuilder.build();
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }
}
