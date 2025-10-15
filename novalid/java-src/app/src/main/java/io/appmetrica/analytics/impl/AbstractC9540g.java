package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g */
/* loaded from: classes5.dex */
public abstract class AbstractC9540g {

    /* renamed from: a */
    public final C9571h5 f8152a;

    /* renamed from: b */
    public final C9314Wj f8153b;

    /* renamed from: c */
    public final C9411ak f8154c;

    /* renamed from: d */
    public final C9290Vj f8155d;

    /* renamed from: e */
    public final InterfaceC9138Pa f8156e;

    /* renamed from: f */
    public final SystemTimeProvider f8157f;

    public AbstractC9540g(@NonNull C9571h5 c9571h5, @NonNull C9314Wj c9314Wj, @NonNull C9411ak c9411ak, @NonNull C9290Vj c9290Vj, @NonNull InterfaceC9138Pa interfaceC9138Pa, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f8152a = c9571h5;
        this.f8153b = c9314Wj;
        this.f8154c = c9411ak;
        this.f8155d = c9290Vj;
        this.f8156e = interfaceC9138Pa;
        this.f8157f = systemTimeProvider;
    }

    @NonNull
    /* renamed from: a */
    public final /* bridge */ C9003Jj m6153a(@NonNull Object obj) {
        return m6152a((C9027Kj) obj);
    }

    @Nullable
    /* renamed from: b */
    public final C9003Jj m6155b() {
        if (this.f8154c.m5876h()) {
            return new C9003Jj(this.f8152a, this.f8154c, m6154a(), this.f8157f);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public final C9003Jj m6152a(@NonNull C9027Kj c9027Kj) {
        if (this.f8154c.m5876h()) {
            this.f8156e.reportEvent("create session with non-empty storage");
        }
        C9571h5 c9571h5 = this.f8152a;
        C9411ak c9411ak = this.f8154c;
        long jM5720a = this.f8153b.m5720a();
        C9411ak c9411ak2 = this.f8154c;
        c9411ak2.m5865a(C9411ak.f7734f, Long.valueOf(jM5720a));
        c9411ak2.m5865a(C9411ak.f7732d, Long.valueOf(c9027Kj.f6913a));
        c9411ak2.m5865a(C9411ak.f7736h, Long.valueOf(c9027Kj.f6913a));
        c9411ak2.m5865a(C9411ak.f7735g, 0L);
        c9411ak2.m5865a(C9411ak.f7737i, Boolean.TRUE);
        c9411ak2.m5867b();
        this.f8152a.f8233f.m5394a(jM5720a, this.f8155d.f7375a, TimeUnit.MILLISECONDS.toSeconds(c9027Kj.f6914b));
        return new C9003Jj(c9571h5, c9411ak, m6154a(), new SystemTimeProvider());
    }

    /* renamed from: a */
    public final C9075Mj m6154a() {
        C9051Lj c9051Lj = new C9051Lj(this.f8155d);
        c9051Lj.f6947g = this.f8154c.m5877i();
        c9051Lj.f6946f = this.f8154c.f7740c.m5912a(C9411ak.f7735g);
        c9051Lj.f6944d = this.f8154c.f7740c.m5912a(C9411ak.f7736h);
        c9051Lj.f6943c = this.f8154c.f7740c.m5912a(C9411ak.f7734f);
        c9051Lj.f6948h = this.f8154c.f7740c.m5912a(C9411ak.f7732d);
        c9051Lj.f6941a = this.f8154c.f7740c.m5912a(C9411ak.f7733e);
        return new C9075Mj(c9051Lj);
    }
}
