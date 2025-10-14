package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.J9 */
/* loaded from: classes6.dex */
public final class C8993J9 implements InterfaceC8844D8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC8844D8
    /* renamed from: a */
    public final C9974x8 mo5056a(C9252U5 c9252u5) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8844D8
    /* renamed from: a */
    public final byte[] mo5057a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public final EnumC8894F8 m5301a() {
        return EnumC8894F8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
