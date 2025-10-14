package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes8.dex */
public class CPFloat extends CPConstant<CPFloat> {
    public final float theFloat;

    public CPFloat(float f) {
        this.theFloat = f;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPFloat cPFloat) {
        return Float.compare(this.theFloat, cPFloat.theFloat);
    }

    public float getFloat() {
        return this.theFloat;
    }
}
