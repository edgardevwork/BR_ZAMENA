package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes7.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final Internal.EnumLiteMap<Syntax> internalValueMap = new Internal.EnumLiteMap<Syntax>() { // from class: com.google.protobuf.Syntax.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Syntax findValueByNumber(int number) {
            return Syntax.forNumber(number);
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
    public static Syntax valueOf(int value) {
        return forNumber(value);
    }

    public static Syntax forNumber(int value) {
        if (value == 0) {
            return SYNTAX_PROTO2;
        }
        if (value == 1) {
            return SYNTAX_PROTO3;
        }
        if (value != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SyntaxVerifier.INSTANCE;
    }

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier INSTANCE = new SyntaxVerifier();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return Syntax.forNumber(number) != null;
        }
    }

    Syntax(int value) {
        this.value = value;
    }
}
