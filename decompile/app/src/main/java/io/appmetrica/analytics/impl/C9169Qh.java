package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Qh */
/* loaded from: classes6.dex */
public final class C9169Qh implements InterfaceC9835rj {

    /* renamed from: a */
    public final C9616j0 f7166a;

    /* renamed from: b */
    public final C9760oj f7167b;

    /* renamed from: c */
    public final ICommonExecutor f7168c;

    public C9169Qh(@NonNull C9616j0 c9616j0, @NonNull C9760oj c9760oj) {
        this(c9616j0, c9760oj, C9820r4.m6725i().m6732e().m6202b());
    }

    /* renamed from: a */
    public final void m5501a(C9168Qg c9168Qg) {
        Callable c9582hg;
        ICommonExecutor iCommonExecutor = this.f7168c;
        if (c9168Qg.f7162b) {
            C9760oj c9760oj = this.f7167b;
            c9582hg = new C9572h6(c9760oj.f8860a, c9760oj.f8861b, c9760oj.f8862c, c9168Qg);
        } else {
            C9760oj c9760oj2 = this.f7167b;
            c9582hg = new C9582hg(c9760oj2.f8861b, c9760oj2.f8862c, c9168Qg);
        }
        iCommonExecutor.submit(c9582hg);
    }

    /* renamed from: b */
    public final void m5503b(@NonNull C9168Qg c9168Qg) {
        C9760oj c9760oj = this.f7167b;
        C9572h6 c9572h6 = new C9572h6(c9760oj.f8860a, c9760oj.f8861b, c9760oj.f8862c, c9168Qg);
        if (this.f7166a.m6296a()) {
            try {
                this.f7168c.submit(c9572h6).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c9572h6.f7256c) {
            return;
        }
        try {
            c9572h6.mo5572a();
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9835rj
    public final void reportData(int i, @NonNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f7168c;
        C9760oj c9760oj = this.f7167b;
        iCommonExecutor.submit(new C9078Mm(c9760oj.f8861b, c9760oj.f8862c, i, bundle));
    }

    public C9169Qh(C9616j0 c9616j0, C9760oj c9760oj, ICommonExecutor iCommonExecutor) {
        this.f7168c = iCommonExecutor;
        this.f7167b = c9760oj;
        this.f7166a = c9616j0;
    }

    /* renamed from: b */
    public final void m5504b(@NonNull C9213Se c9213Se) {
        ICommonExecutor iCommonExecutor = this.f7168c;
        C9760oj c9760oj = this.f7167b;
        iCommonExecutor.submit(new C9312Wh(c9760oj.f8861b, c9760oj.f8862c, c9213Se));
    }

    /* renamed from: a */
    public final void m5502a(@NonNull C9213Se c9213Se) {
        ICommonExecutor iCommonExecutor = this.f7168c;
        C9760oj c9760oj = this.f7167b;
        iCommonExecutor.submit(new C9069Md(c9760oj.f8861b, c9760oj.f8862c, c9213Se));
    }
}
