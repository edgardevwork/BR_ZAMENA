package com.thoughtworks.xstream.converters.basic;

/* loaded from: classes5.dex */
public class StringBuilderConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$StringBuilder;

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return new StringBuilder(str);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$lang$StringBuilder;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.StringBuilder");
            class$java$lang$StringBuilder = clsClass$;
        }
        return cls == clsClass$;
    }
}
