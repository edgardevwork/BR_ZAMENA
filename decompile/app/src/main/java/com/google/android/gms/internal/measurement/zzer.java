package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes7.dex */
final class zzer extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzdk zzf;
    private final /* synthetic */ zzdy zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzdy zzdyVar, String str, String str2, boolean z, zzdk zzdkVar) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = z;
        this.zzf = zzdkVar;
        this.zzg = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zzb() {
        this.zzf.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        ((zzdj) Preconditions.checkNotNull(this.zzg.zzj)).getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }
}
