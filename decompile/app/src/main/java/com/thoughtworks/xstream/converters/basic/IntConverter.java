package com.thoughtworks.xstream.converters.basic;

import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* loaded from: classes5.dex */
public class IntConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Integer;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != Integer.TYPE) {
            Class clsClass$ = class$java$lang$Integer;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Integer");
                class$java$lang$Integer = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        long jLongValue = Long.decode(str).longValue();
        if (jLongValue < ParserMinimalBase.MIN_INT_L || jLongValue > 4294967295L) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("For input string: \"");
            stringBuffer.append(str);
            stringBuffer.append('\"');
            throw new NumberFormatException(stringBuffer.toString());
        }
        return new Integer((int) jLongValue);
    }
}
