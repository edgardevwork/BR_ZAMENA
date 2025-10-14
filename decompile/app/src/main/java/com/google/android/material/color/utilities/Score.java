package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Score {
    public static final int BLUE_500 = -12417548;
    public static final double CUTOFF_CHROMA = 5.0d;
    public static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    public static final int MAX_COLOR_COUNT = 4;
    public static final double TARGET_CHROMA = 48.0d;
    public static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    public static final double WEIGHT_CHROMA_BELOW = 0.1d;
    public static final double WEIGHT_PROPORTION = 0.7d;

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i) {
        return score(map, i, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i, int i2) {
        return score(map, i, i2, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i, int i2, boolean z) {
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct hctFromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(hctFromInt);
            int iFloor = (int) Math.floor(hctFromInt.getHue());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d += iIntValue;
        }
        double[] dArr = new double[360];
        for (int i3 = 0; i3 < 360; i3++) {
            double d2 = iArr[i3] / d;
            for (int i4 = i3 - 14; i4 < i3 + 16; i4++) {
                int iSanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i4);
                dArr[iSanitizeDegreesInt] = dArr[iSanitizeDegreesInt] + d2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d3 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z || (hct.getChroma() >= 5.0d && d3 > 0.01d)) {
                arrayList2.add(new ScoredHCT(hct, (d3 * 100.0d * 0.7d) + ((hct.getChroma() - 48.0d) * (hct.getChroma() < 48.0d ? 0.1d : 0.3d))));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 90; i5 >= 15; i5--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((ScoredHCT) it.next()).hct;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                    if (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it2.next()).getHue()) < i5) {
                        break;
                    }
                }
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i2));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }

    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d) {
            this.hct = hct;
            this.score = d;
        }
    }

    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }
}
