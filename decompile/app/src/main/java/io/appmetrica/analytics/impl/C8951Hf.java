package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.Hf */
/* loaded from: classes8.dex */
public class C8951Hf {

    /* renamed from: a */
    public final InterfaceC9042La f6718a;

    /* renamed from: b */
    public final InterfaceC8826Cf f6719b;

    /* renamed from: c */
    public final InterfaceC8994Ja f6720c;

    public C8951Hf(InterfaceC9042La interfaceC9042La, InterfaceC8826Cf interfaceC8826Cf, InterfaceC8994Ja interfaceC8994Ja) {
        this.f6718a = interfaceC9042La;
        this.f6719b = interfaceC8826Cf;
        this.f6720c = interfaceC8994Ja;
    }

    /* renamed from: a */
    public final void m5251a(@Nullable C8901Ff c8901Ff) {
        if (this.f6718a.mo5223a(c8901Ff)) {
            this.f6719b.mo5031a(c8901Ff);
            this.f6720c.mo4972a();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: b */
    public final InterfaceC8826Cf m5252b() {
        return this.f6719b;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: c */
    public final InterfaceC8994Ja m5253c() {
        return this.f6720c;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public final InterfaceC9042La m5250a() {
        return this.f6718a;
    }
}
