package com.sdkit.paylib.paylibnative.p033ui.launcher;

import android.content.Context;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.AbstractC8130a;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.b */
/* loaded from: classes6.dex */
public final class C8224b implements Factory {

    /* renamed from: a */
    public final Provider f2403a;

    /* renamed from: b */
    public final Provider f2404b;

    /* renamed from: c */
    public final Provider f2405c;

    /* renamed from: d */
    public final Provider f2406d;

    public C8224b(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f2403a = provider;
        this.f2404b = provider2;
        this.f2405c = provider3;
        this.f2406d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8223a get() {
        return m2249a((Context) this.f2403a.get(), (FinishCodeReceiver) this.f2404b.get(), (AbstractC8130a) this.f2405c.get(), (PaylibLoggerFactory) this.f2406d.get());
    }

    /* renamed from: a */
    public static C8223a m2249a(Context context, FinishCodeReceiver finishCodeReceiver, AbstractC8130a abstractC8130a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8223a(context, finishCodeReceiver, abstractC8130a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8224b m2250a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8224b(provider, provider2, provider3, provider4);
    }
}
