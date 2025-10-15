package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IdentityArraySet.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u001c\u001a\u00020\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J(\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100 H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010!\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140 H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0012\u0010\"\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0016\u0010&\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016J\u0006\u0010)\u001a\u00020\u0010J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0096\u0002J\u0013\u0010,\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u001d\u0010-\u001a\u00020\u00142\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100 H\u0086\bJ\b\u0010/\u001a\u000200H\u0016R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR0\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u00061"}, m7105d2 = {"Landroidx/compose/runtime/collection/IdentityArraySet;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "()V", "<set-?>", "", "size", "getSize", "()I", "", SavedStateHandle.VALUES, "getValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "add", "", "value", "(Ljava/lang/Object;)Z", "addAll", "", "collection", "", "checkIndexBounds", FirebaseAnalytics.Param.INDEX, "clear", "contains", "element", "containsAll", "elements", "fastAny", "block", "Lkotlin/Function1;", "fastForEach", "find", "findExactIndex", "midIndex", "valueHash", "get", "(I)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "iterator", "", "remove", "removeValueIf", "predicate", "toString", "", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1726#2,3:403\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n378#1:403,3\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentityArraySet<T> implements Set<T>, KMappedMarker {
    public static final int $stable = 8;
    private int size;

    @NotNull
    private Object[] values = new Object[16];

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object element) {
        return element != null && find(element) >= 0;
    }

    @NotNull
    public final T get(int index) {
        checkIndexBounds(index);
        T t = (T) this.values[index];
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@NotNull T value) {
        int iFind;
        int size = size();
        Object[] objArr = this.values;
        if (size > 0) {
            iFind = find(value);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i = -(iFind + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i + 1, i, size);
            ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
            this.values = objArr2;
        } else {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i + 1, i, size);
        }
        this.values[i] = value;
        this.size = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ArraysKt___ArraysJvmKt.fill$default(this.values, (Object) null, 0, 0, 6, (Object) null);
        this.size = 0;
    }

    public final void fastForEach(@NotNull Function1<? super T, Unit> block) {
        Object[] values = getValues();
        int size = size();
        for (int i = 0; i < size; i++) {
            Object obj = values[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            block.invoke(obj);
        }
    }

    public final boolean fastAny(@NotNull Function1<? super T, Boolean> block) {
        int size = size();
        if (size == 0) {
            return false;
        }
        Object[] values = getValues();
        for (int i = 0; i < size; i++) {
            Object obj = values[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (block.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void addAll(@NotNull Collection<? extends T> collection) {
        Object[] objArr;
        int i;
        Object obj;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof IdentityArraySet)) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.values;
        IdentityArraySet identityArraySet = (IdentityArraySet) collection;
        Object[] objArr3 = identityArraySet.values;
        int size = size();
        int size2 = identityArraySet.size();
        int i2 = size + size2;
        boolean z = this.values.length < i2;
        boolean z2 = size == 0 || ActualJvm_jvmKt.identityHashCode(objArr2[size + (-1)]) < ActualJvm_jvmKt.identityHashCode(objArr3[0]);
        if (!z && z2) {
            ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr2, size, 0, size2);
            this.size = size() + size2;
            return;
        }
        if (z) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i3 = size - 1;
        int i4 = size2 - 1;
        int i5 = i2 - 1;
        while (true) {
            if (i3 < 0 && i4 < 0) {
                break;
            }
            if (i3 < 0) {
                i = i4 - 1;
                obj = objArr3[i4];
            } else if (i4 < 0) {
                i = i4;
                obj = objArr2[i3];
                i3--;
            } else {
                Object obj2 = objArr2[i3];
                Object obj3 = objArr3[i4];
                int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(obj2);
                int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj3);
                if (iIdentityHashCode > iIdentityHashCode2) {
                    i3--;
                } else {
                    if (iIdentityHashCode >= iIdentityHashCode2) {
                        if (obj2 != obj3) {
                            int i6 = i3 - 1;
                            while (i6 >= 0) {
                                int i7 = i6 - 1;
                                Object obj4 = objArr2[i6];
                                if (ActualJvm_jvmKt.identityHashCode(obj4) != iIdentityHashCode2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    i4--;
                                    break;
                                }
                                i6 = i7;
                            }
                        } else {
                            i3--;
                            i4--;
                        }
                    }
                    i = i4 - 1;
                    obj = obj3;
                }
                i = i4;
                obj = obj2;
            }
            objArr[i5] = obj;
            i4 = i;
            i5--;
        }
        if (i5 >= 0) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, 0, i5 + 1, i2);
        }
        int i8 = i2 - (i5 + 1);
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i8, i2);
        this.values = objArr;
        this.size = i8;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@Nullable T value) {
        if (value == null) {
            return false;
        }
        int iFind = find(value);
        Object[] objArr = this.values;
        int size = size();
        if (iFind < 0) {
            return false;
        }
        int i = size - 1;
        if (iFind < i) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, iFind, iFind + 1, size);
        }
        objArr[i] = null;
        this.size = size() - 1;
        return true;
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Object[] values = getValues();
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = values[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!predicate.invoke(obj).booleanValue()) {
                if (i != i2) {
                    values[i] = obj;
                }
                i++;
            }
        }
        for (int i3 = i; i3 < size; i3++) {
            values[i3] = null;
        }
        this.size = i;
    }

    private final int find(Object value) {
        int size = size() - 1;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(value);
        Object[] objArr = this.values;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj = objArr[i2];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i = i2 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return obj == value ? i2 : findExactIndex(i2, value, iIdentityHashCode);
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    private final int findExactIndex(int midIndex, Object value, int valueHash) {
        Object obj;
        Object[] objArr = this.values;
        int size = size();
        for (int i = midIndex - 1; -1 < i; i--) {
            Object obj2 = objArr[i];
            if (obj2 == value) {
                return i;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != valueHash) {
                break;
            }
        }
        do {
            midIndex++;
            if (midIndex >= size) {
                return -(size + 1);
            }
            obj = objArr[midIndex];
            if (obj == value) {
                return midIndex;
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj) == valueHash);
        return -(midIndex + 1);
    }

    private final void checkIndexBounds(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: IdentityArraySet.kt */
    @Metadata(m7104d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m7105d2 = {"androidx/compose/runtime/collection/IdentityArraySet$iterator$1", "", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", LinkHeader.Rel.Next, "()Ljava/lang/Object;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.collection.IdentityArraySet$iterator$1 */
    public static final class C17901 implements Iterator<T>, KMappedMarker {
        private int index;
        final /* synthetic */ IdentityArraySet<T> this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C17901(IdentityArraySet<T> identityArraySet) {
            this.this$0 = identityArraySet;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.this$0.size();
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            Object[] values = this.this$0.getValues();
            int i = this.index;
            this.index = i + 1;
            T t = (T) values[i];
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new C17901(this);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this, null, "[", "]", 0, null, new Function1<T, CharSequence>() { // from class: androidx.compose.runtime.collection.IdentityArraySet.toString.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull T t) {
                return t.toString();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((C17911) obj);
            }
        }, 25, null);
    }
}
