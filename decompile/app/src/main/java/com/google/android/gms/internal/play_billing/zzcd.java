package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzcd {
    static final zzcd zza = new zzcd(true);
    private static volatile boolean zzb;
    private static volatile zzcd zzc;
    private final Map zzd;

    public zzcd() {
        this.zzd = new HashMap();
    }

    public final zzcq zzb(zzec zzecVar, int i) {
        return (zzcq) this.zzd.get(new zzcc(zzecVar, i));
    }

    public zzcd(boolean z) {
        this.zzd = Collections.emptyMap();
    }

    public static zzcd zza() {
        zzcd zzcdVar = zzc;
        if (zzcdVar != null) {
            return zzcdVar;
        }
        synchronized (zzcd.class) {
            try {
                zzcd zzcdVar2 = zzc;
                if (zzcdVar2 != null) {
                    return zzcdVar2;
                }
                zzcd zzcdVarZzb = zzcl.zzb(zzcd.class);
                zzc = zzcdVarZzb;
                return zzcdVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
