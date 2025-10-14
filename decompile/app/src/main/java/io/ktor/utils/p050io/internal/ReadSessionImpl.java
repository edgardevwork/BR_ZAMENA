package io.ktor.utils.p050io.internal;

import io.ktor.utils.p050io.ByteBufferChannel;
import io.ktor.utils.p050io.SuspendableReadSession;
import io.ktor.utils.p050io.core.BufferUtilsJvmKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReadSessionImpl.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/utils/io/internal/ReadSessionImpl;", "Lio/ktor/utils/io/SuspendableReadSession;", "channel", "Lio/ktor/utils/io/ByteBufferChannel;", "(Lio/ktor/utils/io/ByteBufferChannel;)V", "availableForRead", "", "getAvailableForRead", "()I", "lastAvailable", "lastView", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "await", "", "atLeast", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completed", "", "newView", ClientCookie.DISCARD_ATTR, "n", "request", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReadSessionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadSessionImpl.kt\nio/ktor/utils/io/internal/ReadSessionImpl\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,47:1\n69#2:48\n69#2:49\n*S KotlinDebug\n*F\n+ 1 ReadSessionImpl.kt\nio/ktor/utils/io/internal/ReadSessionImpl\n*L\n17#1:48\n22#1:49\n*E\n"})
/* loaded from: classes6.dex */
public final class ReadSessionImpl implements SuspendableReadSession {

    @NotNull
    public final ByteBufferChannel channel;
    public int lastAvailable;

    @NotNull
    public ChunkBuffer lastView;

    public ReadSessionImpl(@NotNull ByteBufferChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.lastView = ChunkBuffer.INSTANCE.getEmpty();
    }

    public final void completed() {
        completed(ChunkBuffer.INSTANCE.getEmpty());
    }

    public final void completed(ChunkBuffer newView) {
        int i = this.lastAvailable;
        ChunkBuffer chunkBuffer = this.lastView;
        int writePosition = i - (chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition());
        if (writePosition > 0) {
            this.channel.mo15689consumed(writePosition);
        }
        this.lastView = newView;
        this.lastAvailable = newView.getWritePosition() - newView.getReadPosition();
    }

    @Override // io.ktor.utils.p050io.ReadSession
    public int getAvailableForRead() {
        return this.channel.get_availableForRead();
    }

    @Override // io.ktor.utils.p050io.ReadSession
    public int discard(int n) {
        completed();
        int iMin = Math.min(getAvailableForRead(), n);
        this.channel.mo15689consumed(iMin);
        return iMin;
    }

    @Override // io.ktor.utils.p050io.ReadSession
    @Nullable
    public ChunkBuffer request(int atLeast) {
        ByteBuffer byteBufferRequest = this.channel.request(0, atLeast);
        if (byteBufferRequest == null) {
            return null;
        }
        ChunkBuffer chunkBufferChunkBuffer$default = BufferUtilsJvmKt.ChunkBuffer$default(byteBufferRequest, null, 2, null);
        chunkBufferChunkBuffer$default.resetForRead();
        completed(chunkBufferChunkBuffer$default);
        return chunkBufferChunkBuffer$default;
    }

    @Override // io.ktor.utils.p050io.SuspendableReadSession
    @Nullable
    public Object await(int i, @NotNull Continuation<? super Boolean> continuation) {
        completed();
        return this.channel.awaitAtLeast(i, continuation);
    }
}
