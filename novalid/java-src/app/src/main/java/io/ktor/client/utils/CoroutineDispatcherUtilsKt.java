package io.ktor.client.utils;

import io.ktor.util.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineDispatcherUtils.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m7105d2 = {"clientDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Dispatchers;", "threadCount", "", "dispatcherName", "", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineDispatcherUtilsKt {
    public static /* synthetic */ CoroutineDispatcher clientDispatcher$default(Dispatchers dispatchers, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return clientDispatcher(dispatchers, i, str);
    }

    @InternalAPI
    @NotNull
    public static final CoroutineDispatcher clientDispatcher(@NotNull Dispatchers dispatchers, int i, @NotNull String dispatcherName) {
        Intrinsics.checkNotNullParameter(dispatchers, "<this>");
        Intrinsics.checkNotNullParameter(dispatcherName, "dispatcherName");
        return Dispatchers.getIO().limitedParallelism(i);
    }
}
