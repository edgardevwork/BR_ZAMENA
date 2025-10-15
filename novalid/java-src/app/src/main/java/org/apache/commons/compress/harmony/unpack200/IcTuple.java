package org.apache.commons.compress.harmony.unpack200;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public class IcTuple {
    public static final int NESTED_CLASS_FLAG = 65536;

    /* renamed from: C */
    public String f9877C;

    /* renamed from: C2 */
    public String f9878C2;

    /* renamed from: F */
    public int f9879F;

    /* renamed from: N */
    public String f9880N;
    public boolean anonymous;
    public final int c2Index;
    public final int cIndex;
    public int cachedHashCode;
    public String cachedOuterClassString;
    public String cachedSimpleClassName;
    public boolean hashcodeComputed;
    public boolean initialized;
    public final int nIndex;
    public boolean outerIsAnonymous;
    public boolean predictOuter;
    public boolean predictSimple;
    public final int tIndex;
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final IcTuple[] EMPTY_ARRAY = new IcTuple[0];
    public boolean member = true;
    public int cachedOuterClassIndex = -1;
    public int cachedSimpleClassNameIndex = -1;

    public IcTuple(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5) {
        this.f9877C = str;
        this.f9879F = i;
        this.f9878C2 = str2;
        this.f9880N = str3;
        this.cIndex = i2;
        this.c2Index = i3;
        this.nIndex = i4;
        this.tIndex = i5;
        if (str3 == null) {
            this.predictSimple = true;
        }
        if (str2 == null) {
            this.predictOuter = true;
        }
        initializeClassStrings();
    }

    public boolean predicted() {
        return this.predictOuter || this.predictSimple;
    }

    public boolean nestedExplicitFlagSet() {
        return (this.f9879F & 65536) == 65536;
    }

    public String[] innerBreakAtDollar(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) <= '$') {
                arrayList.add(str.substring(i2, i));
                i2 = i + 1;
            }
            i++;
            if (i >= str.length()) {
                arrayList.add(str.substring(i2));
            }
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    public String outerClassString() {
        return this.cachedOuterClassString;
    }

    public String simpleClassName() {
        return this.cachedSimpleClassName;
    }

    public String thisClassString() {
        if (predicted()) {
            return this.f9877C;
        }
        return this.f9878C2 + "$" + this.f9880N;
    }

    public boolean isMember() {
        return this.member;
    }

    public boolean isAnonymous() {
        return this.anonymous;
    }

    public boolean outerIsAnonymous() {
        return this.outerIsAnonymous;
    }

    public final boolean computeOuterIsAnonymous() {
        String[] strArrInnerBreakAtDollar = innerBreakAtDollar(this.cachedOuterClassString);
        if (strArrInnerBreakAtDollar.length == 0) {
            throw new Error("Should have an outer before checking if it's anonymous");
        }
        for (String str : strArrInnerBreakAtDollar) {
            if (isAllDigits(str)) {
                return true;
            }
        }
        return false;
    }

    public final void initializeClassStrings() {
        if (this.initialized) {
            return;
        }
        this.initialized = true;
        if (!this.predictSimple) {
            this.cachedSimpleClassName = this.f9880N;
        }
        if (!this.predictOuter) {
            this.cachedOuterClassString = this.f9878C2;
        }
        String[] strArrInnerBreakAtDollar = innerBreakAtDollar(this.f9877C);
        int length = strArrInnerBreakAtDollar.length;
        if (strArrInnerBreakAtDollar.length < 2) {
            return;
        }
        int length2 = strArrInnerBreakAtDollar.length - 1;
        this.cachedSimpleClassName = strArrInnerBreakAtDollar[length2];
        this.cachedOuterClassString = "";
        int i = 0;
        while (i < length2) {
            this.cachedOuterClassString += strArrInnerBreakAtDollar[i];
            if (isAllDigits(strArrInnerBreakAtDollar[i])) {
                this.member = false;
            }
            i++;
            if (i != length2) {
                this.cachedOuterClassString += '$';
            }
        }
        if (!this.predictSimple) {
            this.cachedSimpleClassName = this.f9880N;
            this.cachedSimpleClassNameIndex = this.nIndex;
        }
        if (!this.predictOuter) {
            this.cachedOuterClassString = this.f9878C2;
            this.cachedOuterClassIndex = this.c2Index;
        }
        if (isAllDigits(this.cachedSimpleClassName)) {
            this.anonymous = true;
            this.member = false;
            if (nestedExplicitFlagSet()) {
                this.member = true;
            }
        }
        this.outerIsAnonymous = computeOuterIsAnonymous();
    }

    public final boolean isAllDigits(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "IcTuple (" + simpleClassName() + " in " + outerClassString() + ')';
    }

    public boolean nullSafeEquals(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        IcTuple icTuple = (IcTuple) obj;
        return nullSafeEquals(this.f9877C, icTuple.f9877C) && nullSafeEquals(this.f9878C2, icTuple.f9878C2) && nullSafeEquals(this.f9880N, icTuple.f9880N);
    }

    public final void generateHashCode() {
        this.hashcodeComputed = true;
        this.cachedHashCode = 17;
        String str = this.f9877C;
        if (str != null) {
            this.cachedHashCode = str.hashCode();
        }
        String str2 = this.f9878C2;
        if (str2 != null) {
            this.cachedHashCode = str2.hashCode();
        }
        String str3 = this.f9880N;
        if (str3 != null) {
            this.cachedHashCode = str3.hashCode();
        }
    }

    public int hashCode() {
        if (!this.hashcodeComputed) {
            generateHashCode();
        }
        return this.cachedHashCode;
    }

    public String getC() {
        return this.f9877C;
    }

    public int getF() {
        return this.f9879F;
    }

    public String getC2() {
        return this.f9878C2;
    }

    public String getN() {
        return this.f9880N;
    }

    public int getTupleIndex() {
        return this.tIndex;
    }

    public int thisClassIndex() {
        if (predicted()) {
            return this.cIndex;
        }
        return -1;
    }

    public int outerClassIndex() {
        return this.cachedOuterClassIndex;
    }

    public int simpleClassNameIndex() {
        return this.cachedSimpleClassNameIndex;
    }
}
