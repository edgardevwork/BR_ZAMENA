package io.ktor.client.network.sockets;

import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.ThrowableKt;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteChannelKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimeoutExceptions.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m7105d2 = {"ByteChannelWithMappedExceptions", "Lio/ktor/utils/io/ByteChannel;", "request", "Lio/ktor/client/request/HttpRequestData;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutExceptionsKt {
    @NotNull
    public static final ByteChannel ByteChannelWithMappedExceptions(@NotNull final HttpRequestData request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ByteChannelKt.ByteChannel$default(false, new Function1<Throwable, Throwable>() { // from class: io.ktor.client.network.sockets.TimeoutExceptionsKt.ByteChannelWithMappedExceptions.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Throwable invoke(@Nullable Throwable th) {
                return (th != null ? ThrowableKt.getRootCause(th) : null) instanceof java.net.SocketTimeoutException ? HttpTimeoutKt.SocketTimeoutException(request, th) : th;
            }
        }, 1, null);
    }
}
