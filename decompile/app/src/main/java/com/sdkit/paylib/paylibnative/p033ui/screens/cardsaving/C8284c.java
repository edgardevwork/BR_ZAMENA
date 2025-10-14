package com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving;

import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8265e;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.c */
/* loaded from: classes5.dex */
public final class C8284c extends AbstractC8129a {

    /* renamed from: b */
    public final InternalPaylibRouter f2958b;

    /* renamed from: c */
    public final InterfaceC8097f f2959c;

    /* renamed from: d */
    public final InterfaceC8131b f2960d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.c$a */
    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8286e invoke(C8286e reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8286e.m2715a(reduceState, false, C8284c.this.f2960d.isSandbox(), 1, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.c$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2962a;

        static {
            int[] iArr = new int[EnumC8265e.values().length];
            try {
                iArr[EnumC8265e.CARDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8265e.INVOICE_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2962a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.c$c */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: a */
        public static final c f2963a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8286e invoke(C8286e reduceState) {
            Intrinsics.checkNotNullParameter(reduceState, "$this$reduceState");
            return C8286e.m2715a(reduceState, true, false, 2, null);
        }
    }

    public C8284c(InternalPaylibRouter router, InterfaceC8097f analytics, InterfaceC8131b config) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f2958b = router;
        this.f2959c = analytics;
        this.f2960d = config;
        m2000a(new a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8286e mo1999a() {
        return new C8286e(false, false);
    }

    /* renamed from: e */
    public final void m2707e() {
        AbstractC8096e.m1799a(this.f2959c, false);
        m2709g();
        this.f2958b.mo2493a(new C8357a(false, false, null, false));
    }

    /* renamed from: f */
    public final void m2708f() {
        AbstractC8096e.m1799a(this.f2959c, true);
        m2709g();
        this.f2958b.mo2493a(new C8357a(true, false, null, false));
    }

    /* renamed from: g */
    public final void m2709g() {
        m2000a(c.f2963a);
    }

    /* renamed from: a */
    public final void m2705a(EnumC8265e enumC8265e) {
        int i = enumC8265e == null ? -1 : b.f2962a[enumC8265e.ordinal()];
        if (i == 1) {
            InternalPaylibRouter.DefaultImpls.pushCardsScreen$default(this.f2958b, null, 1, null);
        } else if (i != 2) {
            this.f2958b.mo2485a();
        } else {
            InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(this.f2958b, null, 1, null);
        }
    }
}
