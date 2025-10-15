package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.measurement.internal.zzje;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzhl extends zznr implements zzai {

    @VisibleForTesting
    final LruCache<String, com.google.android.gms.internal.measurement.zzb> zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;

    @VisibleForTesting
    private final Map<String, Set<String>> zzd;

    @VisibleForTesting
    private final Map<String, Map<String, Boolean>> zze;

    @VisibleForTesting
    private final Map<String, Map<String, Boolean>> zzf;
    private final Map<String, zzfr.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    @WorkerThread
    public final int zzb(String str, String str2) throws Throwable {
        Integer num;
        zzt();
        zzu(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    @WorkerThread
    public final long zza(String str) throws Throwable {
        String strZza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strZza)) {
            return 0L;
        }
        try {
            return Long.parseLong(strZza);
        } catch (NumberFormatException e) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzgo.zza(str), e);
            return 0L;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzhl zzhlVar, String str) throws Throwable {
        zzhlVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (!zzhlVar.zzk(str)) {
            return null;
        }
        if (zzhlVar.zzh.containsKey(str) && zzhlVar.zzh.get(str) != null) {
            zzhlVar.zza(str, zzhlVar.zzh.get(str));
        } else {
            zzhlVar.zzu(str);
        }
        return zzhlVar.zza.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @WorkerThread
    public final zzjh zza(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return zzjh.UNINITIALIZED;
        }
        for (zzfr.zza.C11897zza c11897zza : zzaVarZzb.zzf()) {
            if (zza(c11897zza.zzc()) == zzaVar) {
                int i = zzht.zzc[c11897zza.zzb().ordinal()];
                if (i == 1) {
                    return zzjh.DENIED;
                }
                if (i == 2) {
                    return zzjh.GRANTED;
                }
                return zzjh.UNINITIALIZED;
            }
        }
        return zzjh.UNINITIALIZED;
    }

    @WorkerThread
    public final zzje.zza zzb(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return null;
        }
        for (zzfr.zza.zzc zzcVar : zzaVarZzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    private static zzje.zza zza(zzfr.zza.zze zzeVar) {
        int i = zzht.zzb[zzeVar.ordinal()];
        if (i == 1) {
            return zzje.zza.AD_STORAGE;
        }
        if (i == 2) {
            return zzje.zza.ANALYTICS_STORAGE;
        }
        if (i == 3) {
            return zzje.zza.AD_USER_DATA;
        }
        if (i != 4) {
            return null;
        }
        return zzje.zza.AD_PERSONALIZATION;
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    /* renamed from: g_ */
    public final /* bridge */ /* synthetic */ zzoo mo1095g_() {
        return super.mo1095g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @WorkerThread
    public final zzfr.zza zzb(String str) throws Throwable {
        zzt();
        zzu(str);
        zzfr.zzd zzdVarZzc = zzc(str);
        if (zzdVarZzc == null || !zzdVarZzc.zzo()) {
            return null;
        }
        return zzdVarZzc.zzd();
    }

    @WorkerThread
    public final zzfr.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzu(str);
        return this.zzh.get(str);
    }

    @WorkerThread
    private final zzfr.zzd zza(String str, byte[] bArr) throws IllegalStateException {
        if (bArr == null) {
            return zzfr.zzd.zzg();
        }
        try {
            zzfr.zzd zzdVar = (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) ((zzfr.zzd.zza) zzoo.zza(zzfr.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzr() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzp() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzkb e) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(str), e);
            return zzfr.zzd.zzg();
        } catch (RuntimeException e2) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(str), e2);
            return zzfr.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    @WorkerThread
    public final String zza(String str, String str2) throws Throwable {
        zzt();
        zzu(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @WorkerThread
    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    @WorkerThread
    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzt();
        zzu(str);
        return this.zzj.get(str);
    }

    private static Map<String, String> zza(zzfr.zzd zzdVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzdVar != null) {
            for (zzfr.zzh zzhVar : zzdVar.zzn()) {
                arrayMap.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final Set<String> zzg(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str);
    }

    @WorkerThread
    public final SortedSet<String> zzh(String str) {
        zzt();
        zzu(str);
        TreeSet treeSet = new TreeSet();
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return treeSet;
        }
        Iterator<zzfr.zza.zzf> it = zzaVarZzb.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    public zzhl(zznv zznvVar) {
        super(zznvVar);
        this.zzc = new ArrayMap();
        this.zzd = new ArrayMap();
        this.zze = new ArrayMap();
        this.zzf = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzj = new ArrayMap();
        this.zzk = new ArrayMap();
        this.zzl = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zza = new zzho(this, 20);
        this.zzb = new zzhr(this);
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @WorkerThread
    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    private final void zza(String str, zzfr.zzd.zza zzaVar) throws IllegalStateException {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzaVar != null) {
            Iterator<zzfr.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i = 0; i < zzaVar.zza(); i++) {
                zzfr.zzc.zza zzaVarZzcd = zzaVar.zza(i).zzcd();
                if (zzaVarZzcd.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String strZzb = zzaVarZzcd.zzb();
                    String strZzb2 = zzji.zzb(zzaVarZzcd.zzb());
                    if (!TextUtils.isEmpty(strZzb2)) {
                        zzaVarZzcd = zzaVarZzcd.zza(strZzb2);
                        zzaVar.zza(i, zzaVarZzcd);
                    }
                    if (zzaVarZzcd.zze() && zzaVarZzcd.zzc()) {
                        arrayMap.put(strZzb, Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzf() && zzaVarZzcd.zzd()) {
                        arrayMap2.put(zzaVarZzcd.zzb(), Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzg()) {
                        if (zzaVarZzcd.zza() < 2 || zzaVarZzcd.zza() > 65535) {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        } else {
                            arrayMap3.put(zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, arrayMap);
        this.zzf.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    @WorkerThread
    private final void zzu(String str) throws Throwable {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzanVarZzf = zzh().zzf(str);
            if (zzanVarZzf == null) {
                this.zzc.put(str, null);
                this.zze.put(str, null);
                this.zzd.put(str, null);
                this.zzf.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
            zzfr.zzd.zza zzaVarZzcd = zza(str, zzanVarZzf.zza).zzcd();
            zza(str, zzaVarZzcd);
            this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai())));
            this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
            zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
            this.zzj.put(str, zzaVarZzcd.zzc());
            this.zzk.put(str, zzanVarZzf.zzb);
            this.zzl.put(str, zzanVarZzf.zzc);
        }
    }

    @WorkerThread
    private final void zza(final String str, zzfr.zzd zzdVar) throws IllegalStateException {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzgd.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzhq(this.zza, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzhl zzhlVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzhl zzhlVar2 = zzhlVar;
                            String str3 = str2;
                            zzg zzgVarZze = zzhlVar2.zzh().zze(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 106000L);
                            if (zzgVarZze != null) {
                                String strZzaf = zzgVarZze.zzaf();
                                if (strZzaf != null) {
                                    map.put("app_version", strZzaf);
                                }
                                map.put("app_version_int", Long.valueOf(zzgVarZze.zze()));
                                map.put("dynamite_version", Long.valueOf(zzgVarZze.zzo()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(this.zza.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzgd.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().zzp().zza("EES program activity", it.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    @WorkerThread
    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    public final boolean zzk(String str) {
        zzfr.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean zzl(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean zzc(String str, zzje.zza zzaVar) throws Throwable {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return false;
        }
        Iterator<zzfr.zza.C11897zza> it = zzaVarZzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfr.zza.C11897zza next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfr.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @WorkerThread
    public final boolean zzm(String str) {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        return zzaVarZzb == null || !zzaVarZzb.zzh() || zzaVarZzb.zzg();
    }

    @WorkerThread
    public final boolean zzc(String str, String str2) throws Throwable {
        Boolean bool;
        zzt();
        zzu(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzf.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean zzd(String str, String str2) throws Throwable {
        Boolean bool;
        zzt();
        zzu(str);
        if (zzl(str) && zzos.zzg(str2)) {
            return true;
        }
        if (zzn(str) && zzos.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzn(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final boolean zza(String str, byte[] bArr, String str2, String str3) throws IllegalStateException {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfr.zzd.zza zzaVarZzcd = zza(str, bArr).zzcd();
        if (zzaVarZzcd == null) {
            return false;
        }
        zza(str, zzaVarZzcd);
        zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
        this.zzj.put(str, zzaVarZzcd.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai())));
        zzh().zza(str, new ArrayList(zzaVarZzcd.zzd()));
        try {
            zzaVarZzcd.zzb();
            bArr = ((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai())).zzca();
        } catch (RuntimeException e) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzgo.zza(str), e);
        }
        zzal zzalVarZzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzalVarZzh.zzt();
        zzalVarZzh.zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzalVarZzh.m1091e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzalVarZzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzgo.zza(str));
            }
        } catch (SQLiteException e2) {
            zzalVarZzh.zzj().zzg().zza("Error storing remote config. appId", zzgo.zza(str), e2);
        }
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
        return true;
    }

    @WorkerThread
    public final boolean zzo(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id");
    }

    @WorkerThread
    public final boolean zzp(String str) throws Throwable {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    public final boolean zzq(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    @WorkerThread
    public final boolean zzr(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    @WorkerThread
    public final boolean zzs(String str) throws Throwable {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains(CommonUrlParts.OS_VERSION) || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    public final boolean zzt(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("user_id");
    }
}
