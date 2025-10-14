package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.ivy.core.cache.ArtifactOrigin;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzje {
    public static final zzje zza = new zzje(null, null, 100);
    private final EnumMap<zza, zzjh> zzb;
    private final int zzc;

    public static boolean zza(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    public static char zza(zzjh zzjhVar) {
        if (zzjhVar == null) {
            return '-';
        }
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zzc * 17;
        Iterator<zzjh> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzb((zzjh) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zza) entry.getKey()).zze, strZzb);
            }
        }
        return bundle;
    }

    public static zzjh zza(String str) {
        if (str == null) {
            return zzjh.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzjh.GRANTED;
        }
        if (str.equals("denied")) {
            return zzjh.DENIED;
        }
        return zzjh.UNINITIALIZED;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzb.get(zza.AD_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final zzjh zzd() {
        zzjh zzjhVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public static zzjh zza(char c) {
        if (c == '+') {
            return zzjh.POLICY;
        }
        if (c == '0') {
            return zzjh.DENIED;
        }
        if (c == '1') {
            return zzjh.GRANTED;
        }
        return zzjh.UNINITIALIZED;
    }

    public static zzjh zza(Boolean bool) {
        if (bool == null) {
            return zzjh.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzjh.GRANTED;
        }
        return zzjh.DENIED;
    }

    public static zzje zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzje(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zzje(enumMap, i);
    }

    public static zzje zza(zzjh zzjhVar, zzjh zzjhVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zzjhVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zzjhVar2);
        return new zzje(enumMap, -10);
    }

    public static zzje zzb(String str) {
        return zza(str, 100);
    }

    public static zzje zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrZza = zzjg.STORAGE.zza();
        for (int i2 = 0; i2 < zzaVarArrZza.length; i2++) {
            zza zzaVar = zzaVarArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzjh.UNINITIALIZED);
            }
        }
        return new zzje(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzje zza(zzje zzjeVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            zzjh zzjhVar2 = zzjeVar.zzb.get(zzaVar);
            if (zzjhVar != null) {
                if (zzjhVar2 != null) {
                    zzjh zzjhVar3 = zzjh.UNINITIALIZED;
                    if (zzjhVar != zzjhVar3) {
                        if (zzjhVar2 != zzjhVar3) {
                            zzjh zzjhVar4 = zzjh.POLICY;
                            if (zzjhVar == zzjhVar4) {
                                zzjhVar = zzjhVar2;
                            } else if (zzjhVar2 != zzjhVar4) {
                                zzjh zzjhVar5 = zzjh.DENIED;
                                zzjhVar = (zzjhVar == zzjhVar5 || zzjhVar2 == zzjhVar5) ? zzjhVar5 : zzjh.GRANTED;
                            }
                        }
                    }
                }
            }
            if (zzjhVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzjhVar);
            }
        }
        return new zzje(enumMap, 100);
    }

    public final zzje zzb(zzje zzjeVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            if (zzjhVar == zzjh.UNINITIALIZED) {
                zzjhVar = zzjeVar.zzb.get(zzaVar);
            }
            if (zzjhVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzjhVar);
            }
        }
        return new zzje(enumMap, this.zzc);
    }

    public static String zza(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i == 90) {
            return "REMOTE_CONFIG";
        }
        if (i == 100) {
            return ArtifactOrigin.UNKNOWN;
        }
        return "OTHER";
    }

    public static String zzb(zzjh zzjhVar) {
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static String zza(Bundle bundle) {
        String string;
        zza[] zzaVarArr = zzjg.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zze() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjg.STORAGE.zza()) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            char c = '-';
            if (zzjhVar != null && (iOrdinal = zzjhVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal != 3) {
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzf() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjg.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
            zzjh zzjhVar = this.zzb.get(zzaVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.UNINITIALIZED;
            }
            sb.append(zzjhVar);
        }
        return sb.toString();
    }

    private zzje(EnumMap<zza, zzjh> enumMap, int i) {
        EnumMap<zza, zzjh> enumMap2 = new EnumMap<>(zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public zzje(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzjh> enumMap = new EnumMap<>(zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzjh>) zza.AD_STORAGE, (zza) zza((Boolean) null));
        enumMap.put((EnumMap<zza, zzjh>) zza.ANALYTICS_STORAGE, (zza) zza((Boolean) null));
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzje)) {
            return false;
        }
        zzje zzjeVar = (zzje) obj;
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            if (this.zzb.get(zzaVar) != zzjeVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zzjeVar.zzc;
    }

    public final boolean zza(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzjeVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzg() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzjh.DENIED;
    }

    public final boolean zzh() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzi() {
        Iterator<zzjh> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzje zzjeVar) {
        return zzb(zzjeVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final boolean zzb(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            zzjh zzjhVar2 = zzjeVar.zzb.get(zzaVar);
            zzjh zzjhVar3 = zzjh.DENIED;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }
}
