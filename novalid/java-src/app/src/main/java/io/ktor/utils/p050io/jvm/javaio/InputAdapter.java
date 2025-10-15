package io.ktor.utils.p050io.jvm.javaio;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Blocking.kt */
@Metadata(m7104d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\"\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/utils/io/jvm/javaio/InputAdapter;", "Ljava/io/InputStream;", "parent", "Lkotlinx/coroutines/Job;", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lkotlinx/coroutines/Job;Lio/ktor/utils/io/ByteReadChannel;)V", "context", "Lkotlinx/coroutines/CompletableJob;", "loop", "io/ktor/utils/io/jvm/javaio/InputAdapter$loop$1", "Lio/ktor/utils/io/jvm/javaio/InputAdapter$loop$1;", "single", "", "available", "", "close", "", "read", "b", "off", "len", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlocking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blocking.kt\nio/ktor/utils/io/jvm/javaio/InputAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/* loaded from: classes5.dex */
public final class InputAdapter extends InputStream {

    @NotNull
    public final ByteReadChannel channel;

    @NotNull
    public final CompletableJob context;

    @NotNull
    public final InputAdapter$loop$1 loop;

    @Nullable
    public byte[] single;

    public InputAdapter(@Nullable Job job, @NotNull ByteReadChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.context = JobKt.Job(job);
        this.loop = new InputAdapter$loop$1(job, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.channel.get_availableForRead();
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = this.single;
            if (bArr == null) {
                bArr = new byte[1];
                this.single = bArr;
            }
            int iSubmitAndAwait = this.loop.submitAndAwait(bArr, 0, 1);
            if (iSubmitAndAwait == -1) {
                return -1;
            }
            if (iSubmitAndAwait != 1) {
                throw new IllegalStateException(("Expected a single byte or EOF. Got " + iSubmitAndAwait + " bytes.").toString());
            }
            return bArr[0] & 255;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(@Nullable byte[] b, int off, int len) {
        InputAdapter$loop$1 inputAdapter$loop$1;
        inputAdapter$loop$1 = this.loop;
        Intrinsics.checkNotNull(b);
        return inputAdapter$loop$1.submitAndAwait(b, off, len);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            super.close();
            ByteReadChannelKt.cancel(this.channel);
            if (!this.context.isCompleted()) {
                Job.DefaultImpls.cancel$default((Job) this.context, (CancellationException) null, 1, (Object) null);
            }
            this.loop.shutdown();
        } catch (Throwable th) {
            throw th;
        }
    }
}
