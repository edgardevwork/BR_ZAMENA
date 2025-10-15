package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Wf */
/* loaded from: classes7.dex */
public final class C9310Wf implements ProtobufConverter {

    /* renamed from: a */
    public final C8883Em f7405a;

    /* renamed from: b */
    public final C9246U f7406b;

    /* renamed from: c */
    public final C9672l6 f7407c;

    /* renamed from: d */
    public final C8906Fk f7408d;

    /* renamed from: e */
    public final C9405ae f7409e;

    /* renamed from: f */
    public final C9430be f7410f;

    public C9310Wf() {
        this(new C8883Em(), new C9246U(new C9963wm()), new C9672l6(), new C8906Fk(), new C9405ae(), new C9430be());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9447c6 fromModel(@NonNull C9286Vf c9286Vf) {
        C9447c6 c9447c6 = new C9447c6();
        c9447c6.f7827f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c9286Vf.f7359a, c9447c6.f7827f));
        C9150Pm c9150Pm = c9286Vf.f7360b;
        if (c9150Pm != null) {
            C8908Fm c8908Fm = c9150Pm.f7124a;
            if (c8908Fm != null) {
                c9447c6.f7822a = this.f7405a.fromModel(c8908Fm);
            }
            C9222T c9222t = c9150Pm.f7125b;
            if (c9222t != null) {
                c9447c6.f7823b = this.f7406b.fromModel(c9222t);
            }
            List<C8956Hk> list = c9150Pm.f7126c;
            if (list != null) {
                c9447c6.f7826e = this.f7408d.fromModel(list);
            }
            c9447c6.f7824c = (String) WrapUtils.getOrDefault(c9150Pm.f7130g, c9447c6.f7824c);
            c9447c6.f7825d = this.f7407c.m5268a(c9150Pm.f7131h);
            if (!TextUtils.isEmpty(c9150Pm.f7127d)) {
                c9447c6.f7830i = this.f7409e.fromModel(c9150Pm.f7127d);
            }
            if (!TextUtils.isEmpty(c9150Pm.f7128e)) {
                c9447c6.f7831j = c9150Pm.f7128e.getBytes();
            }
            if (!AbstractC9664kn.m6345a(c9150Pm.f7129f)) {
                c9447c6.f7832k = this.f7410f.fromModel(c9150Pm.f7129f);
            }
        }
        return c9447c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9310Wf(C8883Em c8883Em, C9246U c9246u, C9672l6 c9672l6, C8906Fk c8906Fk, C9405ae c9405ae, C9430be c9430be) {
        this.f7405a = c8883Em;
        this.f7406b = c9246u;
        this.f7407c = c9672l6;
        this.f7408d = c8906Fk;
        this.f7409e = c9405ae;
        this.f7410f = c9430be;
    }

    @NonNull
    /* renamed from: a */
    public final C9286Vf m5717a(@NonNull C9447c6 c9447c6) {
        throw new UnsupportedOperationException();
    }
}
