package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.g */
/* loaded from: classes6.dex */
public final class C8272g implements InterfaceC8271f {

    /* renamed from: a */
    public final boolean f2835a;

    public C8272g(boolean z) {
        this.f2835a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8272g) && this.f2835a == ((C8272g) obj).f2835a;
    }

    public int hashCode() {
        boolean z = this.f2835a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.screens.banks.InterfaceC8271f
    public boolean isSandbox() {
        return this.f2835a;
    }

    public String toString() {
        return C8030a.m1428a(new StringBuilder("Loading(isSandbox="), this.f2835a, ')');
    }
}
