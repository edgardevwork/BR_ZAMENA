package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.T8 */
/* loaded from: classes5.dex */
public final class C9231T8 {

    /* renamed from: h */
    public static final Map f7276h;

    /* renamed from: i */
    public static final C9231T8 f7277i;

    /* renamed from: a */
    public final InterfaceC9429bd f7278a;

    /* renamed from: b */
    public final InterfaceC9864sn f7279b;

    /* renamed from: c */
    public final InterfaceC9949w8 f7280c;

    /* renamed from: d */
    public final InterfaceC9800q9 f7281d;

    /* renamed from: e */
    public final InterfaceC9115Ob f7282e;

    /* renamed from: f */
    public final InterfaceC9804qd f7283f;

    /* renamed from: g */
    public final InterfaceC9041L9 f7284g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC9426ba.FIRST_OCCURRENCE, 1);
        map.put(EnumC9426ba.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC9426ba.UNKNOWN, -1);
        f7276h = Collections.unmodifiableMap(map);
        f7277i = new C9231T8(new C9634ji(), new C9463cm(), new C10004yd(), new C9609ii(), new C9576ha(), new C9601ia(), new C9551ga());
    }

    public C9231T8(C9207S8 c9207s8) {
        this(c9207s8.f7234a, c9207s8.f7235b, c9207s8.f7236c, c9207s8.f7237d, c9207s8.f7238e, c9207s8.f7239f, c9207s8.f7240g);
    }

    /* renamed from: a */
    public final C9475d9 m5612a(C9016K8 c9016k8, C8902Fg c8902Fg) {
        C9475d9 c9475d9 = new C9475d9();
        C9450c9 c9450c9Mo5709a = this.f7283f.mo5709a(c9016k8.f6872l, c9016k8.f6873m);
        C9351Y8 c9351y8Mo5456a = this.f7282e.mo5456a(c9016k8.f6867g);
        if (c9450c9Mo5709a != null) {
            c9475d9.f7937g = c9450c9Mo5709a;
        }
        if (c9351y8Mo5456a != null) {
            c9475d9.f7936f = c9351y8Mo5456a;
        }
        String strMo5914a = this.f7278a.mo5914a(c9016k8.f6861a);
        if (strMo5914a != null) {
            c9475d9.f7934d = strMo5914a;
        }
        c9475d9.f7935e = this.f7279b.mo4930a(c9016k8, c8902Fg);
        String str = c9016k8.f6870j;
        if (str != null) {
            c9475d9.f7938h = str;
        }
        Integer numMo6062a = this.f7281d.mo6062a(c9016k8);
        if (numMo6062a != null) {
            c9475d9.f7933c = numMo6062a.intValue();
        }
        Long l = c9016k8.f6863c;
        if (l != null) {
            c9475d9.f7931a = l.longValue();
        }
        Long l2 = c9016k8.f6864d;
        if (l2 != null) {
            c9475d9.f7944n = l2.longValue();
        }
        Long l3 = c9016k8.f6865e;
        if (l3 != null) {
            c9475d9.f7945o = l3.longValue();
        }
        Long l4 = c9016k8.f6866f;
        if (l4 != null) {
            c9475d9.f7932b = l4.longValue();
        }
        Integer num = c9016k8.f6871k;
        if (num != null) {
            c9475d9.f7939i = num.intValue();
        }
        c9475d9.f7940j = this.f7280c.mo5917a(c9016k8.f6875o);
        C9648k7 c9648k7 = c9016k8.f6867g;
        c9475d9.f7941k = c9648k7 != null ? new C9672l6().m5268a(c9648k7.f8494a) : -1;
        String str2 = c9016k8.f6874n;
        if (str2 != null) {
            c9475d9.f7942l = str2.getBytes();
        }
        EnumC9426ba enumC9426ba = c9016k8.f6876p;
        Integer num2 = enumC9426ba != null ? (Integer) f7276h.get(enumC9426ba) : null;
        if (num2 != null) {
            c9475d9.f7943m = num2.intValue();
        }
        EnumC9675l9 enumC9675l9 = c9016k8.f6877q;
        if (enumC9675l9 != null) {
            c9475d9.f7946p = enumC9675l9.f8551a;
        }
        Boolean bool = c9016k8.f6878r;
        if (bool != null) {
            c9475d9.f7947q = bool.booleanValue();
        }
        if (c9016k8.f6879s != null) {
            c9475d9.f7948r = r6.intValue();
        }
        c9475d9.f7949s = ((C9551ga) this.f7284g).m6177a(c9016k8.f6880t);
        return c9475d9;
    }

    public C9231T8(InterfaceC9429bd interfaceC9429bd, InterfaceC9864sn interfaceC9864sn, InterfaceC9949w8 interfaceC9949w8, InterfaceC9800q9 interfaceC9800q9, InterfaceC9115Ob interfaceC9115Ob, InterfaceC9804qd interfaceC9804qd, InterfaceC9041L9 interfaceC9041L9) {
        this.f7278a = interfaceC9429bd;
        this.f7279b = interfaceC9864sn;
        this.f7280c = interfaceC9949w8;
        this.f7281d = interfaceC9800q9;
        this.f7282e = interfaceC9115Ob;
        this.f7283f = interfaceC9804qd;
        this.f7284g = interfaceC9041L9;
    }

    /* renamed from: a */
    public static C9207S8 m5604a() {
        return new C9207S8(f7277i);
    }
}
