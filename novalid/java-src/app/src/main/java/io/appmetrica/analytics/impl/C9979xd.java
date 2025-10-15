package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.xd */
/* loaded from: classes5.dex */
public final class C9979xd implements InterfaceC9839rn {

    /* renamed from: a */
    public final String f9311a;

    public C9979xd(@NonNull String str) {
        this.f9311a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a */
    public final C9789pn mo5086a(@Nullable Object obj) {
        if (obj != null) {
            return new C9789pn(this, true, "");
        }
        return new C9789pn(this, false, this.f9311a + " is null.");
    }

    @NonNull
    /* renamed from: a */
    public final String m6961a() {
        return this.f9311a;
    }
}
