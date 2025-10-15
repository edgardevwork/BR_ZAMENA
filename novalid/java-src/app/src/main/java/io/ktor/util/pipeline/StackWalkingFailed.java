package io.ktor.util.pipeline;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: StackWalkingFailed.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m7105d2 = {"Lio/ktor/util/pipeline/StackWalkingFailed;", "", "()V", "failedToCaptureStackFrame", "", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class StackWalkingFailed {

    @NotNull
    public static final StackWalkingFailed INSTANCE = new StackWalkingFailed();

    public final void failedToCaptureStackFrame() {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.".toString());
    }
}
