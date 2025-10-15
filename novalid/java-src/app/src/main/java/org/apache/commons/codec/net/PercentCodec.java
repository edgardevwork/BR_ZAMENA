package org.apache.commons.codec.net;

import androidx.media3.extractor.text.cea.Cea608Decoder;
import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* loaded from: classes8.dex */
public class PercentCodec implements BinaryEncoder, BinaryDecoder {
    public static final byte ESCAPE_CHAR = 37;
    public final BitSet alwaysEncodeChars;
    public int alwaysEncodeCharsMax;
    public int alwaysEncodeCharsMin;
    public final boolean plusForSpace;

    public final boolean isAsciiChar(byte b) {
        return b >= 0;
    }

    public PercentCodec() {
        this.alwaysEncodeChars = new BitSet();
        this.alwaysEncodeCharsMin = Integer.MAX_VALUE;
        this.alwaysEncodeCharsMax = Integer.MIN_VALUE;
        this.plusForSpace = false;
        insertAlwaysEncodeChar((byte) 37);
    }

    public PercentCodec(byte[] bArr, boolean z) {
        this.alwaysEncodeChars = new BitSet();
        this.alwaysEncodeCharsMin = Integer.MAX_VALUE;
        this.alwaysEncodeCharsMax = Integer.MIN_VALUE;
        this.plusForSpace = z;
        insertAlwaysEncodeChars(bArr);
    }

    public final void insertAlwaysEncodeChars(byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                insertAlwaysEncodeChar(b);
            }
        }
        insertAlwaysEncodeChar((byte) 37);
    }

    public final void insertAlwaysEncodeChar(byte b) {
        this.alwaysEncodeChars.set(b);
        if (b < this.alwaysEncodeCharsMin) {
            this.alwaysEncodeCharsMin = b;
        }
        if (b > this.alwaysEncodeCharsMax) {
            this.alwaysEncodeCharsMax = b;
        }
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) throws EncoderException {
        if (bArr == null) {
            return null;
        }
        int iExpectedEncodingBytes = expectedEncodingBytes(bArr);
        boolean z = iExpectedEncodingBytes != bArr.length;
        return (z || (this.plusForSpace && containsSpace(bArr))) ? doEncode(bArr, iExpectedEncodingBytes, z) : bArr;
    }

    public final byte[] doEncode(byte[] bArr, int i, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        for (byte b : bArr) {
            if (z && canEncode(b)) {
                if (b < 0) {
                    b = (byte) (b + 256);
                }
                char cHexDigit = Utils.hexDigit(b >> 4);
                char cHexDigit2 = Utils.hexDigit(b);
                byteBufferAllocate.put((byte) 37);
                byteBufferAllocate.put((byte) cHexDigit);
                byteBufferAllocate.put((byte) cHexDigit2);
            } else if (this.plusForSpace && b == 32) {
                byteBufferAllocate.put(Cea608Decoder.CTRL_RESUME_TEXT_DISPLAY);
            } else {
                byteBufferAllocate.put(b);
            }
        }
        return byteBufferAllocate.array();
    }

    public final int expectedEncodingBytes(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i += canEncode(b) ? 3 : 1;
        }
        return i;
    }

    public final boolean containsSpace(byte[] bArr) {
        for (byte b : bArr) {
            if (b == 32) {
                return true;
            }
        }
        return false;
    }

    public final boolean canEncode(byte b) {
        return !isAsciiChar(b) || (inAlwaysEncodeCharsRange(b) && this.alwaysEncodeChars.get(b));
    }

    public final boolean inAlwaysEncodeCharsRange(byte b) {
        return b >= this.alwaysEncodeCharsMin && b <= this.alwaysEncodeCharsMax;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(expectedDecodingBytes(bArr));
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                try {
                    int iDigit16 = Utils.digit16(bArr[i + 1]);
                    i += 2;
                    byteBufferAllocate.put((byte) ((iDigit16 << 4) + Utils.digit16(bArr[i])));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new DecoderException("Invalid percent decoding: ", e);
                }
            } else if (this.plusForSpace && b == 43) {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put(b);
            }
            i++;
        }
        return byteBufferAllocate.array();
    }

    public final int expectedDecodingBytes(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            i += bArr[i] == 37 ? 3 : 1;
            i2++;
        }
        return i2;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be Percent encoded");
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be Percent decoded");
    }
}
