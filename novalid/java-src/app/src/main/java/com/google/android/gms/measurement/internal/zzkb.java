package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes7.dex */
final class zzkb extends zzav {
    private final /* synthetic */ zzjq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkb(zzjq zzjqVar, zzjc zzjcVar) {
        super(zzjcVar);
        this.zza = zzjqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    @WorkerThread
    public final void zzb() {
        this.zza.zzas();
    }
}
