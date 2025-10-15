package com.sdkit.paylib.paylibnetwork.impl.p036di;

import android.content.Context;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.d */
/* loaded from: classes6.dex */
public final class C8458d implements Factory {

    /* renamed from: a */
    public final Provider f4131a;

    /* renamed from: b */
    public final Provider f4132b;

    public C8458d(Provider provider, Provider provider2) {
        this.f4131a = provider;
        this.f4132b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public WebViewCertificateVerifier get() {
        return m3804a((Context) this.f4131a.get(), (PaylibLoggerFactory) this.f4132b.get());
    }

    /* renamed from: a */
    public static WebViewCertificateVerifier m3804a(Context context, PaylibLoggerFactory paylibLoggerFactory) {
        return (WebViewCertificateVerifier) Preconditions.checkNotNullFromProvides(C8457c.f4130a.m3802a(context, paylibLoggerFactory));
    }

    /* renamed from: a */
    public static C8458d m3805a(Provider provider, Provider provider2) {
        return new C8458d(provider, provider2);
    }
}
