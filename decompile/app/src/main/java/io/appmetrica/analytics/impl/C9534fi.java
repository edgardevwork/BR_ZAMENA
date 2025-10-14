package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fi */
/* loaded from: classes8.dex */
public final class C9534fi implements InterfaceC9839rn {

    /* renamed from: a */
    public final C9814qn f8131a = new C9814qn();

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable Revenue revenue) {
        C9789pn c9789pn;
        C9814qn c9814qn = this.f8131a;
        C9606if c9606if = new C9606if();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c9789pn = new C9789pn(c9606if, true, "");
        } else {
            c9789pn = new C9789pn(c9606if, false, "Invalid quantity value " + num);
        }
        List<C9789pn> listAsList = Arrays.asList(c9789pn);
        c9814qn.getClass();
        return c9814qn.mo5086a(listAsList);
    }
}
