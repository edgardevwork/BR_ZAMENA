package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes6.dex */
final class zzat extends zzal {
    static final zzal zza = new zzat(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzat(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzat zzg(int i, Object[] objArr, zzak zzakVar) {
        int iHighestOneBit;
        short[] sArr;
        char c;
        char c2;
        byte[] bArr;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzat) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzad.zza(obj2, obj3);
            return new zzat(null, objArrCopyOf, 1);
        }
        zzaa.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i2 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzad.zza(obj4, obj5);
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = iHighestOneBit - 1;
            char c3 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr2 = new byte[iHighestOneBit];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArrCopyOf[i8];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i8 ^ i3];
                    Objects.requireNonNull(obj7);
                    zzad.zza(obj6, obj7);
                    int iZza = zzae.zza(obj6.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr2[i9] & 255;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArrCopyOf[i7] = obj6;
                                objArrCopyOf[i7 ^ 1] = obj7;
                            }
                            i6++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArrCopyOf[i11];
                                Objects.requireNonNull(obj8);
                                zzaj zzajVar = new zzaj(obj6, obj7, obj8);
                                objArrCopyOf[i11] = obj7;
                                obj = zzajVar;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                    obj = bArr;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj9 = objArrCopyOf[i15];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArrCopyOf[i15 ^ 1];
                    Objects.requireNonNull(obj10);
                    zzad.zza(obj9, obj10);
                    int iZza2 = zzae.zza(obj9.hashCode());
                    while (true) {
                        int i16 = iZza2 & i4;
                        char c4 = (char) sArr[i16];
                        if (c4 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArrCopyOf[i14] = obj9;
                                objArrCopyOf[i14 ^ 1] = obj10;
                            }
                            i12++;
                        } else {
                            if (obj9.equals(objArrCopyOf[c4])) {
                                int i17 = c4 ^ 1;
                                Object obj11 = objArrCopyOf[i17];
                                Objects.requireNonNull(obj11);
                                zzaj zzajVar2 = new zzaj(obj9, obj10, obj11);
                                objArrCopyOf[i17] = obj10;
                                obj = zzajVar2;
                                break;
                            }
                            iZza2 = i16 + 1;
                        }
                    }
                }
                if (i12 != i2) {
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i12), obj};
                    c = 1;
                }
                bArr = sArr;
            } else {
                int i18 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i2) {
                    int i21 = i20 + i20;
                    int i22 = i19 + i19;
                    Object obj12 = objArrCopyOf[i22];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArrCopyOf[i22 ^ i18];
                    Objects.requireNonNull(obj13);
                    zzad.zza(obj12, obj13);
                    int iZza3 = zzae.zza(obj12.hashCode());
                    while (true) {
                        int i23 = iZza3 & i4;
                        ?? r15 = sArr[i23];
                        if (r15 == c3) {
                            sArr[i23] = i21;
                            if (i20 < i19) {
                                objArrCopyOf[i21] = obj12;
                                objArrCopyOf[i21 ^ 1] = obj13;
                            }
                            i20++;
                        } else {
                            if (obj12.equals(objArrCopyOf[r15])) {
                                int i24 = r15 ^ 1;
                                Object obj14 = objArrCopyOf[i24];
                                Objects.requireNonNull(obj14);
                                zzaj zzajVar3 = new zzaj(obj12, obj13, obj14);
                                objArrCopyOf[i24] = obj13;
                                obj = zzajVar3;
                                break;
                            }
                            iZza3 = i23 + 1;
                            c3 = 65535;
                        }
                    }
                    i19++;
                    i18 = 1;
                    c3 = 65535;
                }
                if (i20 != i2) {
                    c = 1;
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i20), obj};
                }
                bArr = sArr;
            }
            c2 = 2;
            c = 1;
            obj = bArr;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr2 = (Object[]) obj;
            zzaj zzajVar4 = (zzaj) objArr2[c2];
            if (zzakVar == null) {
                throw zzajVar4.zza();
            }
            zzakVar.zzc = zzajVar4;
            Object obj16 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i2 = iIntValue;
        }
        return new zzat(obj15, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0003 A[EDGE_INSN: B:94:0x0003->B:54:0x0003 BREAK  A[LOOP:0: B:66:0x0038->B:72:0x004e], EDGE_INSN: B:97:0x0003->B:54:0x0003 BREAK  A[LOOP:1: B:76:0x0063->B:82:0x007a], EDGE_INSN: B:98:0x0003->B:54:0x0003 BREAK  A[LOOP:2: B:84:0x0089->B:93:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.zzal, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iZza = zzae.zza(obj.hashCode());
                        while (true) {
                            int i2 = iZza & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            iZza = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iZza2 = zzae.zza(obj.hashCode());
                        while (true) {
                            int i4 = iZza2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            iZza2 = i4 + 1;
                        }
                        obj2 = null;
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iZza3 = zzae.zza(obj.hashCode());
                        while (true) {
                            int i5 = iZza3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            iZza3 = i5 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    public final zzaf zza() {
        return new zzas(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    public final zzam zzd() {
        return new zzaq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    public final zzam zze() {
        return new zzar(this, new zzas(this.zzb, 0, this.zzd));
    }
}
