package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes8.dex */
public class CPDouble extends CPConstant<CPDouble> {
    public final double theDouble;

    public CPDouble(double d) {
        this.theDouble = d;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPDouble cPDouble) {
        return Double.compare(this.theDouble, cPDouble.theDouble);
    }

    public double getDouble() {
        return this.theDouble;
    }
}
