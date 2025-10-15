package org.apache.ivy.util.filter;

/* loaded from: classes5.dex */
public class AndFilter<T> implements Filter<T> {
    public Filter<T> op1;
    public Filter<T> op2;

    public AndFilter(Filter<T> filter, Filter<T> filter2) {
        this.op1 = filter;
        this.op2 = filter2;
    }

    public Filter<T> getOp1() {
        return this.op1;
    }

    public Filter<T> getOp2() {
        return this.op2;
    }

    @Override // org.apache.ivy.util.filter.Filter
    public boolean accept(T t) {
        return this.op1.accept(t) && this.op2.accept(t);
    }
}
