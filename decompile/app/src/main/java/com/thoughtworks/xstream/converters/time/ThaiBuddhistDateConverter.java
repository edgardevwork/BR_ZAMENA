package com.thoughtworks.xstream.converters.time;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Collections;

/* loaded from: classes7.dex */
public class ThaiBuddhistDateConverter extends AbstractChronoLocalDateConverter<ThaiBuddhistEra> {
    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public /* bridge */ /* synthetic */ ChronoLocalDate chronoLocalDateOf(Era era, int i, int i2, int i3) {
        return chronoLocalDateOf(ThaiBuddhistDateConverter$$ExternalSyntheticApiModelOutline1.m4777m(era), i, i2, i3);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return ThaiBuddhistDateConverter$$ExternalSyntheticApiModelOutline4.m4780m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return parseChronoLocalDate(str, "Thai Buddhist", Collections.singleton(ThaiBuddhistChronology.INSTANCE));
    }

    public ChronoLocalDate chronoLocalDateOf(ThaiBuddhistEra thaiBuddhistEra, int i, int i2, int i3) {
        return ThaiBuddhistDate.of(i, i2, i3);
    }

    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public ThaiBuddhistEra eraOf(String str) {
        return ThaiBuddhistEra.valueOf(str);
    }
}
