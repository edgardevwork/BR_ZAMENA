package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes7.dex */
final class zzeg extends zzdy.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzdy zzdyVar, Boolean bool) {
        super(zzdyVar);
        this.zzc = bool;
        this.zzd = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        if (this.zzc != null) {
            ((zzdj) Preconditions.checkNotNull(this.zzd.zzj)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            ((zzdj) Preconditions.checkNotNull(this.zzd.zzj)).clearMeasurementEnabled(this.zza);
        }
    }
}
