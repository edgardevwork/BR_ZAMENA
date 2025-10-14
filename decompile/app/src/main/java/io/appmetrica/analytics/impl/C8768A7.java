package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.A7 */
/* loaded from: classes6.dex */
public final class C8768A7 {

    /* renamed from: a */
    public final InterfaceC8921Ga f6318a;

    /* renamed from: b */
    public String f6319b = "";

    public C8768A7(InterfaceC8921Ga interfaceC8921Ga) {
        this.f6318a = interfaceC8921Ga;
    }

    /* renamed from: a */
    public final void m4929a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.areEqual(this.f6319b, str)) {
                return;
            }
            this.f6319b = str;
            this.f6318a.mo5218a(str, z);
        }
    }
}
