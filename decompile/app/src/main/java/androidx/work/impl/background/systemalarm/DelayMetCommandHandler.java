package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, WorkTimer.TimeLimitExceededListener {
    public static final int STATE_INITIAL = 0;
    public static final int STATE_START_REQUESTED = 1;
    public static final int STATE_STOP_REQUESTED = 2;
    public static final String TAG = Logger.tagWithPrefix("DelayMetCommandHandler");
    public final Context mContext;
    public final CoroutineDispatcher mCoroutineDispatcher;
    public int mCurrentState;
    public final SystemAlarmDispatcher mDispatcher;
    public boolean mHasConstraints;
    public volatile Job mJob;
    public final Object mLock;
    public final Executor mMainThreadExecutor;
    public final Executor mSerialExecutor;
    public final int mStartId;
    public final StartStopToken mToken;

    @Nullable
    public PowerManager.WakeLock mWakeLock;
    public final WorkConstraintsTracker mWorkConstraintsTracker;
    public final WorkGenerationalId mWorkGenerationalId;

    public DelayMetCommandHandler(@NonNull Context context, int startId, @NonNull SystemAlarmDispatcher dispatcher, @NonNull StartStopToken startStopToken) {
        this.mContext = context;
        this.mStartId = startId;
        this.mDispatcher = dispatcher;
        this.mWorkGenerationalId = startStopToken.getId();
        this.mToken = startStopToken;
        Trackers trackers = dispatcher.getWorkManager().getTrackers();
        this.mSerialExecutor = dispatcher.getTaskExecutor().getSerialTaskExecutor();
        this.mMainThreadExecutor = dispatcher.getTaskExecutor().getMainThreadExecutor();
        this.mCoroutineDispatcher = dispatcher.getTaskExecutor().getTaskCoroutineDispatcher();
        this.mWorkConstraintsTracker = new WorkConstraintsTracker(trackers);
        this.mHasConstraints = false;
        this.mCurrentState = 0;
        this.mLock = new Object();
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState state) {
        if (state instanceof ConstraintsState.ConstraintsMet) {
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda1(this));
        } else {
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
        }
    }

    public final void startWork() {
        if (this.mCurrentState == 0) {
            this.mCurrentState = 1;
            Logger.get().debug(TAG, "onAllConstraintsMet for " + this.mWorkGenerationalId);
            if (this.mDispatcher.getProcessor().startWork(this.mToken)) {
                this.mDispatcher.getWorkTimer().startTimer(this.mWorkGenerationalId, CommandHandler.WORK_PROCESSING_TIME_IN_MS, this);
                return;
            } else {
                cleanUp();
                return;
            }
        }
        Logger.get().debug(TAG, "Already started work for " + this.mWorkGenerationalId);
    }

    public void onExecuted(boolean needsReschedule) {
        Logger.get().debug(TAG, "onExecuted " + this.mWorkGenerationalId + ", " + needsReschedule);
        cleanUp();
        if (needsReschedule) {
            this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
        }
        if (this.mHasConstraints) {
            this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createConstraintsChangedIntent(this.mContext), this.mStartId));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void onTimeLimitExceeded(@NonNull WorkGenerationalId id) {
        Logger.get().debug(TAG, "Exceeded time limits on execution for " + id);
        this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
    }

    @WorkerThread
    public void handleProcessWork() {
        String workSpecId = this.mWorkGenerationalId.getWorkSpecId();
        this.mWakeLock = WakeLocks.newWakeLock(this.mContext, workSpecId + " (" + this.mStartId + ")");
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Acquiring wakelock " + this.mWakeLock + "for WorkSpec " + workSpecId);
        this.mWakeLock.acquire();
        WorkSpec workSpec = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(workSpecId);
        if (workSpec == null) {
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda0(this));
            return;
        }
        boolean zHasConstraints = workSpec.hasConstraints();
        this.mHasConstraints = zHasConstraints;
        if (!zHasConstraints) {
            Logger.get().debug(str, "No constraints for " + workSpecId);
            this.mSerialExecutor.execute(new DelayMetCommandHandler$$ExternalSyntheticLambda1(this));
            return;
        }
        this.mJob = WorkConstraintsTrackerKt.listen(this.mWorkConstraintsTracker, workSpec, this.mCoroutineDispatcher, this);
    }

    public final void stopWork() {
        String workSpecId = this.mWorkGenerationalId.getWorkSpecId();
        if (this.mCurrentState < 2) {
            this.mCurrentState = 2;
            Logger logger = Logger.get();
            String str = TAG;
            logger.debug(str, "Stopping work for WorkSpec " + workSpecId);
            this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createStopWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
            if (this.mDispatcher.getProcessor().isEnqueued(this.mWorkGenerationalId.getWorkSpecId())) {
                Logger.get().debug(str, "WorkSpec " + workSpecId + " needs to be rescheduled");
                this.mMainThreadExecutor.execute(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, CommandHandler.createScheduleWorkIntent(this.mContext, this.mWorkGenerationalId), this.mStartId));
                return;
            }
            Logger.get().debug(str, "Processor does not have WorkSpec " + workSpecId + ". No need to reschedule");
            return;
        }
        Logger.get().debug(TAG, "Already stopped work for " + workSpecId);
    }

    public final void cleanUp() {
        synchronized (this.mLock) {
            try {
                if (this.mJob != null) {
                    this.mJob.cancel((CancellationException) null);
                }
                this.mDispatcher.getWorkTimer().stopTimer(this.mWorkGenerationalId);
                PowerManager.WakeLock wakeLock = this.mWakeLock;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.get().debug(TAG, "Releasing wakelock " + this.mWakeLock + "for WorkSpec " + this.mWorkGenerationalId);
                    this.mWakeLock.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
