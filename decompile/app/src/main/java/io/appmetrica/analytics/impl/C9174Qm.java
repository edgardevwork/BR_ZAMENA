package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Qm */
/* loaded from: classes8.dex */
public final class C9174Qm implements ProtobufConverter {

    /* renamed from: a */
    public final C8883Em f7173a;

    /* renamed from: b */
    public final C9246U f7174b;

    /* renamed from: c */
    public final C9672l6 f7175c;

    /* renamed from: d */
    public final C8906Fk f7176d;

    /* renamed from: e */
    public final C9405ae f7177e;

    /* renamed from: f */
    public final C9430be f7178f;

    public C9174Qm() {
        this(new C8883Em(), new C9246U(new C9963wm()), new C9672l6(), new C8906Fk(), new C9405ae(), new C9430be());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9397a6 fromModel(@NonNull C9150Pm c9150Pm) {
        C9397a6 c9397a6 = new C9397a6();
        C8908Fm c8908Fm = c9150Pm.f7124a;
        if (c8908Fm != null) {
            c9397a6.f7675a = this.f7173a.fromModel(c8908Fm);
        }
        C9222T c9222t = c9150Pm.f7125b;
        if (c9222t != null) {
            c9397a6.f7676b = this.f7174b.fromModel(c9222t);
        }
        List<C8956Hk> list = c9150Pm.f7126c;
        if (list != null) {
            c9397a6.f7679e = this.f7176d.fromModel(list);
        }
        String str = c9150Pm.f7130g;
        if (str != null) {
            c9397a6.f7677c = str;
        }
        c9397a6.f7678d = this.f7175c.m5268a(c9150Pm.f7131h);
        if (!TextUtils.isEmpty(c9150Pm.f7127d)) {
            c9397a6.f7682h = this.f7177e.fromModel(c9150Pm.f7127d);
        }
        if (!TextUtils.isEmpty(c9150Pm.f7128e)) {
            c9397a6.f7683i = c9150Pm.f7128e.getBytes();
        }
        if (!AbstractC9664kn.m6345a(c9150Pm.f7129f)) {
            c9397a6.f7684j = this.f7178f.fromModel(c9150Pm.f7129f);
        }
        return c9397a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9174Qm(C8883Em c8883Em, C9246U c9246u, C9672l6 c9672l6, C8906Fk c8906Fk, C9405ae c9405ae, C9430be c9430be) {
        this.f7174b = c9246u;
        this.f7173a = c8883Em;
        this.f7175c = c9672l6;
        this.f7176d = c8906Fk;
        this.f7177e = c9405ae;
        this.f7178f = c9430be;
    }

    @NonNull
    /* renamed from: a */
    public final C9150Pm m5510a(@NonNull C9397a6 c9397a6) {
        throw new UnsupportedOperationException();
    }
}
