package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.el */
/* loaded from: classes6.dex */
public final class C9512el extends AbstractC9180R5 {

    /* renamed from: b */
    public final C9178R3 f8030b;

    public C9512el(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C9676la.m6362h().m6368d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC9180R5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C9537fl load(@NonNull C9157Q5 c9157q5) {
        C9537fl c9537fl = (C9537fl) super.load(c9157q5);
        C9637jl c9637jl = c9157q5.f7143a;
        c9537fl.f8136d = c9637jl.f8457f;
        c9537fl.f8137e = c9637jl.f8458g;
        C9487dl c9487dl = (C9487dl) c9157q5.componentArguments;
        String str = c9487dl.f7965a;
        if (str != null) {
            c9537fl.f8138f = str;
            c9537fl.f8139g = c9487dl.f7966b;
        }
        Map<String, String> map = c9487dl.f7967c;
        c9537fl.f8140h = map;
        c9537fl.f8141i = (C8987J3) this.f8030b.m5434a(new C8987J3(map, EnumC9159Q7.f7146c));
        C9487dl c9487dl2 = (C9487dl) c9157q5.componentArguments;
        c9537fl.f8143k = c9487dl2.f7968d;
        c9537fl.f8142j = c9487dl2.f7969e;
        C9637jl c9637jl2 = c9157q5.f7143a;
        c9537fl.f8144l = c9637jl2.f8467p;
        c9537fl.f8145m = c9637jl2.f8469r;
        long j = c9637jl2.f8473v;
        if (c9537fl.f8146n == 0) {
            c9537fl.f8146n = j;
        }
        return c9537fl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C9537fl();
    }

    public C9512el(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull C9178R3 c9178r3) {
        super(context, str, safePackageManager);
        this.f8030b = c9178r3;
    }

    @NonNull
    /* renamed from: a */
    public final C9537fl m6068a() {
        return new C9537fl();
    }
}
