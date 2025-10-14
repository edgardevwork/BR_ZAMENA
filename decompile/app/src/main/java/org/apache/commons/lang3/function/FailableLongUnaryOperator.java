package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* loaded from: classes7.dex */
public interface FailableLongUnaryOperator<E extends Throwable> {
    public static final FailableLongUnaryOperator NOP = new FailableLongUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda2
        @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
        public final long applyAsLong(long j) {
            return FailableLongUnaryOperator.lambda$static$0(j);
        }
    };

    static /* synthetic */ long lambda$identity$1(long j) throws Throwable {
        return j;
    }

    static /* synthetic */ long lambda$static$0(long j) throws Throwable {
        return 0L;
    }

    long applyAsLong(long j) throws Throwable;

    static <E extends Throwable> FailableLongUnaryOperator<E> identity() {
        return new FailableLongUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
            public final long applyAsLong(long j) {
                return FailableLongUnaryOperator.lambda$identity$1(j);
            }
        };
    }

    static <E extends Throwable> FailableLongUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableLongUnaryOperator<E> andThen(final FailableLongUnaryOperator<E> failableLongUnaryOperator) {
        Objects.requireNonNull(failableLongUnaryOperator);
        return new FailableLongUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
            public final long applyAsLong(long j) {
                return this.f$0.lambda$andThen$2(failableLongUnaryOperator, j);
            }
        };
    }

    /* synthetic */ default long lambda$andThen$2(FailableLongUnaryOperator failableLongUnaryOperator, long j) throws Throwable {
        return failableLongUnaryOperator.applyAsLong(applyAsLong(j));
    }

    default FailableLongUnaryOperator<E> compose(final FailableLongUnaryOperator<E> failableLongUnaryOperator) {
        Objects.requireNonNull(failableLongUnaryOperator);
        return new FailableLongUnaryOperator() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
            public final long applyAsLong(long j) {
                return this.f$0.lambda$compose$3(failableLongUnaryOperator, j);
            }
        };
    }

    /* synthetic */ default long lambda$compose$3(FailableLongUnaryOperator failableLongUnaryOperator, long j) throws Throwable {
        return applyAsLong(failableLongUnaryOperator.applyAsLong(j));
    }
}
