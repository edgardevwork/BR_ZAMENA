package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes7.dex */
public final class zzgd extends com.google.android.gms.internal.measurement.zzbu implements zzgb {
    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzaj zza(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        Parcel parcelZza = zza(21, parcelM1087a_);
        zzaj zzajVar = (zzaj) com.google.android.gms.internal.measurement.zzbw.zza(parcelZza, zzaj.CREATOR);
        parcelZza.recycle();
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzb(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        Parcel parcelZza = zza(11, parcelM1087a_);
        String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzno> zza(zzo zzoVar, Bundle bundle) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, bundle);
        Parcel parcelZza = zza(24, parcelM1087a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzno.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzon> zza(zzo zzoVar, boolean z) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, z);
        Parcel parcelZza = zza(7, parcelM1087a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzon.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzae> zza(String str, String str2, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        Parcel parcelZza = zza(16, parcelM1087a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzae.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzae> zza(String str, String str2, String str3) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        parcelM1087a_.writeString(str3);
        Parcel parcelZza = zza(17, parcelM1087a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzae.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzon> zza(String str, String str2, boolean z, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, z);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        Parcel parcelZza = zza(14, parcelM1087a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzon.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzon> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        parcelM1087a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, z);
        Parcel parcelZza = zza(15, parcelM1087a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzon.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    public zzgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzc(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(27, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzd(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(4, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzbf zzbfVar, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzbfVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(1, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzbf zzbfVar, String str, String str2) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzbfVar);
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzb(5, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(18, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzae zzaeVar, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzaeVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(12, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzae zzaeVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzaeVar);
        zzb(13, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(20, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeLong(j);
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        parcelM1087a_.writeString(str3);
        zzb(10, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(19, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzb(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(28, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(26, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(6, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(25, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzon zzonVar, zzo zzoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzonVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzoVar);
        zzb(2, parcelM1087a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zza(zzbf zzbfVar, String str) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM1087a_, zzbfVar);
        parcelM1087a_.writeString(str);
        Parcel parcelZza = zza(9, parcelM1087a_);
        byte[] bArrCreateByteArray = parcelZza.createByteArray();
        parcelZza.recycle();
        return bArrCreateByteArray;
    }
}
