package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
final class zzhq extends zzhj<Boolean> {
    @Override // com.google.android.gms.internal.measurement.zzhj
    @Nullable
    public final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzgi.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzgi.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }

    public zzhq(zzhr zzhrVar, String str, Boolean bool, boolean z) {
        super(zzhrVar, str, bool);
    }
}
