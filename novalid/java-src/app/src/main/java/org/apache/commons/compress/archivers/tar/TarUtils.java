package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.http.client.utils.URLEncodedUtils;

/* loaded from: classes5.dex */
public class TarUtils {
    public static final int BYTE_MASK = 255;
    public static final ZipEncoding DEFAULT_ENCODING = ZipEncodingHelper.getZipEncoding(null);
    public static final ZipEncoding FALLBACK_ENCODING = new ZipEncoding() { // from class: org.apache.commons.compress.archivers.tar.TarUtils.1
        @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
        public boolean canEncode(String str) {
            return true;
        }

        @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
        public ByteBuffer encode(String str) {
            int length = str.length();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) str.charAt(i);
            }
            return ByteBuffer.wrap(bArr);
        }

        @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
        public String decode(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b : bArr) {
                if (b == 0) {
                    break;
                }
                sb.append((char) (b & 255));
            }
            return sb.toString();
        }
    };

    public static long parseOctal(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException("Length " + i2 + " must be at least 2");
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b = bArr[i3 - 1];
        while (i4 < i3 && (b == 0 || b == 32)) {
            b = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b2 = bArr[i4];
            if (b2 < 48 || b2 > 55) {
                throw new IllegalArgumentException(exceptionMessage(bArr, i, i2, i4, b2));
            }
            j = (j << 3) + (b2 - 48);
            i4++;
        }
        return j;
    }

    public static long parseOctalOrBinary(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        if ((b & 128) == 0) {
            return parseOctal(bArr, i, i2);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            return parseBinaryLong(bArr, i, i2, z);
        }
        return parseBinaryBigInteger(bArr, i, i2, z);
    }

    public static long parseBinaryLong(byte[] bArr, int i, int i2, boolean z) {
        if (i2 >= 9) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long jPow = 0;
        for (int i3 = 1; i3 < i2; i3++) {
            jPow = (jPow << 8) + (bArr[i + i3] & 255);
        }
        if (z) {
            jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, (i2 - 1) * 8.0d)) - 1);
        }
        return z ? -jPow : jPow;
    }

    public static long parseBinaryBigInteger(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 1, bArr2, 0, i3);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    public static boolean parseBoolean(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    public static String exceptionMessage(byte[] bArr, int i, int i2, int i3, byte b) {
        return "Invalid byte " + ((int) b) + " at offset " + (i3 - i) + " in '" + new String(bArr, i, i2, Charset.defaultCharset()).replace("\u0000", "{NUL}") + "' len=" + i2;
    }

    public static String parseName(byte[] bArr, int i, int i2) {
        try {
            try {
                return parseName(bArr, i, i2, DEFAULT_ENCODING);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (IOException unused) {
            return parseName(bArr, i, i2, FALLBACK_ENCODING);
        }
    }

    public static String parseName(byte[] bArr, int i, int i2, ZipEncoding zipEncoding) throws IOException {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return zipEncoding.decode(bArr2);
        }
        return "";
    }

    public static TarArchiveStructSparse parseSparse(byte[] bArr, int i) {
        return new TarArchiveStructSparse(parseOctalOrBinary(bArr, i, 12), parseOctalOrBinary(bArr, i + 12, 12));
    }

    public static List<TarArchiveStructSparse> readSparseStructs(byte[] bArr, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                TarArchiveStructSparse sparse = parseSparse(bArr, (i3 * 24) + i);
                if (sparse.getOffset() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (sparse.getNumbytes() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(sparse);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int formatNameBytes(String str, byte[] bArr, int i, int i2) {
        try {
            try {
                return formatNameBytes(str, bArr, i, i2, DEFAULT_ENCODING);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (IOException unused) {
            return formatNameBytes(str, bArr, i, i2, FALLBACK_ENCODING);
        }
    }

    public static int formatNameBytes(String str, byte[] bArr, int i, int i2, ZipEncoding zipEncoding) throws IOException {
        int length = str.length();
        ByteBuffer byteBufferEncode = zipEncoding.encode(str);
        while (byteBufferEncode.limit() > i2 && length > 0) {
            length--;
            byteBufferEncode = zipEncoding.encode(str.substring(0, length));
        }
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        System.arraycopy(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), bArr, i, iLimit);
        while (iLimit < i2) {
            bArr[i + iLimit] = 0;
            iLimit++;
        }
        return i + i2;
    }

    public static void formatUnsignedOctalString(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        if (j == 0) {
            i3 = i2 - 2;
            bArr[i4 + i] = 48;
        } else {
            long j2 = j;
            while (i4 >= 0 && j2 != 0) {
                bArr[i + i4] = (byte) (((byte) (7 & j2)) + 48);
                j2 >>>= 3;
                i4--;
            }
            if (j2 != 0) {
                throw new IllegalArgumentException(j + URLEncodedUtils.NAME_VALUE_SEPARATOR + Long.toOctalString(j) + " will not fit in octal number buffer of length " + i2);
            }
            i3 = i4;
        }
        while (i3 >= 0) {
            bArr[i + i3] = 48;
            i3--;
        }
    }

    public static int formatOctalBytes(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 - 2;
        formatUnsignedOctalString(j, bArr, i, i3);
        bArr[i3 + i] = 32;
        bArr[(i2 - 1) + i] = 0;
        return i + i2;
    }

    public static int formatLongOctalBytes(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 - 1;
        formatUnsignedOctalString(j, bArr, i, i3);
        bArr[i3 + i] = 32;
        return i + i2;
    }

    public static int formatLongOctalOrBinaryBytes(long j, byte[] bArr, int i, int i2) {
        long j2 = i2 == 8 ? 2097151L : TarConstants.MAXSIZE;
        boolean z = j < 0;
        if (!z && j <= j2) {
            return formatLongOctalBytes(j, bArr, i, i2);
        }
        if (i2 < 9) {
            formatLongBinary(j, bArr, i, i2, z);
        } else {
            formatBigIntegerBinary(j, bArr, i, i2, z);
        }
        bArr[i] = (byte) (z ? 255 : 128);
        return i + i2;
    }

    public static void formatLongBinary(long j, byte[] bArr, int i, int i2, boolean z) {
        int i3 = (i2 - 1) * 8;
        long j2 = 1 << i3;
        long jAbs = Math.abs(j);
        if (jAbs < 0 || jAbs >= j2) {
            throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
        }
        if (z) {
            jAbs = ((jAbs ^ (j2 - 1)) + 1) | (255 << i3);
        }
        for (int i4 = (i2 + i) - 1; i4 >= i; i4--) {
            bArr[i4] = (byte) jAbs;
            jAbs >>= 8;
        }
    }

    public static void formatBigIntegerBinary(long j, byte[] bArr, int i, int i2, boolean z) {
        byte[] byteArray = BigInteger.valueOf(j).toByteArray();
        int length = byteArray.length;
        if (length > i2 - 1) {
            throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
        }
        int i3 = (i2 + i) - length;
        System.arraycopy(byteArray, 0, bArr, i3, length);
        byte b = (byte) (z ? 255 : 0);
        while (true) {
            i++;
            if (i >= i3) {
                return;
            } else {
                bArr[i] = b;
            }
        }
    }

    public static int formatCheckSumOctalBytes(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 - 2;
        formatUnsignedOctalString(j, bArr, i, i3);
        bArr[i3 + i] = 0;
        bArr[(i2 - 1) + i] = 32;
        return i + i2;
    }

    public static long computeCheckSum(byte[] bArr) {
        long j = 0;
        for (byte b : bArr) {
            j += b & 255;
        }
        return j;
    }

    public static boolean verifyCheckSum(byte[] bArr) {
        long octal = parseOctal(bArr, TarConstants.CHKSUM_OFFSET, 8);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (148 <= i && i < 156) {
                b = 32;
            }
            j += b & 255;
            j2 += b;
        }
        return octal == j || octal == j2;
    }

    @Deprecated
    public static Map<String, String> parsePaxHeaders(InputStream inputStream, List<TarArchiveStructSparse> list, Map<String, String> map) throws IOException {
        return parsePaxHeaders(inputStream, list, map, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
    
        throw new java.io.IOException("Failed to read Paxheader. Encountered a non-number while reading length");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> parsePaxHeaders(InputStream inputStream, List<TarArchiveStructSparse> list, Map<String, String> map, long j) throws IOException, NumberFormatException {
        int i;
        int i2;
        int i3;
        long j2;
        HashMap map2 = new HashMap(map);
        int i4 = 0;
        int i5 = 0;
        Long lValueOf = null;
        loop0: while (true) {
            int i6 = i4;
            int i7 = i6;
            while (true) {
                i = inputStream.read();
                int i8 = -1;
                long j3 = 0;
                if (i == -1) {
                    break;
                }
                i6++;
                i5++;
                if (i == 10) {
                    i2 = -1;
                    break;
                }
                if (i == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        i3 = inputStream.read();
                        if (i3 == i8) {
                            break;
                        }
                        i6++;
                        i5++;
                        if (i5 < 0 || (j >= j3 && i5 >= j)) {
                            break;
                        }
                        if (i3 == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int i9 = i7 - i6;
                            if (i9 <= 1) {
                                map2.remove(string);
                            } else {
                                if (j >= j3 && i9 > j - i5) {
                                    throw new IOException("Paxheader value size " + i9 + " exceeds size of header record");
                                }
                                byte[] range = IOUtils.readRange(inputStream, i9);
                                int length = range.length;
                                if (length != i9) {
                                    throw new IOException("Failed to read Paxheader. Expected " + i9 + " bytes, read " + length);
                                }
                                i5 += i9;
                                int i10 = i9 - 1;
                                if (range[i10] != 10) {
                                    throw new IOException("Failed to read Paxheader.Value should end with a newline");
                                }
                                String str = new String(range, i4, i10, StandardCharsets.UTF_8);
                                map2.put(string, str);
                                if (string.equals("GNU.sparse.offset")) {
                                    if (lValueOf != null) {
                                        j2 = 0;
                                        list.add(new TarArchiveStructSparse(lValueOf.longValue(), 0L));
                                    } else {
                                        j2 = 0;
                                    }
                                    try {
                                        lValueOf = Long.valueOf(str);
                                        if (lValueOf.longValue() < j2) {
                                            throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains negative value");
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value");
                                    }
                                }
                                if (string.equals("GNU.sparse.numbytes")) {
                                    if (lValueOf == null) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.");
                                    }
                                    try {
                                        long j4 = Long.parseLong(str);
                                        if (j4 < 0) {
                                            throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                                        }
                                        list.add(new TarArchiveStructSparse(lValueOf.longValue(), j4));
                                        lValueOf = null;
                                    } catch (NumberFormatException unused2) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains a non-numeric value.");
                                    }
                                }
                            }
                        } else {
                            byteArrayOutputStream.write((byte) i3);
                            i4 = 0;
                            i8 = -1;
                            j3 = 0;
                        }
                    }
                    i = i3;
                } else {
                    if (i < 48 || i > 57) {
                        break loop0;
                    }
                    i7 = (i7 * 10) + (i - 48);
                    i4 = 0;
                }
            }
            i2 = -1;
            if (i == i2) {
                if (lValueOf != null) {
                    list.add(new TarArchiveStructSparse(lValueOf.longValue(), 0L));
                }
                return map2;
            }
            i4 = 0;
        }
    }

    @Deprecated
    public static List<TarArchiveStructSparse> parsePAX01SparseHeaders(String str) {
        try {
            return parseFromPAX01SparseHeaders(str);
        } catch (IOException e) {
            throw new UncheckedIOException(e.getMessage(), e);
        }
    }

    public static List<TarArchiveStructSparse> parseFromPAX01SparseHeaders(String str) throws NumberFormatException, IOException {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < strArrSplit.length; i += 2) {
            try {
                long j = Long.parseLong(strArrSplit[i]);
                if (j < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
                }
                try {
                    long j2 = Long.parseLong(strArrSplit[i + 1]);
                    if (j2 < 0) {
                        throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
                    }
                    arrayList.add(new TarArchiveStructSparse(j, j2));
                } catch (NumberFormatException unused) {
                    throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains a non-numeric value");
                }
            } catch (NumberFormatException unused2) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains a non-numeric value");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<TarArchiveStructSparse> parsePAX1XSparseHeaders(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] lineOfNumberForPax1X = readLineOfNumberForPax1X(inputStream);
        long j = lineOfNumberForPax1X[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = lineOfNumberForPax1X[1];
        while (true) {
            long j3 = j - 1;
            if (j > 0) {
                long[] lineOfNumberForPax1X2 = readLineOfNumberForPax1X(inputStream);
                long j4 = lineOfNumberForPax1X2[0];
                if (j4 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
                }
                long j5 = j2 + lineOfNumberForPax1X2[1];
                long[] lineOfNumberForPax1X3 = readLineOfNumberForPax1X(inputStream);
                long j6 = lineOfNumberForPax1X3[0];
                if (j6 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                j2 = j5 + lineOfNumberForPax1X3[1];
                arrayList.add(new TarArchiveStructSparse(j4, j6));
                j = j3;
            } else {
                long j7 = i;
                IOUtils.skip(inputStream, j7 - (j2 % j7));
                return arrayList;
            }
        }
    }

    public static long[] readLineOfNumberForPax1X(InputStream inputStream) throws IOException {
        long j = 0;
        long j2 = 0;
        while (true) {
            int i = inputStream.read();
            if (i == 10) {
                return new long[]{j2, j + 1};
            }
            j++;
            if (i == -1) {
                throw new IOException("Unexpected EOF when reading parse information of 1.X PAX format");
            }
            if (i < 48 || i > 57) {
                break;
            }
            j2 = (j2 * 10) + (i - 48);
        }
        throw new IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
    }
}
