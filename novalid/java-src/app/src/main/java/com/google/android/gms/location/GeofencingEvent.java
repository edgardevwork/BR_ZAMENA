package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
public class GeofencingEvent {
    private final int zza;

    @Geofence.GeofenceTransition
    private final int zzb;
    private final List<Geofence> zzc;
    private final Location zzd;

    private GeofencingEvent(int i, @Geofence.GeofenceTransition int i2, List<Geofence> list, Location location) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = list;
        this.zzd = location;
    }

    @NonNull
    public static GeofencingEvent fromIntent(@NonNull Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 == 1 || intExtra2 == 2) {
                i = intExtra2;
            } else if (intExtra2 == 4) {
                i = 4;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = (byte[]) arrayList2.get(i2);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                com.google.android.gms.internal.location.zzbe zzbeVarCreateFromParcel = com.google.android.gms.internal.location.zzbe.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                arrayList.add(zzbeVarCreateFromParcel);
            }
        }
        return new GeofencingEvent(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int getErrorCode() {
        return this.zza;
    }

    @Geofence.GeofenceTransition
    public int getGeofenceTransition() {
        return this.zzb;
    }

    @NonNull
    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    @NonNull
    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
