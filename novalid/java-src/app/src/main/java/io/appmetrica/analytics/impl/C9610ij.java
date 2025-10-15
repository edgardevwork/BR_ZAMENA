package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ij */
/* loaded from: classes7.dex */
public final class C9610ij implements InterfaceC9138Pa, IPluginReporter {

    /* renamed from: a */
    public final ArrayList f8368a = new ArrayList();

    /* renamed from: b */
    public volatile C8778Ah f8369b;

    @Override // io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9209Sa
    /* renamed from: a */
    public final void mo4964a(@NonNull C9150Pm c9150Pm) {
        m6292a(new C9217Si(c9150Pm));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        m6292a(new C9485dj());
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        m6292a(new C9074Mi());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        m6292a(new C9460cj(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        m6292a(new C9241Ti(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        m6292a(new C9410aj(map));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        m6292a(new C9170Qi(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        m6292a(new C8978Ii(str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        m6292a(new C9535fj(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        m6292a(new C9146Pi(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        m6292a(new C9026Ki(th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        m6292a(new C9122Oi(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m6292a(new C9050Li());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        m6292a(new C9510ej());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        m6292a(new C9193Ri(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        m6292a(new C9361Yi(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        m6292a(new C9098Ni(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9416b0
    /* renamed from: a */
    public final void mo4965a(@NonNull C9222T c9222t) {
        m6292a(new C9435bj(c9222t));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        m6292a(new C9385Zi(adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        m6292a(new C9002Ji(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        m6292a(new C9560gj(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        m6292a(new C9265Ui(pluginErrorDetails));
    }

    /* renamed from: a */
    public final synchronized void m6292a(InterfaceC9114Oa interfaceC9114Oa) {
        try {
            if (this.f8369b == null) {
                this.f8368a.add(interfaceC9114Oa);
            } else {
                interfaceC9114Oa.mo5277a(this.f8369b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @NonNull Throwable th) {
        m6292a(new C9002Ji(str, str2, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        m6292a(new C9585hj(str, map));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        m6292a(new C9289Vi(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        m6292a(new C9337Xi(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        m6292a(new C9313Wi(str, str2, pluginErrorDetails));
    }
}
