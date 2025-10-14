package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;
import org.apache.commons.compress.harmony.unpack200.SegmentUtils;

/* loaded from: classes8.dex */
public class CPNameAndType extends ConstantPoolEntry {
    public int cachedHashCode;
    public CPUTF8 descriptor;
    public transient int descriptorIndex;
    public boolean hashcodeComputed;
    public CPUTF8 name;
    public transient int nameIndex;

    public CPNameAndType(CPUTF8 cputf8, CPUTF8 cputf82, int i) {
        super((byte) 12, i);
        Objects.requireNonNull(cputf8, "name");
        this.name = cputf8;
        Objects.requireNonNull(cputf82, "descriptor");
        this.descriptor = cputf82;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        return new ClassFileEntry[]{this.name, this.descriptor};
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        this.descriptorIndex = classConstantPool.indexOf(this.descriptor);
        this.nameIndex = classConstantPool.indexOf(this.name);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.nameIndex);
        dataOutputStream.writeShort(this.descriptorIndex);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return "NameAndType: " + this.name + "(" + this.descriptor + ")";
    }

    private void generateHashCode() {
        this.hashcodeComputed = true;
        this.cachedHashCode = ((this.descriptor.hashCode() + 31) * 31) + this.name.hashCode();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
        if (!this.hashcodeComputed) {
            generateHashCode();
        }
        return this.cachedHashCode;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CPNameAndType cPNameAndType = (CPNameAndType) obj;
        return this.descriptor.equals(cPNameAndType.descriptor) && this.name.equals(cPNameAndType.name);
    }

    public int invokeInterfaceCount() {
        return SegmentUtils.countInvokeInterfaceArgs(this.descriptor.underlyingString()) + 1;
    }
}
