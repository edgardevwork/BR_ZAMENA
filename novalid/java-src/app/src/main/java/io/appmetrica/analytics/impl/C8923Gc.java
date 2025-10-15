package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Gc */
/* loaded from: classes7.dex */
public final class C8923Gc implements ModuleEventServiceHandlerReporter {

    /* renamed from: a */
    public final C9625j9 f6663a;

    /* renamed from: b */
    public final C9252U5 f6664b;

    public C8923Gc(@NotNull C9625j9 c9625j9, @NotNull C9252U5 c9252u5) {
        this.f6663a = c9625j9;
        this.f6664b = c9252u5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        C9252U5 c9252u5M5643d = C9252U5.m5643d(this.f6664b);
        c9252u5M5643d.f7312d = counterReportApi.getType();
        c9252u5M5643d.f7313e = counterReportApi.getCustomType();
        c9252u5M5643d.setName(counterReportApi.getName());
        c9252u5M5643d.setValue(counterReportApi.getValue());
        c9252u5M5643d.setValueBytes(counterReportApi.getValueBytes());
        c9252u5M5643d.f7315g = counterReportApi.getBytesTruncated();
        C9625j9 c9625j9 = this.f6663a;
        c9625j9.m6308a(c9252u5M5643d, C9338Xj.m5752a(c9625j9.f8421c.m5756b(c9252u5M5643d), c9252u5M5643d.f7317i));
    }
}
