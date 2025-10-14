package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.ge */
/* loaded from: classes8.dex */
public final class C9555ge implements IPluginReporter {

    /* renamed from: a */
    public final C9630je f8196a = new C9630je();

    /* renamed from: b */
    public final C9655ke f8197b = new C9655ke();

    /* renamed from: c */
    public final IHandlerExecutor f8198c = C9820r4.m6725i().m6732e().m6201a();

    /* renamed from: d */
    public final Provider f8199d;

    public C9555ge(@NonNull Provider<InterfaceC9138Pa> provider) {
        this.f8199d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C9630je c9630je = this.f8196a;
        c9630je.f8437a.mo5086a(pluginErrorDetails);
        if (c9630je.f8439c.mo5086a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f8908a) {
            this.f8197b.getClass();
            this.f8198c.execute(new RunnableC9505ee(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f8196a.f8437a.mo5086a(pluginErrorDetails);
        this.f8197b.getClass();
        this.f8198c.execute(new RunnableC9480de(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f8196a.f8438b.mo5086a(str);
        this.f8197b.getClass();
        this.f8198c.execute(new RunnableC9530fe(this, str, str2, pluginErrorDetails));
    }
}
