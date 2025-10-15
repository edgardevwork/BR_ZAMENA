package com.thoughtworks.xstream.converters.basic;

/* loaded from: classes5.dex */
public class ByteConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Byte;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != Byte.TYPE) {
            Class clsClass$ = class$java$lang$Byte;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Byte");
                class$java$lang$Byte = clsClass$;
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
        if (iIntValue < -128 || iIntValue > 255) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("For input string: \"");
            stringBuffer.append(str);
            stringBuffer.append('\"');
            throw new NumberFormatException(stringBuffer.toString());
        }
        return new Byte((byte) iIntValue);
    }
}
