package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Wi */
/* loaded from: classes5.dex */
public final class C9313Wi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f7413a;

    /* renamed from: b */
    public final /* synthetic */ String f7414b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f7415c;

    public C9313Wi(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f7413a = str;
        this.f7414b = str2;
        this.f7415c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.getPluginExtension().reportError(this.f7413a, this.f7414b, this.f7415c);
    }
}
