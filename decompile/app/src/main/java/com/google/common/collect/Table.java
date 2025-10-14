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

@GwtCompatible
@DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        boolean equals(@CheckForNull Object obj);

        @ParametricNullness
        C getColumnKey();

        @ParametricNullness
        R getRowKey();

        @ParametricNullness
        V getValue();

        int hashCode();
    }

    Set<Cell<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@ParametricNullness C columnKey);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@CheckForNull @CompatibleWith("R") Object rowKey, @CheckForNull @CompatibleWith("C") Object columnKey);

    boolean containsColumn(@CheckForNull @CompatibleWith("C") Object columnKey);

    boolean containsRow(@CheckForNull @CompatibleWith("R") Object rowKey);

    boolean containsValue(@CheckForNull @CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object value);

    boolean equals(@CheckForNull Object obj);

    @CheckForNull
    V get(@CheckForNull @CompatibleWith("R") Object rowKey, @CheckForNull @CompatibleWith("C") Object columnKey);

    int hashCode();

    boolean isEmpty();

    @CanIgnoreReturnValue
    @CheckForNull
    V put(@ParametricNullness R rowKey, @ParametricNullness C columnKey, @ParametricNullness V value);

    void putAll(Table<? extends R, ? extends C, ? extends V> table);

    @CanIgnoreReturnValue
    @CheckForNull
    V remove(@CheckForNull @CompatibleWith("R") Object rowKey, @CheckForNull @CompatibleWith("C") Object columnKey);

    Map<C, V> row(@ParametricNullness R rowKey);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
