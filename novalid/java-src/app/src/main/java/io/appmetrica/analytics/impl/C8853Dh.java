package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Dh */
/* loaded from: classes8.dex */
public final class C8853Dh implements InterfaceC9162Qa {

    /* renamed from: a */
    public final Context f6477a;

    /* renamed from: b */
    public final C9213Se f6478b;

    /* renamed from: c */
    public final C9145Ph f6479c;

    /* renamed from: d */
    public final Handler f6480d;

    /* renamed from: e */
    public final C9219Sk f6481e;

    /* renamed from: f */
    public final C9578hc f6482f;

    /* renamed from: g */
    public final LinkedHashMap f6483g;

    /* renamed from: h */
    public final C8858Dm f6484h;

    /* renamed from: i */
    public final List f6485i;

    /* renamed from: j */
    public C9330Xb f6486j;

    public C8853Dh(@NotNull Context context, @NotNull C9213Se c9213Se, @NotNull C9145Ph c9145Ph, @NotNull Handler handler, @NotNull C9219Sk c9219Sk) {
        this.f6477a = context;
        this.f6478b = c9213Se;
        this.f6479c = c9145Ph;
        this.f6480d = handler;
        this.f6481e = c9219Sk;
        this.f6482f = new C9578hc(context, c9213Se, c9145Ph, c9219Sk);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6483g = linkedHashMap;
        this.f6484h = new C8858Dm(new C8903Fh(linkedHashMap));
        this.f6485i = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa, io.appmetrica.analytics.impl.InterfaceC9185Ra
    /* renamed from: a */
    public final InterfaceC9162Qa mo4933a() {
        return this;
    }

    @NotNull
    /* renamed from: b */
    public final C8853Dh m5076b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C9330Xb mo5074a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, boolean z) {
        C9330Xb c9330Xb;
        try {
            c9330Xb = this.f6486j;
            if (c9330Xb == null) {
                this.f6484h.mo5086a(appMetricaConfig.apiKey);
                this.f6482f.m6246a(appMetricaConfig, publicLogger);
                c9330Xb = new C9330Xb(this.f6482f);
                c9330Xb.f7193i = new C9627jb(this.f6480d, c9330Xb);
                C9219Sk c9219Sk = this.f6481e;
                C9383Zg c9383Zg = c9330Xb.f7186b;
                if (c9219Sk != null) {
                    c9383Zg.f7617b.setUuid(c9219Sk.m5599g());
                } else {
                    c9383Zg.getClass();
                }
                c9330Xb.m5746a(appMetricaConfig, z);
                c9330Xb.mo5518l();
                this.f6479c.f7120f.f8862c = new C8828Ch(c9330Xb);
                this.f6483g.put(appMetricaConfig.apiKey, c9330Xb);
                this.f6486j = c9330Xb;
            }
        } finally {
        }
        return c9330Xb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @WorkerThread
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C9330Xb mo5077b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, boolean z) {
        C9330Xb c9330Xb;
        try {
            c9330Xb = this.f6486j;
            if (c9330Xb != null) {
                this.f6482f.m6246a(appMetricaConfig, publicLogger);
                c9330Xb.m5746a(appMetricaConfig, z);
                C9820r4.m6725i().getClass();
                this.f6483g.put(appMetricaConfig.apiKey, c9330Xb);
            } else {
                this.f6484h.mo5086a(appMetricaConfig.apiKey);
                this.f6482f.m6246a(appMetricaConfig, publicLogger);
                c9330Xb = new C9330Xb(this.f6482f);
                c9330Xb.f7193i = new C9627jb(this.f6480d, c9330Xb);
                C9219Sk c9219Sk = this.f6481e;
                C9383Zg c9383Zg = c9330Xb.f7186b;
                if (c9219Sk != null) {
                    c9383Zg.f7617b.setUuid(c9219Sk.m5599g());
                } else {
                    c9383Zg.getClass();
                }
                c9330Xb.m5746a(appMetricaConfig, z);
                c9330Xb.mo5518l();
                this.f6479c.f7120f.f8862c = new C8828Ch(c9330Xb);
                this.f6483g.put(appMetricaConfig.apiKey, c9330Xb);
                C9820r4.m6725i().getClass();
                this.f6486j = c9330Xb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c9330Xb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    /* renamed from: a */
    public final synchronized void mo5075a(@NotNull ReporterConfig reporterConfig) {
        try {
            if (this.f6483g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", reporterConfig.apiKey);
            } else {
                mo5078b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NotNull
    /* renamed from: b */
    public final synchronized InterfaceC9138Pa mo5078b(@NotNull ReporterConfig reporterConfig) {
        InterfaceC9138Pa interfaceC9138Pa;
        try {
            interfaceC9138Pa = (InterfaceC9138Pa) this.f6483g.get(reporterConfig.apiKey);
            if (interfaceC9138Pa == null) {
                if (!this.f6485i.contains(reporterConfig.apiKey)) {
                    this.f6481e.m5601i();
                }
                Context context = this.f6477a;
                C9653kc c9653kc = new C9653kc(context, this.f6478b, reporterConfig, this.f6479c, new C9017K9(context));
                c9653kc.f7193i = new C9627jb(this.f6480d, c9653kc);
                C9219Sk c9219Sk = this.f6481e;
                C9383Zg c9383Zg = c9653kc.f7186b;
                if (c9219Sk != null) {
                    c9383Zg.f7617b.setUuid(c9219Sk.m5599g());
                } else {
                    c9383Zg.getClass();
                }
                c9653kc.mo5518l();
                this.f6483g.put(reporterConfig.apiKey, c9653kc);
                interfaceC9138Pa = c9653kc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC9138Pa;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9162Qa
    @NotNull
    /* renamed from: b */
    public final synchronized InterfaceC9209Sa mo5079b(@NotNull AppMetricaConfig appMetricaConfig) {
        AbstractC9177R2 c9772p6;
        try {
            c9772p6 = this.f6486j;
            if (c9772p6 == null) {
                Context context = this.f6477a;
                c9772p6 = new C9772p6(context, this.f6478b, appMetricaConfig, this.f6479c, new C9017K9(context));
                c9772p6.f7193i = new C9627jb(this.f6480d, c9772p6);
                C9219Sk c9219Sk = this.f6481e;
                C9383Zg c9383Zg = c9772p6.f7186b;
                if (c9219Sk != null) {
                    c9383Zg.f7617b.setUuid(c9219Sk.m5599g());
                } else {
                    c9383Zg.getClass();
                }
                c9772p6.m5514b(appMetricaConfig.errorEnvironment);
                c9772p6.mo5518l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c9772p6;
    }
}
