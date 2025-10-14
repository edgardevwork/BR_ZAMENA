package org.apache.commons.p059io.output;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.p059io.input.QueueInputStream;

/* loaded from: classes6.dex */
public class QueueOutputStream extends OutputStream {
    public final BlockingQueue<Integer> blockingQueue;

    public QueueOutputStream() {
        this(new LinkedBlockingQueue());
    }

    public QueueOutputStream(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.blockingQueue = blockingQueue;
    }

    public QueueInputStream newQueueInputStream() {
        return new QueueInputStream(this.blockingQueue);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws InterruptedException, InterruptedIOException {
        try {
            this.blockingQueue.put(Integer.valueOf(i & 255));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }
}
