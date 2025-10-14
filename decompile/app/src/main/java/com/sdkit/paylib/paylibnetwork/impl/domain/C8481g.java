package com.sdkit.paylib.paylibnetwork.impl.domain;

import android.content.Context;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.g */
/* loaded from: classes6.dex */
public final class C8481g implements Factory {

    /* renamed from: a */
    public final Provider f4185a;

    /* renamed from: b */
    public final Provider f4186b;

    public C8481g(Provider provider, Provider provider2) {
        this.f4185a = provider;
        this.f4186b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8480f get() {
        return m3858a((Context) this.f4185a.get(), (PaylibLoggerFactory) this.f4186b.get());
    }

    /* renamed from: a */
    public static C8480f m3858a(Context context, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8480f(context, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8481g m3859a(Provider provider, Provider provider2) {
        return new C8481g(provider, provider2);
    }
}
