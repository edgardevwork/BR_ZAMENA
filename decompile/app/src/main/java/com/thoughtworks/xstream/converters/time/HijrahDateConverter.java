package com.thoughtworks.xstream.converters.time;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.Era;
import java.time.chrono.HijrahDate;
import java.time.chrono.HijrahEra;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public class HijrahDateConverter extends AbstractChronoLocalDateConverter<HijrahEra> {
    public final Set<Chronology> hijrahChronologies = new HashSet();

    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public /* bridge */ /* synthetic */ ChronoLocalDate chronoLocalDateOf(Era era, int i, int i2, int i3) {
        return chronoLocalDateOf(HijrahDateConverter$$ExternalSyntheticApiModelOutline0.m4725m(era), i, i2, i3);
    }

    public HijrahDateConverter() {
        Iterator it = Chronology.getAvailableChronologies().iterator();
        while (it.hasNext()) {
            Chronology chronologyM4719m = C8635xdbec53eb.m4719m(it.next());
            if (HijrahDateConverter$$ExternalSyntheticApiModelOutline2.m4727m(chronologyM4719m)) {
                this.hijrahChronologies.add(chronologyM4719m);
            }
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return HijrahDateConverter$$ExternalSyntheticApiModelOutline5.m4730m() == cls;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return parseChronoLocalDate(str, "Hijrah", this.hijrahChronologies);
    }

    public ChronoLocalDate chronoLocalDateOf(HijrahEra hijrahEra, int i, int i2, int i3) {
        if (hijrahEra != null) {
            return HijrahDate.of(i, i2, i3);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.converters.time.AbstractChronoLocalDateConverter
    public HijrahEra eraOf(String str) {
        return HijrahEra.valueOf(str);
    }
}
