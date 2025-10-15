package com.sdkit.paylib.paylibnative.p033ui.screens.loading;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.models.InterfaceC8163a;
import com.sdkit.paylib.paylibnative.p033ui.core.sbolpay.SbolPayDeeplinkResolver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8229c;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.c */
/* loaded from: classes7.dex */
public final class C8312c implements Factory {

    /* renamed from: a */
    public final Provider f3207a;

    /* renamed from: b */
    public final Provider f3208b;

    /* renamed from: c */
    public final Provider f3209c;

    /* renamed from: d */
    public final Provider f3210d;

    /* renamed from: e */
    public final Provider f3211e;

    /* renamed from: f */
    public final Provider f3212f;

    /* renamed from: g */
    public final Provider f3213g;

    /* renamed from: h */
    public final Provider f3214h;

    /* renamed from: i */
    public final Provider f3215i;

    /* renamed from: j */
    public final Provider f3216j;

    public C8312c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f3207a = provider;
        this.f3208b = provider2;
        this.f3209c = provider3;
        this.f3210d = provider4;
        this.f3211e = provider5;
        this.f3212f = provider6;
        this.f3213g = provider7;
        this.f3214h = provider8;
        this.f3215i = provider9;
        this.f3216j = provider10;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoadingViewModel get() {
        return m2950a((InvoiceHolder) this.f3207a.get(), (C8229c) this.f3208b.get(), (InterfaceC8163a) this.f3209c.get(), (FinishCodeReceiver) this.f3210d.get(), (InterfaceC8238l) this.f3211e.get(), (InternalPaylibRouter) this.f3212f.get(), (InterfaceC8131b) this.f3213g.get(), (SbolPayDeeplinkResolver) this.f3214h.get(), (SubscriptionsInteractor) this.f3215i.get(), (PaylibLoggerFactory) this.f3216j.get());
    }

    /* renamed from: a */
    public static LoadingViewModel m2950a(InvoiceHolder invoiceHolder, C8229c c8229c, InterfaceC8163a interfaceC8163a, FinishCodeReceiver finishCodeReceiver, InterfaceC8238l interfaceC8238l, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, SbolPayDeeplinkResolver sbolPayDeeplinkResolver, SubscriptionsInteractor subscriptionsInteractor, PaylibLoggerFactory paylibLoggerFactory) {
        return new LoadingViewModel(invoiceHolder, c8229c, interfaceC8163a, finishCodeReceiver, interfaceC8238l, internalPaylibRouter, interfaceC8131b, sbolPayDeeplinkResolver, subscriptionsInteractor, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8312c m2951a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new C8312c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
