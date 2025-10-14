package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public class CPMember extends ClassFileEntry {
    public List<Attribute> attributes;
    public final CPUTF8 descriptor;
    public transient int descriptorIndex;
    public short flags;
    public CPUTF8 name;
    public transient int nameIndex;

    public CPMember(CPUTF8 cputf8, CPUTF8 cputf82, long j, List<Attribute> list) {
        Objects.requireNonNull(cputf8, "name");
        this.name = cputf8;
        Objects.requireNonNull(cputf82, "descriptor");
        this.descriptor = cputf82;
        this.flags = (short) j;
        this.attributes = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        int size = this.attributes.size();
        ClassFileEntry[] classFileEntryArr = new ClassFileEntry[size + 2];
        classFileEntryArr[0] = this.name;
        classFileEntryArr[1] = this.descriptor;
        for (int i = 0; i < size; i++) {
            classFileEntryArr[i + 2] = this.attributes.get(i);
        }
        return classFileEntryArr;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(final ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        this.nameIndex = classConstantPool.indexOf(this.name);
        this.descriptorIndex = classConstantPool.indexOf(this.descriptor);
        this.attributes.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.CPMember$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Attribute) obj).resolve(classConstantPool);
            }
        });
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
        return ((((((this.attributes.hashCode() + 31) * 31) + this.descriptor.hashCode()) * 31) + this.flags) * 31) + this.name.hashCode();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return "CPMember: " + this.name + "(" + this.descriptor + ")";
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CPMember cPMember = (CPMember) obj;
        return this.attributes.equals(cPMember.attributes) && this.descriptor.equals(cPMember.descriptor) && this.flags == cPMember.flags && this.name.equals(cPMember.name);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void doWrite(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.flags);
        dataOutputStream.writeShort(this.nameIndex);
        dataOutputStream.writeShort(this.descriptorIndex);
        int size = this.attributes.size();
        dataOutputStream.writeShort(size);
        for (int i = 0; i < size; i++) {
            this.attributes.get(i).doWrite(dataOutputStream);
        }
    }
}
