package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.util.List;

/* loaded from: classes8.dex */
public class CPMethod extends CPMember {
    public int cachedHashCode;
    public boolean hashcodeComputed;

    public CPMethod(CPUTF8 cputf8, CPUTF8 cputf82, long j, List<Attribute> list) {
        super(cputf8, cputf82, j, list);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.CPMember, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return "Method: " + this.name + "(" + this.descriptor + ")";
    }

    public final void generateHashCode() {
        this.hashcodeComputed = true;
        this.cachedHashCode = ((this.name.hashCode() + 31) * 31) + this.descriptor.hashCode();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.CPMember, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
        if (!this.hashcodeComputed) {
            generateHashCode();
        }
        return this.cachedHashCode;
    }
}
