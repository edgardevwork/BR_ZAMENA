package io.appmetrica.analytics.coreutils.internal.p048io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.p051io.ByteStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0006"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/GZIPUtils;", "", "", "input", "gzipBytes", "unGzipBytes", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class GZIPUtils {

    @NotNull
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    @JvmStatic
    @Nullable
    public static final byte[] gzipBytes(@Nullable byte[] input) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        byte[] byteArray = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (input != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(input);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream2.toByteArray();
                        CloseableUtilsKt.closeSafely(gZIPOutputStream);
                        CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        CloseableUtilsKt.closeSafely(gZIPOutputStream);
                        CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        }
        return byteArray;
    }

    @JvmStatic
    @Nullable
    public static final byte[] unGzipBytes(@Nullable byte[] input) throws Throwable {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bytes = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (input != null) {
            try {
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(input);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
                } catch (Throwable th2) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th2;
                    gZIPInputStream = null;
                }
                try {
                    bytes = ByteStreamsKt.readBytes(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                } catch (Throwable th3) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th3;
                    byteArrayInputStream2 = byteArrayInputStream;
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        }
        return bytes;
    }
}
