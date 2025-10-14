package org.apache.commons.codec.binary;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* loaded from: classes5.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    public static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final int EOF = -1;
    public static final int MASK_8BITS = 255;
    public static final int MAX_BUFFER_SIZE = 2147483639;
    public static final int MIME_CHUNK_SIZE = 76;
    public static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @Deprecated
    public final byte PAD;
    public final int chunkSeparatorLength;
    public final CodecPolicy decodingPolicy;
    public final int encodedBlockSize;
    public final int lineLength;
    public final byte pad;
    public final int unencodedBlockSize;
    public static final CodecPolicy DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;
    public static final byte[] CHUNK_SEPARATOR = {13, 10};

    public static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    public abstract void decode(byte[] bArr, int i, int i2, Context context);

    public abstract void encode(byte[] bArr, int i, int i2, Context context);

    public int getDefaultBufferSize() {
        return 8192;
    }

    public abstract boolean isInAlphabet(byte b);

    /* loaded from: classes7.dex */
    public static class Context {
        public byte[] buffer;
        public int currentLinePos;
        public boolean eof;
        public int ibitWorkArea;
        public long lbitWorkArea;
        public int modulus;
        public int pos;
        public int readPos;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos));
        }
    }

    public static int compareUnsigned(int i, int i2) {
        return Integer.compare(i - 2147483648, i2 - 2147483648);
    }

    public static int createPositiveCapacity(int i) {
        if (i >= 0) {
            if (i > 2147483639) {
                return i;
            }
            return 2147483639;
        }
        throw new OutOfMemoryError("Unable to allocate array size: " + (i & 4294967295L));
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) CHUNK_SEPARATOR.clone();
    }

    public static byte[] resizeBuffer(Context context, int i) {
        int length = context.buffer.length * 2;
        if (compareUnsigned(length, i) < 0) {
            length = i;
        }
        if (compareUnsigned(length, 2147483639) > 0) {
            length = createPositiveCapacity(i);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = context.buffer;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        context.buffer = bArr;
        return bArr;
    }

    public BaseNCodec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b) {
        this(i, i2, i3, i4, b, DECODING_POLICY_DEFAULT);
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b, CodecPolicy codecPolicy) {
        this.PAD = (byte) 61;
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.chunkSeparatorLength = i4;
        this.pad = b;
        Objects.requireNonNull(codecPolicy, "codecPolicy");
        this.decodingPolicy = codecPolicy;
    }

    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.pad == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i = context.pos;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : encode(bArr, 0, bArr.length);
    }

    public byte[] encode(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, i, i2, context);
        encode(bArr, i, -1, context);
        int i3 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i3];
        readResults(bArr2, 0, i3, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (!(obj instanceof byte[])) {
            throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
        }
        return encode((byte[]) obj);
    }

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i, Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[Math.max(i, getDefaultBufferSize())];
            context.pos = 0;
            context.readPos = 0;
        } else {
            int i2 = context.pos;
            if ((i2 + i) - bArr.length > 0) {
                return resizeBuffer(context, i2 + i);
            }
        }
        return context.buffer;
    }

    public CodecPolicy getCodecPolicy() {
        return this.decodingPolicy;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.unencodedBlockSize;
        long j = (((length + i) - 1) / i) * this.encodedBlockSize;
        int i2 = this.lineLength;
        return i2 > 0 ? j + ((((i2 + j) - 1) / i2) * this.chunkSeparatorLength) : j;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        for (byte b : bArr) {
            if (!isInAlphabet(b) && (!z || (b != this.pad && !isWhiteSpace(b)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public boolean isStrictDecoding() {
        return this.decodingPolicy == CodecPolicy.STRICT;
    }

    public int readResults(byte[] bArr, int i, int i2, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int iMin = Math.min(available(context), i2);
        System.arraycopy(context.buffer, context.readPos, bArr, i, iMin);
        int i3 = context.readPos + iMin;
        context.readPos = i3;
        if (i3 >= context.pos) {
            context.buffer = null;
        }
        return iMin;
    }
}
