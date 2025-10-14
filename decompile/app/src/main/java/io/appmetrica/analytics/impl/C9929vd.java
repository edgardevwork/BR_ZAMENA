package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.vd */
/* loaded from: classes5.dex */
public final class C9929vd implements InterfaceC9839rn {

    /* renamed from: a */
    public final String f9227a;

    public C9929vd(@NonNull String str) {
        this.f9227a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return new C9789pn(this, true, "");
        }
        return new C9789pn(this, false, this.f9227a + " is empty.");
    }
}
