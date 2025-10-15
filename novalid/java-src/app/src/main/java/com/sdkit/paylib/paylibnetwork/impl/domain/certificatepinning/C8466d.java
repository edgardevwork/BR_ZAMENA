package com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.d */
/* loaded from: classes6.dex */
public final class C8466d implements InterfaceC8463a {

    /* renamed from: a */
    public final String f4147a;

    /* renamed from: b */
    public final String f4148b;

    /* renamed from: c */
    public final String f4149c;

    public C8466d(String hostnamePattern, String base64Hash) {
        Intrinsics.checkNotNullParameter(hostnamePattern, "hostnamePattern");
        Intrinsics.checkNotNullParameter(base64Hash, "base64Hash");
        this.f4147a = hostnamePattern;
        this.f4148b = base64Hash;
        this.f4149c = "sha256/" + m3821c();
    }

    @Override // com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.InterfaceC8463a
    /* renamed from: a */
    public String mo3814a() {
        return this.f4147a;
    }

    @Override // com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.InterfaceC8463a
    /* renamed from: b */
    public String mo3815b() {
        return this.f4149c;
    }

    /* renamed from: c */
    public String m3821c() {
        return this.f4148b;
    }
}
