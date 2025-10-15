package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

@DoNotMock("Use CacheBuilder.newBuilder().build()")
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public interface Cache<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    @CanIgnoreReturnValue
    V get(K key, Callable<? extends V> loader) throws ExecutionException;

    ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> keys);

    @CanIgnoreReturnValue
    @CheckForNull
    V getIfPresent(@CompatibleWith("K") Object key);

    void invalidate(@CompatibleWith("K") Object key);

    void invalidateAll();

    void invalidateAll(Iterable<? extends Object> keys);

    void put(K key, V value);

    void putAll(Map<? extends K, ? extends V> m);

    long size();

    CacheStats stats();
}
