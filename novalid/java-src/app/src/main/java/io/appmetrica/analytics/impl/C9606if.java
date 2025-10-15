package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.if */
/* loaded from: classes8.dex */
public final class C9606if implements InterfaceC9839rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a */
    public final C9789pn mo5086a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C9789pn(this, true, "");
        }
        return new C9789pn(this, false, "Invalid quantity value " + num);
    }
}
