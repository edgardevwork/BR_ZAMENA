package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.blackhub.bronline.game.GUIManagerKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.measurement.internal.zzje;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.jfrog.build.extractor.scan.License;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzgg extends zzh {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private long zzf;
    private List<String> zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;
    private String zzn;

    @WorkerThread
    public final int zzaa() {
        zzu();
        return this.zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    public final boolean zzz() {
        return true;
    }

    @WorkerThread
    public final int zzab() {
        zzu();
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ce  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzo zza(String str) {
        long jMin;
        List<String> list;
        String str2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        String str3;
        int iZzc;
        zzt();
        String strZzad = zzad();
        String strZzae = zzae();
        zzu();
        String str4 = this.zzb;
        long jZzab = zzab();
        zzu();
        Preconditions.checkNotNull(this.zzd);
        String str5 = this.zzd;
        zzu();
        zzt();
        if (this.zze == 0) {
            this.zze = this.zzu.zzt().zza(zza(), zza().getPackageName());
        }
        long j3 = this.zze;
        boolean zZzac = this.zzu.zzac();
        boolean z3 = !zzk().zzm;
        zzt();
        String strZzah = !this.zzu.zzac() ? null : zzah();
        zzhy zzhyVar = this.zzu;
        long jZza = zzhyVar.zzn().zzc.zza();
        if (jZza == 0) {
            jMin = zzhyVar.zza;
        } else {
            jMin = Math.min(zzhyVar.zza, jZza);
        }
        long j4 = jMin;
        int iZzaa = zzaa();
        boolean zZzv = zze().zzv();
        zzha zzhaVarZzk = zzk();
        zzhaVarZzk.zzt();
        boolean z4 = zzhaVarZzk.zzg().getBoolean("deferred_analytics_collection", false);
        String strZzac = zzac();
        Boolean boolValueOf = zze().zze("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r1.booleanValue());
        long j5 = this.zzf;
        List<String> list2 = this.zzg;
        String strZzf = zzk().zzo().zzf();
        if (this.zzh == null) {
            this.zzh = zzq().zzp();
        }
        String str6 = this.zzh;
        if (com.google.android.gms.internal.measurement.zznm.zza()) {
            list = list2;
            str2 = str6;
            if (zze().zza(zzbh.zzcx) && !zzk().zzo().zza(zzje.zza.ANALYTICS_STORAGE)) {
                j = j5;
                z = zZzac;
                z2 = z3;
                j2 = 0;
                str3 = null;
            }
            Boolean boolZze = zze().zze("google_analytics_sgtm_upload_enabled");
            boolean zBooleanValue = boolZze != null ? false : boolZze.booleanValue();
            long jZzc = zzq().zzc(zzad());
            int iZza = zzk().zzo().zza();
            String strZzf2 = zzk().zzn().zzf();
            if (zzpn.zza() || !zze().zza(zzbh.zzci)) {
                iZzc = 0;
            } else {
                zzq();
                iZzc = zzos.zzc();
            }
            return new zzo(strZzad, strZzae, str4, jZzab, str5, 106000L, j3, str, z, z2, strZzah, 0L, j4, iZzaa, zZzv, z4, strZzac, boolValueOf, j, list, (String) null, strZzf, str2, str3, zBooleanValue, jZzc, iZza, strZzf2, iZzc, (zzpn.zza() || !zze().zza(zzbh.zzci)) ? j2 : zzq().zzm(), zze().zzu(), new zzf(zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb());
        }
        list = list2;
        str2 = str6;
        zzt();
        j = j5;
        j2 = 0;
        if (this.zzm != 0) {
            z = zZzac;
            z2 = z3;
            long jCurrentTimeMillis = zzb().currentTimeMillis() - this.zzm;
            if (this.zzl != null && jCurrentTimeMillis > 86400000 && this.zzn == null) {
                zzag();
            }
        } else {
            z = zZzac;
            z2 = z3;
        }
        if (this.zzl == null) {
            zzag();
        }
        str3 = this.zzl;
        Boolean boolZze2 = zze().zze("google_analytics_sgtm_upload_enabled");
        if (boolZze2 != null) {
        }
        long jZzc2 = zzq().zzc(zzad());
        int iZza2 = zzk().zzo().zza();
        String strZzf22 = zzk().zzn().zzf();
        if (zzpn.zza()) {
            iZzc = 0;
        }
        return new zzo(strZzad, strZzae, str4, jZzab, str5, 106000L, j3, str, z, z2, strZzah, 0L, j4, iZzaa, zZzv, z4, strZzac, boolValueOf, j, list, (String) null, strZzf, str2, str3, zBooleanValue, jZzc2, iZza2, strZzf22, iZzc, (zzpn.zza() || !zze().zza(zzbh.zzci)) ? j2 : zzq().zzm(), zze().zzu(), new zzf(zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb());
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

    @WorkerThread
    public final String zzac() {
        zzu();
        return this.zzk;
    }

    @WorkerThread
    public final String zzad() {
        zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @VisibleForTesting
    @WorkerThread
    private final String zzah() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (zzpz.zza() && zze().zza(zzbh.zzbr)) {
            zzj().zzp().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> clsLoadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                } catch (Exception unused) {
                    zzj().zzv().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().zzw().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @WorkerThread
    public final String zzae() {
        zzt();
        zzu();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    @WorkerThread
    public final List<String> zzaf() {
        return this.zzg;
    }

    public zzgg(zzhy zzhyVar, long j) {
        super(zzhyVar);
        this.zzm = 0L;
        this.zzn = null;
        this.zzf = j;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0190 A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:143:0x016b, B:147:0x0188, B:149:0x0190, B:153:0x01ac, B:155:0x01c0, B:157:0x01c5, B:156:0x01c3), top: B:183:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ac A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:143:0x016b, B:147:0x0188, B:149:0x0190, B:153:0x01ac, B:155:0x01c0, B:157:0x01c5, B:156:0x01c3), top: B:183:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0229  */
    @Override // com.google.android.gms.measurement.internal.zzh
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx() throws IllegalStateException, Resources.NotFoundException, PackageManager.NameNotFoundException {
        String str;
        byte b;
        int iZzc;
        boolean z;
        List<String> listZzg;
        String strZza;
        String packageName = zza().getPackageName();
        PackageManager packageManager = zza().getPackageManager();
        String str2 = "";
        String installerPackageName = "unknown";
        String str3 = License.UNKNOWN_LICENCE_NAME;
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzj().zzg().zza("PackageManager is null, app identity information might be inaccurate. appId", zzgo.zza(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzj().zzg().zza("Error retrieving app installer package name. appId", zzgo.zza(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(zza().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : License.UNKNOWN_LICENCE_NAME;
                    try {
                        str3 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string;
                        zzj().zzg().zza("Error retrieving package info. appId, appName", zzgo.zza(packageName), str3);
                        str3 = str;
                        this.zza = packageName;
                        this.zzd = installerPackageName;
                        this.zzb = str3;
                        this.zzc = i;
                        this.zze = 0L;
                        if (TextUtils.isEmpty(this.zzu.zzu())) {
                        }
                        iZzc = this.zzu.zzc();
                        switch (iZzc) {
                        }
                        if (iZzc == 0) {
                        }
                        this.zzj = "";
                        this.zzk = "";
                        if (b != false) {
                        }
                        strZza = new zzhs(zza(), this.zzu.zzx()).zza("google_app_id");
                        if (TextUtils.isEmpty(strZza)) {
                        }
                        this.zzj = str2;
                        if (!TextUtils.isEmpty(strZza)) {
                        }
                        if (z) {
                        }
                        this.zzg = null;
                        listZzg = zze().zzg("analytics.safelisted_events");
                        if (listZzg != null) {
                        }
                        if (packageManager == null) {
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = License.UNKNOWN_LICENCE_NAME;
            }
        }
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i;
        this.zze = 0L;
        b = TextUtils.isEmpty(this.zzu.zzu()) && GUIManagerKt.APPMETRICA_DEVICE_ID_KEY.equals(this.zzu.zzv());
        iZzc = this.zzu.zzc();
        switch (iZzc) {
            case 0:
                zzj().zzp().zza("App measurement collection enabled");
                break;
            case 1:
                zzj().zzo().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                zzj().zzp().zza("App measurement deactivated via the init parameters");
                break;
            case 3:
                zzj().zzo().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                zzj().zzo().zza("App measurement disabled via the manifest");
                break;
            case 5:
                zzj().zzp().zza("App measurement disabled via the init parameters");
                break;
            case 6:
                zzj().zzv().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                zzj().zzo().zza("App measurement disabled via the global data collection setting");
                break;
            case 8:
                zzj().zzo().zza("App measurement disabled due to denied storage consent");
                break;
            default:
                zzj().zzo().zza("App measurement disabled");
                zzj().zzn().zza("Invalid scion state in identity");
                break;
        }
        z = iZzc == 0;
        this.zzj = "";
        this.zzk = "";
        if (b != false) {
            this.zzk = this.zzu.zzu();
        }
        try {
            strZza = new zzhs(zza(), this.zzu.zzx()).zza("google_app_id");
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzj = str2;
            if (!TextUtils.isEmpty(strZza)) {
                this.zzk = new zzhs(zza(), this.zzu.zzx()).zza("admob_app_id");
            }
            if (z) {
                zzj().zzp().zza("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzj) ? this.zzk : this.zzj);
            }
        } catch (IllegalStateException e) {
            zzj().zzg().zza("Fetching Google App Id failed with exception. appId", zzgo.zza(packageName), e);
        }
        this.zzg = null;
        listZzg = zze().zzg("analytics.safelisted_events");
        if (listZzg != null) {
            if (listZzg.isEmpty()) {
                zzj().zzv().zza("Safelisted event list is empty. Ignoring");
            } else {
                Iterator<String> it = listZzg.iterator();
                while (it.hasNext()) {
                    if (!zzq().zzb("safelisted event", it.next())) {
                    }
                }
                this.zzg = listZzg;
            }
        } else {
            this.zzg = listZzg;
        }
        if (packageManager == null) {
            this.zzi = InstantApps.isInstantApp(zza()) ? 1 : 0;
        } else {
            this.zzi = 0;
        }
    }

    @WorkerThread
    public final void zzag() {
        String str;
        zzt();
        if (!zzk().zzo().zza(zzje.zza.ANALYTICS_STORAGE)) {
            zzj().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            zzq().zzv().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzj().zzc().zza(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.zzl = str;
        this.zzm = zzb().currentTimeMillis();
    }

    public final boolean zzb(String str) {
        String str2 = this.zzn;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.zzn = str;
        return z;
    }
}
