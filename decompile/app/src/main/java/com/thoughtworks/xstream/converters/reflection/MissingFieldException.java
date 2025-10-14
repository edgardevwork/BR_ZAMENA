package com.thoughtworks.xstream.converters.reflection;

/* loaded from: classes7.dex */
public class MissingFieldException extends ObjectAccessException {
    public final String className;
    public final String fieldName;

    public MissingFieldException(String str, String str2) {
        super("Field not found in class.");
        this.className = str;
        this.fieldName = str2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(".");
        stringBuffer.append(str2);
        add(SerializableConverter.ELEMENT_FIELD, stringBuffer.toString());
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getClassName() {
        return this.className;
    }
}
