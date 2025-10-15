package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.yf */
/* loaded from: classes5.dex */
public final class C10006yf implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9023Kf f9366a;

    /* renamed from: b */
    public final /* synthetic */ C8776Af f9367b;

    public C10006yf(C8776Af c8776Af, InterfaceC9023Kf interfaceC9023Kf) {
        this.f9367b = c8776Af;
        this.f9366a = interfaceC9023Kf;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = this.f9367b.f6325a.getInstallReferrer();
                this.f9367b.f6326b.execute(new RunnableC9981xf(this, new C8901Ff(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC8876Ef.f6549c)));
            } catch (Throwable th) {
                this.f9367b.f6326b.execute(new RunnableC10031zf(this.f9366a, th));
            }
        } else {
            this.f9367b.f6326b.execute(new RunnableC10031zf(this.f9366a, new IllegalStateException("Referrer check failed with error " + i)));
        }
        try {
            this.f9367b.f6325a.endConnection();
        } catch (Throwable unused) {
        }
    }
}
