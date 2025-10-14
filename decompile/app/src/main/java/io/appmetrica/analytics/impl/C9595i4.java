package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.i4 */
/* loaded from: classes5.dex */
public final class C9595i4 {

    /* renamed from: a */
    public final IdentifiersResult f8330a;

    /* renamed from: b */
    public final IdentifiersResult f8331b;

    /* renamed from: c */
    public final IdentifiersResult f8332c;

    /* renamed from: d */
    public final IdentifiersResult f8333d;

    /* renamed from: e */
    public final IdentifiersResult f8334e;

    /* renamed from: f */
    public final IdentifiersResult f8335f;

    /* renamed from: g */
    public final IdentifiersResult f8336g;

    /* renamed from: h */
    public final IdentifiersResult f8337h;

    /* renamed from: i */
    public final IdentifiersResult f8338i;

    /* renamed from: j */
    public final IdentifiersResult f8339j;

    /* renamed from: k */
    public final IdentifiersResult f8340k;

    /* renamed from: l */
    public final long f8341l;

    /* renamed from: m */
    public final long f8342m;

    /* renamed from: n */
    public final C9232T9 f8343n;

    /* renamed from: o */
    public final Bundle f8344o;

    public C9595i4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j, long j2, C9232T9 c9232t9, Bundle bundle) {
        this.f8330a = identifiersResult;
        this.f8331b = identifiersResult2;
        this.f8332c = identifiersResult3;
        this.f8333d = identifiersResult4;
        this.f8334e = identifiersResult5;
        this.f8335f = identifiersResult6;
        this.f8336g = identifiersResult7;
        this.f8337h = identifiersResult8;
        this.f8338i = identifiersResult9;
        this.f8339j = identifiersResult10;
        this.f8340k = identifiersResult11;
        this.f8341l = j;
        this.f8342m = j2;
        this.f8343n = c9232t9;
        this.f8344o = bundle;
    }

    /* renamed from: a */
    public static IdentifiersResult m6274a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    /* renamed from: b */
    public final void m6276b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f8330a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f8331b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f8332c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f8333d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f8334e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f8335f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f8336g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f8337h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f8338i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f8339j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f8340k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f8341l);
        bundle.putLong("NextStartupTime", this.f8342m);
        C9232T9 c9232t9 = this.f8343n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c9232t9);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C9676la.f8552C.m6376m().m5085h());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f8330a + ", mDeviceIdData=" + this.f8331b + ", mDeviceIdHashData=" + this.f8332c + ", mReportAdUrlData=" + this.f8333d + ", mGetAdUrlData=" + this.f8334e + ", mResponseClidsData=" + this.f8335f + ", mClientClidsForRequestData=" + this.f8336g + ", mGaidData=" + this.f8337h + ", mHoaidData=" + this.f8338i + ", yandexAdvIdData=" + this.f8339j + ", customSdkHostsData=" + this.f8340k + ", mServerTimeOffset=" + this.f8341l + ", nextStartupTime=" + this.f8342m + ", features=" + this.f8343n + ", modulesConfig=" + this.f8344o + '}';
    }

    /* renamed from: a */
    public static C9232T9 m6272a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C9232T9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C9232T9 c9232t9 = (C9232T9) parcelable;
        return c9232t9 == null ? new C9232T9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c9232t9;
    }

    /* renamed from: a */
    public static IdentifiersResult m6275a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    public static C9232T9 m6273a(Boolean bool) {
        boolean z = bool != null;
        return new C9232T9(bool, z ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z ? null : "no identifier in startup state");
    }
}
