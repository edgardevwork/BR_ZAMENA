package com.airbnb.lottie;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class Lottie {
    public static void initialize(@NonNull LottieConfig lottieConfig) {
        C3424L.setFetcher(lottieConfig.networkFetcher);
        C3424L.setCacheProvider(lottieConfig.cacheProvider);
        C3424L.setTraceEnabled(lottieConfig.enableSystraceMarkers);
        C3424L.setNetworkCacheEnabled(lottieConfig.enableNetworkCache);
        C3424L.setDisablePathInterpolatorCache(lottieConfig.disablePathInterpolatorCache);
        C3424L.setDefaultAsyncUpdates(lottieConfig.defaultAsyncUpdates);
    }
}
