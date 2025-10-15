package org.apache.commons.p059io.input;

import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes6.dex */
public class CircularInputStream extends InputStream {
    public long byteCount;
    public int position = -1;
    public final byte[] repeatedContent;
    public final long targetByteCount;

    public static byte[] validate(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b : bArr) {
            if (b == -1) {
                throw new IllegalArgumentException("repeatContent contains the end-of-stream marker -1");
            }
        }
        return bArr;
    }

    public CircularInputStream(byte[] bArr, long j) {
        this.repeatedContent = validate(bArr);
        if (bArr.length == 0) {
            throw new IllegalArgumentException("repeatContent is empty.");
        }
        this.targetByteCount = j;
    }

    @Override // java.io.InputStream
    public int read() {
        long j = this.targetByteCount;
        if (j >= 0) {
            long j2 = this.byteCount;
            if (j2 == j) {
                return -1;
            }
            this.byteCount = j2 + 1;
        }
        int i = this.position + 1;
        byte[] bArr = this.repeatedContent;
        int length = i % bArr.length;
        this.position = length;
        return bArr[length] & 255;
    }
}
