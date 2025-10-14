package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes8.dex */
final class zzma extends zzmb {
    private final /* synthetic */ zzlv zza;

    public /* synthetic */ zzma(zzlv zzlvVar, zzme zzmeVar) {
        this(zzlvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new zzlx(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzma(zzlv zzlvVar) {
        super(zzlvVar);
        this.zza = zzlvVar;
    }
}
