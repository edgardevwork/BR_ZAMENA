package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.E8 */
/* loaded from: classes6.dex */
public final class C8869E8 {

    /* renamed from: a */
    public final C9778pc f6538a;

    /* renamed from: b */
    public final C9778pc f6539b;

    public C8869E8() {
        this(new C9254U7(), new C8993J9(), new C9415b());
    }

    public C8869E8(C9254U7 c9254u7, C8993J9 c8993j9, C9415b c9415b) {
        C9778pc c9778pc = new C9778pc(c9254u7);
        this.f6538a = c9778pc;
        c9778pc.m6636a(EnumC8894F8.NONE, c9254u7);
        c9778pc.m6636a(EnumC8894F8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c8993j9);
        c9778pc.m6636a(EnumC8894F8.AES_VALUE_ENCRYPTION, c9415b);
        this.f6539b = new C9778pc(c9254u7);
    }
}
