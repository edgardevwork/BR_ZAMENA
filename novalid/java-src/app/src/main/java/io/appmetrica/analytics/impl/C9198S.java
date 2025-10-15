package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.S */
/* loaded from: classes8.dex */
public final class C9198S implements InterfaceC10001ya {

    /* renamed from: a */
    public final String f7214a;

    /* renamed from: b */
    public final Object f7215b;

    /* renamed from: c */
    public C9637jl f7216c;

    /* renamed from: d */
    public volatile FutureTask f7217d;

    /* renamed from: e */
    public final InterfaceC9103O f7218e;

    /* renamed from: f */
    public final InterfaceC9103O f7219f;

    /* renamed from: g */
    public final InterfaceC9103O f7220g;

    /* renamed from: h */
    public final InterfaceC8835D f7221h;

    /* renamed from: i */
    public final InterfaceC8835D f7222i;

    /* renamed from: j */
    public final InterfaceC8835D f7223j;

    /* renamed from: k */
    public Context f7224k;

    /* renamed from: l */
    public final ICommonExecutor f7225l;

    /* renamed from: m */
    public volatile AdvertisingIdsHolder f7226m;

    public C9198S(@NonNull InterfaceC9103O interfaceC9103O, @NonNull InterfaceC9103O interfaceC9103O2, @NonNull InterfaceC9103O interfaceC9103O3, @NonNull ICommonExecutor iCommonExecutor, String str) {
        this(interfaceC9103O, interfaceC9103O2, interfaceC9103O3, iCommonExecutor, new C8910G(new C9190Rf("google")), new C8910G(new C9190Rf("huawei")), new C8910G(new C9190Rf("yandex")), str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10001ya
    /* renamed from: a */
    public final void mo5537a(@NonNull Context context, @Nullable C9637jl c9637jl) {
        this.f7216c = c9637jl;
        mo5539b(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10001ya
    /* renamed from: b */
    public final void mo5539b(@NonNull Context context) {
        this.f7224k = context.getApplicationContext();
        if (this.f7217d == null) {
            synchronized (this.f7215b) {
                try {
                    if (this.f7217d == null) {
                        this.f7217d = new FutureTask(new CallableC8983J(this));
                        this.f7225l.execute(this.f7217d);
                    }
                } finally {
                }
            }
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: c */
    public final InterfaceC9103O m5540c() {
        return this.f7219f;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: d */
    public final String m5541d() {
        return this.f7214a;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: e */
    public final InterfaceC9103O m5542e() {
        return this.f7220g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NonNull
    public final AdvertisingIdsHolder getIdentifiers(@NonNull Context context) throws ExecutionException, InterruptedException {
        mo5539b(context);
        try {
            this.f7217d.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f7226m;
    }

    public C9198S(InterfaceC9103O interfaceC9103O, InterfaceC9103O interfaceC9103O2, InterfaceC9103O interfaceC9103O3, ICommonExecutor iCommonExecutor, C8910G c8910g, C8910G c8910g2, C8910G c8910g3, String str) {
        this.f7215b = new Object();
        this.f7218e = interfaceC9103O;
        this.f7219f = interfaceC9103O2;
        this.f7220g = interfaceC9103O3;
        this.f7221h = c8910g;
        this.f7222i = c8910g2;
        this.f7223j = c8910g3;
        this.f7225l = iCommonExecutor;
        this.f7226m = new AdvertisingIdsHolder();
        this.f7214a = "[AdvertisingIdGetter" + str + "]";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10001ya, io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final void mo5082a(@NonNull C9637jl c9637jl) {
        this.f7216c = c9637jl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10001ya
    @NonNull
    /* renamed from: a */
    public final AdvertisingIdsHolder mo5535a(@NonNull Context context) {
        return mo5536a(context, new C9879td());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10001ya
    @NonNull
    /* renamed from: a */
    public final AdvertisingIdsHolder mo5536a(@NonNull Context context, @NonNull InterfaceC9360Yh interfaceC9360Yh) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new CallableC9007K(this, context.getApplicationContext(), interfaceC9360Yh));
        this.f7225l.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f7226m;
    }

    /* renamed from: b */
    public static AdTrackingInfoResult m5533b(C9198S c9198s, Context context) {
        if (c9198s.f7219f.mo5339a(c9198s.f7216c)) {
            return c9198s.f7222i.mo5041a(context);
        }
        C9637jl c9637jl = c9198s.f7216c;
        if (c9637jl != null && c9637jl.f8467p) {
            if (!c9637jl.f8465n.f6315e) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m5532a(C9198S c9198s, Context context) {
        if (c9198s.f7218e.mo5339a(c9198s.f7216c)) {
            return c9198s.f7221h.mo5041a(context);
        }
        C9637jl c9637jl = c9198s.f7216c;
        if (c9637jl != null && c9637jl.f8467p) {
            if (!c9637jl.f8465n.f6313c) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: b */
    public final InterfaceC9103O m5538b() {
        return this.f7218e;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public final ICommonExecutor m5534a() {
        return this.f7225l;
    }
}
