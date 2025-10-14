package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;

/* loaded from: classes5.dex */
public class RuntimeVisibleorInvisibleAnnotationsAttribute extends AnnotationsAttribute {
    public final AnnotationsAttribute.Annotation[] annotations;
    public final int num_annotations;

    public RuntimeVisibleorInvisibleAnnotationsAttribute(CPUTF8 cputf8, AnnotationsAttribute.Annotation[] annotationArr) {
        super(cputf8);
        this.num_annotations = annotationArr.length;
        this.annotations = annotationArr;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public int getLength() {
        int length = 2;
        for (int i = 0; i < this.num_annotations; i++) {
            length += this.annotations[i].getLength();
        }
        return length;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        for (AnnotationsAttribute.Annotation annotation : this.annotations) {
            annotation.resolve(classConstantPool);
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        int size = dataOutputStream.size();
        dataOutputStream.writeShort(this.num_annotations);
        for (int i = 0; i < this.num_annotations; i++) {
            this.annotations[i].writeBody(dataOutputStream);
        }
        if (dataOutputStream.size() - size != getLength()) {
            throw new Error();
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return this.attributeName.underlyingString() + ": " + this.num_annotations + " annotations";
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.attributeName);
        for (AnnotationsAttribute.Annotation annotation : this.annotations) {
            arrayList.addAll(annotation.getClassFileEntries());
        }
        return (ClassFileEntry[]) arrayList.toArray(ClassFileEntry.NONE);
    }
}
