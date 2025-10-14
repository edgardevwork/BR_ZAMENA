package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Qa */
/* loaded from: classes6.dex */
public interface InterfaceC9162Qa extends InterfaceC9185Ra {
    @NonNull
    @WorkerThread
    /* renamed from: a */
    InterfaceC8921Ga mo5074a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC9185Ra
    @NonNull
    /* renamed from: a */
    /* synthetic */ InterfaceC9162Qa mo4933a();

    /* renamed from: a */
    void mo5075a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    @WorkerThread
    /* renamed from: b */
    InterfaceC8921Ga mo5077b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z);

    @NonNull
    /* renamed from: b */
    InterfaceC9138Pa mo5078b(@NonNull ReporterConfig reporterConfig);

    @NonNull
    /* renamed from: b */
    InterfaceC9209Sa mo5079b(@NonNull AppMetricaConfig appMetricaConfig);
}
