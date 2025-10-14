package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes7.dex */
public interface FailableIntPredicate<E extends Throwable> {
    public static final FailableIntPredicate FALSE = new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1
        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public final boolean test(int i) {
            return FailableIntPredicate.lambda$static$0(i);
        }
    };
    public static final FailableIntPredicate TRUE = new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda2
        @Override // org.apache.commons.lang3.function.FailableIntPredicate
        public final boolean test(int i) {
            return FailableIntPredicate.lambda$static$1(i);
        }
    };

    static /* synthetic */ boolean lambda$static$0(int i) throws Throwable {
        return false;
    }

    static /* synthetic */ boolean lambda$static$1(int i) throws Throwable {
        return true;
    }

    boolean test(int i) throws Throwable;

    static <E extends Throwable> FailableIntPredicate<E> falsePredicate() {
        return FALSE;
    }

    static <E extends Throwable> FailableIntPredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableIntPredicate<E> and(final FailableIntPredicate<E> failableIntPredicate) {
        Objects.requireNonNull(failableIntPredicate);
        return new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i) {
                return this.f$0.lambda$and$2(failableIntPredicate, i);
            }
        };
    }

    /* synthetic */ default boolean lambda$and$2(FailableIntPredicate failableIntPredicate, int i) throws Throwable {
        return test(i) && failableIntPredicate.test(i);
    }

    /* synthetic */ default boolean lambda$negate$3(int i) throws Throwable {
        return !test(i);
    }

    default FailableIntPredicate<E> negate() {
        return new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda4
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i) {
                return this.f$0.lambda$negate$3(i);
            }
        };
    }

    /* renamed from: or */
    default FailableIntPredicate<E> m7354or(final FailableIntPredicate<E> failableIntPredicate) {
        Objects.requireNonNull(failableIntPredicate);
        return new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i) {
                return this.f$0.lambda$or$4(failableIntPredicate, i);
            }
        };
    }

    /* synthetic */ default boolean lambda$or$4(FailableIntPredicate failableIntPredicate, int i) throws Throwable {
        return test(i) || failableIntPredicate.test(i);
    }
}
