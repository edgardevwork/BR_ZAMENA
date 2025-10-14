package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.h */
/* loaded from: classes6.dex */
public final class C8234h implements Factory {

    /* renamed from: a */
    public final Provider f2465a;

    public C8234h(Provider provider) {
        this.f2465a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8233g get() {
        return m2287a((PaylibLoggerFactory) this.f2465a.get());
    }

    /* renamed from: a */
    public static C8233g m2287a(PaylibLoggerFactory paylibLoggerFactory) {
        return new C8233g(paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8234h m2288a(Provider provider) {
        return new C8234h(provider);
    }
}
