package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Tables {
    public static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> UNMODIFIABLE_WRAPPER = new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Tables.1
        @Override // com.google.common.base.Function
        public Map<Object, Object> apply(Map<Object, Object> input) {
            return Collections.unmodifiableMap(input);
        }
    };

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(@ParametricNullness R rowKey, @ParametricNullness C columnKey, @ParametricNullness V value) {
        return new ImmutableCell(rowKey, columnKey, value);
    }

    /* loaded from: classes5.dex */
    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        public static final long serialVersionUID = 0;

        @ParametricNullness
        public final C columnKey;

        @ParametricNullness
        public final R rowKey;

        @ParametricNullness
        public final V value;

        public ImmutableCell(@ParametricNullness R rowKey, @ParametricNullness C columnKey, @ParametricNullness V value) {
            this.rowKey = rowKey;
            this.columnKey = columnKey;
            this.value = value;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public V getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        @Override // com.google.common.collect.Table.Cell
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            return Objects.equal(getRowKey(), cell.getRowKey()) && Objects.equal(getColumnKey(), cell.getColumnKey()) && Objects.equal(getValue(), cell.getValue());
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            return "(" + getRowKey() + "," + getColumnKey() + ")=" + getValue();
        }
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
        if (table instanceof TransposeTable) {
            return ((TransposeTable) table).original;
        }
        return new TransposeTable(table);
    }

    /* loaded from: classes5.dex */
    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        public static final Function TRANSPOSE_CELL = new Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>>() { // from class: com.google.common.collect.Tables.TransposeTable.1
            @Override // com.google.common.base.Function
            public Table.Cell<?, ?, ?> apply(Table.Cell<?, ?, ?> cell) {
                return Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
            }
        };
        public final Table<R, C, V> original;

        public TransposeTable(Table<R, C, V> original) {
            this.original = (Table) Preconditions.checkNotNull(original);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.original.clear();
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> column(@ParametricNullness R columnKey) {
            return this.original.row(columnKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> columnKeySet() {
            return this.original.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> columnMap() {
            return this.original.rowMap();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.original.contains(columnKey, rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsColumn(@CheckForNull Object columnKey) {
            return this.original.containsRow(columnKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsRow(@CheckForNull Object rowKey) {
            return this.original.containsColumn(rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsValue(@CheckForNull Object value) {
            return this.original.containsValue(value);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @CheckForNull
        public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.original.get(columnKey, rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @CheckForNull
        public V put(@ParametricNullness C rowKey, @ParametricNullness R columnKey, @ParametricNullness V value) {
            return this.original.put(columnKey, rowKey, value);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends C, ? extends R, ? extends V> table) {
            this.original.putAll(Tables.transpose(table));
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @CheckForNull
        public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.original.remove(columnKey, rowKey);
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> row(@ParametricNullness C rowKey) {
            return this.original.column(rowKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> rowKeySet() {
            return this.original.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> rowMap() {
            return this.original.columnMap();
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.original.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Collection<V> values() {
            return this.original.values();
        }

        @Override // com.google.common.collect.AbstractTable
        public Iterator<Table.Cell<C, R, V>> cellIterator() {
            return Iterators.transform(this.original.cellSet().iterator(), TRANSPOSE_CELL);
        }
    }

    public static <R, C, V> Table<R, C, V> newCustomTable(Map<R, Map<C, V>> backingMap, Supplier<? extends Map<C, V>> factory) {
        Preconditions.checkArgument(backingMap.isEmpty());
        Preconditions.checkNotNull(factory);
        return new StandardTable(backingMap, factory);
    }

    public static <R, C, V1, V2> Table<R, C, V2> transformValues(Table<R, C, V1> fromTable, Function<? super V1, V2> function) {
        return new TransformedTable(fromTable, function);
    }

    /* loaded from: classes5.dex */
    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {
        public final Table<R, C, V1> fromTable;
        public final Function<? super V1, V2> function;

        public TransformedTable(Table<R, C, V1> fromTable, Function<? super V1, V2> function) {
            this.fromTable = (Table) Preconditions.checkNotNull(fromTable);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.fromTable.contains(rowKey, columnKey);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @CheckForNull
        public V2 get(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply((Object) NullnessCasts.uncheckedCastNullableTToT(this.fromTable.get(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.fromTable.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.fromTable.clear();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @CheckForNull
        public V2 put(@ParametricNullness R rowKey, @ParametricNullness C columnKey, @ParametricNullness V2 value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V2> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        @CheckForNull
        public V2 remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (contains(obj, obj2)) {
                return this.function.apply((Object) NullnessCasts.uncheckedCastNullableTToT(this.fromTable.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public Map<C, V2> row(@ParametricNullness R rowKey) {
            return Maps.transformValues(this.fromTable.row(rowKey), this.function);
        }

        @Override // com.google.common.collect.Table
        public Map<R, V2> column(@ParametricNullness C columnKey) {
            return Maps.transformValues(this.fromTable.column(columnKey), this.function);
        }

        public Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>> cellFunction() {
            return new Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.1
                @Override // com.google.common.base.Function
                public Table.Cell<R, C, V2> apply(Table.Cell<R, C, V1> cell) {
                    return Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), TransformedTable.this.function.apply(cell.getValue()));
                }
            };
        }

        @Override // com.google.common.collect.AbstractTable
        public Iterator<Table.Cell<R, C, V2>> cellIterator() {
            return Iterators.transform(this.fromTable.cellSet().iterator(), cellFunction());
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return this.fromTable.rowKeySet();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return this.fromTable.columnKeySet();
        }

        @Override // com.google.common.collect.AbstractTable
        public Collection<V2> createValues() {
            return Collections2.transform(this.fromTable.values(), this.function);
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V2>> rowMap() {
            return Maps.transformValues(this.fromTable.rowMap(), new Function<Map<C, V1>, Map<C, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.2
                @Override // com.google.common.base.Function
                public Map<C, V2> apply(Map<C, V1> row) {
                    return Maps.transformValues(row, TransformedTable.this.function);
                }
            });
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V2>> columnMap() {
            return Maps.transformValues(this.fromTable.columnMap(), new Function<Map<R, V1>, Map<R, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.3
                @Override // com.google.common.base.Function
                public Map<R, V2> apply(Map<R, V1> column) {
                    return Maps.transformValues(column, TransformedTable.this.function);
                }
            });
        }
    }

    public static <R, C, V> Table<R, C, V> unmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
        return new UnmodifiableTable(table);
    }

    /* loaded from: classes5.dex */
    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Table<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(Table<? extends R, ? extends C, ? extends V> delegate) {
            this.delegate = (Table) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public Table<R, C, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, V> column(@ParametricNullness C columnKey) {
            return Collections.unmodifiableMap(super.column(columnKey));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(Maps.transformValues(super.columnMap(), Tables.unmodifiableWrapper()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        @CheckForNull
        public V put(@ParametricNullness R rowKey, @ParametricNullness C columnKey, @ParametricNullness V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        @CheckForNull
        public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, V> row(@ParametricNullness R rowKey) {
            return Collections.unmodifiableMap(super.row(rowKey));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(Maps.transformValues(super.rowMap(), Tables.unmodifiableWrapper()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }
    }

    public static <R, C, V> RowSortedTable<R, C, V> unmodifiableRowSortedTable(RowSortedTable<R, ? extends C, ? extends V> table) {
        return new UnmodifiableRowSortedMap(table);
    }

    /* loaded from: classes8.dex */
    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        public static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public RowSortedTable<R, C, V> delegate() {
            return (RowSortedTable) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(Maps.transformValues((SortedMap) delegate().rowMap(), Tables.unmodifiableWrapper()));
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }
    }

    public static <K, V> Function<Map<K, V>, Map<K, V>> unmodifiableWrapper() {
        return (Function<Map<K, V>, Map<K, V>>) UNMODIFIABLE_WRAPPER;
    }

    public static <R, C, V> Table<R, C, V> synchronizedTable(Table<R, C, V> table) {
        return Synchronized.table(table, null);
    }

    public static boolean equalsImpl(Table<?, ?, ?> table, @CheckForNull Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.cellSet().equals(((Table) obj).cellSet());
        }
        return false;
    }
}
