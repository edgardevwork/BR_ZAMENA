package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@Immutable(containerOf = {"R", "C", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable<Object, Object, Object> EMPTY = new SparseImmutableTable(ImmutableList.m1171of(), ImmutableSet.m1218of(), ImmutableSet.m1218of());
    public final int[] cellColumnInRowIndices;
    public final int[] cellRowIndices;
    public final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    public final ImmutableMap<R, ImmutableMap<C, V>> rowMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapIndexMap = Maps.indexMap(immutableSet);
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        UnmodifiableIterator<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapNewLinkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = Maps.newLinkedHashMap();
        UnmodifiableIterator<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapNewLinkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            V value = cell.getValue();
            Integer num = (Integer) immutableMapIndexMap.get(rowKey);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMapNewLinkedHashMap.get(rowKey);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            checkNoDuplicate(rowKey, columnKey, map2.put(columnKey, value), value);
            Map map3 = (Map) linkedHashMapNewLinkedHashMap2.get(columnKey);
            Objects.requireNonNull(map3);
            map3.put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(linkedHashMapNewLinkedHashMap.size());
        for (Map.Entry entry : linkedHashMapNewLinkedHashMap.entrySet()) {
            builder.put(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.rowMap = builder.buildOrThrow();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMapNewLinkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMapNewLinkedHashMap2.entrySet()) {
            builder2.put(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.columnMap = builder2.buildOrThrow();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.columnMap);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.rowMap);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public Table.Cell<R, C, V> getCell(int index) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.rowMap.entrySet().asList().get(this.cellRowIndices[index]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.cellColumnInRowIndices[index]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public V getValue(int index) {
        ImmutableMap<C, V> immutableMap = this.rowMap.values().asList().get(this.cellRowIndices[index]);
        return immutableMap.values().asList().get(this.cellColumnInRowIndices[index]);
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
        ImmutableMap immutableMapIndexMap = Maps.indexMap(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        UnmodifiableIterator<Table.Cell<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) immutableMapIndexMap.get(it.next().getColumnKey());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, iArr);
    }
}
