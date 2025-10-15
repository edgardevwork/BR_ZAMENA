package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ue */
/* loaded from: classes5.dex */
public final class C9261Ue implements Converter {

    /* renamed from: a */
    public final C9093Nd f7328a;

    /* renamed from: b */
    public final C9118Oe f7329b;

    /* renamed from: c */
    public final C8839D3 f7330c;

    /* renamed from: d */
    public final C9357Ye f7331d;

    /* renamed from: e */
    public final C9801qa f7332e;

    /* renamed from: f */
    public final C9801qa f7333f;

    public C9261Ue() {
        this(new C9093Nd(), new C9118Oe(), new C8839D3(), new C9357Ye(), new C9801qa(100), new C9801qa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C9288Vh fromModel(@NonNull C9333Xe c9333Xe) {
        C9288Vh c9288VhFromModel;
        C9288Vh c9288VhFromModel2;
        C9288Vh c9288VhFromModel3;
        C9288Vh c9288VhFromModel4;
        C9699m8 c9699m8 = new C9699m8();
        C9054Lm c9054LmMo5318a = this.f7332e.mo5318a(c9333Xe.f7524a);
        c9699m8.f8637a = StringUtils.getUTF8Bytes((String) c9054LmMo5318a.f6954a);
        C9054Lm c9054LmMo5318a2 = this.f7333f.mo5318a(c9333Xe.f7525b);
        c9699m8.f8638b = StringUtils.getUTF8Bytes((String) c9054LmMo5318a2.f6954a);
        List<String> list = c9333Xe.f7526c;
        C9288Vh c9288VhFromModel5 = null;
        if (list != null) {
            c9288VhFromModel = this.f7330c.fromModel(list);
            c9699m8.f8639c = (C9499e8) c9288VhFromModel.f7371a;
        } else {
            c9288VhFromModel = null;
        }
        Map<String, String> map = c9333Xe.f7527d;
        if (map != null) {
            c9288VhFromModel2 = this.f7328a.fromModel(map);
            c9699m8.f8640d = (C9649k8) c9288VhFromModel2.f7371a;
        } else {
            c9288VhFromModel2 = null;
        }
        C9166Qe c9166Qe = c9333Xe.f7528e;
        if (c9166Qe != null) {
            c9288VhFromModel3 = this.f7329b.fromModel(c9166Qe);
            c9699m8.f8641e = (C9674l8) c9288VhFromModel3.f7371a;
        } else {
            c9288VhFromModel3 = null;
        }
        C9166Qe c9166Qe2 = c9333Xe.f7529f;
        if (c9166Qe2 != null) {
            c9288VhFromModel4 = this.f7329b.fromModel(c9166Qe2);
            c9699m8.f8642f = (C9674l8) c9288VhFromModel4.f7371a;
        } else {
            c9288VhFromModel4 = null;
        }
        List<String> list2 = c9333Xe.f7530g;
        if (list2 != null) {
            c9288VhFromModel5 = this.f7331d.fromModel(list2);
            c9699m8.f8643g = (C9724n8[]) c9288VhFromModel5.f7371a;
        }
        return new C9288Vh(c9699m8, new C9844s3(C9844s3.m6791b(c9054LmMo5318a, c9054LmMo5318a2, c9288VhFromModel, c9288VhFromModel2, c9288VhFromModel3, c9288VhFromModel4, c9288VhFromModel5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9261Ue(C9093Nd c9093Nd, C9118Oe c9118Oe, C8839D3 c8839d3, C9357Ye c9357Ye, C9801qa c9801qa, C9801qa c9801qa2) {
        this.f7328a = c9093Nd;
        this.f7329b = c9118Oe;
        this.f7330c = c8839d3;
        this.f7331d = c9357Ye;
        this.f7332e = c9801qa;
        this.f7333f = c9801qa2;
    }

    @NonNull
    /* renamed from: a */
    public final C9333Xe m5675a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
