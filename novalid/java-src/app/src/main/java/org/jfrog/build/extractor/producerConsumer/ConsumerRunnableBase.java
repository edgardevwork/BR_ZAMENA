package org.jfrog.build.extractor.producerConsumer;

/* loaded from: classes8.dex */
public abstract class ConsumerRunnableBase implements ProducerConsumerRunnableInt {
    public abstract void consumerRun();

    @Override // java.lang.Runnable
    public final void run() {
        consumerRun();
    }
}
