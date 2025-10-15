package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes7.dex */
public interface FailableDoublePredicate<E extends Throwable> {
    public static final FailableDoublePredicate FALSE = new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public final boolean test(double d) {
            return FailableDoublePredicate.lambda$static$0(d);
        }
    };
    public static final FailableDoublePredicate TRUE = new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda4
        @Override // org.apache.commons.lang3.function.FailableDoublePredicate
        public final boolean test(double d) {
            return FailableDoublePredicate.lambda$static$1(d);
        }
    };

    static /* synthetic */ boolean lambda$static$0(double d) throws Throwable {
        return false;
    }

    static /* synthetic */ boolean lambda$static$1(double d) throws Throwable {
        return true;
    }

    boolean test(double d) throws Throwable;

    static <E extends Throwable> FailableDoublePredicate<E> falsePredicate() {
        return FALSE;
    }

    static <E extends Throwable> FailableDoublePredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableDoublePredicate<E> and(final FailableDoublePredicate<E> failableDoublePredicate) {
        Objects.requireNonNull(failableDoublePredicate);
        return new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d) {
                return this.f$0.lambda$and$2(failableDoublePredicate, d);
            }
        };
    }

    /* synthetic */ default boolean lambda$and$2(FailableDoublePredicate failableDoublePredicate, double d) throws Throwable {
        return test(d) && failableDoublePredicate.test(d);
    }

    /* synthetic */ default boolean lambda$negate$3(double d) throws Throwable {
        return !test(d);
    }

    default FailableDoublePredicate<E> negate() {
        return new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d) {
                return this.f$0.lambda$negate$3(d);
            }
        };
    }

    /* renamed from: or */
    default FailableDoublePredicate<E> m7353or(final FailableDoublePredicate<E> failableDoublePredicate) {
        Objects.requireNonNull(failableDoublePredicate);
        return new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d) {
                return this.f$0.lambda$or$4(failableDoublePredicate, d);
            }
        };
    }

    /* synthetic */ default boolean lambda$or$4(FailableDoublePredicate failableDoublePredicate, double d) throws Throwable {
        return test(d) || failableDoublePredicate.test(d);
    }
}
