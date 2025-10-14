package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Vi */
/* loaded from: classes5.dex */
public final class C9289Vi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f7373a;

    /* renamed from: b */
    public final /* synthetic */ String f7374b;

    public C9289Vi(PluginErrorDetails pluginErrorDetails, String str) {
        this.f7373a = pluginErrorDetails;
        this.f7374b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.getPluginExtension().reportError(this.f7373a, this.f7374b);
    }
}
