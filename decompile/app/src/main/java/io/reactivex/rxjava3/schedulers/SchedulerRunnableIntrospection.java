package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;

/* loaded from: classes7.dex */
public interface SchedulerRunnableIntrospection {
    @NonNull
    Runnable getWrappedRunnable();
}
