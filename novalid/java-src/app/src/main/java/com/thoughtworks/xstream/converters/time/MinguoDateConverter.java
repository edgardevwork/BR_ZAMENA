package com.thoughtworks.xstream.converters.time;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;
import java.time.chrono.MinguoEra;
import java.util.Collections;

/* loaded from: classes7.dex */
public class MinguoDateConverter extends AbstractChronoLocalDateConverter<MinguoEra> {
    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public /* bridge */ /* synthetic */ ChronoLocalDate chronoLocalDateOf(Era era, int i, int i2, int i3) {
        return chronoLocalDateOf(MinguoDateConverter$$ExternalSyntheticApiModelOutline0.m4753m(era), i, i2, i3);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return MinguoDateConverter$$ExternalSyntheticApiModelOutline4.m4757m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return parseChronoLocalDate(str, "Minguo", Collections.singleton(MinguoChronology.INSTANCE));
    }

    public ChronoLocalDate chronoLocalDateOf(MinguoEra minguoEra, int i, int i2, int i3) {
        return MinguoDate.of(i, i2, i3);
    }

    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public MinguoEra eraOf(String str) {
        return MinguoEra.valueOf(str);
    }
}
