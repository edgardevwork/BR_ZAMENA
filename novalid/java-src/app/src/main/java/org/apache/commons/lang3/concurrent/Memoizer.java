package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes5.dex */
public class Memoizer<I, O> implements Computable<I, O> {
    public final ConcurrentMap<I, Future<O>> cache;
    public final Computable<I, O> computable;
    public final boolean recalculate;

    public Memoizer(Computable<I, O> computable) {
        this(computable, false);
    }

    public Memoizer(Computable<I, O> computable, boolean z) {
        this.cache = new ConcurrentHashMap();
        this.computable = computable;
        this.recalculate = z;
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(final I i) throws InterruptedException {
        FutureTask futureTask;
        while (true) {
            Future<O> futurePutIfAbsent = this.cache.get(i);
            if (futurePutIfAbsent == null && (futurePutIfAbsent = this.cache.putIfAbsent(i, (futureTask = new FutureTask(new Callable() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.lambda$compute$0(i);
                }
            })))) == null) {
                futureTask.run();
                futurePutIfAbsent = futureTask;
            }
            try {
                continue;
                return futurePutIfAbsent.get();
            } catch (CancellationException unused) {
                this.cache.remove(i, futurePutIfAbsent);
            } catch (ExecutionException e) {
                if (this.recalculate) {
                    this.cache.remove(i, futurePutIfAbsent);
                }
                throw launderException(e.getCause());
            }
        }
    }

    public final /* synthetic */ Object lambda$compute$0(Object obj) throws Exception {
        return this.computable.compute(obj);
    }

    public final RuntimeException launderException(Throwable th) {
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IllegalStateException("Unchecked exception", th);
    }
}
