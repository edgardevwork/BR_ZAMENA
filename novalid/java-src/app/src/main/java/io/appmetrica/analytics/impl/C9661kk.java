package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.kk */
/* loaded from: classes7.dex */
public final class C9661kk implements InterfaceC9399a8 {

    /* renamed from: a */
    public final C9809qi f8521a;

    public C9661kk() {
        this(new C9809qi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C9288Vh> fromModel(@NonNull C9636jk c9636jk) {
        C9874t8 c9874t8 = new C9874t8();
        c9874t8.f9099a = 1;
        c9874t8.f9100b = new C9849s8();
        C9288Vh c9288VhFromModel = this.f8521a.fromModel(c9636jk.f8447a);
        c9874t8.f9100b.f9041a = (C9774p8) c9288VhFromModel.f7371a;
        C9844s3 c9844s3 = new C9844s3(C9844s3.m6791b(c9288VhFromModel));
        c9288VhFromModel.f7372b.getBytesTruncated();
        return Collections.singletonList(new C9288Vh(c9874t8, c9844s3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9661kk(C9809qi c9809qi) {
        this.f8521a = c9809qi;
    }

    @NonNull
    /* renamed from: a */
    public final C9636jk m6332a(@NonNull List<C9288Vh> list) {
        throw new UnsupportedOperationException();
    }
}
