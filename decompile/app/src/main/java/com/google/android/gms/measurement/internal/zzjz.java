package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzjz implements Executor {
    private final /* synthetic */ zzjq zza;

    public zzjz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws IllegalStateException {
        this.zza.zzl().zzb(runnable);
    }
}
