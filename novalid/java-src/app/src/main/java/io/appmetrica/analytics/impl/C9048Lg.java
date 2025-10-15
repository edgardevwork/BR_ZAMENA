package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Lg */
/* loaded from: classes6.dex */
public final class C9048Lg extends AbstractC9632jg {
    public C9048Lg(C9571h5 c9571h5) {
        super(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        this.f8444a.f8244q.m6633b();
        C9338Xj c9338Xj = this.f8444a.f8238k;
        synchronized (c9338Xj) {
            try {
                C9003Jj c9003JjM5756b = c9338Xj.m5756b(c9252u5);
                if (c9003JjM5756b.f6836g) {
                    c9003JjM5756b.f6836g = false;
                    C9411ak c9411ak = c9003JjM5756b.f6831b;
                    c9411ak.m5865a(C9411ak.f7737i, Boolean.FALSE);
                    c9411ak.m5867b();
                }
                if (c9338Xj.f7539h != 1) {
                    c9338Xj.m5755a(c9338Xj.f7538g, c9252u5);
                }
                c9338Xj.f7539h = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}
