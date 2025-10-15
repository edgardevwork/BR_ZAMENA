package com.google.android.gms.internal.play_billing;

import org.apache.http.client.utils.URLEncodedUtils;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzaj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzaj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + URLEncodedUtils.NAME_VALUE_SEPARATOR + String.valueOf(obj2) + " and " + String.valueOf(obj3) + URLEncodedUtils.NAME_VALUE_SEPARATOR + String.valueOf(obj));
    }
}
