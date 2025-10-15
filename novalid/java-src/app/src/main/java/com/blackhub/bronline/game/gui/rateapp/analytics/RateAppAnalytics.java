package com.blackhub.bronline.game.gui.rateapp.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.common.IAnalyticEngine;
import com.blackhub.bronline.game.gui.rateapp.RateAppAnalyticsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RateAppAnalytics.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/rateapp/analytics/RateAppAnalytics;", "", "analyticEngine", "Lcom/blackhub/bronline/common/IAnalyticEngine;", "(Lcom/blackhub/bronline/common/IAnalyticEngine;)V", "sendAnalyticsLikeDislikePressed", "", "gradeValue", "", "categoryDescription", "sendAnalyticsStarPressed", "star", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class RateAppAnalytics {
    public static final int $stable = 8;

    @NotNull
    public final IAnalyticEngine analyticEngine;

    public RateAppAnalytics(@NotNull IAnalyticEngine analyticEngine) {
        Intrinsics.checkNotNullParameter(analyticEngine, "analyticEngine");
        this.analyticEngine = analyticEngine;
    }

    public final void sendAnalyticsLikeDislikePressed(@NotNull String gradeValue, @NotNull String categoryDescription) throws JSONException {
        Intrinsics.checkNotNullParameter(gradeValue, "gradeValue");
        Intrinsics.checkNotNullParameter(categoryDescription, "categoryDescription");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(gradeValue, categoryDescription);
        IAnalyticEngine iAnalyticEngine = this.analyticEngine;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iAnalyticEngine.reportEvent(RateAppAnalyticsKeys.RATE_APP_LIKE_TYPE, string);
    }

    public final void sendAnalyticsStarPressed(int star, @NotNull String categoryDescription) throws JSONException {
        Intrinsics.checkNotNullParameter(categoryDescription, "categoryDescription");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(String.valueOf(star), categoryDescription);
        IAnalyticEngine iAnalyticEngine = this.analyticEngine;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iAnalyticEngine.reportEvent(RateAppAnalyticsKeys.RATE_APP_STARS_TYPE, string);
    }
}
