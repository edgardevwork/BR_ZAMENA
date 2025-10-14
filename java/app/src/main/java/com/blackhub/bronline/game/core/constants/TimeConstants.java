package com.blackhub.bronline.game.core.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TimeConstants {
    public static final int $stable = 0;
    public static final int ANIMATE_DURATION_DEFAULT = 125;
    public static final long ANIMATE_LOADER_DURATION_DEFAULT = 10000;

    @NotNull
    public static final String API_FULL_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

    @NotNull
    public static final String API_REQUEST_DATE_FORMAT = "yyyy-MM-dd";
    public static final long DAY_COUNT_DIFF_ZERO = 0;

    @NotNull
    public static final String DELIVERY_DATE_FORMAT = "EE, dd MMMM";

    @NotNull
    public static final TimeConstants INSTANCE = new TimeConstants();

    @NotNull
    public static final String MARKETPLACE_DATE_FORMAT = "dd.MM.yyyy HH:mm";
    public static final long MILLISECONDS = 1000;
    public static final int MILLISECONDS_IN_SECOND = 1000;
    public static final long MINIMUM_FETCH_INTERVAL_IN_SECONDS = 3600;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final long SERVER_TIMEOUT = 400;
    public static final long TIMEOUT_FOR_REPEAT_REQUEST = 3000;
    public static final long TIMER_DEFAULT_MILLIS_IN_FUTURE = 50000;
    public static final long TIMER_ONE_SECOND = 1000;
    public static final long TIME_DAY = 86400000;
    public static final long TIME_HOUR = 3600000;
    public static final int TIME_HOUR_IN_DAY = 24;
    public static final long TIME_MINUTE = 60000;
    public static final int TIME_SECONDS = 60;
    public static final int TIME_SECONDS_IN_DAY = 86400;
    public static final int TIME_SECONDS_IN_HOUR = 3600;

    public final long getHour(long time) {
        return time / 3600000;
    }
}

