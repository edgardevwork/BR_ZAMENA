package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.h */
/* loaded from: classes6.dex */
public final class C8273h implements InterfaceC8271f {

    /* renamed from: a */
    public final boolean f2836a;

    public C8273h(boolean z) {
        this.f2836a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8273h) && this.f2836a == ((C8273h) obj).f2836a;
    }

    public int hashCode() {
        boolean z = this.f2836a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.screens.banks.InterfaceC8271f
    public boolean isSandbox() {
        return this.f2836a;
    }

    public String toString() {
        return C8030a.m1428a(new StringBuilder("NoApps(isSandbox="), this.f2836a, ')');
    }
}
