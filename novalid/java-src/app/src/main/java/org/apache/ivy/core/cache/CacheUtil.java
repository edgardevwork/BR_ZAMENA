package org.apache.ivy.core.cache;

/* loaded from: classes7.dex */
public final class CacheUtil {
    public static void checkCachePattern(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null cache pattern not allowed.");
        }
        if (str.startsWith("..")) {
            throw new IllegalArgumentException("invalid cache pattern: '" + str + "': cache patterns must not lead outside cache directory");
        }
        if (str.startsWith("/")) {
            throw new IllegalArgumentException("invalid cache pattern: '" + str + "': cache patterns must not be absolute");
        }
    }
}
