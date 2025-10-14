package com.thoughtworks.xstream.converters.basic;

/* loaded from: classes5.dex */
public class StringBufferConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$StringBuffer;

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return new StringBuffer(str);
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
        Class clsClass$ = class$java$lang$StringBuffer;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.StringBuffer");
            class$java$lang$StringBuffer = clsClass$;
        }
        return cls == clsClass$;
    }
}
