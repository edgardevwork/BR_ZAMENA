package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
final class zzin implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzic zzc;

    public zzin(zzic zzicVar, zzae zzaeVar, zzo zzoVar) {
        this.zza = zzaeVar;
        this.zzb = zzoVar;
        this.zzc = zzicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzr();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zza(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzb(this.zza, this.zzb);
        }
    }
}
