package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;

/* loaded from: classes6.dex */
public class OffsetTimeConverter implements SingleValueConverter {
    public static final DateTimeFormatter FORMATTER = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("HH:mm:ss").appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true).appendOffsetId().toFormatter();

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return OffsetTimeConverter$$ExternalSyntheticApiModelOutline2.m4766m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        try {
            return OffsetTime.parse(str);
        } catch (DateTimeParseException e) {
            ConversionException conversionException = new ConversionException("Cannot parse value as offset time", e);
            conversionException.add("value", str);
            throw conversionException;
        }
    }

    @Override // com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return FORMATTER.format(OffsetTimeConverter$$ExternalSyntheticApiModelOutline1.m4765m(obj));
    }
}
