package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.q0 */
/* loaded from: classes6.dex */
public final class C9791q0 implements InterfaceC9185Ra {

    /* renamed from: e */
    public static volatile C9791q0 f8913e;

    /* renamed from: f */
    public static volatile boolean f8914f;

    /* renamed from: g */
    public static volatile boolean f8915g;

    /* renamed from: a */
    public final Context f8916a;

    /* renamed from: b */
    public final C9666l0 f8917b;

    /* renamed from: c */
    public final FutureTask f8918c;

    /* renamed from: d */
    public final InterfaceC10026za f8919d;

    @AnyThread
    public C9791q0(@NonNull Context context) {
        this.f8916a = context;
        C9666l0 c9666l0M6728b = C9820r4.m6725i().m6728b();
        this.f8917b = c9666l0M6728b;
        this.f8919d = c9666l0M6728b.m6348a(context, C9820r4.m6725i().m6732e());
        this.f8918c = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.q0$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m6688p();
            }
        });
    }

    @NonNull
    @AnyThread
    /* renamed from: a */
    public static C9791q0 m6658a(@NonNull Context context, boolean z) {
        C9791q0 c9791q0 = f8913e;
        if (c9791q0 == null) {
            synchronized (C9791q0.class) {
                try {
                    c9791q0 = f8913e;
                    if (c9791q0 == null) {
                        c9791q0 = new C9791q0(context);
                        c9791q0.m6677b(z);
                        C9820r4.m6725i().f8968c.m6201a().execute(new RunnableC9766p0(c9791q0));
                        f8913e = c9791q0;
                    }
                } finally {
                }
            }
        }
        return c9791q0;
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        m6663g().clearAppEnvironment();
    }

    /* renamed from: g */
    public static InterfaceC9878tc m6663g() {
        return m6666n() ? f8913e.m6687k() : C9820r4.m6725i().f8967b;
    }

    @AnyThread
    /* renamed from: l */
    public static synchronized boolean m6664l() {
        return f8914f;
    }

    @AnyThread
    /* renamed from: m */
    public static boolean m6665m() {
        return f8915g;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001d  */
    @AnyThread
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized boolean m6666n() {
        boolean z;
        C9791q0 c9791q0 = f8913e;
        if (c9791q0 == null || !c9791q0.f8918c.isDone()) {
            z = false;
        } else if (c9791q0.m6687k().mo4949j() != null) {
            z = true;
        }
        return z;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: o */
    public static synchronized void m6667o() {
        f8913e = null;
        f8914f = false;
        f8915g = false;
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String str, String str2) {
        m6663g().putAppEnvironmentValue(str, str2);
    }

    @AnyThread
    /* renamed from: q */
    public static synchronized void m6668q() {
        f8914f = true;
    }

    @AnyThread
    /* renamed from: r */
    public static void m6669r() {
        f8915g = true;
    }

    @Nullable
    @AnyThread
    /* renamed from: s */
    public static C9791q0 m6670s() {
        return f8913e;
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean z) {
        m6663g().setDataSendingEnabled(z);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String str) {
        m6663g().setUserProfileID(str);
    }

    /* renamed from: b */
    public final void m6677b(boolean z) {
        final C9820r4 c9820r4M6725i = C9820r4.m6725i();
        Executor executorM6201a = z ? c9820r4M6725i.f8968c.m6201a() : new BlockingExecutor();
        executorM6201a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.q0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m6675a(c9820r4M6725i);
            }
        });
        executorM6201a.execute(this.f8918c);
    }

    @AnyThread
    /* renamed from: c */
    public final void m6680c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.f8919d.mo6320a(appMetricaConfig, this);
    }

    @WorkerThread
    /* renamed from: d */
    public final void m6682d(@NonNull AppMetricaConfig appMetricaConfig) {
        m6687k().mo4936a(appMetricaConfig);
    }

    @Nullable
    @AnyThread
    /* renamed from: f */
    public final String m6683f() {
        return m6687k().mo4946f();
    }

    @Nullable
    @AnyThread
    /* renamed from: h */
    public final Map<String, String> m6684h() {
        return m6687k().mo4947h();
    }

    @NonNull
    @AnyThread
    /* renamed from: i */
    public final AdvIdentifiersResult m6685i() {
        return m6687k().mo4948i();
    }

    @Nullable
    @WorkerThread
    /* renamed from: j */
    public final C9378Zb m6686j() {
        return m6687k().mo4949j();
    }

    /* renamed from: k */
    public final InterfaceC8771Aa m6687k() {
        try {
            return (InterfaceC8771Aa) this.f8918c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: p */
    public final InterfaceC8771Aa m6688p() {
        InterfaceC8771Aa interfaceC8771Aa;
        C9666l0 c9666l0 = this.f8917b;
        Context context = this.f8916a;
        InterfaceC10026za interfaceC10026za = this.f8919d;
        synchronized (c9666l0) {
            try {
                if (c9666l0.f8537d == null) {
                    if (c9666l0.m6349a(context)) {
                        c9666l0.f8537d = new C9941w0();
                    } else {
                        c9666l0.f8537d = new C9891u0(context, interfaceC10026za);
                    }
                }
                interfaceC8771Aa = c9666l0.f8537d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8771Aa;
    }

    @NonNull
    @WorkerThread
    /* renamed from: c */
    public final InterfaceC9138Pa m6678c(@NonNull ReporterConfig reporterConfig) {
        return m6687k().mo4943c(reporterConfig);
    }

    @NonNull
    @AnyThread
    /* renamed from: d */
    public final C9280V9 m6681d() {
        return m6687k().mo4944d();
    }

    @NonNull
    @AnyThread
    /* renamed from: c */
    public final C9870t4 m6679c() {
        return this.f8919d.mo6319a();
    }

    @WorkerThread
    /* renamed from: a */
    public static void m6659a(@Nullable Location location) {
        m6663g().mo4935a(location);
    }

    @WorkerThread
    /* renamed from: a */
    public static void m6662a(boolean z) {
        m6663g().mo4942a(z);
    }

    @WorkerThread
    /* renamed from: b */
    public final void m6676b() {
        m6687k().mo4945e();
    }

    @WorkerThread
    /* renamed from: a */
    public static void m6661a(String str, String str2) {
        m6663g().mo4941a(str, str2);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m6672a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m6687k().mo4938a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m6671a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m6687k().mo4937a(deferredDeeplinkListener);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m6673a(@NonNull ReporterConfig reporterConfig) {
        m6687k().mo4939a(reporterConfig);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m6674a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        m6687k().mo4940a(startupParamsCallback, list);
    }

    /* renamed from: a */
    public final void m6675a(C9820r4 c9820r4) {
        c9820r4.f8982q.m5853a(this.f8916a);
        new C9670l4(this.f8916a).m6896a(this.f8916a);
        C9820r4.m6725i().m6726a(this.f8916a).m5808a();
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public static synchronized void m6660a(@Nullable C9791q0 c9791q0) {
        f8913e = c9791q0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9185Ra
    @NonNull
    /* renamed from: a */
    public final InterfaceC9162Qa mo4933a() {
        return m6687k().mo4933a();
    }
}
