package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/* loaded from: classes8.dex */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    public static final Pair<?, ?>[] EMPTY_ARRAY = new PairAdapter[0];
    public static final long serialVersionUID = 4954918890077093841L;

    public abstract L getLeft();

    public abstract R getRight();

    /* loaded from: classes7.dex */
    public static final class PairAdapter<L, R> extends Pair<L, R> {
        public static final long serialVersionUID = 1;

        @Override // org.apache.commons.lang3.tuple.Pair
        public L getLeft() {
            return null;
        }

        @Override // org.apache.commons.lang3.tuple.Pair
        public R getRight() {
            return null;
        }

        @Override // java.util.Map.Entry
        public R setValue(R r) {
            return null;
        }

        @Override // org.apache.commons.lang3.tuple.Pair, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Pair) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> Pair<L, R>[] emptyArray() {
        return (Pair<L, R>[]) EMPTY_ARRAY;
    }

    /* renamed from: of */
    public static <L, R> Pair<L, R> m7373of(L l, R r) {
        return ImmutablePair.m7367of((Object) l, (Object) r);
    }

    /* renamed from: of */
    public static <L, R> Pair<L, R> m7374of(Map.Entry<L, R> entry) {
        return ImmutablePair.m7368of((Map.Entry) entry);
    }

    @Override // java.lang.Comparable
    public int compareTo(Pair<L, R> pair) {
        return new CompareToBuilder().append(getLeft(), pair.getLeft()).append(getRight(), pair.getRight()).toComparison();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    public String toString() {
        return "(" + getLeft() + ',' + getRight() + ')';
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
