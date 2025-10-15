package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Throwable.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"rootCause", "", "getRootCause$annotations", "(Ljava/lang/Throwable;)V", "getRootCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ThrowableKt {
    @InternalAPI
    public static /* synthetic */ void getRootCause$annotations(Throwable th) {
    }

    @Nullable
    public static final Throwable getRootCause(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        while (true) {
            if ((th != null ? th.getCause() : null) == null) {
                return th;
            }
            th = th.getCause();
        }
    }
}
