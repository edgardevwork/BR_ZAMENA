package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes8.dex */
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    @Override // com.google.common.cache.LoadingCache
    @CanIgnoreReturnValue
    public V getUnchecked(K key) {
        try {
            return get(key);
        } catch (ExecutionException e) {
            throw new UncheckedExecutionException(e.getCause());
        }
    }

    @Override // com.google.common.cache.LoadingCache
    public ImmutableMap<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        for (K k : keys) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(k)) {
                linkedHashMapNewLinkedHashMap.put(k, get(k));
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K key) {
        return getUnchecked(key);
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K key) {
        throw new UnsupportedOperationException();
    }
}
