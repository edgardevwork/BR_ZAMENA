package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Aa */
/* loaded from: classes7.dex */
public interface InterfaceC8771Aa extends InterfaceC9878tc, InterfaceC8792B6, InterfaceC9185Ra {
    @Override // io.appmetrica.analytics.impl.InterfaceC9185Ra
    @NonNull
    /* renamed from: a */
    /* synthetic */ InterfaceC9162Qa mo4933a();

    @Override // io.appmetrica.analytics.impl.InterfaceC8792B6
    /* renamed from: a */
    /* synthetic */ void mo4934a(int i, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    /* synthetic */ void mo4935a(@Nullable Location location);

    @WorkerThread
    /* renamed from: a */
    void mo4936a(@NonNull AppMetricaConfig appMetricaConfig);

    @WorkerThread
    /* renamed from: a */
    void mo4937a(DeferredDeeplinkListener deferredDeeplinkListener);

    @WorkerThread
    /* renamed from: a */
    void mo4938a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    @WorkerThread
    /* renamed from: a */
    void mo4939a(@NonNull ReporterConfig reporterConfig);

    @WorkerThread
    /* renamed from: a */
    void mo4940a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    /* synthetic */ void mo4941a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    /* synthetic */ void mo4942a(boolean z);

    @NonNull
    @WorkerThread
    /* renamed from: c */
    InterfaceC9138Pa mo4943c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    @AnyThread
    /* renamed from: d */
    C9280V9 mo4944d();

    @WorkerThread
    /* renamed from: e */
    void mo4945e();

    @Nullable
    @AnyThread
    /* renamed from: f */
    String mo4946f();

    @Nullable
    @AnyThread
    /* renamed from: h */
    Map<String, String> mo4947h();

    @NonNull
    @AnyThread
    /* renamed from: i */
    AdvIdentifiersResult mo4948i();

    @Nullable
    @AnyThread
    /* renamed from: j */
    C9378Zb mo4949j();

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* synthetic */ void setDataSendingEnabled(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* synthetic */ void setUserProfileID(@Nullable String str);
}
