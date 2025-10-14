package io.ktor.client.plugins.cache.storage;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.client.plugins.cache.HttpCacheEntryKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.Url;
import io.ktor.util.InternalAPI;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCacheStorage.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001d\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a1\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a;\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a-\u0010\t\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m7105d2 = {"createResponse", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "client", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequest;", "responseContext", "Lkotlin/coroutines/CoroutineContext;", "store", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "response", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "varyKeys", "", "", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isShared", "", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "url", "Lio/ktor/http/Url;", "value", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/http/Url;Lio/ktor/client/statement/HttpResponse;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpCacheStorageKt {

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", m7120f = "HttpCacheStorage.kt", m7121i = {0, 0}, m7122l = {57}, m7123m = "store", m7124n = {"$this$store", "url"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 */
    /* loaded from: classes7.dex */
    public static final class C101771 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101771(Continuation<? super C101771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheStorageKt.store((HttpCacheStorage) null, (Url) null, (HttpResponse) null, false, (Continuation<? super HttpCacheEntry>) this);
        }
    }

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", m7120f = "HttpCacheStorage.kt", m7121i = {0, 0, 0, 0, 0, 1}, m7122l = {125, 138}, m7123m = "store", m7124n = {"$this$store", "response", "varyKeys", "url", "isShared", "data"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$4 */
    /* loaded from: classes7.dex */
    public static final class C101784 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C101784(Continuation<? super C101784> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheStorageKt.store((CacheStorage) null, (HttpResponse) null, (Map<String, String>) null, false, (Continuation<? super CachedResponseData>) this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object store(@NotNull HttpCacheStorage httpCacheStorage, @NotNull Url url, @NotNull HttpResponse httpResponse, boolean z, @NotNull Continuation<? super HttpCacheEntry> continuation) throws Throwable {
        C101771 c101771;
        if (continuation instanceof C101771) {
            c101771 = (C101771) continuation;
            int i = c101771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101771.label = i - Integer.MIN_VALUE;
            } else {
                c101771 = new C101771(continuation);
            }
        }
        Object objHttpCacheEntry = c101771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHttpCacheEntry);
            c101771.L$0 = httpCacheStorage;
            c101771.L$1 = url;
            c101771.label = 1;
            objHttpCacheEntry = HttpCacheEntryKt.HttpCacheEntry(z, httpResponse, c101771);
            if (objHttpCacheEntry == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c101771.L$1;
            httpCacheStorage = (HttpCacheStorage) c101771.L$0;
            ResultKt.throwOnFailure(objHttpCacheEntry);
        }
        HttpCacheEntry httpCacheEntry = (HttpCacheEntry) objHttpCacheEntry;
        httpCacheStorage.store(url, httpCacheEntry);
        return httpCacheEntry;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use method with `response.varyKeys()` and `isShared` arguments", replaceWith = @ReplaceWith(expression = "store(response, response.varyKeys(), isShared)", imports = {}))
    @Nullable
    public static final Object store(@NotNull CacheStorage cacheStorage, @NotNull HttpResponse httpResponse, @NotNull Continuation<? super CachedResponseData> continuation) {
        return store$default(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), false, continuation, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object store(@NotNull CacheStorage cacheStorage, @NotNull HttpResponse httpResponse, @NotNull Map<String, String> map, boolean z, @NotNull Continuation<? super CachedResponseData> continuation) throws Throwable {
        C101784 c101784;
        CacheStorage cacheStorage2;
        HttpResponse httpResponse2;
        boolean z2;
        Url url;
        Map<String, String> map2;
        if (continuation instanceof C101784) {
            c101784 = (C101784) continuation;
            int i = c101784.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101784.label = i - Integer.MIN_VALUE;
            } else {
                c101784 = new C101784(continuation);
            }
        }
        Object obj = c101784.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101784.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Url url2 = httpResponse.getCall().getRequest().getUrl();
            ByteReadChannel content = httpResponse.getContent();
            cacheStorage2 = cacheStorage;
            c101784.L$0 = cacheStorage2;
            httpResponse2 = httpResponse;
            c101784.L$1 = httpResponse2;
            c101784.L$2 = map;
            c101784.L$3 = url2;
            z2 = z;
            c101784.Z$0 = z2;
            c101784.label = 1;
            Object remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(content, 0L, c101784, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            url = url2;
            obj = remaining$default;
            map2 = map;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CachedResponseData cachedResponseData = (CachedResponseData) c101784.L$0;
                ResultKt.throwOnFailure(obj);
                return cachedResponseData;
            }
            boolean z3 = c101784.Z$0;
            url = (Url) c101784.L$3;
            Map<String, String> map3 = (Map) c101784.L$2;
            HttpResponse httpResponse3 = (HttpResponse) c101784.L$1;
            CacheStorage cacheStorage3 = (CacheStorage) c101784.L$0;
            ResultKt.throwOnFailure(obj);
            z2 = z3;
            map2 = map3;
            httpResponse2 = httpResponse3;
            cacheStorage2 = cacheStorage3;
        }
        byte[] bytes$default = StringsKt.readBytes$default((ByteReadPacket) obj, 0, 1, null);
        HttpResponseKt.complete(httpResponse2);
        CachedResponseData cachedResponseData2 = new CachedResponseData(httpResponse2.getCall().getRequest().getUrl(), httpResponse2.getStatus(), httpResponse2.getRequestTime(), httpResponse2.getResponseTime(), httpResponse2.getVersion(), HttpCacheEntryKt.cacheExpires$default(httpResponse2, z2, null, 2, null), httpResponse2.getHeaders(), map2, bytes$default);
        c101784.L$0 = cachedResponseData2;
        c101784.L$1 = null;
        c101784.L$2 = null;
        c101784.L$3 = null;
        c101784.label = 2;
        return cacheStorage2.store(url, cachedResponseData2, c101784) == coroutine_suspended ? coroutine_suspended : cachedResponseData2;
    }

    public static /* synthetic */ Object store$default(CacheStorage cacheStorage, HttpResponse httpResponse, Map map, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return store(cacheStorage, httpResponse, (Map<String, String>) map, z, (Continuation<? super CachedResponseData>) continuation);
    }

    @NotNull
    public static final HttpResponse createResponse(@NotNull final CachedResponseData cachedResponseData, @NotNull HttpClient client, @NotNull HttpRequest request, @NotNull final CoroutineContext responseContext) {
        Intrinsics.checkNotNullParameter(cachedResponseData, "<this>");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseContext, "responseContext");
        return new SavedHttpCall(client, request, new HttpResponse(cachedResponseData, responseContext) { // from class: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$createResponse$response$1

            @NotNull
            public final CoroutineContext coroutineContext;

            @NotNull
            public final Headers headers;

            @NotNull
            public final GMTDate requestTime;

            @NotNull
            public final GMTDate responseTime;

            @NotNull
            public final HttpStatusCode status;

            @NotNull
            public final HttpProtocolVersion version;

            @InternalAPI
            public static /* synthetic */ void getContent$annotations() {
            }

            {
                this.status = cachedResponseData.getStatusCode();
                this.version = cachedResponseData.getVersion();
                this.requestTime = cachedResponseData.getRequestTime();
                this.responseTime = cachedResponseData.getResponseTime();
                this.headers = cachedResponseData.getHeaders();
                this.coroutineContext = responseContext;
            }

            @Override // io.ktor.client.statement.HttpResponse
            @NotNull
            public HttpClientCall getCall() {
                throw new IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.client.statement.HttpResponse
            @NotNull
            public HttpStatusCode getStatus() {
                return this.status;
            }

            @Override // io.ktor.client.statement.HttpResponse
            @NotNull
            public HttpProtocolVersion getVersion() {
                return this.version;
            }

            @Override // io.ktor.client.statement.HttpResponse
            @NotNull
            public GMTDate getRequestTime() {
                return this.requestTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            @NotNull
            public GMTDate getResponseTime() {
                return this.responseTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            @NotNull
            public ByteReadChannel getContent() {
                throw new IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.http.HttpMessage
            @NotNull
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // kotlinx.coroutines.CoroutineScope
            @NotNull
            public CoroutineContext getCoroutineContext() {
                return this.coroutineContext;
            }
        }, cachedResponseData.getBody()).getResponse();
    }
}
