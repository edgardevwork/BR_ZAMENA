package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes7.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* renamed from: a */
    private final LocationListener f6273a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f6273a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f6273a.onLocationChanged(location);
    }
}
