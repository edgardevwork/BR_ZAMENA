package org.apache.commons.compress.utils;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class SeekableInMemoryByteChannel implements SeekableByteChannel {
    public static final int NAIVE_RESIZE_LIMIT = 1073741823;
    public final AtomicBoolean closed;
    public byte[] data;
    public int position;
    public int size;

    public SeekableInMemoryByteChannel(byte[] bArr) {
        this.closed = new AtomicBoolean();
        this.data = bArr;
        this.size = bArr.length;
    }

    public SeekableInMemoryByteChannel() {
        this(ByteUtils.EMPTY_BYTE_ARRAY);
    }

    public SeekableInMemoryByteChannel(int i) {
        this(new byte[i]);
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
        return this.position;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel position(long j) throws IOException {
        ensureOpen();
        if (j < 0 || j > ParserMinimalBase.MAX_INT_L) {
            throw new IOException("Position has to be in range 0.. 2147483647");
        }
        this.position = (int) j;
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
        return this.size;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) {
        if (j < 0 || j > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException("Size has to be in range 0.. 2147483647");
        }
        if (this.size > j) {
            this.size = (int) j;
        }
        if (this.position > j) {
            this.position = (int) j;
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        ensureOpen();
        int iRemaining = byteBuffer.remaining();
        int i = this.size;
        int i2 = this.position;
        int i3 = i - i2;
        if (i3 <= 0) {
            return -1;
        }
        if (iRemaining > i3) {
            iRemaining = i3;
        }
        byteBuffer.put(this.data, i2, iRemaining);
        this.position += iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed.set(true);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed.get();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        ensureOpen();
        int iRemaining = byteBuffer.remaining();
        int i = this.size;
        int i2 = this.position;
        if (iRemaining > i - i2) {
            int i3 = i2 + iRemaining;
            if (i3 < 0) {
                resize(Integer.MAX_VALUE);
                iRemaining = Integer.MAX_VALUE - this.position;
            } else {
                resize(i3);
            }
        }
        byteBuffer.get(this.data, this.position, iRemaining);
        int i4 = this.position + iRemaining;
        this.position = i4;
        if (this.size < i4) {
            this.size = i4;
        }
        return iRemaining;
    }

    public byte[] array() {
        return this.data;
    }

    public final void resize(int i) {
        int length = this.data.length;
        if (length <= 0) {
            length = 1;
        }
        if (i < 1073741823) {
            while (length < i) {
                length <<= 1;
            }
            i = length;
        }
        this.data = Arrays.copyOf(this.data, i);
    }

    public final void ensureOpen() throws ClosedChannelException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
    }
}
