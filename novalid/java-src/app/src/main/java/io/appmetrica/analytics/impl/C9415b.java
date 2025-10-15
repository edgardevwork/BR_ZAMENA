package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b */
/* loaded from: classes8.dex */
public final class C9415b implements InterfaceC8844D8 {

    /* renamed from: a */
    public final AESEncrypter f7756a;

    public C9415b() {
        this(new C9390a(C9676la.m6362h().m6369e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.InterfaceC8844D8
    @NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9974x8 mo5056a(@NonNull C9252U5 c9252u5) {
        byte[] bArrEncrypt;
        String strEncodeToString;
        String value = c9252u5.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                bArrEncrypt = this.f7756a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            strEncodeToString = bArrEncrypt != null ? Base64.encodeToString(bArrEncrypt, 0) : null;
        }
        c9252u5.setValue(strEncodeToString);
        return new C9974x8(c9252u5, EnumC8894F8.AES_VALUE_ENCRYPTION);
    }

    public C9415b(C9390a c9390a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c9390a.m5822b(), c9390a.m5821a()));
    }

    public C9415b(AESEncrypter aESEncrypter) {
        this.f7756a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8844D8
    @NonNull
    /* renamed from: a */
    public final byte[] mo5057a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f7756a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    @NonNull
    /* renamed from: a */
    public final EnumC8894F8 m5890a() {
        return EnumC8894F8.AES_VALUE_ENCRYPTION;
    }
}
