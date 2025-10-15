package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ee */
/* loaded from: classes6.dex */
public final class RunnableC9505ee implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f8009a;

    /* renamed from: b */
    public final /* synthetic */ String f8010b;

    /* renamed from: c */
    public final /* synthetic */ C9555ge f8011c;

    public RunnableC9505ee(C9555ge c9555ge, PluginErrorDetails pluginErrorDetails, String str) {
        this.f8011c = c9555ge;
        this.f8009a = pluginErrorDetails;
        this.f8010b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC9138Pa) this.f8011c.f8199d.get()).getPluginExtension().reportError(this.f8009a, this.f8010b);
    }
}
