package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.T5 */
/* loaded from: classes5.dex */
public final class C9228T5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC9675l9 enumC9675l9;
        Bundle bundle = parcel.readBundle(ResultReceiverC8817C6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i = bundle.getInt("CounterReport.Source");
            EnumC9675l9[] enumC9675l9ArrValues = EnumC9675l9.values();
            int length = enumC9675l9ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC9675l9 = EnumC9675l9.NATIVE;
                    break;
                }
                enumC9675l9 = enumC9675l9ArrValues[i2];
                if (enumC9675l9.f8551a == i) {
                    break;
                }
                i2++;
            }
        } else {
            enumC9675l9 = null;
        }
        C9252U5 c9252u5 = new C9252U5("", "", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = bundle.getInt("CounterReport.Type", -1);
        c9252u5.f7313e = bundle.getInt("CounterReport.CustomType");
        c9252u5.f7310b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        c9252u5.f7311c = bundle.getString("CounterReport.Environment");
        c9252u5.f7309a = bundle.getString("CounterReport.Event");
        c9252u5.f7314f = C9252U5.m5631a(bundle);
        c9252u5.f7315g = bundle.getInt("CounterReport.TRUNCATED");
        c9252u5.f7316h = bundle.getString("CounterReport.ProfileID");
        c9252u5.f7317i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        c9252u5.f7318j = bundle.getLong("CounterReport.CreationTimestamp");
        c9252u5.f7319k = EnumC9426ba.m5911a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        c9252u5.f7320l = enumC9675l9;
        c9252u5.f7321m = bundle.getBundle("CounterReport.Payload");
        c9252u5.f7322n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c9252u5.f7323o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        c9252u5.f7324p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return c9252u5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C9252U5[i];
    }
}
