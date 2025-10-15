package com.thoughtworks.xstream.converters.basic;

/* loaded from: classes5.dex */
public class FloatConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Float;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != Float.TYPE) {
            Class clsClass$ = class$java$lang$Float;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Float");
                class$java$lang$Float = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return Float.valueOf(str);
    }
}
