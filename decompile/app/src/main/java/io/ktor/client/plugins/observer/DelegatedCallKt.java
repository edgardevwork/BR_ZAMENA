package io.ktor.client.plugins.observer;

import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.p050io.ByteReadChannel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DelegatedCall.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m7105d2 = {"wrapWithContent", "Lio/ktor/client/call/HttpClientCall;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "shouldCloseOrigin", "", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DelegatedCallKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Parameter [shouldCloseOrigin] is deprecated", replaceWith = @ReplaceWith(expression = "wrapWithContent(content)", imports = {}))
    @NotNull
    public static final HttpClientCall wrapWithContent(@NotNull HttpClientCall httpClientCall, @NotNull ByteReadChannel content, boolean z) {
        Intrinsics.checkNotNullParameter(httpClientCall, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        return wrapWithContent(httpClientCall, content);
    }

    @NotNull
    public static final HttpClientCall wrapWithContent(@NotNull HttpClientCall httpClientCall, @NotNull ByteReadChannel content) {
        Intrinsics.checkNotNullParameter(httpClientCall, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        return new DelegatedCall(httpClientCall.getClient(), content, httpClientCall);
    }
}
