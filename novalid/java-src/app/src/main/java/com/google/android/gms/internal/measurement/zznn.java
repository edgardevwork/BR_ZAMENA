package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zznn implements zznk {
    private static final zzhj<Long> zza;

    @Override // com.google.android.gms.internal.measurement.zznk
    public final long zza() {
        return zza.zza().longValue();
    }

    static {
        zzhr zzhrVarZza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhrVarZza.zza("measurement.client.consent_state_v1", true);
        zzhrVarZza.zza("measurement.client.3p_consent_state_v1", true);
        zzhrVarZza.zza("measurement.service.consent_state_v1_W36", true);
        zza = zzhrVarZza.zza("measurement.service.storage_consent_support_version", 203600L);
    }
}
