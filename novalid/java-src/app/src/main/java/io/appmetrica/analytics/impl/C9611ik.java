package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ik */
/* loaded from: classes7.dex */
public final class C9611ik implements InterfaceC9399a8 {

    /* renamed from: a */
    public final C9261Ue f8370a;

    /* renamed from: b */
    public final C9956wf f8371b;

    public C9611ik() {
        this(new C9261Ue(), new C9956wf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C9288Vh> fromModel(@NonNull C9586hk c9586hk) {
        C9288Vh c9288VhFromModel;
        C9874t8 c9874t8 = new C9874t8();
        c9874t8.f9099a = 3;
        c9874t8.f9102d = new C9824r8();
        C9288Vh c9288VhFromModel2 = this.f8370a.fromModel(c9586hk.f8287a);
        c9874t8.f9102d.f8986a = (C9699m8) c9288VhFromModel2.f7371a;
        C9143Pf c9143Pf = c9586hk.f8288b;
        if (c9143Pf != null) {
            c9288VhFromModel = this.f8371b.fromModel(c9143Pf);
            c9874t8.f9102d.f8987b = (C9749o8) c9288VhFromModel.f7371a;
        } else {
            c9288VhFromModel = null;
        }
        return Collections.singletonList(new C9288Vh(c9874t8, new C9844s3(C9844s3.m6791b(c9288VhFromModel2, c9288VhFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9611ik(C9261Ue c9261Ue, C9956wf c9956wf) {
        this.f8370a = c9261Ue;
        this.f8371b = c9956wf;
    }

    @NonNull
    /* renamed from: a */
    public final C9586hk m6293a(@NonNull List<C9288Vh> list) {
        throw new UnsupportedOperationException();
    }
}
