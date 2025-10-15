package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.lb */
/* loaded from: classes6.dex */
public final class C9677lb implements InterfaceC9839rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable String str) {
        if (str == null) {
            return new C9789pn(this, false, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return new C9789pn(this, false, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return new C9789pn(this, false, "key length more then 200 characters");
        }
        return new C9789pn(this, true, "");
    }
}
