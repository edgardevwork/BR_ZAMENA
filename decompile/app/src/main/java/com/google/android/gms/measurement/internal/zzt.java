package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes8.dex */
final class zzt extends zznr {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzv> zzc;
    private Long zzd;
    private Long zze;

    private final zzv zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzv zzvVar = new zzv(this, this.zza);
        this.zzc.put(num, zzvVar);
        return zzvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    @WorkerThread
    public final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l, Long l2) {
        return zza(str, list, list2, l, l2, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.measurement.internal.zzv.<init>(com.google.android.gms.measurement.internal.zzt, java.lang.String, com.google.android.gms.internal.measurement.zzfy$zzm, java.util.BitSet, java.util.BitSet, java.util.Map, java.util.Map, com.google.android.gms.measurement.internal.zzac):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @androidx.annotation.WorkerThread
    public final java.util.List<com.google.android.gms.internal.measurement.zzfy.zzd> zza(java.lang.String r25, java.util.List<com.google.android.gms.internal.measurement.zzfy.zzf> r26, java.util.List<com.google.android.gms.internal.measurement.zzfy.zzo> r27, java.lang.Long r28, java.lang.Long r29, boolean r30) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @NonNull
    private final List<zzfy.zzd> zzu() throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = this.zzc.keySet();
        setKeySet.removeAll(this.zzb);
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            zzv zzvVar = this.zzc.get(num);
            Preconditions.checkNotNull(zzvVar);
            zzfy.zzd zzdVarZza = zzvVar.zza(iIntValue);
            arrayList.add(zzdVarZza);
            zzal zzalVarZzh = zzh();
            String str = this.zza;
            zzfy.zzm zzmVarZzd = zzdVarZza.zzd();
            zzalVarZzh.zzal();
            zzalVarZzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzmVarZzd);
            byte[] bArrZzca = zzmVarZzd.zzca();
            ContentValues contentValues = new ContentValues();
            contentValues.put(CommonUrlParts.APP_ID, str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrZzca);
            try {
                if (zzalVarZzh.m1091e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzalVarZzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzgo.zza(str));
                }
            } catch (SQLiteException e) {
                zzalVarZzh.zzj().zzg().zza("Error storing filter results. appId", zzgo.zza(str), e);
            }
        }
        return arrayList;
    }

    public zzt(zznv zznvVar) {
        super(zznvVar);
    }

    private final void zza(List<zzfy.zzf> list, boolean z) throws IllegalStateException {
        zzbb zzbbVar;
        zzy zzyVar;
        Integer num;
        Map<Integer, List<zzfo.zzb>> map;
        long j;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar2 = new zzy(this);
        ArrayMap arrayMap = new ArrayMap();
        for (zzfy.zzf zzfVar : list) {
            zzfy.zzf zzfVarZza = zzyVar2.zza(this.zza, zzfVar);
            if (zzfVarZza != null) {
                zzal zzalVarZzh = zzh();
                String str2 = this.zza;
                String strZzg = zzfVarZza.zzg();
                zzbb zzbbVarZzd = zzalVarZzh.zzd(str2, zzfVar.zzg());
                if (zzbbVarZzd == null) {
                    zzalVarZzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzgo.zza(str2), zzalVarZzh.zzi().zza(strZzg));
                    zzbbVar = new zzbb(str2, zzfVar.zzg(), 1L, 1L, 1L, zzfVar.zzd(), 0L, null, null, null, null);
                } else {
                    zzbbVar = new zzbb(zzbbVarZzd.zza, zzbbVarZzd.zzb, zzbbVarZzd.zzc + 1, zzbbVarZzd.zzd + 1, zzbbVarZzd.zze + 1, zzbbVarZzd.zzf, zzbbVarZzd.zzg, zzbbVarZzd.zzh, zzbbVarZzd.zzi, zzbbVarZzd.zzj, zzbbVarZzd.zzk);
                }
                zzbb zzbbVar2 = zzbbVar;
                zzh().zza(zzbbVar2);
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zzf(str, zzbh.zzcy) || !z) {
                    long j2 = zzbbVar2.zzc;
                    String strZzg2 = zzfVarZza.zzg();
                    Map<Integer, List<zzfo.zzb>> mapZzf = (Map) arrayMap.get(strZzg2);
                    if (mapZzf == null) {
                        mapZzf = zzh().zzf(this.zza, strZzg2);
                        arrayMap.put(strZzg2, mapZzf);
                    }
                    Map<Integer, List<zzfo.zzb>> map2 = mapZzf;
                    Iterator<Integer> it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        Integer next = it.next();
                        int iIntValue = next.intValue();
                        if (this.zzb.contains(next)) {
                            zzj().zzp().zza("Skipping failed audience ID", next);
                        } else {
                            Iterator<zzfo.zzb> it2 = map2.get(next).iterator();
                            boolean zZza = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    zzyVar = zzyVar2;
                                    num = next;
                                    map = map2;
                                    j = j2;
                                    break;
                                }
                                zzfo.zzb next2 = it2.next();
                                zzx zzxVar = new zzx(this, this.zza, iIntValue, next2);
                                zzyVar = zzyVar2;
                                num = next;
                                int i = iIntValue;
                                map = map2;
                                j = j2;
                                zZza = zzxVar.zza(this.zzd, this.zze, zzfVarZza, j2, zzbbVar2, zza(iIntValue, next2.zzb()));
                                if (zZza) {
                                    zza(num).zza(zzxVar);
                                    next = num;
                                    zzyVar2 = zzyVar;
                                    iIntValue = i;
                                    map2 = map;
                                    j2 = j;
                                } else {
                                    this.zzb.add(num);
                                    break;
                                }
                            }
                            if (!zZza) {
                                this.zzb.add(num);
                            }
                            zzyVar2 = zzyVar;
                            map2 = map;
                            j2 = j;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fb, code lost:
    
        r5 = zzj().zzu();
        r6 = com.google.android.gms.measurement.internal.zzgo.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        if (r7.zzi() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010f, code lost:
    
        r9 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0117, code lost:
    
        r5.zza("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(List<zzfy.zzo> list) throws IllegalStateException {
        if (list.isEmpty()) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzfy.zzo zzoVar : list) {
            String strZzg = zzoVar.zzg();
            Map<Integer, List<zzfo.zze>> mapZzg = (Map) arrayMap.get(strZzg);
            if (mapZzg == null) {
                mapZzg = zzh().zzg(this.zza, strZzg);
                arrayMap.put(strZzg, mapZzg);
            }
            Iterator<Integer> it = mapZzg.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Integer next = it.next();
                    int iIntValue = next.intValue();
                    if (this.zzb.contains(next)) {
                        zzj().zzp().zza("Skipping failed audience ID", next);
                        break;
                    }
                    Iterator<zzfo.zze> it2 = mapZzg.get(next).iterator();
                    boolean zZza = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        zzfo.zze next2 = it2.next();
                        Integer numValueOf = null;
                        if (zzj().zza(2)) {
                            zzj().zzp().zza("Evaluating filter. audience, filter, property", next, next2.zzi() ? Integer.valueOf(next2.zza()) : null, zzi().zzc(next2.zze()));
                            zzj().zzp().zza("Filter definition", mo1095g_().zza(next2));
                        }
                        if (!next2.zzi() || next2.zza() > 256) {
                            break;
                        }
                        zzz zzzVar = new zzz(this, this.zza, iIntValue, next2);
                        zZza = zzzVar.zza(this.zzd, this.zze, zzoVar, zza(iIntValue, next2.zza()));
                        if (zZza) {
                            zza(next).zza(zzzVar);
                        } else {
                            this.zzb.add(next);
                            break;
                        }
                    }
                    if (!zZza) {
                        this.zzb.add(next);
                    }
                }
            }
        }
    }

    private final boolean zza(int i, int i2) {
        zzv zzvVar = this.zzc.get(Integer.valueOf(i));
        if (zzvVar == null) {
            return false;
        }
        return zzvVar.zzd.get(i2);
    }
}
