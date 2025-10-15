package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.time.MonthDay;
import java.time.format.DateTimeParseException;

/* loaded from: classes7.dex */
public class MonthDayConverter extends AbstractSingleValueConverter {
    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return MonthDayConverter$$ExternalSyntheticApiModelOutline0.m4758m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public MonthDay fromString(String str) {
        try {
            return MonthDay.parse(str);
        } catch (DateTimeParseException e) {
            ConversionException conversionException = new ConversionException("Cannot parse value as month day", e);
            conversionException.add("value", str);
            throw conversionException;
        }
    }
}
