package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemAlarmDispatcher implements ExecutionListener {
    public static final int DEFAULT_START_ID = 0;
    public static final String KEY_START_ID = "KEY_START_ID";
    public static final String PROCESS_COMMAND_TAG = "ProcessCommand";
    public static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
    public final CommandHandler mCommandHandler;

    @Nullable
    public CommandsCompletedListener mCompletedListener;
    public final Context mContext;
    public Intent mCurrentIntent;
    public final List<Intent> mIntents;
    public final Processor mProcessor;
    public StartStopTokens mStartStopTokens;
    public final TaskExecutor mTaskExecutor;
    public final WorkLauncher mWorkLauncher;
    public final WorkManagerImpl mWorkManager;
    public final WorkTimer mWorkTimer;

    /* loaded from: classes.dex */
    public interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    public SystemAlarmDispatcher(@NonNull Context context) {
        this(context, null, null, null);
    }

    @VisibleForTesting
    public SystemAlarmDispatcher(@NonNull Context context, @Nullable Processor processor, @Nullable WorkManagerImpl workManager, @Nullable WorkLauncher launcher) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mStartStopTokens = new StartStopTokens();
        workManager = workManager == null ? WorkManagerImpl.getInstance(context) : workManager;
        this.mWorkManager = workManager;
        this.mCommandHandler = new CommandHandler(applicationContext, workManager.getConfiguration().getClock(), this.mStartStopTokens);
        this.mWorkTimer = new WorkTimer(workManager.getConfiguration().getRunnableScheduler());
        processor = processor == null ? workManager.getProcessor() : processor;
        this.mProcessor = processor;
        TaskExecutor workTaskExecutor = workManager.getWorkTaskExecutor();
        this.mTaskExecutor = workTaskExecutor;
        this.mWorkLauncher = launcher == null ? new WorkLauncherImpl(processor, workTaskExecutor) : launcher;
        processor.addExecutionListener(this);
        this.mIntents = new ArrayList();
        this.mCurrentIntent = null;
    }

    public void onDestroy() {
        Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher");
        this.mProcessor.removeExecutionListener(this);
        this.mCompletedListener = null;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId id, boolean needsReschedule) {
        this.mTaskExecutor.getMainThreadExecutor().execute(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(this.mContext, id, needsReschedule), 0));
    }

    @MainThread
    public boolean add(@NonNull final Intent intent, final int startId) {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Adding command " + intent + " (" + startId + ")");
        assertMainThread();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(str, "Unknown command. Ignoring");
            return false;
        }
        if (CommandHandler.ACTION_CONSTRAINTS_CHANGED.equals(action) && hasIntentWithAction(CommandHandler.ACTION_CONSTRAINTS_CHANGED)) {
            return false;
        }
        intent.putExtra(KEY_START_ID, startId);
        synchronized (this.mIntents) {
            try {
                boolean z = !this.mIntents.isEmpty();
                this.mIntents.add(intent);
                if (!z) {
                    processCommand();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void setCompletedListener(@NonNull CommandsCompletedListener listener) {
        if (this.mCompletedListener != null) {
            Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.mCompletedListener = listener;
        }
    }

    public Processor getProcessor() {
        return this.mProcessor;
    }

    public WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    public WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    public TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    public WorkLauncher getWorkerLauncher() {
        return this.mWorkLauncher;
    }

    @MainThread
    public void dequeueAndCheckForCompletion() {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Checking if commands are complete.");
        assertMainThread();
        synchronized (this.mIntents) {
            try {
                if (this.mCurrentIntent != null) {
                    Logger.get().debug(str, "Removing command " + this.mCurrentIntent);
                    if (!this.mIntents.remove(0).equals(this.mCurrentIntent)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.mCurrentIntent = null;
                }
                SerialExecutor serialTaskExecutor = this.mTaskExecutor.getSerialTaskExecutor();
                if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty() && !serialTaskExecutor.hasPendingTasks()) {
                    Logger.get().debug(str, "No more commands & intents.");
                    CommandsCompletedListener commandsCompletedListener = this.mCompletedListener;
                    if (commandsCompletedListener != null) {
                        commandsCompletedListener.onAllCommandsCompleted();
                    }
                } else if (!this.mIntents.isEmpty()) {
                    processCommand();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @MainThread
    public final void processCommand() {
        assertMainThread();
        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            wakeLockNewWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    Executor mainThreadExecutor;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.mIntents) {
                        SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.mCurrentIntent = systemAlarmDispatcher.mIntents.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.mCurrentIntent;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(SystemAlarmDispatcher.KEY_START_ID, 0);
                        Logger logger = Logger.get();
                        String str = SystemAlarmDispatcher.TAG;
                        logger.debug(str, "Processing command " + SystemAlarmDispatcher.this.mCurrentIntent + ", " + intExtra);
                        PowerManager.WakeLock wakeLockNewWakeLock2 = WakeLocks.newWakeLock(SystemAlarmDispatcher.this.mContext, action + " (" + intExtra + ")");
                        try {
                            Logger.get().debug(str, "Acquiring operation wake lock (" + action + ") " + wakeLockNewWakeLock2);
                            wakeLockNewWakeLock2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher2.mCommandHandler.onHandleIntent(systemAlarmDispatcher2.mCurrentIntent, intExtra, systemAlarmDispatcher2);
                            Logger.get().debug(str, "Releasing operation wake lock (" + action + ") " + wakeLockNewWakeLock2);
                            wakeLockNewWakeLock2.release();
                            mainThreadExecutor = SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                        } catch (Throwable th) {
                            try {
                                Logger logger2 = Logger.get();
                                String str2 = SystemAlarmDispatcher.TAG;
                                logger2.error(str2, "Unexpected error in onHandleIntent", th);
                                Logger.get().debug(str2, "Releasing operation wake lock (" + action + ") " + wakeLockNewWakeLock2);
                                wakeLockNewWakeLock2.release();
                                mainThreadExecutor = SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                            } catch (Throwable th2) {
                                Logger.get().debug(SystemAlarmDispatcher.TAG, "Releasing operation wake lock (" + action + ") " + wakeLockNewWakeLock2);
                                wakeLockNewWakeLock2.release();
                                SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor().execute(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        mainThreadExecutor.execute(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            wakeLockNewWakeLock.release();
        }
    }

    @MainThread
    public final boolean hasIntentWithAction(@NonNull String action) {
        assertMainThread();
        synchronized (this.mIntents) {
            try {
                Iterator<Intent> it = this.mIntents.iterator();
                while (it.hasNext()) {
                    if (action.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void assertMainThread() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* loaded from: classes.dex */
    public static class DequeueAndCheckForCompletion implements Runnable {
        public final SystemAlarmDispatcher mDispatcher;

        public DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher dispatcher) {
            this.mDispatcher = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    /* loaded from: classes.dex */
    public static class AddRunnable implements Runnable {
        public final SystemAlarmDispatcher mDispatcher;
        public final Intent mIntent;
        public final int mStartId;

        public AddRunnable(@NonNull SystemAlarmDispatcher dispatcher, @NonNull Intent intent, int startId) {
            this.mDispatcher = dispatcher;
            this.mIntent = intent;
            this.mStartId = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }
}
