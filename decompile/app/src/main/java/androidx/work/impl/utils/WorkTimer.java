package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class WorkTimer {
    public static final String TAG = Logger.tagWithPrefix("WorkTimer");
    public final RunnableScheduler mRunnableScheduler;
    public final Map<WorkGenerationalId, WorkTimerRunnable> mTimerMap = new HashMap();
    public final Map<WorkGenerationalId, TimeLimitExceededListener> mListeners = new HashMap();
    public final Object mLock = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull WorkGenerationalId id);
    }

    public WorkTimer(@NonNull RunnableScheduler scheduler) {
        this.mRunnableScheduler = scheduler;
    }

    public void startTimer(@NonNull final WorkGenerationalId id, long processingTimeMillis, @NonNull TimeLimitExceededListener listener) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Starting timer for " + id);
            stopTimer(id);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, id);
            this.mTimerMap.put(id, workTimerRunnable);
            this.mListeners.put(id, listener);
            this.mRunnableScheduler.scheduleWithDelay(processingTimeMillis, workTimerRunnable);
        }
    }

    public void stopTimer(@NonNull final WorkGenerationalId id) {
        synchronized (this.mLock) {
            try {
                if (this.mTimerMap.remove(id) != null) {
                    Logger.get().debug(TAG, "Stopping timer for " + id);
                    this.mListeners.remove(id);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, WorkTimerRunnable> getTimerMap() {
        Map<WorkGenerationalId, WorkTimerRunnable> map;
        synchronized (this.mLock) {
            map = this.mTimerMap;
        }
        return map;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, TimeLimitExceededListener> getListeners() {
        Map<WorkGenerationalId, TimeLimitExceededListener> map;
        synchronized (this.mLock) {
            map = this.mListeners;
        }
        return map;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class WorkTimerRunnable implements Runnable {
        public static final String TAG = "WrkTimerRunnable";
        public final WorkGenerationalId mWorkGenerationalId;
        public final WorkTimer mWorkTimer;

        public WorkTimerRunnable(@NonNull WorkTimer workTimer, @NonNull WorkGenerationalId id) {
            this.mWorkTimer = workTimer;
            this.mWorkGenerationalId = id;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                try {
                    if (this.mWorkTimer.mTimerMap.remove(this.mWorkGenerationalId) != null) {
                        TimeLimitExceededListener timeLimitExceededListenerRemove = this.mWorkTimer.mListeners.remove(this.mWorkGenerationalId);
                        if (timeLimitExceededListenerRemove != null) {
                            timeLimitExceededListenerRemove.onTimeLimitExceeded(this.mWorkGenerationalId);
                        }
                    } else {
                        Logger.get().debug(TAG, String.format("Timer with %s is already marked as complete.", this.mWorkGenerationalId));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
