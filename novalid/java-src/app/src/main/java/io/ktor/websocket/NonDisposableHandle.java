package io.ktor.websocket;

import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;
import org.jetbrains.annotations.NotNull;

/* compiled from: FrameCommon.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/websocket/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "()V", "dispose", "", "toString", "", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class NonDisposableHandle implements DisposableHandle {

    @NotNull
    public static final NonDisposableHandle INSTANCE = new NonDisposableHandle();

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}
