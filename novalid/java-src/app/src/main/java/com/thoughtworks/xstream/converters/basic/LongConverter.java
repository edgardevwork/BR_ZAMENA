package com.thoughtworks.xstream.converters.basic;

/* loaded from: classes5.dex */
public class LongConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Long;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != Long.TYPE) {
            Class clsClass$ = class$java$lang$Long;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Long");
                class$java$lang$Long = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) throws NumberFormatException {
        long j;
        long j2;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("For input string: \"\"");
        }
        if (length < 17) {
            return Long.decode(str);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '0' && cCharAt != '#') {
            return Long.decode(str);
        }
        char cCharAt2 = str.charAt(1);
        if (cCharAt == '#' && length == 17) {
            j2 = Long.parseLong(str.substring(1, 9), 16) << 32;
            j = Long.parseLong(str.substring(9, 17), 16);
        } else if ((cCharAt2 == 'x' || cCharAt2 == 'X') && length == 18) {
            long j3 = Long.parseLong(str.substring(2, 10), 16) << 32;
            j = Long.parseLong(str.substring(10, 18), 16);
            j2 = j3;
        } else if (length == 23 && cCharAt2 == '1') {
            long j4 = Long.parseLong(str.substring(1, 12), 8) << 33;
            j = Long.parseLong(str.substring(12, 23), 8);
            j2 = j4;
        } else {
            return Long.decode(str);
        }
        return new Long(j | j2);
    }
}
