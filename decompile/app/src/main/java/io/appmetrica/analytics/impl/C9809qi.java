package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qi */
/* loaded from: classes6.dex */
public final class C9809qi implements Converter {

    /* renamed from: a */
    public final C9093Nd f8948a;

    /* renamed from: b */
    public final C8839D3 f8949b;

    /* renamed from: c */
    public final C9801qa f8950c;

    /* renamed from: d */
    public final C9801qa f8951d;

    public C9809qi() {
        this(new C9093Nd(), new C8839D3(), new C9801qa(100), new C9801qa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C9288Vh fromModel(@NonNull C9909ui c9909ui) {
        C9288Vh c9288VhFromModel;
        C9774p8 c9774p8 = new C9774p8();
        C9054Lm c9054LmMo5318a = this.f8950c.mo5318a(c9909ui.f9191a);
        c9774p8.f8886a = StringUtils.getUTF8Bytes((String) c9054LmMo5318a.f6954a);
        List<String> list = c9909ui.f9192b;
        C9288Vh c9288VhFromModel2 = null;
        if (list != null) {
            c9288VhFromModel = this.f8949b.fromModel(list);
            c9774p8.f8887b = (C9499e8) c9288VhFromModel.f7371a;
        } else {
            c9288VhFromModel = null;
        }
        C9054Lm c9054LmMo5318a2 = this.f8951d.mo5318a(c9909ui.f9193c);
        c9774p8.f8888c = StringUtils.getUTF8Bytes((String) c9054LmMo5318a2.f6954a);
        Map<String, String> map = c9909ui.f9194d;
        if (map != null) {
            c9288VhFromModel2 = this.f8948a.fromModel(map);
            c9774p8.f8889d = (C9649k8) c9288VhFromModel2.f7371a;
        }
        return new C9288Vh(c9774p8, new C9844s3(C9844s3.m6791b(c9054LmMo5318a, c9288VhFromModel, c9054LmMo5318a2, c9288VhFromModel2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9809qi(C9093Nd c9093Nd, C8839D3 c8839d3, C9801qa c9801qa, C9801qa c9801qa2) {
        this.f8948a = c9093Nd;
        this.f8949b = c8839d3;
        this.f8950c = c9801qa;
        this.f8951d = c9801qa2;
    }

    @NonNull
    /* renamed from: a */
    public final C9909ui m6709a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
