package org.apache.commons.compress.harmony.pack200;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;

/* loaded from: classes7.dex */
public class CodecEncoding {
    public static final BHSDCodec[] canonicalCodec = {null, new BHSDCodec(1, 256), new BHSDCodec(1, 256, 1), new BHSDCodec(1, 256, 0, 1), new BHSDCodec(1, 256, 1, 1), new BHSDCodec(2, 256), new BHSDCodec(2, 256, 1), new BHSDCodec(2, 256, 0, 1), new BHSDCodec(2, 256, 1, 1), new BHSDCodec(3, 256), new BHSDCodec(3, 256, 1), new BHSDCodec(3, 256, 0, 1), new BHSDCodec(3, 256, 1, 1), new BHSDCodec(4, 256), new BHSDCodec(4, 256, 1), new BHSDCodec(4, 256, 0, 1), new BHSDCodec(4, 256, 1, 1), new BHSDCodec(5, 4), new BHSDCodec(5, 4, 1), new BHSDCodec(5, 4, 2), new BHSDCodec(5, 16), new BHSDCodec(5, 16, 1), new BHSDCodec(5, 16, 2), new BHSDCodec(5, 32), new BHSDCodec(5, 32, 1), new BHSDCodec(5, 32, 2), new BHSDCodec(5, 64), new BHSDCodec(5, 64, 1), new BHSDCodec(5, 64, 2), new BHSDCodec(5, 128), new BHSDCodec(5, 128, 1), new BHSDCodec(5, 128, 2), new BHSDCodec(5, 4, 0, 1), new BHSDCodec(5, 4, 1, 1), new BHSDCodec(5, 4, 2, 1), new BHSDCodec(5, 16, 0, 1), new BHSDCodec(5, 16, 1, 1), new BHSDCodec(5, 16, 2, 1), new BHSDCodec(5, 32, 0, 1), new BHSDCodec(5, 32, 1, 1), new BHSDCodec(5, 32, 2, 1), new BHSDCodec(5, 64, 0, 1), new BHSDCodec(5, 64, 1, 1), new BHSDCodec(5, 64, 2, 1), new BHSDCodec(5, 128, 0, 1), new BHSDCodec(5, 128, 1, 1), new BHSDCodec(5, 128, 2, 1), new BHSDCodec(2, 192), new BHSDCodec(2, 224), new BHSDCodec(2, 240), new BHSDCodec(2, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER), new BHSDCodec(2, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER), new BHSDCodec(2, 8, 0, 1), new BHSDCodec(2, 8, 1, 1), new BHSDCodec(2, 16, 0, 1), new BHSDCodec(2, 16, 1, 1), new BHSDCodec(2, 32, 0, 1), new BHSDCodec(2, 32, 1, 1), new BHSDCodec(2, 64, 0, 1), new BHSDCodec(2, 64, 1, 1), new BHSDCodec(2, 128, 0, 1), new BHSDCodec(2, 128, 1, 1), new BHSDCodec(2, 192, 0, 1), new BHSDCodec(2, 192, 1, 1), new BHSDCodec(2, 224, 0, 1), new BHSDCodec(2, 224, 1, 1), new BHSDCodec(2, 240, 0, 1), new BHSDCodec(2, 240, 1, 1), new BHSDCodec(2, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 0, 1), new BHSDCodec(2, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 1, 1), new BHSDCodec(3, 192), new BHSDCodec(3, 224), new BHSDCodec(3, 240), new BHSDCodec(3, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER), new BHSDCodec(3, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER), new BHSDCodec(3, 8, 0, 1), new BHSDCodec(3, 8, 1, 1), new BHSDCodec(3, 16, 0, 1), new BHSDCodec(3, 16, 1, 1), new BHSDCodec(3, 32, 0, 1), new BHSDCodec(3, 32, 1, 1), new BHSDCodec(3, 64, 0, 1), new BHSDCodec(3, 64, 1, 1), new BHSDCodec(3, 128, 0, 1), new BHSDCodec(3, 128, 1, 1), new BHSDCodec(3, 192, 0, 1), new BHSDCodec(3, 192, 1, 1), new BHSDCodec(3, 224, 0, 1), new BHSDCodec(3, 224, 1, 1), new BHSDCodec(3, 240, 0, 1), new BHSDCodec(3, 240, 1, 1), new BHSDCodec(3, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 0, 1), new BHSDCodec(3, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 1, 1), new BHSDCodec(4, 192), new BHSDCodec(4, 224), new BHSDCodec(4, 240), new BHSDCodec(4, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER), new BHSDCodec(4, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER), new BHSDCodec(4, 8, 0, 1), new BHSDCodec(4, 8, 1, 1), new BHSDCodec(4, 16, 0, 1), new BHSDCodec(4, 16, 1, 1), new BHSDCodec(4, 32, 0, 1), new BHSDCodec(4, 32, 1, 1), new BHSDCodec(4, 64, 0, 1), new BHSDCodec(4, 64, 1, 1), new BHSDCodec(4, 128, 0, 1), new BHSDCodec(4, 128, 1, 1), new BHSDCodec(4, 192, 0, 1), new BHSDCodec(4, 192, 1, 1), new BHSDCodec(4, 224, 0, 1), new BHSDCodec(4, 224, 1, 1), new BHSDCodec(4, 240, 0, 1), new BHSDCodec(4, 240, 1, 1), new BHSDCodec(4, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 0, 1), new BHSDCodec(4, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 1, 1)};
    public static Map<BHSDCodec, Integer> canonicalCodecsToSpecifiers;

