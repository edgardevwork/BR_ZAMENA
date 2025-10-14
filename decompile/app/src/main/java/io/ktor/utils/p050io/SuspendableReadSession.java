package io.ktor.utils.p050io;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReadSession.kt */
@Deprecated(message = "Use read { } instead.")
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/utils/io/SuspendableReadSession;", "Lio/ktor/utils/io/ReadSession;", "await", "", "atLeast", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface SuspendableReadSession extends ReadSession {
    @Nullable
    Object await(int i, @NotNull Continuation<? super Boolean> continuation);

    /* compiled from: ReadSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object await$default(SuspendableReadSession suspendableReadSession, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: await");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return suspendableReadSession.await(i, continuation);
        }
    }
}
