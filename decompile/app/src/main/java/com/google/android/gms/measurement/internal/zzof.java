package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes7.dex */
final class zzof implements zzor {
    final /* synthetic */ zznv zza;

    public zzof(zznv zznvVar) {
        this.zza = zznvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    public final void zza(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzl().zzb(new zzoh(this, str, str2, bundle));
        } else if (this.zza.zzm != null) {
            this.zza.zzm.zzj().zzg().zza("AppId not known when logging event", str2);
        }
    }
}
