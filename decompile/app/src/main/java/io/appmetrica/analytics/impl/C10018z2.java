package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.z2 */
/* loaded from: classes8.dex */
public final class C10018z2 {

    /* renamed from: a */
    public final LocationManager f9382a;

    public C10018z2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C10018z2(LocationManager locationManager) {
        this.f9382a = locationManager;
    }
}
