package com.thoughtworks.xstream.core.util;

/* loaded from: classes8.dex */
public final class FastField {
    public final String declaringClass;
    public final String name;

    public FastField(String str, String str2) {
        this.name = str2;
        this.declaringClass = str;
    }

    public FastField(Class cls, String str) {
        this(cls == null ? null : cls.getName(), str);
    }

    public String getName() {
        return this.name;
    }

    public String getDeclaringClass() {
        return this.declaringClass;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FastField)) {
            return false;
        }
        FastField fastField = (FastField) obj;
        String str2 = this.declaringClass;
        if ((str2 != null || fastField.declaringClass == null) && (str2 == null || fastField.declaringClass != null)) {
            return this.name.equals(fastField.getName()) && ((str = this.declaringClass) == null || str.equals(fastField.getDeclaringClass()));
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.declaringClass;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.declaringClass == null) {
            string = "";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.declaringClass);
            stringBuffer2.append(".");
            string = stringBuffer2.toString();
        }
        stringBuffer.append(string);
        stringBuffer.append(this.name);
        return stringBuffer.toString();
    }
}
