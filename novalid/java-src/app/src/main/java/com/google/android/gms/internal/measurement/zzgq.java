package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
public interface zzgq {
    @Nullable
    String zza(ContentResolver contentResolver, String str) throws zzgt;

    <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgr<T> zzgrVar) throws zzgt;
}
