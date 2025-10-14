package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes5.dex */
public final class ByteBufferWriter {
    public static final ThreadLocal<SoftReference<byte[]>> BUFFER = new ThreadLocal<>();
    public static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    public static final long CHANNEL_FIELD_OFFSET;
    public static final Class<?> FILE_OUTPUT_STREAM_CLASS;
    public static final int MAX_CACHED_BUFFER_SIZE = 16384;
    public static final int MIN_CACHED_BUFFER_SIZE = 1024;

    public static boolean needToReallocate(int requestedSize, int bufferLength) {
        return bufferLength < requestedSize && ((float) bufferLength) < ((float) requestedSize) * 0.5f;
    }

    static {
        Class<?> clsSafeGetClass = safeGetClass("java.io.FileOutputStream");
        FILE_OUTPUT_STREAM_CLASS = clsSafeGetClass;
        CHANNEL_FIELD_OFFSET = getChannelFieldOffset(clsSafeGetClass);
    }

    public static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    public static void write(ByteBuffer buffer, OutputStream output) throws IOException {
        int iPosition = buffer.position();
        try {
            if (buffer.hasArray()) {
                output.write(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
            } else if (!writeToChannel(buffer, output)) {
                byte[] orCreateBuffer = getOrCreateBuffer(buffer.remaining());
                while (buffer.hasRemaining()) {
                    int iMin = Math.min(buffer.remaining(), orCreateBuffer.length);
                    buffer.get(orCreateBuffer, 0, iMin);
                    output.write(orCreateBuffer, 0, iMin);
                }
            }
            Java8Compatibility.position(buffer, iPosition);
        } catch (Throwable th) {
            Java8Compatibility.position(buffer, iPosition);
            throw th;
        }
    }

    public static byte[] getOrCreateBuffer(int requestedSize) {
        int iMax = Math.max(requestedSize, 1024);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(iMax, buffer.length)) {
            buffer = new byte[iMax];
            if (iMax <= 16384) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    public static byte[] getBuffer() {
        SoftReference<byte[]> softReference = BUFFER.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public static void setBuffer(byte[] value) {
        BUFFER.set(new SoftReference<>(value));
    }

    public static boolean writeToChannel(ByteBuffer buffer, OutputStream output) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = CHANNEL_FIELD_OFFSET;
        if (j < 0 || !FILE_OUTPUT_STREAM_CLASS.isInstance(output)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) UnsafeUtil.getObject(output, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(buffer);
        return true;
    }

    public static Class<?> safeGetClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static long getChannelFieldOffset(Class<?> clazz) {
        if (clazz == null) {
            return -1L;
        }
        try {
            if (UnsafeUtil.hasUnsafeArrayOperations()) {
                return UnsafeUtil.objectFieldOffset(clazz.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
