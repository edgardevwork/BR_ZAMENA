package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p022io.NumberInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class JsonPointer implements Serializable {
    public static final JsonPointer EMPTY = new JsonPointer();
    public static final char SEPARATOR = '/';
    public static final long serialVersionUID = 1;
    public final String _asString;
    public final int _asStringOffset;
    public int _hashCode;
    public volatile JsonPointer _head;
    public final int _matchingElementIndex;
    public final String _matchingPropertyName;
    public final JsonPointer _nextSegment;

    public JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = null;
        this._matchingElementIndex = -1;
        this._asString = "";
        this._asStringOffset = 0;
    }

    public JsonPointer(String str, int i, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    public JsonPointer(String str, int i, String str2, int i2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i2;
    }

    public static JsonPointer compile(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) != '/') {
            throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
        }
        return _parseTail(str);
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    public static JsonPointer empty() {
        return EMPTY;
    }

    public static JsonPointer forPath(JsonStreamContext jsonStreamContext, boolean z) {
        PointerSegment pointerSegment;
        if (jsonStreamContext == null) {
            return EMPTY;
        }
        if (!jsonStreamContext.hasPathSegment() && (!z || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        int length = 0;
        PointerSegment pointerSegment2 = null;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = "";
                }
                length += currentName.length() + 2;
                pointerSegment = new PointerSegment(pointerSegment2, currentName, -1);
            } else if (!jsonStreamContext.inArray() && !z) {
                jsonStreamContext = jsonStreamContext.getParent();
            } else {
                length += 6;
                pointerSegment = new PointerSegment(pointerSegment2, null, jsonStreamContext.getCurrentIndex());
            }
            pointerSegment2 = pointerSegment;
            jsonStreamContext = jsonStreamContext.getParent();
        }
        if (pointerSegment2 == null) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder(length);
        PointerSegment pointerSegment3 = null;
        PointerSegment pointerSegment4 = pointerSegment2;
        while (pointerSegment4 != null) {
            pointerSegment4.pathOffset = sb.length();
            sb.append('/');
            String str = pointerSegment4.property;
            if (str != null) {
                _appendEscaped(sb, str);
            } else {
                sb.append(pointerSegment4.index);
            }
            PointerSegment pointerSegment5 = pointerSegment4;
            pointerSegment4 = pointerSegment4.next;
            pointerSegment3 = pointerSegment5;
        }
        String string = sb.toString();
        JsonPointer jsonPointer = EMPTY;
        while (pointerSegment3 != null) {
            String str2 = pointerSegment3.property;
            if (str2 != null) {
                jsonPointer = new JsonPointer(string, pointerSegment3.pathOffset, str2, jsonPointer);
            } else {
                int i = pointerSegment3.index;
                jsonPointer = new JsonPointer(string, pointerSegment3.pathOffset, String.valueOf(i), i, jsonPointer);
            }
            pointerSegment3 = pointerSegment3.prev;
        }
        return jsonPointer;
    }

    public static void _appendEscaped(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                sb.append("~1");
            } else if (cCharAt == '~') {
                sb.append("~0");
            } else {
                sb.append(cCharAt);
            }
        }
    }

    public int length() {
        return this._asString.length() - this._asStringOffset;
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public boolean mayMatchProperty() {
        return this._matchingPropertyName != null;
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public JsonPointer last() {
        if (this == EMPTY) {
            return null;
        }
        JsonPointer jsonPointer = this;
        while (true) {
            JsonPointer jsonPointer2 = jsonPointer._nextSegment;
            if (jsonPointer2 == EMPTY) {
                return jsonPointer;
            }
            jsonPointer = jsonPointer2;
        }
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        JsonPointer jsonPointer2 = EMPTY;
        if (this == jsonPointer2) {
            return jsonPointer;
        }
        if (jsonPointer == jsonPointer2) {
            return this;
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + jsonPointer._asString);
    }

    public JsonPointer appendProperty(String str) {
        if (str == null || str.isEmpty()) {
            return this;
        }
        if (str.charAt(0) != '/') {
            str = '/' + str;
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + str);
    }

    public JsonPointer appendIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative index cannot be appended");
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + '/' + i);
    }

    public boolean matchesProperty(String str) {
        return this._nextSegment != null && this._matchingPropertyName.equals(str);
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matchesElement(int i) {
        return i == this._matchingElementIndex && i >= 0;
    }

    public JsonPointer matchElement(int i) {
        if (i != this._matchingElementIndex || i < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public JsonPointer head() {
        JsonPointer jsonPointer_constructHead = this._head;
        if (jsonPointer_constructHead == null) {
            if (this != EMPTY) {
                jsonPointer_constructHead = _constructHead();
            }
            this._head = jsonPointer_constructHead;
        }
        return jsonPointer_constructHead;
    }

    public String toString() {
        int i = this._asStringOffset;
        if (i <= 0) {
            return this._asString;
        }
        return this._asString.substring(i);
    }

    public int hashCode() {
        int iHashCode = this._hashCode;
        if (iHashCode == 0) {
            iHashCode = toString().hashCode();
            if (iHashCode == 0) {
                iHashCode = -1;
            }
            this._hashCode = iHashCode;
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        return _compare(this._asString, this._asStringOffset, jsonPointer._asString, jsonPointer._asStringOffset);
    }

    public final boolean _compare(String str, int i, String str2, int i2) {
        int length = str.length();
        if (length - i != str2.length() - i2) {
            return false;
        }
        while (i < length) {
            int i3 = i + 1;
            int i4 = i2 + 1;
            if (str.charAt(i) != str2.charAt(i2)) {
                return false;
            }
            i = i3;
            i2 = i4;
        }
        return true;
    }

    public static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || NumberInput.parseLong(str) <= ParserMinimalBase.MAX_INT_L) {
            return NumberInput.parseInt(str);
        }
        return -1;
    }

    public static JsonPointer _parseTail(String str) {
        int length = str.length();
        PointerParent pointerParent = null;
        int i = 1;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                PointerParent pointerParent2 = new PointerParent(pointerParent, i2, str.substring(i2 + 1, i));
                i2 = i;
                i++;
                pointerParent = pointerParent2;
            } else {
                i++;
                if (cCharAt == '~' && i < length) {
                    StringBuilder sb = new StringBuilder(32);
                    int i_extractEscapedSegment = _extractEscapedSegment(str, i2 + 1, i, sb);
                    String string = sb.toString();
                    if (i_extractEscapedSegment < 0) {
                        return _buildPath(str, i2, string, pointerParent);
                    }
                    PointerParent pointerParent3 = new PointerParent(pointerParent, i2, string);
                    i2 = i_extractEscapedSegment;
                    i = i_extractEscapedSegment + 1;
                    pointerParent = pointerParent3;
                }
            }
        }
        return _buildPath(str, i2, str.substring(i2 + 1), pointerParent);
    }

    public static JsonPointer _buildPath(String str, int i, String str2, PointerParent pointerParent) {
        JsonPointer jsonPointer = new JsonPointer(str, i, str2, EMPTY);
        while (pointerParent != null) {
            JsonPointer jsonPointer2 = new JsonPointer(str, pointerParent.fullPathOffset, pointerParent.segment, jsonPointer);
            pointerParent = pointerParent.parent;
            jsonPointer = jsonPointer2;
        }
        return jsonPointer;
    }

    public static int _extractEscapedSegment(String str, int i, int i2, StringBuilder sb) {
        int length = str.length();
        int i3 = i2 - 1;
        if (i3 - i > 0) {
            sb.append((CharSequence) str, i, i3);
        }
        int i4 = i2 + 1;
        _appendEscape(sb, str.charAt(i2));
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '/') {
                return i4;
            }
            int i5 = i4 + 1;
            if (cCharAt == '~' && i5 < length) {
                i4 += 2;
                _appendEscape(sb, str.charAt(i5));
            } else {
                sb.append(cCharAt);
                i4 = i5;
            }
        }
        return -1;
    }

    public static void _appendEscape(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = '/';
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    public JsonPointer _constructHead() {
        JsonPointer jsonPointerLast = last();
        if (jsonPointerLast == this) {
            return EMPTY;
        }
        int length = jsonPointerLast.length();
        JsonPointer jsonPointer = this._nextSegment;
        String string = toString();
        return new JsonPointer(string.substring(0, string.length() - length), 0, this._matchingPropertyName, this._matchingElementIndex, jsonPointer._constructHead(length, jsonPointerLast));
    }

    public JsonPointer _constructHead(int i, JsonPointer jsonPointer) {
        if (this == jsonPointer) {
            return EMPTY;
        }
        JsonPointer jsonPointer2 = this._nextSegment;
        String string = toString();
        return new JsonPointer(string.substring(0, string.length() - i), 0, this._matchingPropertyName, this._matchingElementIndex, jsonPointer2._constructHead(i, jsonPointer));
    }

    /* loaded from: classes2.dex */
    public static class PointerParent {
        public final int fullPathOffset;
        public final PointerParent parent;
        public final String segment;

        public PointerParent(PointerParent pointerParent, int i, String str) {
            this.parent = pointerParent;
            this.fullPathOffset = i;
            this.segment = str;
        }
    }

    /* loaded from: classes2.dex */
    public static class PointerSegment {
        public final int index;
        public final PointerSegment next;
        public int pathOffset;
        public PointerSegment prev;
        public final String property;

        public PointerSegment(PointerSegment pointerSegment, String str, int i) {
            this.next = pointerSegment;
            this.property = str;
            this.index = i;
            if (pointerSegment != null) {
                pointerSegment.prev = this;
            }
        }
    }

    public final Object writeReplace() {
        return new Serialization(toString());
    }

    /* loaded from: classes2.dex */
    public static class Serialization implements Externalizable {
        public String _fullPath;

        public Serialization() {
        }

        public Serialization(String str) {
            this._fullPath = str;
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this._fullPath);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this._fullPath = objectInput.readUTF();
        }

        public final Object readResolve() throws ObjectStreamException {
            return JsonPointer.compile(this._fullPath);
        }
    }
}
