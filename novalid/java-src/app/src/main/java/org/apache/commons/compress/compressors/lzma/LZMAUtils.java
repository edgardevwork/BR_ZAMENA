package org.apache.commons.compress.compressors.lzma;

import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import java.util.HashMap;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.compress.utils.OsgiUtils;

/* loaded from: classes6.dex */
public class LZMAUtils {
    public static final byte[] HEADER_MAGIC = {UTF8JsonGenerator.BYTE_RBRACKET, 0, 0};
    public static volatile CachedAvailability cachedLZMAAvailability;
    public static final FileNameUtil fileNameUtil;

    public enum CachedAvailability {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    static {
        HashMap map = new HashMap();
        map.put(".lzma", "");
        map.put("-lzma", "");
        fileNameUtil = new FileNameUtil(map, ".lzma");
        cachedLZMAAvailability = CachedAvailability.DONT_CACHE;
        setCacheLZMAAvailablity(!OsgiUtils.isRunningInOsgiEnvironment());
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < HEADER_MAGIC.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = HEADER_MAGIC;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static boolean isLZMACompressionAvailable() {
        CachedAvailability cachedAvailability = cachedLZMAAvailability;
        if (cachedAvailability != CachedAvailability.DONT_CACHE) {
            return cachedAvailability == CachedAvailability.CACHED_AVAILABLE;
        }
        return internalIsLZMACompressionAvailable();
    }

    public static boolean internalIsLZMACompressionAvailable() {
        try {
            LZMACompressorInputStream.matches(null, 0);
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean isCompressedFilename(String str) {
        return fileNameUtil.isCompressedFilename(str);
    }

    public static String getUncompressedFilename(String str) {
        return fileNameUtil.getUncompressedFilename(str);
    }

    public static String getCompressedFilename(String str) {
        return fileNameUtil.getCompressedFilename(str);
    }

    public static void setCacheLZMAAvailablity(boolean z) {
        if (!z) {
            cachedLZMAAvailability = CachedAvailability.DONT_CACHE;
        } else if (cachedLZMAAvailability == CachedAvailability.DONT_CACHE) {
            cachedLZMAAvailability = internalIsLZMACompressionAvailable() ? CachedAvailability.CACHED_AVAILABLE : CachedAvailability.CACHED_UNAVAILABLE;
        }
    }

    public static CachedAvailability getCachedLZMAAvailability() {
        return cachedLZMAAvailability;
    }
}
