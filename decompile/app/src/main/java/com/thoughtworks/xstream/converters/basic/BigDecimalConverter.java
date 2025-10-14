package com.thoughtworks.xstream.converters.basic;

import java.math.BigDecimal;

/* loaded from: classes5.dex */
public class BigDecimalConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$math$BigDecimal;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$math$BigDecimal;
        if (clsClass$ == null) {
            clsClass$ = class$("java.math.BigDecimal");
            class$java$math$BigDecimal = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return new BigDecimal(str);
    }
}
