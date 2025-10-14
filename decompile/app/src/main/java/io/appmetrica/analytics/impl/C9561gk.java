package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gk */
/* loaded from: classes7.dex */
public final class C9561gk implements InterfaceC9399a8 {

    /* renamed from: a */
    public final C9809qi f8209a;

    /* renamed from: b */
    public final C9261Ue f8210b;

    public C9561gk() {
        this(new C9809qi(), new C9261Ue());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C9288Vh> fromModel(@NonNull C9536fk c9536fk) {
        C9874t8 c9874t8 = new C9874t8();
        c9874t8.f9099a = 2;
        c9874t8.f9101c = new C9799q8();
        C9288Vh c9288VhFromModel = this.f8209a.fromModel(c9536fk.f8134b);
        c9874t8.f9101c.f8937b = (C9774p8) c9288VhFromModel.f7371a;
        C9288Vh c9288VhFromModel2 = this.f8210b.fromModel(c9536fk.f8133a);
        c9874t8.f9101c.f8936a = (C9699m8) c9288VhFromModel2.f7371a;
        return Collections.singletonList(new C9288Vh(c9874t8, new C9844s3(C9844s3.m6791b(c9288VhFromModel, c9288VhFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9561gk(C9809qi c9809qi, C9261Ue c9261Ue) {
        this.f8209a = c9809qi;
        this.f8210b = c9261Ue;
    }

    @NonNull
    /* renamed from: a */
    public final C9536fk m6189a(@NonNull List<C9288Vh> list) {
        throw new UnsupportedOperationException();
    }
}
