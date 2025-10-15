package com.google.android.gms.internal.measurement;

import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes4.dex */
final class zzlz implements Comparable<zzlz>, Map.Entry<Object, Object> {
    private final Object zza;
    private Object zzb;
    private final /* synthetic */ zzlv zzc;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzlz zzlzVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzlzVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.zza) + URLEncodedUtils.NAME_VALUE_SEPARATOR + String.valueOf(this.zzb);
    }

    public zzlz(zzlv zzlvVar, Map.Entry<Object, Object> entry) {
        this(zzlvVar, (Comparable) entry.getKey(), entry.getValue());
    }

    public zzlz(zzlv zzlvVar, Object obj, Object obj2) {
        this.zzc = zzlvVar;
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
