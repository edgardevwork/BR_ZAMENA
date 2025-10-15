package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class ComparisonChain {
    public static final ComparisonChain ACTIVE = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> left, Comparable<?> right) {
            return classify(left.compareTo(right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
            return classify(comparator.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int left, int right) {
            return classify(Ints.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long left, long right) {
            return classify(Longs.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float left, float right) {
            return classify(Float.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double left, double right) {
            return classify(Double.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean left, boolean right) {
            return classify(Booleans.compare(right, left));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean left, boolean right) {
            return classify(Booleans.compare(left, right));
        }

        public ComparisonChain classify(int result) {
            if (result < 0) {
                return ComparisonChain.LESS;
            }
            return result > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }
    };
    public static final ComparisonChain LESS = new InactiveComparisonChain(-1);
    public static final ComparisonChain GREATER = new InactiveComparisonChain(1);

    public abstract ComparisonChain compare(double left, double right);

    public abstract ComparisonChain compare(float left, float right);

    public abstract ComparisonChain compare(int left, int right);

    public abstract ComparisonChain compare(long left, long right);

    public abstract ComparisonChain compare(Comparable<?> left, Comparable<?> right);

    public abstract <T> ComparisonChain compare(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean left, boolean right);

    public abstract ComparisonChain compareTrueFirst(boolean left, boolean right);

    public abstract int result();

    public /* synthetic */ ComparisonChain(C72321 c72321) {
        this();
    }

    public ComparisonChain() {
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }

    /* renamed from: com.google.common.collect.ComparisonChain$1 */
    /* loaded from: classes8.dex */
    public class C72321 extends ComparisonChain {
        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> left, Comparable<?> right) {
            return classify(left.compareTo(right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
            return classify(comparator.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int left, int right) {
            return classify(Ints.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long left, long right) {
            return classify(Longs.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float left, float right) {
            return classify(Float.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double left, double right) {
            return classify(Double.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean left, boolean right) {
            return classify(Booleans.compare(right, left));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean left, boolean right) {
            return classify(Booleans.compare(left, right));
        }

        public ComparisonChain classify(int result) {
            if (result < 0) {
                return ComparisonChain.LESS;
            }
            return result > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }
    }

    /* loaded from: classes8.dex */
    public static final class InactiveComparisonChain extends ComparisonChain {
        public final int result;

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double left, double right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float left, float right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int left, int right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long left, long right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> left, Comparable<?> right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean left, boolean right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean left, boolean right) {
            return this;
        }

        public InactiveComparisonChain(int result) {
            super();
            this.result = result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }
    }

    @Deprecated
    public final ComparisonChain compare(Boolean left, Boolean right) {
        return compareFalseFirst(left.booleanValue(), right.booleanValue());
    }
}
