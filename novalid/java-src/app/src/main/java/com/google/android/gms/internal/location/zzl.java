package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
/* loaded from: classes7.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", m1069id = 1)
    final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "null", m1069id = 2)
    final zzj zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", m1069id = 3, type = "android.os.IBinder")
    final com.google.android.gms.location.zzax zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", m1069id = 4, type = "android.os.IBinder")
    final zzai zzd;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m1070id = 1) int i, @SafeParcelable.Param(m1070id = 2) zzj zzjVar, @SafeParcelable.Param(m1070id = 3) IBinder iBinder, @SafeParcelable.Param(m1070id = 4) IBinder iBinder2) {
        this.zza = i;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzaw.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzax zzaxVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzaxVar == null ? null : zzaxVar.asBinder(), false);
        zzai zzaiVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
