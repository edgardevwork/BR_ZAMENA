package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

/* loaded from: classes4.dex */
public final class EnvironmentCompat {

    @Deprecated
    public static final String MEDIA_UNKNOWN = "unknown";

    @NonNull
    public static String getStorageState(@NonNull File file) {
        return Api21Impl.getExternalStorageState(file);
    }

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        public static String getExternalStorageState(File file) {
            return Environment.getExternalStorageState(file);
        }
    }
}
