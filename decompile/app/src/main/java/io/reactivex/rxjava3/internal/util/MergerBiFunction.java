package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.BiFunction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class MergerBiFunction<T> implements BiFunction<List<T>, List<T>, List<T>> {
    public final Comparator<? super T> comparator;

    public MergerBiFunction(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0037, code lost:
    
        r3 = null;
     */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<T> apply(List<T> a2, List<T> b) {
        T next;
        int size = a2.size() + b.size();
        if (size == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<T> it = a2.iterator();
        Iterator<T> it2 = b.iterator();
        T next2 = it.hasNext() ? it.next() : null;
        if (it2.hasNext()) {
            next = it2.next();
            while (next2 != null && next != null) {
                if (this.comparator.compare(next2, next) < 0) {
                    arrayList.add(next2);
                    next2 = it.hasNext() ? it.next() : null;
                } else {
                    arrayList.add(next);
                    if (it2.hasNext()) {
                        next = it2.next();
                    }
                }
            }
            if (next2 != null) {
                arrayList.add(next2);
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                arrayList.add(next);
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            return arrayList;
        }
        next = null;
    }
}
