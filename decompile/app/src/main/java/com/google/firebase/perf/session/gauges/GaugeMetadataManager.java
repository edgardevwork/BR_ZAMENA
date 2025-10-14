package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
class GaugeMetadataManager {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ActivityManager activityManager;
    private final Context appContext;
    private final ActivityManager.MemoryInfo memoryInfo;
    private final Runtime runtime;

    public GaugeMetadataManager(Context context) {
        this(Runtime.getRuntime(), context);
    }

    @VisibleForTesting
    public GaugeMetadataManager(Runtime runtime, Context context) {
        this.runtime = runtime;
        this.appContext = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.activityManager = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.memoryInfo = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public int getMaxAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.maxMemory()));
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.MEGABYTES.toKilobytes(this.activityManager.getMemoryClass()));
    }

    public int getDeviceRamSizeKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.memoryInfo.totalMem));
    }

    @VisibleForTesting
    public int readTotalRAM(String str) throws IOException {
        BufferedReader bufferedReader;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e) {
            logger.warn("Unable to read '" + str + "' file: " + e.getMessage());
        } catch (NumberFormatException e2) {
            logger.warn("Unable to parse '" + str + "' file: " + e2.getMessage());
        }
        do {
            try {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return 0;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (!line.startsWith("MemTotal"));
        Matcher matcher = Pattern.compile("\\d+").matcher(line);
        int i = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        bufferedReader.close();
        return i;
    }
}
