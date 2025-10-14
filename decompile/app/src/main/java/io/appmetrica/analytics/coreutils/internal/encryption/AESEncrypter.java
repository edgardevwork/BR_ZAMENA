package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a */
    private final String f6177a;

    /* renamed from: b */
    private final byte[] f6178b;

    /* renamed from: c */
    private final byte[] f6179c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f6177a = str;
        this.f6178b = bArr;
        this.f6179c = bArr2;
    }

    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f6178b, "AES");
            Cipher cipher = Cipher.getInstance(this.f6177a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f6179c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public String getAlgorithm() {
        return this.f6177a;
    }

    @VisibleForTesting
    public byte[] getIV() {
        return this.f6179c;
    }

    @VisibleForTesting
    public byte[] getPassword() {
        return this.f6178b;
    }

    @Nullable
    public byte[] decrypt(@NonNull byte[] bArr, int i, int i2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f6178b, "AES");
            Cipher cipher = Cipher.getInstance(this.f6177a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f6179c));
            return cipher.doFinal(bArr, i, i2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
