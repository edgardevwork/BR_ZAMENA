package org.apache.commons.compress.harmony.pack200;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes6.dex */
public class CPNameAndType extends ConstantPoolEntry implements Comparable {
    public final CPUTF8 name;
    public final CPSignature signature;

    public CPNameAndType(CPUTF8 cputf8, CPSignature cPSignature) {
        this.name = cputf8;
        this.signature = cPSignature;
    }

    public String toString() {
        return this.name + StringUtils.PROCESS_POSTFIX_DELIMITER + this.signature;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof CPNameAndType)) {
            return 0;
        }
        CPNameAndType cPNameAndType = (CPNameAndType) obj;
        int iCompareTo = this.signature.compareTo(cPNameAndType.signature);
        return iCompareTo == 0 ? this.name.compareTo(cPNameAndType.name) : iCompareTo;
    }

    public int getNameIndex() {
        return this.name.getIndex();
    }

    public String getName() {
        return this.name.getUnderlyingString();
    }

    public int getTypeIndex() {
        return this.signature.getIndex();
    }
}
