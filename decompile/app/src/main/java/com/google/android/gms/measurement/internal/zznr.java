package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes8.dex */
abstract class zznr extends zzns {
    private boolean zza;

    public zznr(zznv zznvVar) {
        super(zznvVar);
        this.zzg.zzu();
    }

    public abstract boolean zzc();

    public final void zzal() {
        if (!zzan()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzam() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzc();
        this.zzg.zzt();
        this.zza = true;
    }

    public final boolean zzan() {
        return this.zza;
    }
}
