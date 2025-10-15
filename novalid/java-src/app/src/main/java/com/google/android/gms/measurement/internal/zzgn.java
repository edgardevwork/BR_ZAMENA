package com.google.android.gms.measurement.internal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzgn implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzgo zzf;

    public zzgn(zzgo zzgoVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzha zzhaVarZzn = this.zzf.zzu.zzn();
        if (!zzhaVarZzn.zzaf()) {
            this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.zzf.zza == 0) {
            if (this.zzf.zze().zzz()) {
                this.zzf.zza = 'C';
            } else {
                this.zzf.zza = 'c';
            }
        }
        if (this.zzf.zzb < 0) {
            this.zzf.zzb = 106000L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.zza) + this.zzf.zza + this.zzf.zzb + StringUtils.PROCESS_POSTFIX_DELIMITER + zzgo.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
        if (strSubstring.length() > 1024) {
            strSubstring = this.zzb.substring(0, 1024);
        }
        zzhe zzheVar = zzhaVarZzn.zzb;
        if (zzheVar != null) {
            zzheVar.zza(strSubstring, 1L);
        }
    }
}
