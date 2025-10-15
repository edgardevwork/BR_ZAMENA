package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzhw implements zzhb {

    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map<String, zzhw> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map<String, ?> zzf;

    @GuardedBy("this")
    private final List<zzgz> zzg;

    private static SharedPreferences zza(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferencesZza = zzcu.zza(context, str, 0, zzcq.zza);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return sharedPreferencesZza;
            }
            if (zzgs.zza()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferencesZza2 = zzcu.zza(context, str.substring(12), 0, zzcq.zza);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return sharedPreferencesZza2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    @Nullable
    public static zzhw zza(Context context, String str, Runnable runnable) {
        zzhw zzhwVar;
        if (!((!zzgs.zza() || str.startsWith("direct_boot:")) ? true : zzgs.zzb(context))) {
            return null;
        }
        synchronized (zzhw.class) {
            try {
                Map<String, zzhw> map = zza;
                zzhwVar = map.get(str);
                if (zzhwVar == null) {
                    zzhwVar = new zzhw(zza(context, str), runnable);
                    map.put(str, zzhwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhb
    @Nullable
    public final Object zza(String str) {
        Map<String, ?> map = this.zzf;
        if (map == null) {
            synchronized (this.zze) {
                try {
                    map = this.zzf;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.zzb.getAll();
                            this.zzf = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private zzhw(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzhv
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.zza.zza(sharedPreferences2, str);
            }
        };
        this.zzd = onSharedPreferenceChangeListener;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences;
        this.zzc = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static synchronized void zza() {
        try {
            for (zzhw zzhwVar : zza.values()) {
                zzhwVar.zzb.unregisterOnSharedPreferenceChangeListener(zzhwVar.zzd);
            }
            zza.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zze) {
            this.zzf = null;
            this.zzc.run();
        }
        synchronized (this) {
            try {
                Iterator<zzgz> it = this.zzg.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
