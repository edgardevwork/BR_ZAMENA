package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
/* loaded from: classes6.dex */
public final class zzno extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzno> CREATOR = new zznn();

    @SafeParcelable.Field(m1069id = 1)
    public final String zza;

    @SafeParcelable.Field(m1069id = 2)
    public final long zzb;

    @SafeParcelable.Field(m1069id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzno(@SafeParcelable.Param(m1070id = 1) String str, @SafeParcelable.Param(m1070id = 2) long j, @SafeParcelable.Param(m1070id = 3) int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
