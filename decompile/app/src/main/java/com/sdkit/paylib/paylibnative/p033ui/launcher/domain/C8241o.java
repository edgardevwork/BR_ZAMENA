package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.o */
/* loaded from: classes8.dex */
public final class C8241o {

    /* renamed from: a */
    public a f2527a;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.o$a */
    public interface a {
        /* renamed from: a */
        void mo2263a();
    }

    /* renamed from: a */
    public final void m2360a() {
        a aVar = this.f2527a;
        if (aVar != null) {
            aVar.mo2263a();
        }
    }

    /* renamed from: a */
    public final void m2361a(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f2527a = listener;
    }
}
