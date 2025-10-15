package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.gm */
/* loaded from: classes8.dex */
public final class C9563gm implements InterfaceC9030Km {

    /* renamed from: a */
    public final InterfaceC9030Km f8214a;

    /* renamed from: b */
    public final Object f8215b;

    public C9563gm(@NonNull InterfaceC9030Km interfaceC9030Km, @Nullable Object obj) {
        this.f8214a = interfaceC9030Km;
        this.f8215b = obj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9030Km
    @Nullable
    /* renamed from: a */
    public final Object mo5338a(@Nullable Object obj) {
        return obj != this.f8214a.mo5338a(obj) ? this.f8215b : obj;
    }
}
