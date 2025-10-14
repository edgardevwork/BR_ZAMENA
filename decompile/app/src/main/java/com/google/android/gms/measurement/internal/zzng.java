package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzng {
    final /* synthetic */ zznb zza;
    private zznf zzb;

    public zzng(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @WorkerThread
    public final void zza(long j) {
        this.zzb = new zznf(this, this.zza.zzb().currentTimeMillis(), j);
        this.zza.zzc.postDelayed(this.zzb, 2000L);
    }

    @WorkerThread
    public final void zza() {
        this.zza.zzt();
        if (this.zzb != null) {
            this.zza.zzc.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
        if (this.zza.zze().zza(zzbh.zzcl) && this.zza.zzm().zzau()) {
            this.zza.zzj().zzp().zza("Retrying trigger URI registration in foreground");
            this.zza.zzm().zzas();
        }
    }
}
