package io.ktor.utils.p050io;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReadSession.kt */
@Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/utils/io/ReadSession;", "", "availableForRead", "", "getAvailableForRead", "()I", ClientCookie.DISCARD_ATTR, "n", "request", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "atLeast", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface ReadSession {
    int discard(int i);

    int getAvailableForRead();

    @Nullable
    ChunkBuffer request(int atLeast);

    /* compiled from: ReadSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ ChunkBuffer request$default(ReadSession readSession, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return readSession.request(i);
        }
    }
}
