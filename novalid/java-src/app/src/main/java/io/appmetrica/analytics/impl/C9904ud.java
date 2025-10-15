package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.ud */
/* loaded from: classes5.dex */
public final class C9904ud implements InterfaceC9839rn {

    /* renamed from: a */
    public final String f9174a;

    public C9904ud(@NonNull String str) {
        this.f9174a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable Collection<Object> collection) {
        if (!AbstractC9664kn.m6344a((Collection) collection)) {
            return new C9789pn(this, true, "");
        }
        return new C9789pn(this, false, this.f9174a + " is null or empty.");
    }
}
