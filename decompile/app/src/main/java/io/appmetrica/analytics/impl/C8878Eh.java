package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Eh */
/* loaded from: classes8.dex */
public final class C8878Eh implements InterfaceC9162Qa {
    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa, io.appmetrica.analytics.impl.InterfaceC9185Ra
    @NonNull
    /* renamed from: a */
    public final InterfaceC9162Qa mo4933a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    /* renamed from: a */
    public final void mo5075a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NonNull
    /* renamed from: b */
    public final InterfaceC8921Ga mo5077b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z) {
        return new C9628jc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NonNull
    /* renamed from: b */
    public final InterfaceC9138Pa mo5078b(@NonNull ReporterConfig reporterConfig) {
        return new C8803Bh();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NonNull
    /* renamed from: a */
    public final InterfaceC8921Ga mo5074a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z) {
        return new C9628jc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NonNull
    /* renamed from: b */
    public final InterfaceC9209Sa mo5079b(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C8803Bh();
    }
}
