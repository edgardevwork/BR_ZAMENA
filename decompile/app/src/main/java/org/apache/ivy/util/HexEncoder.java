package org.apache.ivy.util;

import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;

/* loaded from: classes8.dex */
public class HexEncoder {
    public static final char[] ALPHABET = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static String encode(byte[] bArr) {
        StringBuilder sb = new StringBuilder(16);
        for (byte b : bArr) {
            int i = (b & 240) >> 4;
            int i2 = b & Ascii.f786SI;
            char[] cArr = ALPHABET;
            sb.append(cArr[i]);
            sb.append(cArr[i2]);
        }
        return sb.toString();
    }
}
