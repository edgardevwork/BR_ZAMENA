package com.google.android.gms.internal.play_billing;

import com.caverock.androidsvg.SVG;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes6.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i2, zzec zzecVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzfp.zzq(obj, j, (1 << (iZzp >>> 20)) | zzfp.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfp.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzfp.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j2)) != 0;
            case 2:
                return zzfp.zzd(obj, j2) != 0;
            case 3:
                return zzfp.zzd(obj, j2) != 0;
            case 4:
                return zzfp.zzc(obj, j2) != 0;
            case 5:
                return zzfp.zzd(obj, j2) != 0;
            case 6:
                return zzfp.zzc(obj, j2) != 0;
            case 7:
                return zzfp.zzw(obj, j2);
            case 8:
                Object objZzf = zzfp.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbq) {
                    return !zzbq.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j2) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j2));
            case 11:
                return zzfp.zzc(obj, j2) != 0;
            case 12:
                return zzfp.zzc(obj, j2) != 0;
            case 13:
                return zzfp.zzc(obj, j2) != 0;
            case 14:
                return zzfp.zzd(obj, j2) != 0;
            case 15:
                return zzfp.zzc(obj, j2) != 0;
            case 16:
                return zzfp.zzd(obj, j2) != 0;
            case 17:
                return zzfp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfp.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i, (String) obj);
        } else {
            zzfxVar.zzd(i, (zzbq) obj);
        }
    }

    public static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzfgVarZzf = zzfg.zzf();
        zzcsVar.zzc = zzfgVarZzf;
        return zzfgVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:349:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzef zzl(Class cls, zzdz zzdzVar, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
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
        zzen zzenVar;
        int iObjectFieldOffset;
        String str;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        Field fieldZzz;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzz2;
        Object obj2;
        Field fieldZzz3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        if (!(zzdzVar instanceof zzen)) {
            throw null;
        }
        zzen zzenVar2 = (zzen) zzdzVar;
        String strZzd = zzenVar2.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strZzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i32 = iCharAt3 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strZzd.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt3 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt4 = strZzd.charAt(i31);
            if (iCharAt4 >= 55296) {
                int i35 = iCharAt4 & 8191;
                int i36 = 13;
                while (true) {
                    i14 = i34 + 1;
                    cCharAt8 = strZzd.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i14;
                }
                iCharAt4 = i35 | (cCharAt8 << i36);
                i34 = i14;
            }
            int i37 = i34 + 1;
            int iCharAt5 = strZzd.charAt(i34);
            if (iCharAt5 >= 55296) {
                int i38 = iCharAt5 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    cCharAt7 = strZzd.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                iCharAt5 = i38 | (cCharAt7 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int iCharAt6 = strZzd.charAt(i37);
            if (iCharAt6 >= 55296) {
                int i41 = iCharAt6 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    cCharAt6 = strZzd.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                iCharAt6 = i41 | (cCharAt6 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strZzd.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    cCharAt5 = strZzd.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                iCharAt7 = i44 | (cCharAt5 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            iCharAt = strZzd.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    cCharAt4 = strZzd.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                iCharAt = i47 | (cCharAt4 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            iCharAt2 = strZzd.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    cCharAt3 = strZzd.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                iCharAt2 = i50 | (cCharAt3 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            int iCharAt8 = strZzd.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    cCharAt2 = strZzd.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                iCharAt8 = i53 | (cCharAt2 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int iCharAt9 = strZzd.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                iCharAt9 = i56 | (cCharAt << i57);
                i55 = i7;
            }
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i3 = iCharAt6;
            i4 = iCharAt9;
            i5 = iCharAt4;
            i6 = iCharAt7;
            i31 = i55;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzenVar2.zze();
        Class<?> cls2 = zzenVar2.zza().getClass();
        int i58 = i4 + iCharAt2;
        int i59 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i59];
        int i60 = 0;
        int i61 = 0;
        int i62 = i4;
        int i63 = i58;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = strZzd.charAt(i31);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = strZzd.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i15 = i28;
            } else {
                i15 = i64;
            }
            int i68 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strZzd.charAt(i70);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i16 = i68;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt11 & 2048;
            int i74 = length;
            if (i72 >= 51) {
                int i75 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i76 = 13;
                    int i77 = iCharAt12 & 8191;
                    int i78 = i75;
                    while (true) {
                        i26 = i78 + 1;
                        cCharAt10 = strZzd.charAt(i78);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i76;
                        i76 += 13;
                        i78 = i26;
                        c2 = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i76);
                    i24 = i26;
                } else {
                    i24 = i75;
                }
                int i79 = i24;
                int i80 = i72 - 51;
                i18 = i6;
                if (i80 == 9 || i80 == 17) {
                    i25 = i2 + 1;
                    int i81 = i61 / 3;
                    objArr[i81 + i81 + 1] = objArrZze[i2];
                } else {
                    if (i80 == 12) {
                        if (zzenVar2.zzc() == 1 || i73 != 0) {
                            i25 = i2 + 1;
                            int i82 = i61 / 3;
                            objArr[i82 + i82 + 1] = objArrZze[i2];
                        } else {
                            i73 = 0;
                        }
                    }
                    int i83 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i83];
                    if (obj instanceof Field) {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i83] = fieldZzz2;
                    } else {
                        fieldZzz2 = (Field) obj;
                    }
                    i17 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz2);
                    int i84 = i83 + 1;
                    obj2 = objArrZze[i84];
                    if (obj2 instanceof Field) {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i84] = fieldZzz3;
                    } else {
                        fieldZzz3 = (Field) obj2;
                    }
                    zzenVar = zzenVar2;
                    str = strZzd;
                    i21 = i2;
                    i19 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz3);
                    i20 = 0;
                }
                i2 = i25;
                int i832 = iCharAt12 + iCharAt12;
                obj = objArrZze[i832];
                if (obj instanceof Field) {
                }
                i17 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz2);
                int i842 = i832 + 1;
                obj2 = objArrZze[i842];
                if (obj2 instanceof Field) {
                }
                zzenVar = zzenVar2;
                str = strZzd;
                i21 = i2;
                i19 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz3);
                i20 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i85 = i2 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    zzenVar = zzenVar2;
                    int i86 = i61 / 3;
                    objArr[i86 + i86 + 1] = fieldZzz4.getType();
                } else {
                    if (i72 == 27) {
                        zzenVar = zzenVar2;
                        i22 = 1;
                        i23 = i2 + 2;
                    } else if (i72 == 49) {
                        i23 = i2 + 2;
                        zzenVar = zzenVar2;
                        i22 = 1;
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        zzenVar = zzenVar2;
                        if (zzenVar2.zzc() == 1 || i73 != 0) {
                            i23 = i2 + 2;
                            int i87 = i61 / 3;
                            objArr[i87 + i87 + 1] = objArrZze[i85];
                            i85 = i23;
                        } else {
                            i73 = 0;
                        }
                    } else {
                        if (i72 == 50) {
                            int i88 = i2 + 2;
                            int i89 = i62 + 1;
                            iArr[i62] = i61;
                            int i90 = i61 / 3;
                            int i91 = i90 + i90;
                            objArr[i91] = objArrZze[i85];
                            if (i73 != 0) {
                                i85 = i2 + 3;
                                objArr[i91 + 1] = objArrZze[i88];
                                i62 = i89;
                            } else {
                                i85 = i88;
                                i62 = i89;
                                i73 = 0;
                            }
                        }
                        zzenVar = zzenVar2;
                    }
                    int i92 = i61 / 3;
                    objArr[i92 + i92 + i22] = objArrZze[i85];
                    i85 = i23;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i72 > 17) {
                    str = strZzd;
                    i19 = i16;
                    i20 = 0;
                } else {
                    int i93 = i16 + 1;
                    int iCharAt13 = strZzd.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i94 = iCharAt13 & 8191;
                        int i95 = 13;
                        while (true) {
                            i19 = i93 + 1;
                            cCharAt9 = strZzd.charAt(i93);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i94 |= (cCharAt9 & 8191) << i95;
                            i95 += 13;
                            i93 = i19;
                        }
                        iCharAt13 = i94 | (cCharAt9 << i95);
                    } else {
                        i19 = i93;
                    }
                    int i96 = i5 + i5 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i96];
                    str = strZzd;
                    if (obj3 instanceof Field) {
                        fieldZzz = (Field) obj3;
                    } else {
                        fieldZzz = zzz(cls2, (String) obj3);
                        objArrZze[i96] = fieldZzz;
                    }
                    i20 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz);
                }
                if (i72 >= 18 && i72 <= 49) {
                    iArr[i63] = iObjectFieldOffset3;
                    i63++;
                }
                i21 = i85;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i97 = i61 + 1;
            iArr2[i61] = iCharAt10;
            int i98 = i61 + 2;
            iArr2[i97] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 != 0 ? Integer.MIN_VALUE : 0) | (i72 << 20);
            i61 += 3;
            iArr2[i98] = (i20 << 20) | iObjectFieldOffset;
            i2 = i21;
            i31 = i19;
            length = i74;
            zzenVar2 = zzenVar;
            strZzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzen zzenVar3 = zzenVar2;
        return new zzef(iArr2, objArr, i3, i6, zzenVar3.zza(), zzenVar3.zzc(), false, iArr, i4, i58, zzeiVar, zzdqVar, zzffVar, zzceVar, zzdxVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfp.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfp.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfp.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfp.zzf(obj, j)).longValue();
    }

    private final zzcw zzu(int i) {
        int i2 = i / 3;
        return (zzcw) this.zzd[i2 + i2 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzeo zzeoVar = (zzeo) objArr[i3];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzeoVarZzb = zzel.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzeoVarZzb;
        return zzeoVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzeoVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzeo zzeoVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0484  */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.google.android.gms.internal.play_billing.zzdk] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260, types: [int] */
    /* JADX WARN: Type inference failed for: r0v262 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v126, types: [int] */
    /* JADX WARN: Type inference failed for: r1v172 */
    /* JADX WARN: Type inference failed for: r1v173 */
    /* JADX WARN: Type inference failed for: r1v83, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i;
        boolean z;
        ?? r5;
        int iZzw;
        int iZzw2;
        int iZzw3;
        int iZzx;
        int iZzw4;
        int iZzw5;
        int iZzd;
        int iZzw6;
        int size;
        int iZzw7;
        ?? Zzg;
        int iZzv;
        int iZzv2;
        ?? Zzw;
        int iZzu;
        ?? Zzw2;
        ?? Zzw3;
        int iZze;
        int iZzw8;
        int iZzw9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z2 = false;
        int i2 = 1048575;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzc.length) {
            int iZzs = zzs(i3);
            int iZzr = zzr(iZzs);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            if (iZzr <= 17) {
                if (i8 != i5) {
                    z3 = i8 == i2 ? z2 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = i5;
                z = z3;
                r5 = 1 << (i7 >>> 20);
            } else {
                i = i5;
                z = z3;
                r5 = z2;
            }
            int i9 = iZzs & i2;
            if (iZzr >= zzcj.zzJ.zza()) {
                zzcj.zzW.zza();
            }
            long j = i9;
            switch (iZzr) {
                case 0:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw + 8;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 1:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw2 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw2 + 4;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 2:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(j2);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 3:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(j3);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 4:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(j4);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 5:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw + 8;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 6:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw2 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw2 + 4;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 7:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw4 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw4 + 1;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 8:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzbq) {
                            iZzw5 = zzby.zzw(i10);
                            iZzd = ((zzbq) object).zzd();
                            iZzw6 = zzby.zzw(iZzd);
                            Zzw3 = iZzw5 + iZzw6 + iZzd;
                            i4 += Zzw3;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        } else {
                            iZzw3 = zzby.zzw(i10);
                            iZzx = zzby.zzv((String) object);
                            Zzw3 = iZzw3 + iZzx;
                            i4 += Zzw3;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        }
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 9:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        Zzw3 = zzeq.zzh(i6, unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 10:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzbq zzbqVar = (zzbq) unsafe.getObject(obj, j);
                        iZzw5 = zzby.zzw(i6 << 3);
                        iZzd = zzbqVar.zzd();
                        iZzw6 = zzby.zzw(iZzd);
                        Zzw3 = iZzw5 + iZzw6 + iZzd;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 11:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzw(i11);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 12:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(j5);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 13:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw2 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw2 + 4;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 14:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        iZzw = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw + 8;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 15:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzw((i12 >> 31) ^ (i12 + i12));
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 16:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx((j6 >> 63) ^ (j6 + j6));
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 17:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        Zzw3 = zzby.zzt(i6, (zzec) unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 18:
                    Zzw3 = zzeq.zzd(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 19:
                    Zzw3 = zzeq.zzb(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzeq.zza;
                    Zzg = list.size() == 0 ? z2 : zzeq.zzg(list) + (list.size() * zzby.zzw(i6 << 3));
                    i4 += Zzg;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = zzeq.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzl(list2);
                        iZzw7 = zzby.zzw(i6 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzeq.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzf(list3);
                        iZzw7 = zzby.zzw(i6 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 23:
                    Zzw3 = zzeq.zzd(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 24:
                    Zzw3 = zzeq.zzb(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zzeq.zza;
                    int size2 = list4.size();
                    Zzw3 = size2 == 0 ? z2 : size2 * (zzby.zzw(i6 << 3) + 1);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 26:
                    ?? r0 = (List) unsafe.getObject(obj, j);
                    int i17 = zzeq.zza;
                    int size3 = r0.size();
                    if (size3 != 0) {
                        int iZzw10 = zzby.zzw(i6 << 3) * size3;
                        if (r0 instanceof zzdk) {
                            ?? r02 = (zzdk) r0;
                            Zzg = iZzw10;
                            for (?? r3 = z2; r3 < size3; r3++) {
                                Object objZzf = r02.zzf(r3);
                                if (objZzf instanceof zzbq) {
                                    int iZzd2 = ((zzbq) objZzf).zzd();
                                    iZzv2 = Zzg + zzby.zzw(iZzd2) + iZzd2;
                                } else {
                                    iZzv2 = Zzg + zzby.zzv((String) objZzf);
                                }
                                Zzg = iZzv2;
                            }
                        } else {
                            Zzg = iZzw10;
                            for (?? r32 = z2; r32 < size3; r32++) {
                                Object obj2 = r0.get(r32);
                                if (obj2 instanceof zzbq) {
                                    int iZzd3 = ((zzbq) obj2).zzd();
                                    iZzv = Zzg + zzby.zzw(iZzd3) + iZzd3;
                                } else {
                                    iZzv = Zzg + zzby.zzv((String) obj2);
                                }
                                Zzg = iZzv;
                            }
                        }
                    }
                    i4 += Zzg;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                    break;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv = zzv(i3);
                    int i18 = zzeq.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        Zzw = z2;
                    } else {
                        Zzw = zzby.zzw(i6 << 3) * size4;
                        for (?? r42 = z2; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzdi) {
                                int iZza = ((zzdi) obj3).zza();
                                iZzu = (Zzw == true ? 1 : 0) + zzby.zzw(iZza) + iZza;
                            } else {
                                iZzu = (Zzw == true ? 1 : 0) + zzby.zzu((zzec) obj3, zzeoVarZzv);
                            }
                            Zzw = iZzu;
                        }
                    }
                    i4 += Zzw;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i19 = zzeq.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        Zzw2 = z2;
                    } else {
                        Zzw2 = size5 * zzby.zzw(i6 << 3);
                        for (?? r2 = z2; r2 < r04.size(); r2++) {
                            int iZzd4 = ((zzbq) r04.get(r2)).zzd();
                            Zzw2 += zzby.zzw(iZzd4) + iZzd4;
                        }
                    }
                    i4 += Zzw2;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i20 = zzeq.zza;
                    size = list5.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzk(list5);
                        iZzw7 = zzby.zzw(i6 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i21 = zzeq.zza;
                    size = list6.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zza(list6);
                        iZzw7 = zzby.zzw(i6 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 31:
                    Zzw3 = zzeq.zzb(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 32:
                    Zzw3 = zzeq.zzd(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zzeq.zza;
                    size = list7.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzi(list7);
                        iZzw7 = zzby.zzw(i6 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i23 = zzeq.zza;
                    size = list8.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzj(list8);
                        iZzw7 = zzby.zzw(i6 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    i4 += Zzw3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 35:
                    iZze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 36:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 37:
                    iZze = zzeq.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 38:
                    iZze = zzeq.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 39:
                    iZze = zzeq.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 40:
                    iZze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 41:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i24 = zzeq.zza;
                    iZze = list9.size();
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 43:
                    iZze = zzeq.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 44:
                    iZze = zzeq.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 45:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 46:
                    iZze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 47:
                    iZze = zzeq.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 48:
                    iZze = zzeq.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i6 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i4 += Zzw2;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv2 = zzv(i3);
                    int i25 = zzeq.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z2;
                    } else {
                        boolean z4 = z2;
                        r4 = z4;
                        ?? r33 = z4;
                        while (r33 < size6) {
                            int iZzt = zzby.zzt(i6, (zzec) r05.get(r33), zzeoVarZzv2);
                            r33++;
                            r4 = (r4 == true ? 1 : 0) + iZzt;
                        }
                    }
                    i4 += r4;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 50:
                    zzdw zzdwVar = (zzdw) unsafe.getObject(obj, j);
                    if (zzdwVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzdwVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 51:
                    if (zzM(obj, i6, i3)) {
                        iZzw = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw + 8;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 52:
                    if (zzM(obj, i6, i3)) {
                        iZzw2 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw2 + 4;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 53:
                    if (zzM(obj, i6, i3)) {
                        long jZzt = zzt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(jZzt);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 54:
                    if (zzM(obj, i6, i3)) {
                        long jZzt2 = zzt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(jZzt2);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 55:
                    if (zzM(obj, i6, i3)) {
                        long jZzo = zzo(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(jZzo);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 56:
                    if (zzM(obj, i6, i3)) {
                        iZzw = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw + 8;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 57:
                    if (zzM(obj, i6, i3)) {
                        iZzw2 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw2 + 4;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 58:
                    if (zzM(obj, i6, i3)) {
                        iZzw4 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw4 + 1;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 59:
                    if (zzM(obj, i6, i3)) {
                        int i26 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzbq) {
                            iZzw5 = zzby.zzw(i26);
                            iZzd = ((zzbq) object2).zzd();
                            iZzw6 = zzby.zzw(iZzd);
                            Zzw3 = iZzw5 + iZzw6 + iZzd;
                            i4 += Zzw3;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        } else {
                            iZzw3 = zzby.zzw(i26);
                            iZzx = zzby.zzv((String) object2);
                            Zzw3 = iZzw3 + iZzx;
                            i4 += Zzw3;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        }
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 60:
                    if (zzM(obj, i6, i3)) {
                        Zzw3 = zzeq.zzh(i6, unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 61:
                    if (zzM(obj, i6, i3)) {
                        zzbq zzbqVar2 = (zzbq) unsafe.getObject(obj, j);
                        iZzw5 = zzby.zzw(i6 << 3);
                        iZzd = zzbqVar2.zzd();
                        iZzw6 = zzby.zzw(iZzd);
                        Zzw3 = iZzw5 + iZzw6 + iZzd;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 62:
                    if (zzM(obj, i6, i3)) {
                        int iZzo = zzo(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzw(iZzo);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 63:
                    if (zzM(obj, i6, i3)) {
                        long jZzo2 = zzo(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx(jZzo2);
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 64:
                    if (zzM(obj, i6, i3)) {
                        iZzw2 = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw2 + 4;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 65:
                    if (zzM(obj, i6, i3)) {
                        iZzw = zzby.zzw(i6 << 3);
                        Zzw3 = iZzw + 8;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 66:
                    if (zzM(obj, i6, i3)) {
                        int iZzo2 = zzo(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzw((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 67:
                    if (zzM(obj, i6, i3)) {
                        long jZzt3 = zzt(obj, j);
                        iZzw3 = zzby.zzw(i6 << 3);
                        iZzx = zzby.zzx((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        Zzw3 = iZzw3 + iZzx;
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 68:
                    if (zzM(obj, i6, i3)) {
                        Zzw3 = zzby.zzt(i6, (zzec) unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzw3;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                default:
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
            }
        }
        zzff zzffVar = this.zzm;
        int iZza2 = i4 + zzffVar.zza(zzffVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        zzci zzciVarZzb = this.zzn.zzb(obj);
        int iZzb = 0;
        for (int i27 = 0; i27 < zzciVarZzb.zza.zzb(); i27++) {
            Map.Entry entryZzg = zzciVarZzb.zza.zzg(i27);
            iZzb += zzci.zzb((zzch) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzciVarZzb.zza.zzc()) {
            iZzb += zzci.zzb((zzch) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j));
                    byte[] bArr = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr2 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr3 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr4 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzda.zza(zzfp.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzfp.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr5 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr6 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzfp.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i3 = i2 + iHashCode;
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
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzda.zza(zzN(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzm.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzn.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1321:0x0dee, code lost:
    
        if (r13 == r1) goto L1323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1322:0x0df0, code lost:
    
        r8.putInt(r7, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1323:0x0df4, code lost:
    
        r2 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1325:0x0df8, code lost:
    
        if (r2 >= r0.zzk) goto L1441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1326:0x0dfa, code lost:
    
        r3 = r0.zzi;
        r4 = r0.zzc;
        r3 = r3[r2];
        r4 = r4[r3];
        r4 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r0.zzs(r3) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1327:0x0e0c, code lost:
    
        if (r4 != null) goto L1329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1330:0x0e13, code lost:
    
        if (r0.zzu(r3) != null) goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1331:0x0e15, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1332:0x0e18, code lost:
    
        r4 = (com.google.android.gms.internal.play_billing.zzdw) r4;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1333:0x0e20, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1334:0x0e21, code lost:
    
        if (r15 != 0) goto L1340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1336:0x0e25, code lost:
    
        if (r9 != r37) goto L1338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1339:0x0e2c, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1341:0x0e2f, code lost:
    
        if (r9 > r37) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1342:0x0e31, code lost:
    
        if (r11 != r15) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1343:0x0e33, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1345:0x0e38, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:1213:0x0a6d A[PHI: r0 r7 r8 r9 r10 r12 r13 r14
  0x0a6d: PHI (r0v33 com.google.android.gms.internal.play_billing.zzef<T>) = 
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v11 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v32 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
 binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r7v53 int) = (r7v34 int), (r7v35 int), (r7v36 int), (r7v42 int), (r7v48 int), (r7v52 int), (r7v58 int) binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r8v128 int) = (r8v86 int), (r8v87 int), (r8v88 int), (r8v108 int), (r8v123 int), (r8v127 int), (r8v132 int) binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r9v100 int) = (r9v72 int), (r9v73 int), (r9v74 int), (r9v78 int), (r9v91 int), (r9v99 int), (r9v105 int) binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r10v93 sun.misc.Unsafe) = 
  (r10v71 sun.misc.Unsafe)
  (r10v72 sun.misc.Unsafe)
  (r10v73 sun.misc.Unsafe)
  (r10v76 sun.misc.Unsafe)
  (r10v88 sun.misc.Unsafe)
  (r10v92 sun.misc.Unsafe)
  (r10v98 sun.misc.Unsafe)
 binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r12v70 int) = (r12v54 int), (r12v55 int), (r12v56 int), (r12v59 int), (r12v66 int), (r12v69 int), (r12v74 int) binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r13v98 com.google.android.gms.internal.play_billing.zzbc) = 
  (r13v74 com.google.android.gms.internal.play_billing.zzbc)
  (r13v75 com.google.android.gms.internal.play_billing.zzbc)
  (r13v76 com.google.android.gms.internal.play_billing.zzbc)
  (r13v82 com.google.android.gms.internal.play_billing.zzbc)
  (r13v89 com.google.android.gms.internal.play_billing.zzbc)
  (r13v96 com.google.android.gms.internal.play_billing.zzbc)
  (r13v103 com.google.android.gms.internal.play_billing.zzbc)
 binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r14v81 byte[]) = (r14v55 byte[]), (r14v56 byte[]), (r14v57 byte[]), (r14v63 byte[]), (r14v71 byte[]), (r14v79 byte[]), (r14v85 byte[]) binds: [B:1207:0x0a44, B:1191:0x09eb, B:1175:0x0999, B:1100:0x0838, B:1045:0x0737, B:969:0x05b9, B:953:0x055b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1318:0x0dc6  */
    /* JADX WARN: Removed duplicated region for block: B:1363:0x0a70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1366:0x0d77 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1389:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1428:0x0a84 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1430:0x0d87 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzbc zzbcVar) throws IOException {
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int iZzi;
        int i7;
        int i8;
        int iZzq;
        int i9;
        Unsafe unsafe2;
        int i10;
        byte[] bArr2;
        zzbc zzbcVar2;
        int i11;
        Unsafe unsafe3;
        int iZzg;
        zzcd zzcdVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c;
        int i17;
        byte[] bArr3;
        zzbc zzbcVar3;
        int i18;
        Unsafe unsafe4;
        int iZzh;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr4;
        int i25;
        int i26;
        int i27;
        int iZzk;
        Unsafe unsafe5;
        zzbc zzbcVar4;
        byte[] bArr5;
        int i28;
        int iZza;
        int i29;
        int i30;
        int i31;
        int i32;
        Unsafe unsafe6;
        int iZzh2;
        Unsafe unsafe7;
        int i33;
        int i34;
        int i35;
        int iZzf;
        int iZze;
        int i36;
        byte[] bArr6;
        int i37;
        int iZzj;
        int i38;
        int i39;
        int i40;
        zzef<T> zzefVar = this;
        Object obj2 = obj;
        byte[] bArr7 = bArr;
        int i41 = i2;
        int i42 = i3;
        zzbc zzbcVar5 = zzbcVar;
        zzA(obj);
        Unsafe unsafe8 = zzb;
        int i43 = 0;
        int iZzl = i;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = -1;
        int i48 = 1048575;
        while (true) {
            if (iZzl < i41) {
                int i49 = iZzl + 1;
                byte b = bArr7[iZzl];
                if (b < 0) {
                    iZzi = zzbd.zzi(b, bArr7, i49, zzbcVar5);
                    i45 = zzbcVar5.zza;
                } else {
                    i45 = b;
                    iZzi = i49;
                }
                int i50 = i45 >>> 3;
                if (i50 > i47) {
                    iZzq = (i50 < zzefVar.zze || i50 > zzefVar.zzf) ? -1 : zzefVar.zzq(i50, i44 / 3);
                } else if (i50 < zzefVar.zze || i50 > zzefVar.zzf) {
                    i7 = -1;
                    i8 = -1;
                    if (i8 != i7) {
                        i44 = i43;
                        i9 = i44;
                        unsafe2 = unsafe8;
                        i10 = i48;
                        i47 = i50;
                        bArr2 = bArr7;
                        zzbcVar2 = zzbcVar5;
                        i4 = i42;
                        i11 = iZzi;
                    } else {
                        int i51 = i45 & 7;
                        int[] iArr = zzefVar.zzc;
                        int i52 = iArr[i8 + 1];
                        int iZzr = zzr(i52);
                        long j = i52 & 1048575;
                        int i53 = iZzi;
                        if (iZzr <= 17) {
                            int i54 = iArr[i8 + 2];
                            int i55 = 1 << (i54 >>> 20);
                            int i56 = 1048575;
                            int i57 = i54 & 1048575;
                            if (i57 != i48) {
                                if (i48 != 1048575) {
                                    unsafe8.putInt(obj2, i48, i46);
                                    i56 = 1048575;
                                }
                                i46 = i57 == i56 ? 0 : unsafe8.getInt(obj2, i57);
                                i12 = i57;
                            } else {
                                i12 = i48;
                            }
                            switch (iZzr) {
                                case 0:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 1) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        iZzh = i16 + 8;
                                        i46 |= i55;
                                        zzfp.zzo(obj2, j, Double.longBitsToDouble(zzbd.zzn(bArr3, i16)));
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = i18;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i58 = i17;
                                        bArr7 = bArr3;
                                        i45 = i58;
                                    }
                                case 1:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 5) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        iZzh = i16 + 4;
                                        i46 |= i55;
                                        zzfp.zzp(obj2, j, Float.intBitsToFloat(zzbd.zzb(bArr3, i16)));
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = i18;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i582 = i17;
                                        bArr7 = bArr3;
                                        i45 = i582;
                                    }
                                case 2:
                                case 3:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 0) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        int iZzk2 = zzbd.zzk(bArr3, i16, zzbcVar3);
                                        unsafe4.putLong(obj, j, zzbcVar3.zzb);
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = 0;
                                        iZzl = iZzk2;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        int i5822 = i17;
                                        bArr7 = bArr3;
                                        i45 = i5822;
                                    }
                                case 4:
                                case 11:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 0) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        iZzh = zzbd.zzh(bArr3, i16, zzbcVar3);
                                        unsafe4.putInt(obj2, j, zzbcVar3.zza);
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = i18;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i58222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i58222;
                                    }
                                case 5:
                                case 14:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 1) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        int i59 = i16 + 8;
                                        i46 |= i55;
                                        unsafe4.putLong(obj, j, zzbd.zzn(bArr3, i16));
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = 0;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        iZzl = i59;
                                        i47 = i15;
                                        i48 = i14;
                                        int i582222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i582222;
                                    }
                                case 6:
                                case 13:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 5) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        iZzh = i16 + 4;
                                        i46 |= i55;
                                        unsafe4.putInt(obj2, j, zzbd.zzb(bArr3, i16));
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = i18;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i5822222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i5822222;
                                    }
                                case 7:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    i18 = 0;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 0) {
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        iZzh = zzbd.zzk(bArr3, i16, zzbcVar3);
                                        zzfp.zzm(obj2, j, zzbcVar3.zzb != 0);
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = i18;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i58222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i58222222;
                                    }
                                case 8:
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 2) {
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        if ((i52 & 536870912) != 0) {
                                            iZzh = zzbd.zzh(bArr3, i16, zzbcVar3);
                                            int i60 = zzbcVar3.zza;
                                            if (i60 < 0) {
                                                throw zzdc.zzd();
                                            }
                                            int i61 = i46 | i55;
                                            if (i60 == 0) {
                                                zzbcVar3.zzc = "";
                                                i19 = i61;
                                                i20 = 0;
                                            } else {
                                                int i62 = zzfu.zza;
                                                int length = bArr3.length;
                                                if ((((length - iZzh) - i60) | iZzh | i60) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzh), Integer.valueOf(i60)));
                                                }
                                                int i63 = iZzh + i60;
                                                char[] cArr = new char[i60];
                                                int i64 = 0;
                                                while (iZzh < i63) {
                                                    byte b2 = bArr3[iZzh];
                                                    if (zzfq.zzd(b2)) {
                                                        iZzh++;
                                                        cArr[i64] = (char) b2;
                                                        i64++;
                                                    } else {
                                                        while (iZzh < i63) {
                                                            int i65 = iZzh + 1;
                                                            byte b3 = bArr3[iZzh];
                                                            if (zzfq.zzd(b3)) {
                                                                cArr[i64] = (char) b3;
                                                                i64++;
                                                                iZzh = i65;
                                                                while (iZzh < i63) {
                                                                    byte b4 = bArr3[iZzh];
                                                                    if (zzfq.zzd(b4)) {
                                                                        iZzh++;
                                                                        cArr[i64] = (char) b4;
                                                                        i64++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i66 = i61;
                                                                if (b3 < -32) {
                                                                    if (i65 >= i63) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    iZzh += 2;
                                                                    zzfq.zzc(b3, bArr3[i65], cArr, i64);
                                                                    i64++;
                                                                } else if (b3 < -16) {
                                                                    if (i65 >= i63 - 1) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    zzfq.zzb(b3, bArr3[i65], bArr3[iZzh + 2], cArr, i64);
                                                                    i64++;
                                                                    i61 = i66;
                                                                    iZzh += 3;
                                                                } else {
                                                                    if (i65 >= i63 - 2) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    byte b5 = bArr3[i65];
                                                                    int i67 = iZzh + 3;
                                                                    byte b6 = bArr3[iZzh + 2];
                                                                    iZzh += 4;
                                                                    zzfq.zza(b3, b5, b6, bArr3[i67], cArr, i64);
                                                                    i64 += 2;
                                                                }
                                                                i61 = i66;
                                                            }
                                                        }
                                                        i19 = i61;
                                                        i20 = 0;
                                                        zzbcVar3.zzc = new String(cArr, 0, i64);
                                                        iZzh = i63;
                                                    }
                                                }
                                                while (iZzh < i63) {
                                                }
                                                i19 = i61;
                                                i20 = 0;
                                                zzbcVar3.zzc = new String(cArr, 0, i64);
                                                iZzh = i63;
                                            }
                                            i18 = i20;
                                            i46 = i19;
                                        } else {
                                            i18 = 0;
                                            iZzh = zzbd.zzh(bArr3, i16, zzbcVar3);
                                            int i68 = zzbcVar3.zza;
                                            if (i68 < 0) {
                                                throw zzdc.zzd();
                                            }
                                            int i69 = i46 | i55;
                                            if (i68 == 0) {
                                                zzbcVar3.zzc = "";
                                            } else {
                                                zzbcVar3.zzc = new String(bArr3, iZzh, i68, zzda.zzb);
                                                iZzh += i68;
                                            }
                                            i46 = i69;
                                        }
                                        unsafe4.putObject(obj2, j, zzbcVar3.zzc);
                                        i41 = i2;
                                        i42 = i3;
                                        i43 = i18;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i582222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i582222222;
                                    }
                                    break;
                                case 9:
                                    i21 = i2;
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 2) {
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        Object objZzx = zzefVar.zzx(obj2, i13);
                                        iZzh = zzbd.zzm(objZzx, zzefVar.zzv(i13), bArr, i16, i2, zzbcVar);
                                        zzefVar.zzF(obj2, i13, objZzx);
                                        i42 = i3;
                                        i41 = i21;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i43 = 0;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i5822222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i5822222222;
                                    }
                                case 10:
                                    i21 = i2;
                                    i42 = i3;
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 2) {
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        iZzh = zzbd.zza(bArr3, i16, zzbcVar3);
                                        unsafe4.putObject(obj2, j, zzbcVar3.zzc);
                                        i41 = i21;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i43 = 0;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i58222222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i58222222222;
                                    }
                                case 12:
                                    i42 = i3;
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 0) {
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        int iZzh3 = zzbd.zzh(bArr3, i16, zzbcVar3);
                                        int i70 = zzbcVar3.zza;
                                        zzcw zzcwVarZzu = zzefVar.zzu(i13);
                                        if ((i52 & Integer.MIN_VALUE) == 0 || zzcwVarZzu == null || zzcwVarZzu.zza(i70)) {
                                            i46 |= i55;
                                            unsafe4.putInt(obj2, j, i70);
                                        } else {
                                            zzd(obj).zzj(i17, Long.valueOf(i70));
                                        }
                                        i41 = i2;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        iZzl = iZzh3;
                                        i47 = i15;
                                        i43 = 0;
                                        i48 = i14;
                                        int i582222222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i582222222222;
                                    }
                                case 15:
                                    i21 = i2;
                                    i42 = i3;
                                    zzbcVar3 = zzbcVar5;
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    unsafe4 = unsafe8;
                                    i17 = i45;
                                    bArr3 = bArr;
                                    if (i51 != 0) {
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        iZzh = zzbd.zzh(bArr3, i16, zzbcVar3);
                                        unsafe4.putInt(obj2, j, zzbu.zzb(zzbcVar3.zza));
                                        i41 = i21;
                                        unsafe8 = unsafe4;
                                        zzbcVar5 = zzbcVar3;
                                        i44 = i13;
                                        i47 = i15;
                                        i43 = 0;
                                        i48 = i14;
                                        iZzl = iZzh;
                                        int i5822222222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i5822222222222;
                                    }
                                case 16:
                                    i13 = i8;
                                    i14 = i12;
                                    i15 = i50;
                                    i16 = i53;
                                    c = 65535;
                                    i17 = i45;
                                    if (i51 != 0) {
                                        bArr3 = bArr;
                                        zzbcVar3 = zzbcVar5;
                                        unsafe4 = unsafe8;
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        i46 |= i55;
                                        bArr3 = bArr;
                                        int iZzk3 = zzbd.zzk(bArr3, i16, zzbcVar5);
                                        unsafe8.putLong(obj, j, zzbu.zzc(zzbcVar5.zzb));
                                        i41 = i2;
                                        i42 = i3;
                                        unsafe8 = unsafe8;
                                        zzbcVar5 = zzbcVar5;
                                        i44 = i13;
                                        iZzl = iZzk3;
                                        i47 = i15;
                                        i43 = 0;
                                        i48 = i14;
                                        int i58222222222222 = i17;
                                        bArr7 = bArr3;
                                        i45 = i58222222222222;
                                    }
                                default:
                                    if (i51 != 3) {
                                        i13 = i8;
                                        i14 = i12;
                                        i15 = i50;
                                        i16 = i53;
                                        c = 65535;
                                        i17 = i45;
                                        bArr3 = bArr;
                                        zzbcVar3 = zzbcVar5;
                                        unsafe4 = unsafe8;
                                        i18 = 0;
                                        i10 = i14;
                                        i11 = i16;
                                        i9 = i18;
                                        unsafe2 = unsafe4;
                                        i44 = i13;
                                        i47 = i15;
                                        zzbcVar2 = zzbcVar3;
                                        bArr2 = bArr3;
                                        i45 = i17;
                                        i4 = i3;
                                        break;
                                    } else {
                                        int i71 = i46 | i55;
                                        Object objZzx2 = zzefVar.zzx(obj2, i8);
                                        int i72 = i8;
                                        iZzl = zzbd.zzl(objZzx2, zzefVar.zzv(i8), bArr, i53, i2, (i50 << 3) | 4, zzbcVar);
                                        zzefVar.zzF(obj2, i72, objZzx2);
                                        i48 = i12;
                                        i42 = i3;
                                        i46 = i71;
                                        i44 = i72;
                                        i45 = i45;
                                        i47 = i50;
                                        i43 = 0;
                                        bArr7 = bArr;
                                        i41 = i2;
                                    }
                            }
                        } else {
                            i10 = i48;
                            int i73 = i50;
                            i9 = 0;
                            zzbc zzbcVar6 = zzbcVar5;
                            int i74 = i45;
                            int i75 = i8;
                            Unsafe unsafe9 = unsafe8;
                            if (iZzr != 27) {
                                bArr4 = bArr;
                                i22 = i46;
                                if (iZzr > 49) {
                                    i25 = i75;
                                    i23 = i53;
                                    zzbcVar6 = zzbcVar6;
                                    i24 = i73;
                                    unsafe9 = unsafe9;
                                    if (iZzr != 50) {
                                        Unsafe unsafe10 = zzb;
                                        long j2 = iArr[i25 + 2] & 1048575;
                                        switch (iZzr) {
                                            case 51:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 1) {
                                                    iZzk = i27 + 8;
                                                    unsafe10.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzbd.zzn(bArr2, i27))));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                        i4 = i3;
                                                        i11 = iZzl;
                                                        i45 = i26;
                                                        i46 = i22;
                                                        break;
                                                    } else {
                                                        i41 = i2;
                                                        i42 = i3;
                                                        bArr7 = bArr2;
                                                        zzbcVar5 = zzbcVar2;
                                                        i43 = 0;
                                                        i48 = i10;
                                                        i45 = i26;
                                                        unsafe8 = unsafe2;
                                                        break;
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                            case 52:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 5) {
                                                    iZzk = i27 + 4;
                                                    unsafe10.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzbd.zzb(bArr2, i27))));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 0) {
                                                    iZzk = zzbd.zzk(bArr2, i27, zzbcVar2);
                                                    unsafe10.putObject(obj2, j, Long.valueOf(zzbcVar2.zzb));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 0) {
                                                    iZzk = zzbd.zzh(bArr2, i27, zzbcVar2);
                                                    unsafe10.putObject(obj2, j, Integer.valueOf(zzbcVar2.zza));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 1) {
                                                    iZzk = i27 + 8;
                                                    unsafe10.putObject(obj2, j, Long.valueOf(zzbd.zzn(bArr2, i27)));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 5) {
                                                    iZzk = i27 + 4;
                                                    unsafe10.putObject(obj2, j, Integer.valueOf(zzbd.zzb(bArr2, i27)));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 58:
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 0) {
                                                    iZzk = zzbd.zzk(bArr2, i27, zzbcVar2);
                                                    unsafe10.putObject(obj2, j, Boolean.valueOf(zzbcVar2.zzb != 0));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzk;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 59:
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                obj2 = obj;
                                                i44 = i25;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                if (i51 == 2) {
                                                    int iZzh4 = zzbd.zzh(bArr2, i27, zzbcVar2);
                                                    int i76 = zzbcVar2.zza;
                                                    if (i76 == 0) {
                                                        unsafe2 = unsafe9;
                                                        unsafe10.putObject(obj2, j, "");
                                                    } else {
                                                        unsafe2 = unsafe9;
                                                        int i77 = iZzh4 + i76;
                                                        if ((i52 & 536870912) != 0 && !zzfu.zze(bArr2, iZzh4, i77)) {
                                                            throw zzdc.zzc();
                                                        }
                                                        unsafe10.putObject(obj2, j, new String(bArr2, iZzh4, i76, zzda.zzb));
                                                        iZzh4 = i77;
                                                    }
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    iZzl = iZzh4;
                                                    if (iZzl != i27) {
                                                    }
                                                } else {
                                                    unsafe2 = unsafe9;
                                                    iZzl = i27;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                break;
                                            case 60:
                                                obj2 = obj;
                                                i44 = i25;
                                                i47 = i24;
                                                if (i51 == 2) {
                                                    Object objZzy = zzefVar.zzy(obj2, i47, i44);
                                                    bArr2 = bArr4;
                                                    zzbcVar2 = zzbcVar6;
                                                    i26 = i74;
                                                    i27 = i23;
                                                    int iZzm = zzbd.zzm(objZzy, zzefVar.zzv(i44), bArr, i23, i2, zzbcVar);
                                                    zzefVar.zzG(obj2, i47, i44, objZzy);
                                                    iZzl = iZzm;
                                                    unsafe2 = unsafe9;
                                                    if (iZzl != i27) {
                                                    }
                                                } else {
                                                    bArr2 = bArr4;
                                                    zzbcVar2 = zzbcVar6;
                                                    i26 = i74;
                                                    i27 = i23;
                                                    unsafe2 = unsafe9;
                                                    iZzl = i27;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                unsafe5 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                zzbcVar4 = zzbcVar6;
                                                bArr5 = bArr4;
                                                i28 = i23;
                                                obj2 = obj;
                                                if (i51 == 2) {
                                                    iZza = zzbd.zza(bArr5, i28, zzbcVar4);
                                                    unsafe10.putObject(obj2, j, zzbcVar4.zzc);
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    unsafe2 = unsafe5;
                                                    bArr2 = bArr5;
                                                    iZzl = iZza;
                                                    zzbcVar2 = zzbcVar4;
                                                    i26 = i74;
                                                    i27 = i28;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                bArr2 = bArr5;
                                                zzbcVar2 = zzbcVar4;
                                                i26 = i74;
                                                i27 = i28;
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 63:
                                                unsafe5 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                zzbcVar4 = zzbcVar6;
                                                bArr5 = bArr4;
                                                i28 = i23;
                                                obj2 = obj;
                                                if (i51 == 0) {
                                                    iZza = zzbd.zzh(bArr5, i28, zzbcVar4);
                                                    int i78 = zzbcVar4.zza;
                                                    zzcw zzcwVarZzu2 = zzefVar.zzu(i44);
                                                    if (zzcwVarZzu2 == null || zzcwVarZzu2.zza(i78)) {
                                                        unsafe10.putObject(obj2, j, Integer.valueOf(i78));
                                                        unsafe10.putInt(obj2, j2, i47);
                                                    } else {
                                                        zzd(obj).zzj(i74, Long.valueOf(i78));
                                                    }
                                                    unsafe2 = unsafe5;
                                                    bArr2 = bArr5;
                                                    iZzl = iZza;
                                                    zzbcVar2 = zzbcVar4;
                                                    i26 = i74;
                                                    i27 = i28;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                bArr2 = bArr5;
                                                zzbcVar2 = zzbcVar4;
                                                i26 = i74;
                                                i27 = i28;
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 66:
                                                unsafe5 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                zzbcVar4 = zzbcVar6;
                                                bArr5 = bArr4;
                                                i28 = i23;
                                                obj2 = obj;
                                                if (i51 == 0) {
                                                    iZza = zzbd.zzh(bArr5, i28, zzbcVar4);
                                                    unsafe10.putObject(obj2, j, Integer.valueOf(zzbu.zzb(zzbcVar4.zza)));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    unsafe2 = unsafe5;
                                                    bArr2 = bArr5;
                                                    iZzl = iZza;
                                                    zzbcVar2 = zzbcVar4;
                                                    i26 = i74;
                                                    i27 = i28;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                bArr2 = bArr5;
                                                zzbcVar2 = zzbcVar4;
                                                i26 = i74;
                                                i27 = i28;
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 67:
                                                unsafe5 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                zzbcVar4 = zzbcVar6;
                                                bArr5 = bArr4;
                                                i28 = i23;
                                                obj2 = obj;
                                                if (i51 == 0) {
                                                    iZza = zzbd.zzk(bArr5, i28, zzbcVar4);
                                                    unsafe10.putObject(obj2, j, Long.valueOf(zzbu.zzc(zzbcVar4.zzb)));
                                                    unsafe10.putInt(obj2, j2, i47);
                                                    unsafe2 = unsafe5;
                                                    bArr2 = bArr5;
                                                    iZzl = iZza;
                                                    zzbcVar2 = zzbcVar4;
                                                    i26 = i74;
                                                    i27 = i28;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                unsafe2 = unsafe5;
                                                bArr2 = bArr5;
                                                zzbcVar2 = zzbcVar4;
                                                i26 = i74;
                                                i27 = i28;
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                            case 68:
                                                if (i51 == 3) {
                                                    obj2 = obj;
                                                    Object objZzy2 = zzefVar.zzy(obj2, i24, i25);
                                                    i28 = i23;
                                                    zzbcVar4 = zzbcVar6;
                                                    iZzl = zzbd.zzl(objZzy2, zzefVar.zzv(i25), bArr, i28, i2, (i74 & (-8)) | 4, zzbcVar);
                                                    zzefVar.zzG(obj2, i24, i25, objZzy2);
                                                    unsafe2 = unsafe9;
                                                    bArr2 = bArr4;
                                                    i44 = i25;
                                                    i47 = i24;
                                                    zzbcVar2 = zzbcVar4;
                                                    i26 = i74;
                                                    i27 = i28;
                                                    if (iZzl != i27) {
                                                    }
                                                }
                                                break;
                                            default:
                                                obj2 = obj;
                                                unsafe2 = unsafe9;
                                                i44 = i25;
                                                i47 = i24;
                                                i26 = i74;
                                                i27 = i23;
                                                zzbcVar2 = zzbcVar6;
                                                bArr2 = bArr4;
                                                iZzl = i27;
                                                if (iZzl != i27) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i51 == 2) {
                                            Unsafe unsafe11 = zzb;
                                            Object objZzw = zzefVar.zzw(i25);
                                            Object object = unsafe11.getObject(obj, j);
                                            if (!((zzdw) object).zze()) {
                                                zzdw zzdwVarZzb = zzdw.zza().zzb();
                                                zzdx.zza(zzdwVarZzb, object);
                                                unsafe11.putObject(obj, j, zzdwVarZzb);
                                            }
                                            throw null;
                                        }
                                        obj2 = obj;
                                        i11 = i23;
                                        unsafe2 = unsafe9;
                                        i44 = i25;
                                        i47 = i24;
                                        i45 = i74;
                                        i46 = i22;
                                        i4 = i3;
                                    }
                                } else {
                                    long j3 = i52;
                                    Unsafe unsafe12 = zzb;
                                    zzcz zzczVarZzd = (zzcz) unsafe12.getObject(obj2, j);
                                    if (!zzczVarZzd.zzc()) {
                                        int size = zzczVarZzd.size();
                                        zzczVarZzd = zzczVarZzd.zzd(size != 0 ? size + size : 10);
                                        unsafe12.putObject(obj2, j, zzczVarZzd);
                                    }
                                    zzcz zzczVar = zzczVarZzd;
                                    switch (iZzr) {
                                        case 18:
                                        case 35:
                                            bArr4 = bArr;
                                            i29 = i2;
                                            i30 = i75;
                                            i31 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i32 = i73;
                                            unsafe6 = unsafe9;
                                            if (i51 == 2) {
                                                zzca zzcaVar = (zzca) zzczVar;
                                                iZzh2 = zzbd.zzh(bArr4, i31, zzbcVar6);
                                                int i79 = zzbcVar6.zza + iZzh2;
                                                while (iZzh2 < i79) {
                                                    zzcaVar.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, iZzh2)));
                                                    iZzh2 += 8;
                                                }
                                                if (iZzh2 != i79) {
                                                    throw zzdc.zzg();
                                                }
                                            } else if (i51 == 1) {
                                                iZzh2 = i31 + 8;
                                                zzca zzcaVar2 = (zzca) zzczVar;
                                                zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, i31)));
                                                while (iZzh2 < i29) {
                                                    int iZzh5 = zzbd.zzh(bArr4, iZzh2, zzbcVar6);
                                                    if (i74 == zzbcVar6.zza) {
                                                        zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, iZzh5)));
                                                        iZzh2 = iZzh5 + 8;
                                                    }
                                                }
                                            } else {
                                                iZzh2 = i31;
                                            }
                                            if (iZzh2 == i31) {
                                                obj2 = obj;
                                                i11 = iZzh2;
                                                unsafe2 = unsafe6;
                                                i45 = i74;
                                                i4 = i3;
                                                i44 = i30;
                                                i47 = i32;
                                                i46 = i22;
                                                break;
                                            } else {
                                                i42 = i3;
                                                iZzl = iZzh2;
                                                i41 = i29;
                                                unsafe8 = unsafe6;
                                                zzbcVar5 = zzbcVar6;
                                                i45 = i74;
                                                i43 = 0;
                                                i48 = i10;
                                                obj2 = obj;
                                                i44 = i30;
                                                i47 = i32;
                                                bArr7 = bArr4;
                                                break;
                                            }
                                        case 19:
                                        case 36:
                                            bArr4 = bArr;
                                            i29 = i2;
                                            i30 = i75;
                                            i31 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i32 = i73;
                                            unsafe6 = unsafe9;
                                            if (i51 == 2) {
                                                zzck zzckVar = (zzck) zzczVar;
                                                iZzh2 = zzbd.zzh(bArr4, i31, zzbcVar6);
                                                int i80 = zzbcVar6.zza + iZzh2;
                                                while (iZzh2 < i80) {
                                                    zzckVar.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, iZzh2)));
                                                    iZzh2 += 4;
                                                }
                                                if (iZzh2 != i80) {
                                                    throw zzdc.zzg();
                                                }
                                            } else if (i51 == 5) {
                                                iZzh2 = i31 + 4;
                                                zzck zzckVar2 = (zzck) zzczVar;
                                                zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, i31)));
                                                while (iZzh2 < i29) {
                                                    int iZzh6 = zzbd.zzh(bArr4, iZzh2, zzbcVar6);
                                                    if (i74 == zzbcVar6.zza) {
                                                        zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, iZzh6)));
                                                        iZzh2 = iZzh6 + 4;
                                                    }
                                                }
                                            }
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            bArr4 = bArr;
                                            i29 = i2;
                                            i30 = i75;
                                            i31 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i32 = i73;
                                            unsafe6 = unsafe9;
                                            if (i51 == 2) {
                                                zzdr zzdrVar = (zzdr) zzczVar;
                                                iZzh2 = zzbd.zzh(bArr4, i31, zzbcVar6);
                                                int i81 = zzbcVar6.zza + iZzh2;
                                                while (iZzh2 < i81) {
                                                    iZzh2 = zzbd.zzk(bArr4, iZzh2, zzbcVar6);
                                                    zzdrVar.zzf(zzbcVar6.zzb);
                                                }
                                                if (iZzh2 != i81) {
                                                    throw zzdc.zzg();
                                                }
                                            } else if (i51 == 0) {
                                                zzdr zzdrVar2 = (zzdr) zzczVar;
                                                iZzh2 = zzbd.zzk(bArr4, i31, zzbcVar6);
                                                zzdrVar2.zzf(zzbcVar6.zzb);
                                                while (iZzh2 < i29) {
                                                    int iZzh7 = zzbd.zzh(bArr4, iZzh2, zzbcVar6);
                                                    if (i74 == zzbcVar6.zza) {
                                                        iZzh2 = zzbd.zzk(bArr4, iZzh7, zzbcVar6);
                                                        zzdrVar2.zzf(zzbcVar6.zzb);
                                                    }
                                                }
                                            }
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            bArr4 = bArr;
                                            unsafe7 = unsafe9;
                                            i29 = i2;
                                            i33 = i75;
                                            i34 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i35 = i73;
                                            if (i51 == 2) {
                                                iZzf = zzbd.zzf(bArr4, i34, zzczVar, zzbcVar6);
                                                i32 = i35;
                                                iZzh2 = iZzf;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                if (iZzh2 == i31) {
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    i32 = i35;
                                                    unsafe6 = unsafe7;
                                                    i31 = i34;
                                                    i30 = i33;
                                                    iZzh2 = zzbd.zzj(i74, bArr, i34, i2, zzczVar, zzbcVar);
                                                    if (iZzh2 == i31) {
                                                    }
                                                }
                                                i32 = i35;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            bArr4 = bArr;
                                            unsafe7 = unsafe9;
                                            i29 = i2;
                                            i33 = i75;
                                            i34 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i35 = i73;
                                            if (i51 == 2) {
                                                zzdr zzdrVar3 = (zzdr) zzczVar;
                                                iZzf = zzbd.zzh(bArr4, i34, zzbcVar6);
                                                int i82 = zzbcVar6.zza + iZzf;
                                                while (iZzf < i82) {
                                                    zzdrVar3.zzf(zzbd.zzn(bArr4, iZzf));
                                                    iZzf += 8;
                                                }
                                                if (iZzf != i82) {
                                                    throw zzdc.zzg();
                                                }
                                                i32 = i35;
                                                iZzh2 = iZzf;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                if (iZzh2 == i31) {
                                                }
                                            } else {
                                                if (i51 == 1) {
                                                    iZze = i34 + 8;
                                                    zzdr zzdrVar4 = (zzdr) zzczVar;
                                                    zzdrVar4.zzf(zzbd.zzn(bArr4, i34));
                                                    while (iZze < i29) {
                                                        int iZzh8 = zzbd.zzh(bArr4, iZze, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            zzdrVar4.zzf(zzbd.zzn(bArr4, iZzh8));
                                                            iZze = iZzh8 + 8;
                                                        } else {
                                                            i32 = i35;
                                                            unsafe6 = unsafe7;
                                                            i30 = i33;
                                                            iZzh2 = iZze;
                                                            i31 = i34;
                                                            if (iZzh2 == i31) {
                                                            }
                                                        }
                                                    }
                                                    i32 = i35;
                                                    unsafe6 = unsafe7;
                                                    i30 = i33;
                                                    iZzh2 = iZze;
                                                    i31 = i34;
                                                    if (iZzh2 == i31) {
                                                    }
                                                }
                                                i32 = i35;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr4 = bArr;
                                            unsafe7 = unsafe9;
                                            i29 = i2;
                                            i33 = i75;
                                            i34 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i35 = i73;
                                            if (i51 == 2) {
                                                zzct zzctVar = (zzct) zzczVar;
                                                iZzf = zzbd.zzh(bArr4, i34, zzbcVar6);
                                                int i83 = zzbcVar6.zza + iZzf;
                                                while (iZzf < i83) {
                                                    zzctVar.zzg(zzbd.zzb(bArr4, iZzf));
                                                    iZzf += 4;
                                                }
                                                if (iZzf != i83) {
                                                    throw zzdc.zzg();
                                                }
                                                i32 = i35;
                                                iZzh2 = iZzf;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                if (iZzh2 == i31) {
                                                }
                                            } else {
                                                if (i51 == 5) {
                                                    iZze = i34 + 4;
                                                    zzct zzctVar2 = (zzct) zzczVar;
                                                    zzctVar2.zzg(zzbd.zzb(bArr4, i34));
                                                    while (iZze < i29) {
                                                        int iZzh9 = zzbd.zzh(bArr4, iZze, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            zzctVar2.zzg(zzbd.zzb(bArr4, iZzh9));
                                                            iZze = iZzh9 + 4;
                                                        } else {
                                                            i32 = i35;
                                                            unsafe6 = unsafe7;
                                                            i30 = i33;
                                                            iZzh2 = iZze;
                                                            i31 = i34;
                                                            if (iZzh2 == i31) {
                                                            }
                                                        }
                                                    }
                                                    i32 = i35;
                                                    unsafe6 = unsafe7;
                                                    i30 = i33;
                                                    iZzh2 = iZze;
                                                    i31 = i34;
                                                    if (iZzh2 == i31) {
                                                    }
                                                }
                                                i32 = i35;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            bArr4 = bArr;
                                            unsafe7 = unsafe9;
                                            i29 = i2;
                                            i33 = i75;
                                            i34 = i53;
                                            zzbcVar6 = zzbcVar6;
                                            i35 = i73;
                                            if (i51 == 2) {
                                                zzbe zzbeVar = (zzbe) zzczVar;
                                                iZzf = zzbd.zzh(bArr4, i34, zzbcVar6);
                                                int i84 = zzbcVar6.zza + iZzf;
                                                while (iZzf < i84) {
                                                    iZzf = zzbd.zzk(bArr4, iZzf, zzbcVar6);
                                                    zzbeVar.zze(zzbcVar6.zzb != 0);
                                                }
                                                if (iZzf != i84) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    zzbe zzbeVar2 = (zzbe) zzczVar;
                                                    iZzf = zzbd.zzk(bArr4, i34, zzbcVar6);
                                                    zzbeVar2.zze(zzbcVar6.zzb != 0);
                                                    while (iZzf < i29) {
                                                        int iZzh10 = zzbd.zzh(bArr4, iZzf, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            iZzf = zzbd.zzk(bArr4, iZzh10, zzbcVar6);
                                                            zzbeVar2.zze(zzbcVar6.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i32 = i35;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            i32 = i35;
                                            iZzh2 = iZzf;
                                            unsafe6 = unsafe7;
                                            i31 = i34;
                                            i30 = i33;
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        case 26:
                                            unsafe7 = unsafe9;
                                            i29 = i2;
                                            i33 = i75;
                                            i34 = i53;
                                            i35 = i73;
                                            bArr4 = bArr;
                                            zzbcVar6 = zzbcVar6;
                                            if (i51 == 2) {
                                                if ((j3 & SVG.SPECIFIED_CLIP_RULE) == 0) {
                                                    iZzf = zzbd.zzh(bArr4, i34, zzbcVar6);
                                                    int i85 = zzbcVar6.zza;
                                                    if (i85 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i85 == 0) {
                                                        zzczVar.add("");
                                                    } else {
                                                        zzczVar.add(new String(bArr4, iZzf, i85, zzda.zzb));
                                                        iZzf += i85;
                                                    }
                                                    while (iZzf < i29) {
                                                        int iZzh11 = zzbd.zzh(bArr4, iZzf, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            iZzf = zzbd.zzh(bArr4, iZzh11, zzbcVar6);
                                                            int i86 = zzbcVar6.zza;
                                                            if (i86 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i86 == 0) {
                                                                zzczVar.add("");
                                                            } else {
                                                                zzczVar.add(new String(bArr4, iZzf, i86, zzda.zzb));
                                                                iZzf += i86;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iZzf = zzbd.zzh(bArr4, i34, zzbcVar6);
                                                    int i87 = zzbcVar6.zza;
                                                    if (i87 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i87 == 0) {
                                                        zzczVar.add("");
                                                    } else {
                                                        int i88 = iZzf + i87;
                                                        if (!zzfu.zze(bArr4, iZzf, i88)) {
                                                            throw zzdc.zzc();
                                                        }
                                                        zzczVar.add(new String(bArr4, iZzf, i87, zzda.zzb));
                                                        iZzf = i88;
                                                    }
                                                    while (iZzf < i29) {
                                                        int iZzh12 = zzbd.zzh(bArr4, iZzf, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            iZzf = zzbd.zzh(bArr4, iZzh12, zzbcVar6);
                                                            int i89 = zzbcVar6.zza;
                                                            if (i89 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i89 == 0) {
                                                                zzczVar.add("");
                                                            } else {
                                                                int i90 = iZzf + i89;
                                                                if (!zzfu.zze(bArr4, iZzf, i90)) {
                                                                    throw zzdc.zzc();
                                                                }
                                                                zzczVar.add(new String(bArr4, iZzf, i89, zzda.zzb));
                                                                iZzf = i90;
                                                            }
                                                        }
                                                    }
                                                }
                                                i32 = i35;
                                                iZzh2 = iZzf;
                                                unsafe6 = unsafe7;
                                                i31 = i34;
                                                i30 = i33;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            i32 = i35;
                                            unsafe6 = unsafe7;
                                            i31 = i34;
                                            i30 = i33;
                                            iZzh2 = i31;
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        case 27:
                                            i36 = i73;
                                            if (i51 == 2) {
                                                zzefVar = this;
                                                i34 = i53;
                                                i29 = i2;
                                                iZze = zzbd.zze(zzefVar.zzv(i75), i74, bArr, i34, i2, zzczVar, zzbcVar);
                                                i32 = i36;
                                                bArr4 = bArr;
                                                unsafe6 = unsafe9;
                                                i30 = i75;
                                                zzbcVar6 = zzbcVar6;
                                                iZzh2 = iZze;
                                                i31 = i34;
                                                if (iZzh2 == i31) {
                                                }
                                            } else {
                                                zzefVar = this;
                                                i29 = i2;
                                                i30 = i75;
                                                i31 = i53;
                                                bArr4 = bArr;
                                                unsafe6 = unsafe9;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i36;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i36 = i73;
                                            if (i51 == 2) {
                                                int iZzh13 = zzbd.zzh(bArr, i53, zzbcVar6);
                                                int i91 = zzbcVar6.zza;
                                                if (i91 < 0) {
                                                    throw zzdc.zzd();
                                                }
                                                if (i91 > bArr.length - iZzh13) {
                                                    throw zzdc.zzg();
                                                }
                                                if (i91 == 0) {
                                                    zzczVar.add(zzbq.zzb);
                                                } else {
                                                    zzczVar.add(zzbq.zzl(bArr, iZzh13, i91));
                                                    iZzh13 += i91;
                                                }
                                                while (iZzh13 < i2) {
                                                    int iZzh14 = zzbd.zzh(bArr, iZzh13, zzbcVar6);
                                                    if (i74 == zzbcVar6.zza) {
                                                        iZzh13 = zzbd.zzh(bArr, iZzh14, zzbcVar6);
                                                        int i92 = zzbcVar6.zza;
                                                        if (i92 < 0) {
                                                            throw zzdc.zzd();
                                                        }
                                                        if (i92 > bArr.length - iZzh13) {
                                                            throw zzdc.zzg();
                                                        }
                                                        if (i92 == 0) {
                                                            zzczVar.add(zzbq.zzb);
                                                        } else {
                                                            zzczVar.add(zzbq.zzl(bArr, iZzh13, i92));
                                                            iZzh13 += i92;
                                                        }
                                                    } else {
                                                        i30 = i75;
                                                        i31 = i53;
                                                        i29 = i2;
                                                        unsafe6 = unsafe9;
                                                        bArr4 = bArr;
                                                        zzbcVar6 = zzbcVar6;
                                                        i32 = i36;
                                                        iZzh2 = iZzh13;
                                                        zzefVar = this;
                                                        if (iZzh2 == i31) {
                                                        }
                                                    }
                                                }
                                                i30 = i75;
                                                i31 = i53;
                                                i29 = i2;
                                                unsafe6 = unsafe9;
                                                bArr4 = bArr;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i36;
                                                iZzh2 = iZzh13;
                                                zzefVar = this;
                                                if (iZzh2 == i31) {
                                                }
                                            } else {
                                                zzefVar = this;
                                                i30 = i75;
                                                i31 = i53;
                                                i29 = i2;
                                                unsafe6 = unsafe9;
                                                bArr4 = bArr;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i36;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            bArr6 = bArr;
                                            i37 = i2;
                                            if (i51 == 2) {
                                                iZzj = zzbd.zzf(bArr6, i53, zzczVar, zzbcVar6);
                                            } else if (i51 == 0) {
                                                iZzj = zzbd.zzj(i74, bArr, i53, i2, zzczVar, zzbcVar);
                                            } else {
                                                zzefVar = this;
                                                i30 = i75;
                                                i31 = i53;
                                                i29 = i37;
                                                unsafe6 = unsafe9;
                                                bArr4 = bArr6;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i73;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            zzcw zzcwVarZzu3 = zzefVar.zzu(i75);
                                            zzff zzffVar = zzefVar.zzm;
                                            int i93 = zzeq.zza;
                                            if (zzcwVarZzu3 == null) {
                                                i38 = iZzj;
                                                i39 = i73;
                                            } else if (zzczVar instanceof RandomAccess) {
                                                int size2 = zzczVar.size();
                                                Object objZzo = null;
                                                int i94 = 0;
                                                int i95 = 0;
                                                while (i94 < size2) {
                                                    int i96 = iZzj;
                                                    Integer num = (Integer) zzczVar.get(i94);
                                                    int iIntValue = num.intValue();
                                                    if (zzcwVarZzu3.zza(iIntValue)) {
                                                        if (i94 != i95) {
                                                            zzczVar.set(i95, num);
                                                        }
                                                        i95++;
                                                        i40 = i73;
                                                    } else {
                                                        i40 = i73;
                                                        objZzo = zzeq.zzo(obj2, i40, iIntValue, objZzo, zzffVar);
                                                    }
                                                    i94++;
                                                    i73 = i40;
                                                    iZzj = i96;
                                                }
                                                i38 = iZzj;
                                                i39 = i73;
                                                if (i95 != size2) {
                                                    zzczVar.subList(i95, size2).clear();
                                                }
                                            } else {
                                                i38 = iZzj;
                                                i39 = i73;
                                                Iterator it = zzczVar.iterator();
                                                Object objZzo2 = null;
                                                while (it.hasNext()) {
                                                    int iIntValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzcwVarZzu3.zza(iIntValue2)) {
                                                        objZzo2 = zzeq.zzo(obj2, i39, iIntValue2, objZzo2, zzffVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            zzefVar = this;
                                            i30 = i75;
                                            i31 = i53;
                                            i29 = i37;
                                            unsafe6 = unsafe9;
                                            bArr4 = bArr6;
                                            zzbcVar6 = zzbcVar6;
                                            i32 = i39;
                                            iZzh2 = i38;
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr6 = bArr;
                                            i37 = i2;
                                            if (i51 == 2) {
                                                zzct zzctVar3 = (zzct) zzczVar;
                                                iZzh2 = zzbd.zzh(bArr6, i53, zzbcVar6);
                                                int i97 = zzbcVar6.zza + iZzh2;
                                                while (iZzh2 < i97) {
                                                    iZzh2 = zzbd.zzh(bArr6, iZzh2, zzbcVar6);
                                                    zzctVar3.zzg(zzbu.zzb(zzbcVar6.zza));
                                                }
                                                if (iZzh2 != i97) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    zzct zzctVar4 = (zzct) zzczVar;
                                                    iZzh2 = zzbd.zzh(bArr6, i53, zzbcVar6);
                                                    zzctVar4.zzg(zzbu.zzb(zzbcVar6.zza));
                                                    while (iZzh2 < i37) {
                                                        int iZzh15 = zzbd.zzh(bArr6, iZzh2, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            iZzh2 = zzbd.zzh(bArr6, iZzh15, zzbcVar6);
                                                            zzctVar4.zzg(zzbu.zzb(zzbcVar6.zza));
                                                        }
                                                    }
                                                }
                                                i30 = i75;
                                                i31 = i53;
                                                i29 = i37;
                                                unsafe6 = unsafe9;
                                                bArr4 = bArr6;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i73;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            i30 = i75;
                                            i31 = i53;
                                            i29 = i37;
                                            unsafe6 = unsafe9;
                                            bArr4 = bArr6;
                                            zzbcVar6 = zzbcVar6;
                                            i32 = i73;
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr6 = bArr;
                                            i37 = i2;
                                            if (i51 == 2) {
                                                zzdr zzdrVar5 = (zzdr) zzczVar;
                                                iZzh2 = zzbd.zzh(bArr6, i53, zzbcVar6);
                                                int i98 = zzbcVar6.zza + iZzh2;
                                                while (iZzh2 < i98) {
                                                    iZzh2 = zzbd.zzk(bArr6, iZzh2, zzbcVar6);
                                                    zzdrVar5.zzf(zzbu.zzc(zzbcVar6.zzb));
                                                }
                                                if (iZzh2 != i98) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    zzdr zzdrVar6 = (zzdr) zzczVar;
                                                    iZzh2 = zzbd.zzk(bArr6, i53, zzbcVar6);
                                                    zzdrVar6.zzf(zzbu.zzc(zzbcVar6.zzb));
                                                    while (iZzh2 < i37) {
                                                        int iZzh16 = zzbd.zzh(bArr6, iZzh2, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            iZzh2 = zzbd.zzk(bArr6, iZzh16, zzbcVar6);
                                                            zzdrVar6.zzf(zzbu.zzc(zzbcVar6.zzb));
                                                        }
                                                    }
                                                }
                                                i30 = i75;
                                                i31 = i53;
                                                i29 = i37;
                                                unsafe6 = unsafe9;
                                                bArr4 = bArr6;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i73;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            i30 = i75;
                                            i31 = i53;
                                            i29 = i37;
                                            unsafe6 = unsafe9;
                                            bArr4 = bArr6;
                                            zzbcVar6 = zzbcVar6;
                                            i32 = i73;
                                            if (iZzh2 == i31) {
                                            }
                                            break;
                                        default:
                                            if (i51 == 3) {
                                                int i99 = (i74 & (-8)) | 4;
                                                zzeo zzeoVarZzv = zzefVar.zzv(i75);
                                                iZzh2 = zzbd.zzc(zzeoVarZzv, bArr, i53, i2, i99, zzbcVar);
                                                zzczVar.add(zzbcVar6.zzc);
                                                i37 = i2;
                                                while (true) {
                                                    if (iZzh2 < i37) {
                                                        int iZzh17 = zzbd.zzh(bArr, iZzh2, zzbcVar6);
                                                        if (i74 == zzbcVar6.zza) {
                                                            iZzh2 = zzbd.zzc(zzeoVarZzv, bArr, iZzh17, i2, i99, zzbcVar);
                                                            zzczVar.add(zzbcVar6.zzc);
                                                            zzeoVarZzv = zzeoVarZzv;
                                                        } else {
                                                            bArr6 = bArr;
                                                        }
                                                    } else {
                                                        bArr6 = bArr;
                                                    }
                                                }
                                                i30 = i75;
                                                i31 = i53;
                                                i29 = i37;
                                                unsafe6 = unsafe9;
                                                bArr4 = bArr6;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i73;
                                                if (iZzh2 == i31) {
                                                }
                                            } else {
                                                bArr4 = bArr;
                                                i29 = i2;
                                                i30 = i75;
                                                i31 = i53;
                                                zzbcVar6 = zzbcVar6;
                                                i32 = i73;
                                                unsafe6 = unsafe9;
                                                iZzh2 = i31;
                                                if (iZzh2 == i31) {
                                                }
                                            }
                                            break;
                                    }
                                }
                                i46 = i22;
                            } else if (i51 == 2) {
                                zzcz zzczVarZzd2 = (zzcz) unsafe9.getObject(obj2, j);
                                if (!zzczVarZzd2.zzc()) {
                                    int size3 = zzczVarZzd2.size();
                                    zzczVarZzd2 = zzczVarZzd2.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe9.putObject(obj2, j, zzczVarZzd2);
                                }
                                unsafe8 = unsafe9;
                                iZzl = zzbd.zze(zzefVar.zzv(i75), i74, bArr, i53, i2, zzczVarZzd2, zzbcVar);
                                i44 = i75;
                                zzbcVar5 = zzbcVar6;
                                i45 = i74;
                                i48 = i10;
                                i46 = i46;
                                i47 = i73;
                                i42 = i3;
                                bArr7 = bArr;
                                i41 = i2;
                                i43 = 0;
                            } else {
                                i22 = i46;
                                i23 = i53;
                                i24 = i73;
                                bArr4 = bArr;
                                i25 = i75;
                                i11 = i23;
                                unsafe2 = unsafe9;
                                i44 = i25;
                                i47 = i24;
                                i45 = i74;
                                i46 = i22;
                                i4 = i3;
                            }
                            byte[] bArr8 = bArr4;
                            zzbcVar2 = zzbcVar6;
                            bArr2 = bArr8;
                        }
                    }
                    if (i45 == i4 || i4 == 0) {
                        if (zzefVar.zzh || (zzcdVar = zzbcVar2.zzd) == zzcd.zza) {
                            unsafe3 = unsafe2;
                            iZzg = zzbd.zzg(i45, bArr, i11, i2, zzd(obj), zzbcVar);
                        } else {
                            if (zzcdVar.zzb(zzefVar.zzg, i47) != null) {
                                throw null;
                            }
                            unsafe3 = unsafe2;
                            iZzg = zzbd.zzg(i45, bArr, i11, i2, zzd(obj), zzbcVar);
                        }
                        i41 = i2;
                        unsafe8 = unsafe3;
                        zzbcVar5 = zzbcVar2;
                        i42 = i4;
                        i43 = i9;
                        iZzl = iZzg;
                        bArr7 = bArr2;
                        i48 = i10;
                    } else {
                        i5 = i11;
                        i48 = i10;
                        unsafe = unsafe2;
                        i6 = 1048575;
                    }
                } else {
                    iZzq = zzefVar.zzq(i50, i43);
                }
                i8 = iZzq;
                i7 = -1;
                if (i8 != i7) {
                }
                if (i45 == i4) {
                }
                if (zzefVar.zzh) {
                    unsafe3 = unsafe2;
                    iZzg = zzbd.zzg(i45, bArr, i11, i2, zzd(obj), zzbcVar);
                    i41 = i2;
                    unsafe8 = unsafe3;
                    zzbcVar5 = zzbcVar2;
                    i42 = i4;
                    i43 = i9;
                    iZzl = iZzg;
                    bArr7 = bArr2;
                    i48 = i10;
                }
            } else {
                i4 = i42;
                i5 = iZzl;
                i6 = 1048575;
                unsafe = unsafe8;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Integer.MAX_VALUE);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i2 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j = i2;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
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
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfp.zzo(obj, j, zzfp.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfp.zzp(obj, j, zzfp.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfp.zzm(obj, j, zzfp.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzeq.zza;
                    zzfp.zzs(obj, j, zzdx.zza(zzfp.zzf(obj, j), zzfp.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzfx zzfxVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        Map.Entry entry2;
        int i2;
        Iterator it2;
        int[] iArr;
        boolean z;
        boolean z2;
        Map.Entry entry3;
        if (this.zzh) {
            zzci zzciVarZzb = this.zzn.zzb(obj);
            if (zzciVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzciVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < iArr2.length) {
            int iZzs = zzs(i5);
            int[] iArr3 = this.zzc;
            int iZzr = zzr(iZzs);
            int i6 = iArr3[i5];
            if (iZzr <= 17) {
                int i7 = iArr3[i5 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i3) {
                    if (i8 == 1048575) {
                        entry3 = entry;
                        i4 = 0;
                    } else {
                        entry3 = entry;
                        i4 = unsafe.getInt(obj, i8);
                    }
                    i3 = i8;
                } else {
                    entry3 = entry;
                }
                i2 = 1 << (i7 >>> 20);
                i = i4;
                entry2 = entry3;
            } else {
                i = i4;
                entry2 = entry;
                i2 = 0;
            }
            int i9 = i3;
            while (entry2 != null && this.zzn.zza(entry2) <= i6) {
                this.zzn.zze(zzfxVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzs & 1048575;
            switch (iZzr) {
                case 0:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzf(i6, zzfp.zza(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 1:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzo(i6, zzfp.zzb(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 2:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzt(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 3:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzK(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 4:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzr(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 5:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzm(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 6:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzk(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 7:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzb(i6, zzfp.zzw(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 8:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzO(i6, unsafe.getObject(obj, j), zzfxVar);
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 9:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzv(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 10:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzd(i6, (zzbq) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 11:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzI(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 12:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzi(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 13:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzx(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 14:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzz(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 15:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzB(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 16:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzD(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 17:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzq(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 18:
                    z = false;
                    zzeq.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 19:
                    z = false;
                    zzeq.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 20:
                    z = false;
                    zzeq.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 21:
                    z = false;
                    zzeq.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 22:
                    z = false;
                    zzeq.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 23:
                    z = false;
                    zzeq.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 24:
                    z = false;
                    zzeq.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 25:
                    z = false;
                    zzeq.zzs(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 26:
                    int i10 = this.zzc[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i11 = zzeq.zza;
                    if (list != null && !list.isEmpty()) {
                        zzfxVar.zzH(i10, list);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 27:
                    int i12 = this.zzc[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv = zzv(i5);
                    int i13 = zzeq.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((zzbz) zzfxVar).zzv(i12, list2.get(i14), zzeoVarZzv);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 28:
                    int i15 = this.zzc[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzeq.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzfxVar.zze(i15, list3);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 29:
                    z2 = false;
                    zzeq.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 30:
                    z2 = false;
                    zzeq.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 31:
                    z2 = false;
                    zzeq.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 32:
                    z2 = false;
                    zzeq.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 33:
                    z2 = false;
                    zzeq.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 34:
                    z2 = false;
                    zzeq.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 35:
                    zzeq.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 36:
                    zzeq.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 37:
                    zzeq.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 38:
                    zzeq.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 39:
                    zzeq.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 40:
                    zzeq.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 41:
                    zzeq.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 42:
                    zzeq.zzs(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 43:
                    zzeq.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 44:
                    zzeq.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 45:
                    zzeq.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 46:
                    zzeq.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 47:
                    zzeq.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 48:
                    zzeq.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 49:
                    int i17 = this.zzc[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv2 = zzv(i5);
                    int i18 = zzeq.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            ((zzbz) zzfxVar).zzq(i17, list4.get(i19), zzeoVarZzv2);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 51:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzf(i6, zzm(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 52:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzo(i6, zzn(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 53:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzt(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 54:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzK(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 55:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzr(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 56:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzm(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 57:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzk(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 58:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzb(i6, zzN(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 59:
                    if (zzM(obj, i6, i5)) {
                        zzO(i6, unsafe.getObject(obj, j), zzfxVar);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 60:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzv(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 61:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzd(i6, (zzbq) unsafe.getObject(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 62:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzI(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 63:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzi(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 64:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzx(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 65:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzz(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 66:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzB(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 67:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzD(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 68:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzq(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                default:
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
            }
        }
        Iterator it3 = it;
        while (entry != null) {
            this.zzn.zze(zzfxVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zzff zzffVar = this.zzm;
        zzffVar.zzj(zzffVar.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzfp.zza(obj, j)) != Double.doubleToLongBits(zzfp.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzfp.zzb(obj, j)) != Float.floatToIntBits(zzfp.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzfp.zzw(obj, j) != zzfp.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
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
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 50:
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
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
                    long jZzp = zzp(i) & 1048575;
                    if (zzfp.zzc(obj, jZzp) != zzfp.zzc(obj2, jZzp) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x009b  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int iZzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, iZzs, zzv(i6))) {
                    return false;
                }
            } else if (iZzr == 27) {
                List list = (List) zzfp.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeo zzeoVarZzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzeoVarZzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i7, i6) && !zzK(obj, iZzs, zzv(i6))) {
                    return false;
                }
            } else if (iZzr != 49) {
                if (iZzr == 50 && !((zzdw) zzfp.zzf(obj, iZzs & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || this.zzn.zzb(obj).zzj();
    }
}
