package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.R4 */
/* loaded from: classes6.dex */
public final class C9179R4 extends AbstractC9237Te {

    /* renamed from: a */
    public final C9156Q4 f7197a;

    public C9179R4(C9060M4 c9060m4) {
        this.f7197a = new C9156Q4(c9060m4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9237Te
    /* renamed from: a */
    public final AbstractC9279V8 mo5519a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC9329Xa.m5744a(i).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f7197a.f7140a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f7197a.f7141b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f7197a.f7142c);
        }
        return new C9255U8(arrayList);
    }
}
