package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.U5 */
/* loaded from: classes5.dex */
public class C9252U5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C9252U5> CREATOR = new C9228T5();

    /* renamed from: a */
    @Nullable
    protected String f7309a;

    /* renamed from: b */
    @Nullable
    protected String f7310b;

    /* renamed from: c */
    public String f7311c;

    /* renamed from: d */
    public int f7312d;

    /* renamed from: e */
    public int f7313e;

    /* renamed from: f */
    public Pair f7314f;

    /* renamed from: g */
    public int f7315g;

    /* renamed from: h */
    public String f7316h;

    /* renamed from: i */
    public long f7317i;

    /* renamed from: j */
    public long f7318j;

    /* renamed from: k */
    public EnumC9426ba f7319k;

    /* renamed from: l */
    public EnumC9675l9 f7320l;

    /* renamed from: m */
    public Bundle f7321m;

    /* renamed from: n */
    public Boolean f7322n;

    /* renamed from: o */
    public Integer f7323o;

    /* renamed from: p */
    public Map f7324p;

    public C9252U5() {
        this("", 0);
    }

    /* renamed from: a */
    public final void m5650a(String str, String str2) {
        if (this.f7314f == null) {
            this.f7314f = new Pair(str, str2);
        }
    }

    @Nullable
    /* renamed from: b */
    public final Pair<String, String> m5651b() {
        return this.f7314f;
    }

    /* renamed from: c */
    public final void m5655c(@Nullable Bundle bundle) {
        this.f7321m = bundle;
    }

    /* renamed from: d */
    public final long m5657d() {
        return this.f7317i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m5659e() {
        return this.f7318j;
    }

    @Nullable
    /* renamed from: f */
    public final String m5660f() {
        return this.f7311c;
    }

    @NonNull
    /* renamed from: g */
    public final EnumC9426ba m5661g() {
        return this.f7319k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f7315g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f7313e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f7324p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.f7309a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f7312d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.f7310b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.f7310b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    /* renamed from: h */
    public final Integer m5662h() {
        return this.f7323o;
    }

    @Nullable
    /* renamed from: i */
    public final Bundle m5663i() {
        return this.f7321m;
    }

    @Nullable
    /* renamed from: j */
    public final String m5664j() {
        return this.f7316h;
    }

    @Nullable
    /* renamed from: k */
    public final EnumC9675l9 m5665k() {
        return this.f7320l;
    }

    /* renamed from: l */
    public final boolean m5666l() {
        return this.f7309a == null;
    }

    /* renamed from: m */
    public final boolean m5667m() {
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        return -1 == this.f7312d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.f7315g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.f7313e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f7324p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.f7309a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.f7312d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.f7310b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.f7310b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f7309a;
        String str2 = EnumC9329Xa.m5744a(this.f7312d).f7519b;
        String strSubstring = this.f7310b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, strSubstring);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f7309a);
        bundle.putString("CounterReport.Value", this.f7310b);
        bundle.putInt("CounterReport.Type", this.f7312d);
        bundle.putInt("CounterReport.CustomType", this.f7313e);
        bundle.putInt("CounterReport.TRUNCATED", this.f7315g);
        bundle.putString("CounterReport.ProfileID", this.f7316h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f7319k.f7782a);
        Bundle bundle2 = this.f7321m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f7311c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f7314f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f7317i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f7318j);
        EnumC9675l9 enumC9675l9 = this.f7320l;
        if (enumC9675l9 != null) {
            bundle.putInt("CounterReport.Source", enumC9675l9.f8551a);
        }
        Boolean bool = this.f7322n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f7323o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f7324p));
        parcel.writeBundle(bundle);
    }

    public C9252U5(@Nullable String str, int i) {
        this("", str, i);
    }

    @NonNull
    /* renamed from: e */
    public static C9252U5 m5644e(@NonNull C9252U5 c9252u5) {
        return m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: b */
    public final void m5653b(@Nullable String str) {
        this.f7311c = str;
    }

    /* renamed from: c */
    public void mo5656c(@Nullable String str) {
        this.f7316h = str;
    }

    @NonNull
    /* renamed from: d */
    public final Bundle m5658d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C9252U5(@Nullable String str, @Nullable String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m5645a(long j) {
        this.f7317i = j;
    }

    /* renamed from: b */
    public final void m5652b(long j) {
        this.f7318j = j;
    }

    @Nullable
    /* renamed from: c */
    public final Boolean m5654c() {
        return this.f7322n;
    }

    @VisibleForTesting
    public C9252U5(@Nullable String str, @Nullable String str2, int i, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f7319k = EnumC9426ba.UNKNOWN;
        this.f7324p = new HashMap();
        this.f7309a = str2;
        this.f7312d = i;
        this.f7310b = str;
        this.f7317i = systemTimeProvider.elapsedRealtime();
        this.f7318j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    /* renamed from: b */
    public static C9252U5 m5640b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                C9252U5 c9252u5 = (C9252U5) bundle.getParcelable("CounterReport.Object");
                if (c9252u5 != null) {
                    return c9252u5;
                }
            } catch (Throwable unused) {
                return new C9252U5("", 0);
            }
        }
        return new C9252U5("", 0);
    }

    @NonNull
    /* renamed from: c */
    public static C9252U5 m5642c(@NonNull C9252U5 c9252u5) {
        return m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_INIT);
    }

    @NonNull
    /* renamed from: d */
    public static C9252U5 m5643d(@NonNull C9252U5 c9252u5) {
        C9252U5 c9252u52 = new C9252U5("", 0);
        c9252u52.f7318j = c9252u5.f7318j;
        c9252u52.f7317i = c9252u5.f7317i;
        c9252u52.f7314f = c9252u5.f7314f;
        c9252u52.f7311c = c9252u5.f7311c;
        c9252u52.f7321m = c9252u5.f7321m;
        c9252u52.f7324p = c9252u5.f7324p;
        c9252u52.f7316h = c9252u5.f7316h;
        return c9252u52;
    }

    /* renamed from: a */
    public final void m5646a(@NonNull EnumC9426ba enumC9426ba) {
        this.f7319k = enumC9426ba;
    }

    /* renamed from: a */
    public final void m5647a(@Nullable EnumC9675l9 enumC9675l9) {
        this.f7320l = enumC9675l9;
    }

    /* renamed from: a */
    public final void m5648a(@Nullable Boolean bool) {
        this.f7322n = bool;
    }

    /* renamed from: a */
    public final void m5649a(@Nullable Integer num) {
        this.f7323o = num;
    }

    /* renamed from: a */
    public static Pair m5631a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    /* renamed from: a */
    public static C9252U5 m5635a(C9252U5 c9252u5, EnumC9329Xa enumC9329Xa) {
        C9252U5 c9252u5M5643d = m5643d(c9252u5);
        c9252u5M5643d.f7312d = enumC9329Xa.f7518a;
        return c9252u5M5643d;
    }

    @NonNull
    /* renamed from: b */
    public static C9252U5 m5641b(@NonNull C9252U5 c9252u5) {
        return m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_FIRST_ACTIVATION);
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5633a(@NonNull C9252U5 c9252u5) {
        return m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_ALIVE);
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5634a(@NonNull C9252U5 c9252u5, @NonNull C9017K9 c9017k9) {
        C9252U5 c9252u5M5635a = m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_START);
        c9252u5M5635a.setValueBytes(MessageNano.toByteArray(new C9750o9().fromModel(new C9725n9((String) c9017k9.f6881a.m5678a()))));
        c9252u5M5635a.f7318j = c9252u5.f7318j;
        c9252u5M5635a.f7317i = c9252u5.f7317i;
        return c9252u5M5635a;
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5637a(@NonNull C9252U5 c9252u5, @NonNull Collection<PermissionState> collection, @Nullable C8888F2 c8888f2, @NonNull C9493e2 c9493e2, @NonNull List<String> list) {
        String string;
        String str;
        C9252U5 c9252u5M5643d = m5643d(c9252u5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c8888f2 != null) {
                jSONObject.put("background_restricted", c8888f2.f6568b);
                EnumC8863E2 enumC8863E2 = c8888f2.f6567a;
                c9493e2.getClass();
                if (enumC8863E2 != null) {
                    int iOrdinal = enumC8863E2.ordinal();
                    if (iOrdinal == 0) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 1) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 2) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 3) {
                        str = "RARE";
                    } else if (iOrdinal == 4) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5M5643d.f7312d = 12288;
        c9252u5M5643d.setValue(string);
        return c9252u5M5643d;
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5636a(@NonNull C9252U5 c9252u5, @Nullable String str) {
        C9252U5 c9252u5M5643d = m5643d(c9252u5);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5M5643d.f7312d = 12289;
        c9252u5M5643d.setValue(str);
        return c9252u5M5643d;
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5632a() {
        C9252U5 c9252u5 = new C9252U5("", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 16384;
        return c9252u5;
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5638a(@NonNull C9309We c9309We) {
        String currencyCode = "";
        int i = 0;
        C9252U5 c9252u5 = new C9252U5("", "", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 40976;
        ProductInfo productInfo = c9309We.f7404a;
        C9509ei c9509ei = new C9509ei();
        c9509ei.f8019a = productInfo.quantity;
        c9509ei.f8024f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        c9509ei.f8020b = currencyCode.getBytes();
        c9509ei.f8021c = productInfo.sku.getBytes();
        C9384Zh c9384Zh = new C9384Zh();
        c9384Zh.f7648a = productInfo.purchaseOriginalJson.getBytes();
        c9384Zh.f7649b = productInfo.signature.getBytes();
        c9509ei.f8023e = c9384Zh;
        c9509ei.f8025g = true;
        c9509ei.f8026h = 1;
        c9509ei.f8027i = AbstractC9285Ve.f7357a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        C9484di c9484di = new C9484di();
        c9484di.f7960a = productInfo.purchaseToken.getBytes();
        c9484di.f7961b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        c9509ei.f8028j = c9484di;
        if (productInfo.type == ProductType.SUBS) {
            C9459ci c9459ci = new C9459ci();
            c9459ci.f7856a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                C9434bi c9434bi = new C9434bi();
                c9434bi.f7792a = period.number;
                int i2 = AbstractC9285Ve.f7358b[period.timeUnit.ordinal()];
                c9434bi.f7793b = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2 : 1;
                c9459ci.f7857b = c9434bi;
            }
            C9409ai c9409ai = new C9409ai();
            c9409ai.f7727a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                C9434bi c9434bi2 = new C9434bi();
                c9434bi2.f7792a = period2.number;
                int i3 = AbstractC9285Ve.f7358b[period2.timeUnit.ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                } else if (i3 == 3) {
                    i = 3;
                } else if (i3 == 4) {
                    i = 4;
                }
                c9434bi2.f7793b = i;
                c9409ai.f7728b = c9434bi2;
            }
            c9409ai.f7729c = productInfo.introductoryPriceCycles;
            c9459ci.f7858c = c9409ai;
            c9509ei.f8029k = c9459ci;
        }
        c9252u5.setValueBytes(MessageNano.toByteArray(c9509ei));
        return c9252u5;
    }

    @NonNull
    /* renamed from: a */
    public static C9252U5 m5639a(@NonNull String str) {
        C9252U5 c9252u5 = new C9252U5("", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 12320;
        c9252u5.f7310b = str;
        c9252u5.f7320l = EnumC9675l9.JS;
        return c9252u5;
    }
}
