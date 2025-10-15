package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.V */
/* loaded from: classes5.dex */
public final class C9270V implements Converter {

    /* renamed from: a */
    public final C9973x7 f7343a;

    /* renamed from: b */
    public final C9801qa f7344b;

    public C9270V() {
        this(new C9973x7(), new C9801qa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9288Vh fromModel(@NonNull C9294W c9294w) {
        C9424b8 c9424b8 = new C9424b8();
        c9424b8.f7774b = this.f7343a.fromModel(c9294w.f7380a);
        C9054Lm c9054LmMo5318a = this.f7344b.mo5318a(c9294w.f7381b);
        c9424b8.f7773a = StringUtils.getUTF8Bytes((String) c9054LmMo5318a.f6954a);
        return new C9288Vh(c9424b8, new C9844s3(C9844s3.m6791b(c9054LmMo5318a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9270V(C9973x7 c9973x7, C9801qa c9801qa) {
        this.f7343a = c9973x7;
        this.f7344b = c9801qa;
    }

    @NonNull
    /* renamed from: a */
    public final C9294W m5686a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
