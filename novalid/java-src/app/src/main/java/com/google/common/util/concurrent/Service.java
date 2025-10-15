package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@DoNotMock("Create an AbstractIdleService")
@J2ktIncompatible
/* loaded from: classes6.dex */
public interface Service {

    public static abstract class Listener {
        public void failed(State from, Throwable failure) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(State from) {
        }

        public void terminated(State from) {
        }
    }

    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void addListener(Listener listener, Executor executor);

    void awaitRunning();

    void awaitRunning(long timeout, TimeUnit unit) throws TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long timeout, TimeUnit unit) throws TimeoutException;

    Throwable failureCause();

    boolean isRunning();

    @CanIgnoreReturnValue
    Service startAsync();

    State state();

    @CanIgnoreReturnValue
    Service stopAsync();
}
