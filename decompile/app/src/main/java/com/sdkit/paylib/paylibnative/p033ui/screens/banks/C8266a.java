package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.a */
/* loaded from: classes6.dex */
public final class C8266a implements InterfaceC8271f {

    /* renamed from: a */
    public final List f2784a;

    /* renamed from: b */
    public final boolean f2785b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.a$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a */
        public final String f2786a;

        /* renamed from: b */
        public final String f2787b;

        /* renamed from: c */
        public final String f2788c;

        /* renamed from: d */
        public final boolean f2789d;

        /* renamed from: e */
        public final String f2790e;

        /* renamed from: f */
        public final boolean f2791f;

        public a(String title, String iconUrl, String packageName, boolean z, String schemaDeeplink, boolean z2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(schemaDeeplink, "schemaDeeplink");
            this.f2786a = title;
            this.f2787b = iconUrl;
            this.f2788c = packageName;
            this.f2789d = z;
            this.f2790e = schemaDeeplink;
            this.f2791f = z2;
        }

        /* renamed from: a */
        public static /* synthetic */ a m2552a(a aVar, String str, String str2, String str3, boolean z, String str4, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f2786a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f2787b;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = aVar.f2788c;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                z = aVar.f2789d;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                str4 = aVar.f2790e;
            }
            String str7 = str4;
            if ((i & 32) != 0) {
                z2 = aVar.f2791f;
            }
            return aVar.m2553a(str, str5, str6, z3, str7, z2);
        }

        /* renamed from: b */
        public final String m2555b() {
            return this.f2788c;
        }

        /* renamed from: c */
        public final String m2556c() {
            return this.f2790e;
        }

        /* renamed from: d */
        public final boolean m2557d() {
            return this.f2791f;
        }

        /* renamed from: e */
        public final String m2558e() {
            return this.f2786a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f2786a, aVar.f2786a) && Intrinsics.areEqual(this.f2787b, aVar.f2787b) && Intrinsics.areEqual(this.f2788c, aVar.f2788c) && this.f2789d == aVar.f2789d && Intrinsics.areEqual(this.f2790e, aVar.f2790e) && this.f2791f == aVar.f2791f;
        }

        /* renamed from: f */
        public final boolean m2559f() {
            return this.f2789d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iM1429a = C8031b.m1429a(this.f2788c, C8031b.m1429a(this.f2787b, this.f2786a.hashCode() * 31, 31), 31);
            boolean z = this.f2789d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int iM1429a2 = C8031b.m1429a(this.f2790e, (iM1429a + i) * 31, 31);
            boolean z2 = this.f2791f;
            return iM1429a2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("App(title=");
            sb.append(this.f2786a);
            sb.append(", iconUrl=");
            sb.append(this.f2787b);
            sb.append(", packageName=");
            sb.append(this.f2788c);
            sb.append(", isAccessible=");
            sb.append(this.f2789d);
            sb.append(", schemaDeeplink=");
            sb.append(this.f2790e);
            sb.append(", showDivider=");
            return C8030a.m1428a(sb, this.f2791f, ')');
        }

        /* renamed from: a */
        public final a m2553a(String title, String iconUrl, String packageName, boolean z, String schemaDeeplink, boolean z2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(schemaDeeplink, "schemaDeeplink");
            return new a(title, iconUrl, packageName, z, schemaDeeplink, z2);
        }

        /* renamed from: a */
        public final String m2554a() {
            return this.f2787b;
        }
    }

    public C8266a(List apps, boolean z) {
        Intrinsics.checkNotNullParameter(apps, "apps");
        this.f2784a = apps;
        this.f2785b = z;
    }

    /* renamed from: a */
    public final List m2551a() {
        return this.f2784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8266a)) {
            return false;
        }
        C8266a c8266a = (C8266a) obj;
        return Intrinsics.areEqual(this.f2784a, c8266a.f2784a) && this.f2785b == c8266a.f2785b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f2784a.hashCode() * 31;
        boolean z = this.f2785b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.screens.banks.InterfaceC8271f
    public boolean isSandbox() {
        return this.f2785b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppsList(apps=");
        sb.append(this.f2784a);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f2785b, ')');
    }
}
