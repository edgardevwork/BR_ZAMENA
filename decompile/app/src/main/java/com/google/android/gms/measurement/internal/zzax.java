package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.android.gms.measurement.internal.zzje;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.apache.http.client.utils.URLEncodedUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzax {
    private static final zzax zza = new zzax(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzje.zza, zzjh> zzf;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * Cea708Decoder.COMMAND_DSW);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzje.zzb((zzjh) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zzje.zza) entry.getKey()).zze, strZzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public static zzax zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzax(null, i);
        }
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzje.zza) zzje.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static zzax zza(zzjh zzjhVar, int i) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        enumMap.put((EnumMap) zzje.zza.AD_USER_DATA, (zzje.zza) zzjhVar);
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzax zza(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        zzje.zza[] zzaVarArrZza = zzjg.DMA.zza();
        int length = zzaVarArrZza.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) zzaVarArrZza[i3], (zzje.zza) zzje.zza(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, i, (Boolean) null, (String) null);
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzf.get(zzje.zza.AD_USER_DATA);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public static Boolean zza(Bundle bundle) {
        zzjh zzjhVarZza;
        if (bundle == null || (zzjhVarZza = zzje.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzba.zza[zzjhVarZza.ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(zzje.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzje.zza(this.zzb));
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
            zzjh zzjhVar = this.zzf.get(zzaVar);
            if (zzjhVar == null) {
                sb.append("uninitialized");
            } else {
                int i = zzba.zza[zzjhVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    public zzax(Boolean bool, int i) {
        this((Boolean) null, i, (Boolean) null, (String) null);
    }

    public zzax(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzje.zza, zzjh> enumMap = new EnumMap<>(zzje.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzje.zza, zzjh>) zzje.zza.AD_USER_DATA, (zzje.zza) zzje.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzax(EnumMap<zzje.zza, zzjh> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzje.zza, zzjh> enumMap2 = new EnumMap<>(zzje.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (this.zzc.equalsIgnoreCase(zzaxVar.zzc) && Objects.equals(this.zzd, zzaxVar.zzd)) {
            return Objects.equals(this.zze, zzaxVar.zze);
        }
        return false;
    }

    public final boolean zzg() {
        Iterator<zzjh> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}
