package com.sdkit.paylib.paylibnative.p033ui.common.error;

import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.error.AbstractC8110d;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.a */
/* loaded from: classes8.dex */
public final class C8107a {

    /* renamed from: a */
    public final InternalPaylibRouter f1865a;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.a$a */
    public final class a {

        /* renamed from: a */
        public final AbstractC8110d f1866a;

        /* renamed from: b */
        public final EnumC8262b f1867b;

        /* renamed from: c */
        public final InterfaceC8112a f1868c;

        /* renamed from: d */
        public final /* synthetic */ C8107a f1869d;

        public a(C8107a c8107a, AbstractC8110d error, EnumC8262b screen, InterfaceC8112a interfaceC8112a) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.f1869d = c8107a;
            this.f1866a = error;
            this.f1867b = screen;
            this.f1868c = interfaceC8112a;
        }

        /* renamed from: a */
        public final void m1916a() {
            AbstractC8337a abstractC8337aM3454a = AbstractC8369f.m3454a((Throwable) null, (String) null, 1, (Object) null);
            C8261a c8261a = new C8261a(this.f1867b, AbstractC8369f.m3449a((Throwable) null, false, 1, (Object) null));
            EnumC8105d enumC8105dM3462c = AbstractC8369f.m3462c((Throwable) null);
            if (enumC8105dM3462c == null) {
                enumC8105dM3462c = EnumC8105d.UNHANDLED_FORM_ERROR;
            }
            this.f1869d.f1865a.mo2491a(new C8340d(null, abstractC8337aM3454a, c8261a, false, enumC8105dM3462c, this.f1868c, 9, null));
        }

        /* renamed from: b */
        public final void m1921b() {
            AbstractC8110d abstractC8110d = this.f1866a;
            if (abstractC8110d instanceof AbstractC8110d.a) {
                m1916a();
                return;
            }
            if (abstractC8110d instanceof AbstractC8110d.e) {
                m1920a((AbstractC8110d.e) abstractC8110d);
                return;
            }
            if (abstractC8110d instanceof AbstractC8110d.b) {
                m1917a((AbstractC8110d.b) abstractC8110d);
            } else if (abstractC8110d instanceof AbstractC8110d.c) {
                m1918a((AbstractC8110d.c) abstractC8110d);
            } else if (abstractC8110d instanceof AbstractC8110d.d) {
                m1919a((AbstractC8110d.d) abstractC8110d);
            }
        }

        /* renamed from: a */
        public final void m1917a(AbstractC8110d.b bVar) {
            this.f1869d.f1865a.mo2491a(new C8340d(null, new AbstractC8337a.a(AbstractC8108b.m1924c(bVar.m1929a()), null, null), new C8261a(EnumC8262b.NONE, bVar.m1930b() ? AbstractC8128b.i.f1941a : AbstractC8128b.a.f1932a), false, AbstractC8108b.m1925d(bVar.m1929a()), this.f1868c, 9, null));
        }

        /* renamed from: a */
        public final void m1918a(AbstractC8110d.c cVar) {
            this.f1869d.f1865a.mo2491a(new C8340d(null, AbstractC8369f.m3453a(AbstractC8369f.m3457a(cVar.m1931a().getPaymentStatus()), cVar.m1931a().getTraceId()), new C8261a(this.f1867b, cVar.m1932b() ? AbstractC8128b.i.f1941a : AbstractC8369f.m3463c(cVar.m1931a().getPaymentStatus())), false, AbstractC8369f.m3459b(cVar.m1931a().getPaymentStatus()), this.f1868c, 9, null));
        }

        /* renamed from: a */
        public final void m1919a(AbstractC8110d.d dVar) {
            AbstractC8128b abstractC8128bM3464c = AbstractC8369f.m3464c(dVar.m1933a().m2086a());
            InternalPaylibRouter internalPaylibRouter = this.f1869d.f1865a;
            AbstractC8337a abstractC8337aM3453a = AbstractC8369f.m3453a(AbstractC8369f.m3458a(dVar.m1933a().m2086a()), dVar.m1933a().m2087b());
            EnumC8262b enumC8262b = this.f1867b;
            if (dVar.m1934b()) {
                abstractC8128bM3464c = AbstractC8128b.i.f1941a;
            }
            internalPaylibRouter.mo2491a(new C8340d(null, abstractC8337aM3453a, new C8261a(enumC8262b, abstractC8128bM3464c), false, AbstractC8369f.m3460b(dVar.m1933a().m2086a()), this.f1868c, 9, null));
        }

        /* renamed from: a */
        public final void m1920a(AbstractC8110d.e eVar) {
            InternalPaylibRouter internalPaylibRouter = this.f1869d.f1865a;
            AbstractC8337a abstractC8337aM3454a = AbstractC8369f.m3454a(eVar.m1935a(), (String) null, 1, (Object) null);
            C8261a c8261a = new C8261a(this.f1867b, eVar.m1936b() ? AbstractC8128b.i.f1941a : AbstractC8369f.m3449a(eVar.m1935a(), false, 1, (Object) null));
            EnumC8105d enumC8105dM3462c = AbstractC8369f.m3462c(eVar.m1935a());
            if (enumC8105dM3462c == null) {
                enumC8105dM3462c = EnumC8105d.UNHANDLED_FORM_ERROR;
            }
            internalPaylibRouter.mo2491a(new C8340d(null, abstractC8337aM3454a, c8261a, false, enumC8105dM3462c, this.f1868c, 9, null));
        }
    }

    public C8107a(InternalPaylibRouter router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.f1865a = router;
    }

    /* renamed from: a */
    public final void m1915a(AbstractC8110d error, EnumC8262b screen, InterfaceC8112a interfaceC8112a) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(screen, "screen");
        new a(this, error, screen, interfaceC8112a).m1921b();
    }
}
