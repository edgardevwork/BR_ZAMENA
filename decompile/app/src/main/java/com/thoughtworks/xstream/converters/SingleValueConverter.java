package com.thoughtworks.xstream.converters;

/* loaded from: classes8.dex */
public interface SingleValueConverter extends ConverterMatcher {
    Object fromString(String str);

    String toString(Object obj);
}
