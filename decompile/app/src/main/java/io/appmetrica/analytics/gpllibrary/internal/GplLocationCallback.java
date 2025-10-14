package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes7.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a */
    private final LocationListener f6272a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f6272a = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.f6272a.onLocationChanged(locationResult.getLastLocation());
    }
}
