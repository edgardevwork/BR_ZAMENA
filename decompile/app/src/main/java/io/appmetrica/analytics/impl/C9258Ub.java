package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.Ub */
/* loaded from: classes5.dex */
public final class C9258Ub extends AbstractC9293Vm {

    /* renamed from: b */
    public final AppMetricaConfig f7326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9258Ub(@NonNull InterfaceC9185Ra interfaceC9185Ra, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC9185Ra);
        String str = appMetricaConfig.apiKey;
        this.f7326b = appMetricaConfig;
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC9209Sa m5671a() {
        return this.f7379a.mo4933a().mo5079b(this.f7326b);
    }
}
