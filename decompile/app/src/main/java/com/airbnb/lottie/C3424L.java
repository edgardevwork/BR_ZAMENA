package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import com.airbnb.lottie.utils.LottieTrace;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.L */
/* loaded from: classes4.dex */
public class C3424L {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";
    public static LottieNetworkCacheProvider cacheProvider = null;
    public static AsyncUpdates defaultAsyncUpdates = AsyncUpdates.AUTOMATIC;
    public static boolean disablePathInterpolatorCache = true;
    public static LottieNetworkFetcher fetcher = null;
    public static ThreadLocal<LottieTrace> lottieTrace = null;
    public static volatile NetworkCache networkCache = null;
    public static boolean networkCacheEnabled = true;
    public static volatile NetworkFetcher networkFetcher;
    public static boolean traceEnabled;

    public static void setTraceEnabled(boolean z) {
        if (traceEnabled == z) {
            return;
        }
        traceEnabled = z;
        if (z && lottieTrace == null) {
            lottieTrace = new ThreadLocal<>();
        }
    }

    public static void setNetworkCacheEnabled(boolean z) {
        networkCacheEnabled = z;
    }

    public static void beginSection(String str) {
        if (traceEnabled) {
            getTrace().beginSection(str);
        }
    }

    public static float endSection(String str) {
        if (traceEnabled) {
            return getTrace().endSection(str);
        }
        return 0.0f;
    }

    public static LottieTrace getTrace() {
        LottieTrace lottieTrace2 = lottieTrace.get();
        if (lottieTrace2 != null) {
            return lottieTrace2;
        }
        LottieTrace lottieTrace3 = new LottieTrace();
        lottieTrace.set(lottieTrace3);
        return lottieTrace3;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        LottieNetworkFetcher lottieNetworkFetcher2 = fetcher;
        if (lottieNetworkFetcher2 == null && lottieNetworkFetcher == null) {
            return;
        }
        if (lottieNetworkFetcher2 == null || !lottieNetworkFetcher2.equals(lottieNetworkFetcher)) {
            fetcher = lottieNetworkFetcher;
            networkFetcher = null;
        }
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        LottieNetworkCacheProvider lottieNetworkCacheProvider2 = cacheProvider;
        if (lottieNetworkCacheProvider2 == null && lottieNetworkCacheProvider == null) {
            return;
        }
        if (lottieNetworkCacheProvider2 == null || !lottieNetworkCacheProvider2.equals(lottieNetworkCacheProvider)) {
            cacheProvider = lottieNetworkCacheProvider;
            networkCache = null;
        }
    }

    @NonNull
    public static NetworkFetcher networkFetcher(@NonNull Context context) {
        NetworkFetcher networkFetcher2 = networkFetcher;
        if (networkFetcher2 == null) {
            synchronized (NetworkFetcher.class) {
                try {
                    networkFetcher2 = networkFetcher;
                    if (networkFetcher2 == null) {
                        NetworkCache networkCache2 = networkCache(context);
                        LottieNetworkFetcher defaultLottieNetworkFetcher = fetcher;
                        if (defaultLottieNetworkFetcher == null) {
                            defaultLottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                        }
                        networkFetcher2 = new NetworkFetcher(networkCache2, defaultLottieNetworkFetcher);
                        networkFetcher = networkFetcher2;
                    }
                } finally {
                }
            }
        }
        return networkFetcher2;
    }

    @Nullable
    public static NetworkCache networkCache(@NonNull Context context) {
        if (!networkCacheEnabled) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        NetworkCache networkCache2 = networkCache;
        if (networkCache2 == null) {
            synchronized (NetworkCache.class) {
                try {
                    networkCache2 = networkCache;
                    if (networkCache2 == null) {
                        LottieNetworkCacheProvider lottieNetworkCacheProvider = cacheProvider;
                        if (lottieNetworkCacheProvider == null) {
                            lottieNetworkCacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L$$ExternalSyntheticLambda0
                                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                                public final File getCacheDir() {
                                    return C3424L.lambda$networkCache$0(applicationContext);
                                }
                            };
                        }
                        networkCache2 = new NetworkCache(lottieNetworkCacheProvider);
                        networkCache = networkCache2;
                    }
                } finally {
                }
            }
        }
        return networkCache2;
    }

    public static /* synthetic */ File lambda$networkCache$0(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void setDisablePathInterpolatorCache(boolean z) {
        disablePathInterpolatorCache = z;
    }

    public static boolean getDisablePathInterpolatorCache() {
        return disablePathInterpolatorCache;
    }

    public static void setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
        defaultAsyncUpdates = asyncUpdates;
    }

    public static AsyncUpdates getDefaultAsyncUpdates() {
        return defaultAsyncUpdates;
    }
}
