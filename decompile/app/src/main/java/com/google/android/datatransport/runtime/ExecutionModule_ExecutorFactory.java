package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import java.util.concurrent.Executor;

@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes8.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {
    @Override // javax.inject.Provider
    public Executor get() {
        return executor();
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNullFromProvides(ExecutionModule.executor());
    }

    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        public static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory();
    }
}
