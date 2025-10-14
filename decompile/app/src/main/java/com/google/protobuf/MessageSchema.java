package com.google.protobuf;

import com.caverock.androidsvg.SVG;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes7.dex */
public final class MessageSchema<T> implements Schema<T> {
    public static final int CHECK_INITIALIZED_BIT = 1024;
    public static final int ENFORCE_UTF8_MASK = 536870912;
    public static final int FIELD_TYPE_MASK = 267386880;
    public static final int HAS_HAS_BIT = 4096;
    public static final int INTS_PER_FIELD = 3;
    public static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    public static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    public static final int NO_PRESENCE_SENTINEL = 1048575;
    public static final int OFFSET_BITS = 20;
    public static final int OFFSET_MASK = 1048575;
    public static final int ONEOF_TYPE_OFFSET = 51;
    public static final int REQUIRED_BIT = 256;
    public static final int REQUIRED_MASK = 268435456;
    public static final int UTF8_CHECK_BIT = 512;
    public final int[] buffer;
    public final int checkInitializedCount;
    public final MessageLite defaultInstance;
    public final ExtensionSchema<?> extensionSchema;
    public final boolean hasExtensions;
    public final int[] intArray;
    public final ListFieldSchema listFieldSchema;
    public final boolean lite;
    public final MapFieldSchema mapFieldSchema;
    public final int maxFieldNumber;
    public final int minFieldNumber;
    public final NewInstanceSchema newInstanceSchema;
    public final Object[] objects;
    public final int repeatedFieldOffsetStart;
    public final ProtoSyntax syntax;
    public final UnknownFieldSchema<?, ?> unknownFieldSchema;
    public final boolean useCachedSizeField;
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    public static boolean isEnforceUtf8(int value) {
        return (value & 536870912) != 0;
    }

