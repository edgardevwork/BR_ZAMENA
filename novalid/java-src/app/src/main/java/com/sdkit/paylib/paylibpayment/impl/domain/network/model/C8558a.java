package com.sdkit.paylib.paylibpayment.impl.domain.network.model;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.model.a */
/* loaded from: classes8.dex */
public final class C8558a {

    /* renamed from: a */
    public final String f5028a;

    /* renamed from: b */
    public final String f5029b;

    /* renamed from: c */
    public final String f5030c;

    /* renamed from: d */
    public final String f5031d;

    /* renamed from: e */
    public final String f5032e;

    /* renamed from: f */
    public final String f5033f;

    /* renamed from: g */
    public final String f5034g;

    /* renamed from: h */
    public final String f5035h;

    /* renamed from: i */
    public final String f5036i;

    public C8558a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f5028a = str;
        this.f5029b = str2;
        this.f5030c = str3;
        this.f5031d = str4;
        this.f5032e = str5;
        this.f5033f = str6;
        this.f5034g = str7;
        this.f5035h = str8;
        this.f5036i = str9;
    }

    /* renamed from: a */
    public final String m4145a() {
        return this.f5036i;
    }

    /* renamed from: b */
    public final String m4146b() {
        return this.f5035h;
    }

    /* renamed from: c */
    public final String m4147c() {
        return this.f5032e;
    }

    /* renamed from: d */
    public final String m4148d() {
        return this.f5031d;
    }

    /* renamed from: e */
    public final String m4149e() {
        return this.f5030c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8558a)) {
            return false;
        }
        C8558a c8558a = (C8558a) obj;
        return Intrinsics.areEqual(this.f5028a, c8558a.f5028a) && Intrinsics.areEqual(this.f5029b, c8558a.f5029b) && Intrinsics.areEqual(this.f5030c, c8558a.f5030c) && Intrinsics.areEqual(this.f5031d, c8558a.f5031d) && Intrinsics.areEqual(this.f5032e, c8558a.f5032e) && Intrinsics.areEqual(this.f5033f, c8558a.f5033f) && Intrinsics.areEqual(this.f5034g, c8558a.f5034g) && Intrinsics.areEqual(this.f5035h, c8558a.f5035h) && Intrinsics.areEqual(this.f5036i, c8558a.f5036i);
    }

    /* renamed from: f */
    public final String m4150f() {
        return this.f5028a;
    }

    /* renamed from: g */
    public final String m4151g() {
        return this.f5029b;
    }

    /* renamed from: h */
    public final String m4152h() {
        return this.f5033f;
    }

    public int hashCode() {
        String str = this.f5028a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5029b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5030c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5031d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5032e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5033f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5034g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5035h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5036i;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m4153i() {
        return this.f5034g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(devicePlatformType=");
        sb.append(this.f5028a);
        sb.append(", devicePlatformVersion=");
        sb.append(this.f5029b);
        sb.append(", deviceModel=");
        sb.append(this.f5030c);
        sb.append(", deviceManufacturer=");
        sb.append(this.f5031d);
        sb.append(", deviceId=");
        sb.append(this.f5032e);
        sb.append(", surface=");
        sb.append(this.f5033f);
        sb.append(", surfaceVersion=");
        sb.append(this.f5034g);
        sb.append(", channel=");
        sb.append(this.f5035h);
        sb.append(", authConnector=");
        return C8032c.m1430a(sb, this.f5036i, ')');
    }
}
