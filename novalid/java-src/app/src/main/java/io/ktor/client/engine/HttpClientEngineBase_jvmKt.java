package io.ktor.client.engine;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientEngineBase.jvm.kt */
@Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, m7105d2 = {"ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpClientEngineBase_jvmKt {
    @NotNull
    public static final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }
}
