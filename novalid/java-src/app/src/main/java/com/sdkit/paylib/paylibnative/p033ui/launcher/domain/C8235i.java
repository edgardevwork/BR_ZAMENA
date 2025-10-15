package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.paylibnative.api.entity.PaylibResult;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultUnknown;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8368e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.i */
/* loaded from: classes8.dex */
public final class C8235i {

    /* renamed from: a */
    public final InterfaceC8238l f2466a;

    public C8235i(InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f2466a = paylibStateManager;
    }

    /* renamed from: a */
    public final PaylibResult m2290a(AbstractC8237k.a aVar, Function0 function0) {
        PaylibResultCase paylibResultCaseM3445a;
        EnumC8105d enumC8105d;
        String strM2299a;
        String strM2306d;
        String strM2305c;
        if (aVar instanceof AbstractC8237k.a.e) {
            paylibResultCaseM3445a = AbstractC8368e.m3445a(aVar.mo2298a().m2299a(), (String) null, (String) null, (Integer) null);
        } else {
            if (aVar instanceof AbstractC8237k.a.d) {
                enumC8105d = (EnumC8105d) function0.invoke();
                strM2299a = aVar.mo2298a().m2299a();
                AbstractC8237k.a.d dVar = (AbstractC8237k.a.d) aVar;
                strM2306d = dVar.m2308c();
                strM2305c = dVar.m2307b();
            } else if (aVar instanceof AbstractC8237k.a.c) {
                enumC8105d = (EnumC8105d) function0.invoke();
                strM2299a = aVar.mo2298a().m2299a();
                AbstractC8237k.a.c cVar = (AbstractC8237k.a.c) aVar;
                strM2306d = cVar.m2306d();
                strM2305c = cVar.m2305c();
            } else {
                if (!(aVar instanceof AbstractC8237k.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM2299a2 = aVar.mo2298a().m2299a();
                AbstractC8237k.a.b bVar = (AbstractC8237k.a.b) aVar;
                paylibResultCaseM3445a = AbstractC8368e.m3445a(strM2299a2, bVar.m2303d(), bVar.m2302c(), bVar.m2301b());
            }
            paylibResultCaseM3445a = AbstractC8368e.m3441a(enumC8105d, strM2299a, strM2306d, strM2305c);
        }
        return new PaylibResultPayment.Application(paylibResultCaseM3445a);
    }

    /* renamed from: a */
    public final PaylibResult m2291a(AbstractC8237k.e eVar, Function0 function0) {
        PaylibResultCase paylibResultCaseM3443a;
        if (eVar instanceof AbstractC8237k.e.d ? true : eVar instanceof AbstractC8237k.e.b) {
            paylibResultCaseM3443a = AbstractC8368e.m3439a((EnumC8105d) function0.invoke(), eVar.mo2309a().m2311a());
        } else {
            if (!(eVar instanceof AbstractC8237k.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            paylibResultCaseM3443a = AbstractC8368e.m3443a(eVar.mo2309a().m2311a());
        }
        return new PaylibResultPayment.Invoice(paylibResultCaseM3443a);
    }

    /* renamed from: a */
    public final PaylibResult m2292a(AbstractC8237k.f fVar, Function0 function0) {
        PaylibResultCase paylibResultCaseM3444a;
        EnumC8105d enumC8105d;
        String strM2318d;
        String strM2317c;
        if (fVar instanceof AbstractC8237k.f.e) {
            paylibResultCaseM3444a = AbstractC8368e.m3444a((String) null, (String) null, (Integer) null);
        } else {
            if (fVar instanceof AbstractC8237k.f.c) {
                enumC8105d = (EnumC8105d) function0.invoke();
                AbstractC8237k.f.c cVar = (AbstractC8237k.f.c) fVar;
                strM2318d = cVar.m2320c();
                strM2317c = cVar.m2319b();
            } else if (fVar instanceof AbstractC8237k.f.b) {
                enumC8105d = (EnumC8105d) function0.invoke();
                AbstractC8237k.f.b bVar = (AbstractC8237k.f.b) fVar;
                strM2318d = bVar.m2318d();
                strM2317c = bVar.m2317c();
            } else {
                if (!(fVar instanceof AbstractC8237k.f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8237k.f.a aVar = (AbstractC8237k.f.a) fVar;
                paylibResultCaseM3444a = AbstractC8368e.m3444a(aVar.m2315d(), aVar.m2314c(), aVar.m2313b());
            }
            paylibResultCaseM3444a = AbstractC8368e.m3440a(enumC8105d, strM2318d, strM2317c);
        }
        return new PaylibResultPayment.PaymentMethodChange(paylibResultCaseM3444a);
    }

    /* renamed from: a */
    public final PaylibResult m2293a(AbstractC8237k.g gVar, Function0 function0) {
        String strM2327d;
        String strM2326c;
        String strM2340b;
        Integer numM2342d;
        String strM2341c;
        Integer numM2325b;
        EnumC8105d enumC8105d;
        String strM2340b2;
        String strM2332d;
        String strM2341c2;
        String strM2331c;
        PaylibResultCase paylibResultCaseM3442a;
        if (!(gVar instanceof AbstractC8237k.g.e)) {
            if (gVar instanceof AbstractC8237k.g.c) {
                enumC8105d = (EnumC8105d) function0.invoke();
                strM2340b2 = gVar.mo2322a().m2340b();
                AbstractC8237k.g.c cVar = (AbstractC8237k.g.c) gVar;
                strM2332d = cVar.m2336c();
                strM2341c2 = gVar.mo2322a().m2341c();
                strM2331c = cVar.m2335b();
            } else if (gVar instanceof AbstractC8237k.g.b) {
                enumC8105d = (EnumC8105d) function0.invoke();
                strM2340b2 = gVar.mo2322a().m2340b();
                AbstractC8237k.g.b bVar = (AbstractC8237k.g.b) gVar;
                strM2332d = bVar.m2332d();
                strM2341c2 = gVar.mo2322a().m2341c();
                strM2331c = bVar.m2331c();
            } else {
                if (!(gVar instanceof AbstractC8237k.g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC8237k.g.a aVar = (AbstractC8237k.g.a) gVar;
                strM2327d = aVar.m2327d();
                strM2326c = aVar.m2326c();
                strM2340b = gVar.mo2322a().m2340b();
                numM2342d = gVar.mo2322a().m2342d();
                strM2341c = gVar.mo2322a().m2341c();
                numM2325b = aVar.m2325b();
            }
            paylibResultCaseM3442a = AbstractC8368e.m3442a(enumC8105d, strM2340b2, strM2332d, strM2341c2, strM2331c);
            return new PaylibResultPayment.Product(paylibResultCaseM3442a);
        }
        strM2340b = gVar.mo2322a().m2340b();
        numM2342d = gVar.mo2322a().m2342d();
        strM2341c = gVar.mo2322a().m2341c();
        strM2326c = null;
        numM2325b = null;
        strM2327d = null;
        paylibResultCaseM3442a = AbstractC8368e.m3446a(strM2327d, strM2326c, strM2340b, numM2342d, strM2341c, numM2325b);
        return new PaylibResultPayment.Product(paylibResultCaseM3442a);
    }

    /* renamed from: a */
    public final PaylibResult m2294a(Function0 resolveFinishCode) {
        Intrinsics.checkNotNullParameter(resolveFinishCode, "resolveFinishCode");
        AbstractC8237k abstractC8237kMo2351c = this.f2466a.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.e) {
            return m2291a((AbstractC8237k.e) abstractC8237kMo2351c, resolveFinishCode);
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.g) {
            return m2293a((AbstractC8237k.g) abstractC8237kMo2351c, resolveFinishCode);
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.a) {
            return m2290a((AbstractC8237k.a) abstractC8237kMo2351c, resolveFinishCode);
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.f) {
            return m2292a((AbstractC8237k.f) abstractC8237kMo2351c, resolveFinishCode);
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d) {
            return PaylibResultUnknown.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
