package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.de */
/* loaded from: classes6.dex */
public final class RunnableC9480de implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f7952a;

    /* renamed from: b */
    public final /* synthetic */ C9555ge f7953b;

    public RunnableC9480de(C9555ge c9555ge, PluginErrorDetails pluginErrorDetails) {
        this.f7953b = c9555ge;
        this.f7952a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC9138Pa) this.f7953b.f8199d.get()).getPluginExtension().reportUnhandledException(this.f7952a);
    }
}
