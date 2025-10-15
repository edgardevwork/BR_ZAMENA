package com.sdkit.paylib.paylibnative.p033ui.deviceauth;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.d */
/* loaded from: classes6.dex */
public final class C8209d implements Factory {

    /* renamed from: a */
    public final Provider f2290a;

    /* renamed from: b */
    public final Provider f2291b;

    public C8209d(Provider provider, Provider provider2) {
        this.f2290a = provider;
        this.f2291b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8208c get() {
        return m2183a((DeviceAuthDelegate) this.f2290a.get(), (PaylibLoggerFactory) this.f2291b.get());
    }

    /* renamed from: a */
    public static C8208c m2183a(DeviceAuthDelegate deviceAuthDelegate, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8208c(deviceAuthDelegate, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8209d m2184a(Provider provider, Provider provider2) {
        return new C8209d(provider, provider2);
    }
}
