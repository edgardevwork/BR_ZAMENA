package com.sdkit.paylib.paylibnative.sbol.domain;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.domain.a */
/* loaded from: classes8.dex */
public final class C8087a {

    /* renamed from: a */
    public String f1722a;

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.domain.a$a */
    public enum a {
        STORED,
        THE_VERY_SAME,
        BAD_INVOICE
    }

    /* renamed from: a */
    public final a m1775a(String invoiceId) {
        a aVar;
        a aVar2;
        String str;
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        synchronized (this) {
            try {
                if (Intrinsics.areEqual(invoiceId, this.f1722a)) {
                    aVar = a.THE_VERY_SAME;
                } else if (StringsKt__StringsJVMKt.isBlank(invoiceId)) {
                    aVar2 = a.BAD_INVOICE;
                    str = null;
                    this.f1722a = str;
                } else {
                    aVar = a.STORED;
                }
                a aVar3 = aVar;
                str = invoiceId;
                aVar2 = aVar3;
                this.f1722a = str;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    public final String m1776a() {
        String str;
        synchronized (this) {
            str = this.f1722a;
            this.f1722a = null;
        }
        return str;
    }
}
