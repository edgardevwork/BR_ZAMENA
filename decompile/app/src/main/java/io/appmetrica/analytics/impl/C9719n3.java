package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.p048io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n3 */
/* loaded from: classes5.dex */
public final class C9719n3 {

    /* renamed from: a */
    public final C9694m3 f8695a;

    /* renamed from: b */
    public final GZIPCompressor f8696b;

    public C9719n3() {
        this(new C9694m3(), new GZIPCompressor());
    }

    /* renamed from: a */
    public final byte[] m6495a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C9694m3 c9694m3 = this.f8695a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c9694m3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f8696b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C9719n3(C9694m3 c9694m3, GZIPCompressor gZIPCompressor) {
        this.f8695a = c9694m3;
        this.f8696b = gZIPCompressor;
    }
}
