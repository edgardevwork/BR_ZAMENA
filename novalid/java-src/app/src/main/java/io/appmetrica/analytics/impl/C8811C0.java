package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.C0 */
/* loaded from: classes7.dex */
public final class C8811C0 implements AppMetricaPlugins {

    /* renamed from: a */
    public final C8861E0 f6418a;

    public C8811C0(@NotNull C8861E0 c8861e0) {
        this.f6418a = c8861e0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f6418a.m5093a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.f6418a.m5092a(pluginErrorDetails);
    }

    public C8811C0() {
        this(new C8861E0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f6418a.m5094a(str, str2, pluginErrorDetails);
    }
}
