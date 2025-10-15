package io.ktor.client.plugins.cache;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.cache.HttpCache;
import io.ktor.client.plugins.cache.storage.CachedResponseData;
import io.ktor.client.plugins.cache.storage.HttpCacheStorageKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCache.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", m7120f = "HttpCache.kt", m7121i = {1}, m7122l = {Cea708Decoder.COMMAND_SPC, 149, 155, MatroskaExtractor.ID_BLOCK_ADDITIONAL, 170}, m7123m = "invokeSuspend", m7124n = {"$this$intercept"}, m7125s = {"L$0"})
/* loaded from: classes6.dex */
public final class HttpCache$Companion$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
    public final /* synthetic */ HttpCache $plugin;
    public final /* synthetic */ HttpClient $scope;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCache$Companion$install$1(HttpCache httpCache, HttpClient httpClient, Continuation<? super HttpCache$Companion$install$1> continuation) {
        super(3, continuation);
        this.$plugin = httpCache;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        HttpCache$Companion$install$1 httpCache$Companion$install$1 = new HttpCache$Companion$install$1(this.$plugin, this.$scope, continuation);
        httpCache$Companion$install$1.L$0 = pipelineContext;
        httpCache$Companion$install$1.L$1 = obj;
        return httpCache$Companion$install$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        PipelineContext<Object, HttpRequestBuilder> pipelineContext;
        CachedResponseData cachedResponseData;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            pipelineContext = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
            PipelineContext<Object, HttpRequestBuilder> pipelineContext2 = pipelineContext;
            cachedResponseData = (CachedResponseData) obj;
            if (cachedResponseData != null) {
                HttpCacheKt.getLOGGER().trace("No cached response for " + pipelineContext2.getContext().getUrl() + " found");
                if (HttpHeaderValueParserKt.parseHeaderValue(pipelineContext2.getContext().getHeaders().get(HttpHeaders.INSTANCE.getCacheControl())).contains(CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core())) {
                    HttpCacheKt.getLOGGER().trace("No cache found and \"only-if-cached\" set for " + pipelineContext2.getContext().getUrl());
                    HttpCache.Companion companion = HttpCache.INSTANCE;
                    HttpClient httpClient = this.$scope;
                    this.L$0 = null;
                    this.label = 3;
                    if (companion.proceedWithMissingCache$ktor_client_core(pipelineContext2, httpClient, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ValidateStatus validateStatusShouldValidate = HttpCacheEntryKt.shouldValidate(cachedResponseData.getExpires(), cachedResponseData.getHeaders(), pipelineContext2.getContext());
            if (validateStatusShouldValidate == ValidateStatus.ShouldNotValidate) {
                HttpClientCall call = HttpCacheStorageKt.createResponse(cachedResponseData, this.$scope, new RequestForCache(pipelineContext2.getContext().build()), pipelineContext2.getContext().getExecutionContext()).getCall();
                HttpCache.Companion companion2 = HttpCache.INSTANCE;
                HttpClient httpClient2 = this.$scope;
                this.L$0 = null;
                this.label = 4;
                if (companion2.proceedWithCache$ktor_client_core(pipelineContext2, httpClient2, call, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (validateStatusShouldValidate == ValidateStatus.ShouldWarn) {
                HttpCache.Companion companion3 = HttpCache.INSTANCE;
                HttpClient httpClient3 = this.$scope;
                Job executionContext = pipelineContext2.getContext().getExecutionContext();
                this.L$0 = null;
                this.label = 5;
                if (companion3.proceedWithWarning(pipelineContext2, cachedResponseData, httpClient3, executionContext, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            Headers headers = cachedResponseData.getHeaders();
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            String str = headers.get(httpHeaders.getETag());
            if (str != null) {
                HttpCacheKt.getLOGGER().trace("Adding If-None-Match=" + str + " for " + pipelineContext2.getContext().getUrl());
                UtilsKt.header(pipelineContext2.getContext(), httpHeaders.getIfNoneMatch(), str);
            }
            String str2 = cachedResponseData.getHeaders().get(httpHeaders.getLastModified());
            if (str2 != null) {
                HttpCacheKt.getLOGGER().trace("Adding If-Modified-Since=" + str2 + " for " + pipelineContext2.getContext().getUrl());
                UtilsKt.header(pipelineContext2.getContext(), httpHeaders.getIfModifiedSince(), str2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        pipelineContext = (PipelineContext) this.L$0;
        Object obj2 = this.L$1;
        if (!(obj2 instanceof OutgoingContent.NoContent)) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(pipelineContext.getContext().getMethod(), HttpMethod.INSTANCE.getGet()) && HttpCacheKt.canStore(pipelineContext.getContext().getUrl().getProtocol())) {
            if (!this.$plugin.useOldStorage) {
                this.L$0 = pipelineContext;
                this.label = 2;
                obj = this.$plugin.findResponse(pipelineContext.getContext(), (OutgoingContent) obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PipelineContext<Object, HttpRequestBuilder> pipelineContext22 = pipelineContext;
                cachedResponseData = (CachedResponseData) obj;
                if (cachedResponseData != null) {
                }
            } else {
                HttpClient httpClient4 = this.$scope;
                this.L$0 = null;
                this.label = 1;
                if (HttpCacheLegacyKt.interceptSendLegacy(pipelineContext, this.$plugin, (OutgoingContent) obj2, httpClient4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            return Unit.INSTANCE;
        }
    }
}
