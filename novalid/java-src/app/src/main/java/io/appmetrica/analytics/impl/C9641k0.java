package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.k0 */
/* loaded from: classes6.dex */
public final class C9641k0 implements InterfaceC10026za {

    /* renamed from: a */
    public final Context f8482a;

    /* renamed from: b */
    public final IHandlerExecutor f8483b;

    /* renamed from: c */
    public final C9870t4 f8484c = new C9870t4();

    /* renamed from: d */
    public final Handler f8485d = m6324f().getHandler();

    /* renamed from: e */
    public final C9248U1 f8486e = new C9248U1();

    /* renamed from: f */
    public final C9552gb f8487f = new C9552gb();

    public C9641k0(@NotNull Context context, @NotNull C9570h4 c9570h4) {
        this.f8482a = context;
        this.f8483b = c9570h4.m6201a();
        BaseReleaseLogger.init(context);
        m6324f().execute(new Runnable() { // from class: io.appmetrica.analytics.impl.k0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C9641k0.m6318e();
            }
        });
        mo6319a().m6817a();
        AbstractC9322X3.m5729a().onCreate();
    }

    /* renamed from: e */
    public static final void m6318e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.3.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 05.11.2024.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NotNull
    /* renamed from: a */
    public final C9870t4 mo6319a() {
        return this.f8484c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NotNull
    /* renamed from: b */
    public final Handler mo6321b() {
        return this.f8485d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NotNull
    /* renamed from: c */
    public final C9248U1 mo6322c() {
        return this.f8486e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NotNull
    /* renamed from: d */
    public final C9552gb mo6323d() {
        return this.f8487f;
    }

    @NotNull
    /* renamed from: f */
    public final IHandlerExecutor m6324f() {
        return this.f8483b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    public final ICommonExecutor getDefaultExecutor() {
        return this.f8483b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void mo6320a(@Nullable AppMetricaConfig appMetricaConfig, @NotNull InterfaceC9185Ra interfaceC9185Ra) {
        try {
            if (!C9791q0.f8915g) {
                if (appMetricaConfig == null) {
                    this.f8487f.m6181c();
                    this.f8487f.m6180b();
                    if (appMetricaConfig != null) {
                        this.f8487f.m6179a(this.f8482a, appMetricaConfig, interfaceC9185Ra);
                    }
                    if (appMetricaConfig == null) {
                        this.f8486e.m5626b();
                        if (appMetricaConfig != null) {
                            C9791q0.f8915g = true;
                        }
                    } else {
                        Boolean bool = appMetricaConfig.appOpenTrackingEnabled;
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        if (bool.booleanValue()) {
                            this.f8486e.m5626b();
                            if (appMetricaConfig != null) {
                            }
                        } else {
                            this.f8486e.m5627c();
                            if (appMetricaConfig != null) {
                            }
                        }
                    }
                } else {
                    Boolean bool2 = appMetricaConfig.crashReporting;
                    if (bool2 == null) {
                        bool2 = Boolean.TRUE;
                    }
                    if (bool2.booleanValue()) {
                        this.f8487f.m6181c();
                        this.f8487f.m6180b();
                        if (appMetricaConfig != null) {
                        }
                        if (appMetricaConfig == null) {
                        }
                    } else {
                        this.f8487f.m6178a();
                        if (appMetricaConfig == null) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
