package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzlj extends zzh {

    @VisibleForTesting
    protected zzlk zza;
    private volatile zzlk zzb;
    private volatile zzlk zzc;
    private final Map<Integer, zzlk> zzd;

    @GuardedBy("activityLock")
    private Activity zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzlk zzg;
    private zzlk zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    public final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
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

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
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

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @MainThread
    private final zzlk zzd(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzlk zzlkVar = this.zzd.get(Integer.valueOf(activity.hashCode()));
        if (zzlkVar == null) {
            zzlk zzlkVar2 = new zzlk(null, zza(activity.getClass(), "Activity"), zzq().zzn());
            this.zzd.put(Integer.valueOf(activity.hashCode()), zzlkVar2);
            zzlkVar = zzlkVar2;
        }
        return this.zzg != null ? this.zzg : zzlkVar;
    }

    public final zzlk zzaa() {
        return this.zzb;
    }

    @WorkerThread
    public final zzlk zza(boolean z) {
        zzu();
        zzt();
        if (!z) {
            return this.zza;
        }
        zzlk zzlkVar = this.zza;
        return zzlkVar != null ? zzlkVar : this.zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @VisibleForTesting
    private final String zza(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        if (strArrSplit.length > 0) {
            str2 = strArrSplit[strArrSplit.length - 1];
        } else {
            str2 = "";
        }
        return str2.length() > zze().zza((String) null, false) ? str2.substring(0, zze().zza((String) null, false)) : str2;
    }

    public static /* synthetic */ void zza(zzlj zzljVar, Bundle bundle, zzlk zzlkVar, zzlk zzlkVar2, long j) throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        zzljVar.zza(zzlkVar, zzlkVar2, j, true, zzljVar.zzq().zza((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List<String>) null, false));
    }

    public zzlj(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @MainThread
    private final void zza(Activity activity, zzlk zzlkVar, boolean z) throws IllegalStateException {
        zzlk zzlkVar2;
        zzlk zzlkVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzlkVar.zzb == null) {
            zzlkVar2 = new zzlk(zzlkVar.zza, activity != null ? zza(activity.getClass(), "Activity") : null, zzlkVar.zzc, zzlkVar.zze, zzlkVar.zzf);
        } else {
            zzlkVar2 = zzlkVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzlkVar2;
        zzl().zzb(new zzll(this, zzlkVar2, zzlkVar3, zzb().elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00af  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzlk zzlkVar, zzlk zzlkVar2, long j, boolean z, Bundle bundle) throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str;
        zzt();
        boolean z2 = false;
        boolean z3 = (zzlkVar2 != null && zzlkVar2.zzc == zzlkVar.zzc && Objects.equals(zzlkVar2.zzb, zzlkVar.zzb) && Objects.equals(zzlkVar2.zza, zzlkVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzos.zza(zzlkVar, bundle2, true);
            if (zzlkVar2 != null) {
                String str2 = zzlkVar2.zza;
                if (str2 != null) {
                    bundle2.putString("_pn", str2);
                }
                String str3 = zzlkVar2.zzb;
                if (str3 != null) {
                    bundle2.putString("_pc", str3);
                }
                bundle2.putLong("_pi", zzlkVar2.zzc);
            }
            if (z2) {
                long jZza = zzp().zzb.zza(j);
                if (jZza > 0) {
                    zzq().zza(bundle2, jZza);
                }
            }
            if (!zze().zzw()) {
                bundle2.putLong("_mst", 1L);
            }
            if (zzlkVar.zze) {
                str = "app";
            } else {
                str = "auto";
            }
            String str4 = str;
            long jCurrentTimeMillis = zzb().currentTimeMillis();
            if (zzlkVar.zze) {
                long j2 = zzlkVar.zzf;
                long j3 = j2 != 0 ? j2 : jCurrentTimeMillis;
                zzm().zza(str4, "_vs", j3, bundle2);
            }
        }
        if (z2) {
            zza(this.zza, true, j);
        }
        this.zza = zzlkVar;
        if (zzlkVar.zze) {
            this.zzh = zzlkVar;
        }
        zzo().zza(zzlkVar);
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @MainThread
    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zze().zzw() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(activity.hashCode()), new zzlk(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zza(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zze().zzw()) {
            this.zzd.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    @MainThread
    public final void zzb(Activity activity) throws IllegalStateException {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (!zze().zzw()) {
            this.zzb = null;
            zzl().zzb(new zzln(this, jElapsedRealtime));
        } else {
            zzlk zzlkVarZzd = zzd(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            zzl().zzb(new zzlq(this, zzlkVarZzd, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzc(Activity activity) throws IllegalStateException {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (zze().zzw()) {
                    this.zzg = null;
                    zzl().zzb(new zzlp(this));
                }
            }
        }
        if (!zze().zzw()) {
            this.zzb = this.zzg;
            zzl().zzb(new zzlo(this));
        } else {
            zza(activity, zzd(activity), false);
            zzb zzbVarZzc = zzc();
            zzbVarZzc.zzl().zzb(new zzc(zzbVarZzc, zzbVarZzc.zzb().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzb(Activity activity, Bundle bundle) {
        zzlk zzlkVar;
        if (!zze().zzw() || bundle == null || (zzlkVar = this.zzd.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzlkVar.zzc);
        bundle2.putString("name", zzlkVar.zza);
        bundle2.putString("referrer_name", zzlkVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @WorkerThread
    public final void zza(zzlk zzlkVar, boolean z, long j) {
        zzc().zza(zzb().elapsedRealtime());
        if (!zzp().zza(zzlkVar != null && zzlkVar.zzd, z, j) || zzlkVar == null) {
            return;
        }
        zzlkVar.zzd = false;
    }

    @Deprecated
    public final void zza(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) throws IllegalStateException {
        if (!zze().zzw()) {
            zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlk zzlkVar = this.zzb;
        if (zzlkVar == null) {
            zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(Integer.valueOf(activity.hashCode())) == null) {
            zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zza(activity.getClass(), "Activity");
        }
        boolean zEquals = Objects.equals(zzlkVar.zzb, str2);
        boolean zEquals2 = Objects.equals(zzlkVar.zza, str);
        if (zEquals && zEquals2) {
            zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().zzp().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzlk zzlkVar2 = new zzlk(str, str2, zzq().zzn());
        this.zzd.put(Integer.valueOf(activity.hashCode()), zzlkVar2);
        zza(activity, zzlkVar2, true);
    }

    public final void zza(Bundle bundle, long j) {
        String str;
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strZza = null;
                if (bundle != null) {
                    String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                    if (string != null && (string.length() <= 0 || string.length() > zze().zza((String) null, false))) {
                        zzj().zzv().zza("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                    if (string2 != null && (string2.length() <= 0 || string2.length() > zze().zza((String) null, false))) {
                        zzj().zzv().zza("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        strZza = string2;
                    }
                } else {
                    str = null;
                }
                if (strZza == null) {
                    Activity activity = this.zze;
                    if (activity != null) {
                        strZza = zza(activity.getClass(), "Activity");
                    } else {
                        strZza = "Activity";
                    }
                }
                String str2 = strZza;
                zzlk zzlkVar = this.zzb;
                if (this.zzf && zzlkVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzlkVar.zzb, str2);
                    boolean zEquals2 = Objects.equals(zzlkVar.zza, str);
                    if (zEquals && zEquals2) {
                        zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzj().zzp().zza("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                zzlk zzlkVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlk zzlkVar3 = new zzlk(str, str2, zzq().zzn(), true, j);
                this.zzb = zzlkVar3;
                this.zzc = zzlkVar2;
                this.zzg = zzlkVar3;
                zzl().zzb(new zzlm(this, bundle, zzlkVar3, zzlkVar2, zzb().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
