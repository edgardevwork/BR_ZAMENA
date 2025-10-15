package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.converters.time.LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;

/* loaded from: classes7.dex */
public class ISO8601JavaTimeConverter extends AbstractSingleValueConverter {
    public static final DateTimeFormatter STD_DATE_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("yyyy-MM-dd'T'HH:mm:ss").appendFraction(ChronoField.NANO_OF_SECOND, 3, 9, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter STD_ORDINAL_DATE_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("yyyy-DDD'T'HH:mm:ss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter BASIC_DATE_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("yyyyMMdd'T'HHmmss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter BASIC_ORDINAL_DATE_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("yyyyDDD'T'HHmmss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter BASIC_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("HHmmss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter ISO_TTIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("'T'HH:mm:ss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter BASIC_TTIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("'T'HHmmss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter ISO_WEEK_DATE_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("YYYY-'W'ww-e'T'HH:mm:ss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter BASIC_WEEK_DATE_TIME = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("YYYY'W'wwe'T'HHmmss").appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true).appendOffsetId().toFormatter();
    public static final DateTimeFormatter BASIC_ORDINAL_DATE = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("yyyyDDD").toFormatter();
    public static final DateTimeFormatter BASIC_WEEK_DATE = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("YYYY'W'wwe").toFormatter();
    public static final DateTimeFormatter STD_DATE_HOUR = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("yyyy-MM-dd'T'HH").toFormatter();
    public static final DateTimeFormatter STD_HOUR = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("HH").toFormatter();
    public static final DateTimeFormatter STD_YEAR_WEEK = LocalDateTimeConverter$$ExternalSyntheticApiModelOutline8.m4749m().appendPattern("YYYY-'W'ww").parseDefaulting(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR, 1).toFormatter();

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public java.lang.Object fromString(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thoughtworks.xstream.core.util.ISO8601JavaTimeConverter.fromString(java.lang.String):java.lang.Object");
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        Calendar calendar = (Calendar) obj;
        return STD_DATE_TIME.format(OffsetDateTime.ofInstant(Instant.ofEpochMilli(calendar.getTimeInMillis()), ZoneOffset.ofTotalSeconds(calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000)));
    }
}
