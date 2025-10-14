package org.apache.commons.codec.binary;

import androidx.media3.extractor.DtsUtil;
import com.google.common.base.Ascii;
import com.thoughtworks.xstream.p042io.binary.Token;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* loaded from: classes7.dex */
public class Base16 extends BaseNCodec {
    public static final int BITS_PER_ENCODED_BYTE = 4;
    public static final int BYTES_PER_ENCODED_BLOCK = 2;
    public static final int BYTES_PER_UNENCODED_BLOCK = 1;
    public static final int MASK_4BITS = 15;
    public final byte[] decodeTable;
    public final byte[] encodeTable;
    public static final byte[] UPPER_CASE_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI};
    public static final byte[] UPPER_CASE_ENCODE_TABLE = {48, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, Token.ID_MASK, 57, 65, 66, 67, 68, 69, 70};
    public static final byte[] LOWER_CASE_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI};
    public static final byte[] LOWER_CASE_ENCODE_TABLE = {48, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, Token.ID_MASK, 57, 97, 98, 99, DtsUtil.FIRST_BYTE_EXTSS_BE, 101, 102};

    public Base16() {
        this(false);
    }

    public Base16(boolean z) {
        this(z, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base16(boolean z, CodecPolicy codecPolicy) {
        super(1, 2, 0, 0, (byte) 61, codecPolicy);
        if (z) {
            this.encodeTable = LOWER_CASE_ENCODE_TABLE;
            this.decodeTable = LOWER_CASE_DECODE_TABLE;
        } else {
            this.encodeTable = UPPER_CASE_ENCODE_TABLE;
            this.decodeTable = UPPER_CASE_DECODE_TABLE;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        if (context.eof || i2 < 0) {
            context.eof = true;
            if (context.ibitWorkArea != 0) {
                validateTrailingCharacter();
                return;
            }
            return;
        }
        int iMin = Math.min(bArr.length - i, i2);
        int i3 = 0;
        int i4 = (context.ibitWorkArea != 0 ? 1 : 0) + iMin;
        if (i4 == 1 && i4 == iMin) {
            context.ibitWorkArea = decodeOctet(bArr[i]) + 1;
            return;
        }
        int i5 = i4 % 2 == 0 ? i4 : i4 - 1;
        byte[] bArrEnsureBufferSize = ensureBufferSize(i5 / 2, context);
        if (iMin < i4) {
            int i6 = i + 1;
            int iDecodeOctet = decodeOctet(bArr[i]) | ((context.ibitWorkArea - 1) << 4);
            int i7 = context.pos;
            context.pos = i7 + 1;
            bArrEnsureBufferSize[i7] = (byte) iDecodeOctet;
            context.ibitWorkArea = 0;
            i3 = 2;
            i = i6;
        }
        while (i3 < i5) {
            int i8 = i + 1;
            int iDecodeOctet2 = decodeOctet(bArr[i]) << 4;
            i += 2;
            int iDecodeOctet3 = decodeOctet(bArr[i8]) | iDecodeOctet2;
            i3 += 2;
            int i9 = context.pos;
            context.pos = i9 + 1;
            bArrEnsureBufferSize[i9] = (byte) iDecodeOctet3;
        }
        if (i3 < iMin) {
            context.ibitWorkArea = decodeOctet(bArr[i3]) + 1;
        }
    }

    public final int decodeOctet(byte b) {
        int i = b & 255;
        byte[] bArr = this.decodeTable;
        byte b2 = i < bArr.length ? bArr[b] : (byte) -1;
        if (b2 != -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid octet in encoded value: " + ((int) b));
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i2 < 0) {
            context.eof = true;
            return;
        }
        int i3 = i2 * 2;
        if (i3 < 0) {
            throw new IllegalArgumentException("Input length exceeds maximum size for encoded data: " + i2);
        }
        byte[] bArrEnsureBufferSize = ensureBufferSize(i3, context);
        int i4 = i2 + i;
        while (i < i4) {
            byte b = bArr[i];
            int i5 = (b >> 4) & 15;
            int i6 = b & Ascii.f786SI;
            int i7 = context.pos;
            byte[] bArr2 = this.encodeTable;
            bArrEnsureBufferSize[i7] = bArr2[i5];
            context.pos = i7 + 2;
            bArrEnsureBufferSize[i7 + 1] = bArr2[i6];
            i++;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        int i = b & 255;
        byte[] bArr = this.decodeTable;
        return i < bArr.length && bArr[b] != -1;
    }

    public final void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character is a valid base 16 alphabetcharacter but not a possible encoding. Decoding requires at least two characters to create one byte.");
        }
    }
}
