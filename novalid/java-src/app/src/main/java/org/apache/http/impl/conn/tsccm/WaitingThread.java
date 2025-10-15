package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes8.dex */
public class WaitingThread {
    public boolean aborted;
    public final Condition cond;
    public final RouteSpecificPool pool;
    public Thread waiter;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        Args.notNull(condition, "Condition");
        this.cond = condition;
        this.pool = routeSpecificPool;
    }

    public final Condition getCondition() {
        return this.cond;
    }

    public final RouteSpecificPool getPool() {
        return this.pool;
    }

    public final Thread getThread() {
        return this.waiter;
    }

    public boolean await(Date date) throws InterruptedException {
        boolean zAwaitUntil;
        if (this.waiter != null) {
            throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.waiter);
        }
        if (this.aborted) {
            throw new InterruptedException("Operation interrupted");
        }
        this.waiter = Thread.currentThread();
        try {
            if (date != null) {
                zAwaitUntil = this.cond.awaitUntil(date);
            } else {
                this.cond.await();
                zAwaitUntil = true;
            }
            if (this.aborted) {
                throw new InterruptedException("Operation interrupted");
            }
            this.waiter = null;
            return zAwaitUntil;
        } catch (Throwable th) {
            this.waiter = null;
            throw th;
        }
    }

    public void wakeup() {
        if (this.waiter == null) {
            throw new IllegalStateException("Nobody waiting on this object.");
        }
        this.cond.signalAll();
    }

    public void interrupt() {
        this.aborted = true;
        this.cond.signalAll();
    }
}
