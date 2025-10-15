package io.ktor.client.plugins;

import androidx.core.app.NotificationCompat;
import io.ktor.client.plugins.HttpRedirect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRedirect.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.HttpRedirect$Plugin", m7120f = "HttpRedirect.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {113}, m7123m = "handleCall", m7124n = {"this", "$this$handleCall", "context", "client", NotificationCompat.CATEGORY_CALL, "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"})
/* loaded from: classes8.dex */
public final class HttpRedirect$Plugin$handleCall$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HttpRedirect.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirect$Plugin$handleCall$1(HttpRedirect.Companion companion, Continuation<? super HttpRedirect$Plugin$handleCall$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleCall(null, null, null, false, null, this);
    }
}
