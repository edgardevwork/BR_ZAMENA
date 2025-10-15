package com.sdkit.paylib.paylibnative.p033ui.common.view;

import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.a */
/* loaded from: classes8.dex */
public final class C8127a {

    /* renamed from: d */
    public static final a f1924d = new a(null);

    /* renamed from: e */
    public static final C8127a f1925e = new C8127a(C11403R.attr.paylib_native_button_primary_color, C11403R.attr.paylib_native_button_text_primary_color, null, 4, null);

    /* renamed from: f */
    public static final C8127a f1926f = new C8127a(C11403R.attr.paylib_native_button_secondary_color, C11403R.attr.paylib_native_button_text_secondary_color, null, 4, null);

    /* renamed from: a */
    public final int f1927a;

    /* renamed from: b */
    public final int f1928b;

    /* renamed from: c */
    public final b f1929c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.a$a */
    public static final class a {
        public a() {
        }

        /* renamed from: a */
        public final C8127a m1971a() {
            return C8127a.f1925e;
        }

        /* renamed from: b */
        public final C8127a m1972b() {
            return C8127a.f1926f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f1930a;

        /* renamed from: b */
        public final Integer f1931b;

        public b(int i, Integer num) {
            this.f1930a = i;
            this.f1931b = num;
        }

        /* renamed from: a */
        public final Integer m1973a() {
            return this.f1931b;
        }

        /* renamed from: b */
        public final int m1974b() {
            return this.f1930a;
        }
    }

    public C8127a(int i, int i2, b bVar) {
        this.f1927a = i;
        this.f1928b = i2;
        this.f1929c = bVar;
    }

    /* renamed from: c */
    public final int m1968c() {
        return this.f1927a;
    }

    /* renamed from: d */
    public final b m1969d() {
        return this.f1929c;
    }

    /* renamed from: e */
    public final int m1970e() {
        return this.f1928b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8127a)) {
            return false;
        }
        C8127a c8127a = (C8127a) obj;
        return this.f1927a == c8127a.f1927a && this.f1928b == c8127a.f1928b && Intrinsics.areEqual(this.f1929c, c8127a.f1929c);
    }

    public int hashCode() {
        int iM1525a = C8054b.m1525a(this.f1928b, Integer.hashCode(this.f1927a) * 31, 31);
        b bVar = this.f1929c;
        return iM1525a + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "PaylibButtonStyle(backgroundColorRes=" + this.f1927a + ", textColorRes=" + this.f1928b + ", icon=" + this.f1929c + ')';
    }

    public /* synthetic */ C8127a(int i, int i2, b bVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : bVar);
    }
}
