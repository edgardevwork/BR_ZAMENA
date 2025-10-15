package io.appmetrica.analytics;

import androidx.annotation.WorkerThread;

/* loaded from: classes5.dex */
public interface AnrListener {
    @WorkerThread
    void onAppNotResponding();
}
