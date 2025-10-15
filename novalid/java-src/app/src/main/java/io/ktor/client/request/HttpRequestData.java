package io.ktor.client.request;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.util.InternalAPI;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequest.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ!\u0010 \u001a\u0004\u0018\u0001H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0\u001b¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020%H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, m7105d2 = {"Lio/ktor/client/request/HttpRequestData;", "", "url", "Lio/ktor/http/Url;", FirebaseAnalytics.Param.METHOD, "Lio/ktor/http/HttpMethod;", "headers", "Lio/ktor/http/Headers;", "body", "Lio/ktor/http/content/OutgoingContent;", "executionContext", "Lkotlinx/coroutines/Job;", "attributes", "Lio/ktor/util/Attributes;", "(Lio/ktor/http/Url;Lio/ktor/http/HttpMethod;Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;Lkotlinx/coroutines/Job;Lio/ktor/util/Attributes;)V", "getAttributes", "()Lio/ktor/util/Attributes;", "getBody", "()Lio/ktor/http/content/OutgoingContent;", "getExecutionContext", "()Lkotlinx/coroutines/Job;", "getHeaders", "()Lio/ktor/http/Headers;", "getMethod", "()Lio/ktor/http/HttpMethod;", "requiredCapabilities", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getRequiredCapabilities$ktor_client_core", "()Ljava/util/Set;", "getUrl", "()Lio/ktor/http/Url;", "getCapabilityOrNull", ExifInterface.GPS_DIRECTION_TRUE, "key", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Ljava/lang/Object;", "toString", "", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpRequestData {

    @NotNull
    public final Attributes attributes;

    @NotNull
    public final OutgoingContent body;

    @NotNull
    public final Job executionContext;

    @NotNull
    public final Headers headers;

    @NotNull
    public final HttpMethod method;

    @NotNull
    public final Set<HttpClientEngineCapability<?>> requiredCapabilities;

    @NotNull
    public final Url url;

    @InternalAPI
    public HttpRequestData(@NotNull Url url, @NotNull HttpMethod method, @NotNull Headers headers, @NotNull OutgoingContent body, @NotNull Job executionContext, @NotNull Attributes attributes) {
        Set<HttpClientEngineCapability<?>> setKeySet;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.executionContext = executionContext;
        this.attributes = attributes;
        Map map = (Map) attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        this.requiredCapabilities = (map == null || (setKeySet = map.keySet()) == null) ? SetsKt__SetsKt.emptySet() : setKeySet;
    }

    @NotNull
    public final Url getUrl() {
        return this.url;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final OutgoingContent getBody() {
        return this.body;
    }

    @NotNull
    public final Job getExecutionContext() {
        return this.executionContext;
    }

    @NotNull
    public final Attributes getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final <T> T getCapabilityOrNull(@NotNull HttpClientEngineCapability<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @NotNull
    public final Set<HttpClientEngineCapability<?>> getRequiredCapabilities$ktor_client_core() {
        return this.requiredCapabilities;
    }

    @NotNull
    public String toString() {
        return "HttpRequestData(url=" + this.url + ", method=" + this.method + ')';
    }
}
