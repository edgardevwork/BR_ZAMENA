package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes7.dex */
public abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    @CheckForNull
    public List<Present<V>> values;

    public abstract C combine(List<Present<V>> values);

    public CollectionFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> futures, boolean allMustSucceed) {
        List<Present<V>> listNewArrayListWithCapacity;
        super(futures, allMustSucceed, true);
        if (futures.isEmpty()) {
            listNewArrayListWithCapacity = Collections.emptyList();
        } else {
            listNewArrayListWithCapacity = Lists.newArrayListWithCapacity(futures.size());
        }
        for (int i = 0; i < futures.size(); i++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.values = listNewArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void collectOneValue(int index, @ParametricNullness V returnValue) {
        List<Present<V>> list = this.values;
        if (list != null) {
            list.set(index, new Present<>(returnValue));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void handleAllCompleted() {
        List<Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public void releaseResources(AggregateFuture.ReleaseResourcesReason reason) {
        super.releaseResources(reason);
        this.values = null;
    }

    /* loaded from: classes8.dex */
    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        public ListFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> futures, boolean allMustSucceed) {
            super(futures, allMustSucceed);
            init();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public List<V> combine(List<Present<V>> values) {
            ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(values.size());
            Iterator<Present<V>> it = values.iterator();
            while (it.hasNext()) {
                Present<V> next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.value : null);
            }
            return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Present<V> {

        @ParametricNullness
        public final V value;

        public Present(@ParametricNullness V value) {
            this.value = value;
        }
    }
}
