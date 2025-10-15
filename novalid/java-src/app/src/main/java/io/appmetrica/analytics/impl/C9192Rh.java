package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Rh */
/* loaded from: classes6.dex */
public final class C9192Rh extends AbstractC9132P4 {
    public C9192Rh(C9060M4 c9060m4) {
        super(c9060m4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9132P4
    /* renamed from: a */
    public final boolean mo5478a(@NonNull C9252U5 c9252u5, @NonNull C8988J4 c8988j4) {
        Bundle bundle = c9252u5.f7321m;
        this.f7081a.f6972l.m5274a(new C9036L4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
