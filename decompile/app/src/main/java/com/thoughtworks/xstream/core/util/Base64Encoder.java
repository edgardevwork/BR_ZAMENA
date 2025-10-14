package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.StringCodec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes5.dex */
public class Base64Encoder implements StringCodec {
    public final boolean lineBreaks;
    public static final char[] SIXTY_FOUR_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int[] REVERSE_MAPPING = new int[123];

    static {
        int i = 0;
        while (true) {
            char[] cArr = SIXTY_FOUR_CHARS;
            if (i >= cArr.length) {
                return;
            }
            int[] iArr = REVERSE_MAPPING;
            char c = cArr[i];
            i++;
            iArr[c] = i;
        }
    }

    public Base64Encoder() {
        this(false);
    }

    public Base64Encoder(boolean z) {
        this.lineBreaks = z;
    }

    @Override // com.thoughtworks.xstream.core.StringCodec
    public String encode(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(computeResultingStringSize(bArr));
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int iMin = Math.min(3, bArr.length - i2);
            int i3 = ((bArr[i2] & 255) << 16) | ((iMin <= 1 ? 0 : bArr[i2 + 1] & 255) << 8) | (iMin <= 2 ? 0 : bArr[i2 + 2] & 255);
            int i4 = 0;
            while (i4 < 4) {
                stringBuffer.append(iMin + 1 > i4 ? SIXTY_FOUR_CHARS[(i3 >> ((3 - i4) * 6)) & 63] : '=');
                i4++;
            }
            if (this.lineBreaks) {
                i += 4;
                if (i % 76 == 0 && i2 + 3 < bArr.length) {
                    stringBuffer.append('\n');
                }
            }
        }
        return stringBuffer.toString();
    }

    public int computeResultingStringSize(byte[] bArr) {
        int length = ((bArr.length / 3) + (bArr.length % 3 == 0 ? 0 : 1)) * 4;
        return this.lineBreaks ? length + (length / 76) : length;
    }

    @Override // com.thoughtworks.xstream.core.StringCodec
    public byte[] decode(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            StringReader stringReader = new StringReader(str);
            for (int i = 0; i < str.length(); i += 4) {
                int[] iArr = {mapCharToInt(stringReader), mapCharToInt(stringReader), mapCharToInt(stringReader), mapCharToInt(stringReader)};
                int i2 = ((iArr[0] & 63) << 18) | ((iArr[1] & 63) << 12) | ((iArr[2] & 63) << 6) | (iArr[3] & 63);
                int i3 = 0;
                while (i3 < 3) {
                    int i4 = i3 + 1;
                    if (iArr[i4] >= 0) {
                        byteArrayOutputStream.write((i2 >> ((2 - i3) * 8)) & 255);
                    }
                    i3 = i4;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(e);
            stringBuffer.append(": ");
            stringBuffer.append(e.getMessage());
            throw new Error(stringBuffer.toString());
        }
    }

    public final int mapCharToInt(Reader reader) throws IOException {
        int i;
        do {
            i = reader.read();
            if (i == -1) {
                break;
            }
            int i2 = REVERSE_MAPPING[i];
            if (i2 != 0) {
                return i2 - 1;
            }
        } while (i != 61);
        return -1;
    }
}
