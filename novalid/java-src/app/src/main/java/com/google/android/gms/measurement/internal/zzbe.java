package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbg();

    @SafeParcelable.Field(getter = "z", m1069id = 2)
    private final Bundle zza;

    public final int zza() {
        return this.zza.size();
    }

    public final Bundle zzb() {
        return new Bundle(this.zza);
    }

    public final Double zza(String str) {
        return Double.valueOf(this.zza.getDouble(str));
    }

    public final Long zzb(String str) {
        return Long.valueOf(this.zza.getLong(str));
    }

    public final Object zzc(String str) {
        return this.zza.get(str);
    }

    public final String zzd(String str) {
        return this.zza.getString(str);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbd(this);
    }

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(m1070id = 2) Bundle bundle) {
        this.zza = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzb(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
