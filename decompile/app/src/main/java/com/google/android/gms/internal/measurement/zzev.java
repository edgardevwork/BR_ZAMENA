package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes7.dex */
final class zzev extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdk zzd;
    private final /* synthetic */ zzdy zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzdy zzdyVar, String str, zzdk zzdkVar) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = zzdkVar;
        this.zze = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        ((zzdj) Preconditions.checkNotNull(this.zze.zzj)).getMaxUserProperties(this.zzc, this.zzd);
    }
}
