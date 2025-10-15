package io.ktor.client.plugins.observer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.slf4j.MDCContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResponseObserverContextJvm.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m7105d2 = {"getResponseObserverContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ResponseObserverContextJvmKt {
    @Nullable
    public static final Object getResponseObserverContext(@NotNull Continuation<? super CoroutineContext> continuation) {
        MDCContext mDCContext = (MDCContext) continuation.getContext().get(MDCContext.INSTANCE);
        return mDCContext != null ? mDCContext : EmptyCoroutineContext.INSTANCE;
    }
}
