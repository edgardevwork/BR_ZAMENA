package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@Deprecated
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends FileProvider {
    public static final String AUTHORITY_SUFFIX = ".image_provider";
    public static final String CLIP_DATA_LABEL = "image_provider_uris";
    public static final String CONTENT_SCHEME = "content";
    public static final String FILE_EXTENSION = ".png";
    public static final String FILE_SUB_DIR = "image_provider";
    public static final String FILE_SUB_DIR_NAME = "image_provider_images/";
    public static final String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
    public static final String TAG = "BrowserServiceFP";
    public static Object sFileCleanupLock = new Object();

    /* loaded from: classes4.dex */
    public static class FileCleanupTask extends AsyncTask<Void, Void, Void> {
        public static final long CLEANUP_REQUIRED_TIME_SPAN;
        public static final long DELETION_FAILED_REATTEMPT_DURATION;
        public static final long IMAGE_RETENTION_DURATION;
        public final Context mAppContext;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            IMAGE_RETENTION_DURATION = timeUnit.toMillis(7L);
            CLEANUP_REQUIRED_TIME_SPAN = timeUnit.toMillis(7L);
            DELETION_FAILED_REATTEMPT_DURATION = timeUnit.toMillis(1L);
        }

        public FileCleanupTask(Context context) {
            this.mAppContext = context.getApplicationContext();
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            long jCurrentTimeMillis;
            SharedPreferences sharedPreferences = this.mAppContext.getSharedPreferences(this.mAppContext.getPackageName() + BrowserServiceFileProvider.AUTHORITY_SUFFIX, 0);
            if (!shouldCleanUp(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    File file = new File(this.mAppContext.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
                    if (!file.exists()) {
                        return null;
                    }
                    File[] fileArrListFiles = file.listFiles();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - IMAGE_RETENTION_DURATION;
                    boolean z = true;
                    for (File file2 : fileArrListFiles) {
                        if (isImageFile(file2) && file2.lastModified() < jCurrentTimeMillis2 && !file2.delete()) {
                            Log.e(BrowserServiceFileProvider.TAG, "Fail to delete image: " + file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                    if (z) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = (System.currentTimeMillis() - CLEANUP_REQUIRED_TIME_SPAN) + DELETION_FAILED_REATTEMPT_DURATION;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, jCurrentTimeMillis);
                    editorEdit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean isImageFile(File file) {
            return file.getName().endsWith("..png");
        }

        public static boolean shouldCleanUp(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, System.currentTimeMillis()) + CLEANUP_REQUIRED_TIME_SPAN;
        }
    }

    /* loaded from: classes4.dex */
    public static class FileSaveTask extends AsyncTask<String, Void, Void> {
        public final Context mAppContext;
        public final Bitmap mBitmap;
        public final Uri mFileUri;
        public final String mFilename;
        public final ResolvableFuture<Uri> mResultFuture;

        public FileSaveTask(Context context, String str, Bitmap bitmap, Uri uri, ResolvableFuture<Uri> resolvableFuture) {
            this.mAppContext = context.getApplicationContext();
            this.mFilename = str;
            this.mBitmap = bitmap;
            this.mFileUri = uri;
            this.mResultFuture = resolvableFuture;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(String... strArr) {
            saveFileIfNeededBlocking();
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r3) {
            new FileCleanupTask(this.mAppContext).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        public final void saveFileIfNeededBlocking() {
            File file = new File(this.mAppContext.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.mResultFuture.setException(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.mFilename + ".png");
                    if (file2.exists()) {
                        this.mResultFuture.set(this.mFileUri);
                    } else {
                        saveFileBlocking(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void saveFileBlocking(File file) throws IOException {
            FileOutputStream fileOutputStreamStartWrite;
            AtomicFile atomicFile = new AtomicFile(file);
            try {
                fileOutputStreamStartWrite = atomicFile.startWrite();
                try {
                    this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamStartWrite);
                    fileOutputStreamStartWrite.close();
                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                    this.mResultFuture.set(this.mFileUri);
                } catch (IOException e) {
                    e = e;
                    atomicFile.failWrite(fileOutputStreamStartWrite);
                    this.mResultFuture.setException(e);
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStreamStartWrite = null;
            }
        }
    }

    @NonNull
    @UiThread
    public static ResolvableFuture<Uri> saveBitmap(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str, int i) {
        String str2 = str + LauncherConstants.UNDERSCORE_STRING + Integer.toString(i);
        Uri uriGenerateUri = generateUri(context, str2);
        ResolvableFuture<Uri> resolvableFutureCreate = ResolvableFuture.create();
        new FileSaveTask(context, str2, bitmap, uriGenerateUri, resolvableFutureCreate).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return resolvableFutureCreate;
    }

    public static Uri generateUri(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + AUTHORITY_SUFFIX).path(FILE_SUB_DIR_NAME + str + ".png").build();
    }

    public static void grantReadPermission(@NonNull Intent intent, @Nullable List<Uri> list, @NonNull Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData clipDataNewUri = ClipData.newUri(contentResolver, CLIP_DATA_LABEL, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipDataNewUri.addItem(new ClipData.Item(list.get(i)));
        }
        intent.setClipData(clipDataNewUri);
    }

    @NonNull
    public static ListenableFuture<Bitmap> loadBitmap(@NonNull final ContentResolver contentResolver, @NonNull final Uri uri) {
        final ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: androidx.browser.browseractions.BrowserServiceFileProvider.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        resolvableFutureCreate.setException(new FileNotFoundException());
                        return;
                    }
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    parcelFileDescriptorOpenFileDescriptor.close();
                    if (bitmapDecodeFileDescriptor == null) {
                        resolvableFutureCreate.setException(new IOException("File could not be decoded."));
                    } else {
                        resolvableFutureCreate.set(bitmapDecodeFileDescriptor);
                    }
                } catch (IOException e) {
                    resolvableFutureCreate.setException(e);
                }
            }
        });
        return resolvableFutureCreate;
    }
}
