package io.ktor.utils.p050io.internal;

import io.ktor.utils.p050io.LookAheadSuspendSession;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/utils/io/internal/FailedLookAhead;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "awaitAtLeast", "", "n", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumed", "", "request", "Ljava/nio/ByteBuffer;", "skip", "atLeast", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class FailedLookAhead implements LookAheadSuspendSession {

    @NotNull
    public final Throwable cause;

    public FailedLookAhead(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.cause = cause;
    }

    @NotNull
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // io.ktor.utils.p050io.LookAheadSession
    @NotNull
    /* renamed from: consumed, reason: merged with bridge method [inline-methods] */
    public Void mo15689consumed(int n) throws Throwable {
        throw this.cause;
    }

    @Override // io.ktor.utils.p050io.LookAheadSession
    @NotNull
    public ByteBuffer request(int skip, int atLeast) throws Throwable {
        throw this.cause;
    }

    @Override // io.ktor.utils.p050io.LookAheadSuspendSession
    @Nullable
    public Object awaitAtLeast(int i, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        throw this.cause;
    }
}
