package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes4.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t2);

    public abstract void zza(B b, int i, int i2);

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzik zzikVar);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zznb zznbVar) throws IOException;

    public abstract boolean zza(zzlr zzlrVar);

    public abstract int zzb(T t);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzb(T t, zznb zznbVar) throws IOException;

    public abstract void zzb(Object obj, B b);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b);

    public abstract void zzf(Object obj);

    public final boolean zza(B b, zzlr zzlrVar, int i) throws IOException {
        int iZzd = zzlrVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzb(b, i2, zzlrVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza((zzmk<T, B>) b, i2, zzlrVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza((zzmk<T, B>) b, i2, zzlrVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                zza((zzmk<T, B>) b, i2, zzlrVar.zzf());
                return true;
            }
            throw zzkb.zza();
        }
        B bZza = zza();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza((zzmk<T, B>) bZza, zzlrVar, i5)) {
        }
        if (i4 != zzlrVar.zzd()) {
            throw zzkb.zzb();
        }
        zza((zzmk<T, B>) b, i2, (int) zze(bZza));
        return true;
    }
}
