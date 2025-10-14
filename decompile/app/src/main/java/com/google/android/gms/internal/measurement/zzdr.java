package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes7.dex */
public final class zzdr extends zzbu implements zzdp {
    @Override // com.google.android.gms.internal.measurement.zzdp
    public final int zza() throws RemoteException {
        Parcel parcelZza = zza(2, m1087a_());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final void zza(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, bundle);
        parcelM1087a_.writeLong(j);
        zzb(1, parcelM1087a_);
    }
}
