package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    @CheckForNull
    public volatile transient CacheEntry<K, V> cacheEntry1;

    @CheckForNull
    public volatile transient CacheEntry<K, V> cacheEntry2;

    public MapRetrievalCache(Map<K, V> backingMap) {
        super(backingMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MapIteratorCache
    @CheckForNull
    public V get(Object key) {
        Preconditions.checkNotNull(key);
        V ifCached = getIfCached(key);
        if (ifCached != null) {
            return ifCached;
        }
        V withoutCaching = getWithoutCaching(key);
        if (withoutCaching != null) {
            addToCache(key, withoutCaching);
        }
        return withoutCaching;
    }

    @Override // com.google.common.graph.MapIteratorCache
    @CheckForNull
    public V getIfCached(@CheckForNull Object obj) {
        V v = (V) super.getIfCached(obj);
        if (v != null) {
            return v;
        }
        CacheEntry<K, V> cacheEntry = this.cacheEntry1;
        if (cacheEntry != null && cacheEntry.key == obj) {
            return cacheEntry.value;
        }
        CacheEntry<K, V> cacheEntry2 = this.cacheEntry2;
        if (cacheEntry2 == null || cacheEntry2.key != obj) {
            return null;
        }
        addToCache(cacheEntry2);
        return cacheEntry2.value;
    }

    @Override // com.google.common.graph.MapIteratorCache
    public void clearCache() {
        super.clearCache();
        this.cacheEntry1 = null;
        this.cacheEntry2 = null;
    }

    public final void addToCache(K key, V value) {
        addToCache(new CacheEntry<>(key, value));
    }

    public final void addToCache(CacheEntry<K, V> entry) {
        this.cacheEntry2 = this.cacheEntry1;
        this.cacheEntry1 = entry;
    }

    /* loaded from: classes7.dex */
    public static final class CacheEntry<K, V> {
        public final K key;
        public final V value;

        public CacheEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
