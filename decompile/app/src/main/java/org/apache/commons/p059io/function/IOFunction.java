package org.apache.commons.p059io.function;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
/* loaded from: classes6.dex */
public interface IOFunction<T, R> {
    static /* synthetic */ Object lambda$identity$8(Object obj) throws IOException {
        return obj;
    }

    R apply(T t) throws IOException;

    default <V> IOFunction<V, R> compose(final IOFunction<? super V, ? extends T> iOFunction) {
        Objects.requireNonNull(iOFunction, TtmlNode.ANNOTATION_POSITION_BEFORE);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda7
            @Override // org.apache.commons.p059io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.lambda$compose$0(iOFunction, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$0(IOFunction iOFunction, Object obj) throws IOException {
        return apply(iOFunction.apply(obj));
    }

    default <V> IOFunction<V, R> compose(final Function<? super V, ? extends T> function) {
        Objects.requireNonNull(function, TtmlNode.ANNOTATION_POSITION_BEFORE);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda1
            @Override // org.apache.commons.p059io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.lambda$compose$1(function, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$1(Function function, Object obj) throws IOException {
        return apply(function.apply(obj));
    }

    default IOSupplier<R> compose(final IOSupplier<? extends T> iOSupplier) {
        Objects.requireNonNull(iOSupplier, TtmlNode.ANNOTATION_POSITION_BEFORE);
        return new IOSupplier() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda6
            @Override // org.apache.commons.p059io.function.IOSupplier
            public final Object get() {
                return this.f$0.lambda$compose$2(iOSupplier);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$2(IOSupplier iOSupplier) throws IOException {
        return apply(iOSupplier.get());
    }

    default IOSupplier<R> compose(final Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, TtmlNode.ANNOTATION_POSITION_BEFORE);
        return new IOSupplier() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda8
            @Override // org.apache.commons.p059io.function.IOSupplier
            public final Object get() {
                return this.f$0.lambda$compose$3(supplier);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$3(Supplier supplier) throws IOException {
        return apply(supplier.get());
    }

    default <V> IOFunction<T, V> andThen(final IOFunction<? super R, ? extends V> iOFunction) {
        Objects.requireNonNull(iOFunction, TtmlNode.ANNOTATION_POSITION_AFTER);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda0
            @Override // org.apache.commons.p059io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.lambda$andThen$4(iOFunction, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$4(IOFunction iOFunction, Object obj) throws IOException {
        return iOFunction.apply(apply(obj));
    }

    default <V> IOFunction<T, V> andThen(final Function<? super R, ? extends V> function) {
        Objects.requireNonNull(function, TtmlNode.ANNOTATION_POSITION_AFTER);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda3
            @Override // org.apache.commons.p059io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.lambda$andThen$5(function, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$5(Function function, Object obj) throws IOException {
        return function.apply(apply(obj));
    }

    default IOConsumer<T> andThen(final IOConsumer<? super R> iOConsumer) {
        Objects.requireNonNull(iOConsumer, TtmlNode.ANNOTATION_POSITION_AFTER);
        return new IOConsumer() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda2
            @Override // org.apache.commons.p059io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.lambda$andThen$6(iOConsumer, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$6(IOConsumer iOConsumer, Object obj) throws IOException {
        iOConsumer.accept(apply(obj));
    }

    default IOConsumer<T> andThen(final Consumer<? super R> consumer) {
        Objects.requireNonNull(consumer, TtmlNode.ANNOTATION_POSITION_AFTER);
        return new IOConsumer() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda4
            @Override // org.apache.commons.p059io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.lambda$andThen$7(consumer, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$7(Consumer consumer, Object obj) throws IOException {
        consumer.accept(apply(obj));
    }

    static <T> IOFunction<T, T> identity() {
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda5
            @Override // org.apache.commons.p059io.function.IOFunction
            public final Object apply(Object obj) {
                return IOFunction.lambda$identity$8(obj);
            }
        };
    }
}
