package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzid implements Runnable {
    private final /* synthetic */ zzjo zza;
    private final /* synthetic */ zzhy zzb;

    public zzid(zzhy zzhyVar, zzjo zzjoVar) {
        this.zza = zzjoVar;
        this.zzb = zzhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        zzhy.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}
