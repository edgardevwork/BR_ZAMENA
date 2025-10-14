package io.ktor.utils.p050io;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WriterSession.kt */
@Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/utils/io/WriterSuspendSession;", "Lio/ktor/utils/io/WriterSession;", "tryAwait", "", "n", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface WriterSuspendSession extends WriterSession {
    @Nullable
    Object tryAwait(int i, @NotNull Continuation<? super Unit> continuation);
}
