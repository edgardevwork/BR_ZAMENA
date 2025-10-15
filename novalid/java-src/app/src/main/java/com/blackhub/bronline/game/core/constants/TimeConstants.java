package com.blackhub.bronline.game.core.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/constants/TimeConstants;", "", "()V", "ANIMATE_DURATION_DEFAULT", "", "ANIMATE_LOADER_DURATION_DEFAULT", "", "API_FULL_DATE_FORMAT", "", "API_REQUEST_DATE_FORMAT", "DAY_COUNT_DIFF_ZERO", "DELIVERY_DATE_FORMAT", "MARKETPLACE_DATE_FORMAT", "MILLISECONDS", "MILLISECONDS_IN_SECOND", "MINIMUM_FETCH_INTERVAL_IN_SECONDS", "SECONDS_IN_HOUR", "SERVER_TIMEOUT", "TIMEOUT_FOR_REPEAT_REQUEST", "TIMER_DEFAULT_MILLIS_IN_FUTURE", "TIMER_ONE_SECOND", "TIME_DAY", "TIME_HOUR", "TIME_HOUR_IN_DAY", "TIME_MINUTE", "TIME_SECONDS", "TIME_SECONDS_IN_DAY", "TIME_SECONDS_IN_HOUR", "getHour", "time", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
