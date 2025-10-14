package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DelayedWorkTracker {
    public static final String TAG = Logger.tagWithPrefix("DelayedWorkTracker");
    public final Clock mClock;
    public final Scheduler mImmediateScheduler;
    public final RunnableScheduler mRunnableScheduler;
    public final Map<String, Runnable> mRunnables = new HashMap();

    public DelayedWorkTracker(@NonNull Scheduler immediateScheduler, @NonNull RunnableScheduler runnableScheduler, @NonNull Clock clock) {
        this.mImmediateScheduler = immediateScheduler;
        this.mRunnableScheduler = runnableScheduler;
        this.mClock = clock;
    }

    public void schedule(@NonNull final WorkSpec workSpec, long nextRunTime) {
        Runnable runnableRemove = this.mRunnables.remove(workSpec.id);
        if (runnableRemove != null) {
            this.mRunnableScheduler.cancel(runnableRemove);
        }
        Runnable runnable = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
            @Override // java.lang.Runnable
            public void run() {
                Logger.get().debug(DelayedWorkTracker.TAG, "Scheduling work " + workSpec.id);
                DelayedWorkTracker.this.mImmediateScheduler.schedule(workSpec);
            }
        };
        this.mRunnables.put(workSpec.id, runnable);
        this.mRunnableScheduler.scheduleWithDelay(nextRunTime - this.mClock.currentTimeMillis(), runnable);
    }

    public void unschedule(@NonNull String workSpecId) {
        Runnable runnableRemove = this.mRunnables.remove(workSpecId);
        if (runnableRemove != null) {
            this.mRunnableScheduler.cancel(runnableRemove);
        }
    }
}
