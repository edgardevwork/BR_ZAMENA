package org.apache.commons.p059io;

import java.time.Duration;

/* loaded from: classes8.dex */
public class ThreadMonitor implements Runnable {
    public final Thread thread;
    public final Duration timeout;

    public static Thread start(Duration duration) {
        return start(Thread.currentThread(), duration);
    }

    public static Thread start(Thread thread, Duration duration) {
        if (duration.isZero() || duration.isNegative()) {
            return null;
        }
        Thread thread2 = new Thread(new ThreadMonitor(thread, duration), ThreadMonitor.class.getSimpleName());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public static void stop(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    public ThreadMonitor(Thread thread, Duration duration) {
        this.thread = thread;
        this.timeout = duration;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            sleep(this.timeout);
            this.thread.interrupt();
        } catch (InterruptedException unused) {
        }
    }

    public static void sleep(Duration duration) throws InterruptedException {
        long millis = duration.toMillis();
        long jCurrentTimeMillis = System.currentTimeMillis() + millis;
        do {
            Thread.sleep(millis);
            millis = jCurrentTimeMillis - System.currentTimeMillis();
        } while (millis > 0);
    }
}
