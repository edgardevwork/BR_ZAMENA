package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.A3 */
/* loaded from: classes8.dex */
public final class C8764A3 implements InterfaceC9399a8 {

    /* renamed from: a */
    public final C8789B3 f6310a;

    public C8764A3() {
        this(new C8789B3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C9288Vh> fromModel(@NonNull C10019z3 c10019z3) {
        C9874t8 c9874t8 = new C9874t8();
        c9874t8.f9103e = new C9449c8();
        C9288Vh c9288VhFromModel = this.f6310a.fromModel(c10019z3.f9386b);
        c9874t8.f9103e.f7836a = (C9474d8) c9288VhFromModel.f7371a;
        c9874t8.f9099a = c10019z3.f9385a;
        return Collections.singletonList(new C9288Vh(c9874t8, new C9844s3(C9844s3.m6791b(c9288VhFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C8764A3(C8789B3 c8789b3) {
        this.f6310a = c8789b3;
    }

    @NonNull
    /* renamed from: a */
    public final C10019z3 m4926a(@NonNull List<C9288Vh> list) {
        throw new UnsupportedOperationException();
    }
}
