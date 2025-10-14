package com.thoughtworks.xstream.converters.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.time.Period;
import java.time.format.DateTimeParseException;

/* loaded from: classes7.dex */
public class PeriodConverter extends AbstractSingleValueConverter {
    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return PeriodConverter$$ExternalSyntheticApiModelOutline0.m4767m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Period fromString(String str) {
        try {
            return Period.parse(str);
        } catch (DateTimeParseException e) {
            ConversionException conversionException = new ConversionException("Cannot parse period value", e);
            conversionException.add(TypedValues.CycleType.S_WAVE_PERIOD, str);
            throw conversionException;
        }
    }
}
