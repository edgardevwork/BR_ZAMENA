package io.ktor.client.plugins;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/* compiled from: HttpRequestRetry.kt */
@Metadata(m7104d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0012H\u0002\u001a#\u0010\u0018\u001a\u00020\n*\u00020\t2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0002\b\u000b\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"+\u0010\u0006\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"+\u0010\f\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"1\u0010\u000f\u001a%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"1\u0010\u0014\u001a%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "MaxRetriesPerRequestAttributeKey", "Lio/ktor/util/AttributeKey;", "", "ModifyRequestPerRequestAttributeKey", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRequestRetry$ModifyRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "RetryDelayPerRequestAttributeKey", "Lio/ktor/client/plugins/HttpRequestRetry$DelayContext;", "", "ShouldRetryOnExceptionPerRequestAttributeKey", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRequestRetry$ShouldRetryContext;", "", "", "ShouldRetryPerRequestAttributeKey", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "isTimeoutException", "retry", "block", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpRequestRetry$Configuration;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpRequestRetryKt {

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestRetry");

    @NotNull
    public static final AttributeKey<Integer> MaxRetriesPerRequestAttributeKey = new AttributeKey<>("MaxRetriesPerRequestAttributeKey");

    @NotNull
    public static final AttributeKey<Function3<HttpRequestRetry.ShouldRetryContext, HttpRequest, HttpResponse, Boolean>> ShouldRetryPerRequestAttributeKey = new AttributeKey<>("ShouldRetryPerRequestAttributeKey");

    @NotNull
    public static final AttributeKey<Function3<HttpRequestRetry.ShouldRetryContext, HttpRequestBuilder, Throwable, Boolean>> ShouldRetryOnExceptionPerRequestAttributeKey = new AttributeKey<>("ShouldRetryOnExceptionPerRequestAttributeKey");

    @NotNull
    public static final AttributeKey<Function2<HttpRequestRetry.ModifyRequestContext, HttpRequestBuilder, Unit>> ModifyRequestPerRequestAttributeKey = new AttributeKey<>("ModifyRequestPerRequestAttributeKey");

    @NotNull
    public static final AttributeKey<Function2<HttpRequestRetry.DelayContext, Integer, Long>> RetryDelayPerRequestAttributeKey = new AttributeKey<>("RetryDelayPerRequestAttributeKey");

    public static final void retry(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Function1<? super HttpRequestRetry.Configuration, Unit> block) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpRequestRetry.Configuration configuration = new HttpRequestRetry.Configuration();
        block.invoke(configuration);
        httpRequestBuilder.getAttributes().put(ShouldRetryPerRequestAttributeKey, configuration.getShouldRetry$ktor_client_core());
        httpRequestBuilder.getAttributes().put(ShouldRetryOnExceptionPerRequestAttributeKey, configuration.getShouldRetryOnException$ktor_client_core());
        httpRequestBuilder.getAttributes().put(RetryDelayPerRequestAttributeKey, configuration.getDelayMillis$ktor_client_core());
        httpRequestBuilder.getAttributes().put(MaxRetriesPerRequestAttributeKey, Integer.valueOf(configuration.getMaxRetries()));
        httpRequestBuilder.getAttributes().put(ModifyRequestPerRequestAttributeKey, configuration.getModifyRequest$ktor_client_core());
    }

    public static final boolean isTimeoutException(Throwable th) {
        Throwable thUnwrapCancellationException = ExceptionUtilsJvmKt.unwrapCancellationException(th);
        return (thUnwrapCancellationException instanceof HttpRequestTimeoutException) || (thUnwrapCancellationException instanceof ConnectTimeoutException) || (thUnwrapCancellationException instanceof SocketTimeoutException);
    }
}
