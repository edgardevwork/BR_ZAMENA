package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzne implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznb zzb;

    public zzne(zznb zznbVar, long j) {
        this.zza = j;
        this.zzb = zznbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznb.zzb(this.zzb, this.zza);
    }
}
