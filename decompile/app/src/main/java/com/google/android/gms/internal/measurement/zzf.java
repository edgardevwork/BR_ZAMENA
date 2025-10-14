package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgd;
import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.Callable;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzf {

    @VisibleForTesting
    final zzh zza;

    @VisibleForTesting
    final zzh zzb;

    @VisibleForTesting
    private final zzbb zzc;

    @VisibleForTesting
    private final zzl zzd;

    public final zzaq zza(zzh zzhVar, zzgd.zzd... zzdVarArr) {
        zzaq zzaqVarZza = zzaq.zzc;
        for (zzgd.zzd zzdVar : zzdVarArr) {
            zzaqVarZza = zzj.zza(zzdVar);
            zzg.zza(this.zzb);
            if ((zzaqVarZza instanceof zzat) || (zzaqVarZza instanceof zzar)) {
                zzaqVarZza = this.zzc.zza(zzhVar, zzaqVarZza);
            }
        }
        return zzaqVarZza;
    }

    public zzf() {
        zzbb zzbbVar = new zzbb();
        this.zzc = zzbbVar;
        zzh zzhVar = new zzh(null, zzbbVar);
        this.zzb = zzhVar;
        this.zza = zzhVar.zza();
        zzl zzlVar = new zzl();
        this.zzd = zzlVar;
        zzhVar.zzc(OBRXMLParser.RequireHandler.REQUIRE, new zzz(zzlVar));
        zzlVar.zza("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(0.0d)));
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zzd.zza(str, callable);
    }
}
