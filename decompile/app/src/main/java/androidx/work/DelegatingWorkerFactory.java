package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class DelegatingWorkerFactory extends WorkerFactory {
    public static final String TAG = Logger.tagWithPrefix("DelegatingWkrFctry");
    public final List<WorkerFactory> mFactories = new CopyOnWriteArrayList();

    @NonNull
    @VisibleForTesting
    public List<WorkerFactory> getFactories() {
        return this.mFactories;
    }

    public final void addFactory(@NonNull WorkerFactory workerFactory) {
        this.mFactories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public final ListenableWorker createWorker(@NonNull Context appContext, @NonNull String workerClassName, @NonNull WorkerParameters workerParameters) {
        Iterator<WorkerFactory> it = this.mFactories.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerCreateWorker = it.next().createWorker(appContext, workerClassName, workerParameters);
                if (listenableWorkerCreateWorker != null) {
                    return listenableWorkerCreateWorker;
                }
            } catch (Throwable th) {
                Logger.get().error(TAG, "Unable to instantiate a ListenableWorker (" + workerClassName + ")", th);
                throw th;
            }
        }
        return null;
    }
}
