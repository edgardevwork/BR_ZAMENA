package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes6.dex */
abstract class zzjd extends zzja {
    private boolean zza;

    public zzjd(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzu.zzaa();
    }

    public void zzaa() {
    }

    public abstract boolean zzh();

    public final void zzac() {
        if (!zzaf()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzad() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzh()) {
            return;
        }
        this.zzu.zzz();
        this.zza = true;
    }

    public final void zzae() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaa();
        this.zzu.zzz();
        this.zza = true;
    }

    public final boolean zzaf() {
        return this.zza;
    }
}
