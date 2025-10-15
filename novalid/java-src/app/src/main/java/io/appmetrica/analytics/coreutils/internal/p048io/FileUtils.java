package io.appmetrica.analytics.coreutils.internal.p048io;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.p051io.FilesKt__UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0015\u001a\u00020\u0013*\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0017\u001a\u00020\u0013*\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/FileUtils;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "sdkStorage", "getAppStorageDirectory", "", "fileName", "getFileFromSdkStorage", "getFileFromAppStorage", "getCrashesDirectory", "getNativeCrashDirectory", "filePath", "getFileFromPath", "getAppDataDir", "", "resetSdkStorage", "to", "", "move", "copyToNullable", "moveByCopy", "moveByRename", "SDK_STORAGE_RELATIVE_PATH", "Ljava/lang/String;", "SDK_FILES_PREFIX", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    public static final String SDK_FILES_PREFIX = "appmetrica_analytics";

    @NotNull
    public static final String SDK_STORAGE_RELATIVE_PATH = "/appmetrica/analytics";

    /* renamed from: a */
    private static volatile File f6182a;

    private FileUtils() {
    }

    @JvmStatic
    public static final boolean copyToNullable(@Nullable File file, @Nullable File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                FilesKt__UtilsKt.copyTo$default(file, file2, false, 0, 6, null);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    @Nullable
    public static final File getAppDataDir(@NotNull Context context) {
        if (AndroidUtils.isApiAchieved(24)) {
            return AppDataDirProviderForN.INSTANCE.dataDir(context);
        }
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getParentFile();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final File getAppStorageDirectory(@NotNull Context context) {
        return context.getNoBackupFilesDir();
    }

    @JvmStatic
    @Nullable
    public static final File getCrashesDirectory(@NotNull Context context) {
        return getFileFromSdkStorage(context, "crashes");
    }

    @JvmStatic
    @Nullable
    public static final File getFileFromAppStorage(@NotNull Context context, @NotNull String fileName) {
        File appStorageDirectory = getAppStorageDirectory(context);
        if (appStorageDirectory != null) {
            return new File(appStorageDirectory, fileName);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final File getFileFromPath(@NotNull String filePath) {
        return new File(filePath);
    }

    @JvmStatic
    @Nullable
    public static final File getFileFromSdkStorage(@NotNull Context context, @NotNull String fileName) {
        File fileSdkStorage = sdkStorage(context);
        if (fileSdkStorage != null) {
            return new File(fileSdkStorage, fileName);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final File getNativeCrashDirectory(@NotNull Context context) {
        return getFileFromSdkStorage(context, "native_crashes");
    }

    @JvmStatic
    public static final boolean move(@Nullable File file, @Nullable File file2) {
        FileUtils fileUtils = INSTANCE;
        return fileUtils.moveByRename(file, file2) || fileUtils.moveByCopy(file, file2);
    }

    @JvmStatic
    @VisibleForTesting
    public static final void resetSdkStorage() {
        synchronized (INSTANCE) {
            f6182a = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @Nullable
    public static final File sdkStorage(@NotNull Context context) {
        File file;
        if (f6182a == null) {
            synchronized (INSTANCE) {
                try {
                    File appStorageDirectory = getAppStorageDirectory(context);
                    if (appStorageDirectory == null) {
                        file = null;
                    } else {
                        File file2 = new File(appStorageDirectory, SDK_STORAGE_RELATIVE_PATH);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file = file2;
                    }
                    f6182a = file;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6182a;
    }

    public final boolean moveByCopy(@Nullable File file, @Nullable File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                FilesKt__UtilsKt.copyTo$default(file, file2, false, 0, 6, null);
                file.delete();
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final boolean moveByRename(@Nullable File file, @Nullable File file2) {
        if (file2 != null) {
            Boolean boolValueOf = file != null ? Boolean.valueOf(file.renameTo(file2)) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }
}
