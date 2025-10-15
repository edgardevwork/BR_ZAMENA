package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s6 */
/* loaded from: classes6.dex */
public final class C9847s6 implements CryptoProvider {

    /* renamed from: a */
    public final AESRSAEncrypter f9038a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    @NotNull
    public final Encrypter getAesRsaEncrypter() {
        return this.f9038a;
    }
}
