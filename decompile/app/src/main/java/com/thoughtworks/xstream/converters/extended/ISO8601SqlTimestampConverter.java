package com.thoughtworks.xstream.converters.extended;

import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes7.dex */
public class ISO8601SqlTimestampConverter extends ISO8601DateConverter {
    public static final String PADDING = "000000000";
    public static /* synthetic */ Class class$java$sql$Timestamp;
    public static /* synthetic */ Class class$java$util$Date;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.extended.ISO8601DateConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$sql$Timestamp;
        if (clsClass$ == null) {
            clsClass$ = class$(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_TIMESTAMP);
            class$java$sql$Timestamp = clsClass$;
        }
        if (cls == clsClass$) {
            Class clsClass$2 = class$java$util$Date;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.util.Date");
                class$java$util$Date = clsClass$2;
            }
            if (super.canConvert(clsClass$2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.converters.extended.ISO8601DateConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) throws NumberFormatException {
        int iLastIndexOf = str.lastIndexOf(46);
        int i = 0;
        if (iLastIndexOf > 0) {
            int i2 = iLastIndexOf + 1;
            int i3 = i2;
            while (Character.isDigit(str.charAt(i3))) {
                i3++;
            }
            int i4 = Integer.parseInt(str.substring(i2, i3));
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, iLastIndexOf));
            stringBuffer.append(str.substring(i3));
            str = stringBuffer.toString();
            i = i4;
        }
        Timestamp timestamp = new Timestamp(((Date) super.fromString(str)).getTime());
        timestamp.setNanos(i);
        return timestamp;
    }

    @Override // com.thoughtworks.xstream.converters.extended.ISO8601DateConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        Timestamp timestamp = (Timestamp) obj;
        String string = super.toString(new Date((timestamp.getTime() / 1000) * 1000));
        String strValueOf = String.valueOf(timestamp.getNanos());
        int iLastIndexOf = string.lastIndexOf(46);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string.substring(0, iLastIndexOf + 1));
        stringBuffer.append(PADDING.substring(strValueOf.length()));
        stringBuffer.append(strValueOf);
        stringBuffer.append(string.substring(iLastIndexOf + 4));
        return stringBuffer.toString();
    }
}
