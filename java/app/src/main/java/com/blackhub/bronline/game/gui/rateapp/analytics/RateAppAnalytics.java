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

