package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzjo {
    final Context zza;

    @Nullable
    String zzb;

    @Nullable
    String zzc;

    @Nullable
    String zzd;

    @Nullable
    Boolean zze;
    long zzf;

    @Nullable
    com.google.android.gms.internal.measurement.zzdw zzg;
    boolean zzh;

    @Nullable
    Long zzi;

    @Nullable
    String zzj;

    @VisibleForTesting
    public zzjo(Context context, @Nullable com.google.android.gms.internal.measurement.zzdw zzdwVar, @Nullable Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzdwVar != null) {
            this.zzg = zzdwVar;
            this.zzb = zzdwVar.zzf;
            this.zzc = zzdwVar.zze;
            this.zzd = zzdwVar.zzd;
            this.zzh = zzdwVar.zzc;
            this.zzf = zzdwVar.zzb;
            this.zzj = zzdwVar.zzh;
            Bundle bundle = zzdwVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
