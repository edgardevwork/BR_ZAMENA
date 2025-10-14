package org.apache.ivy.util.filter;

/* loaded from: classes5.dex */
public final class NoFilter<T> implements Filter<T> {
    public static final Filter INSTANCE = new NoFilter();

    @Override // org.apache.ivy.util.filter.Filter
    public boolean accept(T t) {
        return true;
    }

    public static <T> Filter<T> instance() {
        return INSTANCE;
    }

    public String toString() {
        return "NoFilter";
    }
}
