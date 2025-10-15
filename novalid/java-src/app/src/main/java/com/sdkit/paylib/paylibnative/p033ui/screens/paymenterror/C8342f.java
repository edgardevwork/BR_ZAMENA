package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.f */
/* loaded from: classes5.dex */
public final class C8342f extends AbstractC8129a {

    /* renamed from: b */
    public final InterfaceC8097f f3479b;

    /* renamed from: c */
    public final FinishCodeReceiver f3480c;

    /* renamed from: d */
    public final InternalPaylibRouter f3481d;

    /* renamed from: e */
    public final InterfaceC8093b f3482e;

    /* renamed from: f */
    public final InterfaceC8131b f3483f;

    /* renamed from: g */
    public final InterfaceC8238l f3484g;

    /* renamed from: h */
    public EnumC8105d f3485h;

    /* renamed from: i */
    public C8261a f3486i;

    /* renamed from: j */
    public InterfaceC8112a f3487j;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f3488a;

        /* renamed from: b */
        public final /* synthetic */ C8342f f3489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C8342f c8342f) {
            super(1);
            this.f3488a = str;
            this.f3489b = c8342f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8344h invoke(C8344h reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            String str = this.f3488a;
            return reduceState.m3257a(str, true ^ (str == null || str.length() == 0), this.f3489b.f3483f.isSandbox());
        }
    }

    public C8342f(InterfaceC8097f analytics, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter router, InterfaceC8093b paymentMethodProvider, InterfaceC8131b config, InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(paymentMethodProvider, "paymentMethodProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f3479b = analytics;
        this.f3480c = finishCodeReceiver;
        this.f3481d = router;
        this.f3482e = paymentMethodProvider;
        this.f3483f = config;
        this.f3484g = paylibStateManager;
    }

    /* renamed from: d */
    public final void m3249d() {
        C8261a c8261a = this.f3486i;
        C8261a c8261a2 = null;
        if (c8261a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorAction");
            c8261a = null;
        }
        if (Intrinsics.areEqual(c8261a.m2502a(), AbstractC8128b.h.f1940a)) {
            AbstractC8096e.m1823w(this.f3479b);
        }
        InternalPaylibRouter internalPaylibRouter = this.f3481d;
        C8261a c8261a3 = this.f3486i;
        if (c8261a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorAction");
        } else {
            c8261a2 = c8261a3;
        }
        internalPaylibRouter.mo2488a(c8261a2, this.f3487j);
    }

    /* renamed from: e */
    public final void m3250e() {
        InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(this.f3481d, null, 1, null);
    }

    /* renamed from: f */
    public final void m3251f() {
        AbstractC8096e.m1792a(this.f3479b, this.f3484g.mo2350b(), this.f3482e.getPaymentMethod());
        this.f3480c.mo2267a(this.f3485h);
        this.f3481d.mo2485a();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C8344h mo1999a() {
        return new C8344h(null, false, false);
    }

    /* renamed from: a */
    public final void m3248a(C8340d parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f3485h = parameters.m3239d();
        this.f3486i = parameters.m3236a();
        this.f3487j = parameters.m3241f();
        String strMo3206b = parameters.m3238c().mo3206b();
        AbstractC8096e.m1794a(this.f3479b, parameters.m3238c().mo3205a(), strMo3206b);
        m2000a(new a(strMo3206b, this));
    }
}
