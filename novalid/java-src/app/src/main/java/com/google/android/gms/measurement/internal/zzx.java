package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes7.dex */
final class zzx extends zzaa {
    private zzfo.zzb zzg;
    private final /* synthetic */ zzt zzh;

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final int zza() {
        return this.zzg.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzt zztVar, String str, int i, zzfo.zzb zzbVar) {
        super(str, i);
        this.zzh = zztVar;
        this.zzg = zzbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final boolean zzb() {
        return this.zzg.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(Long l, Long l2, zzfy.zzf zzfVar, long j, zzbb zzbbVar, boolean z) {
        Boolean boolZza;
        byte b = com.google.android.gms.internal.measurement.zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbp);
        long j2 = this.zzg.zzj() ? zzbbVar.zze : j;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (this.zzh.zzj().zza(2)) {
            this.zzh.zzj().zzp().zza("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzb), this.zzg.zzl() ? Integer.valueOf(this.zzg.zzb()) : null, this.zzh.zzi().zza(this.zzg.zzf()));
            this.zzh.zzj().zzp().zza("Filter definition", this.zzh.mo1095g_().zza(this.zzg));
        }
        if (!this.zzg.zzl() || this.zzg.zzb() > 256) {
            this.zzh.zzj().zzu().zza("Invalid event filter ID. appId, id", zzgo.zza(this.zza), String.valueOf(this.zzg.zzl() ? Integer.valueOf(this.zzg.zzb()) : null));
            return false;
        }
        byte b2 = this.zzg.zzh() || this.zzg.zzi() || this.zzg.zzj();
        if (z && b2 == false) {
            this.zzh.zzj().zzp().zza("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzl() ? Integer.valueOf(this.zzg.zzb()) : null);
            return true;
        }
        zzfo.zzb zzbVar = this.zzg;
        String strZzg = zzfVar.zzg();
        if (zzbVar.zzk()) {
            Boolean boolZza2 = zzaa.zza(j2, zzbVar.zze());
            if (boolZza2 != null) {
                if (!boolZza2.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            Iterator<zzfo.zzc> it = zzbVar.zzg().iterator();
            while (true) {
                if (it.hasNext()) {
                    zzfo.zzc next = it.next();
                    if (next.zze().isEmpty()) {
                        this.zzh.zzj().zzu().zza("null or empty param name in filter. event", this.zzh.zzi().zza(strZzg));
                        break;
                    }
                    hashSet.add(next.zze());
                } else {
                    ArrayMap arrayMap = new ArrayMap();
                    Iterator<zzfy.zzh> it2 = zzfVar.zzh().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            zzfy.zzh next2 = it2.next();
                            if (hashSet.contains(next2.zzg())) {
                                if (next2.zzl()) {
                                    arrayMap.put(next2.zzg(), next2.zzl() ? Long.valueOf(next2.zzd()) : null);
                                } else if (next2.zzj()) {
                                    arrayMap.put(next2.zzg(), next2.zzj() ? Double.valueOf(next2.zza()) : null);
                                } else if (next2.zzn()) {
                                    arrayMap.put(next2.zzg(), next2.zzh());
                                } else {
                                    this.zzh.zzj().zzu().zza("Unknown value for param. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(next2.zzg()));
                                    break;
                                }
                            }
                        } else {
                            Iterator<zzfo.zzc> it3 = zzbVar.zzg().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zzfo.zzc next3 = it3.next();
                                    boolean z2 = next3.zzg() && next3.zzf();
                                    String strZze = next3.zze();
                                    if (strZze.isEmpty()) {
                                        this.zzh.zzj().zzu().zza("Event has empty param name. event", this.zzh.zzi().zza(strZzg));
                                        break;
                                    }
                                    Object obj = arrayMap.get(strZze);
                                    if (obj instanceof Long) {
                                        if (!next3.zzh()) {
                                            this.zzh.zzj().zzu().zza("No number filter for long param. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(strZze));
                                            break;
                                        }
                                        Boolean boolZza3 = zzaa.zza(((Long) obj).longValue(), next3.zzc());
                                        if (boolZza3 == null) {
                                            break;
                                        }
                                        if (boolZza3.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else if (obj instanceof Double) {
                                        if (!next3.zzh()) {
                                            this.zzh.zzj().zzu().zza("No number filter for double param. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(strZze));
                                            break;
                                        }
                                        Boolean boolZza4 = zzaa.zza(((Double) obj).doubleValue(), next3.zzc());
                                        if (boolZza4 == null) {
                                            break;
                                        }
                                        if (boolZza4.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else if (obj instanceof String) {
                                        if (next3.zzj()) {
                                            boolZza = zzaa.zza((String) obj, next3.zzd(), this.zzh.zzj());
                                        } else if (next3.zzh()) {
                                            String str = (String) obj;
                                            if (zzoo.zzb(str)) {
                                                boolZza = zzaa.zza(str, next3.zzc());
                                            } else {
                                                this.zzh.zzj().zzu().zza("Invalid param value for number filter. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(strZze));
                                                break;
                                            }
                                        } else {
                                            this.zzh.zzj().zzu().zza("No filter for String param. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(strZze));
                                            break;
                                        }
                                        if (boolZza == null) {
                                            break;
                                        }
                                        if (boolZza.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else if (obj == null) {
                                        this.zzh.zzj().zzp().zza("Missing param for filter. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(strZze));
                                        bool = Boolean.FALSE;
                                    } else {
                                        this.zzh.zzj().zzu().zza("Unknown param type. event, param", this.zzh.zzi().zza(strZzg), this.zzh.zzi().zzb(strZze));
                                    }
                                } else {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.zzh.zzj().zzp().zza("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzc = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zzd = bool2;
        if (b2 != false && zzfVar.zzk()) {
            Long lValueOf = Long.valueOf(zzfVar.zzd());
            if (this.zzg.zzi()) {
                if (b != false && this.zzg.zzk()) {
                    lValueOf = l;
                }
                this.zzf = lValueOf;
            } else {
                if (b != false && this.zzg.zzk()) {
                    lValueOf = l2;
                }
                this.zze = lValueOf;
            }
        }
        return true;
    }
}
