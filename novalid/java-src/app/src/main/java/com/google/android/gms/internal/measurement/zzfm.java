package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes7.dex */
final class zzfm extends zzdy.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdk zzd;
    private final /* synthetic */ zzdy.zzd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzdy.zzd zzdVar, Activity activity, zzdk zzdkVar) {
        super(zzdy.this);
        this.zzc = activity;
        this.zzd = zzdkVar;
        this.zze = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        ((zzdj) Preconditions.checkNotNull(zzdy.this.zzj)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}
