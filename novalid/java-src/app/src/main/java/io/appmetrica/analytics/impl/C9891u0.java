package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.u0 */
/* loaded from: classes7.dex */
public final class C9891u0 implements InterfaceC8771Aa {

    /* renamed from: a */
    public final Context f9141a;

    /* renamed from: b */
    public final InterfaceC10026za f9142b;

    /* renamed from: c */
    public final C9730ne f9143c;

    /* renamed from: d */
    public final C9219Sk f9144d;

    /* renamed from: e */
    public final C8801Bf f9145e;

    /* renamed from: f */
    public final C9213Se f9146f;

    /* renamed from: g */
    public final C8853Dh f9147g;

    /* renamed from: h */
    public final C9145Ph f9148h;

    /* renamed from: i */
    public final C8868E7 f9149i;

    /* renamed from: j */
    public final C9461ck f9150j;

    /* renamed from: k */
    public volatile C9378Zb f9151k;

    /* renamed from: l */
    public final C9541g0 f9152l;

    /* renamed from: m */
    public boolean f9153m;

    @WorkerThread
    public C9891u0(@NotNull Context context, @NotNull InterfaceC10026za interfaceC10026za) {
        this.f9141a = context;
        this.f9142b = interfaceC10026za;
        C9730ne c9730neM6729b = C9820r4.m6725i().m6729b(context);
        this.f9143c = c9730neM6729b;
        C9331Xc.m5748a();
        C9820r4 c9820r4M6725i = C9820r4.m6725i();
        c9820r4M6725i.m6737k().m6572a(new C9395a4(context));
        C9213Se c9213SeM6873a = AbstractC9916v0.m6873a(context, AbstractC9916v0.m6870a(interfaceC10026za.mo6321b(), this));
        this.f9146f = c9213SeM6873a;
        C8868E7 c8868e7M6734g = c9820r4M6725i.m6734g();
        this.f9149i = c8868e7M6734g;
        C9145Ph c9145PhM6872a = AbstractC9916v0.m6872a(c9213SeM6873a, context, interfaceC10026za.getDefaultExecutor());
        this.f9148h = c9145PhM6872a;
        c8868e7M6734g.m5104a(c9145PhM6872a);
        C9219Sk c9219SkM6874a = AbstractC9916v0.m6874a(context, c9145PhM6872a, c9730neM6729b, interfaceC10026za.mo6321b());
        this.f9144d = c9219SkM6874a;
        c9145PhM6872a.m5492a(c9219SkM6874a);
        this.f9145e = AbstractC9916v0.m6869a(c9145PhM6872a, c9730neM6729b, interfaceC10026za.mo6321b());
        this.f9147g = AbstractC9916v0.m6871a(context, c9213SeM6873a, c9145PhM6872a, interfaceC10026za.mo6321b(), c9219SkM6874a);
        this.f9150j = c9820r4M6725i.m6739m();
        this.f9152l = new C9541g0(c9730neM6729b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    @NotNull
    /* renamed from: c */
    public final InterfaceC9138Pa mo4943c(@NotNull ReporterConfig reporterConfig) {
        return this.f9147g.mo5078b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    public final void clearAppEnvironment() {
        m6844k().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @AnyThread
    @NotNull
    /* renamed from: d */
    public final C9280V9 mo4944d() {
        return this.f9144d.m5597e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    /* renamed from: e */
    public final void mo4945e() {
        C9541g0 c9541g0 = this.f9152l;
        AppMetricaConfig appMetricaConfigM6529f = c9541g0.f8158a.m6529f();
        if (appMetricaConfigM6529f == null) {
            C9741o0 c9741o0 = c9541g0.f8159b;
            c9741o0.getClass();
            AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (c9741o0.f8798a.m5692c() && Intrinsics.areEqual(c9741o0.f8799b.f7719a, Boolean.TRUE)) {
                builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
            }
            appMetricaConfigM6529f = builderNewConfigBuilder.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (m6843a(mainPublicOrAnonymousLogger, appMetricaConfigM6529f, new C9866t0(this, appMetricaConfigM6529f, mainPublicOrAnonymousLogger))) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @AnyThread
    @Nullable
    /* renamed from: f */
    public final String mo4946f() {
        return this.f9144d.m5596d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @AnyThread
    @Nullable
    /* renamed from: h */
    public final Map<String, String> mo4947h() {
        return this.f9144d.m5590b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @AnyThread
    @NotNull
    /* renamed from: i */
    public final AdvIdentifiersResult mo4948i() {
        return this.f9144d.m5580a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @AnyThread
    @Nullable
    /* renamed from: j */
    public final C9378Zb mo4949j() {
        return this.f9151k;
    }

    /* renamed from: k */
    public final InterfaceC8921Ga m6844k() {
        C9378Zb c9378Zb = this.f9151k;
        Intrinsics.checkNotNull(c9378Zb);
        return c9378Zb.f7631a;
    }

    @AnyThread
    @NotNull
    /* renamed from: l */
    public final C8853Dh m6845l() {
        return this.f9147g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        m6844k().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    public final void setDataSendingEnabled(boolean z) {
        m6844k().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    public final void setUserProfileID(@Nullable String str) {
        m6844k().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    /* renamed from: a */
    public final void mo4936a(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zM6843a = m6843a(orCreateMainPublicLogger, appMetricaConfig, new C9841s0(this, appMetricaConfig, orCreateMainPublicLogger));
        if (zM6843a || this.f9153m) {
            z = false;
        } else {
            m6842a(appMetricaConfig, orCreateMainPublicLogger);
            z = true;
        }
        if (zM6843a || z) {
            this.f9143c.m6515a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zM6843a) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f9153m = true;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC8792B6
    @AnyThread
    /* renamed from: a */
    public final void mo4934a(int i, @NotNull Bundle bundle) {
        this.f9144d.m5592b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    /* renamed from: a */
    public final void mo4938a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f9145e.m5001a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    /* renamed from: a */
    public final void mo4937a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f9145e.m5000a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    /* renamed from: a */
    public final void mo4939a(@NotNull ReporterConfig reporterConfig) {
        this.f9147g.mo5075a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa
    @WorkerThread
    /* renamed from: a */
    public final void mo4940a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.f9144d.m5585a(startupParamsCallback, list, AbstractC9452cb.m5970c(this.f9146f.f7251a.getAsString("PROCESS_CFG_CLIDS")));
    }

    /* renamed from: a */
    public final boolean m6843a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC9603ic interfaceC9603ic) {
        if (this.f9151k == null) {
            m6842a(appMetricaConfig, publicLogger);
            this.f9145e.m4999a();
            C9330Xb c9330XbMo6290a = interfaceC9603ic.mo6290a();
            C8768A7 c8768a7 = new C8768A7(c9330XbMo6290a);
            C9378Zb c9378Zb = new C9378Zb(c9330XbMo6290a, c8768a7);
            this.f9142b.mo6322c().m5625a(c8768a7);
            this.f9151k = c9378Zb;
            C9871t5 c9871t5 = this.f9150j.f7862b;
            synchronized (c9871t5) {
                try {
                    c9871t5.f9085a = c9330XbMo6290a;
                    Iterator it = c9871t5.f9086b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC9954wd) it.next()).consume(c9330XbMo6290a);
                    }
                    c9871t5.f9086b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC9603ic.mo6290a();
        return false;
    }

    /* renamed from: a */
    public final void m6842a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f9142b.mo6323d().m6179a(this.f9141a, appMetricaConfig, this);
            this.f9142b.mo6323d().m6180b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f9142b.mo6323d().m6178a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f9150j.m5994a();
        } else {
            C9461ck c9461ck = this.f9150j;
            synchronized (c9461ck) {
                if (c9461ck.f7867g) {
                    c9461ck.f7861a.m6618b(c9461ck.f7863c, EnumC9690m.RESUMED);
                    c9461ck.f7861a.m6618b(c9461ck.f7864d, EnumC9690m.PAUSED);
                    c9461ck.f7867g = false;
                }
            }
        }
        this.f9146f.m5564d(appMetricaConfig);
        C9219Sk c9219Sk = this.f9144d;
        c9219Sk.f7263e = publicLogger;
        c9219Sk.m5594b(appMetricaConfig.customHosts);
        C9219Sk c9219Sk2 = this.f9144d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        c9219Sk2.m5589a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f9144d.m5587a(str);
        if (str != null) {
            this.f9144d.m5593b("api");
        }
        C9145Ph c9145Ph = this.f9148h;
        Boolean bool3 = appMetricaConfig.locationTracking;
        Boolean bool4 = appMetricaConfig.dataSendingEnabled;
        if (AbstractC9664kn.m6342a(bool3)) {
            c9145Ph.f7115a.f7617b.setLocationTracking(bool3.booleanValue());
        }
        if (AbstractC9664kn.m6342a(bool4)) {
            c9145Ph.f7115a.f7617b.setDataSendingEnabled(bool4.booleanValue());
        } else {
            c9145Ph.getClass();
        }
        C9252U5 c9252u5M5632a = C9252U5.m5632a();
        C9251U4 c9251u4 = c9145Ph.f7115a;
        c9145Ph.m5493a(C9145Ph.m5490a(c9252u5M5632a, c9251u4), c9251u4, 1, null);
        this.f9144d.m5601i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    /* renamed from: a */
    public final void mo4935a(@Nullable Location location) {
        m6844k().mo4935a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    /* renamed from: a */
    public final void mo4942a(boolean z) {
        m6844k().mo4942a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9878tc
    @WorkerThread
    /* renamed from: a */
    public final void mo4941a(@NotNull String str, @NotNull String str2) {
        m6844k().mo4941a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8771Aa, io.appmetrica.analytics.impl.InterfaceC9185Ra
    /* renamed from: a */
    public final InterfaceC9162Qa mo4933a() {
        return this.f9147g;
    }
}
