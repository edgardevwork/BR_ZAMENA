package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes7.dex */
public final class zzdq extends zzbu implements zzdo {
    public zzdq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzdo
    public final void zza(Bundle bundle) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, bundle);
        zzb(1, parcelM1087a_);
    }
}
