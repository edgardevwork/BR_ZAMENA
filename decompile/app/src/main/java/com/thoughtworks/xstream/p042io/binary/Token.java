package com.thoughtworks.xstream.p042io.binary;

import com.fasterxml.jackson.core.JsonParser;
import com.google.common.base.Ascii;
import com.thoughtworks.xstream.p042io.StreamException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import kotlin.jvm.internal.ShortCompanionObject;
import okhttp3.internal.p054ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public abstract class Token {
    public static final byte ID_EIGHT_BYTES = 32;
    public static final byte ID_FOUR_BYTES = 24;
    public static final byte ID_MASK = 56;
    public static final byte ID_ONE_BYTE = 8;
    public static final String ID_SPLITTED = "\u0000‡\u0000";
    public static final byte ID_TWO_BYTES = 16;
    public static final int MAX_UTF8_LENGTH = 65535;
    public static final byte TYPE_ATTRIBUTE = 5;
    public static final byte TYPE_END_NODE = 4;
    public static final byte TYPE_MAP_ID_TO_VALUE = 2;
    public static final byte TYPE_MASK = 7;
    public static final byte TYPE_START_NODE = 3;
    public static final byte TYPE_VALUE = 6;
    public static final byte TYPE_VERSION = 1;

    /* renamed from: id */
    public long f5909id = -1;
    public final byte type;
    public String value;

    public abstract void readFrom(DataInput dataInput, byte b) throws IOException;

    public abstract void writeTo(DataOutput dataOutput, byte b) throws IOException;

    public Token(byte b) {
        this.type = b;
    }

    public byte getType() {
        return this.type;
    }

    public long getId() {
        return this.f5909id;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [id=");
        stringBuffer.append(this.f5909id);
        stringBuffer.append(", value='");
        stringBuffer.append(this.value);
        stringBuffer.append("']");
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (this.f5909id != token.f5909id || this.type != token.type) {
            return false;
        }
        String str = this.value;
        String str2 = token.value;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.type * Ascii.f781GS;
        long j = this.f5909id;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 29;
        String str = this.value;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public void writeId(DataOutput dataOutput, long j, byte b) throws IOException {
        if (j < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("id must not be negative ");
            stringBuffer.append(j);
            throw new IOException(stringBuffer.toString());
        }
        if (b == 8) {
            dataOutput.writeByte(((byte) j) - 128);
            return;
        }
        if (b == 16) {
            dataOutput.writeShort(((short) j) + ShortCompanionObject.MIN_VALUE);
            return;
        }
        if (b == 24) {
            dataOutput.writeInt(((int) j) - 2147483648);
        } else {
            if (b == 32) {
                dataOutput.writeLong(j - Long.MIN_VALUE);
                return;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Unknown idType ");
            stringBuffer2.append((int) b);
            throw new Error(stringBuffer2.toString());
        }
    }

    public void writeString(DataOutput dataOutput, String str) throws IOException {
        byte[] bytes = str.length() > 16383 ? str.getBytes("utf-8") : new byte[0];
        if (bytes.length <= 65535) {
            dataOutput.writeUTF(str);
            return;
        }
        dataOutput.writeUTF(ID_SPLITTED);
        dataOutput.writeInt(bytes.length);
        dataOutput.write(bytes);
    }

    public long readId(DataInput dataInput, byte b) throws IOException {
        if (b == 8) {
            return dataInput.readByte() + 128;
        }
        if (b == 16) {
            return dataInput.readShort() - JsonParser.MIN_SHORT_I;
        }
        if (b == 24) {
            return dataInput.readInt() - Integer.MIN_VALUE;
        }
        if (b == 32) {
            return dataInput.readLong() - Long.MIN_VALUE;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unknown idType ");
        stringBuffer.append((int) b);
        throw new Error(stringBuffer.toString());
    }

    public String readString(DataInput dataInput) throws IOException {
        String utf = dataInput.readUTF();
        if (!ID_SPLITTED.equals(utf)) {
            return utf;
        }
        byte[] bArr = new byte[dataInput.readInt()];
        dataInput.readFully(bArr);
        return new String(bArr, "utf-8");
    }

    public static class Formatter {
        public void write(DataOutput dataOutput, Token token) throws IOException {
            long id = token.getId();
            byte b = id <= 255 ? (byte) 8 : id <= WebSocketProtocol.PAYLOAD_SHORT_MAX ? (byte) 16 : id <= 4294967295L ? (byte) 24 : (byte) 32;
            dataOutput.write(token.getType() + b);
            token.writeTo(dataOutput, b);
        }

        public Token read(DataInput dataInput) throws IOException {
            byte b = dataInput.readByte();
            byte b2 = (byte) (b & 7);
            byte b3 = (byte) (b & Token.ID_MASK);
            Token tokenContructToken = contructToken(b2);
            tokenContructToken.readFrom(dataInput, b3);
            return tokenContructToken;
        }

        public final Token contructToken(byte b) {
            if (b == 2) {
                return new MapIdToValue();
            }
            if (b == 3) {
                return new StartNode();
            }
            if (b == 4) {
                return new EndNode();
            }
            if (b == 5) {
                return new Attribute();
            }
            if (b == 6) {
                return new Value();
            }
            throw new StreamException("Unknown token type");
        }
    }

    public static class MapIdToValue extends Token {
        public MapIdToValue(long j, String str) {
            super((byte) 2);
            this.f5909id = j;
            this.value = str;
        }

        public MapIdToValue() {
            super((byte) 2);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void writeTo(DataOutput dataOutput, byte b) throws IOException {
            writeId(dataOutput, this.f5909id, b);
            writeString(dataOutput, this.value);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void readFrom(DataInput dataInput, byte b) throws IOException {
            this.f5909id = readId(dataInput, b);
            this.value = readString(dataInput);
        }
    }

    public static class StartNode extends Token {
        public StartNode(long j) {
            super((byte) 3);
            this.f5909id = j;
        }

        public StartNode() {
            super((byte) 3);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void writeTo(DataOutput dataOutput, byte b) throws IOException {
            writeId(dataOutput, this.f5909id, b);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void readFrom(DataInput dataInput, byte b) throws IOException {
            this.f5909id = readId(dataInput, b);
        }
    }

    public static class EndNode extends Token {
        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void readFrom(DataInput dataInput, byte b) {
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void writeTo(DataOutput dataOutput, byte b) {
        }

        public EndNode() {
            super((byte) 4);
        }
    }

    public static class Attribute extends Token {
        public Attribute(long j, String str) {
            super((byte) 5);
            this.f5909id = j;
            this.value = str;
        }

        public Attribute() {
            super((byte) 5);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void writeTo(DataOutput dataOutput, byte b) throws IOException {
            writeId(dataOutput, this.f5909id, b);
            writeString(dataOutput, this.value);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void readFrom(DataInput dataInput, byte b) throws IOException {
            this.f5909id = readId(dataInput, b);
            this.value = readString(dataInput);
        }
    }

    public static class Value extends Token {
        public Value(String str) {
            super((byte) 6);
            this.value = str;
        }

        public Value() {
            super((byte) 6);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void writeTo(DataOutput dataOutput, byte b) throws IOException {
            writeString(dataOutput, this.value);
        }

        @Override // com.thoughtworks.xstream.p042io.binary.Token
        public void readFrom(DataInput dataInput, byte b) throws IOException {
            this.value = readString(dataInput);
        }
    }
}
