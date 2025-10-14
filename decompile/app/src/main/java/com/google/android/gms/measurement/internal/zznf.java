package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zznf implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzng zzc;

    public zznf(zzng zzngVar, long j, long j2) {
        this.zzc = zzngVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzc.zza.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final void run() {
                zznf zznfVar = this.zza;
                zzng zzngVar = zznfVar.zzc;
                long j = zznfVar.zza;
                long j2 = zznfVar.zzb;
                zzngVar.zza.zzt();
                zzngVar.zza.zzj().zzc().zza("Application going to the background");
                zzngVar.zza.zzk().zzn.zza(true);
                zzngVar.zza.zza(true);
                if (!zzngVar.zza.zze().zzw()) {
                    if (zzngVar.zza.zze().zza(zzbh.zzcp)) {
                        zzngVar.zza.zza(false, false, j2);
                        zzngVar.zza.zzb.zzb(j2);
                    } else {
                        zzngVar.zza.zzb.zzb(j2);
                        zzngVar.zza.zza(false, false, j2);
                    }
                }
                zzngVar.zza.zzj().zzo().zza("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                if (zzngVar.zza.zze().zza(zzbh.zzdd)) {
                    zzngVar.zza.zzm().zzam();
                }
            }
        });
    }
}
