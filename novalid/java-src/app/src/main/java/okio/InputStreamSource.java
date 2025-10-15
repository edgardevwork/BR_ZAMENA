package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.clientConfiguration.ClientProperties;

/* compiled from: JvmOkio.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "input", "Ljava/io/InputStream;", ClientProperties.PROP_TIMEOUT, "Lokio/Timeout;", "(Ljava/io/InputStream;Lokio/Timeout;)V", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "toString", "", "okio"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
/* renamed from: okio.InputStreamSource, reason: from toString */
/* loaded from: classes7.dex */
public class source implements Source {

    @NotNull
    public final InputStream input;

    @NotNull
    public final Timeout timeout;

    public source(@NotNull InputStream input, @NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int i = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i == -1) {
                if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                    return -1L;
                }
                sink.head = segmentWritableSegment$okio.pop();
                SegmentPool.recycle(segmentWritableSegment$okio);
                return -1L;
            }
            segmentWritableSegment$okio.limit += i;
            long j = i;
            sink.setSize$okio(sink.size() + j);
            return j;
        } catch (AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout, reason: from getter */
    public Timeout getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "source(" + this.input + ')';
    }
}
