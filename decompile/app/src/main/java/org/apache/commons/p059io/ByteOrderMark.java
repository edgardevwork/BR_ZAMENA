package org.apache.commons.p059io;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.Serializable;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.p059io.input.XmlStreamReader;

/* loaded from: classes8.dex */
public class ByteOrderMark implements Serializable {
    public static final char UTF_BOM = 65279;
    public static final long serialVersionUID = 1;
    public final int[] bytes;
    public final String charsetName;
    public static final ByteOrderMark UTF_8 = new ByteOrderMark("UTF-8", 239, MatroskaExtractor.ID_CUE_POINT, 191);
    public static final ByteOrderMark UTF_16BE = new ByteOrderMark("UTF-16BE", 254, 255);
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark("UTF-16LE", 255, 254);
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark(XmlStreamReader.UTF_32BE, 0, 0, 254, 255);
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark(XmlStreamReader.UTF_32LE, 255, 254, 0, 0);

    public ByteOrderMark(String str, int... iArr) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.charsetName = str;
        int[] iArr2 = new int[iArr.length];
        this.bytes = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public String getCharsetName() {
        return this.charsetName;
    }

    public int length() {
        return this.bytes.length;
    }

    public int get(int i) {
        return this.bytes[i];
    }

    public byte[] getBytes() {
        byte[] bArrByteArray = IOUtils.byteArray(this.bytes.length);
        int i = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i >= iArr.length) {
                return bArrByteArray;
            }
            bArrByteArray[i] = (byte) iArr[i];
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteOrderMark)) {
            return false;
        }
        ByteOrderMark byteOrderMark = (ByteOrderMark) obj;
        if (this.bytes.length != byteOrderMark.length()) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != byteOrderMark.get(i)) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode();
        for (int i : this.bytes) {
            iHashCode += i;
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(this.charsetName);
        sb.append(": ");
        for (int i = 0; i < this.bytes.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.bytes[i] & 255).toUpperCase(Locale.ROOT));
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
