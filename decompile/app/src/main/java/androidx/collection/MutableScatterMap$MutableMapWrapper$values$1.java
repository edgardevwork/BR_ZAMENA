package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: ScatterMap.kt */
@Metadata(m7104d1 = {"\u00001\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0017"}, m7105d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n363#2,6:1875\n373#2,3:1882\n376#2,9:1886\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1810#3:1881\n1672#3:1885\n1726#4,3:1895\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1530#1:1835,6\n1530#1:1842,3\n1530#1:1846,9\n1541#1:1855,6\n1541#1:1862,3\n1541#1:1866,9\n1551#1:1875,6\n1551#1:1882,3\n1551#1:1886,9\n1530#1:1841\n1530#1:1845\n1541#1:1861\n1541#1:1865\n1551#1:1881\n1551#1:1885\n1561#1:1895,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements Collection<V>, KMutableCollection {
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.this$0);
    }

    @Override // java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean add(V element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z = false;
        if (length >= 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!CollectionsKt___CollectionsKt.contains(elements, mutableScatterMap.values[i4])) {
                                mutableScatterMap.removeValueAt(i4);
                                z2 = true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return z2;
                    }
                }
                if (i == length) {
                    z = z2;
                    break;
                }
                i++;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z = false;
        if (length >= 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (CollectionsKt___CollectionsKt.contains(elements, mutableScatterMap.values[i4])) {
                                mutableScatterMap.removeValueAt(i4);
                                z2 = true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return z2;
                    }
                }
                if (i == length) {
                    z = z2;
                    break;
                }
                i++;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean remove(Object element) {
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (Intrinsics.areEqual(mutableScatterMap.values[i4], element)) {
                                mutableScatterMap.removeValueAt(i4);
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return this.this$0.containsValue(element);
    }
}
