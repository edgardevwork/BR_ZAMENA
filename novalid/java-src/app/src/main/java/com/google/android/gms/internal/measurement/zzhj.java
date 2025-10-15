package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
public abstract class zzhj<T> {
    private static final Object zza = new Object();

    @Nullable
    private static volatile zzhu zzb;
    private static volatile boolean zzc;
    private static zzhy zzd;
    private static final AtomicInteger zze;
    private final zzhr zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    public /* synthetic */ zzhj(zzhr zzhrVar, String str, Object obj, boolean z, zzht zzhtVar) {
        this(zzhrVar, str, obj, true);
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public abstract T zza(Object obj);

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Boolean bool, boolean z) {
        return new zzhq(zzhrVar, str, bool, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Double d, boolean z) {
        return new zzhp(zzhrVar, str, d, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Long l, boolean z) {
        return new zzhn(zzhrVar, str, l, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, String str2, boolean z) {
        return new zzhs(zzhrVar, str, str2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:57:0x001c, B:59:0x0020, B:61:0x0029, B:63:0x0039, B:69:0x0055, B:71:0x0060, B:84:0x0080, B:87:0x0088, B:88:0x008d, B:89:0x0091, B:74:0x0067, B:83:0x007c, B:77:0x006e, B:80:0x0075, B:90:0x0095), top: B:96:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T zza() {
        T tZzb;
        if (!this.zzk) {
            Preconditions.checkState(zzd.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zze.get();
        if (this.zzi < i) {
            synchronized (this) {
                try {
                    if (this.zzi < i) {
                        zzhu zzhuVar = zzb;
                        Optional<zzhh> optionalAbsent = Optional.absent();
                        String strZza = null;
                        if (zzhuVar != null) {
                            optionalAbsent = zzhuVar.zzb().get();
                            if (optionalAbsent.isPresent()) {
                                zzhh zzhhVar = optionalAbsent.get();
                                zzhr zzhrVar = this.zzf;
                                strZza = zzhhVar.zza(zzhrVar.zzb, zzhrVar.zza, zzhrVar.zzd, this.zzg);
                            }
                        }
                        Preconditions.checkState(zzhuVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (this.zzf.zzf) {
                            tZzb = zza(zzhuVar);
                            if (tZzb == null && (tZzb = zzb(zzhuVar)) == null) {
                                tZzb = zze();
                            }
                            if (optionalAbsent.isPresent()) {
                                tZzb = strZza == null ? zze() : zza((Object) strZza);
                            }
                            this.zzj = tZzb;
                            this.zzi = i;
                        } else {
                            tZzb = zzb(zzhuVar);
                            if (tZzb == null && (tZzb = zza(zzhuVar)) == null) {
                            }
                            if (optionalAbsent.isPresent()) {
                            }
                            this.zzj = tZzb;
                            this.zzi = i;
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    @Nullable
    private final T zza(zzhu zzhuVar) {
        Function<Context, Boolean> function;
        zzhr zzhrVar = this.zzf;
        if (!zzhrVar.zze && ((function = zzhrVar.zzh) == null || function.apply(zzhuVar.zza()).booleanValue())) {
            zzhc zzhcVarZza = zzhc.zza(zzhuVar.zza());
            zzhr zzhrVar2 = this.zzf;
            Object objZza = zzhcVarZza.zza(zzhrVar2.zze ? null : zza(zzhrVar2.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    @Nullable
    private final T zzb(zzhu zzhuVar) {
        zzhb zzhbVarZza;
        Object objZza;
        if (this.zzf.zzb != null) {
            if (!zzhi.zza(zzhuVar.zza(), this.zzf.zzb)) {
                zzhbVarZza = null;
            } else if (this.zzf.zzg) {
                zzhbVarZza = zzgu.zza(zzhuVar.zza().getContentResolver(), zzhk.zza(zzhk.zza(zzhuVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhj.zzc();
                    }
                });
            } else {
                zzhbVarZza = zzgu.zza(zzhuVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhj.zzc();
                    }
                });
            }
        } else {
            zzhbVarZza = zzhw.zza(zzhuVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                @Override // java.lang.Runnable
                public final void run() {
                    zzhj.zzc();
                }
            });
        }
        if (zzhbVarZza == null || (objZza = zzhbVarZza.zza(zzb())) == null) {
            return null;
        }
        return zza(objZza);
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        return str + this.zzg;
    }

    static {
        new AtomicReference();
        zzd = new zzhy(new zzhx() { // from class: com.google.android.gms.internal.measurement.zzho
            @Override // com.google.android.gms.internal.measurement.zzhx
            public final boolean zza() {
                return zzhj.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    zzhj(zzhr zzhrVar, String str, T t, boolean z) {
        this.zzi = -1;
        String str2 = zzhrVar.zza;
        if (str2 == null && zzhrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzhrVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhrVar;
        this.zzg = str;
        this.zzh = t;
        this.zzk = z;
        this.zzl = false;
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb == null) {
                    synchronized (obj) {
                        zzhu zzhuVar = zzb;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzhuVar == null || zzhuVar.zza() != context) {
                            if (zzhuVar != null) {
                                zzgu.zzc();
                                zzhw.zza();
                                zzhc.zza();
                            }
                            zzb = new zzgv(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzhl
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    return zzhg.zza.zza(context);
                                }
                            }));
                            zze.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
