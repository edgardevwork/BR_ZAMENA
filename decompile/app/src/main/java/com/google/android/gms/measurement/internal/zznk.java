package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes7.dex */
final class zznk extends zzav {
    private final /* synthetic */ zznh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznk(zznh zznhVar, zzjc zzjcVar) {
        super(zzjcVar);
        this.zza = zznhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    @WorkerThread
    public final void zzb() throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        zznh.zza(this.zza);
    }
}
