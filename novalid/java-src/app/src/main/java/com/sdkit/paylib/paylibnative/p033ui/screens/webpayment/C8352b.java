package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.b */
/* loaded from: classes7.dex */
public final class C8352b implements Factory {

    /* renamed from: a */
    public final Provider f3590a;

    /* renamed from: b */
    public final Provider f3591b;

    /* renamed from: c */
    public final Provider f3592c;

    /* renamed from: d */
    public final Provider f3593d;

    public C8352b(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f3590a = provider;
        this.f3591b = provider2;
        this.f3592c = provider3;
        this.f3593d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8351a get() {
        return m3349a((AbstractC8258f) this.f3590a.get(), (C8103b) this.f3591b.get(), (WebViewCertificateVerifier) this.f3592c.get(), (PaylibLoggerFactory) this.f3593d.get());
    }

    /* renamed from: a */
    public static C8351a m3349a(AbstractC8258f abstractC8258f, C8103b c8103b, WebViewCertificateVerifier webViewCertificateVerifier, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8351a(abstractC8258f, c8103b, webViewCertificateVerifier, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8352b m3350a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8352b(provider, provider2, provider3, provider4);
    }
}
