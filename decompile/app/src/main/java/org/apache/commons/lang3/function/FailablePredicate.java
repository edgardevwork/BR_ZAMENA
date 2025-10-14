package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes7.dex */
public interface FailablePredicate<T, E extends Throwable> {
    public static final FailablePredicate FALSE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda2
        @Override // org.apache.commons.lang3.function.FailablePredicate
        public final boolean test(Object obj) {
            return FailablePredicate.lambda$static$0(obj);
        }
    };
    public static final FailablePredicate TRUE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailablePredicate
        public final boolean test(Object obj) {
            return FailablePredicate.lambda$static$1(obj);
        }
    };

    static /* synthetic */ boolean lambda$static$0(Object obj) throws Throwable {
        return false;
    }

    static /* synthetic */ boolean lambda$static$1(Object obj) throws Throwable {
        return true;
    }

    boolean test(T t) throws Throwable;

    static <T, E extends Throwable> FailablePredicate<T, E> falsePredicate() {
        return FALSE;
    }

    static <T, E extends Throwable> FailablePredicate<T, E> truePredicate() {
        return TRUE;
    }

    default FailablePredicate<T, E> and(final FailablePredicate<? super T, E> failablePredicate) {
        Objects.requireNonNull(failablePredicate);
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$and$2(failablePredicate, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$2(FailablePredicate failablePredicate, Object obj) throws Throwable {
        return test(obj) && failablePredicate.test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$3(Object obj) throws Throwable {
        return !test(obj);
    }

    default FailablePredicate<T, E> negate() {
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda4
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$negate$3(obj);
            }
        };
    }

    /* renamed from: or */
    default FailablePredicate<T, E> m7356or(final FailablePredicate<? super T, E> failablePredicate) {
        Objects.requireNonNull(failablePredicate);
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$or$4(failablePredicate, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$4(FailablePredicate failablePredicate, Object obj) throws Throwable {
        return test(obj) || failablePredicate.test(obj);
    }
}
