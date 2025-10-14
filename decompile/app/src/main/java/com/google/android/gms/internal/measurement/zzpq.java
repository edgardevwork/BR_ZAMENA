package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes6.dex */
public final class zzpq implements zzpr {
    private static final zzhj<Boolean> zza;

    static {
        zzhr zzhrVarZza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhrVarZza.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzhrVarZza.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zza = zzhrVarZza.zza("measurement.session_stitching_token_enabled", false);
        zzhrVarZza.zza("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
