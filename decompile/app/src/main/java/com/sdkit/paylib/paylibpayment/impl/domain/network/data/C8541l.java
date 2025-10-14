package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.l */
/* loaded from: classes6.dex */
public final class C8541l implements InterfaceC8540k {

    /* renamed from: a */
    public final C8542m f4959a;

    public C8541l(C8542m c8542m) {
        this.f4959a = c8542m;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.data.InterfaceC8540k
    /* renamed from: a */
    public C8539j mo4085a() {
        return this.f4959a.m4089a();
    }

    /* renamed from: a */
    public static Provider m4086a(C8542m c8542m) {
        return InstanceFactory.create(new C8541l(c8542m));
    }
}
