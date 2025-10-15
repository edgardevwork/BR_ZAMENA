package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes6.dex */
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    public static int compare(short a2, short b) {
        return a2 - b;
    }

    @GwtIncompatible
    public static short fromBytes(byte b1, byte b2) {
        return (short) ((b1 << 8) | (b2 & 255));
    }

    public static int hashCode(short value) {
        return value;
    }

    public static short saturatedCast(long value) {
        return value > 32767 ? ShortCompanionObject.MAX_VALUE : value < -32768 ? ShortCompanionObject.MIN_VALUE : (short) value;
    }

    public static short checkedCast(long value) {
        short s = (short) value;
        Preconditions.checkArgument(((long) s) == value, "Out of range: %s", value);
        return s;
    }

    public static boolean contains(short[] array, short target) {
        for (short s : array) {
            if (s == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(short[] array, short target) {
        return indexOf(array, target, 0, array.length);
    }

    public static int indexOf(short[] array, short target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(short[] array, short[] target) {
        Preconditions.checkNotNull(array, "array");
        Preconditions.checkNotNull(target, "target");
        if (target.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (array.length - target.length) + 1) {
            for (int i2 = 0; i2 < target.length; i2++) {
                if (array[i + i2] != target[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(short[] array, short target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static int lastIndexOf(short[] array, short target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... array) {
        Preconditions.checkArgument(array.length > 0);
        short s = array[0];
        for (int i = 1; i < array.length; i++) {
            short s2 = array[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... array) {
        Preconditions.checkArgument(array.length > 0);
        short s = array[0];
        for (int i = 1; i < array.length; i++) {
            short s2 = array[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    public static short constrainToRange(short value, short min, short max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", (int) min, (int) max);
        return value < min ? min : value < max ? value : max;
    }

    public static short[] concat(short[]... arrays) {
        int length = 0;
        for (short[] sArr : arrays) {
            length += sArr.length;
        }
        short[] sArr2 = new short[length];
        int length2 = 0;
        for (short[] sArr3 : arrays) {
            System.arraycopy(sArr3, 0, sArr2, length2, sArr3.length);
            length2 += sArr3.length;
        }
        return sArr2;
    }

    @GwtIncompatible
    public static byte[] toByteArray(short value) {
        return new byte[]{(byte) (value >> 8), (byte) value};
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        public static final ShortConverter INSTANCE = new ShortConverter();
        public static final long serialVersionUID = 1;

        @Override // com.google.common.base.Converter
        public Short doForward(String value) {
            return Short.decode(value);
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Short value) {
            return value.toString();
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    public static Converter<String, Short> stringConverter() {
        return ShortConverter.INSTANCE;
    }

    public static short[] ensureCapacity(short[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static String join(String separator, short... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 6);
        sb.append((int) array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append((int) array[i]);
        }
        return sb.toString();
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    /* loaded from: classes8.dex */
    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] left, short[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Shorts.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    public static void sortDescending(short[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(short[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(short[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(short[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            short s = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = s;
            fromIndex++;
        }
    }

    public static void rotate(short[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(short[] array, int distance, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i = toIndex - fromIndex;
        int i2 = (-distance) % i;
        if (i2 < 0) {
            i2 += i;
        }
        int i3 = i2 + fromIndex;
        if (i3 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i3);
        reverse(array, i3, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((Number) Preconditions.checkNotNull(array[i])).shortValue();
        }
        return sArr;
    }

    public static List<Short> asList(short... backingArray) {
        if (backingArray.length == 0) {
            return Collections.emptyList();
        }
        return new ShortArrayAsList(backingArray);
    }

    @GwtCompatible
    /* loaded from: classes8.dex */
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        public static final long serialVersionUID = 0;
        public final short[] array;
        public final int end;
        public final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public ShortArrayAsList(short[] array) {
            this(array, 0, array.length);
        }

        public ShortArrayAsList(short[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Short.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Short) && Shorts.indexOf(this.array, ((Short) target).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Short) || (iIndexOf = Shorts.indexOf(this.array, ((Short) target).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int iLastIndexOf;
            if (!(target instanceof Short) || (iLastIndexOf = Shorts.lastIndexOf(this.array, ((Short) target).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int index, Short element) {
            Preconditions.checkElementIndex(index, size());
            short[] sArr = this.array;
            int i = this.start;
            short s = sArr[i + index];
            sArr[i + index] = ((Short) Preconditions.checkNotNull(element)).shortValue();
            return Short.valueOf(s);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            short[] sArr = this.array;
            int i = this.start;
            return new ShortArrayAsList(sArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof ShortArrayAsList) {
                ShortArrayAsList shortArrayAsList = (ShortArrayAsList) object;
                int size = size();
                if (shortArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != shortArrayAsList.array[shortArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(object);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.start; i < this.end; i++) {
                iHashCode = (iHashCode * 31) + Shorts.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append((int) this.array[i]);
                } else {
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
            }
        }

        public short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
