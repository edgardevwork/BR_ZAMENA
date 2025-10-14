package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.p049js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.p049js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.m1 */
/* loaded from: classes5.dex */
public final class C9692m1 {

    /* renamed from: a */
    public final C9816r0 f8612a;

    /* renamed from: b */
    public final C8909Fn f8613b;

    /* renamed from: c */
    public final C8977Ih f8614c;

    /* renamed from: d */
    public final C8868E7 f8615d;

    /* renamed from: e */
    public final C9686lk f8616e;

    /* renamed from: f */
    public final C8962I2 f8617f;

    /* renamed from: g */
    public final C9588hm f8618g;

    /* renamed from: h */
    public final C9461ck f8619h;

    public C9692m1(C9816r0 c9816r0, C8962I2 c8962i2, C9686lk c9686lk, C8909Fn c8909Fn, C9588hm c9588hm, C8977Ih c8977Ih, C8868E7 c8868e7, C9461ck c9461ck) {
        this.f8612a = c9816r0;
        this.f8613b = c8909Fn;
        this.f8614c = c8977Ih;
        this.f8615d = c8868e7;
        this.f8617f = c8962i2;
        this.f8618g = c9588hm;
        this.f8616e = c9686lk;
        this.f8619h = c9461ck;
    }

    /* renamed from: c */
    public static IHandlerExecutor m6414c() {
        return C9820r4.m6725i().f8968c.m6201a();
    }

