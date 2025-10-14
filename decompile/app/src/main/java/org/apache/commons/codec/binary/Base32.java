package org.apache.commons.codec.binary;

import com.google.common.base.Ascii;
import com.thoughtworks.xstream.p042io.binary.Token;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;

/* loaded from: classes7.dex */
public class Base32 extends BaseNCodec {
    public static final int BITS_PER_ENCODED_BYTE = 5;
    public static final int BYTES_PER_ENCODED_BLOCK = 8;
    public static final int BYTES_PER_UNENCODED_BLOCK = 5;
    public static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, 28, Ascii.f781GS, Ascii.f785RS, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, 24, Ascii.f778EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, 24, Ascii.f778EM};
    public static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_MULTIVOLUME, 78, 79, FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_PREFIX_BYTE_MASK, 81, 82, TarConstants.LF_GNUTYPE_SPARSE, 84, 85, 86, 87, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 89, 90, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG};
    public static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, 24, Ascii.f778EM, Ascii.SUB, Ascii.ESC, 28, Ascii.f781GS, Ascii.f785RS, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, Ascii.f787SO, Ascii.f786SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, 24, Ascii.f778EM, Ascii.SUB, Ascii.ESC, 28, Ascii.f781GS, Ascii.f785RS, 31};
    public static final byte[] HEX_ENCODE_TABLE = {48, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, Token.ID_MASK, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_MULTIVOLUME, 78, 79, FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_PREFIX_BYTE_MASK, 81, 82, TarConstants.LF_GNUTYPE_SPARSE, 84, 85, 86};
    public static final long MASK_1BITS = 1;
    public static final long MASK_2BITS = 3;
    public static final long MASK_3BITS = 7;
    public static final long MASK_4BITS = 15;
    public static final int MASK_5BITS = 31;
    public final int decodeSize;
    public final byte[] decodeTable;
    public final int encodeSize;
    public final byte[] encodeTable;
    public final byte[] lineSeparator;

    public Base32() {
        this(false);
    }

    public Base32(boolean z) {
        this(0, null, z, (byte) 61);
    }

    public Base32(boolean z, byte b) {
        this(0, null, z, b);
    }

    public Base32(byte b) {
        this(false, b);
    }

    public Base32(int i) {
        this(i, BaseNCodec.CHUNK_SEPARATOR);
    }

    public Base32(int i, byte[] bArr) {
        this(i, bArr, false, (byte) 61);
    }

    public Base32(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, (byte) 61);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b) {
        this(i, bArr, z, b, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b, CodecPolicy codecPolicy) {
        super(5, 8, i, bArr == null ? 0 : bArr.length, b, codecPolicy);
        if (z) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else {
            if (bArr == null) {
                throw new IllegalArgumentException("lineLength " + i + " > 0, but lineSeparator is null");
            }
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
            this.encodeSize = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.lineSeparator = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.decodeSize = this.encodeSize - 1;
        if (isInAlphabet(b) || BaseNCodec.isWhiteSpace(b)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        byte b;
        if (context.eof) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            context.eof = true;
        }
        int i3 = 0;
        int i4 = i;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == this.pad) {
                context.eof = r3;
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.decodeSize, context);
            if (b2 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (context.modulus + r3) % 8;
                    context.modulus = i6;
                    context.lbitWorkArea = (context.lbitWorkArea << 5) + b;
                    if (i6 == 0) {
                        int i7 = context.pos;
                        bArrEnsureBufferSize[i7] = (byte) ((r12 >> 32) & 255);
                        bArrEnsureBufferSize[i7 + 1] = (byte) ((r12 >> 24) & 255);
                        bArrEnsureBufferSize[i7 + 2] = (byte) ((r12 >> 16) & 255);
                        bArrEnsureBufferSize[i7 + 3] = (byte) ((r12 >> 8) & 255);
                        context.pos = i7 + 5;
                        bArrEnsureBufferSize[i7 + 4] = (byte) (r12 & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
            r3 = 1;
        }
        if (!context.eof || context.modulus <= 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        switch (context.modulus) {
            case 1:
                validateTrailingCharacters();
                break;
            case 2:
                break;
            case 3:
                validateTrailingCharacters();
                int i8 = context.pos;
                context.pos = i8 + 1;
                bArrEnsureBufferSize2[i8] = (byte) ((context.lbitWorkArea >> 7) & 255);
                return;
            case 4:
                validateCharacter(15L, context);
                context.lbitWorkArea = context.lbitWorkArea >> 4;
                int i9 = context.pos;
                bArrEnsureBufferSize2[i9] = (byte) ((r9 >> 12) & 255);
                context.pos = i9 + 2;
                bArrEnsureBufferSize2[i9 + 1] = (byte) (r3 & 255);
                return;
            case 5:
                validateCharacter(1L, context);
                context.lbitWorkArea = context.lbitWorkArea >> 1;
                int i10 = context.pos;
                bArrEnsureBufferSize2[i10] = (byte) ((r3 >> 17) & 255);
                bArrEnsureBufferSize2[i10 + 1] = (byte) ((r3 >> 9) & 255);
                context.pos = i10 + 3;
                bArrEnsureBufferSize2[i10 + 2] = (byte) (r8 & 255);
                return;
            case 6:
                validateTrailingCharacters();
                context.lbitWorkArea = context.lbitWorkArea >> 6;
                int i11 = context.pos;
                bArrEnsureBufferSize2[i11] = (byte) ((r3 >> 22) & 255);
                bArrEnsureBufferSize2[i11 + 1] = (byte) ((r3 >> 14) & 255);
                context.pos = i11 + 3;
                bArrEnsureBufferSize2[i11 + 2] = (byte) (r8 & 255);
                return;
            case 7:
                validateCharacter(7L, context);
                context.lbitWorkArea = context.lbitWorkArea >> 3;
                int i12 = context.pos;
                bArrEnsureBufferSize2[i12] = (byte) ((r8 >> 27) & 255);
                bArrEnsureBufferSize2[i12 + 1] = (byte) ((r8 >> 19) & 255);
                bArrEnsureBufferSize2[i12 + 2] = (byte) ((r8 >> 11) & 255);
                context.pos = i12 + 4;
                bArrEnsureBufferSize2[i12 + 3] = (byte) (r10 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
        validateCharacter(3L, context);
        int i13 = context.pos;
        context.pos = i13 + 1;
        bArrEnsureBufferSize2[i13] = (byte) ((context.lbitWorkArea >> 2) & 255);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        boolean z;
        int i3;
        if (context.eof) {
            return;
        }
        boolean z2 = false;
        int i4 = 1;
        if (i2 >= 0) {
            int i5 = i;
            int i6 = 0;
            while (i6 < i2) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i7 = (context.modulus + i4) % 5;
                context.modulus = i7;
                int i8 = i5 + 1;
                int i9 = bArr[i5];
                if (i9 < 0) {
                    i9 += 256;
                }
                long j = (context.lbitWorkArea << 8) + i9;
                context.lbitWorkArea = j;
                if (i7 == 0) {
                    int i10 = context.pos;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i10] = bArr2[((int) (j >> 35)) & 31];
                    i3 = i8;
                    bArrEnsureBufferSize[i10 + 1] = bArr2[((int) (j >> 30)) & 31];
                    bArrEnsureBufferSize[i10 + 2] = bArr2[((int) (j >> 25)) & 31];
                    bArrEnsureBufferSize[i10 + 3] = bArr2[((int) (j >> 20)) & 31];
                    bArrEnsureBufferSize[i10 + 4] = bArr2[((int) (j >> 15)) & 31];
                    bArrEnsureBufferSize[i10 + 5] = bArr2[((int) (j >> 10)) & 31];
                    int i11 = i10 + 7;
                    bArrEnsureBufferSize[i10 + 6] = bArr2[((int) (j >> 5)) & 31];
                    int i12 = i10 + 8;
                    context.pos = i12;
                    bArrEnsureBufferSize[i11] = bArr2[((int) j) & 31];
                    int i13 = context.currentLinePos + 8;
                    context.currentLinePos = i13;
                    int i14 = this.lineLength;
                    if (i14 <= 0 || i14 > i13) {
                        z = false;
                    } else {
                        byte[] bArr3 = this.lineSeparator;
                        z = false;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i12, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                } else {
                    z = z2;
                    i3 = i8;
                }
                i6++;
                z2 = z;
                i5 = i3;
                i4 = 1;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i15 = context.pos;
        int i16 = context.modulus;
        if (i16 != 0) {
            if (i16 == 1) {
                byte[] bArr4 = this.encodeTable;
                long j2 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i15] = bArr4[((int) (j2 >> 3)) & 31];
                bArrEnsureBufferSize2[i15 + 1] = bArr4[((int) (j2 << 2)) & 31];
                byte b = this.pad;
                bArrEnsureBufferSize2[i15 + 2] = b;
                bArrEnsureBufferSize2[i15 + 3] = b;
                bArrEnsureBufferSize2[i15 + 4] = b;
                bArrEnsureBufferSize2[i15 + 5] = b;
                bArrEnsureBufferSize2[i15 + 6] = b;
                context.pos = i15 + 8;
                bArrEnsureBufferSize2[i15 + 7] = b;
            } else if (i16 == 2) {
                byte[] bArr5 = this.encodeTable;
                long j3 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i15] = bArr5[((int) (j3 >> 11)) & 31];
                bArrEnsureBufferSize2[i15 + 1] = bArr5[((int) (j3 >> 6)) & 31];
                bArrEnsureBufferSize2[i15 + 2] = bArr5[((int) (j3 >> 1)) & 31];
                bArrEnsureBufferSize2[i15 + 3] = bArr5[((int) (j3 << 4)) & 31];
                byte b2 = this.pad;
                bArrEnsureBufferSize2[i15 + 4] = b2;
                bArrEnsureBufferSize2[i15 + 5] = b2;
                bArrEnsureBufferSize2[i15 + 6] = b2;
                context.pos = i15 + 8;
                bArrEnsureBufferSize2[i15 + 7] = b2;
            } else if (i16 == 3) {
                byte[] bArr6 = this.encodeTable;
                long j4 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i15] = bArr6[((int) (j4 >> 19)) & 31];
                bArrEnsureBufferSize2[i15 + 1] = bArr6[((int) (j4 >> 14)) & 31];
                bArrEnsureBufferSize2[i15 + 2] = bArr6[((int) (j4 >> 9)) & 31];
                bArrEnsureBufferSize2[i15 + 3] = bArr6[((int) (j4 >> 4)) & 31];
                bArrEnsureBufferSize2[i15 + 4] = bArr6[((int) (j4 << 1)) & 31];
                byte b3 = this.pad;
                bArrEnsureBufferSize2[i15 + 5] = b3;
                bArrEnsureBufferSize2[i15 + 6] = b3;
                context.pos = i15 + 8;
                bArrEnsureBufferSize2[i15 + 7] = b3;
            } else if (i16 == 4) {
                byte[] bArr7 = this.encodeTable;
                long j5 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i15] = bArr7[((int) (j5 >> 27)) & 31];
                bArrEnsureBufferSize2[i15 + 1] = bArr7[((int) (j5 >> 22)) & 31];
                bArrEnsureBufferSize2[i15 + 2] = bArr7[((int) (j5 >> 17)) & 31];
                bArrEnsureBufferSize2[i15 + 3] = bArr7[((int) (j5 >> 12)) & 31];
                bArrEnsureBufferSize2[i15 + 4] = bArr7[((int) (j5 >> 7)) & 31];
                bArrEnsureBufferSize2[i15 + 5] = bArr7[((int) (j5 >> 2)) & 31];
                bArrEnsureBufferSize2[i15 + 6] = bArr7[((int) (j5 << 3)) & 31];
                context.pos = i15 + 8;
                bArrEnsureBufferSize2[i15 + 7] = this.pad;
            } else {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
        }
        int i17 = context.currentLinePos;
        int i18 = context.pos;
        int i19 = i17 + (i18 - i15);
        context.currentLinePos = i19;
        if (this.lineLength <= 0 || i19 <= 0) {
            return;
        }
        byte[] bArr8 = this.lineSeparator;
        System.arraycopy(bArr8, 0, bArrEnsureBufferSize2, i18, bArr8.length);
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

    public final void validateCharacter(long j, BaseNCodec.Context context) {
        if (isStrictDecoding() && (j & context.lbitWorkArea) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    public final void validateTrailingCharacters() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
        }
    }
}
