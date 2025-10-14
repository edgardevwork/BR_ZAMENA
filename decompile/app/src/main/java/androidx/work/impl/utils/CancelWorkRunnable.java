package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class CancelWorkRunnable implements Runnable {
    public final OperationImpl mOperation = new OperationImpl();

    public abstract void runInternal();

    @NonNull
    public Operation getOperation() {
        return this.mOperation;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runInternal();
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.markState(new Operation.State.FAILURE(th));
        }
    }

    public void cancel(WorkManagerImpl workManagerImpl, String workSpecId) {
        iterativelyCancelWorkAndDependents(workManagerImpl.getWorkDatabase(), workSpecId);
        workManagerImpl.getProcessor().stopAndCancelWork(workSpecId, 1);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(workSpecId);
        }
    }

    public void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    public final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String workSpecId) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            WorkInfo.State state = workSpecDao.getState(str);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str));
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$1 */
    public class C33711 extends CancelWorkRunnable {
        public final /* synthetic */ UUID val$id;

        public C33711(final UUID val$id) {
            val$id = val$id;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                cancel(val$workManagerImpl, val$id.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                reschedulePendingWorkers(val$workManagerImpl);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @NonNull
    public static CancelWorkRunnable forId(@NonNull final UUID id, @NonNull final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            public final /* synthetic */ UUID val$id;

            public C33711(final UUID id2) {
                val$id = id2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            public void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    cancel(val$workManagerImpl, val$id.toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(val$workManagerImpl);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$2 */
    public class C33722 extends CancelWorkRunnable {
        public final /* synthetic */ String val$tag;

        public C33722(final String val$tag) {
            val$tag = val$tag;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(val$tag).iterator();
                while (it.hasNext()) {
                    cancel(val$workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                reschedulePendingWorkers(val$workManagerImpl);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @NonNull
    public static CancelWorkRunnable forTag(@NonNull final String tag, @NonNull final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            public final /* synthetic */ String val$tag;

            public C33722(final String tag2) {
                val$tag = tag2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            public void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(val$tag).iterator();
                    while (it.hasNext()) {
                        cancel(val$workManagerImpl, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(val$workManagerImpl);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$3 */
    public class C33733 extends CancelWorkRunnable {
        public final /* synthetic */ boolean val$allowReschedule;
        public final /* synthetic */ String val$name;

        public C33733(final String val$name, final boolean val$allowReschedule) {
            val$name = val$name;
            val$allowReschedule = val$allowReschedule;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(val$name).iterator();
                while (it.hasNext()) {
                    cancel(val$workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (val$allowReschedule) {
                    reschedulePendingWorkers(val$workManagerImpl);
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @NonNull
    public static CancelWorkRunnable forName(@NonNull final String name, @NonNull final WorkManagerImpl workManagerImpl, final boolean allowReschedule) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
            public final /* synthetic */ boolean val$allowReschedule;
            public final /* synthetic */ String val$name;

            public C33733(final String name2, final boolean allowReschedule2) {
                val$name = name2;
                val$allowReschedule = allowReschedule2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            public void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(val$name).iterator();
                    while (it.hasNext()) {
                        cancel(val$workManagerImpl, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (val$allowReschedule) {
                        reschedulePendingWorkers(val$workManagerImpl);
                    }
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$4 */
    public class C33744 extends CancelWorkRunnable {
        public C33744() {
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it.hasNext()) {
                    cancel(val$workManagerImpl, it.next());
                }
                new PreferenceUtils(val$workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(val$workManagerImpl.getConfiguration().getClock().currentTimeMillis());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @NonNull
    public static CancelWorkRunnable forAll(@NonNull final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.4
            public C33744() {
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            public void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                    while (it.hasNext()) {
                        cancel(val$workManagerImpl, it.next());
                    }
                    new PreferenceUtils(val$workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(val$workManagerImpl.getConfiguration().getClock().currentTimeMillis());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }
}
