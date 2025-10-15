package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.If */
/* loaded from: classes6.dex */
public final class C8975If implements InterfaceC8826Cf {

    /* renamed from: a */
    public final HashSet f6785a;

    /* renamed from: b */
    public boolean f6786b;

    /* renamed from: c */
    public C8901Ff f6787c;

    public C8975If() {
        this(C9676la.m6362h().m6381r());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8826Cf
    /* renamed from: a */
    public final synchronized void mo5031a(@Nullable C8901Ff c8901Ff) {
        try {
            this.f6787c = c8901Ff;
            this.f6786b = true;
            Iterator it = this.f6785a.iterator();
            while (it.hasNext()) {
                ((InterfaceC9931vf) it.next()).mo5002a(this.f6787c);
            }
            this.f6785a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C8975If(C8851Df c8851Df) {
        this.f6785a = new HashSet();
        c8851Df.m5070a(new C8806Bk(this));
        c8851Df.m5068a();
    }

    /* renamed from: a */
    public final synchronized void m5274a(@NonNull InterfaceC9931vf interfaceC9931vf) {
        this.f6785a.add(interfaceC9931vf);
        if (this.f6786b) {
            interfaceC9931vf.mo5002a(this.f6787c);
            this.f6785a.remove(interfaceC9931vf);
        }
    }
}
