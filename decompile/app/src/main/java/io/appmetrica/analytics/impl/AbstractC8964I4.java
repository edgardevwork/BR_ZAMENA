package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.I4 */
/* loaded from: classes8.dex */
public abstract class AbstractC8964I4 extends AbstractC9504ed {

    /* renamed from: f */
    public final Object f6764f;

    public AbstractC8964I4(int i, String str, Object obj, InterfaceC9839rn interfaceC9839rn, AbstractC9201S2 abstractC9201S2) {
        super(i, str, interfaceC9839rn, abstractC9201S2);
        this.f6764f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9504ed, io.appmetrica.analytics.impl.InterfaceC9489dn
    /* renamed from: a */
    public final void mo5257a(@NonNull C9464cn c9464cn) {
        if (m6061f()) {
            AbstractC9201S2 abstractC9201S2 = this.f8007d;
            int i = this.f8005b;
            C9514en c9514enMo5235a = abstractC9201S2.mo5235a(c9464cn, (C9514en) ((HashMap) c9464cn.f7881a.get(i)).get(this.f8004a), this);
            if (c9514enMo5235a != null) {
                mo4996a(c9514enMo5235a);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo4996a(@NonNull C9514en c9514en);

    @NonNull
    /* renamed from: g */
    public final Object m5258g() {
        return this.f6764f;
    }
}
