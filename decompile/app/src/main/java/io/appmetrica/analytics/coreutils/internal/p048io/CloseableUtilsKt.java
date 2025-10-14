package io.appmetrica.analytics.coreutils.internal.p048io;

import android.database.Cursor;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m7105d2 = {"closeSafely", "", "Landroid/database/Cursor;", "Ljava/io/Closeable;", "core-utils_release"}, m7106k = 2, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class CloseableUtilsKt {
    public static final void closeSafely(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void closeSafely(@Nullable Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
