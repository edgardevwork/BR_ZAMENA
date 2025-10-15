package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClient;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.h */
/* loaded from: classes6.dex */
public final class C8474h implements WebClientFactory {

    /* renamed from: a */
    public final InterfaceC8467a f4165a;

    public C8474h(InterfaceC8467a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f4165a = factory;
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory
    public WebClient create(WebClientConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return this.f4165a.create(config);
    }
}
