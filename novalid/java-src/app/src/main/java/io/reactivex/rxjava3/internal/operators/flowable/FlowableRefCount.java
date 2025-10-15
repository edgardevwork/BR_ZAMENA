package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    public RefConnection connection;

    /* renamed from: n */
    public final int f9723n;
    public final Scheduler scheduler;
    public final ConnectableFlowable<T> source;
    public final long timeout;
    public final TimeUnit unit;

    public FlowableRefCount(ConnectableFlowable<T> source) {
        this(source, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public FlowableRefCount(ConnectableFlowable<T> source, int n, long timeout, TimeUnit unit, Scheduler scheduler) {
        this.source = source;
        this.f9723n = n;
        this.timeout = timeout;
        this.unit = unit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        RefConnection refConnection;
        boolean z;
        Disposable disposable;
        synchronized (this) {
            try {
                refConnection = this.connection;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.connection = refConnection;
                }
                long j = refConnection.subscriberCount;
                if (j == 0 && (disposable = refConnection.timer) != null) {
                    disposable.dispose();
                }
                long j2 = j + 1;
                refConnection.subscriberCount = j2;
                if (refConnection.connected || j2 != this.f9723n) {
                    z = false;
                } else {
                    z = true;
                    refConnection.connected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.source.subscribe((FlowableSubscriber) new RefCountSubscriber(s, this, refConnection));
        if (z) {
            this.source.connect(refConnection);
        }
    }

    public void cancel(RefConnection rc) {
        synchronized (this) {
            try {
                RefConnection refConnection = this.connection;
                if (refConnection != null && refConnection == rc) {
                    long j = rc.subscriberCount - 1;
                    rc.subscriberCount = j;
                    if (j == 0 && rc.connected) {
                        if (this.timeout == 0) {
                            timeout(rc);
                            return;
                        }
                        SequentialDisposable sequentialDisposable = new SequentialDisposable();
                        rc.timer = sequentialDisposable;
                        sequentialDisposable.replace(this.scheduler.scheduleDirect(rc, this.timeout, this.unit));
                    }
                }
            } finally {
            }
        }
    }

    public void terminated(RefConnection rc) {
        synchronized (this) {
            try {
                if (this.connection == rc) {
                    Disposable disposable = rc.timer;
                    if (disposable != null) {
                        disposable.dispose();
                        rc.timer = null;
                    }
                    long j = rc.subscriberCount - 1;
                    rc.subscriberCount = j;
                    if (j == 0) {
                        this.connection = null;
                        this.source.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void timeout(RefConnection rc) {
        synchronized (this) {
            try {
                if (rc.subscriberCount == 0 && rc == this.connection) {
                    this.connection = null;
                    Disposable disposable = rc.get();
                    DisposableHelper.dispose(rc);
                    if (disposable == null) {
                        rc.disconnectedEarly = true;
                    } else {
                        this.source.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        public static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final FlowableRefCount<?> parent;
        public long subscriberCount;
        public Disposable timer;

        public RefConnection(FlowableRefCount<?> parent) {
            this.parent = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Disposable t) {
            DisposableHelper.replace(this, t);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        this.parent.source.reset();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {
        public static final long serialVersionUID = -7419642935409022375L;
        public final RefConnection connection;
        public final Subscriber<? super T> downstream;
        public final FlowableRefCount<T> parent;
        public Subscription upstream;

        public RefCountSubscriber(Subscriber<? super T> actual, FlowableRefCount<T> parent, RefConnection connection) {
            this.downstream = actual;
            this.parent = parent;
            this.connection = connection;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onError(t);
            } else {
                RxJavaPlugins.onError(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n) {
            this.upstream.request(n);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            if (SubscriptionHelper.validate(this.upstream, s)) {
                this.upstream = s;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
