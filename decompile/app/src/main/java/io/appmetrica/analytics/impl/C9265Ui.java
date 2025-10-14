package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Ui */
/* loaded from: classes5.dex */
public final class C9265Ui implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f7339a;

    public C9265Ui(PluginErrorDetails pluginErrorDetails) {
        this.f7339a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.getPluginExtension().reportUnhandledException(this.f7339a);
    }
}
