package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class Hashing {

    /* renamed from: C1 */
    public static final long f814C1 = -862048943;

    /* renamed from: C2 */
    public static final long f815C2 = 461845907;
    public static final int MAX_TABLE_SIZE = 1073741824;

    public static boolean needsResizing(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    public static int smear(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * f814C1), 15) * f815C2);
    }

    public static int smearedHash(@CheckForNull Object o) {
        return smear(o == null ? 0 : o.hashCode());
    }

    public static int closedTableSize(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i = iHighestOneBit << 1;
        if (i > 0) {
            return i;
        }
        return 1073741824;
    }
}
