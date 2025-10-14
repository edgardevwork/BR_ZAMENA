package org.apache.ivy.util.filter;

/* loaded from: classes5.dex */
public class NotFilter<T> implements Filter<T> {

    /* renamed from: op */
    public Filter<T> f10002op;

    public NotFilter(Filter<T> filter) {
        this.f10002op = filter;
    }

    public Filter<T> getOp() {
        return this.f10002op;
    }

    @Override // org.apache.ivy.util.filter.Filter
    public boolean accept(T t) {
        return !this.f10002op.accept(t);
    }
}
