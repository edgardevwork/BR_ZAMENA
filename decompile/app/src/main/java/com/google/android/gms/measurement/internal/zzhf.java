package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzhf {
    final zzhy zza;

    @VisibleForTesting
    @WorkerThread
    public final Bundle zza(String str, com.google.android.gms.internal.measurement.zzbz zzbzVar) {
        this.zza.zzl().zzt();
        if (zzbzVar == null) {
            this.zza.zzj().zzu().zza("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleZza = zzbzVar.zza(bundle);
            if (bundleZza != null) {
                return bundleZza;
            }
            this.zza.zzj().zzg().zza("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.zza.zzj().zzg().zza("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    public zzhf(zznv zznvVar) {
        this.zza = zznvVar.zzk();
    }

    @VisibleForTesting
    public final boolean zza() {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(this.zza.zza());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzj().zzp().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.zza.zzj().zzp().zza("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
