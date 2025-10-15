package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes7.dex */
final class zzee extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdy zzdyVar, String str) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        ((zzdj) Preconditions.checkNotNull(this.zzd.zzj)).setUserId(this.zzc, this.zza);
    }
}
