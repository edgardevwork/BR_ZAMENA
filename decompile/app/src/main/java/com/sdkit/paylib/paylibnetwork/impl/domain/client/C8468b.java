package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.b */
/* loaded from: classes6.dex */
public final class C8468b implements InterfaceC8467a {

    /* renamed from: a */
    public final C8475i f4150a;

    public C8468b(C8475i c8475i) {
        this.f4150a = c8475i;
    }

    /* renamed from: a */
    public static Provider m3822a(C8475i c8475i) {
        return InstanceFactory.create(new C8468b(c8475i));
    }

    @Override // com.sdkit.paylib.paylibnetwork.impl.domain.client.InterfaceC8467a
    public C8473g create(WebClientConfig webClientConfig) {
        return this.f4150a.m3837a(webClientConfig);
    }
}
