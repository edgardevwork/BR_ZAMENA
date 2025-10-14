package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.fc */
/* loaded from: classes6.dex */
public final class C9528fc extends C9571h5 implements InterfaceC9018Ka, InterfaceC8994Ja {

    /* renamed from: A */
    public final C9619j3 f8114A;

    /* renamed from: x */
    public final C8851Df f8115x;

    /* renamed from: y */
    public final C8951Hf f8116y;

    /* renamed from: z */
    public final C8892F6 f8117z;

    public C9528fc(@NonNull Context context, @NonNull C9637jl c9637jl, @NonNull C9396a5 c9396a5, @NonNull C8840D4 c8840d4, @NonNull C8851Df c8851Df, @NonNull C8892F6 c8892f6, @NonNull AbstractC9521f5 abstractC9521f5) {
        this(context, c9396a5, c9637jl, c8840d4, new C9516f0(), new TimePassedChecker(), new C9553gc(context, c9396a5, c8840d4, abstractC9521f5, c9637jl, new C9403ac(c8892f6), C9676la.m6362h().m6384u().m6969d(), PackageManagerUtils.getAppVersionCodeInt(context), C9676la.m6362h().m6384u(), C9676la.m6362h().m6372i()), c8851Df, c8892f6);
    }

    @Override // io.appmetrica.analytics.impl.C9571h5
    /* renamed from: C */
    public final void mo6124C() {
        this.f8115x.m5070a(this.f8116y);
    }

    /* renamed from: D */
    public final boolean m6125D() {
        boolean zOptBoolean;
        C9964wn c9964wn = this.f8249v;
        synchronized (c9964wn) {
            zOptBoolean = c9964wn.f9286a.m6979a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C9571h5, io.appmetrica.analytics.impl.InterfaceC9090Na, io.appmetrica.analytics.impl.InterfaceC8821Ca
    /* renamed from: a */
    public final synchronized void mo5023a(@NonNull C8840D4 c8840d4) {
        super.mo5023a(c8840d4);
        this.f8117z.m5126a(c8840d4.f6453i);
    }

    @Override // io.appmetrica.analytics.impl.C9571h5, io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    /* renamed from: c */
    public final CounterConfigurationReporterType mo5025c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C9571h5, io.appmetrica.analytics.impl.InterfaceC9090Na, io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public final void mo5381a(@NonNull C9637jl c9637jl) {
        synchronized (this) {
            this.f8239l.m6882a(c9637jl);
            this.f8244q.m6633b();
        }
        this.f8114A.mo5082a(c9637jl);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8994Ja
    /* renamed from: a */
    public final void mo4972a() {
        C9964wn c9964wn = this.f8249v;
        synchronized (c9964wn) {
            C9989xn c9989xn = c9964wn.f9286a;
            c9989xn.m6980a(c9989xn.m6979a().put("referrer_handled", true));
        }
    }

    public C9528fc(Context context, C9396a5 c9396a5, C9637jl c9637jl, C8840D4 c8840d4, C9516f0 c9516f0, TimePassedChecker timePassedChecker, C9553gc c9553gc, C8851Df c8851Df, C8892F6 c8892f6) {
        super(context, c9396a5, c9516f0, timePassedChecker, c9553gc);
        this.f8115x = c8851Df;
        C9303W8 c9303w8M6213j = m6213j();
        c9303w8M6213j.m5712a(EnumC9329Xa.EVENT_TYPE_REGULAR, new C9382Zf(c9303w8M6213j.m5713b()));
        this.f8116y = c9553gc.m6183b(this);
        this.f8117z = c8892f6;
        C9619j3 c9619j3M6182a = c9553gc.m6182a(this);
        this.f8114A = c9619j3M6182a;
        c9619j3M6182a.m6299a(c9637jl, c8840d4.f6457m);
    }
}
