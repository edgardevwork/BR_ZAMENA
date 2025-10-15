package org.apache.commons.compress.archivers.examples;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class CloseableConsumerAdapter implements Closeable {
    public Closeable closeable;
    public final CloseableConsumer consumer;

    public CloseableConsumerAdapter(CloseableConsumer closeableConsumer) {
        Objects.requireNonNull(closeableConsumer, "consumer");
        this.consumer = closeableConsumer;
    }

    public <C extends Closeable> C track(C c) {
        this.closeable = c;
        return c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Closeable closeable = this.closeable;
        if (closeable != null) {
            this.consumer.accept(closeable);
        }
    }
}
