package io.ktor.utils.p050io;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: WriterSession.kt */
@Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, m7105d2 = {"Lio/ktor/utils/io/WriterSession;", "", "flush", "", "request", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "min", "", "written", "n", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface WriterSession {
    void flush();

    @Nullable
    ChunkBuffer request(int min);

    void written(int n);
}
