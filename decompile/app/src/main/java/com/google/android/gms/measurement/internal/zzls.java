package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzls extends zzh {
    private final zzmq zza;
    private zzgb zzb;
    private volatile Boolean zzc;
    private final zzav zzd;
    private final zznl zze;
    private final List<Runnable> zzf;
    private final zzav zzg;

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

    @WorkerThread
    private final zzo zzc(boolean z) {
        return zzg().zza(z ? zzj().zzx() : null);
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

    @WorkerThread
    public final zzaj zzaa() {
        zzt();
        zzu();
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzae();
            zzj().zzc().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzoVarZzc = zzc(false);
        Preconditions.checkNotNull(zzoVarZzc);
        try {
            zzaj zzajVarZza = zzgbVar.zza(zzoVarZzc);
            zzar();
            return zzajVarZza;
        } catch (RemoteException e) {
            zzj().zzg().zza("Failed to get consents; remote exception", e);
            return null;
        }
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

    public final Boolean zzab() {
        return this.zzc;
    }

    public static /* synthetic */ void zzd(zzls zzlsVar) {
        zzlsVar.zzt();
        if (zzlsVar.zzal()) {
            zzlsVar.zzj().zzp().zza("Inactivity, disconnecting from the service");
            zzlsVar.zzaf();
        }
    }

    public static /* synthetic */ void zza(zzls zzlsVar, ComponentName componentName) {
        zzlsVar.zzt();
        if (zzlsVar.zzb != null) {
            zzlsVar.zzb = null;
            zzlsVar.zzj().zzp().zza("Disconnected from device MeasurementService", componentName);
            zzlsVar.zzt();
            zzlsVar.zzae();
        }
    }

    public zzls(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzf = new ArrayList();
        this.zze = new zznl(zzhyVar.zzb());
        this.zza = new zzmq(this);
        this.zzd = new zzlt(this, zzhyVar);
        this.zzg = new zzmg(this, zzhyVar);
    }

    @WorkerThread
    public final void zzac() {
        zzt();
        zzu();
        zza(new zzme(this, zzc(true)));
    }

    @WorkerThread
    public final void zzad() {
        zzt();
        zzu();
        zzo zzoVarZzc = zzc(true);
        zzh().zzab();
        zza(new zzmb(this, zzoVarZzc));
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

    @WorkerThread
    public final void zzae() {
        zzt();
        zzu();
        if (zzal()) {
            return;
        }
        if (zzap()) {
            this.zza.zza();
            return;
        }
        if (zze().zzy()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
            this.zza.zza(intent);
            return;
        }
        zzj().zzg().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
    }

    @WorkerThread
    public final void zzaf() {
        zzt();
        zzu();
        this.zza.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(zza(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    @WorkerThread
    public final void zzaq() {
        zzt();
        zzj().zzp().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator<Runnable> it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e) {
                zzj().zzg().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    @WorkerThread
    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws IllegalStateException {
        zzt();
        zzu();
        zza(new zzmc(this, zzc(false), zzdoVar));
    }

    @WorkerThread
    public final void zza(AtomicReference<String> atomicReference) {
        zzt();
        zzu();
        zza(new zzlz(this, atomicReference, zzc(false)));
    }

    @WorkerThread
    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str, String str2) throws IllegalStateException {
        zzt();
        zzu();
        zza(new zzmo(this, str, str2, zzc(false), zzdoVar));
    }

    @WorkerThread
    public final void zza(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) throws IllegalStateException {
        zzt();
        zzu();
        zza(new zzml(this, atomicReference, str, str2, str3, zzc(false)));
    }

    @WorkerThread
    public final void zza(AtomicReference<List<zzno>> atomicReference, Bundle bundle) {
        zzt();
        zzu();
        zza(new zzly(this, atomicReference, zzc(false), bundle));
    }

    @WorkerThread
    public final void zza(AtomicReference<List<zzon>> atomicReference, boolean z) throws IllegalStateException {
        zzt();
        zzu();
        zza(new zzlv(this, atomicReference, zzc(false), z));
    }

    @WorkerThread
    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str, String str2, boolean z) throws IllegalStateException {
        zzt();
        zzu();
        zza(new zzlw(this, str, str2, zzc(false), z, zzdoVar));
    }

    @WorkerThread
    public final void zza(AtomicReference<List<zzon>> atomicReference, String str, String str2, String str3, boolean z) throws IllegalStateException {
        zzt();
        zzu();
        zza(new zzmn(this, atomicReference, str, str2, str3, zzc(false), z));
    }

    public final /* synthetic */ void zzag() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzj().zzg().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzo zzoVarZzc = zzc(false);
            Preconditions.checkNotNull(zzoVarZzc);
            zzgbVar.zzg(zzoVarZzc);
            zzar();
        } catch (RemoteException e) {
            zzj().zzg().zza("Failed to send Dma consent settings to the service", e);
        }
    }

    public final /* synthetic */ void zzah() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzj().zzg().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzo zzoVarZzc = zzc(false);
            Preconditions.checkNotNull(zzoVarZzc);
            zzgbVar.zzi(zzoVarZzc);
            zzar();
        } catch (RemoteException e) {
            zzj().zzg().zza("Failed to send storage consent settings to the service", e);
        }
    }

    @WorkerThread
    public final void zza(zzbf zzbfVar, String str) {
        Preconditions.checkNotNull(zzbfVar);
        zzt();
        zzu();
        zza(new zzmj(this, true, zzc(true), zzh().zza(zzbfVar), zzbfVar, str));
    }

    @WorkerThread
    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, zzbf zzbfVar, String str) throws IllegalStateException {
        zzt();
        zzu();
        if (zzq().zza(12451000) != 0) {
            zzj().zzu().zza("Not bundling data. Service unavailable or out of date");
            zzq().zza(zzdoVar, new byte[0]);
        } else {
            zza(new zzmi(this, zzbfVar, str, zzdoVar));
        }
    }

    @WorkerThread
    public final void zzar() {
        zzt();
        this.zze.zzb();
        this.zzd.zza(zzbh.zzal.zza(null).longValue());
    }

    @WorkerThread
    public final void zzai() {
        zzt();
        zzu();
        zzo zzoVarZzc = zzc(false);
        zzh().zzaa();
        zza(new zzma(this, zzoVarZzc));
    }

    @WorkerThread
    private final void zza(Runnable runnable) throws IllegalStateException {
        zzt();
        if (zzal()) {
            runnable.run();
        } else {
            if (this.zzf.size() >= 1000) {
                zzj().zzg().zza("Discarding data. Max runnable queue size reached");
                return;
            }
            this.zzf.add(runnable);
            this.zzg.zza(60000L);
            zzae();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) throws Throwable {
        int size;
        long jElapsedRealtime;
        long j;
        long jCurrentTimeMillis;
        zzt();
        zzu();
        int i = 100;
        int i2 = 0;
        for (int i3 = 100; i2 < 1001 && i == i3; i3 = 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> listZza = zzh().zza(i3);
            if (listZza != null) {
                arrayList.addAll(listZza);
                size = listZza.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < i3) {
                arrayList.add(abstractSafeParcelable);
            }
            boolean zZza = zze().zza(zzbh.zzce);
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzbf) {
                    if (zZza) {
                        try {
                            jCurrentTimeMillis = this.zzu.zzb().currentTimeMillis();
                        } catch (RemoteException e) {
                            e = e;
                            jElapsedRealtime = 0;
                            j = 0;
                            zzj().zzg().zza("Failed to send event to the service", e);
                            if (zZza) {
                            }
                            i4 = i5;
                        }
                        try {
                            jElapsedRealtime = this.zzu.zzb().elapsedRealtime();
                        } catch (RemoteException e2) {
                            e = e2;
                            jElapsedRealtime = 0;
                            j = jCurrentTimeMillis;
                            zzj().zzg().zza("Failed to send event to the service", e);
                            if (zZza) {
                            }
                            i4 = i5;
                        }
                    } else {
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        zzgbVar.zza((zzbf) abstractSafeParcelable2, zzoVar);
                        if (zZza) {
                            zzj().zzp().zza("Logging telemetry for logEvent from database");
                            zzgm.zza(this.zzu).zza(36301, 0, jCurrentTimeMillis, this.zzu.zzb().currentTimeMillis(), (int) (this.zzu.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        j = jCurrentTimeMillis;
                        zzj().zzg().zza("Failed to send event to the service", e);
                        if (zZza && j != 0) {
                            zzgm.zza(this.zzu).zza(36301, 13, j, this.zzu.zzb().currentTimeMillis(), (int) (this.zzu.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                        i4 = i5;
                    }
                } else if (abstractSafeParcelable2 instanceof zzon) {
                    try {
                        zzgbVar.zza((zzon) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e4) {
                        zzj().zzg().zza("Failed to send user property to the service", e4);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        zzgbVar.zza((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e5) {
                        zzj().zzg().zza("Failed to send conditional user property to the service", e5);
                    }
                } else {
                    zzj().zzg().zza("Discarding data. Unrecognized parcel type.");
                }
                i4 = i5;
            }
            i2++;
            i = size;
        }
    }

    @WorkerThread
    public final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzu();
        zza(new zzmm(this, true, zzc(true), zzh().zza(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    @WorkerThread
    public final void zza(boolean z) {
        zzt();
        zzu();
        if ((!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcx)) && z) {
            zzh().zzaa();
        }
        if (zzan()) {
            zza(new zzmk(this, zzc(false)));
        }
    }

    @WorkerThread
    public final void zza(zzlk zzlkVar) {
        zzt();
        zzu();
        zza(new zzmd(this, zzlkVar));
    }

    @WorkerThread
    public final void zza(Bundle bundle) {
        zzt();
        zzu();
        zza(new zzmf(this, zzc(false), bundle));
    }

    @WorkerThread
    public final void zzaj() throws IllegalStateException {
        zzt();
        zzu();
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzag();
            }
        });
    }

    @WorkerThread
    public final void zzak() {
        zzt();
        zzu();
        zza(new zzmh(this, zzc(true)));
    }

    @WorkerThread
    public final void zza(zzgb zzgbVar) {
        zzt();
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = zzgbVar;
        zzar();
        zzaq();
    }

    @WorkerThread
    public final void zzb(boolean z) {
        zzt();
        zzu();
        if ((!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcx)) && z) {
            zzh().zzaa();
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzah();
            }
        });
    }

    @WorkerThread
    public final void zza(zzon zzonVar) {
        zzt();
        zzu();
        zza(new zzlx(this, zzc(true), zzh().zza(zzonVar), zzonVar));
    }

    @WorkerThread
    public final boolean zzal() {
        zzt();
        zzu();
        return this.zzb != null;
    }

    @WorkerThread
    public final boolean zzam() {
        zzt();
        zzu();
        return !zzap() || zzq().zzg() >= 200900;
    }

    @WorkerThread
    public final boolean zzan() {
        zzt();
        zzu();
        return !zzap() || zzq().zzg() >= zzbh.zzbt.zza(null).intValue();
    }

    @WorkerThread
    public final boolean zzao() {
        zzt();
        zzu();
        return !zzap() || zzq().zzg() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzap() {
        boolean z;
        zzt();
        zzu();
        if (this.zzc == null) {
            zzt();
            zzu();
            Boolean boolZzp = zzk().zzp();
            if (boolZzp == null || !boolZzp.booleanValue()) {
                boolean z2 = false;
                if (zzg().zzaa() != 1) {
                    zzj().zzp().zza("Checking service availability");
                    int iZza = zzq().zza(12451000);
                    if (iZza != 0) {
                        if (iZza != 1) {
                            if (iZza != 2) {
                                if (iZza == 3) {
                                    zzj().zzu().zza("Service disabled");
                                } else if (iZza == 9) {
                                    zzj().zzu().zza("Service invalid");
                                } else if (iZza == 18) {
                                    zzj().zzu().zza("Service updating");
                                } else {
                                    zzj().zzu().zza("Unexpected service status", Integer.valueOf(iZza));
                                }
                                z = false;
                                z = false;
                            } else {
                                zzj().zzc().zza("Service container out of date");
                                if (zzq().zzg() >= 17443) {
                                    z = boolZzp == null;
                                    z = false;
                                }
                            }
                            if (z) {
                                z2 = z;
                                if (z2) {
                                }
                            }
                        } else {
                            zzj().zzp().zza("Service missing");
                        }
                        z = true;
                        z = false;
                        if (z) {
                        }
                    } else {
                        zzj().zzp().zza("Service available");
                    }
                    z = true;
                    if (z) {
                    }
                } else {
                    z = true;
                    if (z && zze().zzy()) {
                        zzj().zzg().zza("No way to upload. Consider using the full version of Analytics");
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        zzk().zza(z);
                    }
                }
            }
            this.zzc = Boolean.valueOf(z);
        }
        return this.zzc.booleanValue();
    }
}
