package com.blackhub.bronline.common;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketAnalytic.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MarketAnalytic {

    @Nullable
    public static IAnalyticEngine _engine;

    @NotNull
    public static final MarketAnalytic INSTANCE = new MarketAnalytic();
    public static final int $stable = 8;

    @NotNull
    public final IAnalyticEngine getEngine() {
        IAnalyticEngine iAnalyticEngine = _engine;
        if (iAnalyticEngine != null) {
            return iAnalyticEngine;
        }
        throw new NullPointerException("MarketAnalytic is not initialized");
    }

    public final void initialise(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        _engine = new AnalyticEngineYandexAppMetrica(app);
    }
}

