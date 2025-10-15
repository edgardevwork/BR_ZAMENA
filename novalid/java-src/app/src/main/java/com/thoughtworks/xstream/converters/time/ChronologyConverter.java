package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import java.time.DateTimeException;
import java.time.chrono.Chronology;

/* loaded from: classes6.dex */
public class ChronologyConverter implements SingleValueConverter {
    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && ChronologyConverter$$ExternalSyntheticApiModelOutline0.m4721m().isAssignableFrom(cls);
    }

    @Override // com.thoughtworks.xstream.converters.SingleValueConverter
    public Chronology fromString(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Chronology.of(str);
        } catch (DateTimeException e) {
            ConversionException conversionException = new ConversionException("Cannot parse value as chronology", e);
            conversionException.add("value", str);
            throw conversionException;
        }
    }

    @Override // com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return C8635xdbec53eb.m4719m(obj).getId();
    }
}
