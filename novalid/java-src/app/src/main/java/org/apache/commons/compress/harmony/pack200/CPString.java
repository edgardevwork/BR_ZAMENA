package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes8.dex */
public class CPString extends CPConstant<CPString> {
    public final String string;
    public final CPUTF8 utf8;

    public CPString(CPUTF8 cputf8) {
        this.utf8 = cputf8;
        this.string = cputf8.getUnderlyingString();
    }

    @Override // java.lang.Comparable
    public int compareTo(CPString cPString) {
        return this.string.compareTo(cPString.string);
    }

    public String toString() {
        return this.string;
    }

    public int getIndexInCpUtf8() {
        return this.utf8.getIndex();
    }
}
