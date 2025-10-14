package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.Ha */
/* loaded from: classes8.dex */
public abstract class AbstractC8946Ha {
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m5242a(File file) throws IOException {
        byte[] bArrArray;
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        FileChannel channel;
        if (file == null || !file.exists()) {
            bArrArray = null;
        } else {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    fileLockLock = channel.lock(0L, Long.MAX_VALUE, true);
                } catch (IOException | SecurityException unused) {
                    fileLockLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileLockLock = null;
                }
            } catch (IOException | SecurityException unused2) {
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                fileLockLock = null;
            }
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) file.length());
                channel.read(byteBufferAllocate);
                byteBufferAllocate.flip();
                bArrArray = byteBufferAllocate.array();
            } catch (IOException | SecurityException unused3) {
                bArrArray = null;
                if (bArrArray == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    C9610ij c9610ij = AbstractC8954Hi.f6726a;
                    c9610ij.getClass();
                    c9610ij.m6292a(new C8978Ii("error_during_file_reading", th));
                    bArrArray = null;
                    if (bArrArray == null) {
                    }
                } finally {
                    file.getAbsolutePath();
                    m5244a(fileLockLock);
                    AbstractC9664kn.m6341a((Closeable) randomAccessFile);
                }
            }
        }
        if (bArrArray == null) {
            return null;
        }
        try {
            return new String(bArrArray, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str = new String(bArrArray);
            C9610ij c9610ij2 = AbstractC8954Hi.f6726a;
            c9610ij2.getClass();
            c9610ij2.m6292a(new C8978Ii("read_share_file_with_unsupported_encoding", e));
            return str;
        }
    }

    /* renamed from: a */
    public static void m5244a(FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static void m5243a(String str, FileOutputStream fileOutputStream) throws IOException {
        FileLock fileLockLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLockLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
            byteBufferAllocate.put(bytes);
            byteBufferAllocate.flip();
            channel.write(byteBufferAllocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            m5244a(fileLockLock);
            AbstractC9664kn.m6341a((Closeable) fileOutputStream);
        }
    }
}
