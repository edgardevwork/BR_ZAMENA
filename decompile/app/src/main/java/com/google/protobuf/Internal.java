package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes7.dex */
public final class Internal {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Boolean> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        boolean setBoolean(int index, boolean element);
    }

    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Double> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        double setDouble(int index, double element);
    }

    /* loaded from: classes5.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: classes5.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int number);
    }

    /* loaded from: classes5.dex */
    public interface EnumVerifier {
        boolean isInRange(int number);
    }

    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Float> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        float setFloat(int index, float element);
    }

    public interface IntList extends ProtobufList<Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Integer> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        int setInt(int index, int element);
    }

    public interface LongList extends ProtobufList<Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Long> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        long setLong(int index, long element);
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<E> mutableCopyWithCapacity2(int capacity);
    }

    public static int hashBoolean(boolean b) {
        return b ? 1231 : 1237;
    }

    public static int hashLong(long n) {
        return (int) (n ^ (n >>> 32));
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    public static <T> T checkNotNull(T obj) {
        obj.getClass();
        return obj;
    }

    public static <T> T checkNotNull(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }

    public static String stringDefaultValue(String bytes) {
        return new String(bytes.getBytes(ISO_8859_1), UTF_8);
    }

    public static ByteString bytesDefaultValue(String bytes) {
        return ByteString.copyFrom(bytes.getBytes(ISO_8859_1));
    }

    public static byte[] byteArrayDefaultValue(String bytes) {
        return bytes.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String bytes) {
        return ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer source) {
        ByteBuffer byteBufferDuplicate = source.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return Utf8.isValidUtf8(byteArray);
    }

    public static byte[] toByteArray(String value) {
        return value.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bytes) {
        return new String(bytes, UTF_8);
    }

    public static int hashEnum(EnumLite e) {
        return e.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        Iterator<? extends EnumLite> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static boolean equals(List<byte[]> a2, List<byte[]> b) {
        if (a2.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!Arrays.equals(a2.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCode(byte[] bytes) {
        return hashCode(bytes, 0, bytes.length);
    }

    public static int hashCode(byte[] bytes, int offset, int length) {
        int iPartialHash = partialHash(length, bytes, offset, length);
        if (iPartialHash == 0) {
            return 1;
        }
        return iPartialHash;
    }

    public static int partialHash(int h, byte[] bytes, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            h = (h * 31) + bytes[i];
        }
        return h;
    }

    public static boolean equalsByteBuffer(ByteBuffer a2, ByteBuffer b) {
        if (a2.capacity() != b.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = a2.duplicate();
        Java8Compatibility.clear(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = b.duplicate();
        Java8Compatibility.clear(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> a2, List<ByteBuffer> b) {
        if (a2.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!equalsByteBuffer(a2.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashCodeByteBuffer(ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int iPartialHash = partialHash(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (iPartialHash == 0) {
                return 1;
            }
            return iPartialHash;
        }
        int iCapacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = bytes.duplicate();
        Java8Compatibility.clear(byteBufferDuplicate);
        int iCapacity2 = bytes.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = partialHash(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> clazz) throws NoSuchMethodException, SecurityException {
        try {
            java.lang.reflect.Method method = clazz.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + clazz, e);
        }
    }

    public static Object mergeMessage(Object destination, Object source) {
        return ((MessageLite) destination).toBuilder().mergeFrom((MessageLite) source).buildPartial();
    }

    /* loaded from: classes5.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        public final Converter<F, T> converter;
        public final List<F> fromList;

        public interface Converter<F, T> {
            T convert(F from);
        }

        public ListAdapter(List<F> fromList, Converter<F, T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.converter.convert(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: classes5.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        public final Map<K, RealValue> realMap;
        public final Converter<RealValue, V> valueConverter;

        public interface Converter<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        /* renamed from: com.google.protobuf.Internal$MapAdapter$1 */
        /* loaded from: classes7.dex */
        public class C79411<T> implements Converter<Integer, T> {
            public final /* synthetic */ EnumLite val$unrecognizedValue;

            public C79411(final EnumLite val$unrecognizedValue) {
                val$unrecognizedValue = val$unrecognizedValue;
            }

            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            public EnumLite doForward(Integer value) {
                EnumLite enumLiteFindValueByNumber = val$enumMap.findValueByNumber(value.intValue());
                return enumLiteFindValueByNumber == null ? val$unrecognizedValue : enumLiteFindValueByNumber;
            }

            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            public Integer doBackward(EnumLite value) {
                return Integer.valueOf(value.getNumber());
            }
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> enumMap, final T unrecognizedValue) {
            return new Converter<Integer, T>() { // from class: com.google.protobuf.Internal.MapAdapter.1
                public final /* synthetic */ EnumLite val$unrecognizedValue;

                public C79411(final EnumLite unrecognizedValue2) {
                    val$unrecognizedValue = unrecognizedValue2;
                }

                @Override // com.google.protobuf.Internal.MapAdapter.Converter
                public EnumLite doForward(Integer value) {
                    EnumLite enumLiteFindValueByNumber = val$enumMap.findValueByNumber(value.intValue());
                    return enumLiteFindValueByNumber == null ? val$unrecognizedValue : enumLiteFindValueByNumber;
                }

                @Override // com.google.protobuf.Internal.MapAdapter.Converter
                public Integer doBackward(EnumLite value) {
                    return Integer.valueOf(value.getNumber());
                }
            };
        }

        public MapAdapter(Map<K, RealValue> realMap, Converter<RealValue, V> valueConverter) {
            this.realMap = realMap;
            this.valueConverter = valueConverter;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.realMap.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Object objPut = this.realMap.put(k, this.valueConverter.doBackward(v));
            if (objPut == null) {
                return null;
            }
            return (V) this.valueConverter.doForward(objPut);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this.realMap.entrySet());
        }

        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            public final Set<Map.Entry<K, RealValue>> realSet;

            public SetAdapter(Set<Map.Entry<K, RealValue>> realSet) {
                this.realSet = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            public final Iterator<Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.realIterator = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.realIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }
        }

        public class EntryAdapter implements Map.Entry<K, V> {
            public final Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(Map.Entry<K, RealValue> realEntry) {
                this.realEntry = realEntry;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v) {
                Object value = this.realEntry.setValue(MapAdapter.this.valueConverter.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) MapAdapter.this.valueConverter.doForward(value);
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (o instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) o).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }
        }
    }
}
