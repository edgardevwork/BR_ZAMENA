package org.apache.commons.compress.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes8.dex */
public final class IOUtils {
    public static final int COPY_BUF_SIZE = 8024;
    public static final LinkOption[] EMPTY_LINK_OPTIONS = new LinkOption[0];
    public static final byte[] SKIP_BUF = new byte[4096];
    public static final int SKIP_BUF_SIZE = 4096;

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copy(inputStream, outputStream, COPY_BUF_SIZE);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        if (i < 1) {
            throw new IllegalArgumentException("buffersize must be bigger than 0");
        }
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 == i2) {
                return j;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, i2);
            }
            j += i2;
        }
    }

    public static long skip(InputStream inputStream, long j) throws IOException {
        int fully;
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip == 0) {
                break;
            }
            j2 -= jSkip;
        }
        while (j2 > 0 && (fully = readFully(inputStream, SKIP_BUF, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= fully;
        }
        return j - j2;
    }

    public static int read(File file, byte[] bArr) throws IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            int fully = readFully(inputStreamNewInputStream, bArr, 0, bArr.length);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return fully;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 0 || i < 0 || (i3 = i2 + i) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        while (i4 != i2) {
            int i5 = inputStream.read(bArr, i + i4, i2 - i4);
            if (i5 == -1) {
                break;
            }
            i4 += i5;
        }
        return i4;
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = 0;
        while (i < iRemaining) {
            int i2 = readableByteChannel.read(byteBuffer);
            if (i2 <= 0) {
                break;
            } else {
                i += i2;
            }
        }
        if (i < iRemaining) {
            throw new EOFException();
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void copy(File file, OutputStream outputStream) throws IOException {
        Files.copy(file.toPath(), outputStream);
    }

    public static long copyRange(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        return copyRange(inputStream, j, outputStream, COPY_BUF_SIZE);
    }

    public static long copyRange(InputStream inputStream, long j, OutputStream outputStream, int i) throws IOException {
        int i2;
        if (i < 1) {
            throw new IllegalArgumentException("buffersize must be bigger than 0");
        }
        int iMin = (int) Math.min(i, j);
        byte[] bArr = new byte[iMin];
        long j2 = 0;
        while (j2 < j && -1 != (i2 = inputStream.read(bArr, 0, (int) Math.min(j - j2, iMin)))) {
            if (outputStream != null) {
                outputStream.write(bArr, 0, i2);
            }
            j2 += i2;
        }
        return j2;
    }

    public static byte[] readRange(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyRange(inputStream, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readRange(ReadableByteChannel readableByteChannel, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.min(i, COPY_BUF_SIZE));
        int i2 = 0;
        while (i2 < i) {
            byteBufferAllocate.limit(Math.min(i - i2, byteBufferAllocate.capacity()));
            int i3 = readableByteChannel.read(byteBufferAllocate);
            if (i3 <= 0) {
                break;
            }
            byteArrayOutputStream.write(byteBufferAllocate.array(), 0, i3);
            byteBufferAllocate.rewind();
            i2 += i3;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
