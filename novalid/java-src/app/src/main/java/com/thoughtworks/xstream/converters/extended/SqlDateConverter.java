package com.thoughtworks.xstream.converters.extended;

import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.sql.Date;

/* loaded from: classes7.dex */
public class SqlDateConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$sql$Date;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$sql$Date;
        if (clsClass$ == null) {
            clsClass$ = class$(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_DATE);
            class$java$sql$Date = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return Date.valueOf(str);
    }
}
