package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes7.dex */
final class zzz extends zzaa {
    private zzfo.zze zzg;
    private final /* synthetic */ zzt zzh;

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final int zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzt zztVar, String str, int i, zzfo.zze zzeVar) {
        super(str, i);
        this.zzh = zztVar;
        this.zzg = zzeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zza(Long l, Long l2, zzfy.zzo zzoVar, boolean z) {
        byte b = com.google.android.gms.internal.measurement.zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbn);
        boolean zZzf = this.zzg.zzf();
        boolean zZzg = this.zzg.zzg();
        boolean zZzh = this.zzg.zzh();
        byte b2 = zZzf || zZzg || zZzh;
        Boolean boolZza = null;
        boolZza = null;
        boolZza = null;
        boolZza = null;
        boolZza = null;
        if (z && b2 == false) {
            this.zzh.zzj().zzp().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzi() ? Integer.valueOf(this.zzg.zza()) : null);
            return true;
        }
        zzfo.zzc zzcVarZzb = this.zzg.zzb();
        boolean zZzf2 = zzcVarZzb.zzf();
        if (zzoVar.zzk()) {
            if (!zzcVarZzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            } else {
                boolZza = zzaa.zza(zzaa.zza(zzoVar.zzc(), zzcVarZzb.zzc()), zZzf2);
            }
        } else if (zzoVar.zzi()) {
            if (!zzcVarZzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            } else {
                boolZza = zzaa.zza(zzaa.zza(zzoVar.zza(), zzcVarZzb.zzc()), zZzf2);
            }
        } else if (zzoVar.zzm()) {
            if (!zzcVarZzb.zzj()) {
                if (!zzcVarZzb.zzh()) {
                    this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(zzoVar.zzg()));
                } else if (zzoo.zzb(zzoVar.zzh())) {
                    boolZza = zzaa.zza(zzaa.zza(zzoVar.zzh(), zzcVarZzb.zzc()), zZzf2);
                } else {
                    this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(zzoVar.zzg()), zzoVar.zzh());
                }
            } else {
                boolZza = zzaa.zza(zzaa.zza(zzoVar.zzh(), zzcVarZzb.zzd(), this.zzh.zzj()), zZzf2);
            }
        } else {
            this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(zzoVar.zzg()));
        }
        this.zzh.zzj().zzp().zza("Property filter result", boolZza == null ? "null" : boolZza);
        if (boolZza == null) {
            return false;
        }
        this.zzc = Boolean.TRUE;
        if (zZzh && !boolZza.booleanValue()) {
            return true;
        }
        if (!z || this.zzg.zzf()) {
            this.zzd = boolZza;
        }
        if (boolZza.booleanValue() && b2 != false && zzoVar.zzl()) {
            long jZzd = zzoVar.zzd();
            if (l != null) {
                jZzd = l.longValue();
            }
            if (b != false && this.zzg.zzf() && !this.zzg.zzg() && l2 != null) {
                jZzd = l2.longValue();
            }
            if (this.zzg.zzg()) {
                this.zzf = Long.valueOf(jZzd);
            } else {
                this.zze = Long.valueOf(jZzd);
            }
        }
        return true;
    }
}
