package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qg */
/* loaded from: classes6.dex */
public final class C9807qg extends AbstractC9632jg {

    /* renamed from: b */
    public final SafePackageManager f8944b;

    public C9807qg(C9571h5 c9571h5) {
        this(c9571h5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:50:0x0043, B:52:0x004d, B:53:0x005d, B:54:0x0066, B:56:0x006c, B:58:0x008f, B:59:0x0094, B:60:0x0098), top: B:64:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:50:0x0043, B:52:0x004d, B:53:0x005d, B:54:0x0066, B:56:0x006c, B:58:0x008f, B:59:0x0094, B:60:0x0098), top: B:64:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        HashSet hashSet;
        ArrayList arrayListM6707b;
        C9571h5 c9571h5 = this.f8444a;
        if (c9571h5.f8249v.m6945c() && c9571h5.m6228y()) {
            C9755oe c9755oe = c9571h5.f8230c;
            String strM6600e = this.f8444a.f8230c.m6600e();
            if (TextUtils.isEmpty(strM6600e)) {
                hashSet = null;
                try {
                    arrayListM6707b = m6707b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, arrayListM6707b)) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = arrayListM6707b.iterator();
                        while (it.hasNext()) {
                            C9137P9 c9137p9 = (C9137P9) it.next();
                            c9137p9.getClass();
                            JSONObject jSONObjectPut = new JSONObject().put("name", c9137p9.f7085a).put("required", c9137p9.f7087c);
                            int i = c9137p9.f7086b;
                            if (i != -1) {
                                jSONObjectPut.put("version", i);
                            }
                            jSONArray.put(jSONObjectPut);
                        }
                        C9252U5 c9252u5M5636a = C9252U5.m5636a(c9252u5, new JSONObject().put("features", jSONArray).toString());
                        C9625j9 c9625j9 = c9571h5.f8242o;
                        c9625j9.m6308a(c9252u5M5636a, C9338Xj.m5752a(c9625j9.f8421c.m5756b(c9252u5M5636a), c9252u5M5636a.f7317i));
                        int i2 = c9625j9.f8429k;
                        c9625j9.f8431m = i2;
                        c9625j9.f8419a.m6592a(i2).m6648b();
                        c9755oe.m6605i(jSONArray.toString());
                    } else {
                        C9625j9 c9625j92 = c9571h5.f8242o;
                        int i3 = c9625j92.f8429k;
                        c9625j92.f8431m = i3;
                        c9625j92.f8419a.m6592a(i3).m6648b();
                    }
                } catch (Throwable unused) {
                }
            } else {
                try {
                    hashSet = new HashSet();
                    JSONArray jSONArray2 = new JSONArray(strM6600e);
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        hashSet.add(new C9137P9(jSONArray2.getJSONObject(i4)));
                    }
                } catch (Throwable unused2) {
                }
                arrayListM6707b = m6707b();
                if (CollectionUtils.areCollectionsEqual(hashSet, arrayListM6707b)) {
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ArrayList m6707b() {
        FeatureInfo[] featureInfoArr;
        try {
            C9571h5 c9571h5 = this.f8444a;
            SafePackageManager safePackageManager = this.f8944b;
            Context context = c9571h5.f8228a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC9113O9 c9065m9 = AndroidUtils.isApiAchieved(24) ? new C9065M9() : new C9089N9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c9065m9.m5455a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public C9807qg(C9571h5 c9571h5, @NonNull SafePackageManager safePackageManager) {
        super(c9571h5);
        this.f8944b = safePackageManager;
    }
}
