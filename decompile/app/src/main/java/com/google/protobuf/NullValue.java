package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes7.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    public static final Internal.EnumLiteMap<NullValue> internalValueMap = new Internal.EnumLiteMap<NullValue>() { // from class: com.google.protobuf.NullValue.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public NullValue findValueByNumber(int number) {
            return NullValue.forNumber(number);
        }
    };
    public final int value;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static NullValue valueOf(int value) {
        return forNumber(value);
    }

    public static NullValue forNumber(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    public static final class NullValueVerifier implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier INSTANCE = new NullValueVerifier();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return NullValue.forNumber(number) != null;
        }
    }

    NullValue(int value) {
        this.value = value;
    }
}
