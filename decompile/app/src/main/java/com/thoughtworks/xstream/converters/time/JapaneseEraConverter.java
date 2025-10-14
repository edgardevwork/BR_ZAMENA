package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.time.chrono.JapaneseEra;

/* loaded from: classes7.dex */
public class JapaneseEraConverter extends AbstractSingleValueConverter {
    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && JapaneseEraConverter$$ExternalSyntheticApiModelOutline0.m4738m().isAssignableFrom(cls);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public JapaneseEra fromString(String str) {
        if (str == null) {
            return null;
        }
        try {
            return JapaneseEra.valueOf(str);
        } catch (IllegalArgumentException e) {
            ConversionException conversionException = new ConversionException("Cannot parse value as Japanese era", e);
            conversionException.add("value", str);
            throw conversionException;
        }
    }
}
