package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@UnstableApi
/* loaded from: classes3.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    public static final int MSG_ADD_DOWNLOAD = 6;
    public static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    public static final int MSG_DOWNLOAD_UPDATE = 2;
    public static final int MSG_INITIALIZE = 0;
    public static final int MSG_INITIALIZED = 0;
    public static final int MSG_PROCESSED = 1;
    public static final int MSG_RELEASE = 12;
    public static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    public static final int MSG_REMOVE_DOWNLOAD = 7;
    public static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    public static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    public static final int MSG_SET_MIN_RETRY_COUNT = 5;
    public static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    public static final int MSG_SET_STOP_REASON = 3;
    public static final int MSG_TASK_STOPPED = 9;
    public static final int MSG_UPDATE_PROGRESS = 11;
    public static final String TAG = "DownloadManager";
    public int activeTaskCount;
    public final Handler applicationHandler;
    public final Context context;
    public final WritableDownloadIndex downloadIndex;
    public List<Download> downloads;
    public boolean downloadsPaused;
    public boolean initialized;
    public final InternalHandler internalHandler;
    public final CopyOnWriteArraySet<Listener> listeners;
    public int maxParallelDownloads;
    public int minRetryCount;
    public int notMetRequirements;
    public int pendingMessages;
    public final RequirementsWatcher.Listener requirementsListener;
    public RequirementsWatcher requirementsWatcher;
    public boolean waitingForRequirements;

    public interface Listener {
        default void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception exc) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
        }

        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
        }
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.emptyList();
        this.listeners = new CopyOnWriteArraySet<>();
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.DownloadManager$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleMainMessage(message);
            }
        });
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: androidx.media3.exoplayer.offline.DownloadManager$$ExternalSyntheticLambda1
            @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
                this.f$0.onRequirementsStateChanged(requirementsWatcher, i);
            }
        };
        this.requirementsListener = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.notMetRequirements = iStart;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(0, iStart, 0).sendToTarget();
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public void setMaxParallelDownloads(@IntRange(from = 1) int i) {
        Assertions.checkArgument(i > 0);
        if (this.maxParallelDownloads == i) {
            return;
        }
        this.maxParallelDownloads = i;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i, 0).sendToTarget();
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public void setMinRetryCount(int i) {
        Assertions.checkArgument(i >= 0);
        if (this.minRetryCount == i) {
            return;
        }
        this.minRetryCount = i;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i, 0).sendToTarget();
    }

    public DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void setStopReason(@Nullable String str, int i) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(3, i, 0, str).sendToTarget();
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addDownload(DownloadRequest downloadRequest, int i) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i, 0, downloadRequest).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, str).sendToTarget();
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8).sendToTarget();
    }

    public void release() {
        synchronized (this.internalHandler) {
            try {
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler.released) {
                    return;
                }
                internalHandler.sendEmptyMessage(12);
                boolean z = false;
                while (true) {
                    InternalHandler internalHandler2 = this.internalHandler;
                    if (internalHandler2.released) {
                        break;
                    }
                    try {
                        internalHandler2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.requirementsWatcher.stop();
                this.downloads = Collections.emptyList();
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setDownloadsPaused(boolean z) {
        if (this.downloadsPaused == z) {
            return;
        }
        this.downloadsPaused = z;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i) {
            this.notMetRequirements = i;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    public final boolean updateWaitingForRequirements() {
        boolean z;
        if (this.downloadsPaused || this.notMetRequirements == 0) {
            z = false;
        } else {
            for (int i = 0; i < this.downloads.size(); i++) {
                if (this.downloads.get(i).state == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z2 = this.waitingForRequirements != z;
        this.waitingForRequirements = z;
        return z2;
    }

    public final void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    public final boolean handleMainMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            onInitialized((List) message.obj);
        } else if (i == 1) {
            onMessageProcessed(message.arg1, message.arg2);
        } else if (i == 2) {
            onDownloadUpdate((DownloadUpdate) message.obj);
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    public final void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    public final void onDownloadUpdate(DownloadUpdate downloadUpdate) {
        this.downloads = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    public final void onMessageProcessed(int i, int i2) {
        this.pendingMessages -= i;
        this.activeTaskCount = i2;
        if (isIdle()) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    public static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i, long j) {
        int i2;
        int i3 = download.state;
        long j2 = (i3 == 5 || download.isTerminalState()) ? j : download.startTimeMs;
        if (i3 == 5 || i3 == 7) {
            i2 = 7;
        } else {
            i2 = i != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i2, j2, j, -1L, i, 0);
    }

    public static final class InternalHandler extends Handler {
        public static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        public int activeDownloadTaskCount;
        public final HashMap<String, Task> activeTasks;
        public final WritableDownloadIndex downloadIndex;
        public final DownloaderFactory downloaderFactory;
        public final ArrayList<Download> downloads;
        public boolean downloadsPaused;
        public boolean hasActiveRemoveTask;
        public final Handler mainHandler;
        public int maxParallelDownloads;
        public int minRetryCount;
        public int notMetRequirements;
        public boolean released;
        public final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i, int i2, boolean z) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i;
            this.minRetryCount = i2;
            this.downloadsPaused = z;
            this.downloads = new ArrayList<>();
            this.activeTasks = new HashMap<>();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = 0;
            switch (message.what) {
                case 0:
                    initialize(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 1:
                    setDownloadsPaused(message.arg1 != 0);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 2:
                    setNotMetRequirements(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 3:
                    setStopReason((String) message.obj, message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 4:
                    setMaxParallelDownloads(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 5:
                    setMinRetryCount(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 6:
                    addDownload((DownloadRequest) message.obj, message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 7:
                    removeDownload((String) message.obj);
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 8:
                    removeAllDownloads();
                    i = 1;
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 9:
                    onTaskStopped((Task) message.obj);
                    this.mainHandler.obtainMessage(1, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 10:
                    onContentLengthChanged((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 11:
                    updateProgress();
                    return;
                case 12:
                    release();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        public final void initialize(int i) {
            this.notMetRequirements = i;
            DownloadCursor downloads = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloads = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.downloads.add(downloads.getDownload());
                    }
                } catch (IOException e) {
                    Log.m632e(DownloadManager.TAG, "Failed to load index.", e);
                    this.downloads.clear();
                }
                this.mainHandler.obtainMessage(0, new ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } finally {
                Util.closeQuietly(downloads);
            }
        }

        public final void setDownloadsPaused(boolean z) {
            this.downloadsPaused = z;
            syncTasks();
        }

        public final void setNotMetRequirements(int i) {
            this.notMetRequirements = i;
            syncTasks();
        }

        public final void setStopReason(@Nullable String str, int i) {
            if (str == null) {
                for (int i2 = 0; i2 < this.downloads.size(); i2++) {
                    setStopReason(this.downloads.get(i2), i);
                }
                try {
                    this.downloadIndex.setStopReason(i);
                } catch (IOException e) {
                    Log.m632e(DownloadManager.TAG, "Failed to set manual stop reason", e);
                }
            } else {
                Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i);
                    } catch (IOException e2) {
                        Log.m632e(DownloadManager.TAG, "Failed to set manual stop reason: " + str, e2);
                    }
                }
            }
            syncTasks();
        }

        public final void setStopReason(Download download, int i) {
            if (i == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i != download.stopReason) {
                int i2 = download.state;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                putDownload(new Download(download.request, i2, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i, 0, download.progress));
            }
        }

        public final void setMaxParallelDownloads(int i) {
            this.maxParallelDownloads = i;
            syncTasks();
        }

        public final void setMinRetryCount(int i) {
            this.minRetryCount = i;
        }

        public final void addDownload(DownloadRequest downloadRequest, int i) {
            Download download = getDownload(downloadRequest.f313id, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (download != null) {
                putDownload(DownloadManager.mergeRequest(download, downloadRequest, i, jCurrentTimeMillis));
            } else {
                putDownload(new Download(downloadRequest, i == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i, 0));
            }
            syncTasks();
        }

        public final void removeDownload(String str) {
            Download download = getDownload(str, true);
            if (download == null) {
                Log.m631e(DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
                return;
            }
            putDownloadWithState(download, 5, 0);
            syncTasks();
        }

        public final void removeAllDownloads() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } finally {
                    }
                }
                downloads.close();
            } catch (IOException unused) {
                Log.m631e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i = 0; i < this.downloads.size(); i++) {
                ArrayList<Download> arrayList2 = this.downloads;
                arrayList2.set(i, copyDownloadWithState(arrayList2.get(i), 5, 0));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.downloads.add(copyDownloadWithState((Download) arrayList.get(i2), 5, 0));
            }
            Collections.sort(this.downloads, new DownloadManager$InternalHandler$$ExternalSyntheticLambda0());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (IOException e) {
                Log.m632e(DownloadManager.TAG, "Failed to update index.", e);
            }
            ArrayList arrayList3 = new ArrayList(this.downloads);
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                this.mainHandler.obtainMessage(2, new DownloadUpdate(this.downloads.get(i3), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        public final void release() {
            Iterator<Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (IOException e) {
                Log.m632e(DownloadManager.TAG, "Failed to update index.", e);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        public final void syncTasks() {
            int i = 0;
            for (int i2 = 0; i2 < this.downloads.size(); i2++) {
                Download download = this.downloads.get(i2);
                Task taskSyncQueuedDownload = this.activeTasks.get(download.request.f313id);
                int i3 = download.state;
                if (i3 == 0) {
                    taskSyncQueuedDownload = syncQueuedDownload(taskSyncQueuedDownload, download);
                } else if (i3 == 1) {
                    syncStoppedDownload(taskSyncQueuedDownload);
                } else if (i3 == 2) {
                    Assertions.checkNotNull(taskSyncQueuedDownload);
                    syncDownloadingDownload(taskSyncQueuedDownload, download, i);
                } else if (i3 == 5 || i3 == 7) {
                    syncRemovingDownload(taskSyncQueuedDownload, download);
                } else {
                    throw new IllegalStateException();
                }
                if (taskSyncQueuedDownload != null && !taskSyncQueuedDownload.isRemove) {
                    i++;
                }
            }
        }

        public final void syncStoppedDownload(@Nullable Task task) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
            }
        }

        @Nullable
        @CheckResult
        public final Task syncQueuedDownload(@Nullable Task task, Download download) {
            if (task == null) {
                if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                    return null;
                }
                Download downloadPutDownloadWithState = putDownloadWithState(download, 2, 0);
                Task task2 = new Task(downloadPutDownloadWithState.request, this.downloaderFactory.createDownloader(downloadPutDownloadWithState.request), downloadPutDownloadWithState.progress, false, this.minRetryCount, this);
                this.activeTasks.put(downloadPutDownloadWithState.request.f313id, task2);
                int i = this.activeDownloadTaskCount;
                this.activeDownloadTaskCount = i + 1;
                if (i == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                task2.start();
                return task2;
            }
            Assertions.checkState(!task.isRemove);
            task.cancel(false);
            return task;
        }

        public final void syncDownloadingDownload(Task task, Download download, int i) {
            Assertions.checkState(!task.isRemove);
            if (!canDownloadsRun() || i >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        public final void syncRemovingDownload(@Nullable Task task, Download download) {
            if (task == null) {
                if (this.hasActiveRemoveTask) {
                    return;
                }
                Task task2 = new Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.f313id, task2);
                this.hasActiveRemoveTask = true;
                task2.start();
                return;
            }
            if (task.isRemove) {
                return;
            }
            task.cancel(false);
        }

        public final void onContentLengthChanged(Task task, long j) {
            Download download = (Download) Assertions.checkNotNull(getDownload(task.request.f313id, false));
            if (j == download.contentLength || j == -1) {
                return;
            }
            putDownload(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j, download.stopReason, download.failureReason, download.progress));
        }

        public final void onTaskStopped(Task task) {
            String str = task.request.f313id;
            this.activeTasks.remove(str);
            boolean z = task.isRemove;
            if (z) {
                this.hasActiveRemoveTask = false;
            } else {
                int i = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i;
                if (i == 0) {
                    removeMessages(11);
                }
            }
            if (task.isCanceled) {
                syncTasks();
                return;
            }
            Exception exc = task.finalException;
            if (exc != null) {
                Log.m632e(DownloadManager.TAG, "Task failed: " + task.request + ", " + z, exc);
            }
            Download download = (Download) Assertions.checkNotNull(getDownload(str, false));
            int i2 = download.state;
            if (i2 == 2) {
                Assertions.checkState(!z);
                onDownloadTaskStopped(download, exc);
            } else if (i2 == 5 || i2 == 7) {
                Assertions.checkState(z);
                onRemoveTaskStopped(download);
            } else {
                throw new IllegalStateException();
            }
            syncTasks();
        }

        public final void onDownloadTaskStopped(Download download, @Nullable Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.f313id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (IOException e) {
                Log.m632e(DownloadManager.TAG, "Failed to update index.", e);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download2, false, new ArrayList(this.downloads), exc)).sendToTarget();
        }

        public final void onRemoveTaskStopped(Download download) {
            if (download.state == 7) {
                int i = download.stopReason;
                putDownloadWithState(download, i == 0 ? 0 : 1, i);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.f313id));
                try {
                    this.downloadIndex.removeDownload(download.request.f313id);
                } catch (IOException unused) {
                    Log.m631e(DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(2, new DownloadUpdate(download, true, new ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        public final void updateProgress() {
            for (int i = 0; i < this.downloads.size(); i++) {
                Download download = this.downloads.get(i);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (IOException e) {
                        Log.m632e(DownloadManager.TAG, "Failed to update index.", e);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        public final boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        public final Download putDownloadWithState(Download download, int i, int i2) {
            Assertions.checkState((i == 3 || i == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i, i2));
        }

        public final Download putDownload(Download download) {
            int i = download.state;
            Assertions.checkState((i == 3 || i == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.f313id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                Collections.sort(this.downloads, new DownloadManager$InternalHandler$$ExternalSyntheticLambda0());
            } else {
                boolean z = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z) {
                    Collections.sort(this.downloads, new DownloadManager$InternalHandler$$ExternalSyntheticLambda0());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (IOException e) {
                Log.m632e(DownloadManager.TAG, "Failed to update index.", e);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        @Nullable
        public final Download getDownload(String str, boolean z) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (IOException e) {
                Log.m632e(DownloadManager.TAG, "Failed to load download: " + str, e);
                return null;
            }
        }

        public final int getDownloadIndex(String str) {
            for (int i = 0; i < this.downloads.size(); i++) {
                if (this.downloads.get(i).request.f313id.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public static Download copyDownloadWithState(Download download, int i, int i2) {
            return new Download(download.request, i, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i2, 0, download.progress);
        }

        public static int compareStartTimes(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }
    }

    /* loaded from: classes4.dex */
    public static class Task extends Thread implements Downloader.ProgressListener {
        public long contentLength;
        public final DownloadProgress downloadProgress;
        public final Downloader downloader;

        @Nullable
        public Exception finalException;

        @Nullable
        public volatile InternalHandler internalHandler;
        public volatile boolean isCanceled;
        public final boolean isRemove;
        public final int minRetryCount;
        public final DownloadRequest request;

        public /* synthetic */ Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i, InternalHandler internalHandler, C28531 c28531) {
            this(downloadRequest, downloader, downloadProgress, z, i, internalHandler);
        }

        public Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i, InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z;
            this.minRetryCount = i;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }

        public void cancel(boolean z) {
            if (z) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException, IOException {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (IOException e) {
                            if (!this.isCanceled) {
                                long j2 = this.downloadProgress.bytesDownloaded;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                i++;
                                if (i > this.minRetryCount) {
                                    throw e;
                                }
                                Thread.sleep(getRetryDelayMillis(i));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.finalException = e2;
            }
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }

        @Override // androidx.media3.exoplayer.offline.Downloader.ProgressListener
        public void onProgress(long j, long j2, float f) {
            this.downloadProgress.bytesDownloaded = j2;
            this.downloadProgress.percentDownloaded = f;
            if (j != this.contentLength) {
                this.contentLength = j;
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        public static int getRetryDelayMillis(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }
    }

    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;

        @Nullable
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z, List<Download> list, @Nullable Exception exc) {
            this.download = download;
            this.isRemove = z;
            this.downloads = list;
            this.finalException = exc;
        }
    }
}
