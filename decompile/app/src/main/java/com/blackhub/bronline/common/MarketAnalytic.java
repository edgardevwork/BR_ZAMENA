package com.blackhub.bronline.common;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketAnalytic.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m7105d2 = {"Lcom/blackhub/bronline/common/MarketAnalytic;", "", "()V", "_engine", "Lcom/blackhub/bronline/common/IAnalyticEngine;", "engine", "getEngine", "()Lcom/blackhub/bronline/common/IAnalyticEngine;", "initialise", "", "app", "Landroid/app/Application;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