    public static boolean isLegacyEnumIsClosed(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    public static boolean isRequired(int value) {
        return (value & 268435456) != 0;
    }

    public static long offset(int value) {
        return value & 1048575;
    }

    public static int type(int value) {
        return (value & 267386880) >>> 20;
    }

    public MessageSchema(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, MessageLite defaultInstance, ProtoSyntax syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = buffer;
        this.objects = objects;
        this.minFieldNumber = minFieldNumber;
        this.maxFieldNumber = maxFieldNumber;
        this.lite = defaultInstance instanceof GeneratedMessageLite;
        this.syntax = syntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(defaultInstance);
        this.useCachedSizeField = useCachedSizeField;
        this.intArray = intArray;
        this.checkInitializedCount = checkInitialized;
        this.repeatedFieldOffsetStart = mapFieldPositions;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
        this.mapFieldSchema = mapFieldSchema;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> messageClass, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:339:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        String str;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        java.lang.reflect.Field fieldReflectField;
        int i22;
        char cCharAt9;
        int i23;
        int i24;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String stringInfo = messageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (stringInfo.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt3 = stringInfo.charAt(i);
        if (iCharAt3 >= 55296) {
            int i31 = iCharAt3 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = stringInfo.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt3 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt4 = stringInfo.charAt(i30);
            if (iCharAt4 >= 55296) {
                int i34 = iCharAt4 & 8191;
                int i35 = 13;
                while (true) {
                    i14 = i33 + 1;
                    cCharAt8 = stringInfo.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i14;
                }
                iCharAt4 = i34 | (cCharAt8 << i35);
                i33 = i14;
            }
            int i36 = i33 + 1;
            int iCharAt5 = stringInfo.charAt(i33);
            if (iCharAt5 >= 55296) {
                int i37 = iCharAt5 & 8191;
                int i38 = 13;
                while (true) {
                    i13 = i36 + 1;
                    cCharAt7 = stringInfo.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i13;
                }
                iCharAt5 = i37 | (cCharAt7 << i38);
                i36 = i13;
            }
            int i39 = i36 + 1;
            int iCharAt6 = stringInfo.charAt(i36);
            if (iCharAt6 >= 55296) {
                int i40 = iCharAt6 & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    cCharAt6 = stringInfo.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                iCharAt6 = i40 | (cCharAt6 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int iCharAt7 = stringInfo.charAt(i39);
            if (iCharAt7 >= 55296) {
                int i43 = iCharAt7 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    cCharAt5 = stringInfo.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                iCharAt7 = i43 | (cCharAt5 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            iCharAt = stringInfo.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i10 = i45 + 1;
                    cCharAt4 = stringInfo.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i10;
                }
                iCharAt = i46 | (cCharAt4 << i47);
                i45 = i10;
            }
            int i48 = i45 + 1;
            iCharAt2 = stringInfo.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i9 = i48 + 1;
                    cCharAt3 = stringInfo.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i9;
                }
                iCharAt2 = i49 | (cCharAt3 << i50);
                i48 = i9;
            }
            int i51 = i48 + 1;
            int iCharAt8 = stringInfo.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i8 = i51 + 1;
                    cCharAt2 = stringInfo.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i8;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i8;
            }
            int i54 = i51 + 1;
            int iCharAt9 = stringInfo.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i7 = i54 + 1;
                    cCharAt = stringInfo.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i54 = i7;
                }
                iCharAt9 = i55 | (cCharAt << i56);
                i54 = i7;
            }
            i2 = (iCharAt4 * 2) + iCharAt5;
            i3 = iCharAt4;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i4 = iCharAt9;
            i30 = i54;
            i5 = iCharAt6;
            i6 = iCharAt7;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = messageInfo.getObjects();
        Class<?> cls = messageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i57 = i4 + iCharAt2;
        int i58 = i4;
        int i59 = i57;
        int i60 = 0;
        int i61 = 0;
        while (i30 < length) {
            int i62 = i30 + 1;
            int iCharAt10 = stringInfo.charAt(i30);
            if (iCharAt10 >= c) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i27 = i64 + 1;
                    cCharAt12 = stringInfo.charAt(i64);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i27;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i15 = i27;
            } else {
                i15 = i62;
            }
            int i66 = i15 + 1;
            int iCharAt11 = stringInfo.charAt(i15);
            if (iCharAt11 >= c) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    cCharAt11 = stringInfo.charAt(i68);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i67 |= (cCharAt11 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                }
                iCharAt11 = i67 | (cCharAt11 << i69);
                i16 = i26;
            } else {
                i16 = i66;
            }
            int i70 = iCharAt11 & 255;
            int i71 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i72 = i60;
            if (i70 >= 51) {
                int i73 = i16 + 1;
                int iCharAt12 = stringInfo.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i74 = iCharAt12 & 8191;
                    int i75 = 13;
                    while (true) {
                        i25 = i73 + 1;
                        cCharAt10 = stringInfo.charAt(i73);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i74 |= (cCharAt10 & 8191) << i75;
                        i75 += 13;
                        i73 = i25;
                        c2 = 55296;
                    }
                    iCharAt12 = i74 | (cCharAt10 << i75);
                    i73 = i25;
                }
                int i76 = i70 - 51;
                int i77 = i73;
                if (i76 == 9 || i76 == 17) {
                    i24 = i2 + 1;
                    objArr[((i61 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i76 == 12 && (messageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i24 = i2 + 1;
                        objArr[((i61 / 3) * 2) + 1] = objects[i2];
                    }
                    int i78 = iCharAt12 * 2;
                    obj = objects[i78];
                    if (!(obj instanceof java.lang.reflect.Field)) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i78] = fieldReflectField2;
                    }
                    i17 = i5;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    int i79 = i78 + 1;
                    obj2 = objects[i79];
                    if (!(obj2 instanceof java.lang.reflect.Field)) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i79] = fieldReflectField3;
                    }
                    i18 = i6;
                    i19 = i2;
                    i20 = i77;
                    str = stringInfo;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i21 = 0;
                }
                i2 = i24;
                int i782 = iCharAt12 * 2;
                obj = objects[i782];
                if (!(obj instanceof java.lang.reflect.Field)) {
                }
                i17 = i5;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i792 = i782 + 1;
                obj2 = objects[i792];
                if (!(obj2 instanceof java.lang.reflect.Field)) {
                }
                i18 = i6;
                i19 = i2;
                i20 = i77;
                str = stringInfo;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i21 = 0;
            } else {
                i17 = i5;
                int i80 = i2 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i2]);
                if (i70 == 9 || i70 == 17) {
                    i18 = i6;
                    objArr[((i61 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        i18 = i6;
                        i23 = i2 + 2;
                        objArr[((i61 / 3) * 2) + 1] = objects[i80];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        i18 = i6;
                        if (messageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i23 = i2 + 2;
                            objArr[((i61 / 3) * 2) + 1] = objects[i80];
                        }
                    } else {
                        if (i70 == 50) {
                            int i81 = i58 + 1;
                            iArr[i58] = i61;
                            int i82 = (i61 / 3) * 2;
                            int i83 = i2 + 2;
                            objArr[i82] = objects[i80];
                            if ((iCharAt11 & 2048) != 0) {
                                i80 = i2 + 3;
                                objArr[i82 + 1] = objects[i83];
                                i58 = i81;
                            } else {
                                i58 = i81;
                                i80 = i83;
                            }
                        }
                        i18 = i6;
                    }
                    i80 = i23;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) == 0 || i70 > 17) {
                    str = stringInfo;
                    i19 = i80;
                    iObjectFieldOffset = 1048575;
                    i20 = i16;
                    i21 = 0;
                } else {
                    i20 = i16 + 1;
                    int iCharAt13 = stringInfo.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i84 = iCharAt13 & 8191;
                        int i85 = 13;
                        while (true) {
                            i22 = i20 + 1;
                            cCharAt9 = stringInfo.charAt(i20);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i84 |= (cCharAt9 & 8191) << i85;
                            i85 += 13;
                            i20 = i22;
                        }
                        iCharAt13 = i84 | (cCharAt9 << i85);
                        i20 = i22;
                    }
                    int i86 = (i3 * 2) + (iCharAt13 / 32);
                    Object obj3 = objects[i86];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        fieldReflectField = (java.lang.reflect.Field) obj3;
                    } else {
                        fieldReflectField = reflectField(cls, (String) obj3);
                        objects[i86] = fieldReflectField;
                    }
                    str = stringInfo;
                    i19 = i80;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField);
                    i21 = iCharAt13 % 32;
                }
                if (i70 >= 18 && i70 <= 49) {
                    iArr[i59] = iObjectFieldOffset3;
                    i59++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i87 = i61 + 1;
            iArr2[i61] = iCharAt10;
            int i88 = i61 + 2;
            int i89 = i3;
            iArr2[i87] = iObjectFieldOffset2 | (i70 << 20) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0);
            i61 += 3;
            iArr2[i88] = iObjectFieldOffset | (i21 << 20);
            i30 = i20;
            stringInfo = str;
            i2 = i19;
            length = i71;
            i6 = i18;
            i60 = i72;
            i3 = i89;
            i5 = i17;
            c = 55296;
        }
        return new MessageSchema<>(iArr2, objArr, i5, i6, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), false, iArr, i4, i57, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static java.lang.reflect.Field reflectField(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = messageClass.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + fieldName + " for " + messageClass.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        FieldInfo[] fields = messageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().m1397id() >= 18 && fieldInfo.getType().m1397id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else {
                if (fieldInfo2.getType().m1397id() >= 18 && fieldInfo2.getType().m1397id() <= 49) {
                    i = i5;
                    iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i8++;
                }
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void storeFieldData(FieldInfo fi, int[] buffer, int bufferIndex, Object[] objects) {
        int iObjectFieldOffset;
        int iM1397id;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        OneofInfo oneof = fi.getOneof();
        if (oneof != null) {
            iM1397id = fi.getType().m1397id() + 51;
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
            jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        } else {
            FieldType type = fi.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fi.getField());
            iM1397id = type.m1397id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fi.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fi.getPresenceMask());
            } else if (fi.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fi.getCachedSizeField());
            }
            buffer[bufferIndex] = fi.getFieldNumber();
            buffer[bufferIndex + 1] = (fi.isRequired() ? 268435456 : 0) | (!fi.isEnforceUtf8() ? 536870912 : 0) | (iM1397id << 20) | iObjectFieldOffset;
            buffer[bufferIndex + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            Class<?> messageFieldClass = fi.getMessageFieldClass();
            if (fi.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objects[((bufferIndex / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fi.getEnumVerifier() != null) {
                        objects[((bufferIndex / 3) * 2) + 1] = fi.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            int i = (bufferIndex / 3) * 2;
            objects[i] = fi.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objects[i + 1] = messageFieldClass;
                return;
            } else {
                if (fi.getEnumVerifier() != null) {
                    objects[i + 1] = fi.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        buffer[bufferIndex] = fi.getFieldNumber();
        if (!fi.isEnforceUtf8()) {
        }
        buffer[bufferIndex + 1] = (fi.isRequired() ? 268435456 : 0) | (!fi.isEnforceUtf8() ? 536870912 : 0) | (iM1397id << 20) | iObjectFieldOffset;
        buffer[bufferIndex + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        Class<?> messageFieldClass2 = fi.getMessageFieldClass();
        if (fi.getMapDefaultEntry() != null) {
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T message, T other) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(message, other, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    public final boolean equals(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(message, other, pos) && Double.doubleToLongBits(UnsafeUtil.getDouble(message, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(other, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(message, other, pos) && Float.floatToIntBits(UnsafeUtil.getFloat(message, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(other, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getBoolean(message, jOffset) == UnsafeUtil.getBoolean(other, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (isOneofCaseEqual(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T message) {
        int i;
        int iHashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(message, jOffset)));
                    i2 = i + iHashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getInt(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getInt(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(message, jOffset)).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(message, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getInt(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getInt(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getInt(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getInt(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(message, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(message, jOffset)));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(message, jOffset)).hashCode();
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(message).hashCode() : iHashCode2;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(message, other, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    public final void mergeSingleField(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(pos);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putDouble(message, jOffset, UnsafeUtil.getDouble(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putFloat(message, jOffset, UnsafeUtil.getFloat(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putBoolean(message, jOffset, UnsafeUtil.getBoolean(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 17:
                mergeMessage(message, other, pos);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(message, other, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, message, other, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(message, other, pos);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isFieldPresent(targetParent, pos)) {
                if (!isMutable(object)) {
                    unsafe.putObject(targetParent, jOffset, object);
                } else {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                }
                setFieldPresent(targetParent, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mergeOneofMessage(T targetParent, T sourceParent, int pos) {
        int iNumberAt = numberAt(pos);
        if (isOneofPresent(sourceParent, iNumberAt, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isOneofPresent(targetParent, iNumberAt, pos)) {
                if (!isMutable(object)) {
                    unsafe.putObject(targetParent, jOffset, object);
                } else {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                }
                setOneofPresent(targetParent, iNumberAt, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T message) {
        int i;
        int i2;
        int i3;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z;
        int iComputeSizeFixed32List;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i7);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i7);
            int i9 = this.buffer[i7 + 2];
            int i10 = i9 & i4;
            if (iType <= 17) {
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(message, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.m1397id() || iType > FieldType.SINT64_LIST_PACKED.m1397id()) {
                i10 = 0;
            }
            switch (iType) {
                case 0:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i8 += iComputeDoubleSize;
                        break;
                    }
                case 1:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i8 += iComputeDoubleSize;
                        break;
                    }
                case 2:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeDoubleSize;
                        break;
                    }
                case 3:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeDoubleSize;
                        break;
                    }
                case 4:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeDoubleSize;
                        break;
                    }
                case 5:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i8 += iComputeDoubleSize;
                        break;
                    }
                case 6:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i8 += iComputeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(message, jOffset);
                        if (object instanceof ByteString) {
                            iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object);
                        } else {
                            iComputeBoolSize = CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        }
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeBoolSize;
                    break;
                case 19:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 20:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 21:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 22:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 23:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 24:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 25:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 26:
                    iComputeBoolSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(message, jOffset));
                    i8 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(message, jOffset));
                    i8 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeBoolSize;
                    break;
                case 30:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 31:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 32:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 33:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 34:
                    z = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeSizeFixed32List;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(message, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(message, jOffset), getMapFieldDefaultEntry(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        Object object2 = unsafe.getObject(message, jOffset);
                        if (object2 instanceof ByteString) {
                            iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2);
                        } else {
                            iComputeBoolSize = CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        }
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i8 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, message);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(message).getSerializedSize() : unknownFieldsSerializedSize;
    }

    public final <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSize(schema.getFromMessage(message));
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T message, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeFieldsInAscendingOrder(T message, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i;
        Map.Entry<?, ?> entry2;
        int i2;
        int i3;
        Map.Entry<?, ?> entry3;
        boolean z;
        Map.Entry<?, ?> entry4;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(message);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i7);
            int iNumberAt = numberAt(i7);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i8 = this.buffer[i7 + 2];
                int i9 = i8 & i4;
                if (i9 != i5) {
                    if (i9 == i4) {
                        entry4 = entry;
                        i6 = 0;
                    } else {
                        entry4 = entry;
                        i6 = unsafe.getInt(message, i9);
                    }
                    i5 = i9;
                } else {
                    entry4 = entry;
                }
                int i10 = 1 << (i8 >>> 20);
                i = i5;
                i2 = i10;
                entry2 = entry4;
            } else {
                i = i5;
                entry2 = entry;
                i2 = 0;
            }
            int i11 = i6;
            while (entry2 != null && this.extensionSchema.extensionNumber(entry2) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeDouble(iNumberAt, doubleAt(message, jOffset));
                        break;
                    }
                case 1:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeFloat(iNumberAt, floatAt(message, jOffset));
                        break;
                    }
                case 2:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeInt64(iNumberAt, unsafe.getLong(message, jOffset));
                        break;
                    }
                case 3:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(message, jOffset));
                        break;
                    }
                case 4:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeInt32(iNumberAt, unsafe.getInt(message, jOffset));
                        break;
                    }
                case 5:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(message, jOffset));
                        break;
                    }
                case 6:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(message, jOffset));
                        break;
                    }
                case 7:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeBool(iNumberAt, booleanAt(message, jOffset));
                        break;
                    }
                case 8:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writeString(iNumberAt, unsafe.getObject(message, jOffset), writer);
                        break;
                    }
                case 9:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeMessage(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        break;
                    }
                case 10:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(message, jOffset));
                        break;
                    }
                case 11:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(message, jOffset));
                        break;
                    }
                case 12:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeEnum(iNumberAt, unsafe.getInt(message, jOffset));
                        break;
                    }
                case 13:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(message, jOffset));
                        break;
                    }
                case 14:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(message, jOffset));
                        break;
                    }
                case 15:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(message, jOffset));
                        break;
                    }
                case 16:
                    i3 = length;
                    entry3 = entry2;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(message, jOffset));
                        break;
                    }
                case 17:
                    entry3 = entry2;
                    i3 = length;
                    if (!isFieldPresent(message, i7, i, i11, i2)) {
                        break;
                    } else {
                        writer.writeGroup(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        break;
                    }
                case 18:
                    z = false;
                    SchemaUtil.writeDoubleList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 19:
                    z = false;
                    SchemaUtil.writeFloatList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 20:
                    z = false;
                    SchemaUtil.writeInt64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 21:
                    z = false;
                    SchemaUtil.writeUInt64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 22:
                    z = false;
                    SchemaUtil.writeInt32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 23:
                    z = false;
                    SchemaUtil.writeFixed64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 24:
                    z = false;
                    SchemaUtil.writeFixed32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 25:
                    z = false;
                    SchemaUtil.writeBoolList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, getMessageFieldSchema(i7));
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 29:
                    z = false;
                    SchemaUtil.writeUInt32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 30:
                    z = false;
                    SchemaUtil.writeEnumList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 31:
                    z = false;
                    SchemaUtil.writeSFixed32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 32:
                    z = false;
                    SchemaUtil.writeSFixed64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 33:
                    z = false;
                    SchemaUtil.writeSInt32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 34:
                    z = false;
                    SchemaUtil.writeSInt64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, false);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, true);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(i7), (List) unsafe.getObject(message, jOffset), writer, getMessageFieldSchema(i7));
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(message, jOffset), i7);
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writeString(iNumberAt, unsafe.getObject(message, jOffset), writer);
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 62:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 63:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 65:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 66:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    }
                    i3 = length;
                    entry3 = entry2;
                    break;
                default:
                    i3 = length;
                    entry3 = entry2;
                    break;
            }
            i7 += 3;
            i5 = i;
            entry = entry3;
            i6 = i11;
            length = i3;
            i4 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, message, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:296:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeFieldsInDescendingOrder(T message, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, message, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(message);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(message, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(message, length)) {
                        writer.writeFloat(iNumberAt, floatAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(message, length)) {
                        writer.writeInt64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(message, length)) {
                        writer.writeUInt64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(message, length)) {
                        writer.writeInt32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(message, length)) {
                        writer.writeFixed64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(message, length)) {
                        writer.writeFixed32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(message, length)) {
                        writer.writeBool(iNumberAt, booleanAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(message, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(message, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(message, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(message, length)) {
                        writer.writeUInt32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(message, length)) {
                        writer.writeEnum(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(message, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(message, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(message, length)) {
                        writer.writeSInt32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(message, length)) {
                        writer.writeSInt64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(message, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    public final <K, V> void writeMapHelper(Writer writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.writeMap(number, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(pos)), this.mapFieldSchema.forMapData(mapField));
        }
    }

    public final <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> schema, T message, Writer writer) throws IOException {
        schema.writeTo(schema.getFromMessage(message), writer);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, Reader reader, ExtensionRegistryLite extensionRegistry) throws Throwable {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0093, code lost:
    
        r0 = r18.checkInitializedCount;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0098, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x009a, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x00b0, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x00b1, code lost:
    
        if (r4 == null) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x00b3, code lost:
    
        r7.setBuilderToMessage(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:414:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #0 {all -> 0x0671, blocks: (B:412:0x0645, B:414:0x064b, B:426:0x0675, B:427:0x067a), top: B:448:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x06b1 A[LOOP:4: B:440:0x06ad->B:442:0x06b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x06c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T message, Reader reader, ExtensionRegistryLite extensionRegistry) throws Throwable {
        T t;
        UnknownFieldSchema unknownFieldSchema2;
        int i;
        Object objFilterMapUnknownEnumValues;
        T t2;
        ExtensionRegistryLite extensionRegistryLite;
        Object obj;
        UnknownFieldSchema unknownFieldSchema3 = unknownFieldSchema;
        T t3 = message;
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistry;
        Object builderFromMessage = null;
        Object obj2 = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    t = t3;
                    try {
                        int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                        switch (type(iTypeAndOffsetAt)) {
                            case 0:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putDouble(t, offset(iTypeAndOffsetAt), reader.readDouble());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 1:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putFloat(t, offset(iTypeAndOffsetAt), reader.readFloat());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 2:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(t, offset(iTypeAndOffsetAt), reader.readInt64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 3:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(t, offset(iTypeAndOffsetAt), reader.readUInt64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 4:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(t, offset(iTypeAndOffsetAt), reader.readInt32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 5:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(t, offset(iTypeAndOffsetAt), reader.readFixed64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 6:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(t, offset(iTypeAndOffsetAt), reader.readFixed32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 7:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putBoolean(t, offset(iTypeAndOffsetAt), reader.readBool());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 8:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readString(t, iTypeAndOffsetAt, reader);
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 9:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                MessageLite messageLite = (MessageLite) mutableMessageFieldForMerge(t, iPositionForFieldNumber);
                                reader.mergeMessageField(messageLite, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                storeMessageField(t, iPositionForFieldNumber, messageLite);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 10:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), reader.readBytes());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 11:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(t, offset(iTypeAndOffsetAt), reader.readUInt32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 12:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                int i2 = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i2)) {
                                    builderFromMessage = SchemaUtil.storeUnknownEnum(t, fieldNumber, i2, obj, unknownFieldSchema2);
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                }
                                UnsafeUtil.putInt(t, offset(iTypeAndOffsetAt), i2);
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 13:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(t, offset(iTypeAndOffsetAt), reader.readSFixed32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 14:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(t, offset(iTypeAndOffsetAt), reader.readSFixed64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 15:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(t, offset(iTypeAndOffsetAt), reader.readSInt32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 16:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(t, offset(iTypeAndOffsetAt), reader.readSInt64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 17:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                MessageLite messageLite2 = (MessageLite) mutableMessageFieldForMerge(t, iPositionForFieldNumber);
                                reader.mergeGroupField(messageLite2, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                storeMessageField(t, iPositionForFieldNumber, messageLite2);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 18:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 19:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 20:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 21:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 22:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 23:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 24:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 25:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 26:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readStringList(t, iTypeAndOffsetAt, reader);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 27:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readMessageList(message, iTypeAndOffsetAt, reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistry);
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 28:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBytesList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 29:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 30:
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt));
                                reader.readEnumList(listMutableListAt);
                                builderFromMessage = SchemaUtil.filterUnknownEnumList(message, fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, unknownFieldSchema);
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 31:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 32:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 33:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 34:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 35:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 36:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 37:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 38:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 39:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 40:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 41:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 42:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 43:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 44:
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt));
                                reader.readEnumList(listMutableListAt2);
                                builderFromMessage = SchemaUtil.filterUnknownEnumList(message, fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, unknownFieldSchema);
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 45:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 46:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 47:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 48:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 49:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                try {
                                    readGroupList(message, offset(iTypeAndOffsetAt), reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistry);
                                    builderFromMessage = obj;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    builderFromMessage = obj;
                                    try {
                                        if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                        extensionRegistryLite2 = extensionRegistryLite;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t3 = t;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    builderFromMessage = obj;
                                    objFilterMapUnknownEnumValues = builderFromMessage;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 50:
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                try {
                                    mergeMap(message, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistry, reader);
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        if (builderFromMessage == null) {
                                            builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t);
                                        }
                                        if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                            Object objFilterMapUnknownEnumValues2 = builderFromMessage;
                                            for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                                objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(message, this.intArray[i3], objFilterMapUnknownEnumValues2, unknownFieldSchema, message);
                                            }
                                            if (objFilterMapUnknownEnumValues2 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t, objFilterMapUnknownEnumValues2);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if (!reader.skipField()) {
                                        Object objFilterMapUnknownEnumValues3 = builderFromMessage;
                                        for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                                            objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(message, this.intArray[i4], objFilterMapUnknownEnumValues3, unknownFieldSchema, message);
                                        }
                                        if (objFilterMapUnknownEnumValues3 != null) {
                                            unknownFieldSchema2.setBuilderToMessage(t, objFilterMapUnknownEnumValues3);
                                            return;
                                        }
                                        return;
                                    }
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                } catch (Throwable th3) {
                                    th = th3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    objFilterMapUnknownEnumValues = builderFromMessage;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 51:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Double.valueOf(reader.readDouble()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 52:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Float.valueOf(reader.readFloat()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 53:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Long.valueOf(reader.readInt64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 54:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Long.valueOf(reader.readUInt64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 55:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readInt32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 56:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Long.valueOf(reader.readFixed64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 57:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readFixed32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 58:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Boolean.valueOf(reader.readBool()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 59:
                                readString(t, iTypeAndOffsetAt, reader);
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 60:
                                MessageLite messageLite3 = (MessageLite) mutableOneofMessageFieldForMerge(t, fieldNumber, iPositionForFieldNumber);
                                reader.mergeMessageField(messageLite3, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                storeOneofMessageField(t, fieldNumber, iPositionForFieldNumber, messageLite3);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 61:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), reader.readBytes());
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 62:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readUInt32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 63:
                                int i5 = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(i5)) {
                                    builderFromMessage = SchemaUtil.storeUnknownEnum(t, fieldNumber, i5, builderFromMessage, unknownFieldSchema3);
                                    extensionRegistryLite = extensionRegistryLite2;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                }
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Integer.valueOf(i5));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 64:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readSFixed32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 65:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Long.valueOf(reader.readSFixed64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 66:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readSInt32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 67:
                                UnsafeUtil.putObject(t, offset(iTypeAndOffsetAt), Long.valueOf(reader.readSInt64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            case 68:
                                MessageLite messageLite4 = (MessageLite) mutableOneofMessageFieldForMerge(t, fieldNumber, iPositionForFieldNumber);
                                reader.mergeGroupField(messageLite4, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                storeOneofMessageField(t, fieldNumber, iPositionForFieldNumber, messageLite4);
                                obj = builderFromMessage;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                builderFromMessage = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                            default:
                                if (builderFromMessage == null) {
                                    try {
                                        builderFromMessage = unknownFieldSchema3.getBuilderFromMessage(t);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        extensionRegistryLite = extensionRegistryLite2;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                        extensionRegistryLite2 = extensionRegistryLite;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t3 = t;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        while (i < this.repeatedFieldOffsetStart) {
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                    Object objFilterMapUnknownEnumValues4 = builderFromMessage;
                                    for (int i6 = this.checkInitializedCount; i6 < this.repeatedFieldOffsetStart; i6++) {
                                        objFilterMapUnknownEnumValues4 = filterMapUnknownEnumValues(message, this.intArray[i6], objFilterMapUnknownEnumValues4, unknownFieldSchema, message);
                                    }
                                    if (objFilterMapUnknownEnumValues4 != null) {
                                        unknownFieldSchema3.setBuilderToMessage(t, objFilterMapUnknownEnumValues4);
                                        return;
                                    }
                                    return;
                                }
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objFilterMapUnknownEnumValues5 = builderFromMessage;
                        for (int i7 = this.checkInitializedCount; i7 < this.repeatedFieldOffsetStart; i7++) {
                            objFilterMapUnknownEnumValues5 = filterMapUnknownEnumValues(message, this.intArray[i7], objFilterMapUnknownEnumValues5, unknownFieldSchema, message);
                        }
                        if (objFilterMapUnknownEnumValues5 != null) {
                            unknownFieldSchema3.setBuilderToMessage(t3, objFilterMapUnknownEnumValues5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objFindExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite2, this.defaultInstance, fieldNumber);
                        if (objFindExtensionByNumber != null) {
                            Object mutableExtensions = obj2 == null ? extensionSchema.getMutableExtensions(message) : obj2;
                            t2 = t3;
                            try {
                                builderFromMessage = extensionSchema.parseExtension(message, reader, objFindExtensionByNumber, extensionRegistry, mutableExtensions, builderFromMessage, unknownFieldSchema);
                                obj2 = mutableExtensions;
                            } catch (Throwable th6) {
                                th = th6;
                                t = t2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                objFilterMapUnknownEnumValues = builderFromMessage;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                }
                                throw th;
                            }
                        } else {
                            t2 = t3;
                            if (!unknownFieldSchema3.shouldDiscardUnknownFields(reader)) {
                                if (builderFromMessage == null) {
                                    builderFromMessage = unknownFieldSchema3.getBuilderFromMessage(t2);
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                }
                            } else if (!reader.skipField()) {
                            }
                        }
                        t3 = t2;
                    } catch (Throwable th7) {
                        th = th7;
                        t = t3;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        objFilterMapUnknownEnumValues = builderFromMessage;
                        while (i < this.repeatedFieldOffsetStart) {
                        }
                        if (objFilterMapUnknownEnumValues != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
            objFilterMapUnknownEnumValues = builderFromMessage;
            for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(message, this.intArray[i], objFilterMapUnknownEnumValues, unknownFieldSchema, message);
            }
            if (objFilterMapUnknownEnumValues != null) {
                unknownFieldSchema2.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
            }
            throw th;
        }
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object message) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    /* renamed from: com.google.protobuf.MessageSchema$1 */
    public static /* synthetic */ class C79481 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public final int decodeMapEntryValue(byte[] data, int position, int limit, WireFormat.FieldType fieldType, Class<?> messageType, ArrayDecoders.Registers registers) throws IOException {
        switch (C79481.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(data, position, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(data, position));
                return position + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) messageType), data, position, limit, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    public final <K, V> int decodeMapEntry(byte[] data, int position, int limit, MapEntryLite.Metadata<K, V> metadata, Map<K, V> target, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0 || i > limit - iDecodeVarint322) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i2 = iDecodeVarint322 + i;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint322 < i2) {
            int i3 = iDecodeVarint322 + 1;
            byte b = data[iDecodeVarint322];
            if (b < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(b, data, i3, registers);
                b = registers.int1;
            } else {
                iDecodeVarint32 = i3;
            }
            int i4 = b >>> 3;
            int i5 = b & 7;
            if (i4 == 1) {
                if (i5 == metadata.keyType.getWireType()) {
                    iDecodeVarint322 = decodeMapEntryValue(data, iDecodeVarint32, limit, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    iDecodeVarint322 = ArrayDecoders.skipField(b, data, iDecodeVarint32, limit, registers);
                }
            } else if (i4 == 2 && i5 == metadata.valueType.getWireType()) {
                iDecodeVarint322 = decodeMapEntryValue(data, iDecodeVarint32, limit, metadata.valueType, metadata.defaultValue.getClass(), registers);
                obj2 = registers.object1;
            } else {
                iDecodeVarint322 = ArrayDecoders.skipField(b, data, iDecodeVarint32, limit, registers);
            }
        }
        if (iDecodeVarint322 != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        target.put(obj, obj2);
        return i2;
    }

    public final int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(message, fieldOffset);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, protobufListMutableCopyWithCapacity2);
        }
        switch (fieldType) {
            case 18:
            case 35:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedDoubleList(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 1) {
                    return ArrayDecoders.decodeDoubleList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 19:
            case 36:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFloatList(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 5) {
                    return ArrayDecoders.decodeFloatList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedVarint64List(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeVarint64List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedVarint32List(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFixed64List(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 1) {
                    return ArrayDecoders.decodeFixed64List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFixed32List(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 5) {
                    return ArrayDecoders.decodeFixed32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 25:
            case 42:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedBoolList(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeBoolList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 26:
                if (wireType == 2) {
                    if ((typeAndOffset & SVG.SPECIFIED_CLIP_RULE) == 0) {
                        return ArrayDecoders.decodeStringList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 27:
                if (wireType == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 28:
                if (wireType == 2) {
                    return ArrayDecoders.decodeBytesList(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 30:
            case 44:
                if (wireType == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(data, position, protobufListMutableCopyWithCapacity2, registers);
                } else if (wireType == 0) {
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) message, number, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(bufferPosition), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedSInt32List(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeSInt32List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 34:
            case 48:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedSInt64List(data, position, protobufListMutableCopyWithCapacity2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeSInt64List(tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
            case 49:
                if (wireType == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufListMutableCopyWithCapacity2, registers);
                }
                break;
        }
        return position;
    }

    public final <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(message, fieldOffset, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(data, position, limit, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    public final int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j = this.buffer[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case 51:
                if (wireType == 1) {
                    unsafe.putObject(message, fieldOffset, Double.valueOf(ArrayDecoders.decodeDouble(data, position)));
                    int i = position + 8;
                    unsafe.putInt(message, j, number);
                    return i;
                }
                break;
            case 52:
                if (wireType == 5) {
                    unsafe.putObject(message, fieldOffset, Float.valueOf(ArrayDecoders.decodeFloat(data, position)));
                    int i2 = position + 4;
                    unsafe.putInt(message, j, number);
                    return i2;
                }
                break;
            case 53:
            case 54:
                if (wireType == 0) {
                    int iDecodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                    unsafe.putObject(message, fieldOffset, Long.valueOf(registers.long1));
                    unsafe.putInt(message, j, number);
                    return iDecodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (wireType == 0) {
                    int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                    unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.int1));
                    unsafe.putInt(message, j, number);
                    return iDecodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (wireType == 1) {
                    unsafe.putObject(message, fieldOffset, Long.valueOf(ArrayDecoders.decodeFixed64(data, position)));
                    int i3 = position + 8;
                    unsafe.putInt(message, j, number);
                    return i3;
                }
                break;
            case 57:
            case 64:
                if (wireType == 5) {
                    unsafe.putObject(message, fieldOffset, Integer.valueOf(ArrayDecoders.decodeFixed32(data, position)));
                    int i4 = position + 4;
                    unsafe.putInt(message, j, number);
                    return i4;
                }
                break;
            case 58:
                if (wireType == 0) {
                    int iDecodeVarint642 = ArrayDecoders.decodeVarint64(data, position, registers);
                    unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(message, j, number);
                    return iDecodeVarint642;
                }
                break;
            case 59:
                if (wireType == 2) {
                    int iDecodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
                    int i5 = registers.int1;
                    if (i5 == 0) {
                        unsafe.putObject(message, fieldOffset, "");
                    } else {
                        if ((typeAndOffset & 536870912) != 0 && !Utf8.isValidUtf8(data, iDecodeVarint322, iDecodeVarint322 + i5)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        unsafe.putObject(message, fieldOffset, new String(data, iDecodeVarint322, i5, Internal.UTF_8));
                        iDecodeVarint322 += i5;
                    }
                    unsafe.putInt(message, j, number);
                    return iDecodeVarint322;
                }
                break;
            case 60:
                if (wireType == 2) {
                    Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                    int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                    storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge);
                    return iMergeMessageField;
                }
                break;
            case 61:
                if (wireType == 2) {
                    int iDecodeBytes = ArrayDecoders.decodeBytes(data, position, registers);
                    unsafe.putObject(message, fieldOffset, registers.object1);
                    unsafe.putInt(message, j, number);
                    return iDecodeBytes;
                }
                break;
            case 63:
                if (wireType == 0) {
                    int iDecodeVarint323 = ArrayDecoders.decodeVarint32(data, position, registers);
                    int i6 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i6)) {
                        unsafe.putObject(message, fieldOffset, Integer.valueOf(i6));
                        unsafe.putInt(message, j, number);
                    } else {
                        getMutableUnknownFields(message).storeField(tag, Long.valueOf(i6));
                    }
                    return iDecodeVarint323;
                }
                break;
            case 66:
                if (wireType == 0) {
                    int iDecodeVarint324 = ArrayDecoders.decodeVarint32(data, position, registers);
                    unsafe.putObject(message, fieldOffset, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(message, j, number);
                    return iDecodeVarint324;
                }
                break;
            case 67:
                if (wireType == 0) {
                    int iDecodeVarint643 = ArrayDecoders.decodeVarint64(data, position, registers);
                    unsafe.putObject(message, fieldOffset, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(message, j, number);
                    return iDecodeVarint643;
                }
                break;
            case 68:
                if (wireType == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                    storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return position;
    }

    public final Schema getMessageFieldSchema(int pos) {
        int i = (pos / 3) * 2;
        Schema schema = (Schema) this.objects[i];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i + 1]);
        this.objects[i] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public final Object getMapFieldDefaultEntry(int pos) {
        return this.objects[(pos / 3) * 2];
    }

    public final Internal.EnumVerifier getEnumFieldVerifier(int pos) {
        return (Internal.EnumVerifier) this.objects[((pos / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:251:0x009a. Please report as an issue. */
    @CanIgnoreReturnValue
    public int parseMessage(T message, byte[] data, int position, int limit, int endDelimited, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe;
        int i;
        MessageSchema<T> messageSchema;
        int i2;
        int i3;
        int i4;
        int i5;
        T t;
        int i6;
        int iPositionForFieldNumber;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        char c;
        byte[] bArr2;
        int iDecodeVarint64;
        int i15;
        int i16;
        MessageSchema<T> messageSchema2 = this;
        T t2 = message;
        byte[] bArr3 = data;
        int i17 = limit;
        int i18 = endDelimited;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(message);
        Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = position;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i17) {
                int i24 = iDecodeUnknownField + 1;
                byte b = bArr3[iDecodeUnknownField];
                if (b < 0) {
                    int iDecodeVarint32 = ArrayDecoders.decodeVarint32(b, bArr3, i24, registers2);
                    i6 = registers2.int1;
                    i24 = iDecodeVarint32;
                } else {
                    i6 = b;
                }
                int i25 = i6 >>> 3;
                int i26 = i6 & 7;
                if (i25 > i22) {
                    iPositionForFieldNumber = messageSchema2.positionForFieldNumber(i25, i19 / 3);
                } else {
                    iPositionForFieldNumber = messageSchema2.positionForFieldNumber(i25);
                }
                int i27 = iPositionForFieldNumber;
                if (i27 == -1) {
                    i7 = i25;
                    i8 = i24;
                    i3 = i6;
                    i9 = i21;
                    i10 = i23;
                    unsafe = unsafe2;
                    i = i18;
                    i11 = 0;
                } else {
                    int i28 = messageSchema2.buffer[i27 + 1];
                    int iType = type(i28);
                    long jOffset = offset(i28);
                    int i29 = i6;
                    if (iType <= 17) {
                        int i30 = messageSchema2.buffer[i27 + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = 1048575;
                        int i33 = i30 & 1048575;
                        if (i33 != i23) {
                            if (i23 != 1048575) {
                                unsafe2.putInt(t2, i23, i21);
                                i32 = 1048575;
                            }
                            i10 = i33;
                            i12 = i33 == i32 ? 0 : unsafe2.getInt(t2, i33);
                        } else {
                            i12 = i21;
                            i10 = i23;
                        }
                        switch (iType) {
                            case 0:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 1) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    UnsafeUtil.putDouble(t2, jOffset, ArrayDecoders.decodeDouble(bArr, i24));
                                    iDecodeUnknownField = i24 + 8;
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 1:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 5) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    UnsafeUtil.putFloat(t2, jOffset, ArrayDecoders.decodeFloat(bArr, i24));
                                    iDecodeUnknownField = i24 + 4;
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 2:
                            case 3:
                                bArr2 = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 0) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i24, registers2);
                                    unsafe2.putLong(message, jOffset, registers2.long1);
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr2;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 4:
                            case 11:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 0) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, i24, registers2);
                                    unsafe2.putInt(t2, jOffset, registers2.int1);
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 5:
                            case 14:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 1) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    unsafe2.putLong(message, jOffset, ArrayDecoders.decodeFixed64(bArr, i24));
                                    iDecodeUnknownField = i24 + 8;
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 6:
                            case 13:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 5) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    unsafe2.putInt(t2, jOffset, ArrayDecoders.decodeFixed32(bArr, i24));
                                    iDecodeUnknownField = i24 + 4;
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 7:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 0) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr, i24, registers2);
                                    UnsafeUtil.putBoolean(t2, jOffset, registers2.long1 != 0);
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 8:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 2) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    if (isEnforceUtf8(i28)) {
                                        iDecodeUnknownField = ArrayDecoders.decodeStringRequireUtf8(bArr, i24, registers2);
                                    } else {
                                        iDecodeUnknownField = ArrayDecoders.decodeString(bArr, i24, registers2);
                                    }
                                    unsafe2.putObject(t2, jOffset, registers2.object1);
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 9:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 2) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    Object objMutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t2, i13);
                                    iDecodeUnknownField = ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i13), data, i24, limit, registers);
                                    messageSchema2.storeMessageField(t2, i13, objMutableMessageFieldForMerge);
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 10:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 2) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr, i24, registers2);
                                    unsafe2.putObject(t2, jOffset, registers2.object1);
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 12:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 0) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, i24, registers2);
                                    int i34 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i13);
                                    if (!isLegacyEnumIsClosed(i28) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i34)) {
                                        unsafe2.putInt(t2, jOffset, i34);
                                        i21 = i12 | i31;
                                        i18 = endDelimited;
                                        i19 = i13;
                                        bArr3 = bArr;
                                        i20 = i14;
                                        i23 = i10;
                                        i22 = i7;
                                        i17 = limit;
                                    } else {
                                        getMutableUnknownFields(message).storeField(i14, Long.valueOf(i34));
                                        i18 = endDelimited;
                                        i19 = i13;
                                        i21 = i12;
                                        i20 = i14;
                                        i23 = i10;
                                        i22 = i7;
                                        i17 = limit;
                                        bArr3 = bArr;
                                    }
                                }
                                break;
                            case 15:
                                bArr = data;
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                if (i26 != 0) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, i24, registers2);
                                    unsafe2.putInt(t2, jOffset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 16:
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                bArr2 = data;
                                if (i26 != 0) {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i24, registers2);
                                    unsafe2.putLong(message, jOffset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i21 = i12 | i31;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr2;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            case 17:
                                if (i26 != 3) {
                                    i7 = i25;
                                    i14 = i29;
                                    c = 65535;
                                    i13 = i27;
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    Object objMutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t2, i27);
                                    i7 = i25;
                                    i14 = i29;
                                    iDecodeUnknownField = ArrayDecoders.mergeGroupField(objMutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i27), data, i24, limit, (i25 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t2, i27, objMutableMessageFieldForMerge2);
                                    i21 = i12 | i31;
                                    bArr3 = data;
                                    i18 = endDelimited;
                                    i19 = i27;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                }
                            default:
                                i7 = i25;
                                i13 = i27;
                                i14 = i29;
                                c = 65535;
                                i = endDelimited;
                                i8 = i24;
                                i11 = i13;
                                unsafe = unsafe2;
                                i9 = i12;
                                i3 = i14;
                                break;
                        }
                    } else {
                        i7 = i25;
                        int i35 = i23;
                        i9 = i21;
                        if (iType != 27) {
                            i10 = i35;
                            if (iType <= 49) {
                                int i36 = i24;
                                unsafe = unsafe2;
                                i11 = i27;
                                i16 = i29;
                                iDecodeUnknownField = parseRepeatedField(message, data, i24, limit, i29, i7, i26, i27, i28, iType, jOffset, registers);
                                if (iDecodeUnknownField != i36) {
                                    messageSchema2 = this;
                                    t2 = message;
                                    bArr3 = data;
                                    i17 = limit;
                                    i18 = endDelimited;
                                    registers2 = registers;
                                    i20 = i16;
                                    i21 = i9;
                                    i19 = i11;
                                    i23 = i10;
                                    i22 = i7;
                                    unsafe2 = unsafe;
                                } else {
                                    i = endDelimited;
                                    i8 = iDecodeUnknownField;
                                    i3 = i16;
                                }
                            } else {
                                i15 = i24;
                                unsafe = unsafe2;
                                i11 = i27;
                                i16 = i29;
                                if (iType != 50) {
                                    iDecodeUnknownField = parseOneofField(message, data, i15, limit, i16, i7, i26, i28, iType, jOffset, i11, registers);
                                    if (iDecodeUnknownField != i15) {
                                        messageSchema2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        registers2 = registers;
                                        i20 = i16;
                                        i21 = i9;
                                        i19 = i11;
                                        i23 = i10;
                                        i22 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = iDecodeUnknownField;
                                        i3 = i16;
                                    }
                                } else if (i26 == 2) {
                                    iDecodeUnknownField = parseMapField(message, data, i15, limit, i11, jOffset, registers);
                                    if (iDecodeUnknownField != i15) {
                                        messageSchema2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        registers2 = registers;
                                        i20 = i16;
                                        i21 = i9;
                                        i19 = i11;
                                        i23 = i10;
                                        i22 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = iDecodeUnknownField;
                                        i3 = i16;
                                    }
                                }
                            }
                        } else if (i26 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t2, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t2, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            iDecodeUnknownField = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i27), i29, data, i24, limit, protobufListMutableCopyWithCapacity2, registers);
                            i18 = endDelimited;
                            i19 = i27;
                            i20 = i29;
                            i21 = i9;
                            i23 = i35;
                            i22 = i7;
                            bArr3 = data;
                            i17 = limit;
                        } else {
                            i10 = i35;
                            i15 = i24;
                            unsafe = unsafe2;
                            i11 = i27;
                            i16 = i29;
                        }
                        i = endDelimited;
                        i8 = i15;
                        i3 = i16;
                    }
                }
                if (i3 != i || i == 0) {
                    if (this.hasExtensions && registers.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
                        iDecodeUnknownField = ArrayDecoders.decodeExtensionOrUnknownField(i3, data, i8, limit, message, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        iDecodeUnknownField = ArrayDecoders.decodeUnknownField(i3, data, i8, limit, getMutableUnknownFields(message), registers);
                    }
                    t2 = message;
                    bArr3 = data;
                    i17 = limit;
                    i20 = i3;
                    messageSchema2 = this;
                    registers2 = registers;
                    i21 = i9;
                    i19 = i11;
                    i23 = i10;
                    i22 = i7;
                    unsafe2 = unsafe;
                    i18 = i;
                } else {
                    i5 = 1048575;
                    messageSchema = this;
                    i2 = i8;
                    i21 = i9;
                    i4 = i10;
                }
            } else {
                int i37 = i23;
                unsafe = unsafe2;
                i = i18;
                messageSchema = messageSchema2;
                i2 = iDecodeUnknownField;
                i3 = i20;
                i4 = i37;
                i5 = 1048575;
            }
        }
        if (i4 != i5) {
            t = message;
            unsafe.putInt(t, i4, i21);
        } else {
            t = message;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i38 = messageSchema.checkInitializedCount; i38 < messageSchema.repeatedFieldOffsetStart; i38++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(message, messageSchema.intArray[i38], unknownFieldSetLite, messageSchema.unknownFieldSchema, message);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t, unknownFieldSetLite);
        }
        if (i == 0) {
            if (i2 != limit) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i2 > limit || i3 != i) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableMessageFieldForMerge(T message, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        long jOffset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void storeMessageField(T message, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableOneofMessageFieldForMerge(T message, int fieldNumber, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, offset(typeAndOffsetAt(pos)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void storeOneofMessageField(T message, int fieldNumber, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, byte[] data, int position, int limit, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(message, data, position, limit, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void makeImmutable(T message) {
        if (isMutable(message)) {
            if (message instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i = 0; i < length; i += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType == 60 || iType == 68) {
                        if (isOneofPresent(message, numberAt(i), i)) {
                            getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(message, jOffset));
                        }
                    } else {
                        switch (iType) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(message, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(message, jOffset);
                                if (object != null) {
                                    unsafe.putObject(message, jOffset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                } else if (isFieldPresent(message, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(message, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(message);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(message);
            }
        }
    }

    public final <K, V> void mergeMap(Object message, int pos, Object mapDefaultEntry, ExtensionRegistryLite extensionRegistry, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(pos));
        Object object = UnsafeUtil.getObject(message, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(mapDefaultEntry);
            UnsafeUtil.putObject(message, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(message, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    public final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    public final <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0089  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isInitialized(T message) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int iNumberAt = numberAt(i6);
            int iTypeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(message, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(message, i6, i, i2, i9)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(message, i6, i, i2, i9) && !isInitialized(message, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(message, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(message, iNumberAt, i6) && !isInitialized(message, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(message, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(message).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isInitialized(Object message, int typeAndOffset, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(message, offset(typeAndOffset)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean isListInitialized(Object message, int typeAndOffset, int pos) {
        List list = (List) UnsafeUtil.getObject(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        for (int i = 0; i < list.size(); i++) {
            if (!messageFieldSchema.isInitialized(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    public final boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    public final void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writer.writeString(fieldNumber, (String) value);
        } else {
            writer.writeBytes(fieldNumber, (ByteString) value);
        }
    }

    public final void readString(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readString());
        } else {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    public final void readStringList(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        }
    }

    public final <E> void readMessageList(Object message, int typeAndOffset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    public final <E> void readGroupList(Object message, long offset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(message, offset), schema, extensionRegistry);
    }

    public final int numberAt(int pos) {
        return this.buffer[pos];
    }

    public final int typeAndOffsetAt(int pos) {
        return this.buffer[pos + 1];
    }

    public final int presenceMaskAndOffsetAt(int pos) {
        return this.buffer[pos + 2];
    }

    public static boolean isMutable(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) message).isMutable();
        }
        return true;
    }

    public static void checkMutable(Object message) {
        if (isMutable(message)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + message);
    }

    public static <T> double doubleAt(T message, long offset) {
        return UnsafeUtil.getDouble(message, offset);
    }

    public static <T> float floatAt(T message, long offset) {
        return UnsafeUtil.getFloat(message, offset);
    }

    public static <T> int intAt(T message, long offset) {
        return UnsafeUtil.getInt(message, offset);
    }

    public static <T> long longAt(T message, long offset) {
        return UnsafeUtil.getLong(message, offset);
    }

    public static <T> boolean booleanAt(T message, long offset) {
        return UnsafeUtil.getBoolean(message, offset);
    }

    public static <T> double oneofDoubleAt(T message, long offset) {
        return ((Double) UnsafeUtil.getObject(message, offset)).doubleValue();
    }

    public static <T> float oneofFloatAt(T message, long offset) {
        return ((Float) UnsafeUtil.getObject(message, offset)).floatValue();
    }

    public static <T> int oneofIntAt(T message, long offset) {
        return ((Integer) UnsafeUtil.getObject(message, offset)).intValue();
    }

    public static <T> long oneofLongAt(T message, long offset) {
        return ((Long) UnsafeUtil.getObject(message, offset)).longValue();
    }

    public static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((Boolean) UnsafeUtil.getObject(message, offset)).booleanValue();
    }

    public final boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    public final boolean isFieldPresent(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        if (presenceFieldOffset == 1048575) {
            return isFieldPresent(message, pos);
        }
        return (presenceField & presenceMask) != 0;
    }

    public final boolean isFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(message, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(message, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(message, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(message, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(message, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(message, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(message, jOffset));
            case 11:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(message, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void setFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(message, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(message, j));
    }

    public final boolean isOneofPresent(T message, int fieldNumber, int pos) {
        return UnsafeUtil.getInt(message, (long) (presenceMaskAndOffsetAt(pos) & 1048575)) == fieldNumber;
    }

    public final boolean isOneofCaseEqual(T message, T other, int pos) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos) & 1048575;
        return UnsafeUtil.getInt(message, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(other, jPresenceMaskAndOffsetAt);
    }

    public final void setOneofPresent(T message, int fieldNumber, int pos) {
        UnsafeUtil.putInt(message, presenceMaskAndOffsetAt(pos) & 1048575, fieldNumber);
    }

    public final int positionForFieldNumber(final int number) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    public final int positionForFieldNumber(final int number, final int min) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    public final int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.buffer.length / 3) - 1;
        while (min <= length) {
            int i = (length + min) >>> 1;
            int i2 = i * 3;
            int iNumberAt = numberAt(i2);
            if (number == iNumberAt) {
                return i2;
            }
            if (number < iNumberAt) {
                length = i - 1;
            } else {
                min = i + 1;
            }
        }
        return -1;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }
}
