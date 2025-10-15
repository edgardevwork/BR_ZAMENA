package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.w0 */
/* loaded from: classes7.dex */
public final class C9941w0 implements InterfaceC8771Aa {
    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC8792B6
    /* renamed from: a */
    public final void mo4934a(int i, @NonNull Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4935a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    /* renamed from: a */
    public final void mo4936a(@NonNull AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    /* renamed from: a */
    public final void mo4937a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    /* renamed from: a */
    public final void mo4938a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    /* renamed from: a */
    public final void mo4939a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4941a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4942a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @NonNull
    /* renamed from: c */
    public final InterfaceC9138Pa mo4943c(@NonNull ReporterConfig reporterConfig) {
        return new C8803Bh();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @NonNull
    /* renamed from: d */
    public final C9280V9 mo4944d() {
        return new C9280V9();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    /* renamed from: e */
    public final void mo4945e() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @Nullable
    /* renamed from: f */
    public final String mo4946f() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @Nullable
    /* renamed from: h */
    public final Map<String, String> mo4947h() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @NonNull
    /* renamed from: i */
    public final AdvIdentifiersResult mo4948i() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @Nullable
    /* renamed from: j */
    public final C9378Zb mo4949j() {
        C9628jc c9628jc = new C9628jc();
        return new C9378Zb(c9628jc, new C8768A7(c9628jc));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void setUserProfileID(@Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    /* renamed from: a */
    public final void mo4940a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9185Ra
    @NonNull
    /* renamed from: a */
    public final InterfaceC9162Qa mo4933a() {
        return new C8878Eh();
    }
}
