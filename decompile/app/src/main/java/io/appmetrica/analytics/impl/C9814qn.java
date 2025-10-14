package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qn */
/* loaded from: classes6.dex */
public final class C9814qn implements InterfaceC9839rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a */
    public final C9789pn mo5086a(@Nullable List<C9789pn> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C9789pn c9789pn : list) {
            if (!c9789pn.f8908a) {
                linkedList.add(c9789pn.f8909b);
                z = false;
            }
        }
        return z ? new C9789pn(this, true, "") : new C9789pn(this, false, TextUtils.join(", ", linkedList));
    }
}