    /* renamed from: a */
    public final void m6420a(@NonNull final Context context, @NonNull final AppMetricaConfig appMetricaConfig) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6743f.mo5086a(context);
        c8962i2.f6739b.mo5086a(appMetricaConfig);
        C9588hm c9588hm = this.f8618g;
        Context applicationContext = context.getApplicationContext();
        c9588hm.f8317e.m5296a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c9588hm.f8316d.m5994a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c9588hm.f8313a.getClass();
        C9791q0 c9791q0M6658a = C9791q0.m6658a(applicationContext, true);
        c9791q0M6658a.f8919d.mo6320a(appMetricaConfig, c9791q0M6658a);
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.m1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m6444b(context, appMetricaConfig);
            }
        });
        this.f8612a.getClass();
        synchronized (C9791q0.class) {
            C9791q0.f8914f = true;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String m6442b() {
        this.f8612a.getClass();
        C9791q0 c9791q0 = C9791q0.f8913e;
        if (c9791q0 == null) {
            return null;
        }
        return c9791q0.m6687k().mo4946f();
    }

    /* renamed from: d */
    public final C9378Zb m6452d() {
        this.f8612a.getClass();
        return C9791q0.f8913e.m6687k().mo4949j();
    }

    /* renamed from: e */
    public final void m6455e() {
        m6452d().f7631a.mo5217a(this.f8619h.m5994a());
    }

    /* renamed from: f */
    public final void m6457f() {
        this.f8617f.f6738a.mo5086a(null);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9128P0(this));
    }

    /* renamed from: c */
    public final void m6449c(@Nullable Activity activity) {
        this.f8617f.f6738a.mo5086a(null);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9392a1(this, activity));
    }

    /* renamed from: b */
    public final void m6444b(Context context, AppMetricaConfig appMetricaConfig) {
        C9816r0 c9816r0 = this.f8612a;
        Context applicationContext = context.getApplicationContext();
        c9816r0.getClass();
        C9791q0 c9791q0M6658a = C9791q0.m6658a(applicationContext, false);
        c9791q0M6658a.m6687k().mo4936a(this.f8615d.m5105b(appMetricaConfig));
    }

    /* renamed from: e */
    public final void m6456e(@Nullable String str) {
        this.f8617f.getClass();
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9056M0(this, str));
    }

    /* renamed from: d */
    public final void m6453d(@NonNull String str) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6747j.mo5086a(str);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC8960I0(this, str));
    }

    public C9692m1() {
        this(C9820r4.m6725i().m6730c(), new C8909Fn());
    }

    /* renamed from: c */
    public final void m6451c(@NonNull String str, @Nullable String str2) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6756s.mo5086a(str);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9567h1(this, str, str2));
    }

    public C9692m1(C9816r0 c9816r0, C8909Fn c8909Fn) {
        this(c9816r0, new C8962I2(c9816r0), new C9686lk(c9816r0), c8909Fn, new C9588hm(c9816r0, c8909Fn), C8977Ih.m5275a(), C9820r4.m6725i().m6734g(), C9820r4.m6725i().m6739m());
    }

    /* renamed from: b */
    public final void m6445b(@NonNull String str) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6756s.mo5086a(str);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9542g1(this, str));
    }

    /* renamed from: d */
    public final void m6454d(@NonNull String str, @Nullable String str2) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        if (c8962i2.f6752o.mo5086a(str).f8908a) {
            this.f8618g.getClass();
            IHandlerExecutor iHandlerExecutorM6414c = m6414c();
            ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9295W0(this, str, str2));
        }
    }

    /* renamed from: c */
    public final void m6450c(@NonNull String str) {
        if (this.f8616e.mo5086a((Void) null).f8908a && this.f8617f.f6751n.mo5086a(str).f8908a) {
            this.f8618g.getClass();
            IHandlerExecutor iHandlerExecutorM6414c = m6414c();
            ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9319X0(this, str));
        }
    }

    /* renamed from: b */
    public final void m6443b(@NonNull Activity activity) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6740c.mo5086a(activity);
        this.f8618g.getClass();
        Intent intentM6260a = C9588hm.m6260a(activity);
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC8886F0(this, intentM6260a));
    }

    /* renamed from: b */
    public final void m6447b(boolean z) {
        this.f8617f.getClass();
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9008K0(this, z));
    }

    /* renamed from: b */
    public final void m6446b(@NonNull String str, @Nullable String str2) {
        this.f8617f.f6749l.mo5086a(str);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9247U0(this, str, str2));
    }

    /* renamed from: a */
    public final void m6418a(@Nullable Activity activity) {
        this.f8617f.f6738a.mo5086a(null);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9517f1(this, activity));
    }

    /* renamed from: b */
    public final void m6448b(@NonNull final Object... objArr) {
        this.f8617f.f6738a.mo5086a(null);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.m1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C9692m1.m6413a(objArr);
            }
        });
    }

    /* renamed from: a */
    public final void m6419a(@NonNull Application application) {
        this.f8617f.f6742e.mo5086a(application);
        this.f8618g.f8315c.m6614a(application);
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.m1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m6455e();
            }
        });
    }

    /* renamed from: a */
    public final void m6438a(@NonNull String str, @Nullable Map<String, Object> map) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6756s.mo5086a(str);
        this.f8618g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9592i1(this, str, listFromMap));
    }

    /* renamed from: a */
    public final void m6437a(@NonNull String str, @Nullable Throwable th) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6757t.mo5086a(str);
        this.f8618g.getClass();
        if (th == null) {
            th = new C9129P1();
            th.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9617j1(this, str, th));
    }

    /* renamed from: a */
    public final void m6436a(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6758u.mo5086a(str);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9642k1(this, str, str2, th));
    }

    /* renamed from: a */
    public final void m6439a(@NonNull Throwable th) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6759v.mo5086a(th);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9667l1(this, th));
    }

    /* renamed from: a */
    public final void m6434a(@NonNull String str) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6746i.mo5086a(str);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC8911G0(this, str));
    }

    /* renamed from: a */
    public final void m6423a(@NonNull Intent intent) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6741d.mo5086a(intent);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC8936H0(this, intent));
    }

    /* renamed from: a */
    public final void m6424a(@Nullable Location location) {
        this.f8617f.getClass();
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC8984J0(this, location));
    }

    /* renamed from: a */
    public final void m6441a(boolean z) {
        this.f8617f.getClass();
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9032L0(this, z));
    }

    /* renamed from: a */
    public final void m6433a(@NonNull UserProfile userProfile) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6760w.mo5086a(userProfile);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9080N0(this, userProfile));
    }

    /* renamed from: a */
    public final void m6431a(@NonNull Revenue revenue) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6761x.mo5086a(revenue);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9104O0(this, revenue));
    }

    /* renamed from: a */
    public final void m6426a(@NonNull AdRevenue adRevenue) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6762y.mo5086a(adRevenue);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9152Q0(this, adRevenue));
    }

    /* renamed from: a */
    public final void m6432a(@NonNull ECommerceEvent eCommerceEvent) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6763z.mo5086a(eCommerceEvent);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9175R0(this, eCommerceEvent));
    }

    /* renamed from: a */
    public final void m6429a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6744g.mo5086a(deferredDeeplinkParametersListener);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9199S0(this, deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public final void m6428a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6744g.mo5086a(deferredDeeplinkListener);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9223T0(this, deferredDeeplinkListener));
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC9138Pa m6415a(@NonNull Context context, @NonNull String str) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6743f.mo5086a(context);
        c8962i2.f6748k.mo5086a(str);
        C9588hm c9588hm = this.f8618g;
        c9588hm.f8317e.m5296a(context.getApplicationContext());
        return this.f8614c.m5276a(context.getApplicationContext(), str);
    }

    /* renamed from: a */
    public final void m6421a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6743f.mo5086a(context);
        c8962i2.f6745h.mo5086a(reporterConfig);
        C9588hm c9588hm = this.f8618g;
        c9588hm.f8317e.m5296a(context.getApplicationContext());
        C8977Ih c8977Ih = this.f8614c;
        Context applicationContext = context.getApplicationContext();
        if (((C8778Ah) c8977Ih.f6788a.get(reporterConfig.apiKey)) == null) {
            synchronized (c8977Ih.f6788a) {
                try {
                    if (((C8778Ah) c8977Ih.f6788a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorM6201a = C9820r4.m6725i().f8968c.m6201a();
                        c8977Ih.f6789b.getClass();
                        if (C9791q0.f8913e == null) {
                            ((C9975x9) iHandlerExecutorM6201a).f9301b.post(new RunnableC8928Gh(c8977Ih, applicationContext));
                        }
                        C8778Ah c8778Ah = new C8778Ah(applicationContext.getApplicationContext(), str, new C9816r0());
                        c8977Ih.f6788a.put(str, c8778Ah);
                        c8778Ah.m4963a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m6425a(@NonNull WebView webView) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6750m.mo5086a(webView);
        C8909Fn c8909Fn = this.f8618g.f8314b;
        c8909Fn.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                C8834Cn c8834Cn = new C8834Cn();
                synchronized (c8909Fn) {
                    try {
                        PublicLogger publicLogger = c8909Fn.f6634b;
                        if (publicLogger == null) {
                            c8909Fn.f6633a.add(c8834Cn);
                        } else {
                            c8834Cn.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                c8909Fn.m5205a(new C8859Dn());
            }
        } catch (Throwable th) {
            c8909Fn.m5205a(new C8884En(th));
        }
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9271V0(this));
    }

    @NonNull
    /* renamed from: a */
    public final IdentifiersResult m6416a(@NonNull Context context) {
        this.f8617f.f6753p.mo5086a(context);
        C9588hm c9588hm = this.f8618g;
        Context applicationContext = context.getApplicationContext();
        c9588hm.f8317e.m5296a(applicationContext);
        c9588hm.f8318f.m5853a(applicationContext);
        return C9820r4.m6725i().m6726a(context.getApplicationContext()).m5808a();
    }

    /* renamed from: a */
    public final void m6435a(@NonNull String str, @Nullable String str2) {
        this.f8617f.getClass();
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9343Y0(this, str, str2));
    }

    /* renamed from: a */
    public final void m6417a() {
        this.f8617f.getClass();
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9367Z0(this));
    }

    /* renamed from: a */
    public final void m6422a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6743f.mo5086a(context);
        c8962i2.f6753p.mo5086a(startupParamsCallback);
        C9588hm c9588hm = this.f8618g;
        c9588hm.f8317e.m5296a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9417b1(this, context, startupParamsCallback, list));
    }

    /* renamed from: a */
    public final void m6427a(@NonNull AnrListener anrListener) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6754q.mo5086a(anrListener);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9442c1(this, anrListener));
    }

    /* renamed from: a */
    public final void m6430a(@NonNull ExternalAttribution externalAttribution) {
        C8962I2 c8962i2 = this.f8617f;
        c8962i2.f6738a.mo5086a(null);
        c8962i2.f6755r.mo5086a(externalAttribution);
        this.f8618g.getClass();
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9467d1(this, externalAttribution));
    }

    /* renamed from: a */
    public static /* synthetic */ void m6413a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorM6570a = C9820r4.m6725i().m6737k().m6570a();
        if (moduleAdRevenueProcessorM6570a != null) {
            moduleAdRevenueProcessorM6570a.process(objArr);
        }
    }

    /* renamed from: a */
    public final void m6440a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f8617f.f6737A.mo5086a(map);
        this.f8618g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorM6414c = m6414c();
        ((C9975x9) iHandlerExecutorM6414c).f9301b.post(new RunnableC9492e1(this, listFromMap));
    }

    /* renamed from: a */
    public static InterfaceC8921Ga m6412a(C9692m1 c9692m1) {
        return c9692m1.m6452d().f7631a;
    }
}
