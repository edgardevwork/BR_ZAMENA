package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzhb {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final /* synthetic */ zzha zze;

    @WorkerThread
    public final long zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public zzhb(zzha zzhaVar, String str, long j) {
        this.zze = zzhaVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = j;
    }

    @WorkerThread
    public final void zza(long j) {
        SharedPreferences.Editor editorEdit = this.zze.zzg().edit();
        editorEdit.putLong(this.zza, j);
        editorEdit.apply();
        this.zzd = j;
    }
}
