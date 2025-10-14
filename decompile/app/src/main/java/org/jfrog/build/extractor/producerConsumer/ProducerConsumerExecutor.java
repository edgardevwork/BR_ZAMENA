package org.jfrog.build.extractor.producerConsumer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jfrog.build.api.producerConsumer.ProducerConsumerItem;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class ProducerConsumerExecutor {
    public ConsumerRunnableBase[] consumerRunnables;
    public Thread[] consumerThreads;
    public int consumersNumber;
    public final Log log;
    public ProducerRunnableBase[] producerRunnables;
    public Thread[] producerThreads;
    public int producersNumber;
    public BlockingQueue<ProducerConsumerItem> queue;
    public ProducerConsumerItem TERMINATE = new ProducerConsumerTerminateItem();
    public AtomicBoolean errorOccurred = new AtomicBoolean(false);
    public AtomicInteger producersFinished = new AtomicInteger(0);

    public ProducerConsumerExecutor(Log log, ProducerRunnableBase[] producerRunnableBaseArr, ConsumerRunnableBase[] consumerRunnableBaseArr, int i) {
        this.log = log;
        this.producerRunnables = producerRunnableBaseArr;
        this.consumerRunnables = consumerRunnableBaseArr;
        this.queue = new ArrayBlockingQueue(i);
        int length = producerRunnableBaseArr.length;
        this.producersNumber = length;
        int length2 = consumerRunnableBaseArr.length;
        this.consumersNumber = length2;
        this.producerThreads = new Thread[length];
        this.consumerThreads = new Thread[length2];
    }

    public void start() throws Exception {
        ProducerConsumerExceptionHandler producerConsumerExceptionHandler = new ProducerConsumerExceptionHandler();
        for (int i = 0; i < this.producersNumber; i++) {
            this.producerThreads[i] = new Thread(this.producerRunnables[i]);
            initializeThread(this.producerThreads[i], this.producerRunnables[i], "producer_" + i, producerConsumerExceptionHandler);
        }
        for (int i2 = 0; i2 < this.consumersNumber; i2++) {
            this.consumerThreads[i2] = new Thread(this.consumerRunnables[i2]);
            initializeThread(this.consumerThreads[i2], this.consumerRunnables[i2], "consumer_" + i2, producerConsumerExceptionHandler);
        }
        for (Thread thread : this.consumerThreads) {
            thread.start();
        }
        for (Thread thread2 : this.producerThreads) {
            thread2.start();
        }
        try {
            for (Thread thread3 : this.consumerThreads) {
                thread3.join();
            }
            for (Thread thread4 : this.producerThreads) {
                thread4.join();
            }
            if (this.errorOccurred.get()) {
                throw new Exception("Error occurred during operation, please refer to logs for more information.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            stopWithException();
            throw e;
        }
    }

    public final void initializeThread(Thread thread, ProducerConsumerRunnableInt producerConsumerRunnableInt, String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        producerConsumerRunnableInt.setExecutor(this);
        producerConsumerRunnableInt.setLog(this.log);
        thread.setName(str);
        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    public void producerFinished() throws InterruptedException {
        if (this.producersFinished.addAndGet(1) == this.producersNumber) {
            this.queue.put(this.TERMINATE);
        }
    }

    public final void stopWithException() {
        for (Thread thread : this.producerThreads) {
            thread.interrupt();
        }
        for (Thread thread2 : this.consumerThreads) {
            thread2.interrupt();
        }
    }

    public void put(ProducerConsumerItem producerConsumerItem) throws InterruptedException {
        this.queue.put(producerConsumerItem);
    }

    public ProducerConsumerItem take() throws InterruptedException {
        return this.queue.take();
    }

    public class ProducerConsumerExceptionHandler implements Thread.UncaughtExceptionHandler {
        public ProducerConsumerExceptionHandler() {
        }

        public /* synthetic */ ProducerConsumerExceptionHandler(ProducerConsumerExecutor producerConsumerExecutor, C113021 c113021) {
            this();
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            ProducerConsumerExecutor.this.log.error(String.format("[%s] An exception occurred during execution:\n%s", thread.getName(), stringWriter.toString()));
            if (ProducerConsumerExecutor.this.errorOccurred.getAndSet(true)) {
                return;
            }
            ProducerConsumerExecutor.this.stopWithException();
        }
    }

    /* loaded from: classes8.dex */
    public class ProducerConsumerTerminateItem implements ProducerConsumerItem {
        public ProducerConsumerTerminateItem() {
        }

        public /* synthetic */ ProducerConsumerTerminateItem(ProducerConsumerExecutor producerConsumerExecutor, C113021 c113021) {
            this();
        }
    }
}
