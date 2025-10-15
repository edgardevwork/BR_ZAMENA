package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.rg */
/* loaded from: classes6.dex */
public final class C9832rg extends AbstractC9632jg {

    /* renamed from: b */
    public final C9964wn f9013b;

    public C9832rg(@NonNull C9571h5 c9571h5) {
        this(c9571h5, c9571h5.m6224u());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        C9571h5 c9571h5 = this.f8444a;
        if (this.f9013b.m6945c()) {
            return false;
        }
        if (!this.f9013b.m6946d()) {
            C9625j9 c9625j9 = c9571h5.f8242o;
            c9625j9.f8421c.m5756b(C9252U5.m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C9964wn c9964wn = this.f9013b;
        synchronized (c9964wn) {
            C9989xn c9989xn = c9964wn.f9286a;
            c9989xn.m6980a(c9989xn.m6979a().put("first_event_done", true));
        }
        return false;
    }

    public C9832rg(C9571h5 c9571h5, C9964wn c9964wn) {
        super(c9571h5);
        this.f9013b = c9964wn;
    }
}
