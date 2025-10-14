package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ea */
/* loaded from: classes8.dex */
public final class C9501ea extends AbstractC9132P4 {
    public C9501ea(C9060M4 c9060m4) {
        super(c9060m4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9132P4
    /* renamed from: a */
    public final boolean mo5478a(@NonNull C9252U5 c9252u5, @NonNull C8988J4 c8988j4) {
        Bundle bundle = c9252u5.f7321m;
        this.f7081a.m5380a(bundle != null ? (C9281Va) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null);
        return false;
    }
}
