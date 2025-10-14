package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;

/* loaded from: classes8.dex */
public class EnclosingMethodAttribute extends Attribute {
    public static CPUTF8 attributeName;
    public int class_index;
    public final CPClass cpClass;
    public final CPNameAndType method;
    public int method_index;

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public int getLength() {
        return 4;
    }

    public static void setAttributeName(CPUTF8 cputf8) {
        attributeName = cputf8;
    }

    public EnclosingMethodAttribute(CPClass cPClass, CPNameAndType cPNameAndType) {
        super(attributeName);
        this.cpClass = cPClass;
        this.method = cPNameAndType;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        CPNameAndType cPNameAndType = this.method;
        if (cPNameAndType != null) {
            return new ClassFileEntry[]{attributeName, this.cpClass, cPNameAndType};
        }
        return new ClassFileEntry[]{attributeName, this.cpClass};
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        this.cpClass.resolve(classConstantPool);
        this.class_index = classConstantPool.indexOf(this.cpClass);
        CPNameAndType cPNameAndType = this.method;
        if (cPNameAndType != null) {
            cPNameAndType.resolve(classConstantPool);
            this.method_index = classConstantPool.indexOf(this.method);
        } else {
            this.method_index = 0;
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.class_index);
        dataOutputStream.writeShort(this.method_index);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return AttributeLayout.ATTRIBUTE_ENCLOSING_METHOD;
    }
}
