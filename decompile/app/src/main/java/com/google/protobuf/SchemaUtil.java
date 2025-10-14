package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@CheckReturnValue
/* loaded from: classes7.dex */
public final class SchemaUtil {
    public static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    public static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    public static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    public static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    public static boolean shouldUseTableSwitch(int lo, int hi, int numFields) {
        if (hi < 40) {
            return true;
        }
        long j = hi - lo;
        long j2 = numFields;
        return j + 10 <= ((2 * j2) + 3) + ((j2 + 3) * 3);
    }

    public static void requireGeneratedMessage(Class<?> messageType) {
        Class<?> cls;
        if (!GeneratedMessageLite.class.isAssignableFrom(messageType) && (cls = GENERATED_MESSAGE_CLASS) != null && !cls.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static void writeDouble(int fieldNumber, double value, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeFloat(int fieldNumber, float value, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeFixed64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeFixed32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeEnum(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeBool(int fieldNumber, boolean value, Writer writer) throws IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writeStringInternal(fieldNumber, (String) value, writer);
        } else {
            writeBytes(fieldNumber, (ByteString) value, writer);
        }
    }

    public static void writeStringInternal(int fieldNumber, String value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeBytes(int fieldNumber, ByteString value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeMessage(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, List<Double> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeFloatList(int fieldNumber, List<Float> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeUInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    public static void writeSInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeFixed64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeSFixed64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeFixed32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeEnumList(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeBoolList(int fieldNumber, List<Boolean> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeStringList(int fieldNumber, List<String> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, List<ByteString> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeMessageList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeMessageList(int fieldNumber, List<?> value, Writer writer, Schema schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value, schema);
    }

    public static void writeLazyFieldList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, fieldNumber);
        }
    }

    public static void writeGroupList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeGroupList(int fieldNumber, List<?> value, Writer writer, Schema schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    public static int computeSizeInt64List(int fieldNumber, List<Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag);
        }
        return iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    public static int computeSizeUInt64List(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag);
        }
        return iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    public static int computeSizeSInt64List(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag);
        }
        return iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    public static int computeSizeEnumList(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag);
        }
        return iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    public static int computeSizeInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag);
        }
        return iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    public static int computeSizeUInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag);
        }
        return iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    public static int computeSizeSInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag);
        }
        return iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed32List(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(fieldNumber, 0);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeFixed64List(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(fieldNumber, 0L);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeBoolList(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * CodedOutputStream.computeBoolSize(fieldNumber, true);
    }

    public static int computeSizeStringList(int fieldNumber, List<?> list) {
        int iComputeStringSizeNoTag;
        int iComputeStringSizeNoTag2;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i < size) {
                Object raw = lazyStringList.getRaw(i);
                if (raw instanceof ByteString) {
                    iComputeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    iComputeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                iComputeTagSize += iComputeStringSizeNoTag2;
                i++;
            }
        } else {
            while (i < size) {
                Object obj = list.get(i);
                if (obj instanceof ByteString) {
                    iComputeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                } else {
                    iComputeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                }
                iComputeTagSize += iComputeStringSizeNoTag;
                i++;
            }
        }
        return iComputeTagSize;
    }

    public static int computeSizeMessage(int fieldNumber, Object value, Schema schema) {
        if (value instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(fieldNumber, (LazyFieldLite) value);
        }
        return CodedOutputStream.computeMessageSize(fieldNumber, (MessageLite) value, schema);
    }

    public static int computeSizeMessageList(int fieldNumber, List<?> list) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    public static int computeSizeMessageList(int fieldNumber, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    public static int computeSizeByteStringList(int fieldNumber, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(fieldNumber);
        for (int i = 0; i < list.size(); i++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i));
        }
        return iComputeTagSize;
    }

    public static int computeSizeGroupList(int fieldNumber, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i = 0; i < size; i++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(fieldNumber, list.get(i));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeGroupList(int fieldNumber, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i = 0; i < size; i++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(fieldNumber, list.get(i), schema);
        }
        return iComputeGroupSize;
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> clazz, String name) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(clazz.getName() + "$" + toCamelCase(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length != 1) {
                throw new IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
            }
            return UnsafeUtil.getStaticObject(declaredFields[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static String toCamelCase(String name, boolean capNext) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char cCharAt = name.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    capNext = true;
                } else if (i == 0 && !capNext) {
                    sb.append((char) (cCharAt + ' '));
                } else {
                    sb.append(cCharAt);
                }
            } else if (capNext) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            capNext = false;
        }
        return sb.toString();
    }

    public static boolean safeEquals(Object a2, Object b) {
        return a2 == b || (a2 != null && a2.equals(b));
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T message, T o, long offset) {
        UnsafeUtil.putObject(message, offset, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(o, offset)));
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> schema, T message, T other) {
        FieldSet<T> extensions = schema.getExtensions(other);
        if (extensions.isEmpty()) {
            return;
        }
        schema.getMutableExtensions(message).mergeFrom(extensions);
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> schema, T message, T other) {
        schema.setToMessage(message, schema.merge(schema.getFromMessage(message), schema.getFromMessage(other)));
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(iIntValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i, i2);
        return ub;
    }
}
