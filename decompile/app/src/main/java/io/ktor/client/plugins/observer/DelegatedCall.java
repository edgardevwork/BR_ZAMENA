package io.ktor.client.plugins.observer;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.p050io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DelegatedCall.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lio/ktor/client/plugins/observer/DelegatedCall;", "Lio/ktor/client/call/HttpClientCall;", "client", "Lio/ktor/client/HttpClient;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "originCall", "(Lio/ktor/client/HttpClient;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/client/call/HttpClientCall;)V", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class DelegatedCall extends HttpClientCall {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatedCall(@NotNull HttpClient client, @NotNull ByteReadChannel content, @NotNull HttpClientCall originCall) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(originCall, "originCall");
        setRequest(new DelegatedRequest(this, originCall.getRequest()));
        setResponse(new DelegatedResponse(this, content, originCall.getResponse()));
    }
}
