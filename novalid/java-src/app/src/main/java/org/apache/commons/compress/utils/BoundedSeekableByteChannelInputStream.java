package org.apache.commons.compress.utils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes5.dex */
public class BoundedSeekableByteChannelInputStream extends BoundedArchiveInputStream {
    public final SeekableByteChannel channel;

    public BoundedSeekableByteChannelInputStream(long j, long j2, SeekableByteChannel seekableByteChannel) {
        super(j, j2);
        this.channel = seekableByteChannel;
    }

    @Override // org.apache.commons.compress.utils.BoundedArchiveInputStream
    public int read(long j, ByteBuffer byteBuffer) throws IOException {
        int i;
        synchronized (this.channel) {
            this.channel.position(j);
            i = this.channel.read(byteBuffer);
        }
        byteBuffer.flip();
        return i;
    }
}
