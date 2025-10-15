package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ka */
/* loaded from: classes6.dex */
public final class C9651ka implements InterfaceC10010yj {
    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
