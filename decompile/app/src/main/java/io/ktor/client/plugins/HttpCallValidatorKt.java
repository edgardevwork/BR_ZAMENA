package io.ktor.client.plugins;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpCallValidator;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/* compiled from: HttpCallValidator.kt */
@Metadata(m7104d1 = {"\u0000o\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\u0002\b\u0019\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0012\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e*`\u0010\u001a\"-\b\u0001\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001b2-\b\u0001\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001b*\u008a\u0001\u0010\"\"B\b\u0001\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110$¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 \u0012\u0006\u0012\u0004\u0018\u00010!0#2B\b\u0001\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110$¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 \u0012\u0006\u0012\u0004\u0018\u00010!0#*`\u0010&\"-\b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001b2-\b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001b¨\u0006)"}, m7105d2 = {"ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "value", "expectSuccess", "Lio/ktor/client/request/HttpRequestBuilder;", "getExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "setExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;Z)V", "HttpRequest", "io/ktor/client/plugins/HttpCallValidatorKt$HttpRequest$1", "builder", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/plugins/HttpCallValidatorKt$HttpRequest$1;", "HttpResponseValidator", "", "Lio/ktor/client/HttpClientConfig;", "block", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidator$Config;", "Lkotlin/ExtensionFunctionType;", "CallExceptionHandler", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "CallRequestExceptionHandler", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequest;", "request", "ResponseValidator", "Lio/ktor/client/statement/HttpResponse;", "response", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpCallValidatorKt {

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");

    @NotNull
    public static final AttributeKey<Boolean> ExpectSuccessAttributeKey = new AttributeKey<>("ExpectSuccessAttributeKey");

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m7104d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m7105d2 = {"io/ktor/client/plugins/HttpCallValidatorKt$HttpRequest$1", "Lio/ktor/client/request/HttpRequest;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", NotificationCompat.CATEGORY_CALL, "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "content", "Lio/ktor/http/content/OutgoingContent;", "getContent", "()Lio/ktor/http/content/OutgoingContent;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", FirebaseAnalytics.Param.METHOD, "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "url", "Lio/ktor/http/Url;", "getUrl", "()Lio/ktor/http/Url;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1 */
    /* loaded from: classes8.dex */
    public static final class C101421 implements HttpRequest {

        @NotNull
        public final Attributes attributes;

        @NotNull
        public final Headers headers;

        @NotNull
        public final HttpMethod method;

        @NotNull
        public final Url url;

        public C101421() {
            this.method = this.$builder.getMethod();
            this.url = this.$builder.getUrl().build();
            this.attributes = this.$builder.getAttributes();
            this.headers = this.$builder.getHeaders().build();
        }

        @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return HttpRequest.DefaultImpls.getCoroutineContext(this);
        }

        @Override // io.ktor.client.request.HttpRequest
        @NotNull
        public HttpClientCall getCall() {
            throw new IllegalStateException("Call is not initialized".toString());
        }

        @Override // io.ktor.client.request.HttpRequest
        @NotNull
        public HttpMethod getMethod() {
            return this.method;
        }

        @Override // io.ktor.client.request.HttpRequest
        @NotNull
        public Url getUrl() {
            return this.url;
        }

        @Override // io.ktor.client.request.HttpRequest
        @NotNull
        public Attributes getAttributes() {
            return this.attributes;
        }

        @Override // io.ktor.http.HttpMessage
        @NotNull
        public Headers getHeaders() {
            return this.headers;
        }

        @Override // io.ktor.client.request.HttpRequest
        @NotNull
        public OutgoingContent getContent() {
            Object body = this.$builder.getBody();
            OutgoingContent outgoingContent = body instanceof OutgoingContent ? (OutgoingContent) body : null;
            if (outgoingContent != null) {
                return outgoingContent;
            }
            throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.$builder.getBody()).toString());
        }
    }

    public static final C101421 HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        return new HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt.HttpRequest.1

            @NotNull
            public final Attributes attributes;

            @NotNull
            public final Headers headers;

            @NotNull
            public final HttpMethod method;

            @NotNull
            public final Url url;

            public C101421() {
                this.method = this.$builder.getMethod();
                this.url = this.$builder.getUrl().build();
                this.attributes = this.$builder.getAttributes();
                this.headers = this.$builder.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
            @NotNull
            public CoroutineContext getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.client.request.HttpRequest
            @NotNull
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized".toString());
            }

            @Override // io.ktor.client.request.HttpRequest
            @NotNull
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            @NotNull
            public Url getUrl() {
                return this.url;
            }

            @Override // io.ktor.client.request.HttpRequest
            @NotNull
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.http.HttpMessage
            @NotNull
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.request.HttpRequest
            @NotNull
            public OutgoingContent getContent() {
                Object body = this.$builder.getBody();
                OutgoingContent outgoingContent = body instanceof OutgoingContent ? (OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.$builder.getBody()).toString());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HttpResponseValidator(@NotNull HttpClientConfig<?> httpClientConfig, @NotNull Function1<? super HttpCallValidator.Config, Unit> block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpCallValidator.INSTANCE, block);
    }

    public static final boolean getExpectSuccess(@NotNull HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Boolean bool = (Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void setExpectSuccess(@NotNull HttpRequestBuilder httpRequestBuilder, boolean z) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, Boolean.valueOf(z));
    }

    @NotNull
    public static final AttributeKey<Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }
}
