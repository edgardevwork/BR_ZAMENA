package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p022io.CharacterEscapes;
import com.fasterxml.jackson.core.p022io.SerializedString;

/* loaded from: classes7.dex */
public class JsonpCharacterEscapes extends CharacterEscapes {
    public static final int[] asciiEscapes = CharacterEscapes.standardAsciiEscapesForJSON();
    public static final SerializedString escapeFor2028 = new SerializedString("\\u2028");
    public static final SerializedString escapeFor2029 = new SerializedString("\\u2029");
    public static final JsonpCharacterEscapes sInstance = new JsonpCharacterEscapes();
    public static final long serialVersionUID = 1;

    public static JsonpCharacterEscapes instance() {
        return sInstance;
    }

    @Override // com.fasterxml.jackson.core.p022io.CharacterEscapes
    public SerializableString getEscapeSequence(int i) {
        if (i == 8232) {
            return escapeFor2028;
        }
        if (i != 8233) {
            return null;
        }
        return escapeFor2029;
    }

    @Override // com.fasterxml.jackson.core.p022io.CharacterEscapes
    public int[] getEscapeCodesForAscii() {
        return asciiEscapes;
    }
}
