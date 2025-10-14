package com.fasterxml.jackson.core.p022io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class SerializedString implements SerializableString, Serializable {
    public static final JsonStringEncoder JSON_ENCODER = JsonStringEncoder.getInstance();
    public static final long serialVersionUID = 1;
    public transient String _jdkSerializeValue;
    public char[] _quotedChars;
    public byte[] _quotedUTF8Ref;
    public byte[] _unquotedUTF8Ref;
    public final String _value;

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = str;
    }

    public final void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    public final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    public Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final String getValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int charLength() {
        return this._value.length();
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrQuoteAsString = JSON_ENCODER.quoteAsString(this._value);
        this._quotedChars = cArrQuoteAsString;
        return cArrQuoteAsString;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrQuoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
        this._quotedUTF8Ref = bArrQuoteAsUTF8;
        return bArrQuoteAsUTF8;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrEncodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
        this._unquotedUTF8Ref = bArrEncodeAsUTF8;
        return bArrEncodeAsUTF8;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuoted(char[] cArr, int i) {
        char[] cArrQuoteAsString = this._quotedChars;
        if (cArrQuoteAsString == null) {
            cArrQuoteAsString = JSON_ENCODER.quoteAsString(this._value);
            this._quotedChars = cArrQuoteAsString;
        }
        int length = cArrQuoteAsString.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrQuoteAsString, 0, cArr, i, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuotedUTF8(byte[] bArr, int i) {
        byte[] bArrQuoteAsUTF8 = this._quotedUTF8Ref;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrQuoteAsUTF8, 0, bArr, i, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquoted(char[] cArr, int i) {
        String str = this._value;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquotedUTF8(byte[] bArr, int i) {
        byte[] bArrEncodeAsUTF8 = this._unquotedUTF8Ref;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrEncodeAsUTF8, 0, bArr, i, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrQuoteAsUTF8 = this._quotedUTF8Ref;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        outputStream.write(bArrQuoteAsUTF8, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrEncodeAsUTF8 = this._unquotedUTF8Ref;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        outputStream.write(bArrEncodeAsUTF8, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrQuoteAsUTF8 = this._quotedUTF8Ref;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrQuoteAsUTF8, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrEncodeAsUTF8 = this._unquotedUTF8Ref;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrEncodeAsUTF8, 0, length);
        return length;
    }

    public final String toString() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }
}
