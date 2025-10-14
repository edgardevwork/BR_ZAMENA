package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Oe */
/* loaded from: classes6.dex */
public final class C9118Oe implements Converter {

    /* renamed from: a */
    public final C9270V f7057a;

    /* renamed from: b */
    public final C9142Pe f7058b;

    public C9118Oe() {
        this(new C9270V(), new C9142Pe(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9288Vh fromModel(@NonNull C9166Qe c9166Qe) {
        int bytesTruncated;
        C9674l8 c9674l8 = new C9674l8();
        C9288Vh c9288VhFromModel = this.f7057a.fromModel(c9166Qe.f7159a);
        c9674l8.f8546a = (C9424b8) c9288VhFromModel.f7371a;
        C9054Lm c9054LmMo5318a = this.f7058b.mo5318a(c9166Qe.f7160b);
        if (AbstractC9664kn.m6344a((Collection) c9054LmMo5318a.f6954a)) {
            bytesTruncated = 0;
        } else {
            c9674l8.f8547b = new C9424b8[((List) c9054LmMo5318a.f6954a).size()];
            bytesTruncated = 0;
            for (int i = 0; i < ((List) c9054LmMo5318a.f6954a).size(); i++) {
                C9288Vh c9288VhFromModel2 = this.f7057a.fromModel((C9294W) ((List) c9054LmMo5318a.f6954a).get(i));
                c9674l8.f8547b[i] = (C9424b8) c9288VhFromModel2.f7371a;
                bytesTruncated += c9288VhFromModel2.f7372b.getBytesTruncated();
            }
        }
        return new C9288Vh(c9674l8, new C9844s3(C9844s3.m6791b(c9288VhFromModel, c9054LmMo5318a, new C9844s3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9118Oe(C9270V c9270v, C9142Pe c9142Pe) {
        this.f7057a = c9270v;
        this.f7058b = c9142Pe;
    }

    @NonNull
    /* renamed from: a */
    public final C9166Qe m5457a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
