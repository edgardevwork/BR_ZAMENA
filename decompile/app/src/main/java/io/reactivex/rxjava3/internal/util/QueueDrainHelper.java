package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class QueueDrainHelper {
    public static final long COMPLETED_MASK = Long.MIN_VALUE;
    public static final long REQUESTED_MASK = Long.MAX_VALUE;

    public QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> q, Subscriber<? super U> a2, boolean delayError, Disposable dispose, QueueDrain<T, U> qd) {
        int iLeave = 1;
        while (true) {
            boolean zDone = qd.done();
            T tPoll = q.poll();
            boolean z = tPoll == null;
            if (checkTerminated(zDone, z, a2, delayError, q, qd)) {
                if (dispose != null) {
                    dispose.dispose();
                    return;
                }
                return;
            } else if (!z) {
                long jRequested = qd.requested();
                if (jRequested != 0) {
                    if (qd.accept(a2, tPoll) && jRequested != Long.MAX_VALUE) {
                        qd.produced(1L);
                    }
                } else {
                    q.clear();
                    if (dispose != null) {
                        dispose.dispose();
                    }
                    a2.onError(MissingBackpressureException.createDefault());
                    return;
                }
            } else {
                iLeave = qd.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            }
        }
    }

    public static <T, U> boolean checkTerminated(boolean d, boolean empty, Subscriber<?> s, boolean delayError, SimpleQueue<?> q, QueueDrain<T, U> qd) {
        if (qd.cancelled()) {
            q.clear();
            return true;
        }
        if (!d) {
            return false;
        }
        if (delayError) {
            if (!empty) {
                return false;
            }
            Throwable thError = qd.error();
            if (thError != null) {
                s.onError(thError);
            } else {
                s.onComplete();
            }
            return true;
        }
        Throwable thError2 = qd.error();
        if (thError2 != null) {
            q.clear();
            s.onError(thError2);
            return true;
        }
        if (!empty) {
            return false;
        }
        s.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        r1 = r15.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0038, code lost:
    
        if (r1 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T, U> void drainLoop(SimplePlainQueue<T> q, Observer<? super U> a2, boolean delayError, Disposable dispose, ObservableQueueDrain<T, U> qd) {
        int iLeave = 1;
        while (!checkTerminated(qd.done(), q.isEmpty(), a2, delayError, q, dispose, qd)) {
            while (true) {
                boolean zDone = qd.done();
                T tPoll = q.poll();
                boolean z = tPoll == null;
                if (checkTerminated(zDone, z, a2, delayError, q, dispose, qd)) {
                    return;
                }
                if (z) {
                    break;
                } else {
                    qd.accept(a2, tPoll);
                }
            }
        }
    }

    public static <T, U> boolean checkTerminated(boolean d, boolean empty, Observer<?> observer, boolean delayError, SimpleQueue<?> q, Disposable disposable, ObservableQueueDrain<T, U> qd) {
        if (qd.cancelled()) {
            q.clear();
            disposable.dispose();
            return true;
        }
        if (!d) {
            return false;
        }
        if (delayError) {
            if (!empty) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = qd.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = qd.error();
        if (thError2 != null) {
            q.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!empty) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int capacityHint) {
        if (capacityHint < 0) {
            return new SpscLinkedArrayQueue(-capacityHint);
        }
        return new SpscArrayQueue(capacityHint);
    }

    public static void request(Subscription s, int prefetch) {
        s.request(prefetch < 0 ? Long.MAX_VALUE : prefetch);
    }

    public static <T> boolean postCompleteRequest(long n, Subscriber<? super T> actual, Queue<T> queue, AtomicLong state, BooleanSupplier isCancelled) {
        long j;
        do {
            j = state.get();
        } while (!state.compareAndSet(j, BackpressureHelper.addCap(Long.MAX_VALUE & j, n) | (j & Long.MIN_VALUE)));
        if (j != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(n | Long.MIN_VALUE, actual, queue, state, isCancelled);
        return true;
    }

    public static boolean isCancelled(BooleanSupplier cancelled) {
        try {
            return cancelled.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> boolean postCompleteDrain(long j, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    subscriber.onComplete();
                    return true;
                }
                subscriber.onNext(tPoll);
                j2++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    subscriber.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j = jAddAndGet;
                    j2 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> void postComplete(Subscriber<? super T> actual, Queue<T> queue, AtomicLong state, BooleanSupplier isCancelled) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            actual.onComplete();
            return;
        }
        if (postCompleteDrain(state.get(), actual, queue, state, isCancelled)) {
            return;
        }
        do {
            j = state.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!state.compareAndSet(j, j2));
        if (j != 0) {
            postCompleteDrain(j2, actual, queue, state, isCancelled);
        }
    }
}
