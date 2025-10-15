package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MessageThreadUtil<T> implements ThreadUtil<T> {

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1 */
    public class C31341 implements ThreadUtil.MainThreadCallback<T> {
        public static final int ADD_TILE = 2;
        public static final int REMOVE_TILE = 3;
        public static final int UPDATE_ITEM_COUNT = 1;
        public final /* synthetic */ ThreadUtil.MainThreadCallback val$callback;
        public final MessageQueue mQueue = new MessageQueue();
        public final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
        public Runnable mMainThreadRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.1.1
            @Override // java.lang.Runnable
            public void run() {
                SyncQueueItem next = C31341.this.mQueue.next();
                while (next != null) {
                    int i = next.what;
                    if (i == 1) {
                        C31341.this.val$callback.updateItemCount(next.arg1, next.arg2);
                    } else if (i == 2) {
                        C31341.this.val$callback.addTile(next.arg1, (TileList.Tile) next.data);
                    } else if (i == 3) {
                        C31341.this.val$callback.removeTile(next.arg1, next.arg2);
                    } else {
                        Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                    }
                    next = C31341.this.mQueue.next();
                }
            }
        };

        public C31341(ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.val$callback = mainThreadCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            sendMessage(SyncQueueItem.obtainMessage(1, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile<T> tile) {
            sendMessage(SyncQueueItem.obtainMessage(2, i, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            sendMessage(SyncQueueItem.obtainMessage(3, i, i2));
        }

        public final void sendMessage(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            this.mMainThreadHandler.post(this.mMainThreadRunnable);
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        return new C31341(mainThreadCallback);
    }

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2 */
    public class C31352 implements ThreadUtil.BackgroundCallback<T> {
        public static final int LOAD_TILE = 3;
        public static final int RECYCLE_TILE = 4;
        public static final int REFRESH = 1;
        public static final int UPDATE_RANGE = 2;
        public final /* synthetic */ ThreadUtil.BackgroundCallback val$callback;
        public final MessageQueue mQueue = new MessageQueue();
        public final Executor mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        public AtomicBoolean mBackgroundRunning = new AtomicBoolean(false);
        public Runnable mBackgroundRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.2.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    SyncQueueItem next = C31352.this.mQueue.next();
                    if (next != null) {
                        int i = next.what;
                        if (i == 1) {
                            C31352.this.mQueue.removeMessages(1);
                            C31352.this.val$callback.refresh(next.arg1);
                        } else if (i == 2) {
                            C31352.this.mQueue.removeMessages(2);
                            C31352.this.mQueue.removeMessages(3);
                            C31352.this.val$callback.updateRange(next.arg1, next.arg2, next.arg3, next.arg4, next.arg5);
                        } else if (i == 3) {
                            C31352.this.val$callback.loadTile(next.arg1, next.arg2);
                        } else if (i == 4) {
                            C31352.this.val$callback.recycleTile((TileList.Tile) next.data);
                        } else {
                            Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                        }
                    } else {
                        C31352.this.mBackgroundRunning.set(false);
                        return;
                    }
                }
            }
        };

        public C31352(ThreadUtil.BackgroundCallback backgroundCallback) {
            this.val$callback = backgroundCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i, (Object) null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i, i2, i3, i4, i5, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            sendMessage(SyncQueueItem.obtainMessage(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
            sendMessage(SyncQueueItem.obtainMessage(4, 0, tile));
        }

        public final void sendMessage(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        public final void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessageAtFrontOfQueue(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        public final void maybeExecuteBackgroundRunnable() {
            if (this.mBackgroundRunning.compareAndSet(false, true)) {
                this.mExecutor.execute(this.mBackgroundRunnable);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        return new C31352(backgroundCallback);
    }

    public static class SyncQueueItem {
        public static SyncQueueItem sPool;
        public static final Object sPoolLock = new Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        public SyncQueueItem next;
        public int what;

        public void recycle() {
            this.next = null;
            this.arg5 = 0;
            this.arg4 = 0;
            this.arg3 = 0;
            this.arg2 = 0;
            this.arg1 = 0;
            this.what = 0;
            this.data = null;
            synchronized (sPoolLock) {
                try {
                    SyncQueueItem syncQueueItem = sPool;
                    if (syncQueueItem != null) {
                        this.next = syncQueueItem;
                    }
                    sPool = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static SyncQueueItem obtainMessage(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            SyncQueueItem syncQueueItem;
            synchronized (sPoolLock) {
                try {
                    syncQueueItem = sPool;
                    if (syncQueueItem == null) {
                        syncQueueItem = new SyncQueueItem();
                    } else {
                        sPool = syncQueueItem.next;
                        syncQueueItem.next = null;
                    }
                    syncQueueItem.what = i;
                    syncQueueItem.arg1 = i2;
                    syncQueueItem.arg2 = i3;
                    syncQueueItem.arg3 = i4;
                    syncQueueItem.arg4 = i5;
                    syncQueueItem.arg5 = i6;
                    syncQueueItem.data = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return syncQueueItem;
        }

        public static SyncQueueItem obtainMessage(int i, int i2, int i3) {
            return obtainMessage(i, i2, i3, 0, 0, 0, null);
        }

        public static SyncQueueItem obtainMessage(int i, int i2, Object obj) {
            return obtainMessage(i, i2, 0, 0, 0, 0, obj);
        }
    }

    public static class MessageQueue {
        public final Object mLock = new Object();
        public SyncQueueItem mRoot;

        public SyncQueueItem next() {
            synchronized (this.mLock) {
                try {
                    SyncQueueItem syncQueueItem = this.mRoot;
                    if (syncQueueItem == null) {
                        return null;
                    }
                    this.mRoot = syncQueueItem.next;
                    return syncQueueItem;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            synchronized (this.mLock) {
                syncQueueItem.next = this.mRoot;
                this.mRoot = syncQueueItem;
            }
        }

        public void sendMessage(SyncQueueItem syncQueueItem) {
            synchronized (this.mLock) {
                try {
                    SyncQueueItem syncQueueItem2 = this.mRoot;
                    if (syncQueueItem2 == null) {
                        this.mRoot = syncQueueItem;
                        return;
                    }
                    while (true) {
                        SyncQueueItem syncQueueItem3 = syncQueueItem2.next;
                        if (syncQueueItem3 == null) {
                            syncQueueItem2.next = syncQueueItem;
                            return;
                        }
                        syncQueueItem2 = syncQueueItem3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void removeMessages(int i) {
            SyncQueueItem syncQueueItem;
            synchronized (this.mLock) {
                while (true) {
                    try {
                        syncQueueItem = this.mRoot;
                        if (syncQueueItem == null || syncQueueItem.what != i) {
                            break;
                        }
                        this.mRoot = syncQueueItem.next;
                        syncQueueItem.recycle();
                    } finally {
                    }
                }
                if (syncQueueItem != null) {
                    SyncQueueItem syncQueueItem2 = syncQueueItem.next;
                    while (syncQueueItem2 != null) {
                        SyncQueueItem syncQueueItem3 = syncQueueItem2.next;
                        if (syncQueueItem2.what == i) {
                            syncQueueItem.next = syncQueueItem3;
                            syncQueueItem2.recycle();
                        } else {
                            syncQueueItem = syncQueueItem2;
                        }
                        syncQueueItem2 = syncQueueItem3;
                    }
                }
            }
        }
    }
}
