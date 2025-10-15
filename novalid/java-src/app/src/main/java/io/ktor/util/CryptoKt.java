package io.ktor.util;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"io/ktor/util/CryptoKt__CryptoJvmKt", "io/ktor/util/CryptoKt__CryptoKt"}, m7106k = 4, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class CryptoKt {
    public static final int NONCE_SIZE_IN_BYTES = 16;

    @NotNull
    public static final Digest Digest(@NotNull String str) {
        return CryptoKt__CryptoJvmKt.Digest(str);
    }

    @InternalAPI
    @Nullable
    public static final Object build(@NotNull Digest digest, @NotNull String str, @NotNull Charset charset, @NotNull Continuation<? super byte[]> continuation) {
        return CryptoKt__CryptoKt.build(digest, str, charset, continuation);
    }

    @InternalAPI
    @Nullable
    public static final Object build(@NotNull Digest digest, @NotNull byte[] bArr, @NotNull Continuation<? super byte[]> continuation) {
        return CryptoKt__CryptoKt.build(digest, bArr, continuation);
    }

    @NotNull
    public static final String generateNonce() {
        return CryptoKt__CryptoJvmKt.generateNonce();
    }

    @NotNull
    public static final byte[] generateNonce(int i) {
        return CryptoKt__CryptoKt.generateNonce(i);
    }

    @NotNull
    public static final Function1<String, byte[]> getDigestFunction(@NotNull String str, @NotNull Function1<? super String, String> function1) {
        return CryptoKt__CryptoJvmKt.getDigestFunction(str, function1);
    }

    @NotNull
    public static final String hex(@NotNull byte[] bArr) {
        return CryptoKt__CryptoKt.hex(bArr);
    }

    @NotNull
    public static final byte[] hex(@NotNull String str) {
        return CryptoKt__CryptoKt.hex(str);
    }

    @NotNull
    public static final byte[] sha1(@NotNull byte[] bArr) {
        return CryptoKt__CryptoJvmKt.sha1(bArr);
    }
}
