package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ah */
/* loaded from: classes8.dex */
public final class C8778Ah implements InterfaceC9138Pa {

    /* renamed from: a */
    public final C9816r0 f6338a;

    /* renamed from: b */
    public final C9287Vg f6339b;

    /* renamed from: c */
    public final IHandlerExecutor f6340c;

    /* renamed from: d */
    public final Context f6341d;

    /* renamed from: e */
    public final ReporterConfig f6342e;

    /* renamed from: f */
    public final C9001Jh f6343f;

    /* renamed from: g */
    public final C9555ge f6344g;

    public C8778Ah(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C9816r0());
    }

    /* renamed from: a */
    public static InterfaceC9138Pa m4962a(C9816r0 c9816r0, Context context, ReporterConfig reporterConfig) {
        c9816r0.getClass();
        return C9791q0.m6658a(context, false).m6687k().mo4943c(reporterConfig);
    }

    /* renamed from: c */
    public final void m4966c(@NonNull String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9733nh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9983xh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f6344g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9533fh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9958wh(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f6339b.f7368h.mo5086a(adRevenue);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9633jh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f6339b.f7370j.mo5086a(map);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9883th(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f6339b.f7369i.mo5086a(eCommerceEvent);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9683lh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        this.f6339b.f7362b.mo5086a(str);
        this.f6343f.getClass();
        if (th == null) {
            th = new C9129P1();
            th.fillInStackTrace();
        }
        this.f6340c.execute(new RunnableC9433bh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f6339b.f7361a.mo5086a(str);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC10008yh(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f6339b.f7367g.mo5086a(revenue);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9608ih(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        this.f6339b.f7365e.mo5086a(th);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9483dh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f6339b.f7366f.mo5086a(userProfile);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9583hh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9508eh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9933vh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9708mh(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9808qh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9558gh(this, str));
    }

    public C8778Ah(Context context, String str, C9816r0 c9816r0) {
        this(context, new C9287Vg(), c9816r0, new C9001Jh(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9209Sa
    /* renamed from: a */
    public final void mo4964a(@NonNull C9150Pm c9150Pm) {
        this.f6339b.f7364d.mo5086a(c9150Pm);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9858sh(this, c9150Pm));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        this.f6339b.f7368h.mo5086a(adRevenue);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9833rh(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        this.f6339b.f7361a.mo5086a(str);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC10033zh(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        this.f6339b.f7363c.mo5086a(str);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9458ch(this, str, str2, th));
    }

    public C8778Ah(Context context, C9287Vg c9287Vg, C9816r0 c9816r0, C9001Jh c9001Jh, ReporterConfig reporterConfig) {
        this(context, c9287Vg, c9816r0, c9001Jh, reporterConfig, new C9555ge(new C9658kh(c9816r0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9416b0
    /* renamed from: a */
    public final void mo4965a(@NonNull C9222T c9222t) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9908uh(this, c9222t));
    }

    public C8778Ah(Context context, C9287Vg c9287Vg, C9816r0 c9816r0, C9001Jh c9001Jh, ReporterConfig reporterConfig, C9555ge c9555ge) {
        this.f6340c = C9820r4.m6725i().m6732e().m6201a();
        this.f6341d = context;
        this.f6339b = c9287Vg;
        this.f6338a = c9816r0;
        this.f6343f = c9001Jh;
        this.f6342e = reporterConfig;
        this.f6344g = c9555ge;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.f6339b.f7361a.mo5086a(str);
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9408ah(this, str, CollectionUtils.getListFromMap(map)));
    }

    /* renamed from: a */
    public final void m4963a(@NonNull ReporterConfig reporterConfig) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9758oh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f6339b.getClass();
        this.f6343f.getClass();
        this.f6340c.execute(new RunnableC9783ph(this, moduleEvent));
    }
}
