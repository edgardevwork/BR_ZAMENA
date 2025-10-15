package io.ktor.client.utils;

import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ClientEvents.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/client/utils/HttpResponseReceiveFail;", "", "response", "Lio/ktor/client/statement/HttpResponse;", "cause", "", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpResponseReceiveFail {

    @NotNull
    public final Throwable cause;

    @NotNull
    public final HttpResponse response;

    public HttpResponseReceiveFail(@NotNull HttpResponse response, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.response = response;
        this.cause = cause;
    }

    @NotNull
    public final Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final HttpResponse getResponse() {
        return this.response;
    }
}
