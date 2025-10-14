package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class HandlerScheduler extends Scheduler {
    public final boolean async;
    public final Handler handler;

    public HandlerScheduler(Handler handler, boolean async) {
        this.handler = handler;
        this.async = async;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @SuppressLint({"NewApi"})
    public Disposable scheduleDirect(Runnable run, long delay, TimeUnit unit) {
        if (run == null) {
            throw new NullPointerException("run == null");
        }
        if (unit == null) {
            throw new NullPointerException("unit == null");
        }
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.handler, RxJavaPlugins.onSchedule(run));
        Message messageObtain = Message.obtain(this.handler, scheduledRunnable);
        if (this.async) {
            messageObtain.setAsynchronous(true);
        }
        this.handler.sendMessageDelayed(messageObtain, unit.toMillis(delay));
        return scheduledRunnable;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public Scheduler.Worker createWorker() {
        return new HandlerWorker(this.handler, this.async);
    }

    /* loaded from: classes6.dex */
    public static final class HandlerWorker extends Scheduler.Worker {
        public final boolean async;
        public volatile boolean disposed;
        public final Handler handler;

        public HandlerWorker(Handler handler, boolean async) {
            this.handler = handler;
            this.async = async;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @SuppressLint({"NewApi"})
        public Disposable schedule(Runnable run, long delay, TimeUnit unit) {
            if (run == null) {
                throw new NullPointerException("run == null");
            }
            if (unit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.disposed) {
                return Disposable.disposed();
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.handler, RxJavaPlugins.onSchedule(run));
            Message messageObtain = Message.obtain(this.handler, scheduledRunnable);
            messageObtain.obj = this;
            if (this.async) {
                messageObtain.setAsynchronous(true);
            }
            this.handler.sendMessageDelayed(messageObtain, unit.toMillis(delay));
            if (!this.disposed) {
                return scheduledRunnable;
            }
            this.handler.removeCallbacks(scheduledRunnable);
            return Disposable.disposed();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.handler.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {
        public final Runnable delegate;
        public volatile boolean disposed;
        public final Handler handler;

        public ScheduledRunnable(Handler handler, Runnable delegate) {
            this.handler = handler;
            this.delegate = delegate;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.delegate.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.handler.removeCallbacks(this);
            this.disposed = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }
}
