package org.apache.commons.codec.binary;

import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.google.common.base.Ascii;
import com.thoughtworks.xstream.p042io.binary.Token;
import java.math.BigInteger;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.net.QCodec;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;

/* loaded from: classes7.dex */
public class Base64 extends BaseNCodec {
    public static final int BITS_PER_ENCODED_BYTE = 6;
    public static final int BYTES_PER_ENCODED_BLOCK = 4;
    public static final int BYTES_PER_UNENCODED_BLOCK = 3;
    public static final int MASK_2BITS = 3;
    public static final int MASK_4BITS = 15;
    public static final int MASK_6BITS = 63;
    public final int decodeSize;
    public final byte[] decodeTable;
    public final int encodeSize;
    public final byte[] encodeTable;
    public final byte[] lineSeparator;
    public static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_MULTIVOLUME, 78, 79, FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_PREFIX_BYTE_MASK, 81, 82, TarConstants.LF_GNUTYPE_SPARSE, 84, 85, 86, 87, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 89, 90, 97, 98, 99, DtsUtil.FIRST_BYTE_EXTSS_BE, 101, 102, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 104, 105, 106, 107, 108, 109, 110, 111, 112, DtsUtil.FIRST_BYTE_UHD_FTOC_NONSYNC_BE, 114, 115, 116, UTF8JsonGenerator.BYTE_u, 118, 119, 120, 121, 122, 48, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, Token.ID_MASK, 57, Cea608Decoder.CTRL_RESUME_TEXT_DISPLAY, 47};
    public static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_MULTIVOLUME, 78, 79, FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_PREFIX_BYTE_MASK, 81, 82, TarConstants.LF_GNUTYPE_SPARSE, 84, 85, 86, 87, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 89, 90, 97, 98, 99, DtsUtil.FIRST_BYTE_EXTSS_BE, 101, 102, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 104, 105, 106, 107, 108, 109, 110, 111, 112, DtsUtil.FIRST_BYTE_UHD_FTOC_NONSYNC_BE, 114, 115, 116, UTF8JsonGenerator.BYTE_u, 118, 119, 120, 121, 122, 48, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, Token.ID_MASK, 57, Cea608Decoder.CTRL_CARRIAGE_RETURN, QCodec.UNDERSCORE};
    public static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, Token.ID_MASK, 57, UTF8JsonGenerator.BYTE_COLON, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, 24, Ascii.f778EM, -1, -1, -1, -1, 63, -1, Ascii.SUB, Ascii.ESC, 28, Ascii.f781GS, Ascii.f785RS, 31, 32, Cea608Decoder.CTRL_BACKSPACE, 34, 35, Cea608Decoder.CTRL_DELETE_TO_END_OF_ROW, 37, Cea608Decoder.CTRL_ROLL_UP_CAPTIONS_3_ROWS, Cea608Decoder.CTRL_ROLL_UP_CAPTIONS_4_ROWS, 40, Cea608Decoder.CTRL_RESUME_DIRECT_CAPTIONING, 42, Cea608Decoder.CTRL_RESUME_TEXT_DISPLAY, 44, Cea608Decoder.CTRL_CARRIAGE_RETURN, Cea608Decoder.CTRL_ERASE_NON_DISPLAYED_MEMORY, 47, 48, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR};

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, BaseNCodec.CHUNK_SEPARATOR, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength > i) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
        }
        return base64.encode(bArr);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInteger");
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b) {
        if (b != 61) {
            if (b >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b >= bArr.length || bArr[b] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !BaseNCodec.isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = iBitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    public Base64() {
        this(0);
    }

    public Base64(boolean z) {
        this(76, BaseNCodec.CHUNK_SEPARATOR, z);
    }

    public Base64(int i) {
        this(i, BaseNCodec.CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base64(int i, byte[] bArr, boolean z, CodecPolicy codecPolicy) {
        super(3, 4, i, bArr == null ? 0 : bArr.length, (byte) 61, codecPolicy);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
            if (i > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        byte b;
        if (context.eof) {
            return;
        }
        if (i2 < 0) {
            context.eof = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.pad) {
                context.eof = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (context.modulus + 1) % 4;
                    context.modulus = i5;
                    int i6 = (context.ibitWorkArea << 6) + b;
                    context.ibitWorkArea = i6;
                    if (i5 == 0) {
                        int i7 = context.pos;
                        bArrEnsureBufferSize[i7] = (byte) ((i6 >> 16) & 255);
                        bArrEnsureBufferSize[i7 + 1] = (byte) ((i6 >> 8) & 255);
                        context.pos = i7 + 3;
                        bArrEnsureBufferSize[i7 + 2] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i8 = context.modulus;
        if (i8 == 1) {
            validateTrailingCharacter();
            return;
        }
        if (i8 == 2) {
            validateCharacter(15, context);
            int i9 = context.ibitWorkArea >> 4;
            context.ibitWorkArea = i9;
            int i10 = context.pos;
            context.pos = i10 + 1;
            bArrEnsureBufferSize2[i10] = (byte) (i9 & 255);
            return;
        }
        if (i8 == 3) {
            validateCharacter(3, context);
            int i11 = context.ibitWorkArea;
            int i12 = i11 >> 2;
            context.ibitWorkArea = i12;
            int i13 = context.pos;
            bArrEnsureBufferSize2[i13] = (byte) ((i11 >> 10) & 255);
            context.pos = i13 + 2;
            bArrEnsureBufferSize2[i13 + 1] = (byte) (i12 & 255);
            return;
        }
        throw new IllegalStateException("Impossible modulus " + context.modulus);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i4 = (context.modulus + 1) % 3;
                context.modulus = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (context.ibitWorkArea << 8) + i6;
                context.ibitWorkArea = i7;
                if (i4 == 0) {
                    int i8 = context.pos;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i8] = bArr2[(i7 >> 18) & 63];
                    bArrEnsureBufferSize[i8 + 1] = bArr2[(i7 >> 12) & 63];
                    int i9 = i8 + 3;
                    bArrEnsureBufferSize[i8 + 2] = bArr2[(i7 >> 6) & 63];
                    int i10 = i8 + 4;
                    context.pos = i10;
                    bArrEnsureBufferSize[i9] = bArr2[i7 & 63];
                    int i11 = context.currentLinePos + 4;
                    context.currentLinePos = i11;
                    int i12 = this.lineLength;
                    if (i12 > 0 && i12 <= i11) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i10, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i13 = context.pos;
        int i14 = context.modulus;
        if (i14 != 0) {
            if (i14 == 1) {
                byte[] bArr4 = this.encodeTable;
                int i15 = context.ibitWorkArea;
                bArrEnsureBufferSize2[i13] = bArr4[(i15 >> 2) & 63];
                int i16 = i13 + 2;
                context.pos = i16;
                bArrEnsureBufferSize2[i13 + 1] = bArr4[(i15 << 4) & 63];
                if (bArr4 == STANDARD_ENCODE_TABLE) {
                    byte b = this.pad;
                    bArrEnsureBufferSize2[i16] = b;
                    context.pos = i13 + 4;
                    bArrEnsureBufferSize2[i13 + 3] = b;
                }
            } else if (i14 == 2) {
                byte[] bArr5 = this.encodeTable;
                int i17 = context.ibitWorkArea;
                bArrEnsureBufferSize2[i13] = bArr5[(i17 >> 10) & 63];
                bArrEnsureBufferSize2[i13 + 1] = bArr5[(i17 >> 4) & 63];
                int i18 = i13 + 3;
                context.pos = i18;
                bArrEnsureBufferSize2[i13 + 2] = bArr5[(i17 << 2) & 63];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    context.pos = i13 + 4;
                    bArrEnsureBufferSize2[i18] = this.pad;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
        }
        int i19 = context.currentLinePos;
        int i20 = context.pos;
        int i21 = i19 + (i20 - i13);
        context.currentLinePos = i21;
        if (this.lineLength <= 0 || i21 <= 0) {
            return;
        }
        byte[] bArr6 = this.lineSeparator;
        System.arraycopy(bArr6, 0, bArrEnsureBufferSize2, i20, bArr6.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.decodeTable;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    public final void validateCharacter(int i, BaseNCodec.Context context) {
        if (isStrictDecoding() && (i & context.ibitWorkArea) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    private void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
        }
    }
}
