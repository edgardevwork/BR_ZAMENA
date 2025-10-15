package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class GreedyScheduler implements Scheduler, OnConstraintsStateChangedListener, ExecutionListener {
    public static final int NON_THROTTLE_RUN_ATTEMPT_COUNT = 5;
    public static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
    public final Configuration mConfiguration;
    public final WorkConstraintsTracker mConstraintsTracker;
    public final Context mContext;
    public DelayedWorkTracker mDelayedWorkTracker;
    public Boolean mInDefaultProcess;
    public final Processor mProcessor;
    public boolean mRegisteredExecutionListener;
    public final TaskExecutor mTaskExecutor;
    public final TimeLimiter mTimeLimiter;
    public final WorkLauncher mWorkLauncher;
    public final Map<WorkGenerationalId, Job> mConstrainedWorkSpecs = new HashMap();
    public final Object mLock = new Object();
    public final StartStopTokens mStartStopTokens = new StartStopTokens();
    public final Map<WorkGenerationalId, AttemptData> mFirstRunAttempts = new HashMap();

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    public GreedyScheduler(@NonNull Context context, @NonNull Configuration configuration, @NonNull Trackers trackers, @NonNull Processor processor, @NonNull WorkLauncher workLauncher, @NonNull TaskExecutor taskExecutor) {
        this.mContext = context;
        RunnableScheduler runnableScheduler = configuration.getRunnableScheduler();
        this.mDelayedWorkTracker = new DelayedWorkTracker(this, runnableScheduler, configuration.getClock());
        this.mTimeLimiter = new TimeLimiter(runnableScheduler, workLauncher);
        this.mTaskExecutor = taskExecutor;
        this.mConstraintsTracker = new WorkConstraintsTracker(trackers);
        this.mConfiguration = configuration;
        this.mProcessor = processor;
        this.mWorkLauncher = workLauncher;
    }

    @VisibleForTesting
    public void setDelayedWorkTracker(@NonNull DelayedWorkTracker delayedWorkTracker) {
        this.mDelayedWorkTracker = delayedWorkTracker;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecs) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger.get().info(TAG, "Ignoring schedule request in a secondary process");
            return;
        }
        registerExecutionListenerIfNeeded();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecs) {
            if (!this.mStartStopTokens.contains(WorkSpecKt.generationalId(workSpec))) {
                long jMax = Math.max(workSpec.calculateNextRunTime(), throttleIfNeeded(workSpec));
                long jCurrentTimeMillis = this.mConfiguration.getClock().currentTimeMillis();
                if (workSpec.state == WorkInfo.State.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
                        if (delayedWorkTracker != null) {
                            delayedWorkTracker.schedule(workSpec, jMax);
                        }
                    } else if (workSpec.hasConstraints()) {
                        if (workSpec.constraints.getRequiresDeviceIdle()) {
                            Logger.get().debug(TAG, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (workSpec.constraints.hasContentUriTriggers()) {
                            Logger.get().debug(TAG, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        }
                    } else if (!this.mStartStopTokens.contains(WorkSpecKt.generationalId(workSpec))) {
                        Logger.get().debug(TAG, "Starting work for " + workSpec.id);
                        StartStopToken startStopToken = this.mStartStopTokens.tokenFor(workSpec);
                        this.mTimeLimiter.track(startStopToken);
                        this.mWorkLauncher.startWork(startStopToken);
                    }
                }
            }
        }
        synchronized (this.mLock) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.get().debug(TAG, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (WorkSpec workSpec2 : hashSet) {
                        WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec2);
                        if (!this.mConstrainedWorkSpecs.containsKey(workGenerationalIdGenerationalId)) {
                            this.mConstrainedWorkSpecs.put(workGenerationalIdGenerationalId, WorkConstraintsTrackerKt.listen(this.mConstraintsTracker, workSpec2, this.mTaskExecutor.getTaskCoroutineDispatcher(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void checkDefaultProcess() {
        this.mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.mContext, this.mConfiguration));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String workSpecId) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger.get().info(TAG, "Ignoring schedule request in non-main process");
            return;
        }
        registerExecutionListenerIfNeeded();
        Logger.get().debug(TAG, "Cancelling work ID " + workSpecId);
        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(workSpecId);
        }
        for (StartStopToken startStopToken : this.mStartStopTokens.remove(workSpecId)) {
            this.mTimeLimiter.cancel(startStopToken);
            this.mWorkLauncher.stopWork(startStopToken);
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState state) {
        WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
        if (state instanceof ConstraintsState.ConstraintsMet) {
            if (this.mStartStopTokens.contains(workGenerationalIdGenerationalId)) {
                return;
            }
            Logger.get().debug(TAG, "Constraints met: Scheduling work ID " + workGenerationalIdGenerationalId);
            StartStopToken startStopToken = this.mStartStopTokens.tokenFor(workGenerationalIdGenerationalId);
            this.mTimeLimiter.track(startStopToken);
            this.mWorkLauncher.startWork(startStopToken);
            return;
        }
        Logger.get().debug(TAG, "Constraints not met: Cancelling work ID " + workGenerationalIdGenerationalId);
        StartStopToken startStopTokenRemove = this.mStartStopTokens.remove(workGenerationalIdGenerationalId);
        if (startStopTokenRemove != null) {
            this.mTimeLimiter.cancel(startStopTokenRemove);
            this.mWorkLauncher.stopWorkWithReason(startStopTokenRemove, ((ConstraintsState.ConstraintsNotMet) state).getReason());
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId id, boolean needsReschedule) {
        StartStopToken startStopTokenRemove = this.mStartStopTokens.remove(id);
        if (startStopTokenRemove != null) {
            this.mTimeLimiter.cancel(startStopTokenRemove);
        }
        removeConstraintTrackingFor(id);
        if (needsReschedule) {
            return;
        }
        synchronized (this.mLock) {
            this.mFirstRunAttempts.remove(id);
        }
    }

    public final void removeConstraintTrackingFor(@NonNull WorkGenerationalId id) {
        Job jobRemove;
        synchronized (this.mLock) {
            jobRemove = this.mConstrainedWorkSpecs.remove(id);
        }
        if (jobRemove != null) {
            Logger.get().debug(TAG, "Stopping tracking for " + id);
            jobRemove.cancel((CancellationException) null);
        }
    }

    public final void registerExecutionListenerIfNeeded() {
        if (this.mRegisteredExecutionListener) {
            return;
        }
        this.mProcessor.addExecutionListener(this);
        this.mRegisteredExecutionListener = true;
    }

    public final long throttleIfNeeded(WorkSpec workSpec) {
        long jMax;
        synchronized (this.mLock) {
            try {
                WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
                AttemptData attemptData = this.mFirstRunAttempts.get(workGenerationalIdGenerationalId);
                if (attemptData == null) {
                    attemptData = new AttemptData(workSpec.runAttemptCount, this.mConfiguration.getClock().currentTimeMillis());
                    this.mFirstRunAttempts.put(workGenerationalIdGenerationalId, attemptData);
                }
                jMax = attemptData.mTimeStamp + (Math.max((workSpec.runAttemptCount - attemptData.mRunAttemptCount) - 5, 0) * 30000);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    /* loaded from: classes.dex */
    public static class AttemptData {
        public final int mRunAttemptCount;
        public final long mTimeStamp;

        public /* synthetic */ AttemptData(int i, long j, C33171 c33171) {
            this(i, j);
        }

        public AttemptData(int runAttemptCount, long timeStamp) {
            this.mRunAttemptCount = runAttemptCount;
            this.mTimeStamp = timeStamp;
        }
    }
}
