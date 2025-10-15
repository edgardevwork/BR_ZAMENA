package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformDependencies;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.i */
/* loaded from: classes5.dex */
public final class C8602i implements Factory {

    /* renamed from: a */
    public final C8596c f5866a;

    /* renamed from: b */
    public final Provider f5867b;

    public C8602i(C8596c c8596c, Provider provider) {
        this.f5866a = c8596c;
        this.f5867b = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaylibPlatformTools get() {
        return m4700a(this.f5866a, (PaylibPlatformDependencies) this.f5867b.get());
    }

    /* renamed from: a */
    public static PaylibPlatformTools m4700a(C8596c c8596c, PaylibPlatformDependencies paylibPlatformDependencies) {
        return (PaylibPlatformTools) Preconditions.checkNotNullFromProvides(c8596c.m4684a(paylibPlatformDependencies));
    }

    /* renamed from: a */
    public static C8602i m4701a(C8596c c8596c, Provider provider) {
        return new C8602i(c8596c, provider);
    }
}
