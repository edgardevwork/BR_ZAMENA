package io.ktor.client.plugins.cache;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.plugins.cache.storage.HttpCacheStorageKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.HttpStatusCodeKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.PipelineContext;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCacheLegacy.kt */
@Metadata(m7104d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a:\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a9\u0010\u0015\u001a\u00020\u0016*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u00172\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a9\u0010\u001c\u001a\u00020\u0016*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a1\u0010\u001f\u001a\u00020\u0016*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m7105d2 = {"cacheResponse", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/plugins/cache/HttpCache;", "response", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAndRefresh", "request", "Lio/ktor/client/request/HttpRequest;", "findResponse", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "storage", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "varyKeys", "", "", "url", "Lio/ktor/http/Url;", "context", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "Lio/ktor/http/content/OutgoingContent;", "interceptReceiveLegacy", "", "Lio/ktor/util/pipeline/PipelineContext;", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interceptSendLegacy", "", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/http/content/OutgoingContent;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithWarning", "cachedCall", "Lio/ktor/client/call/HttpClientCall;", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCacheLegacy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,162:1\n24#2:163\n1#3:164\n1054#4:165\n288#4:166\n289#4:170\n167#5,3:167\n167#5,3:171\n*S KotlinDebug\n*F\n+ 1 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n*L\n86#1:163\n141#1:165\n142#1:166\n142#1:170\n143#1:167,3\n155#1:171,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCacheLegacyKt {

    /* compiled from: HttpCacheLegacy.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", m7120f = "HttpCacheLegacy.kt", m7121i = {}, m7122l = {111}, m7123m = "cacheResponse", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 */
    /* loaded from: classes7.dex */
    public static final class C101651 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C101651(Continuation<? super C101651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheLegacyKt.cacheResponse(null, null, this);
        }
    }

    /* compiled from: HttpCacheLegacy.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", m7120f = "HttpCacheLegacy.kt", m7121i = {0}, m7122l = {62, 63, 73}, m7123m = "interceptReceiveLegacy", m7124n = {"$this$interceptReceiveLegacy"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1 */
    /* loaded from: classes7.dex */
    public static final class C101661 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101661(Continuation<? super C101661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheLegacyKt.interceptReceiveLegacy(null, null, null, null, this);
        }
    }

    @Nullable
    public static final Object interceptSendLegacy(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull HttpCache httpCache, @NotNull OutgoingContent outgoingContent, @NotNull HttpClient httpClient, @NotNull Continuation<? super Unit> continuation) {
        Object objProceedWithMissingCache$ktor_client_core;
        HttpCacheEntry httpCacheEntryFindResponse = findResponse(httpCache, pipelineContext.getContext(), outgoingContent);
        if (httpCacheEntryFindResponse == null) {
            return (HttpHeaderValueParserKt.parseHeaderValue(pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getCacheControl())).contains(CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core()) && (objProceedWithMissingCache$ktor_client_core = HttpCache.INSTANCE.proceedWithMissingCache$ktor_client_core(pipelineContext, httpClient, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objProceedWithMissingCache$ktor_client_core : Unit.INSTANCE;
        }
        HttpClientCall call = httpCacheEntryFindResponse.produceResponse$ktor_client_core().getCall();
        ValidateStatus validateStatusShouldValidate = HttpCacheEntryKt.shouldValidate(httpCacheEntryFindResponse.getExpires(), httpCacheEntryFindResponse.getResponse().getHeaders(), pipelineContext.getContext());
        if (validateStatusShouldValidate == ValidateStatus.ShouldNotValidate) {
            Object objProceedWithCache$ktor_client_core = HttpCache.INSTANCE.proceedWithCache$ktor_client_core(pipelineContext, httpClient, call, continuation);
            return objProceedWithCache$ktor_client_core == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProceedWithCache$ktor_client_core : Unit.INSTANCE;
        }
        if (validateStatusShouldValidate == ValidateStatus.ShouldWarn) {
            Object objProceedWithWarning = proceedWithWarning(pipelineContext, call, httpClient, continuation);
            return objProceedWithWarning == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProceedWithWarning : Unit.INSTANCE;
        }
        Headers responseHeaders = httpCacheEntryFindResponse.getResponseHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = responseHeaders.get(httpHeaders.getETag());
        if (str != null) {
            UtilsKt.header(pipelineContext.getContext(), httpHeaders.getIfNoneMatch(), str);
        }
        String str2 = httpCacheEntryFindResponse.getResponseHeaders().get(httpHeaders.getLastModified());
        if (str2 != null) {
            UtilsKt.header(pipelineContext.getContext(), httpHeaders.getIfModifiedSince(), str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object interceptReceiveLegacy(@NotNull PipelineContext<HttpResponse, Unit> pipelineContext, @NotNull HttpResponse httpResponse, @NotNull HttpCache httpCache, @NotNull HttpClient httpClient, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101661 c101661;
        if (continuation instanceof C101661) {
            c101661 = (C101661) continuation;
            int i = c101661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101661.label = i - Integer.MIN_VALUE;
            } else {
                c101661 = new C101661(continuation);
            }
        }
        Object objCacheResponse = c101661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCacheResponse);
            if (HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                c101661.L$0 = pipelineContext;
                c101661.label = 1;
                objCacheResponse = cacheResponse(httpCache, httpResponse, c101661);
                if (objCacheResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c101661.L$0 = null;
                c101661.label = 2;
                if (pipelineContext.proceedWith((HttpResponse) objCacheResponse, c101661) == coroutine_suspended) {
                }
            } else {
                if (Intrinsics.areEqual(httpResponse.getStatus(), HttpStatusCode.INSTANCE.getNotModified())) {
                    HttpResponseKt.complete(httpResponse);
                    HttpResponse httpResponseFindAndRefresh = findAndRefresh(httpCache, httpResponse.getCall().getRequest(), httpResponse);
                    if (httpResponseFindAndRefresh == null) {
                        throw new InvalidCacheStateException(httpResponse.getCall().getRequest().getUrl());
                    }
                    httpClient.getMonitor().raise(HttpCache.INSTANCE.getHttpResponseFromCache(), httpResponseFindAndRefresh);
                    c101661.label = 3;
                    if (pipelineContext.proceedWith(httpResponseFindAndRefresh, c101661) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        } else if (i2 == 1) {
            pipelineContext = (PipelineContext) c101661.L$0;
            ResultKt.throwOnFailure(objCacheResponse);
            c101661.L$0 = null;
            c101661.label = 2;
            if (pipelineContext.proceedWith((HttpResponse) objCacheResponse, c101661) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCacheResponse);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objCacheResponse);
        }
        return Unit.INSTANCE;
    }

    public static final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClientCall httpClientCall, HttpClient httpClient, Continuation<? super Unit> continuation) {
        HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
        HttpStatusCode status = httpClientCall.getResponse().getStatus();
        GMTDate requestTime = httpClientCall.getResponse().getRequestTime();
        Headers.Companion companion = Headers.INSTANCE;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpClientCall.getResponse().getHeaders());
        headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
        Unit unit = Unit.INSTANCE;
        HttpClientCall httpClientCall2 = new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(status, requestTime, headersBuilder.build(), httpClientCall.getResponse().getVersion(), httpClientCall.getResponse().getContent(), httpClientCall.getResponse().getCoroutineContext()));
        pipelineContext.finish();
        httpClient.getMonitor().raise(HttpCache.INSTANCE.getHttpResponseFromCache(), httpClientCall2.getResponse());
        Object objProceedWith = pipelineContext.proceedWith(httpClientCall2, continuation);
        return objProceedWith == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProceedWith : unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cacheResponse(HttpCache httpCache, HttpResponse httpResponse, Continuation<? super HttpResponse> continuation) throws Throwable {
        C101651 c101651;
        if (continuation instanceof C101651) {
            c101651 = (C101651) continuation;
            int i = c101651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101651.label = i - Integer.MIN_VALUE;
            } else {
                c101651 = new C101651(continuation);
            }
        }
        Object objStore = c101651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStore);
            HttpRequest request = httpResponse.getCall().getRequest();
            List<HeaderValue> listCacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
            List<HeaderValue> listCacheControl2 = HttpMessagePropertiesKt.cacheControl(request);
            CacheControl cacheControl = CacheControl.INSTANCE;
            HttpCacheStorage privateStorage = listCacheControl.contains(cacheControl.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
            if (listCacheControl.contains(cacheControl.getNO_STORE$ktor_client_core()) || listCacheControl2.contains(cacheControl.getNO_STORE$ktor_client_core())) {
                return httpResponse;
            }
            Url url = request.getUrl();
            boolean isSharedClient = httpCache.getIsSharedClient();
            c101651.label = 1;
            objStore = HttpCacheStorageKt.store(privateStorage, url, httpResponse, isSharedClient, c101651);
            if (objStore == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objStore);
        }
        return ((HttpCacheEntry) objStore).produceResponse$ktor_client_core();
    }

    public static final HttpResponse findAndRefresh(HttpCache httpCache, HttpRequest httpRequest, HttpResponse httpResponse) {
        Url url = httpResponse.getCall().getRequest().getUrl();
        HttpCacheStorage privateStorage = HttpMessagePropertiesKt.cacheControl(httpResponse).contains(CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
        Map<String, String> mapVaryKeys = HttpCacheEntryKt.varyKeys(httpResponse);
        HttpCacheEntry httpCacheEntryFindResponse = findResponse(httpCache, privateStorage, mapVaryKeys, url, httpRequest);
        if (httpCacheEntryFindResponse == null) {
            return null;
        }
        if (mapVaryKeys.isEmpty()) {
            mapVaryKeys = httpCacheEntryFindResponse.getVaryKeys();
        }
        privateStorage.store(url, new HttpCacheEntry(HttpCacheEntryKt.cacheExpires$default(httpResponse, httpCache.getIsSharedClient(), null, 2, null), mapVaryKeys, httpCacheEntryFindResponse.getResponse(), httpCacheEntryFindResponse.getBody()));
        return httpCacheEntryFindResponse.produceResponse$ktor_client_core();
    }

    public static final HttpCacheEntry findResponse(HttpCache httpCache, HttpCacheStorage httpCacheStorage, Map<String, String> map, Url url, HttpRequest httpRequest) {
        Object next;
        if (!map.isEmpty()) {
            return httpCacheStorage.find(url, map);
        }
        Function1<String, String> function1MergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new HttpCacheLegacyKt$findResponse$requestHeaders$1(httpRequest.getHeaders()), new HttpCacheLegacyKt$findResponse$requestHeaders$2(httpRequest.getHeaders()));
        Iterator it = CollectionsKt___CollectionsKt.sortedWith(httpCacheStorage.findByUrl(url), new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((HttpCacheEntry) t2).getResponse().getResponseTime(), ((HttpCacheEntry) t).getResponse().getResponseTime());
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map<String, String> varyKeys = ((HttpCacheEntry) next).getVaryKeys();
            if (!varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    if (!Intrinsics.areEqual(function1MergedHeadersLookup.invoke(entry.getKey()), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (HttpCacheEntry) next;
    }

    public static final HttpCacheEntry findResponse(HttpCache httpCache, HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent) {
        Url Url = URLUtilsKt.Url(httpRequestBuilder.getUrl());
        Function1<String, String> function1MergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(outgoingContent, new HttpCacheLegacyKt$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new HttpCacheLegacyKt$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
        for (HttpCacheEntry httpCacheEntry : SetsKt___SetsKt.plus((Set) httpCache.getPrivateStorage().findByUrl(Url), (Iterable) httpCache.getPublicStorage().findByUrl(Url))) {
            Map<String, String> varyKeys = httpCacheEntry.getVaryKeys();
            if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!Intrinsics.areEqual(function1MergedHeadersLookup.invoke(key), entry.getValue())) {
                        break;
                    }
                }
            }
            return httpCacheEntry;
        }
        return null;
    }
}
