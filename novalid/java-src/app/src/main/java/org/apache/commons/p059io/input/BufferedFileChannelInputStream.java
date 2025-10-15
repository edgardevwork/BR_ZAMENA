package org.apache.commons.p059io.input;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class BufferedFileChannelInputStream extends InputStream {
    public static final Class<?> DIRECT_BUFFER_CLASS = getDirectBufferClass();
    public final ByteBuffer byteBuffer;
    public final FileChannel fileChannel;

    public static Class<?> getDirectBufferClass() {
        try {
            return Class.forName("sun.nio.ch.DirectBuffer");
        } catch (ClassNotFoundException | IllegalAccessError unused) {
            return null;
        }
    }

    public static boolean isDirectBuffer(Object obj) {
        Class<?> cls = DIRECT_BUFFER_CLASS;
        return cls != null && cls.isInstance(obj);
    }

    public BufferedFileChannelInputStream(File file) throws IOException {
        this(file, 8192);
    }

    public BufferedFileChannelInputStream(File file, int i) throws IOException {
        this(file.toPath(), i);
    }

    public BufferedFileChannelInputStream(Path path) throws IOException {
        this(path, 8192);
    }

    public BufferedFileChannelInputStream(Path path, int i) throws IOException {
        Objects.requireNonNull(path, "path");
        this.fileChannel = FileChannel.open(path, StandardOpenOption.READ);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        this.byteBuffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.flip();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        return this.byteBuffer.remaining();
    }

    public final void clean(ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (isDirectBuffer(byteBuffer)) {
            cleanDirectBuffer(byteBuffer);
        }
    }

    public final void cleanDirectBuffer(ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if ("1.8".equals(System.getProperty("java.specification.version"))) {
            try {
                Class<?> cls = Class.forName("sun.misc.Cleaner");
                Object objInvoke = DIRECT_BUFFER_CLASS.getMethod("cleaner", null).invoke(byteBuffer, null);
                if (objInvoke != null) {
                    cls.getMethod("clean", null).invoke(objInvoke, null);
                    return;
                }
                return;
            } catch (ReflectiveOperationException e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Method method = cls2.getMethod("invokeCleaner", ByteBuffer.class);
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            method.invoke(declaredField.get(null), byteBuffer);
        } catch (ReflectiveOperationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.fileChannel.close();
        } finally {
            clean(this.byteBuffer);
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        if (!refill()) {
            return -1;
        }
        return this.byteBuffer.get() & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0) {
            if (i3 <= bArr.length) {
                if (!refill()) {
                    return -1;
                }
                int iMin = Math.min(i2, this.byteBuffer.remaining());
                this.byteBuffer.get(bArr, i, iMin);
                return iMin;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean refill() throws IOException {
        if (this.byteBuffer.hasRemaining()) {
            return true;
        }
        this.byteBuffer.clear();
        int i = 0;
        while (i == 0) {
            i = this.fileChannel.read(this.byteBuffer);
        }
        this.byteBuffer.flip();
        return i >= 0;
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (this.byteBuffer.remaining() >= j) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.position(byteBuffer.position() + ((int) j));
            return j;
        }
        long jRemaining = this.byteBuffer.remaining();
        this.byteBuffer.position(0);
        this.byteBuffer.flip();
        return jRemaining + skipFromFileChannel(j - jRemaining);
    }

    public final long skipFromFileChannel(long j) throws IOException {
        long jPosition = this.fileChannel.position();
        long size = this.fileChannel.size();
        long j2 = size - jPosition;
        if (j > j2) {
            this.fileChannel.position(size);
            return j2;
        }
        this.fileChannel.position(jPosition + j);
        return j;
    }
}
