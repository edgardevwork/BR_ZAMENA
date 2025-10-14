package io.ktor.util;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.api.util.FileChecksumCalculator;

/* compiled from: CryptoJvm.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\r\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0002\b\r\u001a=\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\n\u001a\u00020\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000f\u0012\b\b\u0002\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\f\u001a\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b¨\u0006\u0013"}, m7105d2 = {"Digest", "Lio/ktor/util/Digest;", "name", "", "generateNonce", "generateNonceBlocking", "generateNonceBlocking$CryptoKt__CryptoJvmKt", "getDigest", "", "text", "algorithm", "salt", "Lkotlin/Function1;", "getDigest$CryptoKt__CryptoJvmKt", "getDigestFunction", "Lkotlin/ParameterName;", "value", "sha1", "bytes", "ktor-utils"}, m7106k = 5, m7107mv = {1, 8, 0}, m7109xi = 48, m7110xs = "io/ktor/util/CryptoKt")
/* loaded from: classes7.dex */
public final /* synthetic */ class CryptoKt__CryptoJvmKt {

    /* compiled from: CryptoJvm.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "e", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.util.CryptoKt__CryptoJvmKt$getDigestFunction$1 */
    /* loaded from: classes5.dex */
    public static final class C103451 extends Lambda implements Function1<String, byte[]> {
        public final /* synthetic */ String $algorithm;
        public final /* synthetic */ Function1<String, String> $salt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C103451(String str, Function1<? super String, String> function1) {
            super(1);
            str = str;
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final byte[] invoke(@NotNull String e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return CryptoKt__CryptoJvmKt.getDigest$CryptoKt__CryptoJvmKt(e, str, function1);
        }
    }

    @NotNull
    public static final Function1<String, byte[]> getDigestFunction(@NotNull String algorithm, @NotNull Function1<? super String, String> salt) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(salt, "salt");
        return new Function1<String, byte[]>() { // from class: io.ktor.util.CryptoKt__CryptoJvmKt.getDigestFunction.1
            public final /* synthetic */ String $algorithm;
            public final /* synthetic */ Function1<String, String> $salt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C103451(String algorithm2, Function1<? super String, String> salt2) {
                super(1);
                str = algorithm2;
                function1 = salt2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final byte[] invoke(@NotNull String e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return CryptoKt__CryptoJvmKt.getDigest$CryptoKt__CryptoJvmKt(e, str, function1);
            }
        };
    }

    public static final byte[] getDigest$CryptoKt__CryptoJvmKt(String str, String str2, Function1<? super String, String> function1) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        String strInvoke = function1.invoke(str);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strInvoke.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        byte[] bytes2 = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes2);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "with(MessageDigest.getIn…text.toByteArray())\n    }");
        return bArrDigest;
    }

    @NotNull
    public static final byte[] sha1(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] bArrDigest = MessageDigest.getInstance(FileChecksumCalculator.SHA1_ALGORITHM).digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "getInstance(\"SHA1\").digest(bytes)");
        return bArrDigest;
    }

    @NotNull
    public static final Digest Digest(@NotNull String name) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance(name);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(name)");
        return DigestImpl.m15396boximpl(DigestImpl.m15398constructorimpl(messageDigest));
    }

    @NotNull
    public static final String generateNonce() {
        String str = (String) ChannelResult.m17216getOrNullimpl(NonceKt.getSeedChannel().mo17206tryReceivePtdJZtk());
        return str != null ? str : generateNonceBlocking$CryptoKt__CryptoJvmKt();
    }

    public static final String generateNonceBlocking$CryptoKt__CryptoJvmKt() {
        NonceKt.ensureNonceGeneratorRunning();
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null), 1, null);
    }
}
