package org.apache.http.client.utils;

import java.util.StringTokenizer;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes5.dex */
public class Rfc3492Idn implements Idn {
    public static final String ACE_PREFIX = "xn--";
    public static final int base = 36;
    public static final int damp = 700;
    public static final char delimiter = '-';
    public static final int initial_bias = 72;
    public static final int initial_n = 128;
    public static final int skew = 38;
    public static final int tmax = 26;
    public static final int tmin = 1;

    public final int adapt(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = i / 700;
        } else {
            i3 = i / 2;
        }
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    public final int digit(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= '0' && c <= '9') {
            return c - 22;
        }
        throw new IllegalArgumentException("illegal digit: " + c);
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (strNextToken.startsWith(ACE_PREFIX)) {
                strNextToken = decode(strNextToken.substring(4));
            }
            sb.append(strNextToken);
        }
        return sb.toString();
    }

    public String decode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int iLastIndexOf = str.lastIndexOf(45);
        int length = 128;
        int iAdapt = 72;
        if (iLastIndexOf != -1) {
            sb.append(str.subSequence(0, iLastIndexOf));
            str = str.substring(iLastIndexOf + 1);
        }
        int i = 0;
        while (!str.isEmpty()) {
            int i2 = 36;
            int i3 = i;
            int i4 = 1;
            while (!str.isEmpty()) {
                char cCharAt = str.charAt(0);
                str = str.substring(1);
                int iDigit = digit(cCharAt);
                i3 += iDigit * i4;
                int i5 = i2 <= iAdapt + 1 ? 1 : i2 >= iAdapt + 26 ? 26 : i2 - iAdapt;
                if (iDigit < i5) {
                    break;
                }
                i4 *= 36 - i5;
                i2 += 36;
            }
            iAdapt = adapt(i3 - i, sb.length() + 1, i == 0);
            length += i3 / (sb.length() + 1);
            int length2 = i3 % (sb.length() + 1);
            sb.insert(length2, (char) length);
            i = length2 + 1;
        }
        return sb.toString();
    }
}
