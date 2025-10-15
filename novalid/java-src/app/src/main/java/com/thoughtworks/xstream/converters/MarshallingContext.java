package com.thoughtworks.xstream.converters;

/* loaded from: classes8.dex */
public interface MarshallingContext extends DataHolder {
    void convertAnother(Object obj);

    void convertAnother(Object obj, Converter converter);
}
