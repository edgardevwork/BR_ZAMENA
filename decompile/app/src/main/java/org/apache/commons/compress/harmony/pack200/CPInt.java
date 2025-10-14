package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes8.dex */
public class CPInt extends CPConstant<CPInt> {
    public final int theInt;

    public CPInt(int i) {
        this.theInt = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPInt cPInt) {
        return Integer.compare(this.theInt, cPInt.theInt);
    }

    public int getInt() {
        return this.theInt;
    }
}
