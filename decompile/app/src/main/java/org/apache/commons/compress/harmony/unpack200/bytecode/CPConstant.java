package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.util.Objects;

/* loaded from: classes8.dex */
public abstract class CPConstant extends ConstantPoolEntry {
    public final Object value;

    public CPConstant(byte b, Object obj, int i) {
        super(b, i);
        Objects.requireNonNull(obj, "value");
        this.value = obj;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CPConstant cPConstant = (CPConstant) obj;
        Object obj2 = this.value;
        if (obj2 == null) {
            if (cPConstant.value != null) {
                return false;
            }
        } else if (!obj2.equals(cPConstant.value)) {
            return false;
        }
        return true;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
        Object obj = this.value;
        return 31 + (obj == null ? 0 : obj.hashCode());
    }

    public Object getValue() {
        return this.value;
    }
}
