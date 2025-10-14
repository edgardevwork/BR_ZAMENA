package com.thoughtworks.xstream.converters.extended;

import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.sql.Time;

/* loaded from: classes7.dex */
public class SqlTimeConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$sql$Time;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$sql$Time;
        if (clsClass$ == null) {
            clsClass$ = class$(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_TIME);
            class$java$sql$Time = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return Time.valueOf(str);
    }
}
