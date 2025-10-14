package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ed */
/* loaded from: classes8.dex */
public abstract class AbstractC9504ed implements InterfaceC9489dn, InterfaceC9643k2 {

    /* renamed from: a */
    public final String f8004a;

    /* renamed from: b */
    public final int f8005b;

    /* renamed from: c */
    public final InterfaceC9839rn f8006c;

    /* renamed from: d */
    public final AbstractC9201S2 f8007d;

    /* renamed from: e */
    public PublicLogger f8008e = PublicLogger.getAnonymousInstance();

    public AbstractC9504ed(int i, String str, InterfaceC9839rn interfaceC9839rn, AbstractC9201S2 abstractC9201S2) {
        this.f8005b = i;
        this.f8004a = str;
        this.f8006c = interfaceC9839rn;
        this.f8007d = abstractC9201S2;
    }

    @NonNull
    /* renamed from: a */
    public final C9514en m6055a() {
        C9514en c9514en = new C9514en();
        c9514en.f8037b = this.f8005b;
        c9514en.f8036a = this.f8004a.getBytes();
        c9514en.f8039d = new C9564gn();
        c9514en.f8038c = new C9539fn();
        return c9514en;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9489dn
    /* renamed from: a */
    public abstract /* synthetic */ void mo5257a(@NonNull C9464cn c9464cn);

    @NonNull
    /* renamed from: b */
    public final AbstractC9201S2 m6057b() {
        return this.f8007d;
    }

    @NonNull
    /* renamed from: c */
    public final String m6058c() {
        return this.f8004a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: d */
    public final InterfaceC9839rn m6059d() {
        return this.f8006c;
    }

    /* renamed from: e */
    public final int m6060e() {
        return this.f8005b;
    }

    /* renamed from: f */
    public final boolean m6061f() {
        C9789pn c9789pnMo5086a = this.f8006c.mo5086a(this.f8004a);
        if (c9789pnMo5086a.f8908a) {
            return true;
        }
        this.f8008e.warning("Attribute " + this.f8004a + " of type " + ((String) AbstractC9102Nm.f7043a.get(this.f8005b)) + " is skipped because " + c9789pnMo5086a.f8909b, new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final void m6056a(@NonNull PublicLogger publicLogger) {
        this.f8008e = publicLogger;
    }
}
