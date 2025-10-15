package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.h6 */
/* loaded from: classes7.dex */
public final class C9572h6 extends C9582hg {

    /* renamed from: f */
    public final Context f8251f;

    /* renamed from: g */
    public final C9168Qg f8252g;

    /* renamed from: h */
    public final C9282Vb f8253h;

    /* renamed from: i */
    public final C9797q6 f8254i;

    public C9572h6(@NotNull Context context, @NotNull C9616j0 c9616j0, @Nullable InterfaceC9511ek interfaceC9511ek, @NotNull C9168Qg c9168Qg) {
        super(c9616j0, interfaceC9511ek, c9168Qg);
        this.f8251f = context;
        this.f8252g = c9168Qg;
        this.f8253h = C9820r4.m6725i().m6736j();
        this.f8254i = new C9797q6(context);
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m6230a(@NotNull C9168Qg c9168Qg) {
        if (c9168Qg.f7161a.f7315g != 0) {
            this.f8254i.m6694a(c9168Qg);
            return;
        }
        Intent intentM5186a = AbstractC8905Fj.m5186a(this.f8251f);
        C9252U5 c9252u5 = c9168Qg.f7161a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 5890;
        intentM5186a.putExtras(c9252u5.m5658d(c9168Qg.f7165e.m5812c()));
        try {
            this.f8251f.startService(intentM5186a);
        } catch (Throwable unused) {
            this.f8254i.m6694a(c9168Qg);
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg
    /* renamed from: c */
    public final boolean mo5576c() {
        m6230a(this.f8252g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mo5572a();
        return Unit.INSTANCE;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg
    /* renamed from: a */
    public final synchronized void mo5572a() {
        try {
            if (this.f7256c) {
                return;
            }
            this.f7256c = true;
            if (this.f8253h.m5690a("AppMetrica")) {
                this.f8254i.m6694a(this.f8252g);
            } else {
                this.f7254a.m6298c();
                this.f7256c = false;
                super.mo5572a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
