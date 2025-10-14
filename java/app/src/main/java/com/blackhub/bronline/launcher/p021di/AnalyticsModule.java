package com.blackhub.bronline.launcher.p021di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.common.MarketAnalytic;
import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnalyticsModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public final class AnalyticsModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final RateAppAnalytics provideRateAppAnalytics() {
        return new RateAppAnalytics(MarketAnalytic.INSTANCE.getEngine());
    }
}

