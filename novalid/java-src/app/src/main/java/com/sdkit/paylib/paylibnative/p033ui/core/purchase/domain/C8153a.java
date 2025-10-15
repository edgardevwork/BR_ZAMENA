package com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain;

import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8158a;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8160c;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.InterfaceC8159b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.domain.a */
/* loaded from: classes8.dex */
public final class C8153a {

    /* renamed from: a */
    public final InterfaceC8238l f2046a;

    public C8153a(InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f2046a = paylibStateManager;
    }

    /* renamed from: a */
    public final InterfaceC8159b m2069a() {
        AbstractC8237k abstractC8237kMo2351c = this.f2046a.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.g) {
            AbstractC8237k.g gVar = (AbstractC8237k.g) abstractC8237kMo2351c;
            return new C8160c(gVar.mo2322a().m2341c(), gVar.mo2322a().m2340b(), gVar.mo2322a().m2342d(), gVar.mo2322a().m2339a());
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.a) {
            AbstractC8237k.a aVar = (AbstractC8237k.a) abstractC8237kMo2351c;
            return new C8158a(aVar.mo2298a().m2299a(), aVar.mo2298a().m2300b());
        }
        if (abstractC8237kMo2351c instanceof AbstractC8237k.f ? true : abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
