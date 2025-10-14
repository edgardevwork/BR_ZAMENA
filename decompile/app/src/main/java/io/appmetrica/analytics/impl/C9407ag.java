package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.ag */
/* loaded from: classes5.dex */
public final class C9407ag implements InterfaceC9124Ok {

    /* renamed from: a */
    public final C8907Fl f7722a;

    public C9407ag(@NonNull C8907Fl c8907Fl) {
        this.f7722a = c8907Fl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9124Ok
    /* renamed from: a */
    public final void mo5467a() {
        NetworkTask networkTaskM5199c = this.f7722a.m5199c();
        if (networkTaskM5199c != null) {
            C9676la.f8552C.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskM5199c);
        }
    }
}
