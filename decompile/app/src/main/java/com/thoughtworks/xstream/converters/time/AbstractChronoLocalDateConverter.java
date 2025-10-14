package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.time.DateTimeException;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.Era;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public abstract class AbstractChronoLocalDateConverter<E extends Era> extends AbstractSingleValueConverter {
    public static final Pattern CHRONO_DATE_PATTERN = Pattern.compile("^ (\\w+) (\\d+)-(\\d+)-(\\d+)$");

    public abstract ChronoLocalDate chronoLocalDateOf(E e, int i, int i2, int i3);

    public abstract E eraOf(String str);

    public ChronoLocalDate parseChronoLocalDate(String str, String str2, Set<Chronology> set) {
        ConversionException conversionException = null;
        if (str != null) {
            Iterator<Chronology> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String id = C8635xdbec53eb.m4719m(it.next()).getId();
                if (str.startsWith(id + ' ')) {
                    Matcher matcher = CHRONO_DATE_PATTERN.matcher(str.subSequence(id.length(), str.length()));
                    if (matcher.matches()) {
                        try {
                            Era eraEraOf = eraOf(matcher.group(1));
                            if (eraEraOf != null) {
                                try {
                                    return chronoLocalDateOf(eraEraOf, Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)));
                                } catch (DateTimeException e) {
                                    conversionException = new ConversionException("Cannot parse value as " + str2 + " date", e);
                                    if (conversionException == null) {
                                        conversionException = new ConversionException("Cannot parse value as " + str2 + " date");
                                    }
                                    conversionException.add("value", str);
                                    throw conversionException;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            conversionException = new ConversionException("Cannot parse value as " + str2 + " date", e2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            return null;
        }
    }
}
