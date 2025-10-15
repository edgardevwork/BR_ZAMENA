package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public class zzg extends com.google.android.play.core.review.internal.zzg {
    public final com.google.android.play.core.review.internal.zzi zza;
    public final TaskCompletionSource zzb;
    public final /* synthetic */ zzi zzc;

    public zzg(zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, TaskCompletionSource taskCompletionSource) {
        this.zzc = zziVar;
        this.zza = zziVar2;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) throws RemoteException {
        zzt zztVar = this.zzc.zza;
        if (zztVar != null) {
            zztVar.zzr(this.zzb);
        }
        this.zza.zzd("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
