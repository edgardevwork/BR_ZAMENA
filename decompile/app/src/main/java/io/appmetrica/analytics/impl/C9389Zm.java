package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Zm */
/* loaded from: classes5.dex */
public final class C9389Zm extends AbstractC9632jg {
    public C9389Zm(C9571h5 c9571h5) {
        super(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        String strM6606i = this.f8444a.f8230c.m6606i();
        String str = c9252u5.f7316h;
        this.f8444a.f8230c.m6607j(str).m6648b();
        if (TextUtils.equals(strM6606i, str)) {
            return false;
        }
        this.f8444a.mo5440a(C9445c4.m5936o());
        return false;
    }
}
