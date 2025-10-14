package io.ktor.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.google.common.base.Ascii;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.StringsKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.HexExtensionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Crypto.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b\u001a\u001d\u0010\u000b\u001a\u00020\u0005*\u00020\f2\u0006\u0010\t\u001a\u00020\u0005H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\u000b\u001a\u00020\u0005*\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\f\b\u0002\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m7105d2 = {"NONCE_SIZE_IN_BYTES", "", WebvttCssParser.VALUE_DIGITS, "", "generateNonce", "", "size", "hex", "", "bytes", "s", "build", "Lio/ktor/util/Digest;", "(Lio/ktor/util/Digest;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", TypedValues.Custom.S_STRING, "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Lio/ktor/util/Digest;Ljava/lang/String;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, m7106k = 5, m7107mv = {1, 8, 0}, m7109xi = 48, m7110xs = "io/ktor/util/CryptoKt")
@SourceDebugExtension({"SMAP\nCrypto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crypto.kt\nio/ktor/util/CryptoKt__CryptoKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,112:1\n12#2,11:113\n8#3,3:124\n*S KotlinDebug\n*F\n+ 1 Crypto.kt\nio/ktor/util/CryptoKt__CryptoKt\n*L\n58#1:113,11\n109#1:124,3\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class CryptoKt__CryptoKt {

    @NotNull
    public static final char[] digits = CharsetKt.toCharArray(HexExtensionsKt.LOWER_CASE_HEX_DIGITS);

    @NotNull
    public static final String hex(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        char[] cArr2 = digits;
        int i = 0;
        for (byte b : bytes) {
            int i2 = i + 1;
            cArr[i] = cArr2[(b & 255) >> 4];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.f786SI];
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    @NotNull
    public static final byte[] hex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Integer.parseInt(String.valueOf(s.charAt(i2 + 1)), CharsKt__CharJVMKt.checkRadix(16)) | (Integer.parseInt(String.valueOf(s.charAt(i2)), CharsKt__CharJVMKt.checkRadix(16)) << 4));
        }
        return bArr;
    }

    @InternalAPI
    @Nullable
    public static final Object build(@NotNull Digest digest, @NotNull byte[] bArr, @NotNull Continuation<? super byte[]> continuation) {
        digest.plusAssign(bArr);
        return digest.build(continuation);
    }

    public static /* synthetic */ Object build$default(Digest digest, String str, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return CryptoKt.build(digest, str, charset, continuation);
    }

    @NotNull
    public static final byte[] generateNonce(int i) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        while (bytePacketBuilder.getSize() < i) {
            try {
                StringsKt.writeText$default(bytePacketBuilder, CryptoKt.generateNonce(), 0, 0, (Charset) null, 14, (Object) null);
            } catch (Throwable th) {
                bytePacketBuilder.release();
                throw th;
            }
        }
        return StringsKt.readBytes(bytePacketBuilder.build(), i);
    }

    @InternalAPI
    @Nullable
    public static final Object build(@NotNull Digest digest, @NotNull String str, @NotNull Charset charset, @NotNull Continuation<? super byte[]> continuation) {
        byte[] bArrEncodeToByteArray;
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            bArrEncodeToByteArray = StringsKt__StringsJVMKt.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        digest.plusAssign(bArrEncodeToByteArray);
        return digest.build(continuation);
    }
}
