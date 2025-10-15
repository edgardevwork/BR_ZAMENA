package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class RemovalListeners {
    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> listener, final Executor executor) {
        Preconditions.checkNotNull(listener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.google.common.cache.RemovalListeners$$ExternalSyntheticLambda1
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.lambda$asynchronous$1(executor, listener, removalNotification);
            }
        };
    }

    public static /* synthetic */ void lambda$asynchronous$1(Executor executor, final RemovalListener removalListener, final RemovalNotification removalNotification) {
        executor.execute(new Runnable() { // from class: com.google.common.cache.RemovalListeners$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                removalListener.onRemoval(removalNotification);
            }
        });
    }
}
