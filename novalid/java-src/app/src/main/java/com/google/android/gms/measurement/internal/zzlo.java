package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzlo implements Runnable {
    private final /* synthetic */ zzlj zza;

    public zzlo(zzlj zzljVar) {
        this.zza = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zza;
        zzljVar.zza = zzljVar.zzh;
    }
}
