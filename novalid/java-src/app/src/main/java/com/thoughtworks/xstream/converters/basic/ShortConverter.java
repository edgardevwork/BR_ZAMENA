package com.thoughtworks.xstream.converters.basic;

/* loaded from: classes5.dex */
public class ShortConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Short;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != Short.TYPE) {
            Class clsClass$ = class$java$lang$Short;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Short");
                class$java$lang$Short = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        int iIntValue = Integer.decode(str).intValue();
        if (iIntValue < -32768 || iIntValue > 65535) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("For input string: \"");
            stringBuffer.append(str);
            stringBuffer.append('\"');
            throw new NumberFormatException(stringBuffer.toString());
        }
        return new Short((short) iIntValue);
    }
}
