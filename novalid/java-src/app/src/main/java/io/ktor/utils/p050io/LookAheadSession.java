package io.ktor.utils.p050io;

import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: LookAheadSession.kt */
@Deprecated(message = "Use read { } instead.")
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, m7105d2 = {"Lio/ktor/utils/io/LookAheadSession;", "", "consumed", "", "n", "", "request", "Ljava/nio/ByteBuffer;", "skip", "atLeast", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface LookAheadSession {
    /* renamed from: consumed */
    void mo15689consumed(int n);

    @Nullable
    ByteBuffer request(int skip, int atLeast);
}
