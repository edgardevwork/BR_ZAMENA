package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.ndk.SessionFiles;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes6.dex */
public class CrashpadController {
    private static final String APP_METADATA_FILE = "app.json";
    private static final String DEVICE_METADATA_FILE = "device.json";
    private static final String OS_METADATA_FILE = "os.json";
    private static final String SESSION_METADATA_FILE = "session.json";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Context context;
    private final FileStore fileStore;
    private final NativeApi nativeApi;

    public CrashpadController(Context context, NativeApi nativeApi, FileStore fileStore) {
        this.context = context;
        this.nativeApi = nativeApi;
        this.fileStore = fileStore;
    }

    public boolean initialize(String str, String str2, long j, StaticSessionData staticSessionData) throws Throwable {
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (nativeSessionDir == null) {
            return false;
        }
        try {
            if (!this.nativeApi.initialize(nativeSessionDir.getCanonicalPath(), this.context.getAssets())) {
                return false;
            }
            writeBeginSession(str, str2, j);
            writeSessionApp(str, staticSessionData.appData());
            writeSessionOs(str, staticSessionData.osData());
            writeSessionDevice(str, staticSessionData.deviceData());
            return true;
        } catch (IOException e) {
            Logger.getLogger().m1358e("Error initializing Crashlytics NDK", e);
            return false;
        }
    }

    public boolean hasCrashDataForSession(String str) {
        SessionFiles.NativeCore nativeCore = getFilesForSession(str).nativeCore;
        return nativeCore != null && nativeCore.hasCore();
    }

    @NonNull
    public SessionFiles getFilesForSession(String str) {
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        File file = new File(nativeSessionDir, "pending");
        Logger.getLogger().m1361v("Minidump directory: " + file.getAbsolutePath());
        File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : PomReader.PomProfileElement.EXISTS);
        logger.m1361v(sb.toString());
        SessionFiles.Builder builder = new SessionFiles.Builder();
        if (nativeSessionDir != null && nativeSessionDir.exists() && file.exists()) {
            builder.nativeCore(getNativeCore(str, file)).metadataFile(getSingleFileWithExtension(nativeSessionDir, ".device_info")).sessionFile(new File(nativeSessionDir, SESSION_METADATA_FILE)).appFile(new File(nativeSessionDir, APP_METADATA_FILE)).deviceFile(new File(nativeSessionDir, DEVICE_METADATA_FILE)).osFile(new File(nativeSessionDir, OS_METADATA_FILE));
        }
        return builder.build();
    }

    private SessionFiles.NativeCore getNativeCore(String str, File file) {
        return new SessionFiles.NativeCore(getSingleFileWithExtension(file, ".dmp"), getApplicationExitInfo(str));
    }

    private CrashlyticsReport.ApplicationExitInfo getApplicationExitInfo(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return getNativeCrashApplicationExitInfo(str);
        }
        return null;
    }

    @RequiresApi(api = 31)
    private CrashlyticsReport.ApplicationExitInfo getNativeCrashApplicationExitInfo(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
        File sessionFile = this.fileStore.getSessionFile(str, SESSION_START_TIMESTAMP_FILE_NAME);
        return getRelevantApplicationExitInfo(sessionFile == null ? System.currentTimeMillis() : sessionFile.lastModified(), historicalProcessExitReasons);
    }

    @RequiresApi(api = 31)
    private CrashlyticsReport.ApplicationExitInfo getRelevantApplicationExitInfo(long j, List<ApplicationExitInfo> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM955m = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m955m(it.next());
            if (applicationExitInfoM955m.getReason() == 5 && applicationExitInfoM955m.getTimestamp() >= j) {
                arrayList.add(applicationExitInfoM955m);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return convertApplicationExitInfoToModel(ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m955m(arrayList.get(0)));
    }

    public void writeBeginSession(String str, String str2, long j) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeBeginSession(str, str2, j), SESSION_METADATA_FILE);
    }

    public void writeSessionApp(String str, StaticSessionData.AppData appData) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionApp(appData.appIdentifier(), appData.versionCode(), appData.versionName(), appData.installUuid(), appData.deliveryMechanism(), appData.developmentPlatformProvider().getDevelopmentPlatform(), appData.developmentPlatformProvider().getDevelopmentPlatformVersion()), APP_METADATA_FILE);
    }

    public void writeSessionOs(String str, StaticSessionData.OsData osData) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionOs(osData.osRelease(), osData.osCodeName(), osData.isRooted()), OS_METADATA_FILE);
    }

    public void writeSessionDevice(String str, StaticSessionData.DeviceData deviceData) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionDevice(deviceData.arch(), deviceData.model(), deviceData.availableProcessors(), deviceData.totalRam(), deviceData.diskSpace(), deviceData.isEmulator(), deviceData.state(), deviceData.manufacturer(), deviceData.modelClass()), DEVICE_METADATA_FILE);
    }

    private static void writeSessionJsonFile(FileStore fileStore, String str, String str2, String str3) throws Throwable {
        writeTextFile(new File(fileStore.getNativeSessionDir(str), str3), str2);
    }

    private static void writeTextFile(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
            try {
                bufferedWriter2.write(str);
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    private static File getSingleFileWithExtension(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    @RequiresApi(api = 31)
    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfoToModel(ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(getTraceFileFromApplicationExitInfo(applicationExitInfo)).build();
    }

    @RequiresApi(api = 31)
    private static String getTraceFileFromApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        try {
            return convertInputStreamToString(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            Logger.getLogger().m1363w("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    @RequiresApi(api = 31)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return zipAndEncode(byteArrayOutputStream.toByteArray());
            }
        }
    }

    @RequiresApi(api = 31)
    private static String zipAndEncode(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
