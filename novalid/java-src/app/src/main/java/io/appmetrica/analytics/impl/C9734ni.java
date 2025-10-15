package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ni */
/* loaded from: classes6.dex */
public final class C9734ni extends AbstractC9632jg {
    public C9734ni(@NonNull C9571h5 c9571h5) {
        super(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        String str = c9252u5.f7316h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f8444a.f8230c.m6607j(str).m6648b();
        return false;
    }
}
