package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes7.dex */
public final class zzgk extends zzcs implements zzed {
    private static final zzgk zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzgk zzgkVar = new zzgk();
        zzb = zzgkVar;
        zzcs.zzt(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static /* synthetic */ void zzA(zzgk zzgkVar, int i) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i;
    }

    public static /* synthetic */ void zzB(zzgk zzgkVar, String str) {
        str.getClass();
        zzgkVar.zzd |= 2;
        zzgkVar.zzf = str;
    }

    public static /* synthetic */ void zzC(zzgk zzgkVar, String str) {
        zzgkVar.zzd |= 8;
        zzgkVar.zzh = str;
    }

    public static /* synthetic */ void zzD(zzgk zzgkVar, int i) {
        zzgkVar.zzg = i - 1;
        zzgkVar.zzd |= 4;
    }

    public static zzgg zzy() {
        return (zzgg) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcs.zzq(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzgi.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzgk();
        }
        if (i2 == 4) {
            return new zzgg(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
