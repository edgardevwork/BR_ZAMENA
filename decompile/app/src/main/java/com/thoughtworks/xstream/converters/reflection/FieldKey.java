package com.thoughtworks.xstream.converters.reflection;

/* loaded from: classes5.dex */
public class FieldKey {
    public final Class declaringClass;
    public final int depth;
    public final String fieldName;
    public final int order;

    public FieldKey(String str, Class cls, int i) {
        if (str == null || cls == null) {
            throw new IllegalArgumentException("fieldName or declaringClass is null");
        }
        this.fieldName = str;
        this.declaringClass = cls;
        this.order = i;
        int i2 = 0;
        while (cls.getSuperclass() != null) {
            i2++;
            cls = cls.getSuperclass();
        }
        this.depth = i2;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public Class getDeclaringClass() {
        return this.declaringClass;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getOrder() {
        return this.order;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldKey)) {
            return false;
        }
        FieldKey fieldKey = (FieldKey) obj;
        return this.declaringClass.equals(fieldKey.declaringClass) && this.fieldName.equals(fieldKey.fieldName);
    }

    public int hashCode() {
        return (this.fieldName.hashCode() * 29) + this.declaringClass.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FieldKey{order=");
        stringBuffer.append(this.order);
        stringBuffer.append(", writer=");
        stringBuffer.append(this.depth);
        stringBuffer.append(", declaringClass=");
        stringBuffer.append(this.declaringClass);
        stringBuffer.append(", fieldName='");
        stringBuffer.append(this.fieldName);
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }
}
