package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@CheckForNull @CompatibleWith("K") Object key, @CheckForNull @CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object value);

    boolean containsKey(@CheckForNull @CompatibleWith("K") Object key);

    boolean containsValue(@CheckForNull @CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object value);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@CheckForNull Object obj);

    Collection<V> get(@ParametricNullness K key);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    Multiset<K> keys();

    @CanIgnoreReturnValue
    boolean put(@ParametricNullness K key, @ParametricNullness V value);

    @CanIgnoreReturnValue
    boolean putAll(Multimap<? extends K, ? extends V> multimap);

    @CanIgnoreReturnValue
    boolean putAll(@ParametricNullness K key, Iterable<? extends V> values);

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull @CompatibleWith("K") Object key, @CheckForNull @CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object value);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@CheckForNull @CompatibleWith("K") Object key);

    @CanIgnoreReturnValue
    Collection<V> replaceValues(@ParametricNullness K key, Iterable<? extends V> values);

    int size();

    Collection<V> values();
}
