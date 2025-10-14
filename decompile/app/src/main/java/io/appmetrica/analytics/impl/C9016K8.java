package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.K8 */
/* loaded from: classes8.dex */
public final class C9016K8 {

    /* renamed from: a */
    public final String f6861a;

    /* renamed from: b */
    public String f6862b;

    /* renamed from: c */
    public final Long f6863c;

    /* renamed from: d */
    public final Long f6864d;

    /* renamed from: e */
    public final Long f6865e;

    /* renamed from: f */
    public final Long f6866f;

    /* renamed from: g */
    public final C9648k7 f6867g;

    /* renamed from: h */
    public final EnumC9329Xa f6868h;

    /* renamed from: i */
    public final Integer f6869i;

    /* renamed from: j */
    public final String f6870j;

    /* renamed from: k */
    public final Integer f6871k;

    /* renamed from: l */
    public final Integer f6872l;

    /* renamed from: m */
    public final String f6873m;

    /* renamed from: n */
    public final String f6874n;

    /* renamed from: o */
    public final EnumC8894F8 f6875o;

    /* renamed from: p */
    public final EnumC9426ba f6876p;

    /* renamed from: q */
    public final EnumC9675l9 f6877q;

    /* renamed from: r */
    public final Boolean f6878r;

    /* renamed from: s */
    public final Integer f6879s;

    /* renamed from: t */
    public final byte[] f6880t;

    public C9016K8(ContentValues contentValues) {
        C9548g7 model = new C9573h7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f6861a = model.m6162a().m6095j();
        this.f6862b = model.m6162a().m6101p();
        this.f6863c = model.m6164c();
        this.f6864d = model.m6163b();
        this.f6865e = model.m6162a().m6096k();
        this.f6866f = model.m6165d();
        this.f6867g = model.m6162a().m6094i();
        this.f6868h = model.m6166e();
        this.f6869i = model.m6162a().m6089d();
        this.f6870j = model.m6162a().m6091f();
        this.f6871k = model.m6162a().m6100o();
        this.f6872l = model.m6162a().m6088c();
        this.f6873m = model.m6162a().m6087b();
        this.f6874n = model.m6162a().m6098m();
        EnumC8894F8 enumC8894F8M6090e = model.m6162a().m6090e();
        this.f6875o = enumC8894F8M6090e == null ? EnumC8894F8.m5128a(null) : enumC8894F8M6090e;
        EnumC9426ba enumC9426baM6093h = model.m6162a().m6093h();
        this.f6876p = enumC9426baM6093h == null ? EnumC9426ba.m5911a(null) : enumC9426baM6093h;
        this.f6877q = model.m6162a().m6099n();
        this.f6878r = model.m6162a().m6086a();
        this.f6879s = model.m6162a().m6097l();
        this.f6880t = model.m6162a().m6092g();
    }
}
