package com.sdkit.paylib.paylibnative.p033ui.deviceauth;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.a */
/* loaded from: classes8.dex */
public final class C8206a {

    /* renamed from: a */
    public final String f2268a;

    /* renamed from: b */
    public final String f2269b;

    /* renamed from: c */
    public final String f2270c;

    /* renamed from: d */
    public final String f2271d;

    public C8206a(String title, String cancelButtonTitle, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cancelButtonTitle, "cancelButtonTitle");
        this.f2268a = title;
        this.f2269b = cancelButtonTitle;
        this.f2270c = str;
        this.f2271d = str2;
    }

    /* renamed from: a */
    public final String m2169a() {
        return this.f2269b;
    }

    /* renamed from: b */
    public final String m2170b() {
        return this.f2271d;
    }

    /* renamed from: c */
    public final String m2171c() {
        return this.f2270c;
    }

    /* renamed from: d */
    public final String m2172d() {
        return this.f2268a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8206a)) {
            return false;
        }
        C8206a c8206a = (C8206a) obj;
        return Intrinsics.areEqual(this.f2268a, c8206a.f2268a) && Intrinsics.areEqual(this.f2269b, c8206a.f2269b) && Intrinsics.areEqual(this.f2270c, c8206a.f2270c) && Intrinsics.areEqual(this.f2271d, c8206a.f2271d);
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.f2269b, this.f2268a.hashCode() * 31, 31);
        String str = this.f2270c;
        int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2271d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceAuthPromptTraits(title=");
        sb.append(this.f2268a);
        sb.append(", cancelButtonTitle=");
        sb.append(this.f2269b);
        sb.append(", subtitle=");
        sb.append(this.f2270c);
        sb.append(", description=");
        return C8032c.m1430a(sb, this.f2271d, ')');
    }

    public /* synthetic */ C8206a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
