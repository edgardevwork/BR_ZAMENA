package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes7.dex */
public interface FailableLongPredicate<E extends Throwable> {
    public static final FailableLongPredicate FALSE = new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailableLongPredicate
        public final boolean test(long j) {
            return FailableLongPredicate.lambda$static$0(j);
        }
    };
    public static final FailableLongPredicate TRUE = new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda4
        @Override // org.apache.commons.lang3.function.FailableLongPredicate
        public final boolean test(long j) {
            return FailableLongPredicate.lambda$static$1(j);
        }
    };

    static /* synthetic */ boolean lambda$static$0(long j) throws Throwable {
        return false;
    }

    static /* synthetic */ boolean lambda$static$1(long j) throws Throwable {
        return true;
    }

    boolean test(long j) throws Throwable;

    static <E extends Throwable> FailableLongPredicate<E> falsePredicate() {
        return FALSE;
    }

    static <E extends Throwable> FailableLongPredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableLongPredicate<E> and(final FailableLongPredicate<E> failableLongPredicate) {
        Objects.requireNonNull(failableLongPredicate);
        return new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j) {
                return this.f$0.lambda$and$2(failableLongPredicate, j);
            }
        };
    }

    /* synthetic */ default boolean lambda$and$2(FailableLongPredicate failableLongPredicate, long j) throws Throwable {
        return test(j) && failableLongPredicate.test(j);
    }

    /* synthetic */ default boolean lambda$negate$3(long j) throws Throwable {
        return !test(j);
    }

    default FailableLongPredicate<E> negate() {
        return new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j) {
                return this.f$0.lambda$negate$3(j);
            }
        };
    }

    /* renamed from: or */
    default FailableLongPredicate<E> m7355or(final FailableLongPredicate<E> failableLongPredicate) {
        Objects.requireNonNull(failableLongPredicate);
        return new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j) {
                return this.f$0.lambda$or$4(failableLongPredicate, j);
            }
        };
    }

    /* synthetic */ default boolean lambda$or$4(FailableLongPredicate failableLongPredicate, long j) throws Throwable {
        return test(j) || failableLongPredicate.test(j);
    }
}
