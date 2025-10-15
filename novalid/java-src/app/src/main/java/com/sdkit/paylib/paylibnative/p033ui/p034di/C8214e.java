package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.config.AbstractC8130a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.e */
/* loaded from: classes8.dex */
public final class C8214e {

    /* renamed from: a */
    public static final C8214e f2381a = new C8214e();

    /* renamed from: a */
    public final PaylibHostRouter m2226a(InterfaceC8134e paylibNativeDependenciesWrapper) {
        Intrinsics.checkNotNullParameter(paylibNativeDependenciesWrapper, "paylibNativeDependenciesWrapper");
        AbstractC8130a abstractC8130aMo2018a = paylibNativeDependenciesWrapper.mo2018a();
        AbstractC8130a.b bVar = abstractC8130aMo2018a instanceof AbstractC8130a.b ? (AbstractC8130a.b) abstractC8130aMo2018a : null;
        if (bVar != null) {
            return bVar.m2005a();
        }
        return null;
    }

    /* renamed from: a */
    public final C8241o m2227a() {
        return new C8241o();
    }
}
