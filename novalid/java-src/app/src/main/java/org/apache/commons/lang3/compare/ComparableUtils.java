package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* loaded from: classes5.dex */
public class ComparableUtils {

    public static class ComparableCheckBuilder<A extends Comparable<A>> {

        /* renamed from: a */
        public final A f9905a;

        public ComparableCheckBuilder(A a2) {
            this.f9905a = a2;
        }

        public boolean between(A a2, A a3) {
            return betweenOrdered(a2, a3) || betweenOrdered(a3, a2);
        }

        public boolean betweenExclusive(A a2, A a3) {
            return betweenOrderedExclusive(a2, a3) || betweenOrderedExclusive(a3, a2);
        }

        public final boolean betweenOrdered(A a2, A a3) {
            return greaterThanOrEqualTo(a2) && lessThanOrEqualTo(a3);
        }

        public final boolean betweenOrderedExclusive(A a2, A a3) {
            return greaterThan(a2) && lessThan(a3);
        }

        public boolean equalTo(A a2) {
            return this.f9905a.compareTo(a2) == 0;
        }

        public boolean greaterThan(A a2) {
            return this.f9905a.compareTo(a2) > 0;
        }

        public boolean greaterThanOrEqualTo(A a2) {
            return this.f9905a.compareTo(a2) >= 0;
        }

        public boolean lessThan(A a2) {
            return this.f9905a.compareTo(a2) < 0;
        }

        public boolean lessThanOrEqualTo(A a2) {
            return this.f9905a.compareTo(a2) <= 0;
        }
    }

    public static <A extends Comparable<A>> Predicate<A> between(final A a2, final A a3) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ComparableUtils.lambda$between$0(a2, a3, (Comparable) obj);
            }
        };
    }

    public static /* synthetic */ boolean lambda$between$0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return m7349is(comparable3).between(comparable, comparable2);
    }

    public static <A extends Comparable<A>> Predicate<A> betweenExclusive(final A a2, final A a3) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ComparableUtils.lambda$betweenExclusive$1(a2, a3, (Comparable) obj);
            }
        };
    }

    public static /* synthetic */ boolean lambda$betweenExclusive$1(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return m7349is(comparable3).betweenExclusive(comparable, comparable2);
    }

    /* renamed from: ge */
    public static <A extends Comparable<A>> Predicate<A> m7347ge(final A a2) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ComparableUtils.lambda$ge$2(a2, (Comparable) obj);
            }
        };
    }

    public static /* synthetic */ boolean lambda$ge$2(Comparable comparable, Comparable comparable2) {
        return m7349is(comparable2).greaterThanOrEqualTo(comparable);
    }

    /* renamed from: gt */
    public static <A extends Comparable<A>> Predicate<A> m7348gt(final A a2) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ComparableUtils.lambda$gt$3(a2, (Comparable) obj);
            }
        };
    }

    public static /* synthetic */ boolean lambda$gt$3(Comparable comparable, Comparable comparable2) {
        return m7349is(comparable2).greaterThan(comparable);
    }

    /* renamed from: is */
    public static <A extends Comparable<A>> ComparableCheckBuilder<A> m7349is(A a2) {
        return new ComparableCheckBuilder<>(a2);
    }

    public static /* synthetic */ boolean lambda$le$4(Comparable comparable, Comparable comparable2) {
        return m7349is(comparable2).lessThanOrEqualTo(comparable);
    }

    /* renamed from: le */
    public static <A extends Comparable<A>> Predicate<A> m7350le(final A a2) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ComparableUtils.lambda$le$4(a2, (Comparable) obj);
            }
        };
    }

    public static /* synthetic */ boolean lambda$lt$5(Comparable comparable, Comparable comparable2) {
        return m7349is(comparable2).lessThan(comparable);
    }

    /* renamed from: lt */
    public static <A extends Comparable<A>> Predicate<A> m7351lt(final A a2) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ComparableUtils.lambda$lt$5(a2, (Comparable) obj);
            }
        };
    }
}
