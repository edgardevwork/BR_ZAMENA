package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes8.dex */
final class zzls implements zzla {
    private final zzlc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzlc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzln zzb() {
        int i = this.zzd;
        return (i & 1) != 0 ? zzln.PROTO2 : (i & 4) == 4 ? zzln.EDITIONS : zzln.PROTO3;
    }

    public final String zzd() {
        return this.zzb;
    }

    public zzls(zzlc zzlcVar, String str, Object[] objArr) {
        this.zza = zzlcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
