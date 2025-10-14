package com.google.android.gms.internal.measurement;

import com.caverock.androidsvg.SVG;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes8.dex */
final class zzlg<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlk zzn;
    private final zzkm zzo;
    private final zzmk<?, ?> zzp;
    private final zzji<?> zzq;
    private final zzkv zzr;

    private static <T> double zza(T t, long j) {
        return ((Double) zzml.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzml.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzms zzmsVar, Class<?> cls, zzij zzijVar) throws IOException {
        switch (zzlf.zza[zzmsVar.ordinal()]) {
            case 1:
                int iZzd = zzig.zzd(bArr, i, zzijVar);
                zzijVar.zzc = Boolean.valueOf(zzijVar.zzb != 0);
                return iZzd;
            case 2:
                return zzig.zza(bArr, i, zzijVar);
            case 3:
                zzijVar.zzc = Double.valueOf(zzig.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzijVar.zzc = Integer.valueOf(zzig.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzijVar.zzc = Long.valueOf(zzig.zzd(bArr, i));
                return i + 8;
            case 8:
                zzijVar.zzc = Float.valueOf(zzig.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzig.zzc(bArr, i, zzijVar);
                zzijVar.zzc = Integer.valueOf(zzijVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzig.zzd(bArr, i, zzijVar);
                zzijVar.zzc = Long.valueOf(zzijVar.zzb);
                return iZzd2;
            case 14:
                return zzig.zza(zzlq.zza().zza((Class) cls), bArr, i, i2, zzijVar);
            case 15:
                int iZzc2 = zzig.zzc(bArr, i, zzijVar);
                zzijVar.zzc = Integer.valueOf(zziw.zza(zzijVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzig.zzd(bArr, i, zzijVar);
                zzijVar.zzc = Long.valueOf(zziw.zza(zzijVar.zzb));
                return iZzd3;
            case 17:
                return zzig.zzb(bArr, i, zzijVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t) {
        int i;
        int i2;
        int i3;
        int iZza;
        int iZzb;
        int iZzh;
        boolean z;
        int iZzc;
        int iZzd;
        int iZzi;
        int iZzj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.zzc.length) {
            int iZzc2 = zzc(i7);
            int i9 = (267386880 & iZzc2) >>> 20;
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(t, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iZzc2 & i4;
            if (i9 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            switch (i9) {
                case 0:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zza(i10, 0.0d);
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zza(i10, 0.0f);
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zzd(i10, unsafe.getLong(t, j));
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zzg(i10, unsafe.getLong(t, j));
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zzg(i10, unsafe.getInt(t, j));
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zzc(i10, 0L);
                        i8 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZza = zzjc.zzf(i10, 0);
                        i8 += iZza;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zzb(i10, true);
                        i8 += iZzb;
                    }
                    break;
                case 8:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzik) {
                            iZzb = zzjc.zzc(i10, (zzik) object);
                        } else {
                            iZzb = zzjc.zzb(i10, (String) object);
                        }
                        i8 += iZzb;
                    }
                    break;
                case 9:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzlw.zza(i10, unsafe.getObject(t, j), (zzlu<?>) zze(i7));
                        i8 += iZzb;
                    }
                    break;
                case 10:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zzc(i10, (zzik) unsafe.getObject(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 11:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zzj(i10, unsafe.getInt(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 12:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zze(i10, unsafe.getInt(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 13:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzh = zzjc.zzh(i10, 0);
                        i8 += iZzh;
                    }
                    break;
                case 14:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zze(i10, 0L);
                        i8 += iZzb;
                    }
                    break;
                case 15:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zzi(i10, unsafe.getInt(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 16:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zzf(i10, unsafe.getLong(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 17:
                    if (zza((zzlg<T>) t, i7, i, i2, i3)) {
                        iZzb = zzjc.zzb(i10, (zzlc) unsafe.getObject(t, j), zze(i7));
                        i8 += iZzb;
                    }
                    break;
                case 18:
                    iZzb = zzlw.zzd(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzb;
                    break;
                case 19:
                    z = false;
                    iZzc = zzlw.zzc(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 20:
                    z = false;
                    iZzc = zzlw.zzf(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 21:
                    z = false;
                    iZzc = zzlw.zzj(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 22:
                    z = false;
                    iZzc = zzlw.zze(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 23:
                    z = false;
                    iZzc = zzlw.zzd(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 24:
                    z = false;
                    iZzc = zzlw.zzc(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 25:
                    z = false;
                    iZzc = zzlw.zza(i10, (List<?>) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 26:
                    iZzb = zzlw.zzb(i10, (List) unsafe.getObject(t, j));
                    i8 += iZzb;
                    break;
                case 27:
                    iZzb = zzlw.zzb(i10, (List<?>) unsafe.getObject(t, j), (zzlu<?>) zze(i7));
                    i8 += iZzb;
                    break;
                case 28:
                    iZzb = zzlw.zza(i10, (List<zzik>) unsafe.getObject(t, j));
                    i8 += iZzb;
                    break;
                case 29:
                    iZzb = zzlw.zzi(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzb;
                    break;
                case 30:
                    z = false;
                    iZzc = zzlw.zzb(i10, (List<Integer>) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 31:
                    z = false;
                    iZzc = zzlw.zzc(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 32:
                    z = false;
                    iZzc = zzlw.zzd(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 33:
                    z = false;
                    iZzc = zzlw.zzg(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 34:
                    z = false;
                    iZzc = zzlw.zzh(i10, (List) unsafe.getObject(t, j), false);
                    i8 += iZzc;
                    break;
                case 35:
                    iZzd = zzlw.zzd((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 36:
                    iZzd = zzlw.zzc((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 37:
                    iZzd = zzlw.zzf((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 38:
                    iZzd = zzlw.zzj((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 39:
                    iZzd = zzlw.zze((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 40:
                    iZzd = zzlw.zzd((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 41:
                    iZzd = zzlw.zzc((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 42:
                    iZzd = zzlw.zza((List<?>) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 43:
                    iZzd = zzlw.zzi((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 44:
                    iZzd = zzlw.zzb((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 45:
                    iZzd = zzlw.zzc((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 46:
                    iZzd = zzlw.zzd((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 47:
                    iZzd = zzlw.zzg((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 48:
                    iZzd = zzlw.zzh((List) unsafe.getObject(t, j));
                    if (iZzd > 0) {
                        iZzi = zzjc.zzi(i10);
                        iZzj = zzjc.zzj(iZzd);
                        iZzh = iZzi + iZzj + iZzd;
                        i8 += iZzh;
                    }
                    break;
                case 49:
                    iZzb = zzlw.zza(i10, (List<zzlc>) unsafe.getObject(t, j), (zzlu<?>) zze(i7));
                    i8 += iZzb;
                    break;
                case 50:
                    iZzb = this.zzr.zza(i10, unsafe.getObject(t, j), zzf(i7));
                    i8 += iZzb;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zza(i10, 0.0d);
                        i8 += iZzb;
                    }
                    break;
                case 52:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zza(i10, 0.0f);
                        i8 += iZzb;
                    }
                    break;
                case 53:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzd(i10, zzd(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 54:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzg(i10, zzd(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 55:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzg(i10, zzc(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 56:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzc(i10, 0L);
                        i8 += iZzb;
                    }
                    break;
                case 57:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzh = zzjc.zzf(i10, 0);
                        i8 += iZzh;
                    }
                    break;
                case 58:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzb(i10, true);
                        i8 += iZzb;
                    }
                    break;
                case 59:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzik) {
                            iZzb = zzjc.zzc(i10, (zzik) object2);
                        } else {
                            iZzb = zzjc.zzb(i10, (String) object2);
                        }
                        i8 += iZzb;
                    }
                    break;
                case 60:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzlw.zza(i10, unsafe.getObject(t, j), (zzlu<?>) zze(i7));
                        i8 += iZzb;
                    }
                    break;
                case 61:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzc(i10, (zzik) unsafe.getObject(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 62:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzj(i10, zzc(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 63:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zze(i10, zzc(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 64:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzh = zzjc.zzh(i10, 0);
                        i8 += iZzh;
                    }
                    break;
                case 65:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zze(i10, 0L);
                        i8 += iZzb;
                    }
                    break;
                case 66:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzi(i10, zzc(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 67:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzf(i10, zzd(t, j));
                        i8 += iZzb;
                    }
                    break;
                case 68:
                    if (zzc((zzlg<T>) t, i10, i7)) {
                        iZzb = zzjc.zzb(i10, (zzlc) unsafe.getObject(t, j), zze(i7));
                        i8 += iZzb;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int iZza2 = 0;
        zzmk<?, ?> zzmkVar = this.zzp;
        int iZza3 = i8 + zzmkVar.zza((zzmk<?, ?>) zzmkVar.zzd(t));
        if (!this.zzh) {
            return iZza3;
        }
        zzjm<T> zzjmVarZza = this.zzq.zza(t);
        int iZza4 = zzjmVarZza.zza.zza();
        for (int i13 = 0; i13 < iZza4; i13++) {
            Map.Entry entryZza = zzjmVarZza.zza.zza(i13);
            iZza2 += zzjm.zza((zzjo<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzjmVarZza.zza.zzb()) {
            iZza2 += zzjm.zza((zzjo<?>) entry.getKey(), entry.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t) {
        int i;
        int iZza;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzc;
            int iHashCode = 37;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZza = zzjv.zza(Double.doubleToLongBits(zzml.zza(t, j)));
                    i2 = i + iZza;
                    break;
                case 1:
                    i = i2 * 53;
                    iZza = Float.floatToIntBits(zzml.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 2:
                    i = i2 * 53;
                    iZza = zzjv.zza(zzml.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 3:
                    i = i2 * 53;
                    iZza = zzjv.zza(zzml.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 4:
                    i = i2 * 53;
                    iZza = zzml.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 5:
                    i = i2 * 53;
                    iZza = zzjv.zza(zzml.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 6:
                    i = i2 * 53;
                    iZza = zzml.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 7:
                    i = i2 * 53;
                    iZza = zzjv.zza(zzml.zzh(t, j));
                    i2 = i + iZza;
                    break;
                case 8:
                    i = i2 * 53;
                    iZza = ((String) zzml.zze(t, j)).hashCode();
                    i2 = i + iZza;
                    break;
                case 9:
                    Object objZze = zzml.zze(t, j);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZza = zzml.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 11:
                    i = i2 * 53;
                    iZza = zzml.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 12:
                    i = i2 * 53;
                    iZza = zzml.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 13:
                    i = i2 * 53;
                    iZza = zzml.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 14:
                    i = i2 * 53;
                    iZza = zzjv.zza(zzml.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 15:
                    i = i2 * 53;
                    iZza = zzml.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 16:
                    i = i2 * 53;
                    iZza = zzjv.zza(zzml.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 17:
                    Object objZze2 = zzml.zze(t, j);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iZza = zzml.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 50:
                    i = i2 * 53;
                    iZza = zzml.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = Float.floatToIntBits(zzb(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(zze(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = ((String) zzml.zze(t, j)).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzml.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzml.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjv.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzml.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzp.zzd(t).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t).hashCode() : iHashCode2;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzml.zze(t, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:1148:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1242:0x0d79, code lost:
    
        if (r13 == r8) goto L1244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1243:0x0d7b, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1244:0x0d81, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1246:0x0d88, code lost:
    
        if (r6 >= r11.zzm) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1247:0x0d8a, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmj) zza((java.lang.Object) r33, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.measurement.zzmk<UT, int>) r11.zzp, (java.lang.Object) r33);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1248:0x0da0, code lost:
    
        if (r3 == null) goto L1250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1249:0x0da2, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1250:0x0da7, code lost:
    
        if (r9 != 0) goto L1256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1252:0x0dab, code lost:
    
        if (r7 != r36) goto L1254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1255:0x0db2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1257:0x0db5, code lost:
    
        if (r7 > r36) goto L1260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1258:0x0db7, code lost:
    
        if (r10 != r9) goto L1260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1259:0x0db9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1261:0x0dbe, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1271:0x094c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1277:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1317:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1355:0x093d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzij zzijVar) throws IOException {
        Unsafe unsafe;
        int i4;
        zzlg<T> zzlgVar;
        int i5;
        int i6;
        int iZza;
        int i7;
        zzlg<T> zzlgVar2;
        int i8;
        int i9;
        int i10;
        zzij zzijVar2;
        int i11;
        int i12;
        zzij zzijVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe2;
        int iZzc;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzij zzijVar4;
        int i23;
        int i24;
        int i25;
        int iZzd;
        int i26;
        int i27;
        int i28;
        int iZza2;
        int i29;
        int i30;
        int iZzc2;
        int i31;
        int i32;
        Object obj;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzkc zzkcVarZza;
        int i33;
        zzij zzijVar5;
        int i34;
        int i35;
        Unsafe unsafe5;
        int i36;
        int iZzc3;
        int iZza3;
        int i37;
        Unsafe unsafe6;
        int i38;
        int i39;
        int i40;
        int i41;
        zzij zzijVar6;
        int i42;
        int i43;
        Unsafe unsafe7;
        zzkc zzkcVar;
        int i44;
        zzij zzijVar7;
        int i45;
        int i46;
        zzij zzijVar8;
        zzkc zzkcVar2;
        int iZza4;
        zzlg<T> zzlgVar3 = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i47 = i2;
        int i48 = i3;
        zzij zzijVar9 = zzijVar;
        zzf(t);
        Unsafe unsafe8 = zzb;
        int iZza5 = i;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = -1;
        int i53 = 1048575;
        while (true) {
            if (iZza5 < i47) {
                int i54 = iZza5 + 1;
                byte b = bArr2[iZza5];
                if (b < 0) {
                    int iZza6 = zzig.zza(b, bArr2, i54, zzijVar9);
                    i6 = zzijVar9.zza;
                    i54 = iZza6;
                } else {
                    i6 = b;
                }
                int i55 = i6 >>> 3;
                int i56 = i6 & 7;
                if (i55 > i52) {
                    iZza = (i55 < zzlgVar3.zze || i55 > zzlgVar3.zzf) ? -1 : zzlgVar3.zza(i55, i49 / 3);
                } else {
                    iZza = zzlgVar3.zza(i55);
                }
                int i57 = iZza;
                if (i57 == -1) {
                    unsafe = unsafe8;
                    i7 = i48;
                    zzlgVar2 = zzlgVar3;
                    i8 = i51;
                    i9 = i53;
                    i10 = 0;
                    zzijVar2 = zzijVar9;
                    i11 = i55;
                    i12 = i54;
                } else {
                    int[] iArr = zzlgVar3.zzc;
                    int i58 = iArr[i57 + 1];
                    int i59 = (i58 & 267386880) >>> 20;
                    int i60 = i54;
                    int i61 = i6;
                    long j = i58 & 1048575;
                    if (i59 <= 17) {
                        int i62 = iArr[i57 + 2];
                        int i63 = 1 << (i62 >>> 20);
                        int i64 = 1048575;
                        int i65 = i62 & 1048575;
                        if (i65 != i53) {
                            if (i53 != 1048575) {
                                unsafe8.putInt(t2, i53, i51);
                                i64 = 1048575;
                            }
                            i9 = i65;
                            i8 = i65 == i64 ? 0 : unsafe8.getInt(t2, i65);
                        } else {
                            i8 = i51;
                            i9 = i53;
                        }
                        switch (i59) {
                            case 0:
                                i15 = i2;
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 1) {
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    zzml.zza(t2, j, zzig.zza(bArr2, i14));
                                    iZzc = i14 + 8;
                                    i20 = i8 | i63;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 1:
                                i15 = i2;
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 5) {
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    zzml.zza((Object) t2, j, zzig.zzb(bArr2, i14));
                                    iZzc = i14 + 4;
                                    i20 = i8 | i63;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 2:
                            case 3:
                                i18 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 0) {
                                    i48 = i18;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    int iZzd2 = zzig.zzd(bArr2, i14, zzijVar3);
                                    unsafe2.putLong(t, j, zzijVar3.zzb);
                                    i19 = i8 | i63;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    iZza5 = iZzd2;
                                    i48 = i18;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    i51 = i19;
                                }
                            case 4:
                            case 11:
                                i15 = i2;
                                i18 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 0) {
                                    i48 = i18;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    iZzc = zzig.zzc(bArr2, i14, zzijVar3);
                                    unsafe2.putInt(t2, j, zzijVar3.zza);
                                    i20 = i8 | i63;
                                    i48 = i18;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 5:
                            case 14:
                                i18 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 1) {
                                    i48 = i18;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    unsafe2.putLong(t, j, zzig.zzd(bArr2, i14));
                                    iZzc = i14 + 8;
                                    i20 = i8 | i63;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i48 = i18;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 6:
                            case 13:
                                i15 = i2;
                                i18 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 5) {
                                    i48 = i18;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    unsafe2.putInt(t2, j, zzig.zzc(bArr2, i14));
                                    iZzc = i14 + 4;
                                    i20 = i8 | i63;
                                    i48 = i18;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 7:
                                i15 = i2;
                                i18 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 0) {
                                    i48 = i18;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    iZzc = zzig.zzd(bArr2, i14, zzijVar3);
                                    zzml.zzc(t2, j, zzijVar3.zzb != 0);
                                    i20 = i8 | i63;
                                    i48 = i18;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 8:
                                i15 = i2;
                                i18 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 2) {
                                    i48 = i18;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    if (zzg(i58)) {
                                        iZzc = zzig.zzb(bArr2, i14, zzijVar3);
                                    } else {
                                        iZzc = zzig.zzc(bArr2, i14, zzijVar3);
                                        int i66 = zzijVar3.zza;
                                        if (i66 < 0) {
                                            throw zzkb.zzf();
                                        }
                                        if (i66 == 0) {
                                            zzijVar3.zzc = "";
                                        } else {
                                            zzijVar3.zzc = new String(bArr2, iZzc, i66, zzjv.zza);
                                            iZzc += i66;
                                        }
                                    }
                                    unsafe2.putObject(t2, j, zzijVar3.zzc);
                                    i20 = i8 | i63;
                                    i48 = i18;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 9:
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i21 = i61;
                                i14 = i60;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 2) {
                                    i16 = i21;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    Object objZza = zzlgVar3.zza((zzlg<T>) t2, i13);
                                    i16 = i21;
                                    iZzc = zzig.zza(objZza, zzlgVar3.zze(i13), bArr, i14, i2, zzijVar);
                                    zzlgVar3.zza((zzlg<T>) t2, i13, objZza);
                                    i20 = i8 | i63;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i48 = i48;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 10:
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i21 = i61;
                                i14 = i60;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 2) {
                                    i16 = i21;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    iZzc = zzig.zza(bArr2, i14, zzijVar3);
                                    unsafe2.putObject(t2, j, zzijVar3.zzc);
                                    i20 = i8 | i63;
                                    i50 = i21;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 12:
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 0) {
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    int iZzc4 = zzig.zzc(bArr2, i14, zzijVar3);
                                    int i67 = zzijVar3.zza;
                                    zzjx zzjxVarZzd = zzlgVar3.zzd(i13);
                                    if ((i58 & Integer.MIN_VALUE) == 0 || zzjxVarZzd == null || zzjxVarZzd.zza(i67)) {
                                        unsafe2.putInt(t2, j, i67);
                                        i50 = i16;
                                        unsafe8 = unsafe2;
                                        i47 = i2;
                                        i49 = i13;
                                        zzijVar9 = zzijVar3;
                                        i52 = i17;
                                        i53 = i9;
                                        i51 = i8 | i63;
                                    } else {
                                        zzc(t).zza(i16, Long.valueOf(i67));
                                        i50 = i16;
                                        unsafe8 = unsafe2;
                                        i47 = i2;
                                        i49 = i13;
                                        zzijVar9 = zzijVar3;
                                        i52 = i17;
                                        i51 = i8;
                                        i53 = i9;
                                    }
                                    iZza5 = iZzc4;
                                }
                            case 15:
                                i15 = i2;
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                if (i56 != 0) {
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    iZzc = zzig.zzc(bArr2, i14, zzijVar3);
                                    unsafe2.putInt(t2, j, zziw.zza(zzijVar3.zza));
                                    i20 = i8 | i63;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i49 = i13;
                                    zzijVar9 = zzijVar3;
                                    i52 = i17;
                                    i50 = i16;
                                    i53 = i9;
                                    iZza5 = iZzc;
                                    i51 = i20;
                                }
                            case 16:
                                if (i56 != 0) {
                                    zzijVar3 = zzijVar9;
                                    unsafe2 = unsafe8;
                                    i13 = i57;
                                    i17 = i55;
                                    i14 = i60;
                                    i48 = i3;
                                    i16 = i61;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    int iZzd3 = zzig.zzd(bArr2, i60, zzijVar9);
                                    unsafe8.putLong(t, j, zziw.zza(zzijVar9.zzb));
                                    i19 = i8 | i63;
                                    unsafe8 = unsafe8;
                                    i47 = i2;
                                    i48 = i3;
                                    i49 = i57;
                                    zzijVar9 = zzijVar9;
                                    i52 = i55;
                                    i50 = i61;
                                    i53 = i9;
                                    iZza5 = iZzd3;
                                    i51 = i19;
                                }
                            case 17:
                                if (i56 != 3) {
                                    i48 = i3;
                                    zzijVar3 = zzijVar9;
                                    i13 = i57;
                                    i14 = i60;
                                    i16 = i61;
                                    i17 = i55;
                                    unsafe2 = unsafe8;
                                    i7 = i48;
                                    zzlgVar2 = zzlgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    zzijVar2 = zzijVar3;
                                    i11 = i17;
                                    i6 = i16;
                                    i10 = i13;
                                    break;
                                } else {
                                    Object objZza2 = zzlgVar3.zza((zzlg<T>) t2, i57);
                                    iZza5 = zzig.zza(objZza2, zzlgVar3.zze(i57), bArr, i60, i2, (i55 << 3) | 4, zzijVar);
                                    zzlgVar3.zza((zzlg<T>) t2, i57, objZza2);
                                    i51 = i8 | i63;
                                    i50 = i61;
                                    i49 = i57;
                                    i52 = i55;
                                    i53 = i9;
                                    i47 = i2;
                                    i48 = i3;
                                }
                            default:
                                i48 = i3;
                                zzijVar3 = zzijVar9;
                                i13 = i57;
                                i14 = i60;
                                i16 = i61;
                                i17 = i55;
                                unsafe2 = unsafe8;
                                i7 = i48;
                                zzlgVar2 = zzlgVar3;
                                unsafe = unsafe2;
                                i12 = i14;
                                zzijVar2 = zzijVar3;
                                i11 = i17;
                                i6 = i16;
                                i10 = i13;
                                break;
                        }
                    } else {
                        i8 = i51;
                        i9 = i53;
                        zzij zzijVar10 = zzijVar9;
                        int i68 = i61;
                        Unsafe unsafe9 = unsafe8;
                        if (i59 != 27) {
                            if (i59 > 49) {
                                Unsafe unsafe10 = unsafe9;
                                i49 = i57;
                                i22 = i60;
                                int i69 = i68;
                                if (i59 != 50) {
                                    zzijVar2 = zzijVar10;
                                    unsafe = unsafe10;
                                    t2 = t;
                                    Unsafe unsafe11 = zzb;
                                    long j2 = iArr[i49 + 2] & 1048575;
                                    switch (i59) {
                                        case 51:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 1) {
                                                unsafe11.putObject(t2, j, Double.valueOf(zzig.zza(bArr2, i24)));
                                                i25 = i24 + 8;
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = i25;
                                                if (iZza5 != i24) {
                                                    bArr2 = bArr;
                                                    i47 = i2;
                                                    zzijVar9 = zzijVar2;
                                                    i50 = i6;
                                                    i49 = i10;
                                                    i52 = i11;
                                                    i51 = i8;
                                                    i53 = i9;
                                                    unsafe8 = unsafe;
                                                    zzlgVar3 = zzlgVar2;
                                                    i48 = i3;
                                                    break;
                                                } else {
                                                    i7 = i3;
                                                    i12 = iZza5;
                                                    break;
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                        case 52:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 5) {
                                                unsafe11.putObject(t2, j, Float.valueOf(zzig.zzb(bArr2, i24)));
                                                i25 = i24 + 4;
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = i25;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 0) {
                                                iZzd = zzig.zzd(bArr2, i24, zzijVar2);
                                                unsafe11.putObject(t2, j, Long.valueOf(zzijVar2.zzb));
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = iZzd;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 0) {
                                                iZzd = zzig.zzc(bArr2, i24, zzijVar2);
                                                unsafe11.putObject(t2, j, Integer.valueOf(zzijVar2.zza));
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = iZzd;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 1) {
                                                unsafe11.putObject(t2, j, Long.valueOf(zzig.zzd(bArr2, i24)));
                                                i25 = i24 + 8;
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = i25;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 5) {
                                                unsafe11.putObject(t2, j, Integer.valueOf(zzig.zzc(bArr2, i24)));
                                                i25 = i24 + 4;
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = i25;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 58:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 0) {
                                                iZzd = zzig.zzd(bArr2, i24, zzijVar2);
                                                unsafe11.putObject(t2, j, Boolean.valueOf(zzijVar2.zzb != 0));
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = iZzd;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 59:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i10 = i49;
                                            i6 = i69;
                                            if (i56 == 2) {
                                                int iZzc5 = zzig.zzc(bArr2, i24, zzijVar2);
                                                int i70 = zzijVar2.zza;
                                                if (i70 == 0) {
                                                    unsafe11.putObject(t2, j, "");
                                                } else {
                                                    if ((i58 & 536870912) != 0 && !zzmp.zzc(bArr2, iZzc5, iZzc5 + i70)) {
                                                        throw zzkb.zzd();
                                                    }
                                                    unsafe11.putObject(t2, j, new String(bArr2, iZzc5, i70, zzjv.zza));
                                                    iZzc5 += i70;
                                                }
                                                unsafe11.putInt(t2, j2, i11);
                                                iZza5 = iZzc5;
                                            } else {
                                                iZza5 = i24;
                                            }
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 60:
                                            zzlgVar2 = this;
                                            i26 = i22;
                                            i27 = i49;
                                            i28 = i55;
                                            i6 = i69;
                                            if (i56 == 2) {
                                                Object objZza3 = zzlgVar2.zza((zzlg<T>) t2, i28, i27);
                                                int iZza7 = zzig.zza(objZza3, zzlgVar2.zze(i27), bArr, i26, i2, zzijVar);
                                                zzlgVar2.zza((zzlg<T>) t2, i28, i27, objZza3);
                                                iZza5 = iZza7;
                                                i10 = i27;
                                                i24 = i26;
                                                i11 = i28;
                                                zzlgVar2 = zzlgVar2;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            i10 = i27;
                                            i11 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 61:
                                            zzlgVar2 = this;
                                            i26 = i22;
                                            i27 = i49;
                                            i28 = i55;
                                            i6 = i69;
                                            if (i56 == 2) {
                                                iZza2 = zzig.zza(bArr2, i26, zzijVar2);
                                                unsafe11.putObject(t2, j, zzijVar2.zzc);
                                                unsafe11.putInt(t2, j2, i28);
                                                iZza5 = iZza2;
                                                i10 = i27;
                                                i11 = i28;
                                                i24 = i26;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            i10 = i27;
                                            i11 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 63:
                                            zzlgVar2 = this;
                                            i26 = i22;
                                            i27 = i49;
                                            i28 = i55;
                                            if (i56 == 0) {
                                                iZza2 = zzig.zzc(bArr2, i26, zzijVar2);
                                                int i71 = zzijVar2.zza;
                                                zzjx zzjxVarZzd2 = zzlgVar2.zzd(i27);
                                                if (zzjxVarZzd2 == null || zzjxVarZzd2.zza(i71)) {
                                                    i6 = i69;
                                                    unsafe11.putObject(t2, j, Integer.valueOf(i71));
                                                    unsafe11.putInt(t2, j2, i28);
                                                } else {
                                                    i6 = i69;
                                                    zzc(t).zza(i6, Long.valueOf(i71));
                                                }
                                                iZza5 = iZza2;
                                                i10 = i27;
                                                i11 = i28;
                                                i24 = i26;
                                                if (iZza5 != i24) {
                                                }
                                            } else {
                                                i6 = i69;
                                                i10 = i27;
                                                i11 = i28;
                                                i24 = i26;
                                                iZza5 = i24;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            break;
                                        case 66:
                                            zzlgVar2 = this;
                                            i26 = i22;
                                            i29 = i49;
                                            i28 = i55;
                                            i30 = i69;
                                            if (i56 == 0) {
                                                iZzc2 = zzig.zzc(bArr2, i26, zzijVar2);
                                                unsafe11.putObject(t2, j, Integer.valueOf(zziw.zza(zzijVar2.zza)));
                                                unsafe11.putInt(t2, j2, i28);
                                                iZza5 = iZzc2;
                                                i10 = i29;
                                                i6 = i30;
                                                i11 = i28;
                                                i24 = i26;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            i10 = i29;
                                            i6 = i30;
                                            i11 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 67:
                                            zzlgVar2 = this;
                                            i26 = i22;
                                            i29 = i49;
                                            i28 = i55;
                                            i30 = i69;
                                            if (i56 == 0) {
                                                iZzc2 = zzig.zzd(bArr2, i26, zzijVar2);
                                                unsafe11.putObject(t2, j, Long.valueOf(zziw.zza(zzijVar2.zzb)));
                                                unsafe11.putInt(t2, j2, i28);
                                                iZza5 = iZzc2;
                                                i10 = i29;
                                                i6 = i30;
                                                i11 = i28;
                                                i24 = i26;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            i10 = i29;
                                            i6 = i30;
                                            i11 = i28;
                                            i24 = i26;
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                zzlgVar2 = this;
                                                Object objZza4 = zzlgVar2.zza((zzlg<T>) t2, i55, i49);
                                                i26 = i22;
                                                iZza5 = zzig.zza(objZza4, zzlgVar2.zze(i49), bArr, i26, i2, (i69 & (-8)) | 4, zzijVar);
                                                zzlgVar2.zza((zzlg<T>) t2, i55, i49, objZza4);
                                                i10 = i49;
                                                i11 = i55;
                                                i6 = i69;
                                                i24 = i26;
                                                if (iZza5 != i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            zzlgVar2 = this;
                                            i24 = i22;
                                            i11 = i55;
                                            i6 = i69;
                                            i10 = i49;
                                            iZza5 = i24;
                                            if (iZza5 != i24) {
                                            }
                                            break;
                                    }
                                } else if (i56 == 2) {
                                    Unsafe unsafe12 = zzb;
                                    Object objZzf = zzlgVar3.zzf(i49);
                                    zzijVar4 = zzijVar10;
                                    t2 = t;
                                    Object object = unsafe12.getObject(t2, j);
                                    if (zzlgVar3.zzr.zzf(object)) {
                                        Object objZzb = zzlgVar3.zzr.zzb(objZzf);
                                        zzlgVar3.zzr.zza(objZzb, object);
                                        unsafe12.putObject(t2, j, objZzb);
                                        object = objZzb;
                                    }
                                    zzkt<?, ?> zzktVarZza = zzlgVar3.zzr.zza(objZzf);
                                    Map<?, ?> mapZze = zzlgVar3.zzr.zze(object);
                                    int iZzc6 = zzig.zzc(bArr2, i22, zzijVar4);
                                    int i72 = zzijVar4.zza;
                                    if (i72 >= 0 && i72 <= i2 - iZzc6) {
                                        int i73 = iZzc6 + i72;
                                        Object obj2 = zzktVarZza.zzb;
                                        Object obj3 = zzktVarZza.zzd;
                                        Object obj4 = obj2;
                                        while (iZzc6 < i73) {
                                            int iZza8 = iZzc6 + 1;
                                            byte b2 = bArr2[iZzc6];
                                            if (b2 < 0) {
                                                iZza8 = zzig.zza(b2, bArr2, iZza8, zzijVar4);
                                                b2 = zzijVar4.zza;
                                            }
                                            Object obj5 = obj3;
                                            int i74 = b2 >>> 3;
                                            Object obj6 = obj4;
                                            int i75 = b2 & 7;
                                            if (i74 == 1) {
                                                i31 = i73;
                                                i32 = i69;
                                                obj = obj6;
                                                unsafe3 = unsafe10;
                                                if (i75 == zzktVarZza.zza.zza()) {
                                                    iZzc6 = zza(bArr, iZza8, i2, zzktVarZza.zza, (Class<?>) null, zzijVar);
                                                    obj4 = zzijVar4.zzc;
                                                    i73 = i31;
                                                    obj3 = obj5;
                                                    i69 = i32;
                                                    unsafe10 = unsafe3;
                                                }
                                            } else if (i74 == 2) {
                                                if (i75 == zzktVarZza.zzc.zza()) {
                                                    iZzc6 = zza(bArr, iZza8, i2, zzktVarZza.zzc, zzktVarZza.zzd.getClass(), zzijVar);
                                                    obj3 = zzijVar4.zzc;
                                                    i73 = i73;
                                                    obj4 = obj6;
                                                    i69 = i69;
                                                } else {
                                                    i31 = i73;
                                                    i32 = i69;
                                                    obj = obj6;
                                                    unsafe3 = unsafe10;
                                                }
                                            } else {
                                                obj3 = obj5;
                                                i31 = i73;
                                                i32 = i69;
                                                obj = obj6;
                                                unsafe3 = unsafe10;
                                                iZzc6 = zzig.zza(b2, bArr2, iZza8, i2, zzijVar4);
                                                i73 = i31;
                                                obj4 = obj;
                                                i69 = i32;
                                                unsafe10 = unsafe3;
                                            }
                                            obj3 = obj5;
                                            iZzc6 = zzig.zza(b2, bArr2, iZza8, i2, zzijVar4);
                                            i73 = i31;
                                            obj4 = obj;
                                            i69 = i32;
                                            unsafe10 = unsafe3;
                                        }
                                        int i76 = i73;
                                        i23 = i69;
                                        unsafe = unsafe10;
                                        Object obj7 = obj4;
                                        if (iZzc6 != i76) {
                                            throw zzkb.zzg();
                                        }
                                        mapZze.put(obj7, obj3);
                                        if (i76 == i22) {
                                            zzlgVar2 = this;
                                            i7 = i3;
                                            i12 = i76;
                                            zzijVar2 = zzijVar4;
                                            i11 = i55;
                                            i6 = i23;
                                        } else {
                                            i48 = i3;
                                            iZza5 = i76;
                                            zzijVar9 = zzijVar4;
                                            i47 = i2;
                                            i52 = i55;
                                            i51 = i8;
                                            i50 = i23;
                                            i53 = i9;
                                            unsafe8 = unsafe;
                                            zzlgVar3 = this;
                                        }
                                    }
                                } else {
                                    i23 = i69;
                                    zzijVar4 = zzijVar10;
                                    unsafe = unsafe10;
                                    t2 = t;
                                    zzlgVar2 = this;
                                    i7 = i3;
                                    i12 = i22;
                                    zzijVar2 = zzijVar4;
                                    i11 = i55;
                                    i6 = i23;
                                }
                            } else {
                                long j3 = i58;
                                Unsafe unsafe13 = zzb;
                                zzkc zzkcVar3 = (zzkc) unsafe13.getObject(t2, j);
                                if (zzkcVar3.zzc()) {
                                    unsafe4 = unsafe9;
                                    zzkcVarZza = zzkcVar3;
                                } else {
                                    unsafe4 = unsafe9;
                                    zzkcVarZza = zzkcVar3.zza(zzkcVar3.size() << 1);
                                    unsafe13.putObject(t2, j, zzkcVarZza);
                                }
                                switch (i59) {
                                    case 18:
                                    case 35:
                                        i33 = i3;
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i34 = i60;
                                        i35 = i68;
                                        unsafe5 = unsafe4;
                                        i36 = i2;
                                        if (i56 != 2) {
                                            if (i56 == 1) {
                                                zzje zzjeVar = (zzje) zzkcVarZza;
                                                zzjeVar.zza(zzig.zza(bArr2, i34));
                                                iZzc3 = i34 + 8;
                                                while (iZzc3 < i36) {
                                                    int iZzc7 = zzig.zzc(bArr2, iZzc3, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        zzjeVar.zza(zzig.zza(bArr2, iZzc7));
                                                        iZzc3 = iZzc7 + 8;
                                                    }
                                                }
                                            }
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                                iZza5 = iZza3;
                                                i48 = i33;
                                                unsafe8 = unsafe5;
                                                i50 = i35;
                                                i47 = i36;
                                                zzijVar9 = zzijVar5;
                                                i52 = i55;
                                                i51 = i8;
                                                i53 = i9;
                                                t2 = t;
                                                break;
                                            } else {
                                                i12 = iZza3;
                                                zzlgVar2 = zzlgVar3;
                                                i7 = i33;
                                                unsafe = unsafe5;
                                                i6 = i35;
                                                zzijVar2 = zzijVar5;
                                                i11 = i55;
                                                t2 = t;
                                                break;
                                            }
                                        } else {
                                            zzje zzjeVar2 = (zzje) zzkcVarZza;
                                            iZzc3 = zzig.zzc(bArr2, i34, zzijVar5);
                                            int i77 = zzijVar5.zza;
                                            int i78 = iZzc3 + i77;
                                            if (i78 > bArr2.length) {
                                                throw zzkb.zzi();
                                            }
                                            zzjeVar2.zzc(zzjeVar2.size() + (i77 / 8));
                                            while (iZzc3 < i78) {
                                                zzjeVar2.zza(zzig.zza(bArr2, iZzc3));
                                                iZzc3 += 8;
                                            }
                                            if (iZzc3 != i78) {
                                                throw zzkb.zzi();
                                            }
                                        }
                                        iZza3 = iZzc3;
                                        if (iZza3 != i34) {
                                        }
                                    case 19:
                                    case 36:
                                        i33 = i3;
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i34 = i60;
                                        i35 = i68;
                                        unsafe5 = unsafe4;
                                        i36 = i2;
                                        if (i56 == 2) {
                                            zzjs zzjsVar = (zzjs) zzkcVarZza;
                                            iZzc3 = zzig.zzc(bArr2, i34, zzijVar5);
                                            int i79 = zzijVar5.zza;
                                            int i80 = iZzc3 + i79;
                                            if (i80 > bArr2.length) {
                                                throw zzkb.zzi();
                                            }
                                            zzjsVar.zzc(zzjsVar.size() + (i79 / 4));
                                            while (iZzc3 < i80) {
                                                zzjsVar.zza(zzig.zzb(bArr2, iZzc3));
                                                iZzc3 += 4;
                                            }
                                            if (iZzc3 != i80) {
                                                throw zzkb.zzi();
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                zzjs zzjsVar2 = (zzjs) zzkcVarZza;
                                                zzjsVar2.zza(zzig.zzb(bArr2, i34));
                                                iZzc3 = i34 + 4;
                                                while (iZzc3 < i36) {
                                                    int iZzc8 = zzig.zzc(bArr2, iZzc3, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        zzjsVar2.zza(zzig.zzb(bArr2, iZzc8));
                                                        iZzc3 = iZzc8 + 4;
                                                    }
                                                }
                                            }
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        iZza3 = iZzc3;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i33 = i3;
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i34 = i60;
                                        i35 = i68;
                                        unsafe5 = unsafe4;
                                        i36 = i2;
                                        if (i56 == 2) {
                                            zzkn zzknVar = (zzkn) zzkcVarZza;
                                            iZzc3 = zzig.zzc(bArr2, i34, zzijVar5);
                                            int i81 = zzijVar5.zza + iZzc3;
                                            while (iZzc3 < i81) {
                                                iZzc3 = zzig.zzd(bArr2, iZzc3, zzijVar5);
                                                zzknVar.zza(zzijVar5.zzb);
                                            }
                                            if (iZzc3 != i81) {
                                                throw zzkb.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzkn zzknVar2 = (zzkn) zzkcVarZza;
                                                iZzc3 = zzig.zzd(bArr2, i34, zzijVar5);
                                                zzknVar2.zza(zzijVar5.zzb);
                                                while (iZzc3 < i36) {
                                                    int iZzc9 = zzig.zzc(bArr2, iZzc3, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        iZzc3 = zzig.zzd(bArr2, iZzc9, zzijVar5);
                                                        zzknVar2.zza(zzijVar5.zzb);
                                                    }
                                                }
                                            }
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        iZza3 = iZzc3;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i37 = i60;
                                        i35 = i68;
                                        unsafe6 = unsafe4;
                                        i36 = i2;
                                        i38 = i3;
                                        if (i56 == 2) {
                                            iZza3 = zzig.zza(bArr2, i37, (zzkc<?>) zzkcVarZza, zzijVar5);
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            if (iZza3 != i34) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                i34 = i37;
                                                i33 = i38;
                                                unsafe5 = unsafe6;
                                                iZzc3 = zzig.zza(i35, bArr, i34, i2, (zzkc<?>) zzkcVarZza, zzijVar);
                                                iZza3 = iZzc3;
                                                if (iZza3 != i34) {
                                                }
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i37 = i60;
                                        i35 = i68;
                                        unsafe6 = unsafe4;
                                        i36 = i2;
                                        i38 = i3;
                                        if (i56 == 2) {
                                            zzkn zzknVar3 = (zzkn) zzkcVarZza;
                                            iZza3 = zzig.zzc(bArr2, i37, zzijVar5);
                                            int i82 = zzijVar5.zza;
                                            int i83 = iZza3 + i82;
                                            if (i83 > bArr2.length) {
                                                throw zzkb.zzi();
                                            }
                                            zzknVar3.zzd(zzknVar3.size() + (i82 / 8));
                                            while (iZza3 < i83) {
                                                zzknVar3.zza(zzig.zzd(bArr2, iZza3));
                                                iZza3 += 8;
                                            }
                                            if (iZza3 != i83) {
                                                throw zzkb.zzi();
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            if (iZza3 != i34) {
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                zzkn zzknVar4 = (zzkn) zzkcVarZza;
                                                zzknVar4.zza(zzig.zzd(bArr2, i37));
                                                i39 = i37 + 8;
                                                while (i39 < i36) {
                                                    int iZzc10 = zzig.zzc(bArr2, i39, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        zzknVar4.zza(zzig.zzd(bArr2, iZzc10));
                                                        i39 = iZzc10 + 8;
                                                    } else {
                                                        i34 = i37;
                                                        i33 = i38;
                                                        iZza3 = i39;
                                                        unsafe5 = unsafe6;
                                                        if (iZza3 != i34) {
                                                        }
                                                    }
                                                }
                                                i34 = i37;
                                                i33 = i38;
                                                iZza3 = i39;
                                                unsafe5 = unsafe6;
                                                if (iZza3 != i34) {
                                                }
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i37 = i60;
                                        i35 = i68;
                                        unsafe6 = unsafe4;
                                        i36 = i2;
                                        i38 = i3;
                                        if (i56 == 2) {
                                            zzjw zzjwVar = (zzjw) zzkcVarZza;
                                            iZza3 = zzig.zzc(bArr2, i37, zzijVar5);
                                            int i84 = zzijVar5.zza;
                                            int i85 = iZza3 + i84;
                                            if (i85 > bArr2.length) {
                                                throw zzkb.zzi();
                                            }
                                            zzjwVar.zze(zzjwVar.size() + (i84 / 4));
                                            while (iZza3 < i85) {
                                                zzjwVar.zzd(zzig.zzc(bArr2, iZza3));
                                                iZza3 += 4;
                                            }
                                            if (iZza3 != i85) {
                                                throw zzkb.zzi();
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            if (iZza3 != i34) {
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                zzjw zzjwVar2 = (zzjw) zzkcVarZza;
                                                zzjwVar2.zzd(zzig.zzc(bArr2, i37));
                                                i39 = i37 + 4;
                                                while (i39 < i36) {
                                                    int iZzc11 = zzig.zzc(bArr2, i39, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        zzjwVar2.zzd(zzig.zzc(bArr2, iZzc11));
                                                        i39 = iZzc11 + 4;
                                                    } else {
                                                        i34 = i37;
                                                        i33 = i38;
                                                        iZza3 = i39;
                                                        unsafe5 = unsafe6;
                                                        if (iZza3 != i34) {
                                                        }
                                                    }
                                                }
                                                i34 = i37;
                                                i33 = i38;
                                                iZza3 = i39;
                                                unsafe5 = unsafe6;
                                                if (iZza3 != i34) {
                                                }
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i37 = i60;
                                        i35 = i68;
                                        unsafe6 = unsafe4;
                                        i36 = i2;
                                        i38 = i3;
                                        if (i56 == 2) {
                                            zzii zziiVar = (zzii) zzkcVarZza;
                                            iZza3 = zzig.zzc(bArr2, i37, zzijVar5);
                                            int i86 = zzijVar5.zza + iZza3;
                                            while (iZza3 < i86) {
                                                iZza3 = zzig.zzd(bArr2, iZza3, zzijVar5);
                                                zziiVar.zza(zzijVar5.zzb != 0);
                                            }
                                            if (iZza3 != i86) {
                                                throw zzkb.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzii zziiVar2 = (zzii) zzkcVarZza;
                                                iZza3 = zzig.zzd(bArr2, i37, zzijVar5);
                                                zziiVar2.zza(zzijVar5.zzb != 0);
                                                while (iZza3 < i36) {
                                                    int iZzc12 = zzig.zzc(bArr2, iZza3, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        iZza3 = zzig.zzd(bArr2, iZzc12, zzijVar5);
                                                        zziiVar2.zza(zzijVar5.zzb != 0);
                                                    }
                                                }
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        i34 = i37;
                                        i33 = i38;
                                        unsafe5 = unsafe6;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 26:
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i37 = i60;
                                        i35 = i68;
                                        unsafe6 = unsafe4;
                                        i36 = i2;
                                        i38 = i3;
                                        if (i56 == 2) {
                                            if ((j3 & SVG.SPECIFIED_CLIP_RULE) == 0) {
                                                iZza3 = zzig.zzc(bArr2, i37, zzijVar5);
                                                int i87 = zzijVar5.zza;
                                                if (i87 < 0) {
                                                    throw zzkb.zzf();
                                                }
                                                if (i87 == 0) {
                                                    zzkcVarZza.add("");
                                                } else {
                                                    zzkcVarZza.add(new String(bArr2, iZza3, i87, zzjv.zza));
                                                    iZza3 += i87;
                                                }
                                                while (iZza3 < i36) {
                                                    int iZzc13 = zzig.zzc(bArr2, iZza3, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        iZza3 = zzig.zzc(bArr2, iZzc13, zzijVar5);
                                                        int i88 = zzijVar5.zza;
                                                        if (i88 < 0) {
                                                            throw zzkb.zzf();
                                                        }
                                                        if (i88 == 0) {
                                                            zzkcVarZza.add("");
                                                        } else {
                                                            zzkcVarZza.add(new String(bArr2, iZza3, i88, zzjv.zza));
                                                            iZza3 += i88;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZza3 = zzig.zzc(bArr2, i37, zzijVar5);
                                                int i89 = zzijVar5.zza;
                                                if (i89 < 0) {
                                                    throw zzkb.zzf();
                                                }
                                                if (i89 == 0) {
                                                    zzkcVarZza.add("");
                                                } else {
                                                    int i90 = iZza3 + i89;
                                                    if (!zzmp.zzc(bArr2, iZza3, i90)) {
                                                        throw zzkb.zzd();
                                                    }
                                                    zzkcVarZza.add(new String(bArr2, iZza3, i89, zzjv.zza));
                                                    iZza3 = i90;
                                                }
                                                while (iZza3 < i36) {
                                                    int iZzc14 = zzig.zzc(bArr2, iZza3, zzijVar5);
                                                    if (i35 == zzijVar5.zza) {
                                                        iZza3 = zzig.zzc(bArr2, iZzc14, zzijVar5);
                                                        int i91 = zzijVar5.zza;
                                                        if (i91 < 0) {
                                                            throw zzkb.zzf();
                                                        }
                                                        if (i91 == 0) {
                                                            zzkcVarZza.add("");
                                                        } else {
                                                            int i92 = iZza3 + i91;
                                                            if (!zzmp.zzc(bArr2, iZza3, i92)) {
                                                                throw zzkb.zzd();
                                                            }
                                                            zzkcVarZza.add(new String(bArr2, iZza3, i91, zzjv.zza));
                                                            iZza3 = i92;
                                                        }
                                                    }
                                                }
                                            }
                                            i34 = i37;
                                            i33 = i38;
                                            unsafe5 = unsafe6;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        i34 = i37;
                                        i33 = i38;
                                        unsafe5 = unsafe6;
                                        iZza3 = i34;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 27:
                                        i33 = i3;
                                        i40 = i2;
                                        i41 = i57;
                                        zzijVar6 = zzijVar10;
                                        i42 = i60;
                                        i43 = i68;
                                        unsafe7 = unsafe4;
                                        if (i56 == 2) {
                                            zzijVar5 = zzijVar6;
                                            int iZzb = zzig.zzb(zzlgVar3.zze(i41), i43, bArr, i42, i2, zzkcVarZza, zzijVar);
                                            i36 = i40;
                                            i49 = i41;
                                            i33 = i33;
                                            unsafe5 = unsafe7;
                                            i35 = i43;
                                            iZza3 = iZzb;
                                            i34 = i42;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        zzijVar5 = zzijVar6;
                                        i35 = i43;
                                        i36 = i40;
                                        unsafe5 = unsafe7;
                                        i34 = i42;
                                        i49 = i41;
                                        iZza3 = i34;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 28:
                                        i33 = i3;
                                        i40 = i2;
                                        zzkc zzkcVar4 = zzkcVarZza;
                                        i41 = i57;
                                        zzijVar6 = zzijVar10;
                                        i42 = i60;
                                        i43 = i68;
                                        unsafe7 = unsafe4;
                                        if (i56 == 2) {
                                            int iZzc15 = zzig.zzc(bArr2, i42, zzijVar6);
                                            int i93 = zzijVar6.zza;
                                            if (i93 < 0) {
                                                throw zzkb.zzf();
                                            }
                                            if (i93 > bArr2.length - iZzc15) {
                                                throw zzkb.zzi();
                                            }
                                            if (i93 == 0) {
                                                zzkcVar = zzkcVar4;
                                                zzkcVar.add(zzik.zza);
                                            } else {
                                                zzkcVar = zzkcVar4;
                                                zzkcVar.add(zzik.zza(bArr2, iZzc15, i93));
                                                iZzc15 += i93;
                                            }
                                            while (iZzc15 < i40) {
                                                int iZzc16 = zzig.zzc(bArr2, iZzc15, zzijVar6);
                                                if (i43 == zzijVar6.zza) {
                                                    iZzc15 = zzig.zzc(bArr2, iZzc16, zzijVar6);
                                                    int i94 = zzijVar6.zza;
                                                    if (i94 < 0) {
                                                        throw zzkb.zzf();
                                                    }
                                                    if (i94 > bArr2.length - iZzc15) {
                                                        throw zzkb.zzi();
                                                    }
                                                    if (i94 == 0) {
                                                        zzkcVar.add(zzik.zza);
                                                    } else {
                                                        zzkcVar.add(zzik.zza(bArr2, iZzc15, i94));
                                                        iZzc15 += i94;
                                                    }
                                                } else {
                                                    iZza3 = iZzc15;
                                                    zzijVar5 = zzijVar6;
                                                    i35 = i43;
                                                    i36 = i40;
                                                    unsafe5 = unsafe7;
                                                    i34 = i42;
                                                    i49 = i41;
                                                    if (iZza3 != i34) {
                                                    }
                                                }
                                            }
                                            iZza3 = iZzc15;
                                            zzijVar5 = zzijVar6;
                                            i35 = i43;
                                            i36 = i40;
                                            unsafe5 = unsafe7;
                                            i34 = i42;
                                            i49 = i41;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        zzijVar5 = zzijVar6;
                                        i35 = i43;
                                        i36 = i40;
                                        unsafe5 = unsafe7;
                                        i34 = i42;
                                        i49 = i41;
                                        iZza3 = i34;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i44 = i57;
                                        zzijVar7 = zzijVar10;
                                        i45 = i60;
                                        i46 = i68;
                                        if (i56 == 2) {
                                            i33 = i3;
                                            zzijVar8 = zzijVar7;
                                            iZza4 = zzig.zza(bArr2, i45, (zzkc<?>) zzkcVarZza, zzijVar7);
                                            i41 = i44;
                                            i40 = i2;
                                            i42 = i45;
                                            zzkcVar2 = zzkcVarZza;
                                            unsafe7 = unsafe4;
                                        } else {
                                            if (i56 == 0) {
                                                zzijVar8 = zzijVar7;
                                                i41 = i44;
                                                i40 = i2;
                                                i42 = i45;
                                                i33 = i3;
                                                zzkcVar2 = zzkcVarZza;
                                                unsafe7 = unsafe4;
                                                iZza4 = zzig.zza(i46, bArr, i45, i2, (zzkc<?>) zzkcVarZza, zzijVar);
                                            }
                                            i33 = i3;
                                            zzijVar5 = zzijVar7;
                                            i49 = i44;
                                            i34 = i45;
                                            i35 = i46;
                                            unsafe5 = unsafe4;
                                            i36 = i2;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        zzlw.zza(t, i55, zzkcVar2, zzlgVar3.zzd(i41), null, zzlgVar3.zzp);
                                        zzijVar5 = zzijVar8;
                                        i35 = i46;
                                        iZza3 = iZza4;
                                        i36 = i40;
                                        unsafe5 = unsafe7;
                                        i34 = i42;
                                        i49 = i41;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i44 = i57;
                                        zzijVar7 = zzijVar10;
                                        i45 = i60;
                                        i46 = i68;
                                        if (i56 == 2) {
                                            zzjw zzjwVar3 = (zzjw) zzkcVarZza;
                                            iZza3 = zzig.zzc(bArr2, i45, zzijVar7);
                                            int i95 = zzijVar7.zza + iZza3;
                                            while (iZza3 < i95) {
                                                iZza3 = zzig.zzc(bArr2, iZza3, zzijVar7);
                                                zzjwVar3.zzd(zziw.zza(zzijVar7.zza));
                                            }
                                            if (iZza3 != i95) {
                                                throw zzkb.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzjw zzjwVar4 = (zzjw) zzkcVarZza;
                                                iZza3 = zzig.zzc(bArr2, i45, zzijVar7);
                                                zzjwVar4.zzd(zziw.zza(zzijVar7.zza));
                                                while (iZza3 < i2) {
                                                    int iZzc17 = zzig.zzc(bArr2, iZza3, zzijVar7);
                                                    if (i46 == zzijVar7.zza) {
                                                        iZza3 = zzig.zzc(bArr2, iZzc17, zzijVar7);
                                                        zzjwVar4.zzd(zziw.zza(zzijVar7.zza));
                                                    }
                                                }
                                            }
                                            i33 = i3;
                                            zzijVar5 = zzijVar7;
                                            i49 = i44;
                                            i34 = i45;
                                            i35 = i46;
                                            unsafe5 = unsafe4;
                                            i36 = i2;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        i33 = i3;
                                        zzijVar5 = zzijVar7;
                                        i49 = i44;
                                        i34 = i45;
                                        i35 = i46;
                                        unsafe5 = unsafe4;
                                        i36 = i2;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i44 = i57;
                                        zzijVar7 = zzijVar10;
                                        i45 = i60;
                                        if (i56 == 2) {
                                            zzkn zzknVar5 = (zzkn) zzkcVarZza;
                                            iZza3 = zzig.zzc(bArr2, i45, zzijVar7);
                                            int i96 = zzijVar7.zza + iZza3;
                                            while (iZza3 < i96) {
                                                iZza3 = zzig.zzd(bArr2, iZza3, zzijVar7);
                                                zzknVar5.zza(zziw.zza(zzijVar7.zzb));
                                            }
                                            if (iZza3 != i96) {
                                                throw zzkb.zzi();
                                            }
                                            i33 = i3;
                                            zzijVar5 = zzijVar7;
                                            i49 = i44;
                                            i36 = i2;
                                            i34 = i45;
                                            i35 = i68;
                                            unsafe5 = unsafe4;
                                            if (iZza3 != i34) {
                                            }
                                        } else if (i56 == 0) {
                                            zzkn zzknVar6 = (zzkn) zzkcVarZza;
                                            iZza3 = zzig.zzd(bArr2, i45, zzijVar7);
                                            zzknVar6.zza(zziw.zza(zzijVar7.zzb));
                                            while (true) {
                                                if (iZza3 < i2) {
                                                    int iZzc18 = zzig.zzc(bArr2, iZza3, zzijVar7);
                                                    i46 = i68;
                                                    if (i46 == zzijVar7.zza) {
                                                        iZza3 = zzig.zzd(bArr2, iZzc18, zzijVar7);
                                                        zzknVar6.zza(zziw.zza(zzijVar7.zzb));
                                                        i68 = i46;
                                                    }
                                                } else {
                                                    i46 = i68;
                                                }
                                            }
                                            i33 = i3;
                                            zzijVar5 = zzijVar7;
                                            i49 = i44;
                                            i34 = i45;
                                            i35 = i46;
                                            unsafe5 = unsafe4;
                                            i36 = i2;
                                            if (iZza3 != i34) {
                                            }
                                        } else {
                                            i33 = i3;
                                            zzijVar5 = zzijVar7;
                                            i49 = i44;
                                            i36 = i2;
                                            i34 = i45;
                                            i35 = i68;
                                            unsafe5 = unsafe4;
                                            iZza3 = i34;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        break;
                                    case 49:
                                        if (i56 == 3) {
                                            i45 = i60;
                                            i44 = i57;
                                            zzijVar7 = zzijVar10;
                                            iZza3 = zzig.zza(zzlgVar3.zze(i57), i68, bArr, i45, i2, (zzkc<?>) zzkcVarZza, zzijVar);
                                            i33 = i3;
                                            zzijVar5 = zzijVar7;
                                            i49 = i44;
                                            i36 = i2;
                                            i34 = i45;
                                            i35 = i68;
                                            unsafe5 = unsafe4;
                                            if (iZza3 != i34) {
                                            }
                                        }
                                        break;
                                    default:
                                        i33 = i3;
                                        i49 = i57;
                                        zzijVar5 = zzijVar10;
                                        i34 = i60;
                                        i35 = i68;
                                        unsafe5 = unsafe4;
                                        i36 = i2;
                                        iZza3 = i34;
                                        if (iZza3 != i34) {
                                        }
                                        break;
                                }
                            }
                        } else if (i56 == 2) {
                            zzkc zzkcVarZza2 = (zzkc) unsafe9.getObject(t2, j);
                            if (!zzkcVarZza2.zzc()) {
                                int size = zzkcVarZza2.size();
                                zzkcVarZza2 = zzkcVarZza2.zza(size == 0 ? 10 : size << 1);
                                unsafe9.putObject(t2, j, zzkcVarZza2);
                            }
                            iZza5 = zzig.zzb(zzlgVar3.zze(i57), i68, bArr, i60, i2, zzkcVarZza2, zzijVar);
                            zzijVar9 = zzijVar10;
                            i49 = i57;
                            i47 = i2;
                            unsafe8 = unsafe9;
                            i52 = i55;
                            i50 = i68;
                            i51 = i8;
                            i53 = i9;
                            i48 = i3;
                        } else {
                            unsafe = unsafe9;
                            i22 = i60;
                            i49 = i57;
                            zzijVar4 = zzijVar10;
                            i23 = i68;
                            zzlgVar2 = this;
                            i7 = i3;
                            i12 = i22;
                            zzijVar2 = zzijVar4;
                            i11 = i55;
                            i6 = i23;
                        }
                        i10 = i49;
                    }
                }
                if (i6 == i7 && i7 != 0) {
                    iZza5 = i12;
                    i4 = i7;
                    i50 = i6;
                    i51 = i8;
                    i53 = i9;
                    i5 = 1048575;
                    zzlgVar = zzlgVar2;
                } else if (zzlgVar2.zzh && zzijVar2.zzd != zzjg.zza) {
                    iZza5 = zzig.zza(i6, bArr, i12, i2, t, zzlgVar2.zzg, zzlgVar2.zzp, zzijVar);
                    bArr2 = bArr;
                    zzijVar9 = zzijVar2;
                    i50 = i6;
                    i49 = i10;
                    i52 = i11;
                    i51 = i8;
                    i53 = i9;
                    unsafe8 = unsafe;
                    zzlgVar3 = zzlgVar2;
                    i48 = i7;
                    i47 = i2;
                } else {
                    int i97 = i6;
                    int i98 = i7;
                    zzlg<T> zzlgVar4 = zzlgVar2;
                    iZza5 = zzig.zza(i97, bArr, i12, i2, zzc(t), zzijVar);
                    bArr2 = bArr;
                    i47 = i2;
                    zzijVar9 = zzijVar2;
                    i48 = i98;
                    zzlgVar3 = zzlgVar4;
                    i50 = i97;
                    i49 = i10;
                    i52 = i11;
                    i51 = i8;
                    i53 = i9;
                    unsafe8 = unsafe;
                }
            } else {
                unsafe = unsafe8;
                i4 = i48;
                zzlgVar = zzlgVar3;
                i5 = 1048575;
            }
        }
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzml.zze(t, j)).longValue();
    }

    private final zzjx zzd(int i) {
        return (zzjx) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:348:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzlg<T> zza(Class<T> cls, zzla zzlaVar, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        zzls zzlsVar;
        int i19;
        int iObjectFieldOffset;
        int i20;
        String str;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        Field fieldZza;
        int i23;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZza2;
        Object obj2;
        Field fieldZza3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        if (zzlaVar instanceof zzls) {
            zzls zzlsVar2 = (zzls) zzlaVar;
            String strZzd = zzlsVar2.zzd();
            int length = strZzd.length();
            char c = 55296;
            if (strZzd.charAt(0) >= 55296) {
                int i31 = 1;
                while (true) {
                    i = i31 + 1;
                    if (strZzd.charAt(i31) < 55296) {
                        break;
                    }
                    i31 = i;
                }
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int iCharAt3 = strZzd.charAt(i);
            if (iCharAt3 >= 55296) {
                int i33 = iCharAt3 & 8191;
                int i34 = 13;
                while (true) {
                    i30 = i32 + 1;
                    cCharAt13 = strZzd.charAt(i32);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt13 & 8191) << i34;
                    i34 += 13;
                    i32 = i30;
                }
                iCharAt3 = i33 | (cCharAt13 << i34);
                i32 = i30;
            }
            if (iCharAt3 == 0) {
                i6 = 0;
                iCharAt = 0;
                iCharAt2 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                iArr = zza;
                i2 = 0;
            } else {
                int i35 = i32 + 1;
                int iCharAt4 = strZzd.charAt(i32);
                if (iCharAt4 >= 55296) {
                    int i36 = iCharAt4 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        cCharAt8 = strZzd.charAt(i35);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i36 |= (cCharAt8 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    iCharAt4 = i36 | (cCharAt8 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int iCharAt5 = strZzd.charAt(i35);
                if (iCharAt5 >= 55296) {
                    int i39 = iCharAt5 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        cCharAt7 = strZzd.charAt(i38);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i39 |= (cCharAt7 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    iCharAt5 = i39 | (cCharAt7 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                int iCharAt6 = strZzd.charAt(i38);
                if (iCharAt6 >= 55296) {
                    int i42 = iCharAt6 & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        cCharAt6 = strZzd.charAt(i41);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt6 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    iCharAt6 = i42 | (cCharAt6 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int iCharAt7 = strZzd.charAt(i41);
                if (iCharAt7 >= 55296) {
                    int i45 = iCharAt7 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        cCharAt5 = strZzd.charAt(i44);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt5 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    iCharAt7 = i45 | (cCharAt5 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                iCharAt = strZzd.charAt(i44);
                if (iCharAt >= 55296) {
                    int i48 = iCharAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        cCharAt4 = strZzd.charAt(i47);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt4 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    iCharAt = i48 | (cCharAt4 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                iCharAt2 = strZzd.charAt(i47);
                if (iCharAt2 >= 55296) {
                    int i51 = iCharAt2 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        cCharAt3 = strZzd.charAt(i50);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt3 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    iCharAt2 = i51 | (cCharAt3 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int iCharAt8 = strZzd.charAt(i50);
                if (iCharAt8 >= 55296) {
                    int i54 = iCharAt8 & 8191;
                    int i55 = 13;
                    while (true) {
                        i8 = i53 + 1;
                        cCharAt2 = strZzd.charAt(i53);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i54 |= (cCharAt2 & 8191) << i55;
                        i55 += 13;
                        i53 = i8;
                    }
                    iCharAt8 = i54 | (cCharAt2 << i55);
                    i53 = i8;
                }
                int i56 = i53 + 1;
                int iCharAt9 = strZzd.charAt(i53);
                if (iCharAt9 >= 55296) {
                    int i57 = iCharAt9 & 8191;
                    int i58 = 13;
                    while (true) {
                        i7 = i56 + 1;
                        cCharAt = strZzd.charAt(i56);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i57 |= (cCharAt & 8191) << i58;
                        i58 += 13;
                        i56 = i7;
                    }
                    iCharAt9 = i57 | (cCharAt << i58);
                    i56 = i7;
                }
                int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
                int i59 = (iCharAt4 << 1) + iCharAt5;
                i2 = iCharAt4;
                i3 = iCharAt9;
                i32 = i56;
                i4 = iCharAt7;
                i5 = iCharAt6;
                i6 = i59;
                iArr = iArr2;
            }
            Unsafe unsafe = zzb;
            Object[] objArrZze = zzlsVar2.zze();
            Class<?> cls2 = zzlsVar2.zza().getClass();
            int[] iArr3 = new int[iCharAt * 3];
            Object[] objArr = new Object[iCharAt << 1];
            int i60 = i3 + iCharAt2;
            int i61 = i3;
            int i62 = i60;
            int i63 = 0;
            int i64 = 0;
            while (i32 < length) {
                int i65 = i32 + 1;
                int iCharAt10 = strZzd.charAt(i32);
                if (iCharAt10 >= c) {
                    int i66 = iCharAt10 & 8191;
                    int i67 = i65;
                    int i68 = 13;
                    while (true) {
                        i29 = i67 + 1;
                        cCharAt12 = strZzd.charAt(i67);
                        if (cCharAt12 < c) {
                            break;
                        }
                        i66 |= (cCharAt12 & 8191) << i68;
                        i68 += 13;
                        i67 = i29;
                    }
                    iCharAt10 = i66 | (cCharAt12 << i68);
                    i15 = i29;
                } else {
                    i15 = i65;
                }
                int i69 = i15 + 1;
                int iCharAt11 = strZzd.charAt(i15);
                if (iCharAt11 >= c) {
                    int i70 = iCharAt11 & 8191;
                    int i71 = i69;
                    int i72 = 13;
                    while (true) {
                        i28 = i71 + 1;
                        cCharAt11 = strZzd.charAt(i71);
                        i16 = length;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i70 |= (cCharAt11 & 8191) << i72;
                        i72 += 13;
                        i71 = i28;
                        length = i16;
                    }
                    iCharAt11 = i70 | (cCharAt11 << i72);
                    i17 = i28;
                } else {
                    i16 = length;
                    i17 = i69;
                }
                int i73 = iCharAt11 & 255;
                int i74 = i4;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i64] = i63;
                    i64++;
                }
                int i75 = i5;
                if (i73 >= 51) {
                    int i76 = i17 + 1;
                    int iCharAt12 = strZzd.charAt(i17);
                    char c2 = 55296;
                    if (iCharAt12 >= 55296) {
                        int i77 = iCharAt12 & 8191;
                        int i78 = 13;
                        while (true) {
                            i27 = i76 + 1;
                            cCharAt10 = strZzd.charAt(i76);
                            if (cCharAt10 < c2) {
                                break;
                            }
                            i77 |= (cCharAt10 & 8191) << i78;
                            i78 += 13;
                            i76 = i27;
                            c2 = 55296;
                        }
                        iCharAt12 = i77 | (cCharAt10 << i78);
                        i76 = i27;
                    }
                    int i79 = i73 - 51;
                    int i80 = i76;
                    if (i79 == 9 || i79 == 17) {
                        i25 = 1;
                        i26 = i6 + 1;
                        objArr[((i63 / 3) << 1) + 1] = objArrZze[i6];
                    } else if (i79 == 12 && (zzlsVar2.zzb().equals(zzln.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i25 = 1;
                        i26 = i6 + 1;
                        objArr[((i63 / 3) << 1) + 1] = objArrZze[i6];
                    } else {
                        i25 = 1;
                        int i81 = iCharAt12 << i25;
                        obj = objArrZze[i81];
                        if (!(obj instanceof Field)) {
                            fieldZza2 = (Field) obj;
                        } else {
                            fieldZza2 = zza(cls2, (String) obj);
                            objArrZze[i81] = fieldZza2;
                        }
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                        int i82 = i81 + 1;
                        obj2 = objArrZze[i82];
                        int i83 = i6;
                        if (!(obj2 instanceof Field)) {
                            fieldZza3 = (Field) obj2;
                        } else {
                            fieldZza3 = zza(cls2, (String) obj2);
                            objArrZze[i82] = fieldZza3;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                        str = strZzd;
                        iObjectFieldOffset = iObjectFieldOffset3;
                        i20 = i83;
                        i22 = 0;
                        zzlsVar = zzlsVar2;
                        i18 = iCharAt10;
                        i21 = i80;
                    }
                    i6 = i26;
                    int i812 = iCharAt12 << i25;
                    obj = objArrZze[i812];
                    if (!(obj instanceof Field)) {
                    }
                    int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i822 = i812 + 1;
                    obj2 = objArrZze[i822];
                    int i832 = i6;
                    if (!(obj2 instanceof Field)) {
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    str = strZzd;
                    iObjectFieldOffset = iObjectFieldOffset32;
                    i20 = i832;
                    i22 = 0;
                    zzlsVar = zzlsVar2;
                    i18 = iCharAt10;
                    i21 = i80;
                } else {
                    int i84 = i6 + 1;
                    Field fieldZza4 = zza(cls2, (String) objArrZze[i6]);
                    i18 = iCharAt10;
                    if (i73 == 9 || i73 == 17) {
                        zzlsVar = zzlsVar2;
                        objArr[((i63 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i73 == 27 || i73 == 49) {
                            zzlsVar = zzlsVar2;
                            i24 = i6 + 2;
                            objArr[((i63 / 3) << 1) + 1] = objArrZze[i84];
                        } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                            zzlsVar = zzlsVar2;
                            if (zzlsVar2.zzb() == zzln.PROTO2 || (iCharAt11 & 2048) != 0) {
                                i24 = i6 + 2;
                                objArr[((i63 / 3) << 1) + 1] = objArrZze[i84];
                            }
                        } else if (i73 == 50) {
                            int i85 = i61 + 1;
                            iArr[i61] = i63;
                            int i86 = (i63 / 3) << 1;
                            int i87 = i6 + 2;
                            objArr[i86] = objArrZze[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i84 = i6 + 3;
                                objArr[i86 + 1] = objArrZze[i87];
                                zzlsVar = zzlsVar2;
                                i61 = i85;
                            } else {
                                i61 = i85;
                                zzlsVar = zzlsVar2;
                                i19 = i87;
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                                if ((iCharAt11 & 4096) == 0 || i73 > 17) {
                                    i20 = i19;
                                    str = strZzd;
                                    iObjectFieldOffset2 = 1048575;
                                    i21 = i17;
                                    i22 = 0;
                                } else {
                                    i21 = i17 + 1;
                                    int iCharAt13 = strZzd.charAt(i17);
                                    if (iCharAt13 >= 55296) {
                                        int i88 = iCharAt13 & 8191;
                                        int i89 = 13;
                                        while (true) {
                                            i23 = i21 + 1;
                                            cCharAt9 = strZzd.charAt(i21);
                                            if (cCharAt9 < 55296) {
                                                break;
                                            }
                                            i88 |= (cCharAt9 & 8191) << i89;
                                            i89 += 13;
                                            i21 = i23;
                                        }
                                        iCharAt13 = i88 | (cCharAt9 << i89);
                                        i21 = i23;
                                    }
                                    int i90 = (i2 << 1) + (iCharAt13 / 32);
                                    Object obj3 = objArrZze[i90];
                                    if (obj3 instanceof Field) {
                                        fieldZza = (Field) obj3;
                                    } else {
                                        fieldZza = zza(cls2, (String) obj3);
                                        objArrZze[i90] = fieldZza;
                                    }
                                    i20 = i19;
                                    str = strZzd;
                                    i22 = iCharAt13 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                                }
                                if (i73 >= 18 && i73 <= 49) {
                                    iArr[i62] = iObjectFieldOffset;
                                    i62++;
                                }
                            }
                        } else {
                            zzlsVar = zzlsVar2;
                        }
                        i19 = i24;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                        if ((iCharAt11 & 4096) == 0) {
                            i20 = i19;
                            str = strZzd;
                            iObjectFieldOffset2 = 1048575;
                            i21 = i17;
                            i22 = 0;
                            if (i73 >= 18) {
                                iArr[i62] = iObjectFieldOffset;
                                i62++;
                            }
                        }
                    }
                    i19 = i84;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt11 & 4096) == 0) {
                    }
                }
                int i91 = i63 + 1;
                iArr3[i63] = i18;
                int i92 = i63 + 2;
                Class<?> cls3 = cls2;
                int i93 = i21;
                iArr3[i91] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i73 << 20) | iObjectFieldOffset;
                i63 += 3;
                iArr3[i92] = (i22 << 20) | iObjectFieldOffset2;
                strZzd = str;
                i4 = i74;
                i6 = i20;
                zzlsVar2 = zzlsVar;
                length = i16;
                i5 = i75;
                cls2 = cls3;
                i32 = i93;
                c = 55296;
            }
            return new zzlg<>(iArr3, objArr, i5, i4, zzlsVar2.zza(), false, iArr, i3, i60, zzlkVar, zzkmVar, zzmkVar, zzjiVar, zzkvVar);
        }
        throw new NoSuchMethodError();
    }

    private final zzlu zze(int i) {
        int i2 = (i / 3) << 1;
        zzlu zzluVar = (zzlu) this.zzd[i2];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zzluVarZza = zzlq.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzluVarZza;
        return zzluVarZza;
    }

    public static zzmj zzc(Object obj) {
        zzjt zzjtVar = (zzjt) obj;
        zzmj zzmjVar = zzjtVar.zzb;
        if (zzmjVar != zzmj.zzc()) {
            return zzmjVar;
        }
        zzmj zzmjVarZzd = zzmj.zzd();
        zzjtVar.zzb = zzmjVarZzd;
        return zzmjVarZzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzmk<UT, UB> zzmkVar, Object obj2) {
        zzjx zzjxVarZzd;
        int i2 = this.zzc[i];
        Object objZze = zzml.zze(obj, zzc(i) & 1048575);
        return (objZze == null || (zzjxVarZzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(objZze), zzjxVarZzd, (zzjx) ub, (zzmk<UT, zzjx>) zzmkVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar, Object obj) {
        zzkt<?, ?> zzktVarZza = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjxVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmkVar.zzc(obj);
                }
                zzit zzitVarZzc = zzik.zzc(zzku.zza(zzktVarZza, next.getKey(), next.getValue()));
                try {
                    zzku.zza(zzitVarZzc.zzb(), zzktVarZza, next.getKey(), next.getValue());
                    zzmkVar.zza((zzmk<UT, UB>) ub, i2, zzitVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzlu zzluVarZze = zze(i);
        long jZzc = zzc(i) & 1048575;
        if (!zzc((zzlg<T>) t, i)) {
            return zzluVarZze.zza();
        }
        Object object = zzb.getObject(t, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzluVarZze.zza();
        if (object != null) {
            zzluVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzlu zzluVarZze = zze(i2);
        if (!zzc((zzlg<T>) t, i, i2)) {
            return zzluVarZze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzluVarZze.zza();
        if (object != null) {
            zzluVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private zzlg(int[] iArr, Object[] objArr, int i, int i2, zzlc zzlcVar, boolean z, int[] iArr2, int i3, int i4, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzlcVar instanceof zzjt;
        this.zzh = zzjiVar != null && zzjiVar.zza(zzlcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzlkVar;
        this.zzo = zzkmVar;
        this.zzp = zzmkVar;
        this.zzq = zzjiVar;
        this.zzg = zzlcVar;
        this.zzr = zzkvVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006d  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(T t) {
        if (zzg(t)) {
            if (t instanceof zzjt) {
                zzjt zzjtVar = (zzjt) t;
                zzjtVar.zzc(Integer.MAX_VALUE);
                zzjtVar.zza = 0;
                zzjtVar.zzcm();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzc = zzc(i);
                long j = 1048575 & iZzc;
                int i2 = (iZzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 == 60 || i2 == 68) {
                        if (zzc((zzlg<T>) t, this.zzc[i], i)) {
                            zze(i).zzd(zzb.getObject(t, j));
                        }
                    } else {
                        switch (i2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzo.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                } else if (zzc((zzlg<T>) t, i)) {
                    zze(i).zzd(zzb.getObject(t, j));
                }
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzc = zzc(i);
            long j = 1048575 & iZzc;
            int i2 = this.zzc[i];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza(t, j, zzml.zza(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzb(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzd(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzd(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzc(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzd(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzc(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zzc(t, j, zzml.zzh(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza(t, j, zzml.zze(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza(t, j, zzml.zze(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzc(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzc(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzc(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzd(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzc(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlg<T>) t2, i)) {
                        zzml.zza((Object) t, j, zzml.zzd(t2, j));
                        zzb((zzlg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzlw.zza(this.zzr, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzlg<T>) t2, i2, i)) {
                        zzml.zza(t, j, zzml.zze(t2, j));
                        zzb((zzlg<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzlg<T>) t2, i2, i)) {
                        zzml.zza(t, j, zzml.zze(t2, j));
                        zzb((zzlg<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzlw.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzlw.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:342:0x00c5, B:347:0x00d3, B:459:0x062b, B:461:0x0630, B:462:0x0635, B:358:0x00ff, B:360:0x0114, B:361:0x0125, B:362:0x0136, B:363:0x0147, B:364:0x0158, B:366:0x0162, B:369:0x0169, B:370:0x016e, B:371:0x017b, B:372:0x018c, B:373:0x019a, B:374:0x01ac, B:375:0x01b4, B:376:0x01c6, B:377:0x01d8, B:378:0x01ea, B:379:0x01fc, B:380:0x020e, B:381:0x0220, B:382:0x0232, B:383:0x0244, B:385:0x0254, B:389:0x0275, B:386:0x025e, B:388:0x0266, B:390:0x0286, B:391:0x0298, B:392:0x02a6, B:393:0x02b4, B:394:0x02c2), top: B:487:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0665 A[LOOP:3: B:474:0x0661->B:476:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x063b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzlr] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzlr zzlrVar, zzjg zzjgVar) throws Throwable {
        zzmk zzmkVar;
        T t2;
        int i;
        zzmk zzmkVar2;
        T t3;
        Object obj;
        zzji<?> zzjiVar;
        zzjg zzjgVar2;
        Object obj2;
        T t4 = t;
        zzjg zzjgVar3 = zzjgVar;
        zzjgVar.getClass();
        zzf(t);
        zzmk zzmkVar3 = this.zzp;
        zzji<?> zzjiVar2 = this.zzq;
        Object objZza = null;
        zzjm zzjmVar = null;
        while (true) {
            try {
                int iZzc = zzlrVar.zzc();
                int iZza = zza(iZzc);
                if (iZza < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                            objZza = zza((Object) t, this.zzk[i2], (int) objZza, (zzmk<UT, int>) zzmkVar3, (Object) t);
                        }
                        if (objZza != null) {
                            zzmkVar3.zzb((Object) t4, (T) objZza);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZza2 = !this.zzh ? null : zzjiVar2.zza(zzjgVar3, this.zzg, iZzc);
                        if (objZza2 != null) {
                            zzjm zzjmVarZzb = zzjmVar == null ? zzjiVar2.zzb(t4) : zzjmVar;
                            zzmkVar2 = zzmkVar3;
                            t3 = t4;
                            try {
                                objZza = zzjiVar2.zza(t, zzlrVar, objZza2, zzjgVar, zzjmVarZzb, objZza, zzmkVar2);
                                zzjmVar = zzjmVarZzb;
                            } catch (Throwable th) {
                                th = th;
                                t2 = t3;
                                zzmkVar = zzmkVar2;
                                while (i < this.zzm) {
                                }
                                if (objZza != null) {
                                }
                                throw th;
                            }
                        } else {
                            zzmkVar2 = zzmkVar3;
                            t3 = t4;
                            zzmkVar2.zza((zzlr) zzlrVar);
                            if (objZza == null) {
                                objZza = zzmkVar2.zzc(t3);
                            }
                            if (!zzmkVar2.zza((zzmk) objZza, (zzlr) zzlrVar, 0)) {
                                int i3 = this.zzl;
                                while (i3 < this.zzm) {
                                    zzmk zzmkVar4 = zzmkVar2;
                                    objZza = zza((Object) t, this.zzk[i3], (int) objZza, (zzmk<UT, int>) zzmkVar4, (Object) t);
                                    i3++;
                                    t3 = t3;
                                    zzmkVar2 = zzmkVar4;
                                }
                                Object obj3 = t3;
                                zzmk zzmkVar5 = zzmkVar2;
                                if (objZza != null) {
                                    zzmkVar5.zzb(obj3, objZza);
                                    return;
                                }
                                return;
                            }
                        }
                        t4 = t3;
                        zzmkVar3 = zzmkVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        zzmkVar = zzmkVar3;
                        t2 = t4;
                    }
                } else {
                    zzmkVar = zzmkVar3;
                    t2 = t4;
                    try {
                        int iZzc2 = zzc(iZza);
                        switch ((267386880 & iZzc2) >>> 20) {
                            case 0:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza(t2, iZzc2 & 1048575, zzlrVar.zza());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 1:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzb());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 2:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzl());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 3:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzo());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 4:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzg());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 5:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzk());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 6:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzf());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 7:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zzc(t2, iZzc2 & 1048575, zzlrVar.zzs());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 8:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zza((Object) t2, iZzc2, (zzlr) zzlrVar);
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 9:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlc zzlcVar = (zzlc) zza((zzlg<T>) t2, iZza);
                                zzlrVar.zzb(zzlcVar, zze(iZza), zzjgVar2);
                                zza((zzlg<T>) t2, iZza, zzlcVar);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 10:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza(t2, iZzc2 & 1048575, zzlrVar.zzp());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 11:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzj());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 12:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                int iZze = zzlrVar.zze();
                                zzjx zzjxVarZzd = zzd(iZza);
                                if (zzjxVarZzd != null && !zzjxVarZzd.zza(iZze)) {
                                    objZza = zzlw.zza(t2, iZzc, iZze, obj, zzmkVar);
                                    zzmkVar3 = zzmkVar;
                                    zzjiVar2 = zzjiVar;
                                    zzjgVar3 = zzjgVar2;
                                    t4 = t2;
                                }
                                zzml.zza((Object) t2, iZzc2 & 1048575, iZze);
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                                break;
                            case 13:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzh());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 14:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzm());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 15:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzi());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 16:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzml.zza((Object) t2, iZzc2 & 1048575, zzlrVar.zzn());
                                zzb((zzlg<T>) t2, iZza);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 17:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlc zzlcVar2 = (zzlc) zza((zzlg<T>) t2, iZza);
                                zzlrVar.zza(zzlcVar2, zze(iZza), zzjgVar2);
                                zza((zzlg<T>) t2, iZza, zzlcVar2);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 18:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzc(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 19:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzg(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 20:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzi(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 21:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzq(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 22:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzh(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 23:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzf(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 24:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zze(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 25:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zza(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 26:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                if (zzg(iZzc2)) {
                                    zzlrVar.zzo(this.zzo.zza(t2, iZzc2 & 1048575));
                                } else {
                                    zzlrVar.zzn(this.zzo.zza(t2, iZzc2 & 1048575));
                                }
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 27:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzb(this.zzo.zza(t2, iZzc2 & 1048575), zze(iZza), zzjgVar2);
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 28:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzb(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 29:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzp(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 30:
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                List listZza = this.zzo.zza(t2, iZzc2 & 1048575);
                                zzlrVar.zzd(listZza);
                                objZza = zzlw.zza(t, iZzc, listZza, zzd(iZza), objZza, zzmkVar);
                                zzmkVar3 = zzmkVar;
                                zzjiVar2 = zzjiVar;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                            case 31:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzj(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 32:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzk(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 33:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzl(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 34:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzm(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 35:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzc(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 36:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzg(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 37:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzi(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 38:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzq(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 39:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzh(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 40:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzf(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 41:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zze(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 42:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zza(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 43:
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzlrVar.zzp(this.zzo.zza(t2, iZzc2 & 1048575));
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 44:
                                List listZza2 = this.zzo.zza(t2, iZzc2 & 1048575);
                                zzlrVar.zzd(listZza2);
                                obj2 = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                try {
                                    objZza = zzlw.zza(t, iZzc, listZza2, zzd(iZza), obj2, zzmkVar);
                                } catch (zzke unused) {
                                    objZza = obj2;
                                    zzmkVar.zza((zzlr) zzlrVar);
                                    if (objZza == null) {
                                    }
                                    if (!zzmkVar.zza((zzmk) objZza, (zzlr) zzlrVar, 0)) {
                                    }
                                    zzmkVar3 = zzmkVar;
                                    zzjiVar2 = zzjiVar;
                                    zzjgVar3 = zzjgVar2;
                                    t4 = t2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    objZza = obj2;
                                    while (i < this.zzm) {
                                    }
                                    if (objZza != null) {
                                    }
                                    throw th;
                                }
                                zzmkVar3 = zzmkVar;
                                zzjiVar2 = zzjiVar;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                break;
                            case 45:
                                zzlrVar.zzj(this.zzo.zza(t2, iZzc2 & 1048575));
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 46:
                                zzlrVar.zzk(this.zzo.zza(t2, iZzc2 & 1048575));
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 47:
                                zzlrVar.zzl(this.zzo.zza(t2, iZzc2 & 1048575));
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 48:
                                zzlrVar.zzm(this.zzo.zza(t2, iZzc2 & 1048575));
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 49:
                                zzlrVar.zza(this.zzo.zza(t2, iZzc2 & 1048575), zze(iZza), zzjgVar3);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 50:
                                Object objZzf = zzf(iZza);
                                long jZzc = zzc(iZza) & 1048575;
                                Object objZze = zzml.zze(t2, jZzc);
                                if (objZze == null) {
                                    objZze = this.zzr.zzb(objZzf);
                                    zzml.zza(t2, jZzc, objZze);
                                } else if (this.zzr.zzf(objZze)) {
                                    Object objZzb = this.zzr.zzb(objZzf);
                                    this.zzr.zza(objZzb, objZze);
                                    zzml.zza(t2, jZzc, objZzb);
                                    objZze = objZzb;
                                }
                                zzlrVar.zza(this.zzr.zze(objZze), this.zzr.zza(objZzf), zzjgVar3);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 51:
                                zzml.zza(t2, iZzc2 & 1048575, Double.valueOf(zzlrVar.zza()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 52:
                                zzml.zza(t2, iZzc2 & 1048575, Float.valueOf(zzlrVar.zzb()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 53:
                                zzml.zza(t2, iZzc2 & 1048575, Long.valueOf(zzlrVar.zzl()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 54:
                                zzml.zza(t2, iZzc2 & 1048575, Long.valueOf(zzlrVar.zzo()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 55:
                                zzml.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzlrVar.zzg()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 56:
                                zzml.zza(t2, iZzc2 & 1048575, Long.valueOf(zzlrVar.zzk()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 57:
                                zzml.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzlrVar.zzf()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 58:
                                zzml.zza(t2, iZzc2 & 1048575, Boolean.valueOf(zzlrVar.zzs()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 59:
                                zza((Object) t2, iZzc2, (zzlr) zzlrVar);
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 60:
                                zzlc zzlcVar3 = (zzlc) zza((zzlg<T>) t2, iZzc, iZza);
                                zzlrVar.zzb(zzlcVar3, zze(iZza), zzjgVar3);
                                zza((zzlg<T>) t2, iZzc, iZza, zzlcVar3);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 61:
                                zzml.zza(t2, iZzc2 & 1048575, zzlrVar.zzp());
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 62:
                                zzml.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzlrVar.zzj()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 63:
                                int iZze2 = zzlrVar.zze();
                                zzjx zzjxVarZzd2 = zzd(iZza);
                                if (zzjxVarZzd2 != null && !zzjxVarZzd2.zza(iZze2)) {
                                    objZza = zzlw.zza(t2, iZzc, iZze2, objZza, zzmkVar);
                                    t4 = t2;
                                    zzmkVar3 = zzmkVar;
                                }
                                zzml.zza(t2, iZzc2 & 1048575, Integer.valueOf(iZze2));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                                break;
                            case 64:
                                zzml.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzlrVar.zzh()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 65:
                                zzml.zza(t2, iZzc2 & 1048575, Long.valueOf(zzlrVar.zzm()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 66:
                                zzml.zza(t2, iZzc2 & 1048575, Integer.valueOf(zzlrVar.zzi()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 67:
                                zzml.zza(t2, iZzc2 & 1048575, Long.valueOf(zzlrVar.zzn()));
                                zzb((zzlg<T>) t2, iZzc, iZza);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            case 68:
                                zzlc zzlcVar4 = (zzlc) zza((zzlg<T>) t2, iZzc, iZza);
                                zzlrVar.zza(zzlcVar4, zze(iZza), zzjgVar3);
                                zza((zzlg<T>) t2, iZzc, iZza, zzlcVar4);
                                obj = objZza;
                                zzjiVar = zzjiVar2;
                                zzjgVar2 = zzjgVar3;
                                zzjiVar2 = zzjiVar;
                                objZza = obj;
                                zzjgVar3 = zzjgVar2;
                                t4 = t2;
                                zzmkVar3 = zzmkVar;
                            default:
                                if (objZza == null) {
                                    try {
                                        try {
                                            objZza = zzmkVar.zzc(t2);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            while (i < this.zzm) {
                                            }
                                            if (objZza != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (zzke unused2) {
                                        obj2 = objZza;
                                        zzjiVar = zzjiVar2;
                                        zzjgVar2 = zzjgVar3;
                                        objZza = obj2;
                                        zzmkVar.zza((zzlr) zzlrVar);
                                        if (objZza == null) {
                                        }
                                        if (!zzmkVar.zza((zzmk) objZza, (zzlr) zzlrVar, 0)) {
                                        }
                                        zzmkVar3 = zzmkVar;
                                        zzjiVar2 = zzjiVar;
                                        zzjgVar3 = zzjgVar2;
                                        t4 = t2;
                                    }
                                }
                                try {
                                    if (!zzmkVar.zza((zzmk) objZza, (zzlr) zzlrVar, 0)) {
                                        for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                            objZza = zza((Object) t, this.zzk[i4], (int) objZza, (zzmk<UT, int>) zzmkVar, (Object) t);
                                        }
                                        if (objZza != null) {
                                            zzmkVar.zzb((Object) t2, (T) objZza);
                                            return;
                                        }
                                        return;
                                    }
                                    t4 = t2;
                                    zzmkVar3 = zzmkVar;
                                } catch (zzke unused3) {
                                    zzjiVar = zzjiVar2;
                                    zzjgVar2 = zzjgVar3;
                                    zzmkVar.zza((zzlr) zzlrVar);
                                    if (objZza == null) {
                                        objZza = zzmkVar.zzc(t2);
                                    }
                                    if (!zzmkVar.zza((zzmk) objZza, (zzlr) zzlrVar, 0)) {
                                        for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                            objZza = zza((Object) t, this.zzk[i5], (int) objZza, (zzmk<UT, int>) zzmkVar, (Object) t);
                                        }
                                        if (objZza != null) {
                                            zzmkVar.zzb((Object) t2, (T) objZza);
                                            return;
                                        }
                                        return;
                                    }
                                    zzmkVar3 = zzmkVar;
                                    zzjiVar2 = zzjiVar;
                                    zzjgVar3 = zzjgVar2;
                                    t4 = t2;
                                }
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        for (i = this.zzl; i < this.zzm; i++) {
                            objZza = zza((Object) t, this.zzk[i], (int) objZza, (zzmk<UT, int>) zzmkVar, (Object) t);
                        }
                        if (objZza != null) {
                            zzmkVar.zzb((Object) t2, (T) objZza);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                zzmkVar = zzmkVar3;
                t2 = t4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t, byte[] bArr, int i, int i2, zzij zzijVar) throws IOException {
        zza((zzlg<T>) t, bArr, i, i2, 0, zzijVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzlg<T>) t2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzlu zzluVarZze = zze(i);
            if (!zzc((zzlg<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzluVarZze.zza();
                    zzluVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzlg<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzluVarZze.zza();
                zzluVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzluVarZze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzlg<T>) t2, i2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzlu zzluVarZze = zze(i);
            if (!zzc((zzlg<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzluVarZze.zza();
                    zzluVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzlg<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzluVarZze.zza();
                zzluVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzluVarZze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzlr zzlrVar) throws IOException {
        if (zzg(i)) {
            zzml.zza(obj, i & 1048575, zzlrVar.zzr());
        } else if (this.zzi) {
            zzml.zza(obj, i & 1048575, zzlrVar.zzq());
        } else {
            zzml.zza(obj, i & 1048575, zzlrVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int iZzb = zzb(i);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzml.zza((Object) t, j, (1 << (iZzb >>> 20)) | zzml.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzml.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzlg<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzlg<T>) t, i, i2);
    }

    private final <K, V> void zza(zznb zznbVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznbVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zznb zznbVar) throws IOException {
        if (obj instanceof String) {
            zznbVar.zza(i, (String) obj);
        } else {
            zznbVar.zza(i, (zzik) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x054a  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zznb zznbVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        Iterator it2;
        int i;
        Map.Entry<?, ?> entry2;
        int i2;
        int i3;
        int i4;
        Map.Entry<?, ?> entry3;
        int i5;
        boolean z;
        int i6;
        Unsafe unsafe;
        boolean z2;
        Iterator itZzc;
        Map.Entry<?, ?> entry4;
        zznb zznbVar2 = zznbVar;
        int i7 = 267386880;
        int i8 = 1048575;
        if (zznbVar.zza() == 2) {
            zza(this.zzp, t, zznbVar2);
            if (this.zzh) {
                zzjm<T> zzjmVarZza = this.zzq.zza(t);
                if (zzjmVarZza.zza.isEmpty()) {
                    itZzc = null;
                    entry4 = null;
                } else {
                    itZzc = zzjmVarZza.zzc();
                    entry4 = (Map.Entry) itZzc.next();
                }
            }
            for (int length = this.zzc.length - 3; length >= 0; length -= 3) {
                int iZzc = zzc(length);
                int i9 = this.zzc[length];
                while (entry4 != null && this.zzq.zza(entry4) > i9) {
                    this.zzq.zza(zznbVar2, entry4);
                    entry4 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
                }
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, zzml.zza(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, zzml.zzb(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzb(i9, zzml.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zze(i9, zzml.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzc(i9, zzml.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, zzml.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzb(i9, zzml.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, zzml.zzh(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzc((zzlg<T>) t, length)) {
                            zza(i9, zzml.zze(t, iZzc & 1048575), zznbVar2);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzb(i9, zzml.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, (zzik) zzml.zze(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzf(i9, zzml.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, zzml.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzd(i9, zzml.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzc(i9, zzml.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zze(i9, zzml.zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zzd(i9, zzml.zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzc((zzlg<T>) t, length)) {
                            zznbVar2.zza(i9, zzml.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlw.zzb(this.zzc[length], (List<Double>) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 19:
                        zzlw.zzf(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 20:
                        zzlw.zzh(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 21:
                        zzlw.zzn(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 22:
                        zzlw.zzg(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 23:
                        zzlw.zze(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 24:
                        zzlw.zzd(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 25:
                        zzlw.zza(this.zzc[length], (List<Boolean>) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 26:
                        zzlw.zzb(this.zzc[length], (List<String>) zzml.zze(t, iZzc & 1048575), zznbVar2);
                        break;
                    case 27:
                        zzlw.zzb(this.zzc[length], (List<?>) zzml.zze(t, iZzc & 1048575), zznbVar2, (zzlu<?>) zze(length));
                        break;
                    case 28:
                        zzlw.zza(this.zzc[length], (List<zzik>) zzml.zze(t, iZzc & 1048575), zznbVar2);
                        break;
                    case 29:
                        zzlw.zzm(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 30:
                        zzlw.zzc(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 31:
                        zzlw.zzi(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 32:
                        zzlw.zzj(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 33:
                        zzlw.zzk(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 34:
                        zzlw.zzl(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, false);
                        break;
                    case 35:
                        zzlw.zzb(this.zzc[length], (List<Double>) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 36:
                        zzlw.zzf(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 37:
                        zzlw.zzh(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 38:
                        zzlw.zzn(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 39:
                        zzlw.zzg(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 40:
                        zzlw.zze(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 41:
                        zzlw.zzd(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 42:
                        zzlw.zza(this.zzc[length], (List<Boolean>) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 43:
                        zzlw.zzm(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 44:
                        zzlw.zzc(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 45:
                        zzlw.zzi(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 46:
                        zzlw.zzj(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 47:
                        zzlw.zzk(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 48:
                        zzlw.zzl(this.zzc[length], (List) zzml.zze(t, iZzc & 1048575), zznbVar2, true);
                        break;
                    case 49:
                        zzlw.zza(this.zzc[length], (List<?>) zzml.zze(t, iZzc & 1048575), zznbVar2, (zzlu<?>) zze(length));
                        break;
                    case 50:
                        zza(zznbVar2, i9, zzml.zze(t, iZzc & 1048575), length);
                        break;
                    case 51:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, zza(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, zzb(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzb(i9, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zze(i9, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzc(i9, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzb(i9, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, zze(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zza(i9, zzml.zze(t, iZzc & 1048575), zznbVar2);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzb(i9, zzml.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, (zzik) zzml.zze(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzf(i9, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzd(i9, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzc(i9, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zze(i9, zzc(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zzd(i9, zzd(t, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzc((zzlg<T>) t, i9, length)) {
                            zznbVar2.zza(i9, zzml.zze(t, iZzc & 1048575), zze(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            while (entry4 != null) {
                this.zzq.zza(zznbVar2, entry4);
                entry4 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
            }
            return;
        }
        if (this.zzh) {
            zzjm<T> zzjmVarZza2 = this.zzq.zza(t);
            if (zzjmVarZza2.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzd = zzjmVarZza2.zzd();
                entry = (Map.Entry) itZzd.next();
                it = itZzd;
            }
        }
        int length2 = this.zzc.length;
        Unsafe unsafe2 = zzb;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < length2) {
            int iZzc2 = zzc(i11);
            int[] iArr = this.zzc;
            int i13 = iArr[i11];
            int i14 = (iZzc2 & i7) >>> 20;
            if (i14 <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i8;
                if (i16 != i12) {
                    if (i16 == i8) {
                        it2 = it;
                        i10 = 0;
                    } else {
                        it2 = it;
                        i10 = unsafe2.getInt(t, i16);
                    }
                    i12 = i16;
                } else {
                    it2 = it;
                }
                entry2 = entry;
                i2 = i10;
                i3 = 1 << (i15 >>> 20);
                i = i12;
            } else {
                it2 = it;
                i = i12;
                entry2 = entry;
                i2 = i10;
                i3 = 0;
            }
            while (entry2 != null && this.zzq.zza(entry2) <= i13) {
                this.zzq.zza(zznbVar2, entry2);
                entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
            }
            long j = iZzc2 & 1048575;
            switch (i14) {
                case 0:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zza(i13, zzml.zza(t, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zza(i13, zzml.zzb(t, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzb(i13, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zze(i13, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzc(i13, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zza(i13, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzb(i13, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zza(i13, zzml.zzh(t, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zza(i13, unsafe.getObject(t, j), zznbVar2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzb(i13, unsafe.getObject(t, j), zze(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zza(i13, (zzik) unsafe.getObject(t, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzf(i13, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zza(i13, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzd(i13, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zzc(i13, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i6, i4, i2, i3)) {
                        zznbVar2.zze(i13, unsafe.getInt(t, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    i4 = i;
                    if (zza((zzlg<T>) t, i6, i, i2, i3)) {
                        zznbVar2.zzd(i13, unsafe.getLong(t, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    z = false;
                    entry3 = entry2;
                    i6 = i11;
                    i5 = length2;
                    unsafe = unsafe2;
                    if (zza((zzlg<T>) t, i11, i, i2, i3)) {
                        zznbVar2 = zznbVar;
                        zznbVar2.zza(i13, unsafe.getObject(t, j), zze(i6));
                    } else {
                        zznbVar2 = zznbVar;
                    }
                    i4 = i;
                    break;
                case 18:
                    z2 = false;
                    zzlw.zzb(this.zzc[i11], (List<Double>) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 19:
                    z2 = false;
                    zzlw.zzf(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 20:
                    z2 = false;
                    zzlw.zzh(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 21:
                    z2 = false;
                    zzlw.zzn(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 22:
                    z2 = false;
                    zzlw.zzg(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 23:
                    z2 = false;
                    zzlw.zze(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 24:
                    z2 = false;
                    zzlw.zzd(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 25:
                    z2 = false;
                    zzlw.zza(this.zzc[i11], (List<Boolean>) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 26:
                    zzlw.zzb(this.zzc[i11], (List<String>) unsafe2.getObject(t, j), zznbVar2);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 27:
                    zzlw.zzb(this.zzc[i11], (List<?>) unsafe2.getObject(t, j), zznbVar2, (zzlu<?>) zze(i11));
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 28:
                    zzlw.zza(this.zzc[i11], (List<zzik>) unsafe2.getObject(t, j), zznbVar2);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 29:
                    z2 = false;
                    zzlw.zzm(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 30:
                    z2 = false;
                    zzlw.zzc(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 31:
                    z2 = false;
                    zzlw.zzi(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 32:
                    z2 = false;
                    zzlw.zzj(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 33:
                    z2 = false;
                    zzlw.zzk(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 34:
                    z2 = false;
                    zzlw.zzl(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, false);
                    i4 = i;
                    entry3 = entry2;
                    z = z2;
                    i5 = length2;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 35:
                    zzlw.zzb(this.zzc[i11], (List<Double>) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 36:
                    zzlw.zzf(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 37:
                    zzlw.zzh(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 38:
                    zzlw.zzn(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 39:
                    zzlw.zzg(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 40:
                    zzlw.zze(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 41:
                    zzlw.zzd(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 42:
                    zzlw.zza(this.zzc[i11], (List<Boolean>) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 43:
                    zzlw.zzm(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 44:
                    zzlw.zzc(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 45:
                    zzlw.zzi(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 46:
                    zzlw.zzj(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 47:
                    zzlw.zzk(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 48:
                    zzlw.zzl(this.zzc[i11], (List) unsafe2.getObject(t, j), zznbVar2, true);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 49:
                    zzlw.zza(this.zzc[i11], (List<?>) unsafe2.getObject(t, j), zznbVar2, (zzlu<?>) zze(i11));
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 50:
                    zza(zznbVar2, i13, unsafe2.getObject(t, j), i11);
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, zza(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 52:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, zzb(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 53:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzb(i13, zzd(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 54:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zze(i13, zzd(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 55:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzc(i13, zzc(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 56:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, zzd(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 57:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzb(i13, zzc(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 58:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, zze(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 59:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zza(i13, unsafe2.getObject(t, j), zznbVar2);
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 60:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzb(i13, unsafe2.getObject(t, j), zze(i11));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 61:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, (zzik) unsafe2.getObject(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 62:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzf(i13, zzc(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 63:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, zzc(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 64:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzd(i13, zzc(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 65:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzc(i13, zzd(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 66:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zze(i13, zzc(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 67:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zzd(i13, zzd(t, j));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                case 68:
                    if (zzc((zzlg<T>) t, i13, i11)) {
                        zznbVar2.zza(i13, unsafe2.getObject(t, j), zze(i11));
                    }
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
                default:
                    i4 = i;
                    entry3 = entry2;
                    i5 = length2;
                    z = false;
                    i6 = i11;
                    unsafe = unsafe2;
                    break;
            }
            i11 = i6 + 3;
            i10 = i2;
            unsafe2 = unsafe;
            i8 = 1048575;
            it = it2;
            entry = entry3;
            length2 = i5;
            i12 = i4;
            i7 = 267386880;
        }
        Iterator it3 = it;
        while (entry != null) {
            this.zzq.zza(zznbVar2, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zza(this.zzp, t, zznbVar2);
    }

    private static <UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t, zznb zznbVar) throws IOException {
        zzmkVar.zzb((zzmk<UT, UB>) zzmkVar.zzd(t), zznbVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzlg<T>) t, i) == zzc((zzlg<T>) t2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x003a  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean zZza = true;
            if (i < length) {
                int iZzc = zzc(i);
                long j = iZzc & 1048575;
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || Double.doubleToLongBits(zzml.zza(t, j)) != Double.doubleToLongBits(zzml.zza(t2, j))) {
                            zZza = false;
                            break;
                        }
                        break;
                    case 1:
                        if (!zzc(t, t2, i) || Float.floatToIntBits(zzml.zzb(t, j)) != Float.floatToIntBits(zzml.zzb(t2, j))) {
                        }
                        break;
                    case 2:
                        if (!zzc(t, t2, i) || zzml.zzd(t, j) != zzml.zzd(t2, j)) {
                        }
                        break;
                    case 3:
                        if (!zzc(t, t2, i) || zzml.zzd(t, j) != zzml.zzd(t2, j)) {
                        }
                        break;
                    case 4:
                        if (!zzc(t, t2, i) || zzml.zzc(t, j) != zzml.zzc(t2, j)) {
                        }
                        break;
                    case 5:
                        if (!zzc(t, t2, i) || zzml.zzd(t, j) != zzml.zzd(t2, j)) {
                        }
                        break;
                    case 6:
                        if (!zzc(t, t2, i) || zzml.zzc(t, j) != zzml.zzc(t2, j)) {
                        }
                        break;
                    case 7:
                        if (!zzc(t, t2, i) || zzml.zzh(t, j) != zzml.zzh(t2, j)) {
                        }
                        break;
                    case 8:
                        if (!zzc(t, t2, i) || !zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j))) {
                        }
                        break;
                    case 9:
                        if (!zzc(t, t2, i) || !zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j))) {
                        }
                        break;
                    case 10:
                        if (!zzc(t, t2, i) || !zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j))) {
                        }
                        break;
                    case 11:
                        if (!zzc(t, t2, i) || zzml.zzc(t, j) != zzml.zzc(t2, j)) {
                        }
                        break;
                    case 12:
                        if (!zzc(t, t2, i) || zzml.zzc(t, j) != zzml.zzc(t2, j)) {
                        }
                        break;
                    case 13:
                        if (!zzc(t, t2, i) || zzml.zzc(t, j) != zzml.zzc(t2, j)) {
                        }
                        break;
                    case 14:
                        if (!zzc(t, t2, i) || zzml.zzd(t, j) != zzml.zzd(t2, j)) {
                        }
                        break;
                    case 15:
                        if (!zzc(t, t2, i) || zzml.zzc(t, j) != zzml.zzc(t2, j)) {
                        }
                        break;
                    case 16:
                        if (!zzc(t, t2, i) || zzml.zzd(t, j) != zzml.zzd(t2, j)) {
                        }
                        break;
                    case 17:
                        if (!zzc(t, t2, i) || !zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j))) {
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zZza = zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j));
                        break;
                    case 50:
                        zZza = zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long jZzb = zzb(i) & 1048575;
                        if (zzml.zzc(t, jZzb) != zzml.zzc(t2, jZzb) || !zzlw.zza(zzml.zze(t, j), zzml.zze(t2, j))) {
                        }
                        break;
                }
                if (!zZza) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzp.zzd(t).equals(this.zzp.zzd(t2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t).equals(this.zzq.zza(t2));
                }
                return true;
            }
        }
    }

    private final boolean zzc(T t, int i) {
        int iZzb = zzb(i);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzml.zzc(t, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i);
        long j2 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t, j2)) != 0;
            case 2:
                return zzml.zzd(t, j2) != 0;
            case 3:
                return zzml.zzd(t, j2) != 0;
            case 4:
                return zzml.zzc(t, j2) != 0;
            case 5:
                return zzml.zzd(t, j2) != 0;
            case 6:
                return zzml.zzc(t, j2) != 0;
            case 7:
                return zzml.zzh(t, j2);
            case 8:
                Object objZze = zzml.zze(t, j2);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzik) {
                    return !zzik.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zze(t, j2) != null;
            case 10:
                return !zzik.zza.equals(zzml.zze(t, j2));
            case 11:
                return zzml.zzc(t, j2) != 0;
            case 12:
                return zzml.zzc(t, j2) != 0;
            case 13:
                return zzml.zzc(t, j2) != 0;
            case 14:
                return zzml.zzd(t, j2) != 0;
            case 15:
                return zzml.zzc(t, j2) != 0;
            case 16:
                return zzml.zzd(t, j2) != 0;
            case 17:
                return zzml.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzlg<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzlu] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzlu] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int iZzc = zzc(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iZzc) != 0 && !zza((zzlg<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & iZzc) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza((zzlg<T>) t, i6, i, i2, i10) && !zza((Object) t, iZzc, zze(i6))) {
                    return false;
                }
            } else if (i11 == 27) {
                List list = (List) zzml.zze(t, iZzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? Zze = zze(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!Zze.zze(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (zzc((zzlg<T>) t, i7, i6) && !zza((Object) t, iZzc, zze(i6))) {
                    return false;
                }
            } else if (i11 != 49) {
                if (i11 != 50) {
                    continue;
                } else {
                    Map<?, ?> mapZzd = this.zzr.zzd(zzml.zze(t, iZzc & 1048575));
                    if (mapZzd.isEmpty()) {
                        continue;
                    } else if (this.zzr.zza(zzf(i6)).zzc.zzb() == zzmz.MESSAGE) {
                        ?? Zza = 0;
                        for (Object obj : mapZzd.values()) {
                            Zza = Zza;
                            if (Zza == 0) {
                                Zza = zzlq.zza().zza((Class) obj.getClass());
                            }
                            if (!Zza.zze(obj)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || this.zzq.zza(t).zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zze(zzml.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjt) {
            return ((zzjt) obj).zzco();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzml.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzml.zze(t, j)).booleanValue();
    }
}
