package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes8.dex */
public final class zzhl extends zzcs implements zzed {
    private static final zzhl zzb;
    private int zzd;
    private int zze;

    static {
        zzhl zzhlVar = new zzhl();
        zzb = zzhlVar;
        zzcs.zzt(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static zzhl zzz() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzhk.zza});
        }
        if (i2 == 3) {
            return new zzhl();
        }
        if (i2 == 4) {
            return new zzhj(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
