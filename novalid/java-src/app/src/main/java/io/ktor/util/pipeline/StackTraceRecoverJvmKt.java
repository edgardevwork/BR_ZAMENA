package io.ktor.util.pipeline;

import io.ktor.utils.p050io.ExceptionUtilsJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StackTraceRecoverJvm.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0003"}, m7105d2 = {"withCause", "", "cause", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class StackTraceRecoverJvmKt {
    @NotNull
    public static final Throwable withCause(@NotNull Throwable th, @Nullable Throwable th2) {
        Throwable thTryCopyException;
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th2 == null || Intrinsics.areEqual(th.getCause(), th2) || (thTryCopyException = ExceptionUtilsJvmKt.tryCopyException(th, th2)) == null) {
            return th;
        }
        thTryCopyException.setStackTrace(th.getStackTrace());
        return thTryCopyException;
    }
}
