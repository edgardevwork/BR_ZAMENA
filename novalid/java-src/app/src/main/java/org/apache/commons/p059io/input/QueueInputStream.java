package org.apache.commons.p059io.input;

import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.p059io.output.QueueOutputStream;

/* loaded from: classes6.dex */
public class QueueInputStream extends InputStream {
    public final BlockingQueue<Integer> blockingQueue;

    public QueueInputStream() {
        this(new LinkedBlockingQueue());
    }

    public QueueInputStream(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.blockingQueue = blockingQueue;
    }

    public QueueOutputStream newQueueOutputStream() {
        return new QueueOutputStream(this.blockingQueue);
    }

    @Override // java.io.InputStream
    public int read() {
        Integer numPoll = this.blockingQueue.poll();
        if (numPoll == null) {
            return -1;
        }
        return numPoll.intValue() & 255;
    }
}
