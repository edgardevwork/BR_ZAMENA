package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.ng */
/* loaded from: classes6.dex */
public final class C9732ng implements Consumer {

    /* renamed from: a */
    public final C8761A0 f8754a;

    /* renamed from: b */
    public final Function f8755b;

    /* renamed from: c */
    public final /* synthetic */ C9757og f8756c;

    public C9732ng(C9757og c9757og, C8761A0 c8761a0, Function<String, C9252U5> function) {
        this.f8756c = c9757og;
        this.f8754a = c8761a0;
        this.f8755b = function;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a */
    public final void consume(@NonNull String str) {
        C9757og c9757og = this.f8756c;
        C8761A0 c8761a0 = this.f8754a;
        String str2 = c8761a0.f6298a;
        String str3 = c8761a0.f6299b;
        int i = c8761a0.f6301d;
        Integer numValueOf = Integer.valueOf(i);
        C8761A0 c8761a02 = this.f8754a;
        String str4 = c8761a02.f6302e;
        C9520f4 c9520f4 = new C9520f4(str2, str3, numValueOf, str4, c8761a02.f6300c);
        C9252U5 c9252u5 = (C9252U5) this.f8755b.apply(str);
        C8865E4 c8865e4 = new C8865E4(new C9487dl(), new C8840D4(), null);
        c9757og.f8855c.m6692a(c9520f4, c8865e4).mo5290a(c9252u5, c8865e4);
        c9757og.f8855c.m6693a(i, str3, str4);
    }
}
