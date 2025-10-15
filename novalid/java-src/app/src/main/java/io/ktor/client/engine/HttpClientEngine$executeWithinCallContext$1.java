package io.ktor.client.engine;

import io.ktor.client.engine.HttpClientEngine;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientEngine.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", m7120f = "HttpClientEngine.kt", m7121i = {0, 0}, m7122l = {91, 100}, m7123m = "executeWithinCallContext", m7124n = {"$this", "requestData"}, m7125s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
public final class HttpClientEngine$executeWithinCallContext$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(Continuation<? super HttpClientEngine$executeWithinCallContext$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpClientEngine.DefaultImpls.executeWithinCallContext(null, null, this);
    }
}
