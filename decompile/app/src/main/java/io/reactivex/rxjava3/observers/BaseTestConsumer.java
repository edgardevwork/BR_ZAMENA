package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import io.reactivex.rxjava3.observers.BaseTestConsumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> {
    public boolean checkSubscriptionOnce;
    public long completions;
    public Thread lastThread;
    public CharSequence tag;
    public boolean timeout;
    public final List<T> values = new VolatileSizeArrayList();
    public final List<Throwable> errors = new VolatileSizeArrayList();
    public final CountDownLatch done = new CountDownLatch(1);

    @NonNull
    public abstract U assertSubscribed();

    public abstract void dispose();

    public abstract boolean isDisposed();

    @NonNull
    public final List<T> values() {
        return this.values;
    }

    @NonNull
    public final AssertionError fail(@NonNull String message) {
        StringBuilder sb = new StringBuilder(message.length() + 64);
        sb.append(message);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.done.getCount());
        sb.append(", ");
        sb.append("values = ");
        sb.append(this.values.size());
        sb.append(", ");
        sb.append("errors = ");
        sb.append(this.errors.size());
        sb.append(", ");
        sb.append("completions = ");
        sb.append(this.completions);
        if (this.timeout) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.errors));
            }
        }
        return assertionError;
    }

    @NonNull
    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final boolean await(long time, @NonNull TimeUnit unit) throws InterruptedException {
        boolean z = this.done.getCount() == 0 || this.done.await(time, unit);
        this.timeout = !z;
        return z;
    }

    @NonNull
    public final U assertComplete() {
        long j = this.completions;
        if (j == 0) {
            throw fail("Not completed");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j);
    }

    @NonNull
    public final U assertNotComplete() {
        long j = this.completions;
        if (j == 1) {
            throw fail("Completed!");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j);
    }

    @NonNull
    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    @NonNull
    public final U assertError(@NonNull Throwable th) {
        return (U) assertError(Functions.equalsWith(th), true);
    }

    @NonNull
    public final U assertError(@NonNull Class<? extends Throwable> cls) {
        return (U) assertError(Functions.isInstanceOf(cls), true);
    }

    @NonNull
    public final U assertError(@NonNull Predicate<Throwable> predicate) {
        return (U) assertError(predicate, false);
    }

    @NonNull
    public final U assertError(@NonNull Predicate<Throwable> errorPredicate, boolean exact) {
        int size = this.errors.size();
        if (size == 0) {
            throw fail("No errors");
        }
        Iterator<Throwable> it = this.errors.iterator();
        while (it.hasNext()) {
            try {
                if (errorPredicate.test(it.next())) {
                    if (size == 1) {
                        return this;
                    }
                    if (exact) {
                        throw fail("Error present but other errors as well");
                    }
                    throw fail("One error passed the predicate but other errors are present as well");
                }
            } catch (Throwable th) {
                throw ExceptionHelper.wrapOrThrow(th);
            }
        }
        if (exact) {
            throw fail("Error not present");
        }
        throw fail("No error(s) passed the predicate");
    }

    @NonNull
    public final U assertValue(@NonNull T value) {
        if (this.values.size() != 1) {
            throw fail("\nexpected: " + valueAndClass(value) + "\ngot: " + this.values);
        }
        T t = this.values.get(0);
        if (Objects.equals(value, t)) {
            return this;
        }
        throw fail("\nexpected: " + valueAndClass(value) + "\ngot: " + valueAndClass(t));
    }

    @NonNull
    public final U assertValue(@NonNull Predicate<T> valuePredicate) {
        assertValueAt(0, (Predicate) valuePredicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("The first value passed the predicate but this consumer received more than one value");
    }

    @NonNull
    public final U assertValueAt(int index, @NonNull T value) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (index < 0 || index >= size) {
            throw fail("Index " + index + " is out of range [0, " + size + ")");
        }
        T t = this.values.get(index);
        if (Objects.equals(value, t)) {
            return this;
        }
        throw fail("\nexpected: " + valueAndClass(value) + "\ngot: " + valueAndClass(t) + "; Value at position " + index + " differ");
    }

    @NonNull
    public final U assertValueAt(int index, @NonNull Predicate<T> valuePredicate) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (index < 0 || index >= size) {
            throw fail("Index " + index + " is out of range [0, " + size + ")");
        }
        T t = this.values.get(index);
        try {
            if (valuePredicate.test(t)) {
                return this;
            }
            throw fail("Value " + valueAndClass(t) + " at position " + index + " did not pass the predicate");
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @NonNull
    public static String valueAndClass(@Nullable Object o) {
        if (o != null) {
            return o + " (class: " + o.getClass().getSimpleName() + ")";
        }
        return "null";
    }

    @NonNull
    public final U assertValueCount(int count) {
        int size = this.values.size();
        if (size == count) {
            return this;
        }
        throw fail("\nexpected: " + count + "\ngot: " + size + "; Value counts differ");
    }

    @NonNull
    public final U assertNoValues() {
        return (U) assertValueCount(0);
    }

    @SafeVarargs
    @NonNull
    public final U assertValues(@NonNull T... values) {
        int size = this.values.size();
        if (size != values.length) {
            throw fail("\nexpected: " + values.length + " " + Arrays.toString(values) + "\ngot: " + size + " " + this.values + "; Value count differs");
        }
        for (int i = 0; i < size; i++) {
            T t = this.values.get(i);
            T t2 = values[i];
            if (!Objects.equals(t2, t)) {
                throw fail("\nexpected: " + valueAndClass(t2) + "\ngot: " + valueAndClass(t) + "; Value at position " + i + " differ");
            }
        }
        return this;
    }

    @SafeVarargs
    @NonNull
    public final U assertValuesOnly(@NonNull T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        throw fail("Fewer values received than expected (" + r1 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        throw fail("More values received than expected (" + r1 + ")");
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final U assertValueSequence(@NonNull Iterable<? extends T> sequence) {
        Iterator<T> it = this.values.iterator();
        Iterator<? extends T> it2 = sequence.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            boolean zHasNext2 = it.hasNext();
            if (!zHasNext2 || !zHasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!Objects.equals(next, next2)) {
                throw fail("\nexpected: " + valueAndClass(next) + "\ngot: " + valueAndClass(next2) + "; Value at position " + i + " differ");
            }
            i++;
        }
    }

    @SafeVarargs
    @NonNull
    public final U assertResult(@NonNull T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    @SafeVarargs
    @NonNull
    public final U assertFailure(@NonNull Class<? extends Throwable> cls, @NonNull T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    @NonNull
    public final U awaitDone(long time, @NonNull TimeUnit unit) {
        try {
            if (!this.done.await(time, unit)) {
                this.timeout = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e);
        }
    }

    @NonNull
    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    @NonNull
    public final U withTag(@Nullable CharSequence tag) {
        this.tag = tag;
        return this;
    }

    @NonNull
    public final U awaitCount(int atLeast) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - jCurrentTimeMillis >= 5000) {
                this.timeout = true;
                break;
            }
            if (this.done.getCount() == 0 || this.values.size() >= atLeast) {
                break;
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this;
    }
}
