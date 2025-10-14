package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.B3 */
/* loaded from: classes7.dex */
public final class C8789B3 implements Converter {

    /* renamed from: a */
    public final C9261Ue f6358a;

    /* renamed from: b */
    public final C9973x7 f6359b;

    /* renamed from: c */
    public final C9118Oe f6360c;

    /* renamed from: d */
    public final C9956wf f6361d;

    public C8789B3() {
        this(new C9261Ue(), new C9973x7(), new C9118Oe(), new C9956wf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C9288Vh fromModel(@NonNull C8814C3 c8814c3) {
        C9288Vh c9288VhFromModel;
        C9474d8 c9474d8 = new C9474d8();
        C9288Vh c9288VhFromModel2 = this.f6358a.fromModel(c8814c3.f6422a);
        c9474d8.f7901a = (C9699m8) c9288VhFromModel2.f7371a;
        c9474d8.f7903c = this.f6359b.fromModel(c8814c3.f6423b);
        C9288Vh c9288VhFromModel3 = this.f6360c.fromModel(c8814c3.f6424c);
        c9474d8.f7904d = (C9674l8) c9288VhFromModel3.f7371a;
        C9143Pf c9143Pf = c8814c3.f6425d;
        if (c9143Pf != null) {
            c9288VhFromModel = this.f6361d.fromModel(c9143Pf);
            c9474d8.f7902b = (C9749o8) c9288VhFromModel.f7371a;
        } else {
            c9288VhFromModel = null;
        }
        return new C9288Vh(c9474d8, new C9844s3(C9844s3.m6791b(c9288VhFromModel2, c9288VhFromModel3, c9288VhFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C8789B3(C9261Ue c9261Ue, C9973x7 c9973x7, C9118Oe c9118Oe, C9956wf c9956wf) {
        this.f6358a = c9261Ue;
        this.f6359b = c9973x7;
        this.f6360c = c9118Oe;
        this.f6361d = c9956wf;
    }

    @NonNull
    /* renamed from: a */
    public final C8814C3 m4983a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
