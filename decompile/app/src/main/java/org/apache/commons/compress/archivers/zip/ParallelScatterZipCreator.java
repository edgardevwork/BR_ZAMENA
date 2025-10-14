package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier;

/* loaded from: classes5.dex */
public class ParallelScatterZipCreator {
    public final ScatterGatherBackingStoreSupplier backingStoreSupplier;
    public long compressionDoneAt;
    public final int compressionLevel;

    /* renamed from: es */
    public final ExecutorService f9835es;
    public final Deque<Future<? extends ScatterZipOutputStream>> futures;
    public long scatterDoneAt;
    public final long startedAt;
    public final Deque<ScatterZipOutputStream> streams;
    public final ThreadLocal<ScatterZipOutputStream> tlScatterStreams;

    /* loaded from: classes8.dex */
    public static class DefaultBackingStoreSupplier implements ScatterGatherBackingStoreSupplier {
        public final AtomicInteger storeNum;

        public DefaultBackingStoreSupplier() {
            this.storeNum = new AtomicInteger(0);
        }

        @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier
        public ScatterGatherBackingStore get() throws IOException {
            return new FileBasedScatterGatherBackingStore(Files.createTempFile("parallelscatter", "n" + this.storeNum.incrementAndGet(), new FileAttribute[0]));
        }
    }

    public final ScatterZipOutputStream createDeferred(ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier) throws IOException {
        ScatterGatherBackingStore scatterGatherBackingStore = scatterGatherBackingStoreSupplier.get();
        return new ScatterZipOutputStream(scatterGatherBackingStore, StreamCompressor.create(this.compressionLevel, scatterGatherBackingStore));
    }

    public ParallelScatterZipCreator() {
        this(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
    }

    public ParallelScatterZipCreator(ExecutorService executorService) {
        this(executorService, new DefaultBackingStoreSupplier());
    }

    public ParallelScatterZipCreator(ExecutorService executorService, ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier) {
        this(executorService, scatterGatherBackingStoreSupplier, -1);
    }

    public ParallelScatterZipCreator(ExecutorService executorService, ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier, int i) throws IllegalArgumentException {
        this.streams = new ConcurrentLinkedDeque();
        this.futures = new ConcurrentLinkedDeque();
        this.startedAt = System.currentTimeMillis();
        this.tlScatterStreams = new ThreadLocal<ScatterZipOutputStream>() { // from class: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.1
            @Override // java.lang.ThreadLocal
            public ScatterZipOutputStream initialValue() {
                try {
                    ParallelScatterZipCreator parallelScatterZipCreator = ParallelScatterZipCreator.this;
                    ScatterZipOutputStream scatterZipOutputStreamCreateDeferred = parallelScatterZipCreator.createDeferred(parallelScatterZipCreator.backingStoreSupplier);
                    ParallelScatterZipCreator.this.streams.add(scatterZipOutputStreamCreateDeferred);
                    return scatterZipOutputStreamCreateDeferred;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        };
        if ((i < 0 || i > 9) && i != -1) {
            throw new IllegalArgumentException("Compression level is expected between -1~9");
        }
        this.backingStoreSupplier = scatterGatherBackingStoreSupplier;
        this.f9835es = executorService;
        this.compressionLevel = i;
    }

    public void addArchiveEntry(ZipArchiveEntry zipArchiveEntry, InputStreamSupplier inputStreamSupplier) {
        submitStreamAwareCallable(createCallable(zipArchiveEntry, inputStreamSupplier));
    }

    public void addArchiveEntry(ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier) {
        submitStreamAwareCallable(createCallable(zipArchiveEntryRequestSupplier));
    }

    public final void submit(final Callable<? extends Object> callable) {
        submitStreamAwareCallable(new Callable() { // from class: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.lambda$submit$0(callable);
            }
        });
    }

    public final /* synthetic */ ScatterZipOutputStream lambda$submit$0(Callable callable) throws Exception {
        callable.call();
        return this.tlScatterStreams.get();
    }

    public final void submitStreamAwareCallable(Callable<? extends ScatterZipOutputStream> callable) {
        this.futures.add(this.f9835es.submit(callable));
    }

    public final Callable<ScatterZipOutputStream> createCallable(ZipArchiveEntry zipArchiveEntry, InputStreamSupplier inputStreamSupplier) {
        if (zipArchiveEntry.getMethod() == -1) {
            throw new IllegalArgumentException("Method must be set on zipArchiveEntry: " + zipArchiveEntry);
        }
        final ZipArchiveEntryRequest zipArchiveEntryRequestCreateZipArchiveEntryRequest = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, inputStreamSupplier);
        return new Callable() { // from class: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.lambda$createCallable$1(zipArchiveEntryRequestCreateZipArchiveEntryRequest);
            }
        };
    }

    public final /* synthetic */ ScatterZipOutputStream lambda$createCallable$1(ZipArchiveEntryRequest zipArchiveEntryRequest) throws Exception {
        ScatterZipOutputStream scatterZipOutputStream = this.tlScatterStreams.get();
        scatterZipOutputStream.addArchiveEntry(zipArchiveEntryRequest);
        return scatterZipOutputStream;
    }

    public final Callable<ScatterZipOutputStream> createCallable(final ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier) {
        return new Callable() { // from class: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.lambda$createCallable$2(zipArchiveEntryRequestSupplier);
            }
        };
    }

    public final /* synthetic */ ScatterZipOutputStream lambda$createCallable$2(ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier) throws Exception {
        ScatterZipOutputStream scatterZipOutputStream = this.tlScatterStreams.get();
        scatterZipOutputStream.addArchiveEntry(zipArchiveEntryRequestSupplier.get());
        return scatterZipOutputStream;
    }

    public void writeTo(ZipArchiveOutputStream zipArchiveOutputStream) throws ExecutionException, InterruptedException, IOException {
        try {
            try {
                Iterator<Future<? extends ScatterZipOutputStream>> it = this.futures.iterator();
                while (it.hasNext()) {
                    it.next().get();
                }
                this.f9835es.shutdown();
                this.f9835es.awaitTermination(60000L, TimeUnit.SECONDS);
                this.compressionDoneAt = System.currentTimeMillis();
                Iterator<Future<? extends ScatterZipOutputStream>> it2 = this.futures.iterator();
                while (it2.hasNext()) {
                    it2.next().get().zipEntryWriter().writeNextZipEntry(zipArchiveOutputStream);
                }
                Iterator<ScatterZipOutputStream> it3 = this.streams.iterator();
                while (it3.hasNext()) {
                    it3.next().close();
                }
                this.scatterDoneAt = System.currentTimeMillis();
                closeAll();
            } catch (Throwable th) {
                this.f9835es.shutdown();
                throw th;
            }
        } catch (Throwable th2) {
            closeAll();
            throw th2;
        }
    }

    public ScatterStatistics getStatisticsMessage() {
        long j = this.compressionDoneAt;
        return new ScatterStatistics(j - this.startedAt, this.scatterDoneAt - j);
    }

    public final void closeAll() {
        Iterator<ScatterZipOutputStream> it = this.streams.iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException unused) {
            }
        }
    }
}
