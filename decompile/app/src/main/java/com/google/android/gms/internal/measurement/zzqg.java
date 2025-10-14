package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes6.dex */
public final class zzqg implements zzqe {
    private static final zzhj<Boolean> zza;

    static {
        zzhr zzhrVarZza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhrVarZza.zza("measurement.currency.escape_underscore_fix", true);
        zzhrVarZza.zza("measurement.validation.value_and_currency_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zza() {
        return zza.zza().booleanValue();
    }
}
