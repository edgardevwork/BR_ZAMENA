package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class ExceptionsAttribute extends Attribute {
    public static CPUTF8 attributeName;
    public transient int[] exceptionIndexes;
    public final CPClass[] exceptions;

    public static int hashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int iHashCode = 1;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    public ExceptionsAttribute(CPClass[] cPClassArr) {
        super(attributeName);
        this.exceptions = cPClassArr;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && Arrays.equals(this.exceptions, ((ExceptionsAttribute) obj).exceptions);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public int getLength() {
        return (this.exceptions.length * 2) + 2;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        CPClass[] cPClassArr = this.exceptions;
        ClassFileEntry[] classFileEntryArr = new ClassFileEntry[cPClassArr.length + 1];
        System.arraycopy(cPClassArr, 0, classFileEntryArr, 0, cPClassArr.length);
        classFileEntryArr[this.exceptions.length] = getAttributeName();
        return classFileEntryArr;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
        return (super.hashCode() * 31) + hashCode(this.exceptions);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        this.exceptionIndexes = new int[this.exceptions.length];
        int i = 0;
        while (true) {
            CPClass[] cPClassArr = this.exceptions;
            if (i >= cPClassArr.length) {
                return;
            }
            cPClassArr[i].resolve(classConstantPool);
            this.exceptionIndexes[i] = classConstantPool.indexOf(this.exceptions[i]);
            i++;
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Exceptions: ");
        for (CPClass cPClass : this.exceptions) {
            sb.append(cPClass);
            sb.append(' ');
        }
        return sb.toString();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.exceptionIndexes.length);
        for (int i : this.exceptionIndexes) {
            dataOutputStream.writeShort(i);
        }
    }

    public static void setAttributeName(CPUTF8 cputf8) {
        attributeName = cputf8;
    }
}
