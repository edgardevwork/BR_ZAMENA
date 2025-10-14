package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;

/* loaded from: classes8.dex */
public final class Functions {
    public static final Function<Object, Object> IDENTITY = new Identity();
    public static final Runnable EMPTY_RUNNABLE = new EmptyRunnable();
    public static final Action EMPTY_ACTION = new EmptyAction();
    public static final Consumer<Object> EMPTY_CONSUMER = new EmptyConsumer();
    public static final Consumer<Throwable> ERROR_CONSUMER = new ErrorConsumer();
    public static final Consumer<Throwable> ON_ERROR_MISSING = new OnErrorMissingConsumer();
    public static final LongConsumer EMPTY_LONG_CONSUMER = new EmptyLongConsumer();
    public static final Predicate<Object> ALWAYS_TRUE = new TruePredicate();
    public static final Predicate<Object> ALWAYS_FALSE = new FalsePredicate();
    public static final Supplier<Object> NULL_SUPPLIER = new NullProvider();
    public static final Consumer<Subscription> REQUEST_MAX = new MaxRequestSubscription();

    public static final class EmptyLongConsumer implements LongConsumer {
        @Override // io.reactivex.rxjava3.functions.LongConsumer
        public void accept(long v) {
        }
    }

    public static final class FalsePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public boolean test(Object o) {
            return false;
        }
    }

    public static final class NullProvider implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public Object get() {
            return null;
        }
    }

    public static final class TruePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public boolean test(Object o) {
            return true;
        }
    }

    public Functions() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static <T1, T2, R> Function<Object[], R> toFunction(@NonNull BiFunction<? super T1, ? super T2, ? extends R> f) {
        return new Array2Func(f);
    }

    @NonNull
    public static <T1, T2, T3, R> Function<Object[], R> toFunction(@NonNull Function3<T1, T2, T3, R> f) {
        return new Array3Func(f);
    }

    @NonNull
    public static <T1, T2, T3, T4, R> Function<Object[], R> toFunction(@NonNull Function4<T1, T2, T3, T4, R> f) {
        return new Array4Func(f);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> toFunction(@NonNull Function5<T1, T2, T3, T4, T5, R> f) {
        return new Array5Func(f);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> toFunction(@NonNull Function6<T1, T2, T3, T4, T5, T6, R> f) {
        return new Array6Func(f);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Object[], R> toFunction(@NonNull Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
        return new Array7Func(f);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> toFunction(@NonNull Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
        return new Array8Func(f);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<Object[], R> toFunction(@NonNull Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
        return new Array9Func(f);
    }

    @NonNull
    public static <T> Function<T, T> identity() {
        return (Function<T, T>) IDENTITY;
    }

    public static <T> Consumer<T> emptyConsumer() {
        return (Consumer<T>) EMPTY_CONSUMER;
    }

    @NonNull
    public static <T> Predicate<T> alwaysTrue() {
        return (Predicate<T>) ALWAYS_TRUE;
    }

    @NonNull
    public static <T> Predicate<T> alwaysFalse() {
        return (Predicate<T>) ALWAYS_FALSE;
    }

    @NonNull
    public static <T> Supplier<T> nullSupplier() {
        return (Supplier<T>) NULL_SUPPLIER;
    }

    public static final class FutureAction implements Action {
        public final Future<?> future;

        public FutureAction(Future<?> future) {
            this.future = future;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public void run() throws Exception {
            this.future.get();
        }
    }

    @NonNull
    public static Action futureAction(@NonNull Future<?> future) {
        return new FutureAction(future);
    }

    public static final class JustValue<T, U> implements Callable<U>, Supplier<U>, Function<T, U> {
        public final U value;

        public JustValue(U value) {
            this.value = value;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.value;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public U apply(T t) {
            return this.value;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public U get() {
            return this.value;
        }
    }

    @NonNull
    public static <T> Callable<T> justCallable(@NonNull T value) {
        return new JustValue(value);
    }

    @NonNull
    public static <T> Supplier<T> justSupplier(@NonNull T value) {
        return new JustValue(value);
    }

    @NonNull
    public static <T, U> Function<T, U> justFunction(@NonNull U value) {
        return new JustValue(value);
    }

    public static final class CastToClass<T, U> implements Function<T, U> {
        public final Class<U> clazz;

        public CastToClass(Class<U> clazz) {
            this.clazz = clazz;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public U apply(T t) {
            return this.clazz.cast(t);
        }
    }

    @NonNull
    public static <T, U> Function<T, U> castFunction(@NonNull Class<U> target) {
        return new CastToClass(target);
    }

    public static final class ArrayListCapacityCallable<T> implements Supplier<List<T>> {
        public final int capacity;

        public ArrayListCapacityCallable(int capacity) {
            this.capacity = capacity;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public List<T> get() {
            return new ArrayList(this.capacity);
        }
    }

    public static <T> Supplier<List<T>> createArrayList(int capacity) {
        return new ArrayListCapacityCallable(capacity);
    }

    public static final class EqualsPredicate<T> implements Predicate<T> {
        public final T value;

        public EqualsPredicate(T value) {
            this.value = value;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public boolean test(T t) {
            return Objects.equals(t, this.value);
        }
    }

    public static <T> Predicate<T> equalsWith(T value) {
        return new EqualsPredicate(value);
    }

    public enum HashSetSupplier implements Supplier<Set<Object>> {
        INSTANCE;

        @Override // io.reactivex.rxjava3.functions.Supplier
        public Set<Object> get() {
            return new HashSet();
        }
    }

    public static <T> Supplier<Set<T>> createHashSet() {
        return HashSetSupplier.INSTANCE;
    }

    public static final class NotificationOnNext<T> implements Consumer<T> {
        public final Consumer<? super Notification<T>> onNotification;

        public NotificationOnNext(Consumer<? super Notification<T>> onNotification) {
            this.onNotification = onNotification;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(T v) throws Throwable {
            this.onNotification.accept(Notification.createOnNext(v));
        }
    }

    public static final class NotificationOnError<T> implements Consumer<Throwable> {
        public final Consumer<? super Notification<T>> onNotification;

        public NotificationOnError(Consumer<? super Notification<T>> onNotification) {
            this.onNotification = onNotification;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Throwable v) throws Throwable {
            this.onNotification.accept(Notification.createOnError(v));
        }
    }

    public static final class NotificationOnComplete<T> implements Action {
        public final Consumer<? super Notification<T>> onNotification;

        public NotificationOnComplete(Consumer<? super Notification<T>> onNotification) {
            this.onNotification = onNotification;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public void run() throws Throwable {
            this.onNotification.accept(Notification.createOnComplete());
        }
    }

    public static <T> Consumer<T> notificationOnNext(Consumer<? super Notification<T>> onNotification) {
        return new NotificationOnNext(onNotification);
    }

    public static <T> Consumer<Throwable> notificationOnError(Consumer<? super Notification<T>> onNotification) {
        return new NotificationOnError(onNotification);
    }

    public static <T> Action notificationOnComplete(Consumer<? super Notification<T>> onNotification) {
        return new NotificationOnComplete(onNotification);
    }

    public static final class ActionConsumer<T> implements Consumer<T> {
        public final Action action;

        public ActionConsumer(Action action) {
            this.action = action;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(T t) throws Throwable {
            this.action.run();
        }
    }

    public static <T> Consumer<T> actionConsumer(Action action) {
        return new ActionConsumer(action);
    }

    public static final class ClassFilter<T, U> implements Predicate<T> {
        public final Class<U> clazz;

        public ClassFilter(Class<U> clazz) {
            this.clazz = clazz;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public boolean test(T t) {
            return this.clazz.isInstance(t);
        }
    }

    public static <T, U> Predicate<T> isInstanceOf(Class<U> clazz) {
        return new ClassFilter(clazz);
    }

    public static final class BooleanSupplierPredicateReverse<T> implements Predicate<T> {
        public final BooleanSupplier supplier;

        public BooleanSupplierPredicateReverse(BooleanSupplier supplier) {
            this.supplier = supplier;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public boolean test(T t) throws Throwable {
            return !this.supplier.getAsBoolean();
        }
    }

    public static <T> Predicate<T> predicateReverseFor(BooleanSupplier supplier) {
        return new BooleanSupplierPredicateReverse(supplier);
    }

    public static final class TimestampFunction<T> implements Function<T, Timed<T>> {
        public final Scheduler scheduler;
        public final TimeUnit unit;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object t) throws Throwable {
            return apply((TimestampFunction<T>) t);
        }

        public TimestampFunction(TimeUnit unit, Scheduler scheduler) {
            this.unit = unit;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public Timed<T> apply(T t) {
            return new Timed<>(t, this.scheduler.now(this.unit), this.unit);
        }
    }

    public static <T> Function<T, Timed<T>> timestampWith(TimeUnit unit, Scheduler scheduler) {
        return new TimestampFunction(unit, scheduler);
    }

    public static final class ToMapKeySelector<K, T> implements BiConsumer<Map<K, T>, T> {
        public final Function<? super T, ? extends K> keySelector;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object m, Object t) throws Throwable {
            accept((Map<K, Map<K, T>>) m, (Map<K, T>) t);
        }

        public ToMapKeySelector(Function<? super T, ? extends K> keySelector) {
            this.keySelector = keySelector;
        }

        public void accept(Map<K, T> m, T t) throws Throwable {
            m.put(this.keySelector.apply(t), t);
        }
    }

    public static <T, K> BiConsumer<Map<K, T>, T> toMapKeySelector(final Function<? super T, ? extends K> keySelector) {
        return new ToMapKeySelector(keySelector);
    }

    public static final class ToMapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, V>, T> {
        public final Function<? super T, ? extends K> keySelector;
        public final Function<? super T, ? extends V> valueSelector;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object m, Object t) throws Throwable {
            accept((Map) m, (Map<K, V>) t);
        }

        public ToMapKeyValueSelector(Function<? super T, ? extends V> valueSelector, Function<? super T, ? extends K> keySelector) {
            this.valueSelector = valueSelector;
            this.keySelector = keySelector;
        }

        public void accept(Map<K, V> m, T t) throws Throwable {
            m.put(this.keySelector.apply(t), this.valueSelector.apply(t));
        }
    }

    public static <T, K, V> BiConsumer<Map<K, V>, T> toMapKeyValueSelector(final Function<? super T, ? extends K> keySelector, final Function<? super T, ? extends V> valueSelector) {
        return new ToMapKeyValueSelector(valueSelector, keySelector);
    }

    public static final class ToMultimapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {
        public final Function<? super K, ? extends Collection<? super V>> collectionFactory;
        public final Function<? super T, ? extends K> keySelector;
        public final Function<? super T, ? extends V> valueSelector;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object m, Object t) throws Throwable {
            accept((Map) m, (Map<K, Collection<V>>) t);
        }

        public ToMultimapKeyValueSelector(Function<? super K, ? extends Collection<? super V>> collectionFactory, Function<? super T, ? extends V> valueSelector, Function<? super T, ? extends K> keySelector) {
            this.collectionFactory = collectionFactory;
            this.valueSelector = valueSelector;
            this.keySelector = keySelector;
        }

        public void accept(Map<K, Collection<V>> m, T t) throws Throwable {
            K kApply = this.keySelector.apply(t);
            Collection<? super V> collectionApply = (Collection) m.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.collectionFactory.apply(kApply);
                m.put(kApply, collectionApply);
            }
            collectionApply.add(this.valueSelector.apply(t));
        }
    }

    public static <T, K, V> BiConsumer<Map<K, Collection<V>>, T> toMultimapKeyValueSelector(final Function<? super T, ? extends K> keySelector, final Function<? super T, ? extends V> valueSelector, final Function<? super K, ? extends Collection<? super V>> collectionFactory) {
        return new ToMultimapKeyValueSelector(collectionFactory, valueSelector, keySelector);
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object o1, Object o2) {
            return ((Comparable) o1).compareTo(o2);
        }
    }

    public static <T> Comparator<T> naturalComparator() {
        return NaturalComparator.INSTANCE;
    }

    public static final class ListSorter<T> implements Function<List<T>, List<T>> {
        public final Comparator<? super T> comparator;

        public ListSorter(Comparator<? super T> comparator) {
            this.comparator = comparator;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public List<T> apply(List<T> v) {
            Collections.sort(v, this.comparator);
            return v;
        }
    }

    public static <T> Function<List<T>, List<T>> listSorter(final Comparator<? super T> comparator) {
        return new ListSorter(comparator);
    }

    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final BiFunction<? super T1, ? super T2, ? extends R> f9689f;

        public Array2Func(BiFunction<? super T1, ? super T2, ? extends R> f) {
            this.f9689f = f;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] a2) throws Throwable {
            if (a2.length != 2) {
                throw new IllegalArgumentException("Array of size 2 expected but got " + a2.length);
            }
            return this.f9689f.apply(a2[0], a2[1]);
        }
    }

    public static final class Array3Func<T1, T2, T3, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function3<T1, T2, T3, R> f9690f;

        public Array3Func(Function3<T1, T2, T3, R> f) {
            this.f9690f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            return (R) this.f9690f.apply(objArr[0], objArr[1], objArr[2]);
        }
    }

    public static final class Array4Func<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function4<T1, T2, T3, T4, R> f9691f;

        public Array4Func(Function4<T1, T2, T3, T4, R> f) {
            this.f9691f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return (R) this.f9691f.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    public static final class Array5Func<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function5<T1, T2, T3, T4, T5, R> f9692f;

        public Array5Func(Function5<T1, T2, T3, T4, T5, R> f) {
            this.f9692f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return (R) this.f9692f.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    public static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function6<T1, T2, T3, T4, T5, T6, R> f9693f;

        public Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f9693f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return (R) this.f9693f.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    public static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function7<T1, T2, T3, T4, T5, T6, T7, R> f9694f;

        public Array7Func(Function7<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f9694f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return (R) this.f9694f.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    public static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f9695f;

        public Array8Func(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f9695f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return (R) this.f9695f.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
        }
    }

    public static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {

        /* renamed from: f */
        public final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f9696f;

        public Array9Func(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f9696f = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return (R) this.f9696f.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
        }
    }

    public static final class Identity implements Function<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.Function
        public Object apply(Object v) {
            return v;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class EmptyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class EmptyAction implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class EmptyConsumer implements Consumer<Object> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Object v) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class ErrorConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Throwable error) {
            RxJavaPlugins.onError(error);
        }
    }

    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Throwable error) {
            RxJavaPlugins.onError(new OnErrorNotImplementedException(error));
        }
    }

    public static final class MaxRequestSubscription implements Consumer<Subscription> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Subscription t) {
            t.request(Long.MAX_VALUE);
        }
    }

    public static <T> Consumer<T> boundedConsumer(int bufferSize) {
        return new BoundedConsumer(bufferSize);
    }

    public static class BoundedConsumer implements Consumer<Subscription> {
        public final int bufferSize;

        public BoundedConsumer(int bufferSize) {
            this.bufferSize = bufferSize;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Subscription s) {
            s.request(this.bufferSize);
        }
    }
}
