package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.Se */
/* loaded from: classes5.dex */
public final class C9213Se implements Parcelable {

    /* renamed from: a */
    public final ContentValues f7251a;

    /* renamed from: b */
    public final ResultReceiver f7252b;

    /* renamed from: c */
    public static final String f7250c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C9213Se> CREATOR = new C9189Re();

    public C9213Se(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f7251a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f7250c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f7252b = resultReceiver;
    }

    /* renamed from: a */
    public final void m5558a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap mapM5337b = AbstractC9029Kl.m5337b(map);
            synchronized (this) {
                this.f7251a.put("PROCESS_CFG_CLIDS", AbstractC9452cb.m5968b(mapM5337b));
            }
        }
    }

    /* renamed from: b */
    public final void m5560b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f7251a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC9664kn.m6344a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    /* renamed from: c */
    public final void m5562c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f7251a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            m5570j();
        }
    }

    /* renamed from: d */
    public final void m5564d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                m5560b(appMetricaConfig);
                m5558a(appMetricaConfig);
                m5562c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m5565e() {
        return this.f7251a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public final String m5566f() {
        return this.f7251a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public final Integer m5567g() {
        return this.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public final String m5568h() {
        return this.f7251a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public final boolean m5569i() {
        return this.f7251a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    /* renamed from: j */
    public final synchronized void m5570j() {
        this.f7251a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f7251a + ", mDataResultReceiver=" + this.f7252b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f7251a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f7252b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public final HashMap m5557a() {
        return AbstractC9452cb.m5970c(this.f7251a.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: c */
    public final ResultReceiver m5561c() {
        return this.f7252b;
    }

    /* renamed from: d */
    public final String m5563d() {
        return this.f7251a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public C9213Se(C9213Se c9213Se) {
        synchronized (c9213Se) {
            this.f7251a = new ContentValues(c9213Se.f7251a);
            this.f7252b = c9213Se.f7252b;
        }
    }

    /* renamed from: b */
    public final ArrayList m5559b() {
        String asString = this.f7251a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC9452cb.m5969b(asString);
    }

    public C9213Se(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f7251a = contentValues == null ? new ContentValues() : contentValues;
        this.f7252b = resultReceiver;
    }
}
