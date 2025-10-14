package io.ktor.client.utils;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ClientEvents.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, m7105d2 = {"HttpRequestCreated", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/request/HttpRequestBuilder;", "getHttpRequestCreated", "()Lio/ktor/events/EventDefinition;", "HttpRequestIsReadyForSending", "getHttpRequestIsReadyForSending", "HttpResponseCancelled", "Lio/ktor/client/statement/HttpResponse;", "getHttpResponseCancelled", "HttpResponseReceiveFailed", "Lio/ktor/client/utils/HttpResponseReceiveFail;", "getHttpResponseReceiveFailed", "HttpResponseReceived", "getHttpResponseReceived", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ClientEventsKt {

    @NotNull
    public static final EventDefinition<HttpRequestBuilder> HttpRequestCreated = new EventDefinition<>();

    @NotNull
    public static final EventDefinition<HttpRequestBuilder> HttpRequestIsReadyForSending = new EventDefinition<>();

    @NotNull
    public static final EventDefinition<HttpResponse> HttpResponseReceived = new EventDefinition<>();

    @NotNull
    public static final EventDefinition<HttpResponseReceiveFail> HttpResponseReceiveFailed = new EventDefinition<>();

    @NotNull
    public static final EventDefinition<HttpResponse> HttpResponseCancelled = new EventDefinition<>();

    @NotNull
    public static final EventDefinition<HttpRequestBuilder> getHttpRequestCreated() {
        return HttpRequestCreated;
    }

    @NotNull
    public static final EventDefinition<HttpRequestBuilder> getHttpRequestIsReadyForSending() {
        return HttpRequestIsReadyForSending;
    }

    @NotNull
    public static final EventDefinition<HttpResponse> getHttpResponseReceived() {
        return HttpResponseReceived;
    }

    @NotNull
    public static final EventDefinition<HttpResponseReceiveFail> getHttpResponseReceiveFailed() {
        return HttpResponseReceiveFailed;
    }

    @NotNull
    public static final EventDefinition<HttpResponse> getHttpResponseCancelled() {
        return HttpResponseCancelled;
    }
}
