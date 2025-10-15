package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

@ElementTypesAreNonnullByDefault
@Immutable
@GwtCompatible
/* loaded from: classes8.dex */
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    public final int[] array;
    public final int end;
    public final transient int start;

    /* renamed from: of */
    public static ImmutableIntArray m1324of() {
        return EMPTY;
    }

    /* renamed from: of */
    public static ImmutableIntArray m1325of(int e0) {
        return new ImmutableIntArray(new int[]{e0});
    }

    /* renamed from: of */
    public static ImmutableIntArray m1326of(int e0, int e1) {
        return new ImmutableIntArray(new int[]{e0, e1});
    }

    /* renamed from: of */
    public static ImmutableIntArray m1327of(int e0, int e1, int e2) {
        return new ImmutableIntArray(new int[]{e0, e1, e2});
    }

    /* renamed from: of */
    public static ImmutableIntArray m1328of(int e0, int e1, int e2, int e3) {
        return new ImmutableIntArray(new int[]{e0, e1, e2, e3});
    }

    /* renamed from: of */
    public static ImmutableIntArray m1329of(int e0, int e1, int e2, int e3, int e4) {
        return new ImmutableIntArray(new int[]{e0, e1, e2, e3, e4});
    }

    /* renamed from: of */
    public static ImmutableIntArray m1330of(int e0, int e1, int e2, int e3, int e4, int e5) {
        return new ImmutableIntArray(new int[]{e0, e1, e2, e3, e4, e5});
    }

    /* renamed from: of */
    public static ImmutableIntArray m1331of(int first, int... rest) {
        Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr = new int[rest.length + 1];
        iArr[0] = first;
        System.arraycopy(rest, 0, iArr, 1, rest.length);
        return new ImmutableIntArray(iArr);
    }

    public static ImmutableIntArray copyOf(int[] values) {
        return values.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(values, values.length));
    }

    public static ImmutableIntArray copyOf(Collection<Integer> values) {
        return values.isEmpty() ? EMPTY : new ImmutableIntArray(Ints.toArray(values));
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Integer>) values);
        }
        return builder().addAll(values).build();
    }

    public static Builder builder(int initialCapacity) {
        Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new Builder(initialCapacity);
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static final class Builder {
        public int[] array;
        public int count = 0;

        public Builder(int initialCapacity) {
            this.array = new int[initialCapacity];
        }

        @CanIgnoreReturnValue
        public Builder add(int value) {
            ensureRoomFor(1);
            int[] iArr = this.array;
            int i = this.count;
            iArr[i] = value;
            this.count = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(int[] values) {
            ensureRoomFor(values.length);
            System.arraycopy(values, 0, this.array, this.count, values.length);
            this.count += values.length;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Integer> values) {
            if (values instanceof Collection) {
                return addAll((Collection<Integer>) values);
            }
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Integer> values) {
            ensureRoomFor(values.size());
            for (Integer num : values) {
                int[] iArr = this.array;
                int i = this.count;
                this.count = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableIntArray values) {
            ensureRoomFor(values.length());
            System.arraycopy(values.array, values.start, this.array, this.count, values.length());
            this.count += values.length();
            return this;
        }

        public final void ensureRoomFor(int numberToAdd) {
            int i = this.count + numberToAdd;
            int[] iArr = this.array;
            if (i > iArr.length) {
                this.array = Arrays.copyOf(iArr, expandedCapacity(iArr.length, i));
            }
        }

        public static int expandedCapacity(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public ImmutableIntArray build() {
            if (this.count == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.array, 0, this.count);
        }
    }

    public ImmutableIntArray(int[] array) {
        this(array, 0, array.length);
    }

    public ImmutableIntArray(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int length() {
        return this.end - this.start;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int get(int index) {
        Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int indexOf(int target) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == target) {
                return i - this.start;
            }
        }
        return -1;
    }

    public int lastIndexOf(int target) {
        int i;
        int i2 = this.end;
        do {
            i2--;
            i = this.start;
            if (i2 < i) {
                return -1;
            }
        } while (this.array[i2] != target);
        return i2 - i;
    }

    public boolean contains(int target) {
        return indexOf(target) >= 0;
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public ImmutableIntArray subArray(int startIndex, int endIndex) {
        Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i = this.start;
        return new ImmutableIntArray(iArr, startIndex + i, i + endIndex);
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final ImmutableIntArray parent;

        public AsList(ImmutableIntArray parent) {
            this.parent = parent;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int index) {
            return Integer.valueOf(this.parent.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            if (target instanceof Integer) {
                return this.parent.indexOf(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            if (target instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            return this.parent.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof AsList) {
                return this.parent.equals(((AsList) object).parent);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i = this.parent.start;
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    int i2 = i + 1;
                    if (this.parent.array[i] == ((Integer) obj).intValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) object;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i = this.start; i < this.end; i++) {
            iHashCode = (iHashCode * 31) + Ints.hashCode(this.array[i]);
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
        }
    }

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    public final boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }
}
