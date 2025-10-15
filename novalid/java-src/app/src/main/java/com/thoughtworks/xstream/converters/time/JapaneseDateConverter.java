package com.thoughtworks.xstream.converters.time;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.util.Collections;

/* loaded from: classes7.dex */
public class JapaneseDateConverter extends AbstractChronoLocalDateConverter<JapaneseEra> {
    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public /* bridge */ /* synthetic */ ChronoLocalDate chronoLocalDateOf(Era era, int i, int i2, int i3) {
        return chronoLocalDateOf(JapaneseDateConverter$$ExternalSyntheticApiModelOutline2.m4735m(era), i, i2, i3);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return JapaneseDateConverter$$ExternalSyntheticApiModelOutline0.m4733m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return parseChronoLocalDate(str, "Japanese", Collections.singleton(JapaneseChronology.INSTANCE));
    }

    public ChronoLocalDate chronoLocalDateOf(JapaneseEra japaneseEra, int i, int i2, int i3) {
        return JapaneseDate.of(japaneseEra, i, i2, i3);
    }

    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public JapaneseEra eraOf(String str) {
        return JapaneseEra.valueOf(str);
    }
}
