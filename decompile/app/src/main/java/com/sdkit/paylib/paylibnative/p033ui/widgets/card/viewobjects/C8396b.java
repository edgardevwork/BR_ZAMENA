package com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.viewobjects.b */
/* loaded from: classes6.dex */
public final class C8396b {

    /* renamed from: a */
    public final boolean f3815a;

    public C8396b(boolean z) {
        this.f3815a = z;
    }

    /* renamed from: a */
    public final boolean m3580a() {
        return this.f3815a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8396b) && this.f3815a == ((C8396b) obj).f3815a;
    }

    public int hashCode() {
        boolean z = this.f3815a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return C8030a.m1428a(new StringBuilder("CardWidgetStateVO(cardViewRadioBtnActive="), this.f3815a, ')');
    }
}
