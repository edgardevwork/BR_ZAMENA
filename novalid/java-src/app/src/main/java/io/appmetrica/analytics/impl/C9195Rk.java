package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: io.appmetrica.analytics.impl.Rk */
/* loaded from: classes6.dex */
public final class C9195Rk implements InterfaceC8792B6 {

    /* renamed from: a */
    public final /* synthetic */ StartupParamsCallback f7211a;

    /* renamed from: b */
    public final /* synthetic */ C9219Sk f7212b;

    public C9195Rk(C9219Sk c9219Sk, StartupParamsCallback startupParamsCallback) {
        this.f7212b = c9219Sk;
        this.f7211a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8792B6
    /* renamed from: a */
    public final void mo4934a(int i, Bundle bundle) {
        this.f7212b.m5592b(bundle, this.f7211a);
    }
}
