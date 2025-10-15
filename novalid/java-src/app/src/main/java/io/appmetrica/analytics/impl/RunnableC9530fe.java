package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.fe */
/* loaded from: classes6.dex */
public final class RunnableC9530fe implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8122a;

    /* renamed from: b */
    public final /* synthetic */ String f8123b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f8124c;

    /* renamed from: d */
    public final /* synthetic */ C9555ge f8125d;

    public RunnableC9530fe(C9555ge c9555ge, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f8125d = c9555ge;
        this.f8122a = str;
        this.f8123b = str2;
        this.f8124c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC9138Pa) this.f8125d.f8199d.get()).getPluginExtension().reportError(this.f8122a, this.f8123b, this.f8124c);
    }
}
