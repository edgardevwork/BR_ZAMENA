package org.apache.commons.compress.compressors.brotli;

import org.apache.commons.compress.utils.OsgiUtils;

/* loaded from: classes6.dex */
public class BrotliUtils {
    public static volatile CachedAvailability cachedBrotliAvailability = CachedAvailability.DONT_CACHE;

    public enum CachedAvailability {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    static {
        setCacheBrotliAvailablity(!OsgiUtils.isRunningInOsgiEnvironment());
    }

    public static boolean isBrotliCompressionAvailable() {
        CachedAvailability cachedAvailability = cachedBrotliAvailability;
        if (cachedAvailability != CachedAvailability.DONT_CACHE) {
            return cachedAvailability == CachedAvailability.CACHED_AVAILABLE;
        }
        return internalIsBrotliCompressionAvailable();
    }

    public static boolean internalIsBrotliCompressionAvailable() throws ClassNotFoundException {
        try {
            Class.forName("org.brotli.dec.BrotliInputStream");
            return true;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static void setCacheBrotliAvailablity(boolean z) {
        if (!z) {
            cachedBrotliAvailability = CachedAvailability.DONT_CACHE;
        } else if (cachedBrotliAvailability == CachedAvailability.DONT_CACHE) {
            cachedBrotliAvailability = internalIsBrotliCompressionAvailable() ? CachedAvailability.CACHED_AVAILABLE : CachedAvailability.CACHED_UNAVAILABLE;
        }
    }

    public static CachedAvailability getCachedBrotliAvailability() {
        return cachedBrotliAvailability;
    }
}
