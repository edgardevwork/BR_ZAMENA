package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.wf */
/* loaded from: classes5.dex */
public final class C9956wf implements Converter {

    /* renamed from: a */
    public final C9809qi f9261a;

    /* renamed from: b */
    public final C9801qa f9262b;

    /* renamed from: c */
    public final C9801qa f9263c;

    public C9956wf() {
        this(new C9809qi(), new C9801qa(100), new C9801qa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9288Vh fromModel(@NonNull C9143Pf c9143Pf) {
        C9288Vh c9288VhFromModel;
        C9749o8 c9749o8 = new C9749o8();
        C9054Lm c9054LmMo5318a = this.f9262b.mo5318a(c9143Pf.f7091a);
        c9749o8.f8825a = StringUtils.getUTF8Bytes((String) c9054LmMo5318a.f6954a);
        C9054Lm c9054LmMo5318a2 = this.f9263c.mo5318a(c9143Pf.f7092b);
        c9749o8.f8826b = StringUtils.getUTF8Bytes((String) c9054LmMo5318a2.f6954a);
        C9909ui c9909ui = c9143Pf.f7093c;
        if (c9909ui != null) {
            c9288VhFromModel = this.f9261a.fromModel(c9909ui);
            c9749o8.f8827c = (C9774p8) c9288VhFromModel.f7371a;
        } else {
            c9288VhFromModel = null;
        }
        return new C9288Vh(c9749o8, new C9844s3(C9844s3.m6791b(c9054LmMo5318a, c9054LmMo5318a2, c9288VhFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9956wf(C9809qi c9809qi, C9801qa c9801qa, C9801qa c9801qa2) {
        this.f9261a = c9809qi;
        this.f9262b = c9801qa;
        this.f9263c = c9801qa2;
    }

    @NonNull
    /* renamed from: a */
    public final C9143Pf m6920a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
