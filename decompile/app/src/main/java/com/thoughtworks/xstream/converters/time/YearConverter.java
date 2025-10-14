package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.time.Year;

/* loaded from: classes7.dex */
public class YearConverter extends AbstractSingleValueConverter {
    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return YearConverter$$ExternalSyntheticApiModelOutline0.m4794m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Year fromString(String str) {
        try {
            return Year.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            ConversionException conversionException = new ConversionException("Cannot parse value as year", e);
            conversionException.add("value", str);
            throw conversionException;
        }
    }
}
