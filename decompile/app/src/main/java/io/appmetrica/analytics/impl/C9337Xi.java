package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.Xi */
/* loaded from: classes5.dex */
public final class C9337Xi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ ModuleEvent f7531a;

    public C9337Xi(ModuleEvent moduleEvent) {
        this.f7531a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportEvent(this.f7531a);
    }
}
