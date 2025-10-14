package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkerWrapper implements Runnable {
    public static final String TAG = Logger.tagWithPrefix("WorkerWrapper");
    public Context mAppContext;
    public Clock mClock;
    public Configuration mConfiguration;
    public DependencyDao mDependencyDao;
    public ForegroundProcessor mForegroundProcessor;
    public WorkerParameters.RuntimeExtras mRuntimeExtras;
    public List<String> mTags;
    public WorkDatabase mWorkDatabase;
    public String mWorkDescription;
    public WorkSpec mWorkSpec;
    public WorkSpecDao mWorkSpecDao;
    public final String mWorkSpecId;
    public TaskExecutor mWorkTaskExecutor;
    public ListenableWorker mWorker;

    @NonNull
    public ListenableWorker.Result mResult = ListenableWorker.Result.failure();

    @NonNull
    public SettableFuture<Boolean> mFuture = SettableFuture.create();

    @NonNull
    public final SettableFuture<ListenableWorker.Result> mWorkerResultFuture = SettableFuture.create();
    public volatile int mInterrupted = -256;

    public WorkerWrapper(@NonNull Builder builder) {
        this.mAppContext = builder.mAppContext;
        this.mWorkTaskExecutor = builder.mWorkTaskExecutor;
        this.mForegroundProcessor = builder.mForegroundProcessor;
        WorkSpec workSpec = builder.mWorkSpec;
        this.mWorkSpec = workSpec;
        this.mWorkSpecId = workSpec.id;
        this.mRuntimeExtras = builder.mRuntimeExtras;
        this.mWorker = builder.mWorker;
        Configuration configuration = builder.mConfiguration;
        this.mConfiguration = configuration;
        this.mClock = configuration.getClock();
        WorkDatabase workDatabase = builder.mWorkDatabase;
        this.mWorkDatabase = workDatabase;
        this.mWorkSpecDao = workDatabase.workSpecDao();
        this.mDependencyDao = this.mWorkDatabase.dependencyDao();
        this.mTags = builder.mTags;
    }

    @NonNull
    public WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.mWorkSpec);
    }

    @NonNull
    public ListenableFuture<Boolean> getFuture() {
        return this.mFuture;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        this.mWorkDescription = createWorkDescription(this.mTags);
        runWorker();
    }

    @NonNull
    public WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    public final void runWorker() {
        Data dataMerge;
        if (tryCheckForInterruptionAndResolve()) {
            return;
        }
        this.mWorkDatabase.beginTransaction();
        try {
            WorkSpec workSpec = this.mWorkSpec;
            if (workSpec.state != WorkInfo.State.ENQUEUED) {
                resolveIncorrectStatus();
                this.mWorkDatabase.setTransactionSuccessful();
                Logger.get().debug(TAG, this.mWorkSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((workSpec.isPeriodic() || this.mWorkSpec.isBackedOff()) && this.mClock.currentTimeMillis() < this.mWorkSpec.calculateNextRunTime()) {
                Logger.get().debug(TAG, String.format("Delaying execution for %s because it is being executed before schedule.", this.mWorkSpec.workerClassName));
                resolve(true);
                this.mWorkDatabase.setTransactionSuccessful();
                return;
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            if (this.mWorkSpec.isPeriodic()) {
                dataMerge = this.mWorkSpec.input;
            } else {
                InputMerger inputMergerCreateInputMergerWithDefaultFallback = this.mConfiguration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.mWorkSpec.inputMergerClassName);
                if (inputMergerCreateInputMergerWithDefaultFallback == null) {
                    Logger.get().error(TAG, "Could not create Input Merger " + this.mWorkSpec.inputMergerClassName);
                    setFailedAndResolve();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.mWorkSpec.input);
                arrayList.addAll(this.mWorkSpecDao.getInputsFromPrerequisites(this.mWorkSpecId));
                dataMerge = inputMergerCreateInputMergerWithDefaultFallback.merge(arrayList);
            }
            Data data = dataMerge;
            UUID uuidFromString = UUID.fromString(this.mWorkSpecId);
            List<String> list = this.mTags;
            WorkerParameters.RuntimeExtras runtimeExtras = this.mRuntimeExtras;
            WorkSpec workSpec2 = this.mWorkSpec;
            WorkerParameters workerParameters = new WorkerParameters(uuidFromString, data, list, runtimeExtras, workSpec2.runAttemptCount, workSpec2.getGeneration(), this.mConfiguration.getExecutor(), this.mWorkTaskExecutor, this.mConfiguration.getWorkerFactory(), new WorkProgressUpdater(this.mWorkDatabase, this.mWorkTaskExecutor), new WorkForegroundUpdater(this.mWorkDatabase, this.mForegroundProcessor, this.mWorkTaskExecutor));
            if (this.mWorker == null) {
                this.mWorker = this.mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(this.mAppContext, this.mWorkSpec.workerClassName, workerParameters);
            }
            ListenableWorker listenableWorker = this.mWorker;
            if (listenableWorker == null) {
                Logger.get().error(TAG, "Could not create Worker " + this.mWorkSpec.workerClassName);
                setFailedAndResolve();
                return;
            }
            if (listenableWorker.isUsed()) {
                Logger.get().error(TAG, "Received an already-used Worker " + this.mWorkSpec.workerClassName + "; Worker Factory should return new instances");
                setFailedAndResolve();
                return;
            }
            this.mWorker.setUsed();
            if (!trySetRunning()) {
                resolveIncorrectStatus();
                return;
            }
            if (tryCheckForInterruptionAndResolve()) {
                return;
            }
            WorkForegroundRunnable workForegroundRunnable = new WorkForegroundRunnable(this.mAppContext, this.mWorkSpec, this.mWorker, workerParameters.getForegroundUpdater(), this.mWorkTaskExecutor);
            this.mWorkTaskExecutor.getMainThreadExecutor().execute(workForegroundRunnable);
            final ListenableFuture<Void> future = workForegroundRunnable.getFuture();
            this.mWorkerResultFuture.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$runWorker$0(future);
                }
            }, new SynchronousExecutor());
            future.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (WorkerWrapper.this.mWorkerResultFuture.isCancelled()) {
                        return;
                    }
                    try {
                        future.get();
                        Logger.get().debug(WorkerWrapper.TAG, "Starting work for " + WorkerWrapper.this.mWorkSpec.workerClassName);
                        WorkerWrapper workerWrapper = WorkerWrapper.this;
                        workerWrapper.mWorkerResultFuture.setFuture(workerWrapper.mWorker.startWork());
                    } catch (Throwable th) {
                        WorkerWrapper.this.mWorkerResultFuture.setException(th);
                    }
                }
            }, this.mWorkTaskExecutor.getMainThreadExecutor());
            final String str = this.mWorkDescription;
            this.mWorkerResultFuture.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        try {
                            ListenableWorker.Result result = WorkerWrapper.this.mWorkerResultFuture.get();
                            if (result == null) {
                                Logger.get().error(WorkerWrapper.TAG, WorkerWrapper.this.mWorkSpec.workerClassName + " returned a null result. Treating it as a failure.");
                            } else {
                                Logger.get().debug(WorkerWrapper.TAG, WorkerWrapper.this.mWorkSpec.workerClassName + " returned a " + result + ".");
                                WorkerWrapper.this.mResult = result;
                            }
                        } catch (InterruptedException e) {
                            e = e;
                            Logger.get().error(WorkerWrapper.TAG, str + " failed because it threw an exception/error", e);
                        } catch (CancellationException e2) {
                            Logger.get().info(WorkerWrapper.TAG, str + " was cancelled", e2);
                        } catch (ExecutionException e3) {
                            e = e3;
                            Logger.get().error(WorkerWrapper.TAG, str + " failed because it threw an exception/error", e);
                        }
                        WorkerWrapper.this.onWorkFinished();
                    } catch (Throwable th) {
                        WorkerWrapper.this.onWorkFinished();
                        throw th;
                    }
                }
            }, this.mWorkTaskExecutor.getSerialTaskExecutor());
        } finally {
            this.mWorkDatabase.endTransaction();
        }
    }

    public final /* synthetic */ void lambda$runWorker$0(ListenableFuture listenableFuture) {
        if (this.mWorkerResultFuture.isCancelled()) {
            listenableFuture.cancel(true);
        }
    }

    public void onWorkFinished() {
        if (tryCheckForInterruptionAndResolve()) {
            return;
        }
        this.mWorkDatabase.beginTransaction();
        try {
            WorkInfo.State state = this.mWorkSpecDao.getState(this.mWorkSpecId);
            this.mWorkDatabase.workProgressDao().delete(this.mWorkSpecId);
            if (state == null) {
                resolve(false);
            } else if (state == WorkInfo.State.RUNNING) {
                handleResult(this.mResult);
            } else if (!state.isFinished()) {
                this.mInterrupted = WorkInfo.STOP_REASON_UNKNOWN;
                rescheduleAndResolve();
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void interrupt(int stopReason) {
        this.mInterrupted = stopReason;
        tryCheckForInterruptionAndResolve();
        this.mWorkerResultFuture.cancel(true);
        if (this.mWorker != null && this.mWorkerResultFuture.isCancelled()) {
            this.mWorker.stop(stopReason);
            return;
        }
        Logger.get().debug(TAG, "WorkSpec " + this.mWorkSpec + " is already done. Not interrupting.");
    }

    public final void resolveIncorrectStatus() {
        WorkInfo.State state = this.mWorkSpecDao.getState(this.mWorkSpecId);
        if (state == WorkInfo.State.RUNNING) {
            Logger.get().debug(TAG, "Status for " + this.mWorkSpecId + " is RUNNING; not doing any work and rescheduling for later execution");
            resolve(true);
            return;
        }
        Logger.get().debug(TAG, "Status for " + this.mWorkSpecId + " is " + state + " ; not doing any work");
        resolve(false);
    }

    public final boolean tryCheckForInterruptionAndResolve() {
        if (this.mInterrupted == -256) {
            return false;
        }
        Logger.get().debug(TAG, "Work interrupted for " + this.mWorkDescription);
        if (this.mWorkSpecDao.getState(this.mWorkSpecId) == null) {
            resolve(false);
        } else {
            resolve(!r0.isFinished());
        }
        return true;
    }

    public final void resolve(final boolean needsReschedule) {
        this.mWorkDatabase.beginTransaction();
        try {
            if (!this.mWorkDatabase.workSpecDao().hasUnfinishedWork()) {
                PackageManagerHelper.setComponentEnabled(this.mAppContext, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
                this.mWorkSpecDao.setStopReason(this.mWorkSpecId, this.mInterrupted);
                this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            this.mFuture.set(Boolean.valueOf(needsReschedule));
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }

    public final void handleResult(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            Logger.get().info(TAG, "Worker result SUCCESS for " + this.mWorkDescription);
            if (this.mWorkSpec.isPeriodic()) {
                resetPeriodicAndResolve();
                return;
            } else {
                setSucceededAndResolve();
                return;
            }
        }
        if (result instanceof ListenableWorker.Result.Retry) {
            Logger.get().info(TAG, "Worker result RETRY for " + this.mWorkDescription);
            rescheduleAndResolve();
            return;
        }
        Logger.get().info(TAG, "Worker result FAILURE for " + this.mWorkDescription);
        if (this.mWorkSpec.isPeriodic()) {
            resetPeriodicAndResolve();
        } else {
            setFailedAndResolve();
        }
    }

    public final boolean trySetRunning() {
        boolean z;
        this.mWorkDatabase.beginTransaction();
        try {
            if (this.mWorkSpecDao.getState(this.mWorkSpecId) == WorkInfo.State.ENQUEUED) {
                this.mWorkSpecDao.setState(WorkInfo.State.RUNNING, this.mWorkSpecId);
                this.mWorkSpecDao.incrementWorkSpecRunAttemptCount(this.mWorkSpecId);
                this.mWorkSpecDao.setStopReason(this.mWorkSpecId, -256);
                z = true;
            } else {
                z = false;
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            return z;
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }

    @VisibleForTesting
    public void setFailedAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            iterativelyFailWorkAndDependents(this.mWorkSpecId);
            Data outputData = ((ListenableWorker.Result.Failure) this.mResult).getOutputData();
            this.mWorkSpecDao.resetWorkSpecNextScheduleTimeOverride(this.mWorkSpecId, this.mWorkSpec.getNextScheduleTimeOverrideGeneration());
            this.mWorkSpecDao.setOutput(this.mWorkSpecId, outputData);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }

    public final void iterativelyFailWorkAndDependents(String workSpecId) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            if (this.mWorkSpecDao.getState(str) != WorkInfo.State.CANCELLED) {
                this.mWorkSpecDao.setState(WorkInfo.State.FAILED, str);
            }
            linkedList.addAll(this.mDependencyDao.getDependentWorkIds(str));
        }
    }

    public final void rescheduleAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            this.mWorkSpecDao.setLastEnqueueTime(this.mWorkSpecId, this.mClock.currentTimeMillis());
            this.mWorkSpecDao.resetWorkSpecNextScheduleTimeOverride(this.mWorkSpecId, this.mWorkSpec.getNextScheduleTimeOverrideGeneration());
            this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(true);
        }
    }

    public final void resetPeriodicAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setLastEnqueueTime(this.mWorkSpecId, this.mClock.currentTimeMillis());
            this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            this.mWorkSpecDao.resetWorkSpecRunAttemptCount(this.mWorkSpecId);
            this.mWorkSpecDao.resetWorkSpecNextScheduleTimeOverride(this.mWorkSpecId, this.mWorkSpec.getNextScheduleTimeOverrideGeneration());
            this.mWorkSpecDao.incrementPeriodCount(this.mWorkSpecId);
            this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }

    public final void setSucceededAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setState(WorkInfo.State.SUCCEEDED, this.mWorkSpecId);
            this.mWorkSpecDao.setOutput(this.mWorkSpecId, ((ListenableWorker.Result.Success) this.mResult).getOutputData());
            long jCurrentTimeMillis = this.mClock.currentTimeMillis();
            for (String str : this.mDependencyDao.getDependentWorkIds(this.mWorkSpecId)) {
                if (this.mWorkSpecDao.getState(str) == WorkInfo.State.BLOCKED && this.mDependencyDao.hasCompletedAllPrerequisites(str)) {
                    Logger.get().info(TAG, "Setting status to enqueued for " + str);
                    this.mWorkSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                    this.mWorkSpecDao.setLastEnqueueTime(str, jCurrentTimeMillis);
                }
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            resolve(false);
        } catch (Throwable th) {
            this.mWorkDatabase.endTransaction();
            resolve(false);
            throw th;
        }
    }

    public final String createWorkDescription(List<String> tags) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.mWorkSpecId);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : tags) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static class Builder {

        @NonNull
        public Context mAppContext;

        @NonNull
        public Configuration mConfiguration;

        @NonNull
        public ForegroundProcessor mForegroundProcessor;

        @NonNull
        public WorkerParameters.RuntimeExtras mRuntimeExtras = new WorkerParameters.RuntimeExtras();
        public final List<String> mTags;

        @NonNull
        public WorkDatabase mWorkDatabase;

        @NonNull
        public WorkSpec mWorkSpec;

        @NonNull
        public TaskExecutor mWorkTaskExecutor;

        @Nullable
        public ListenableWorker mWorker;

        @SuppressLint({"LambdaLast"})
        public Builder(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor workTaskExecutor, @NonNull ForegroundProcessor foregroundProcessor, @NonNull WorkDatabase database, @NonNull WorkSpec workSpec, @NonNull List<String> tags) {
            this.mAppContext = context.getApplicationContext();
            this.mWorkTaskExecutor = workTaskExecutor;
            this.mForegroundProcessor = foregroundProcessor;
            this.mConfiguration = configuration;
            this.mWorkDatabase = database;
            this.mWorkSpec = workSpec;
            this.mTags = tags;
        }

        @NonNull
        public Builder withRuntimeExtras(@Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.mRuntimeExtras = runtimeExtras;
            }
            return this;
        }

        @NonNull
        @VisibleForTesting
        public Builder withWorker(@NonNull ListenableWorker worker) {
            this.mWorker = worker;
            return this;
        }

        @NonNull
        public WorkerWrapper build() {
            return new WorkerWrapper(this);
        }
    }
}
