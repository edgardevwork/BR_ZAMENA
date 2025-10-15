package io.ktor.client.plugins.cookies;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCookies.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.cookies.HttpCookies", m7120f = "HttpCookies.kt", m7121i = {0, 0}, m7122l = {54}, m7123m = "captureHeaderCookies$ktor_client_core", m7124n = {"this", "url"}, m7125s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class HttpCookies$captureHeaderCookies$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$captureHeaderCookies$1(HttpCookies httpCookies, Continuation<? super HttpCookies$captureHeaderCookies$1> continuation) {
        super(continuation);
        this.this$0 = httpCookies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.captureHeaderCookies$ktor_client_core(null, this);
    }
}
