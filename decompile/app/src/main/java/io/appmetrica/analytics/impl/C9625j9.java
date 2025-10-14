package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.j9 */
/* loaded from: classes5.dex */
public final class C9625j9 {

    /* renamed from: a */
    public final C9755oe f8419a;

    /* renamed from: b */
    public final C9964wn f8420b;

    /* renamed from: c */
    public final C9338Xj f8421c;

    /* renamed from: d */
    public final C9062M6 f8422d;

    /* renamed from: e */
    public final C8869E8 f8423e;

    /* renamed from: f */
    public final C9147Pj f8424f;

    /* renamed from: g */
    public final C9491e0 f8425g;

    /* renamed from: h */
    public final C9160Q8 f8426h;

    /* renamed from: i */
    public final C9621j5 f8427i;

    /* renamed from: j */
    public final TimeProvider f8428j;

    /* renamed from: k */
    public final int f8429k;

    /* renamed from: l */
    public long f8430l;

    /* renamed from: m */
    public int f8431m;

    public C9625j9(C9755oe c9755oe, C9964wn c9964wn, C9338Xj c9338Xj, C9062M6 c9062m6, C9491e0 c9491e0, C8869E8 c8869e8, C9147Pj c9147Pj, int i, C9621j5 c9621j5, C9160Q8 c9160q8, SystemTimeProvider systemTimeProvider) {
        this.f8419a = c9755oe;
        this.f8420b = c9964wn;
        this.f8421c = c9338Xj;
        this.f8422d = c9062m6;
        this.f8425g = c9491e0;
        this.f8423e = c8869e8;
        this.f8424f = c9147Pj;
        this.f8429k = i;
        this.f8426h = c9160q8;
        this.f8428j = systemTimeProvider;
        this.f8427i = c9621j5;
        this.f8430l = c9755oe.m6603h();
        this.f8431m = c9755oe.m6602g();
    }

    /* renamed from: a */
    public final void m6308a(C9252U5 c9252u5, C9386Zj c9386Zj) {
        Map map = c9252u5.f7324p;
        C9147Pj c9147Pj = this.f8424f;
        c9147Pj.getClass();
        map.putAll(new HashMap(c9147Pj.f7123b));
        c9252u5.mo5656c(this.f8419a.m6606i());
        c9252u5.f7323o = Integer.valueOf(this.f8420b.m6940b());
        C9466d0 c9466d0M6036a = this.f8425g.m6036a();
        C8869E8 c8869e8 = this.f8423e;
        c8869e8.getClass();
        InterfaceC8844D8 interfaceC8844D8 = (InterfaceC8844D8) c8869e8.f6539b.m6635a(EnumC9329Xa.m5744a(c9252u5.f7312d));
        C9062M6 c9062m6 = this.f8422d;
        C9974x8 c9974x8Mo5056a = interfaceC8844D8.mo5056a(c9252u5);
        int i = c9252u5.f7312d;
        C9160Q8 c9160q8 = this.f8426h;
        C9623j7 c9623j7 = new C9623j7(c9062m6.f6980g, c9386Zj, i, c9160q8, c9974x8Mo5056a, (C8902Fg) c9062m6.f6981h.f8239l.m6880a(), c9466d0M6036a);
        Long lValueOf = Long.valueOf(c9386Zj.f7652a);
        EnumC9436bk enumC9436bk = c9386Zj.f7655d;
        Long lValueOf2 = Long.valueOf(c9386Zj.f7653b);
        EnumC9329Xa enumC9329XaM5744a = EnumC9329Xa.m5744a(c9623j7.f8415h.f7312d);
        long jOptLong = 0;
        if (!AbstractC9875t9.f9111g.contains(EnumC9329Xa.m5744a(i))) {
            C9964wn c9964wn = c9160q8.f7152b;
            synchronized (c9964wn) {
                jOptLong = c9964wn.f9286a.m6979a().optLong("global_number", 0L);
            }
            c9160q8.f7152b.m6942b(1 + jOptLong);
        }
        c9062m6.m5395a(c9062m6.f6985l.fromModel(new C9548g7(lValueOf, enumC9436bk, lValueOf2, enumC9329XaM5744a, Long.valueOf(jOptLong), Long.valueOf(c9386Zj.f7654c), c9623j7.m6302a())));
        this.f8427i.f8404a.m5463g();
    }
}
