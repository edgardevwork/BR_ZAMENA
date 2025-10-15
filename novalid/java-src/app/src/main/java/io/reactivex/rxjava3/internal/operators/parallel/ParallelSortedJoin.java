package io.reactivex.rxjava3.internal.operators.parallel;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes8.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    public final Comparator<? super T> comparator;
    public final ParallelFlowable<List<T>> source;

    public ParallelSortedJoin(ParallelFlowable<List<T>> source, Comparator<? super T> comparator) {
        this.source = source;
        this.comparator = comparator;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(s, this.source.parallelism(), this.comparator);
        s.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }

    /* loaded from: classes5.dex */
    public static final class SortedJoinSubscription<T> extends AtomicInteger implements Subscription {
        public static final long serialVersionUID = 3481980673745556697L;
        public volatile boolean cancelled;
        public final Comparator<? super T> comparator;
        public final Subscriber<? super T> downstream;
        public final int[] indexes;
        public final List<T>[] lists;
        public final SortedJoinInnerSubscriber<T>[] subscribers;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicInteger remaining = new AtomicInteger();
        public final AtomicReference<Throwable> error = new AtomicReference<>();

        public SortedJoinSubscription(Subscriber<? super T> actual, int n, Comparator<? super T> comparator) {
            this.downstream = actual;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[n];
            for (int i = 0; i < n; i++) {
                sortedJoinInnerSubscriberArr[i] = new SortedJoinInnerSubscriber<>(this, i);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[n];
            this.indexes = new int[n];
            this.remaining.lazySet(n);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n) {
            if (SubscriptionHelper.validate(n)) {
                BackpressureHelper.add(this.requested, n);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }

        public void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        public void innerNext(List<T> value, int index) {
            this.lists[index] = value;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        public void innerError(Throwable e) {
            if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.error, null, e)) {
                drain();
            } else if (e != this.error.get()) {
                RxJavaPlugins.onError(e);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:115:0x00a0, code lost:
        
            if (r16.cancelled == false) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x00a2, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x00a6, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x00a7, code lost:
        
            r7 = r16.error.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x00b0, code lost:
        
            if (r7 == null) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x00b2, code lost:
        
            cancelAll();
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onError(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x00bb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x00bc, code lost:
        
            if (r14 >= r4) goto L142;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x00c6, code lost:
        
            if (r0[r14] == r3[r14].size()) goto L131;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x00cc, code lost:
        
            if (r11 == 0) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x00ce, code lost:
        
            io.reactivex.rxjava3.internal.util.BackpressureHelper.produced(r16.requested, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x00d3, code lost:
        
            r6 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x00db, code lost:
        
            r14 = r14 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x00e0, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x00e7, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.downstream;
            List<T>[] listArr = this.lists;
            int[] iArr = this.indexes;
            int length = iArr.length;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    int i = 0;
                    if (j2 == j) {
                        break;
                    }
                    if (this.cancelled) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th = this.error.get();
                    if (th != null) {
                        cancelAll();
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onError(th);
                        return;
                    }
                    int i2 = -1;
                    T t = null;
                    while (i < length) {
                        List<T> list = listArr[i];
                        int i3 = iArr[i];
                        if (list.size() != i3) {
                            if (t == null) {
                                t = list.get(i3);
                            } else {
                                T t2 = list.get(i3);
                                try {
                                    if (this.comparator.compare(t, t2) > 0) {
                                        t = t2;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cancelAll();
                                    Arrays.fill(listArr, (Object) null);
                                    if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.error, null, th2)) {
                                        RxJavaPlugins.onError(th2);
                                    }
                                    subscriber.onError(this.error.get());
                                    return;
                                }
                            }
                            i2 = i;
                        }
                        i++;
                    }
                    if (t == null) {
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onComplete();
                        return;
                    } else {
                        subscriber.onNext(t);
                        iArr[i2] = iArr[i2] + 1;
                        j2++;
                    }
                }
            } while (iAddAndGet != 0);
        }
    }

    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<List<T>> {
        public static final long serialVersionUID = 6751017204873808094L;
        public final int index;
        public final SortedJoinSubscription<T> parent;

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        public SortedJoinInnerSubscriber(SortedJoinSubscription<T> parent, int index) {
            this.parent = parent;
            this.index = index;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            SubscriptionHelper.setOnce(this, s, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(List<T> t) {
            this.parent.innerNext(t, this.index);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            this.parent.innerError(t);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
    }
}
