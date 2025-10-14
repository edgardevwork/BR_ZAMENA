package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.e */
/* loaded from: classes5.dex */
public final class C8598e implements Factory {

    /* renamed from: a */
    public final C8596c f5848a;

    /* renamed from: b */
    public final Provider f5849b;

    public C8598e(C8596c c8596c, Provider provider) {
        this.f5848a = c8596c;
        this.f5849b = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaylibLoggingTools get() {
        return m4688a(this.f5848a, (PaylibLoggingDependencies) this.f5849b.get());
    }

    /* renamed from: a */
    public static PaylibLoggingTools m4688a(C8596c c8596c, PaylibLoggingDependencies paylibLoggingDependencies) {
        return (PaylibLoggingTools) Preconditions.checkNotNullFromProvides(c8596c.m4680a(paylibLoggingDependencies));
    }

    /* renamed from: a */
    public static C8598e m4689a(C8596c c8596c, Provider provider) {
        return new C8598e(c8596c, provider);
    }
}
