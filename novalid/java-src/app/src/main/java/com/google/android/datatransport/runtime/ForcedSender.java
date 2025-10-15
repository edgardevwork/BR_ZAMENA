package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;

/* loaded from: classes4.dex */
public final class ForcedSender {
    public static final String LOG_TAG = "ForcedSender";

    @SuppressLint({"DiscouragedApi"})
    @WorkerThread
    public static void sendBlocking(Transport<?> transport, Priority priority) {
        if (transport instanceof TransportImpl) {
            TransportRuntime.getInstance().getUploader().logAndUpdateState(((TransportImpl) transport).getTransportContext().withPriority(priority), 1);
        } else {
            Logging.m1052w(LOG_TAG, "Expected instance of `TransportImpl`, got `%s`.", transport);
        }
    }
}
