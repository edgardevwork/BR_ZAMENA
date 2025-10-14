package com.thoughtworks.xstream.converters;

/* loaded from: classes8.dex */
public interface UnmarshallingContext extends DataHolder {
    void addCompletionCallback(Runnable runnable, int i);

    Object convertAnother(Object obj, Class cls);

    Object convertAnother(Object obj, Class cls, Converter converter);

    Object currentObject();

    Class getRequiredType();
}
