package io.ktor.client.request;

import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpRequest.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m7105d2 = {"Lio/ktor/client/request/HttpResponseData;", "", "statusCode", "Lio/ktor/http/HttpStatusCode;", "requestTime", "Lio/ktor/util/date/GMTDate;", "headers", "Lio/ktor/http/Headers;", "version", "Lio/ktor/http/HttpProtocolVersion;", "body", "callContext", "Lkotlin/coroutines/CoroutineContext;", "(Lio/ktor/http/HttpStatusCode;Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Lio/ktor/http/HttpProtocolVersion;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "getBody", "()Ljava/lang/Object;", "getCallContext", "()Lkotlin/coroutines/CoroutineContext;", "getHeaders", "()Lio/ktor/http/Headers;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "responseTime", "getResponseTime", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "toString", "", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpResponseData {

    @NotNull
    public final Object body;

    @NotNull
    public final CoroutineContext callContext;

    @NotNull
    public final Headers headers;

    @NotNull
    public final GMTDate requestTime;

    @NotNull
    public final GMTDate responseTime;

    @NotNull
    public final HttpStatusCode statusCode;

    @NotNull
    public final HttpProtocolVersion version;

    public HttpResponseData(@NotNull HttpStatusCode statusCode, @NotNull GMTDate requestTime, @NotNull Headers headers, @NotNull HttpProtocolVersion version, @NotNull Object body, @NotNull CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.statusCode = statusCode;
        this.requestTime = requestTime;
        this.headers = headers;
        this.version = version;
        this.body = body;
        this.callContext = callContext;
        this.responseTime = DateJvmKt.GMTDate$default(null, 1, null);
    }

    @NotNull
    public final HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final GMTDate getRequestTime() {
        return this.requestTime;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final HttpProtocolVersion getVersion() {
        return this.version;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final CoroutineContext getCallContext() {
        return this.callContext;
    }

    @NotNull
    public final GMTDate getResponseTime() {
        return this.responseTime;
    }

    @NotNull
    public String toString() {
        return "HttpResponseData=(statusCode=" + this.statusCode + ')';
    }
}
