package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes8.dex */
public final class zzhb extends zzcs implements zzed {
    private static final zzhb zzb;
    private int zzd;
    private int zze;

    static {
        zzhb zzhbVar = new zzhb();
        zzb = zzhbVar;
        zzcs.zzt(zzhb.class, zzhbVar);
    }

    private zzhb() {
    }

    public static /* synthetic */ void zzA(zzhb zzhbVar, int i) {
        zzhbVar.zze = i - 1;
        zzhbVar.zzd |= 1;
    }

    public static zzgz zzy() {
        return (zzgz) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzha.zza});
        }
        if (i2 == 3) {
            return new zzhb();
        }
        if (i2 == 4) {
            return new zzgz(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
