package org.jfrog.build.extractor.producerConsumer;

import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public interface ProducerConsumerRunnableInt extends Runnable {
    void setExecutor(ProducerConsumerExecutor producerConsumerExecutor);

    void setLog(Log log);
}
