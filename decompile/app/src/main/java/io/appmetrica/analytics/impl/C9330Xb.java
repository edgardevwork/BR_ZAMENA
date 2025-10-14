package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.Xb */
/* loaded from: classes7.dex */
public final class C9330Xb extends AbstractC9177R2 implements InterfaceC8921Ga {

    /* renamed from: q */
    public static final C8858Dm f7520q = new C8858Dm(new C9929vd("Referral url"));

    /* renamed from: r */
    public static final Long f7521r = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: o */
    public final C9578hc f7522o;

    /* renamed from: p */
    public final C9354Yb f7523p;

    public C9330Xb(C9578hc c9578hc) {
        super(c9578hc.m6247b(), c9578hc.m6254i(), c9578hc.m6253h(), c9578hc.m6249d(), c9578hc.m6251f(), c9578hc.m6255j(), c9578hc.m6252g(), c9578hc.m6248c(), c9578hc.m6245a(), c9578hc.m6250e());
        this.f7522o = c9578hc;
        this.f7523p = new C9354Yb(this);
        m5747m();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5218a(@NonNull String str, boolean z) {
        this.f7187c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z));
        String strM5968b = AbstractC9452cb.m5968b(map);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(strM5968b, "", 8208, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: b */
    public final void mo5220b(@NonNull String str) {
        f7520q.mo5086a(str);
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strM5968b = AbstractC9452cb.m5968b(map);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(strM5968b, "", 8208, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7187c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: c */
    public final void mo5221c() {
        C9354Yb c9354Yb = this.f7523p;
        synchronized (c9354Yb) {
            c9354Yb.f7578b.m6034a(c9354Yb.f7577a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: g */
    public final List<String> mo5222g() {
        return this.f7186b.f7616a.m5559b();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9177R2
    /* renamed from: k */
    public final String mo5517k() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9177R2
    /* renamed from: l */
    public final void mo5518l() {
        super.mo5518l();
        C9820r4.m6725i().m6737k().m6574b();
    }

    /* renamed from: m */
    public final void m5747m() {
        C9145Ph c9145Ph = this.f7192h;
        c9145Ph.f7117c.m5502a(this.f7186b.f7616a);
        C9543g2 c9543g2 = this.f7522o.f8270f;
        C9306Wb c9306Wb = new C9306Wb(this);
        long jLongValue = f7521r.longValue();
        synchronized (c9543g2) {
            c9543g2.m6156a(c9306Wb, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5217a(@NonNull EnumC9740o enumC9740o) {
        if (enumC9740o == EnumC9740o.f8793b) {
            this.f7187c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f7187c.warning("Could not enable activity auto tracking. " + enumC9740o.f8797a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: b */
    public final void mo5219b(@Nullable Activity activity) {
        if (this.f7522o.f8272h.m6721a(activity, EnumC9790q.PAUSED)) {
            this.f7187c.info("Pause session", new Object[0]);
            m5515c(activity != null ? activity.getClass().getSimpleName() : null);
            C9543g2 c9543g2 = this.f7522o.f8270f;
            synchronized (c9543g2) {
                for (C9518f2 c9518f2 : c9543g2.f8162a) {
                    if (!c9518f2.f8048d) {
                        c9518f2.f8048d = true;
                        c9518f2.f8046b.executeDelayed(c9518f2.f8049e, c9518f2.f8047c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5213a(@Nullable Activity activity) {
        if (this.f7522o.f8272h.m6721a(activity, EnumC9790q.RESUMED)) {
            this.f7187c.info("Resume session", new Object[0]);
            m5516d(activity != null ? activity.getClass().getSimpleName() : null);
            C9543g2 c9543g2 = this.f7522o.f8270f;
            synchronized (c9543g2) {
                for (C9518f2 c9518f2 : c9543g2.f8162a) {
                    if (c9518f2.f8048d) {
                        c9518f2.f8048d = false;
                        c9518f2.f8046b.remove(c9518f2.f8049e);
                        C9330Xb c9330Xb = c9518f2.f8045a.f7402a;
                        c9330Xb.f7192h.f7117c.m5504b(c9330Xb.f7186b.f7616a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5746a(AppMetricaConfig appMetricaConfig, boolean z) {
        if (z) {
            clearAppEnvironment();
        }
        m5513a(appMetricaConfig.appEnvironment);
        m5514b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.f7187c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            C9529fd c9529fd = this.f7522o.f8267c;
            Context context = this.f7185a;
            c9529fd.f8121d = new C8761A0(this.f7186b.f7617b.getApiKey(), c9529fd.f8118a.f7251a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, c9529fd.f8118a.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), c9529fd.f8118a.f7251a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f7186b.m5813d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            C8761A0 c8761a0 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = c9529fd.f8119b;
                C8786B0 c8786b0 = c9529fd.f8120c;
                C8761A0 c8761a02 = c9529fd.f8121d;
                if (c8761a02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nativeCrashMetadata");
                } else {
                    c8761a0 = c8761a02;
                }
                c8786b0.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, C8786B0.m4982a(c8761a0)));
            }
        }
        C9354Yb c9354Yb = this.f7523p;
        synchronized (c9354Yb) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c9354Yb.f7577a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c9354Yb.f7578b.m6034a(c9354Yb.f7577a);
                } else {
                    c9354Yb.f7578b.m6035b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4935a(@Nullable Location location) {
        this.f7186b.f7617b.setManualLocation(location);
        this.f7187c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4942a(boolean z) {
        this.f7186b.f7617b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5216a(@NonNull C8909Fn c8909Fn) {
        PublicLogger publicLogger = this.f7187c;
        synchronized (c8909Fn) {
            c8909Fn.f6634b = publicLogger;
        }
        Iterator it = c8909Fn.f6633a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        c8909Fn.f6633a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5214a(@NonNull AnrListener anrListener) {
        this.f7523p.m5783a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5215a(@NonNull ExternalAttribution externalAttribution) {
        this.f7187c.info("External attribution received: %s", externalAttribution);
        C9145Ph c9145Ph = this.f7192h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(bytes, "", 42, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9177R2, io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4941a(String str, String str2) {
        super.mo4941a(str, str2);
        C9529fd c9529fd = this.f7522o.f8267c;
        String strM5813d = this.f7186b.m5813d();
        C8761A0 c8761a0 = c9529fd.f8121d;
        if (c8761a0 != null) {
            C8761A0 c8761a02 = new C8761A0(c8761a0.f6298a, c8761a0.f6299b, c8761a0.f6300c, c8761a0.f6301d, c8761a0.f6302e, strM5813d);
            c9529fd.f8121d = c8761a02;
            NativeCrashClientModule nativeCrashClientModule = c9529fd.f8119b;
            c9529fd.f8120c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(C8786B0.m4982a(c8761a02));
        }
    }
}
