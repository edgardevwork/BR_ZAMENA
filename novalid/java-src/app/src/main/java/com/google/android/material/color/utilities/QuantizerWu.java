package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class QuantizerWu implements Quantizer {
    public static final int INDEX_BITS = 5;
    public static final int INDEX_COUNT = 33;
    public static final int TOTAL_SIZE = 35937;
    public Box[] cubes;
    public double[] moments;
    public int[] momentsB;
    public int[] momentsG;
    public int[] momentsR;
    public int[] weights;

    /* loaded from: classes4.dex */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static int getIndex(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb)));
        }
    }

    public void createMoments() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i4 = 0;
                int i5 = 0;
                double d = 0.0d;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i2) {
                    int index = getIndex(i, i3, i6);
                    int i9 = i4 + this.weights[index];
                    i7 += this.momentsR[index];
                    i8 += this.momentsG[index];
                    i5 += this.momentsB[index];
                    d += this.moments[index];
                    iArr[i6] = iArr[i6] + i9;
                    iArr2[i6] = iArr2[i6] + i7;
                    iArr3[i6] = iArr3[i6] + i8;
                    iArr4[i6] = iArr4[i6] + i5;
                    dArr[i6] = dArr[i6] + d;
                    int index2 = getIndex(i - 1, i3, i6);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i6];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i6];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i6];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i6];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i6];
                    i6++;
                    i4 = i9;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    public CreateBoxesResult createBoxes(int i) {
        int i2;
        this.cubes = new Box[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.cubes[i3] = new Box(null);
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.f704r1 = 32;
        box.f702g1 = 32;
        box.f700b1 = 32;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i5 >= i) {
                i2 = i;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i4], boxArr[i5]).booleanValue()) {
                Box box2 = this.cubes[i4];
                dArr[i4] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i5];
                dArr[i5] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i4] = 0.0d;
                i5--;
            }
            double d = dArr[0];
            int i6 = 0;
            for (int i7 = 1; i7 <= i5; i7++) {
                double d2 = dArr[i7];
                if (d2 > d) {
                    i6 = i7;
                    d = d2;
                }
            }
            if (d <= 0.0d) {
                i2 = i5 + 1;
                break;
            }
            i5++;
            i4 = i6;
        }
        return new CreateBoxesResult(i, i2);
    }

    public List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            Box box = this.cubes[i2];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        return (((((((this.moments[getIndex(box.f704r1, box.f702g1, box.f700b1)] - this.moments[getIndex(box.f704r1, box.f702g1, box.f699b0)]) - this.moments[getIndex(box.f704r1, box.f701g0, box.f700b1)]) + this.moments[getIndex(box.f704r1, box.f701g0, box.f699b0)]) - this.moments[getIndex(box.f703r0, box.f702g1, box.f700b1)]) + this.moments[getIndex(box.f703r0, box.f702g1, box.f699b0)]) + this.moments[getIndex(box.f703r0, box.f701g0, box.f700b1)]) - this.moments[getIndex(box.f703r0, box.f701g0, box.f699b0)]) - ((((iVolume * iVolume) + (iVolume2 * iVolume2)) + (iVolume3 * iVolume3)) / volume(box, this.weights));
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f703r0 + 1, box.f704r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f701g0 + 1, box.f702g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f699b0 + 1, box.f700b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d = maximizeResultMaximize.maximum;
        double d2 = maximizeResultMaximize2.maximum;
        double d3 = maximizeResultMaximize3.maximum;
        if (d < d2 || d < d3) {
            direction = (d2 < d || d2 < d3) ? direction3 : direction2;
        } else if (maximizeResultMaximize.cutLocation < 0) {
            return Boolean.FALSE;
        }
        box2.f704r1 = box.f704r1;
        box2.f702g1 = box.f702g1;
        box2.f700b1 = box.f700b1;
        int i = C68401.f698x8739cebf[direction.ordinal()];
        if (i == 1) {
            int i2 = maximizeResultMaximize.cutLocation;
            box.f704r1 = i2;
            box2.f703r0 = i2;
            box2.f701g0 = box.f701g0;
            box2.f699b0 = box.f699b0;
        } else if (i == 2) {
            int i3 = maximizeResultMaximize2.cutLocation;
            box.f702g1 = i3;
            box2.f703r0 = box.f703r0;
            box2.f701g0 = i3;
            box2.f699b0 = box.f699b0;
        } else if (i == 3) {
            int i4 = maximizeResultMaximize3.cutLocation;
            box.f700b1 = i4;
            box2.f703r0 = box.f703r0;
            box2.f701g0 = box.f701g0;
            box2.f699b0 = i4;
        }
        box.vol = (box.f704r1 - box.f703r0) * (box.f702g1 - box.f701g0) * (box.f700b1 - box.f699b0);
        box2.vol = (box2.f704r1 - box2.f703r0) * (box2.f702g1 - box2.f701g0) * (box2.f700b1 - box2.f699b0);
        return Boolean.TRUE;
    }

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C68401 {

        /* renamed from: $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction */
        public static final /* synthetic */ int[] f698x8739cebf;

        static {
            int[] iArr = new int[Direction.values().length];
            f698x8739cebf = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f698x8739cebf[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f698x8739cebf[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MaximizeResult maximize(Box box, Direction direction, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        Direction direction2 = direction;
        int iBottom = bottom(box2, direction2, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction2, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction2, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction2, quantizerWu.weights);
        int i8 = -1;
        double d = 0.0d;
        int i9 = i;
        while (i9 < i2) {
            int pVar = top(box2, direction2, i9, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction2, i9, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction2, i9, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction2, i9, quantizerWu.weights) + iBottom4;
            if (pVar4 == 0) {
                i7 = iBottom;
            } else {
                i7 = iBottom;
                double d2 = (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3)) / pVar4;
                int i10 = i3 - pVar;
                int i11 = i4 - pVar2;
                int i12 = i5 - pVar3;
                int i13 = i6 - pVar4;
                if (i13 != 0) {
                    double d3 = d2 + ((((i10 * i10) + (i11 * i11)) + (i12 * i12)) / i13);
                    if (d3 > d) {
                        d = d3;
                        i8 = i9;
                    }
                }
            }
            i9++;
            quantizerWu = this;
            box2 = box;
            direction2 = direction;
            iBottom = i7;
        }
        return new MaximizeResult(i8, d);
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f704r1, box.f702g1, box.f700b1)] - iArr[getIndex(box.f704r1, box.f702g1, box.f699b0)]) - iArr[getIndex(box.f704r1, box.f701g0, box.f700b1)]) + iArr[getIndex(box.f704r1, box.f701g0, box.f699b0)]) - iArr[getIndex(box.f703r0, box.f702g1, box.f700b1)]) + iArr[getIndex(box.f703r0, box.f702g1, box.f699b0)]) + iArr[getIndex(box.f703r0, box.f701g0, box.f700b1)]) - iArr[getIndex(box.f703r0, box.f701g0, box.f699b0)];
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i2;
        int i3 = C68401.f698x8739cebf[direction.ordinal()];
        if (i3 == 1) {
            i = (-iArr[getIndex(box.f703r0, box.f702g1, box.f700b1)]) + iArr[getIndex(box.f703r0, box.f702g1, box.f699b0)] + iArr[getIndex(box.f703r0, box.f701g0, box.f700b1)];
            i2 = iArr[getIndex(box.f703r0, box.f701g0, box.f699b0)];
        } else if (i3 == 2) {
            i = (-iArr[getIndex(box.f704r1, box.f701g0, box.f700b1)]) + iArr[getIndex(box.f704r1, box.f701g0, box.f699b0)] + iArr[getIndex(box.f703r0, box.f701g0, box.f700b1)];
            i2 = iArr[getIndex(box.f703r0, box.f701g0, box.f699b0)];
        } else if (i3 == 3) {
            i = (-iArr[getIndex(box.f704r1, box.f702g1, box.f699b0)]) + iArr[getIndex(box.f704r1, box.f701g0, box.f699b0)] + iArr[getIndex(box.f703r0, box.f702g1, box.f699b0)];
            i2 = iArr[getIndex(box.f703r0, box.f701g0, box.f699b0)];
        } else {
            throw new IllegalArgumentException("unexpected direction " + direction);
        }
        return i - i2;
    }

    public static int top(Box box, Direction direction, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = C68401.f698x8739cebf[direction.ordinal()];
        if (i4 == 1) {
            i2 = (iArr[getIndex(i, box.f702g1, box.f700b1)] - iArr[getIndex(i, box.f702g1, box.f699b0)]) - iArr[getIndex(i, box.f701g0, box.f700b1)];
            i3 = iArr[getIndex(i, box.f701g0, box.f699b0)];
        } else if (i4 == 2) {
            i2 = (iArr[getIndex(box.f704r1, i, box.f700b1)] - iArr[getIndex(box.f704r1, i, box.f699b0)]) - iArr[getIndex(box.f703r0, i, box.f700b1)];
            i3 = iArr[getIndex(box.f703r0, i, box.f699b0)];
        } else if (i4 == 3) {
            i2 = (iArr[getIndex(box.f704r1, box.f702g1, i)] - iArr[getIndex(box.f704r1, box.f701g0, i)]) - iArr[getIndex(box.f703r0, box.f702g1, i)];
            i3 = iArr[getIndex(box.f703r0, box.f701g0, i)];
        } else {
            throw new IllegalArgumentException("unexpected direction " + direction);
        }
        return i2 + i3;
    }

    /* loaded from: classes4.dex */
    public static final class MaximizeResult {
        public int cutLocation;
        public double maximum;

        public MaximizeResult(int i, double d) {
            this.cutLocation = i;
            this.maximum = d;
        }
    }

    /* loaded from: classes4.dex */
    public static final class CreateBoxesResult {
        public int resultCount;

        public CreateBoxesResult(int i, int i2) {
            this.resultCount = i2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Box {

        /* renamed from: b0 */
        public int f699b0;

        /* renamed from: b1 */
        public int f700b1;

        /* renamed from: g0 */
        public int f701g0;

        /* renamed from: g1 */
        public int f702g1;

        /* renamed from: r0 */
        public int f703r0;

        /* renamed from: r1 */
        public int f704r1;
        public int vol;

        public Box() {
            this.f703r0 = 0;
            this.f704r1 = 0;
            this.f701g0 = 0;
            this.f702g1 = 0;
            this.f699b0 = 0;
            this.f700b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(C68401 c68401) {
            this();
        }
    }
}
