package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzoa implements zzob {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;

    static {
        zzhr zzhrVarZza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhrVarZza.zza("measurement.collection.event_safelist", true);
        zza = zzhrVarZza.zza("measurement.service.store_null_safelist", true);
        zzb = zzhrVarZza.zza("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
