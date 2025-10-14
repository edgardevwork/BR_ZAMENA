package org.jfrog.build.extractor.producerConsumer;

import org.jfrog.build.api.util.Log;

/* loaded from: classes8.dex */
public abstract class ProducerRunnableBase implements ProducerConsumerRunnableInt {
    public ProducerConsumerExecutor executor;
    public Log log;

    public abstract void producerRun() throws InterruptedException;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            producerRun();
            this.executor.producerFinished();
        } catch (InterruptedException unused) {
        }
    }

    @Override // org.jfrog.build.extractor.producerConsumer.ProducerConsumerRunnableInt
    public void setExecutor(ProducerConsumerExecutor producerConsumerExecutor) {
        this.executor = producerConsumerExecutor;
    }

    @Override // org.jfrog.build.extractor.producerConsumer.ProducerConsumerRunnableInt
    public void setLog(Log log) {
        this.log = log;
    }
}
