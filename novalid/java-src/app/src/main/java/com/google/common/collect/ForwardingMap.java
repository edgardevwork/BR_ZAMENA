package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {
    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public int size() {
        return delegate().size();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object key) {
        return delegate().remove(key);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@CheckForNull Object key) {
        return delegate().containsKey(key);
    }

    public boolean containsValue(@CheckForNull Object value) {
        return delegate().containsValue(value);
    }

    @CheckForNull
    public V get(@CheckForNull Object key) {
        return delegate().get(key);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K key, @ParametricNullness V value) {
        return delegate().put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@CheckForNull Object object) {
        return object == this || delegate().equals(object);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.putAllImpl(this, map);
    }

    @CheckForNull
    public V standardRemove(@CheckForNull Object key) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (Objects.equal(next.getKey(), key)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    /* loaded from: classes7.dex */
    public class StandardKeySet extends Maps.KeySet<K, V> {
        public StandardKeySet(final ForwardingMap this$0) {
            super(this$0);
        }
    }

    public boolean standardContainsKey(@CheckForNull Object key) {
        return Maps.containsKeyImpl(this, key);
    }

    public class StandardValues extends Maps.Values<K, V> {
        public StandardValues(final ForwardingMap this$0) {
            super(this$0);
        }
    }

    public boolean standardContainsValue(@CheckForNull Object value) {
        return Maps.containsValueImpl(this, value);
    }

    /* loaded from: classes7.dex */
    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        public StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        public Map<K, V> map() {
            return ForwardingMap.this;
        }
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public boolean standardEquals(@CheckForNull Object object) {
        return Maps.equalsImpl(this, object);
    }

    public int standardHashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    public String standardToString() {
        return Maps.toStringImpl(this);
    }
}
