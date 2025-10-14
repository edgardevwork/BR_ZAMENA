package io.appmetrica.analytics.coreutils.internal.p048io;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.p051io.ByteStreamsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/Base64Utils;", "", "", "stringToZip", "compressBase64String", "", "bytes", "compressBase64", "stringToUnZip", "decompressBase64GzipAsString", "decompressBase64GzipAsBytes", "", "IO_BUFFER_SIZE", "I", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class Base64Utils {

    @NotNull
    public static final Base64Utils INSTANCE = new Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    @JvmStatic
    @Nullable
    public static final String compressBase64(@Nullable byte[] bytes) {
        try {
            return Base64.encodeToString(GZIPUtils.gzipBytes(bytes), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final String compressBase64String(@Nullable String stringToZip) {
        byte[] bytes;
        if (stringToZip != null) {
            try {
                bytes = stringToZip.getBytes(Charsets.UTF_8);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            bytes = null;
        }
        return compressBase64(bytes);
    }

    @JvmStatic
    @NotNull
    public static final byte[] decompressBase64GzipAsBytes(@Nullable String stringToUnZip) {
        GZIPInputStream gZIPInputStream;
        byte[] bytes;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(stringToUnZip, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (Throwable unused) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused2) {
            gZIPInputStream = null;
        }
        try {
            bytes = ByteStreamsKt.readBytes(gZIPInputStream);
        } catch (Throwable unused3) {
            byteArrayInputStream2 = byteArrayInputStream;
            try {
                bytes = new byte[0];
                byteArrayInputStream = byteArrayInputStream2;
                return bytes;
            } finally {
                CloseableUtilsKt.closeSafely(gZIPInputStream);
                CloseableUtilsKt.closeSafely(byteArrayInputStream2);
            }
        }
        return bytes;
    }

    @JvmStatic
    @Nullable
    public static final String decompressBase64GzipAsString(@Nullable String stringToUnZip) {
        try {
            return new String(decompressBase64GzipAsBytes(stringToUnZip), Charsets.UTF_8);
        } catch (Throwable unused) {
            return null;
        }
    }
}
