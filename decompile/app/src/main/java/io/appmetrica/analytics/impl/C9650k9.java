package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.k9 */
/* loaded from: classes6.dex */
public final class C9650k9 extends AbstractC9237Te {

    /* renamed from: a */
    public final C8952Hg f8507a;

    /* renamed from: b */
    public final C9000Jg f8508b;

    /* renamed from: c */
    public final C9932vg f8509c;

    public C9650k9(C9571h5 c9571h5) {
        this.f8507a = new C8952Hg(c9571h5);
        this.f8508b = new C9000Jg(c9571h5);
        this.f8509c = new C9932vg(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9237Te
    /* renamed from: a */
    public final AbstractC9279V8 mo5519a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC9329Xa.m5744a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f8507a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f8509c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f8508b);
            linkedList.add(this.f8507a);
        }
        return new C9255U8(linkedList);
    }
}
