package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;

/* loaded from: classes5.dex */
public class RuntimeVisibleorInvisibleParameterAnnotationsAttribute extends AnnotationsAttribute {
    public final int num_parameters;
    public final ParameterAnnotation[] parameter_annotations;

    public RuntimeVisibleorInvisibleParameterAnnotationsAttribute(CPUTF8 cputf8, ParameterAnnotation[] parameterAnnotationArr) {
        super(cputf8);
        this.num_parameters = parameterAnnotationArr.length;
        this.parameter_annotations = parameterAnnotationArr;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public int getLength() {
        int length = 1;
        for (int i = 0; i < this.num_parameters; i++) {
            length += this.parameter_annotations[i].getLength();
        }
        return length;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        for (ParameterAnnotation parameterAnnotation : this.parameter_annotations) {
            parameterAnnotation.resolve(classConstantPool);
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.num_parameters);
        for (int i = 0; i < this.num_parameters; i++) {
            this.parameter_annotations[i].writeBody(dataOutputStream);
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return this.attributeName.underlyingString() + ": " + this.num_parameters + " parameter annotations";
    }

    /* loaded from: classes7.dex */
    public static class ParameterAnnotation {
        public final AnnotationsAttribute.Annotation[] annotations;
        public final int num_annotations;

        public ParameterAnnotation(AnnotationsAttribute.Annotation[] annotationArr) {
            this.num_annotations = annotationArr.length;
            this.annotations = annotationArr;
        }

        public void writeBody(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(this.num_annotations);
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                annotation.writeBody(dataOutputStream);
            }
        }

        public void resolve(ClassConstantPool classConstantPool) {
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                annotation.resolve(classConstantPool);
            }
        }

        public int getLength() {
            int length = 2;
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                length += annotation.getLength();
            }
            return length;
        }

        public List<Object> getClassFileEntries() {
            ArrayList arrayList = new ArrayList();
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                arrayList.addAll(annotation.getClassFileEntries());
            }
            return arrayList;
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.attributeName);
        for (ParameterAnnotation parameterAnnotation : this.parameter_annotations) {
            arrayList.addAll(parameterAnnotation.getClassFileEntries());
        }
        return (ClassFileEntry[]) arrayList.toArray(ClassFileEntry.NONE);
    }
}