    public static Codec getCodec(int i, InputStream inputStream, Codec codec) throws Pack200Exception, IOException {
        boolean z;
        BHSDCodec[] bHSDCodecArr = canonicalCodec;
        if (bHSDCodecArr.length != 116) {
            throw new Error("Canonical encodings have been incorrectly modified");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Encoding cannot be less than zero");
        }
        if (i == 0) {
            return codec;
        }
        if (i <= 115) {
            return bHSDCodecArr[i];
        }
        if (i == 116) {
            int i2 = inputStream.read();
            if (i2 == -1) {
                throw new EOFException("End of buffer read whilst trying to decode codec");
            }
            int i3 = i2 & 1;
            int i4 = (i2 >> 1) & 3;
            int i5 = ((i2 >> 3) & 7) + 1;
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw new EOFException("End of buffer read whilst trying to decode codec");
            }
            return new BHSDCodec(i5, i6 + 1, i4, i3);
        }
        if (i >= 117 && i <= 140) {
            int i7 = i - 117;
            int i8 = i7 & 3;
            boolean z2 = ((i7 >> 2) & 1) == 1;
            boolean z3 = ((i7 >> 3) & 1) == 1;
            z = ((i7 >> 4) & 1) == 1;
            if (z3 && z) {
                throw new Pack200Exception("ADef and BDef should never both be true");
            }
            int iPow = ((z2 ? inputStream.read() : 3) + 1) * ((int) Math.pow(16.0d, i8));
            Codec codec2 = z3 ? codec : getCodec(inputStream.read(), inputStream, codec);
            if (!z) {
                codec = getCodec(inputStream.read(), inputStream, codec);
            }
            return new RunCodec(iPow, codec2, codec);
        }
        if (i < 141 || i > 188) {
            throw new Pack200Exception("Invalid codec encoding byte (" + i + ") found");
        }
        int i9 = i - Cea708Decoder.COMMAND_DLY;
        boolean z4 = (i9 & 1) == 1;
        boolean z5 = ((i9 >> 1) & 1) == 1;
        int i10 = i9 >> 2;
        z = i10 != 0;
        int i11 = new int[]{0, 4, 8, 16, 32, 64, 128, 192, 224, 240, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER}[i10];
        if (z) {
            Codec codec3 = z4 ? codec : getCodec(inputStream.read(), inputStream, codec);
            if (!z5) {
                codec = getCodec(inputStream.read(), inputStream, codec);
            }
            return new PopulationCodec(codec3, i11, codec);
        }
        Codec codec4 = z4 ? codec : getCodec(inputStream.read(), inputStream, codec);
        Codec codec5 = getCodec(inputStream.read(), inputStream, codec);
        if (!z5) {
            codec = getCodec(inputStream.read(), inputStream, codec);
        }
        return new PopulationCodec(codec4, codec5, codec);
    }

    public static int getSpecifierForDefaultCodec(BHSDCodec bHSDCodec) {
        return getSpecifier(bHSDCodec, null)[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] getSpecifier(Codec codec, Codec codec2) {
        int iBinarySearch;
        int i;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 0;
        if (canonicalCodecsToSpecifiers == null) {
            HashMap map = new HashMap(canonicalCodec.length);
            int i6 = 0;
            while (true) {
                BHSDCodec[] bHSDCodecArr = canonicalCodec;
                if (i6 >= bHSDCodecArr.length) {
                    break;
                }
                map.put(bHSDCodecArr[i6], Integer.valueOf(i6));
                i6++;
            }
            canonicalCodecsToSpecifiers = map;
        }
        if (canonicalCodecsToSpecifiers.containsKey(codec)) {
            return new int[]{canonicalCodecsToSpecifiers.get(codec).intValue()};
        }
        if (codec instanceof BHSDCodec) {
            BHSDCodec bHSDCodec = (BHSDCodec) codec;
            return new int[]{116, (bHSDCodec.isDelta() ? 1 : 0) + (bHSDCodec.getS() * 2) + ((bHSDCodec.getB() - 1) * 8), bHSDCodec.getH() - 1};
        }
        if (codec instanceof RunCodec) {
            RunCodec runCodec = (RunCodec) codec;
            int k = runCodec.getK();
            if (k <= 256) {
                i = k - 1;
                i2 = 0;
            } else if (k <= 4096) {
                i = (k / 16) - 1;
                i2 = 1;
            } else if (k <= 65536) {
                i = (k / 256) - 1;
                i2 = 2;
            } else {
                i = (k / 4096) - 1;
                i2 = 3;
            }
            Codec aCodec = runCodec.getACodec();
            Codec bCodec = runCodec.getBCodec();
            if (aCodec.equals(codec2)) {
                i3 = 1;
            } else {
                i3 = bCodec.equals(codec2) ? 2 : 0;
            }
            int i7 = i2 + 117 + (i == 3 ? 0 : 4) + (i3 * 8);
            int[] specifier = i3 == 1 ? new int[0] : getSpecifier(aCodec, codec2);
            int[] specifier2 = i3 == 2 ? new int[0] : getSpecifier(bCodec, codec2);
            int[] iArr = new int[(i == 3 ? 0 : 1) + 1 + specifier.length + specifier2.length];
            iArr[0] = i7;
            if (i != 3) {
                iArr[1] = i;
            } else {
                i4 = 1;
            }
            for (int i8 : specifier) {
                iArr[i4] = i8;
                i4++;
            }
            int length = specifier2.length;
            while (i5 < length) {
                iArr[i4] = specifier2[i5];
                i4++;
                i5++;
            }
            return iArr;
        }
        if (!(codec instanceof PopulationCodec)) {
            return null;
        }
        PopulationCodec populationCodec = (PopulationCodec) codec;
        Codec tokenCodec = populationCodec.getTokenCodec();
        Codec favouredCodec = populationCodec.getFavouredCodec();
        Codec unfavouredCodec = populationCodec.getUnfavouredCodec();
        boolean zEquals = favouredCodec.equals(codec2);
        boolean zEquals2 = unfavouredCodec.equals(codec2);
        if (populationCodec.getFavoured() == null) {
            iBinarySearch = 0;
        } else if (tokenCodec == Codec.BYTE1) {
            iBinarySearch = 1;
        } else if (tokenCodec instanceof BHSDCodec) {
            BHSDCodec bHSDCodec2 = (BHSDCodec) tokenCodec;
            if (bHSDCodec2.getS() != 0 || (iBinarySearch = Arrays.binarySearch(new int[]{4, 8, 16, 32, 64, 128, 192, 224, 240, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER}, 256 - bHSDCodec2.getH())) == -1) {
            }
        }
        int i9 = (zEquals ? 1 : 0) + Cea708Decoder.COMMAND_DLY + (2 * (zEquals2 ? 1 : 0)) + (4 * iBinarySearch);
        int[] specifier3 = zEquals ? new int[0] : getSpecifier(favouredCodec, codec2);
        int[] specifier4 = iBinarySearch != 0 ? new int[0] : getSpecifier(tokenCodec, codec2);
        int[] specifier5 = zEquals2 ? new int[0] : getSpecifier(unfavouredCodec, codec2);
        int[] iArr2 = new int[specifier3.length + 1 + specifier5.length + specifier4.length];
        iArr2[0] = i9;
        int i10 = 1;
        for (int i11 : specifier3) {
            iArr2[i10] = i11;
            i10++;
        }
        for (int i12 : specifier4) {
            iArr2[i10] = i12;
            i10++;
        }
        int length2 = specifier5.length;
        while (i5 < length2) {
            iArr2[i10] = specifier5[i5];
            i10++;
            i5++;
        }
        return iArr2;
    }

    public static BHSDCodec getCanonicalCodec(int i) {
        return canonicalCodec[i];
    }
}
