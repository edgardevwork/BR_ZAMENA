package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
final class zziz implements Runnable {
    private final /* synthetic */ zzon zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzic zzc;

    public zziz(zzic zzicVar, zzon zzonVar, zzo zzoVar) {
        this.zza = zzonVar;
        this.zzb = zzoVar;
        this.zzc = zzicVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzc.zza.zzr();
        if (this.zza.zza() == null) {
            this.zzc.zza.zza(this.zza.zza, this.zzb);
        } else {
            this.zzc.zza.zza(this.zza, this.zzb);
        }
    }
}
