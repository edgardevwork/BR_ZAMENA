package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.lk */
/* loaded from: classes6.dex */
public final class C9686lk implements InterfaceC9839rn {

    /* renamed from: a */
    public final C9816r0 f8598a;

    public C9686lk(@NonNull C9816r0 c9816r0) {
        this.f8598a = c9816r0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable Void r3) {
        boolean z;
        this.f8598a.getClass();
        synchronized (C9791q0.class) {
            z = C9791q0.f8914f;
        }
        return z ? new C9789pn(this, true, "") : new C9789pn(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public final C9789pn m6402a() {
        return mo5086a((Void) null);
    }
}
