package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes8.dex */
public abstract class CPRef extends ConstantPoolEntry {
    public String cachedToString;
    public CPClass className;
    public transient int classNameIndex;
    public CPNameAndType nameAndType;
    public transient int nameAndTypeIndex;

    public CPRef(byte b, CPClass cPClass, CPNameAndType cPNameAndType, int i) {
        super(b, i);
        Objects.requireNonNull(cPClass, "className");
        this.className = cPClass;
        Objects.requireNonNull(cPNameAndType, "descriptor");
        this.nameAndType = cPNameAndType;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || hashCode() != obj.hashCode()) {
            return false;
        }
        CPRef cPRef = (CPRef) obj;
        return this.className.equals(cPRef.className) && this.nameAndType.equals(cPRef.nameAndType);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        return new ClassFileEntry[]{this.className, this.nameAndType};
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        this.nameAndTypeIndex = classConstantPool.indexOf(this.nameAndType);
        this.classNameIndex = classConstantPool.indexOf(this.className);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        String str;
        if (this.cachedToString == null) {
            if (getTag() == 9) {
                str = "FieldRef";
            } else if (getTag() == 10) {
                str = "MethoddRef";
            } else if (getTag() == 11) {
                str = "InterfaceMethodRef";
            } else {
                str = "unknown";
            }
            this.cachedToString = str + ": " + this.className + "#" + this.nameAndType;
        }
        return this.cachedToString;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.classNameIndex);
        dataOutputStream.writeShort(this.nameAndTypeIndex);
    }
}
