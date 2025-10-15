package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.G1 */
/* loaded from: classes7.dex */
public final class C8912G1 implements InterfaceC9842s1, InterfaceC9691m0 {

    /* renamed from: a */
    public boolean f6638a;

    /* renamed from: b */
    public final Context f6639b;

    /* renamed from: c */
    public volatile InterfaceC9817r1 f6640c;

    /* renamed from: d */
    public final C9795q4 f6641d;

    /* renamed from: e */
    public final C9081N1 f6642e;

    /* renamed from: f */
    public C9757og f6643f;

    /* renamed from: g */
    public final C9451ca f6644g;

    /* renamed from: h */
    public final C9729nd f6645h;

    /* renamed from: i */
    public final C9593i2 f6646i;

    /* renamed from: j */
    public final ICommonExecutor f6647j;

    /* renamed from: k */
    public final C8937H1 f6648k;

    /* renamed from: l */
    public final C8862E1 f6649l;

    /* renamed from: m */
    public final C10007yg f6650m;

    /* renamed from: n */
    public C9597i6 f6651n;

    @MainThread
    public C8912G1(@NonNull Context context, @NonNull InterfaceC9817r1 interfaceC9817r1) {
        this(context, interfaceC9817r1, new C9721n5(context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    /* renamed from: a */
    public final void mo5044a(Intent intent, int i) {
        m5209b(intent, i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    /* renamed from: b */
    public final void mo5047b(Intent intent) throws NumberFormatException {
        this.f6642e.m5425d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("io.appmetrica.analytics.IAppMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i = Integer.parseInt(data.getQueryParameter("pid"));
                this.f6641d.m6693a(i, encodedAuthority, data.getQueryParameter("psid"));
                this.f6646i.m6269a(i);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    /* renamed from: c */
    public final void mo5048c(Intent intent) {
        C9081N1 c9081n1 = this.f6642e;
        if (intent == null) {
            c9081n1.getClass();
            return;
        }
        c9081n1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c9081n1.f7006a.m6504a(action, Integer.valueOf(C9081N1.m5411a(intent)));
        }
        for (Map.Entry entry : c9081n1.f7007b.entrySet()) {
            InterfaceC9057M1 interfaceC9057M1 = (InterfaceC9057M1) entry.getKey();
            if (((InterfaceC9033L1) entry.getValue()).mo5340a(intent)) {
                interfaceC9057M1.mo5123a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C9676la.f8552C.m6382s().m6922a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    public final void onCreate() {
        if (this.f6638a) {
            C9676la.f8552C.m6382s().m6922a(this.f6639b.getResources().getConfiguration());
        } else {
            this.f6644g.m5961b(this.f6639b);
            C9676la c9676la = C9676la.f8552C;
            synchronized (c9676la) {
                c9676la.f8554B.initAsync();
                c9676la.f8575u.m6406b(c9676la.f8555a);
                c9676la.f8575u.m6405a(new C9614in(c9676la.f8554B));
                NetworkServiceLocator.init();
                c9676la.m6372i().m4951a(c9676la.f8571q);
                c9676la.m6364B();
            }
            AbstractC9710mj.f8655a.m6562e();
            C9687ll c9687ll = C9676la.f8552C.f8575u;
            C9637jl c9637jlM6404a = c9687ll.m6404a();
            C9637jl c9637jlM6404a2 = c9687ll.m6404a();
            C8855Dj c8855DjM6376m = C9676la.f8552C.m6376m();
            c8855DjM6376m.m5084a(new C9810qj(new C9044Lc(this.f6642e)), c9637jlM6404a2);
            c9687ll.m6405a(c8855DjM6376m);
            ((C8881Ek) C9676la.f8552C.m6387x()).getClass();
            this.f6642e.m5424c(new C8887F1(this));
            C9676la.f8552C.m6373j().init();
            C9198S c9198sM6385v = C9676la.f8552C.m6385v();
            Context context = this.f6639b;
            c9198sM6385v.f7216c = c9637jlM6404a;
            c9198sM6385v.mo5539b(context);
            C8937H1 c8937h1 = this.f6648k;
            Context context2 = this.f6639b;
            C9795q4 c9795q4 = this.f6641d;
            c8937h1.getClass();
            this.f6643f = new C9757og(context2, c9795q4, C9676la.f8552C.f8558d.m6970e(), new C9352Y9());
            AppMetrica.getReporter(this.f6639b, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File crashesDirectory = FileUtils.getCrashesDirectory(this.f6639b);
            if (crashesDirectory != null) {
                C8937H1 c8937h12 = this.f6648k;
                C8862E1 c8862e1 = this.f6649l;
                c8937h12.getClass();
                this.f6651n = new C9597i6(new FileObserverC9622j6(crashesDirectory, c8862e1, new C9352Y9()), crashesDirectory, new C9647k6());
                this.f6647j.execute(new RunnableC9656kf(crashesDirectory, this.f6649l, C9328X9.m5742a(this.f6639b)));
                C9597i6 c9597i6 = this.f6651n;
                C9647k6 c9647k6 = c9597i6.f8347c;
                File file = c9597i6.f8346b;
                c9647k6.getClass();
                if (file != null) {
                    if (!file.exists()) {
                        file.mkdir();
                    } else if (!file.isDirectory() && file.delete()) {
                        file.mkdir();
                    }
                }
                c9597i6.f8345a.startWatching();
            }
            C9729nd c9729nd = this.f6645h;
            Context context3 = this.f6639b;
            C9757og c9757og = this.f6643f;
            c9729nd.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            C9679ld c9679ld = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                c9729nd.f8730a.init(context3, new NativeCrashServiceConfig(absolutePath));
                C9679ld c9679ld2 = new C9679ld(c9757og, new C9704md(c9729nd));
                c9729nd.f8731b = c9679ld2;
                c9679ld2.m6394a(c9729nd.f8730a.getAllCrashes());
                NativeCrashServiceModule nativeCrashServiceModule = c9729nd.f8730a;
                C9679ld c9679ld3 = c9729nd.f8731b;
                if (c9679ld3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("crashReporter");
                } else {
                    c9679ld = c9679ld3;
                }
                nativeCrashServiceModule.setDefaultCrashHandler(c9679ld);
            }
            new RunnableC9085N5(CollectionsKt__CollectionsJVMKt.listOf(new RunnableC9882tg())).run();
            this.f6638a = true;
        }
        C9676la.f8552C.m6372i().m4950a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @MainThread
    public final void onDestroy() {
        C8772Ab c8772AbM6372i = C9676la.f8552C.m6372i();
        synchronized (c8772AbM6372i) {
            Iterator it = c8772AbM6372i.f6323c.iterator();
            while (it.hasNext()) {
                ((InterfaceC10010yj) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    public final void pauseUserSession(@NonNull Bundle bundle) {
        C9213Se c9213Se;
        bundle.setClassLoader(C9213Se.class.getClassLoader());
        String str = C9213Se.f7250c;
        try {
            c9213Se = (C9213Se) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c9213Se = null;
        }
        Integer asInteger = c9213Se != null ? c9213Se.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f6646i.m6270b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    public final void reportData(int i, Bundle bundle) {
        this.f6650m.getClass();
        List listEmptyList = (List) C9676la.f8552C.f8576v.f9051a.get(Integer.valueOf(i));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            ((InterfaceC9835rj) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    public final void resumeUserSession(@NonNull Bundle bundle) {
        C9213Se c9213Se;
        bundle.setClassLoader(C9213Se.class.getClassLoader());
        String str = C9213Se.f7250c;
        try {
            c9213Se = (C9213Se) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c9213Se = null;
        }
        Integer asInteger = c9213Se != null ? c9213Se.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f6646i.m6271c(asInteger.intValue());
        }
    }

    public C8912G1(Context context, InterfaceC9817r1 interfaceC9817r1, C9721n5 c9721n5) {
        this(context, interfaceC9817r1, new C9795q4(context, c9721n5), new C9081N1(), C9451ca.f7840d, C9676la.m6362h().m6367c(), C9676la.m6362h().m6384u().m6970e(), new C8937H1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    /* renamed from: a */
    public final void mo5045a(Intent intent, int i, int i2) {
        m5209b(intent, i2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    @WorkerThread
    /* renamed from: a */
    public final void mo5043a(Intent intent) {
        C9081N1 c9081n1 = this.f6642e;
        if (intent != null) {
            c9081n1.getClass();
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                c9081n1.f7006a.m6504a(action, Integer.valueOf(C9081N1.m5411a(intent)));
            }
            for (Map.Entry entry : c9081n1.f7007b.entrySet()) {
                InterfaceC9057M1 interfaceC9057M1 = (InterfaceC9057M1) entry.getKey();
                if (((InterfaceC9033L1) entry.getValue()).mo5340a(intent)) {
                    interfaceC9057M1.mo5123a(intent);
                }
            }
            return;
        }
        c9081n1.getClass();
    }

    public C8912G1(Context context, InterfaceC9817r1 interfaceC9817r1, C9795q4 c9795q4, C9081N1 c9081n1, C9451ca c9451ca, C9593i2 c9593i2, IHandlerExecutor iHandlerExecutor, C8937H1 c8937h1) {
        this.f6638a = false;
        this.f6649l = new C8862E1(this);
        this.f6639b = context;
        this.f6640c = interfaceC9817r1;
        this.f6641d = c9795q4;
        this.f6642e = c9081n1;
        this.f6644g = c9451ca;
        this.f6646i = c9593i2;
        this.f6647j = iHandlerExecutor;
        this.f6648k = c8937h1;
        this.f6645h = C9676la.m6362h().m6378o();
        this.f6650m = new C10007yg();
    }

    @WorkerThread
    /* renamed from: a */
    public final void m5207a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C9252U5.m5640b(bundle);
        C9757og c9757og = this.f6643f;
        C9252U5 c9252u5M5640b = C9252U5.m5640b(bundle);
        c9757og.getClass();
        if (c9252u5M5640b.m5667m()) {
            return;
        }
        c9757og.f8854b.execute(new RunnableC8927Gg(c9757og.f8853a, c9252u5M5640b, bundle, c9757og.f8855c));
    }

    /* renamed from: b */
    public final void m5209b(Intent intent, int i) {
        Bundle extras;
        C9370Z3 c9370z3M5794a;
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null && (c9370z3M5794a = C9370Z3.m5794a(this.f6639b, (extras = intent.getExtras()))) != null) {
                C9252U5 c9252u5M5640b = C9252U5.m5640b(extras);
                if (!(c9252u5M5640b.m5666l() | c9252u5M5640b.m5667m())) {
                    try {
                        C9757og c9757og = this.f6643f;
                        C9520f4 c9520f4M6080a = C9520f4.m6080a(c9370z3M5794a);
                        C8865E4 c8865e4 = new C8865E4(c9370z3M5794a);
                        c9757og.f8855c.m6692a(c9520f4M6080a, c8865e4).mo5290a(c9252u5M5640b, c8865e4);
                        c9757og.f8855c.m6693a(c9520f4M6080a.f8054c.intValue(), c9520f4M6080a.f8053b, c9520f4M6080a.f8055d);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        ((C9767p1) this.f6640c).f8867a.stopSelfResult(i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: a */
    public final void mo5046a(@NonNull InterfaceC9817r1 interfaceC9817r1) {
        this.f6640c = interfaceC9817r1;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m5208a(@NonNull File file) {
        C9757og c9757og = this.f6643f;
        c9757og.getClass();
        C9602ib c9602ib = new C9602ib();
        c9757og.f8854b.execute(new RunnableC9631jf(file, c9602ib, c9602ib, new C9657kg(c9757og)));
    }
}
