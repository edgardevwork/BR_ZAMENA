package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Ym */
/* loaded from: classes5.dex */
public final class C9365Ym extends AbstractC9132P4 {

    /* renamed from: b */
    public final C8892F6 f7608b;

    public C9365Ym(@NonNull C9060M4 c9060m4, @NonNull C8892F6 c8892f6) {
        super(c9060m4);
        this.f7608b = c8892f6;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9132P4
    /* renamed from: a */
    public final boolean mo5478a(@NonNull C9252U5 c9252u5, @NonNull C8988J4 c8988j4) {
        C8840D4 c8840d4 = c8988j4.f6808b.f6964d.f7335a;
        this.f7608b.m5126a(c8840d4.f6453i);
        Boolean bool = c8840d4.f6446b;
        if (Boolean.TRUE.equals(bool)) {
            C9676la.f8552C.m6373j().mo5113a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            C9676la.f8552C.m6373j().mo5113a(false);
        }
        return false;
    }
}
