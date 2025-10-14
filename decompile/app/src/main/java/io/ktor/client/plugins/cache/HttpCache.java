package io.ktor.client.plugins.cache;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.cache.storage.CacheStorage;
import io.ktor.client.plugins.cache.storage.CachedResponseData;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.plugins.cache.storage.HttpCacheStorageKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.Phase;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.p050io.ByteChannelCtorKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCache.kt */
@Metadata(m7104d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0002*+B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J#\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ?\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J#\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)R\u0014\u0010\n\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m7105d2 = {"Lio/ktor/client/plugins/cache/HttpCache;", "", "publicStorage", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "privateStorage", "publicStorageNew", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "privateStorageNew", "useOldStorage", "", "isSharedClient", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;ZZ)V", "isSharedClient$ktor_client_core", "()Z", "getPrivateStorage$annotations", "()V", "getPrivateStorage", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$annotations", "getPublicStorage", "cacheResponse", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAndRefresh", "request", "Lio/ktor/client/request/HttpRequest;", "(Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findResponse", "storage", "varyKeys", "", "", "url", "Lio/ktor/http/Url;", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Ljava/util/Map;Lio/ktor/http/Url;Lio/ktor/client/request/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "context", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "Lio/ktor/http/content/OutgoingContent;", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Config", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,375:1\n1#2:376\n1054#3:377\n288#3:378\n289#3:382\n167#4,3:379\n167#4,3:383\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n*L\n317#1:377\n318#1:378\n318#1:382\n319#1:379,3\n331#1:383,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCache {
    public final boolean isSharedClient;

    @NotNull
    public final HttpCacheStorage privateStorage;

    @NotNull
    public final CacheStorage privateStorageNew;

    @NotNull
    public final HttpCacheStorage publicStorage;

    @NotNull
    public final CacheStorage publicStorageNew;
    public final boolean useOldStorage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<HttpCache> key = new AttributeKey<>("HttpCache");

    @NotNull
    public static final EventDefinition<HttpResponse> HttpResponseFromCache = new EventDefinition<>();

    /* compiled from: HttpCache.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCache", m7120f = "HttpCache.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1}, m7122l = {298, 300}, m7123m = "findAndRefresh", m7124n = {"this", "request", "response", "storage", "varyKeysFrom304", "request", "response", "cache"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1 */
    /* loaded from: classes8.dex */
    public static final class C101591 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C101591(Continuation<? super C101591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findAndRefresh(null, null, this);
        }
    }

    /* compiled from: HttpCache.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCache", m7120f = "HttpCache.kt", m7121i = {1}, m7122l = {311, TypedValues.AttributesType.TYPE_PATH_ROTATE}, m7123m = "findResponse", m7124n = {"requestHeaders"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findResponse$1 */
    /* loaded from: classes7.dex */
    public static final class C101601 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101601(Continuation<? super C101601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findResponse(null, null, null, null, this);
        }
    }

    /* compiled from: HttpCache.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.HttpCache", m7120f = "HttpCache.kt", m7121i = {0, 0, 0, 1}, m7122l = {328, 328}, m7123m = "findResponse", m7124n = {"this", "url", "lookup", "lookup"}, m7125s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findResponse$4 */
    /* loaded from: classes7.dex */
    public static final class C101614 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C101614(Continuation<? super C101614> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findResponse(null, null, this);
        }
    }

    public /* synthetic */ HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpCacheStorage, httpCacheStorage2, cacheStorage, cacheStorage2, z, z2);
    }

    @Deprecated(message = "This will become internal")
    public static /* synthetic */ void getPrivateStorage$annotations() {
    }

    @Deprecated(message = "This will become internal")
    public static /* synthetic */ void getPublicStorage$annotations() {
    }

    public HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z, boolean z2) {
        this.publicStorage = httpCacheStorage;
        this.privateStorage = httpCacheStorage2;
        this.publicStorageNew = cacheStorage;
        this.privateStorageNew = cacheStorage2;
        this.useOldStorage = z;
        this.isSharedClient = z2;
    }

    @NotNull
    public final HttpCacheStorage getPublicStorage() {
        return this.publicStorage;
    }

    @NotNull
    public final HttpCacheStorage getPrivateStorage() {
        return this.privateStorage;
    }

    /* renamed from: isSharedClient$ktor_client_core, reason: from getter */
    public final boolean getIsSharedClient() {
        return this.isSharedClient;
    }

    /* compiled from: HttpCache.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R,\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R,\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007¨\u0006\""}, m7105d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Config;", "", "()V", "isShared", "", "()Z", "setShared", "(Z)V", "value", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "privateStorage", "getPrivateStorage$annotations", "getPrivateStorage", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "setPrivateStorage", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;)V", "privateStorageNew", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "getPrivateStorageNew$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/CacheStorage;", "setPrivateStorageNew$ktor_client_core", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "publicStorage", "getPublicStorage$annotations", "getPublicStorage", "setPublicStorage", "publicStorageNew", "getPublicStorageNew$ktor_client_core", "setPublicStorageNew$ktor_client_core", "useOldStorage", "getUseOldStorage$ktor_client_core", "setUseOldStorage$ktor_client_core", "", "storage", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {
        public boolean isShared;

        @NotNull
        public HttpCacheStorage privateStorage;

        @NotNull
        public CacheStorage privateStorageNew;

        @NotNull
        public HttpCacheStorage publicStorage;

        @NotNull
        public CacheStorage publicStorageNew;
        public boolean useOldStorage;

        @Deprecated(message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void getPrivateStorage$annotations() {
        }

        @Deprecated(message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void getPublicStorage$annotations() {
        }

        public Config() {
            CacheStorage.Companion companion = CacheStorage.INSTANCE;
            this.publicStorageNew = companion.getUnlimited().invoke();
            this.privateStorageNew = companion.getUnlimited().invoke();
            HttpCacheStorage.Companion companion2 = HttpCacheStorage.INSTANCE;
            this.publicStorage = companion2.getUnlimited().invoke();
            this.privateStorage = companion2.getUnlimited().invoke();
        }

        @NotNull
        /* renamed from: getPublicStorageNew$ktor_client_core, reason: from getter */
        public final CacheStorage getPublicStorageNew() {
            return this.publicStorageNew;
        }

        public final void setPublicStorageNew$ktor_client_core(@NotNull CacheStorage cacheStorage) {
            Intrinsics.checkNotNullParameter(cacheStorage, "<set-?>");
            this.publicStorageNew = cacheStorage;
        }

        @NotNull
        /* renamed from: getPrivateStorageNew$ktor_client_core, reason: from getter */
        public final CacheStorage getPrivateStorageNew() {
            return this.privateStorageNew;
        }

        public final void setPrivateStorageNew$ktor_client_core(@NotNull CacheStorage cacheStorage) {
            Intrinsics.checkNotNullParameter(cacheStorage, "<set-?>");
            this.privateStorageNew = cacheStorage;
        }

        /* renamed from: getUseOldStorage$ktor_client_core, reason: from getter */
        public final boolean getUseOldStorage() {
            return this.useOldStorage;
        }

        public final void setUseOldStorage$ktor_client_core(boolean z) {
            this.useOldStorage = z;
        }

        /* renamed from: isShared, reason: from getter */
        public final boolean getIsShared() {
            return this.isShared;
        }

        public final void setShared(boolean z) {
            this.isShared = z;
        }

        @NotNull
        public final HttpCacheStorage getPublicStorage() {
            return this.publicStorage;
        }

        public final void setPublicStorage(@NotNull HttpCacheStorage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.publicStorage = value;
        }

        @NotNull
        public final HttpCacheStorage getPrivateStorage() {
            return this.privateStorage;
        }

        public final void setPrivateStorage(@NotNull HttpCacheStorage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.privateStorage = value;
        }

        public final void publicStorage(@NotNull CacheStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.publicStorageNew = storage;
        }

        public final void privateStorage(@NotNull CacheStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.privateStorageNew = storage;
        }
    }

    /* compiled from: HttpCache.kt */
    @Metadata(m7104d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J!\u0010\u0013\u001a\u00020\u00032\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0016H\u0016J3\u0010\u0017\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0080@ø\u0001\u0000¢\u0006\u0004\b \u0010!J9\u0010\"\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m7105d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cache/HttpCache$Config;", "Lio/ktor/client/plugins/cache/HttpCache;", "()V", "HttpResponseFromCache", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "getHttpResponseFromCache", "()Lio/ktor/events/EventDefinition;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "proceedWithCache", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "cachedCall", "Lio/ktor/client/call/HttpClientCall;", "proceedWithCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithMissingCache", "proceedWithMissingCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithWarning", "cachedResponse", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "callContext", "Lkotlin/coroutines/CoroutineContext;", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lio/ktor/client/HttpClient;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,375:1\n24#2:376\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion\n*L\n234#1:376\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, HttpCache> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<HttpCache> getKey() {
            return HttpCache.key;
        }

        @NotNull
        public final EventDefinition<HttpResponse> getHttpResponseFromCache() {
            return HttpCache.HttpResponseFromCache;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public HttpCache prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpCache(config.getPublicStorage(), config.getPrivateStorage(), config.getPublicStorageNew(), config.getPrivateStorageNew(), config.getUseOldStorage(), config.getIsShared(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull HttpCache plugin, @NotNull HttpClient httpClient) throws InvalidPhaseException {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(httpClient, "scope");
            Phase phase = new Phase("Cache");
            httpClient.getSendPipeline().insertPhaseAfter(HttpSendPipeline.INSTANCE.getState(), phase);
            httpClient.getSendPipeline().intercept(phase, new HttpCache$Companion$install$1(plugin, httpClient, null));
            httpClient.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getState(), new HttpCache$Companion$install$2(plugin, httpClient, null));
        }

        @Nullable
        public final Object proceedWithCache$ktor_client_core(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull HttpClient httpClient, @NotNull HttpClientCall httpClientCall, @NotNull Continuation<? super Unit> continuation) {
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object objProceedWith = pipelineContext.proceedWith(httpClientCall, continuation);
            return objProceedWith == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProceedWith : Unit.INSTANCE;
        }

        public final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, CachedResponseData cachedResponseData, HttpClient httpClient, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
            HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
            HttpStatusCode statusCode = cachedResponseData.getStatusCode();
            GMTDate requestTime = cachedResponseData.getRequestTime();
            Headers.Companion companion = Headers.INSTANCE;
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            headersBuilder.appendAll(cachedResponseData.getHeaders());
            headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
            Unit unit = Unit.INSTANCE;
            HttpClientCall httpClientCall = new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(statusCode, requestTime, headersBuilder.build(), cachedResponseData.getVersion(), ByteChannelCtorKt.ByteReadChannel(cachedResponseData.getBody()), coroutineContext));
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object objProceedWith = pipelineContext.proceedWith(httpClientCall, continuation);
            return objProceedWith == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProceedWith : unit;
        }

        @Nullable
        public final Object proceedWithMissingCache$ktor_client_core(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull HttpClient httpClient, @NotNull Continuation<? super Unit> continuation) {
            pipelineContext.finish();
            HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
            Object objProceedWith = pipelineContext.proceedWith(new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(HttpStatusCode.INSTANCE.getGatewayTimeout(), DateJvmKt.GMTDate$default(null, 1, null), Headers.INSTANCE.getEmpty(), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), ByteChannelCtorKt.ByteReadChannel(new byte[0]), httpRequestDataBuild.getExecutionContext())), continuation);
            return objProceedWith == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProceedWith : Unit.INSTANCE;
        }
    }

    public final Object cacheResponse(HttpResponse httpResponse, Continuation<? super CachedResponseData> continuation) {
        CacheStorage cacheStorage;
        HttpRequest request = httpResponse.getCall().getRequest();
        List<HeaderValue> listCacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
        List<HeaderValue> listCacheControl2 = HttpMessagePropertiesKt.cacheControl(request);
        CacheControl cacheControl = CacheControl.INSTANCE;
        boolean zContains = listCacheControl.contains(cacheControl.getPRIVATE$ktor_client_core());
        if (zContains && this.isSharedClient) {
            return null;
        }
        if (zContains) {
            cacheStorage = this.privateStorageNew;
        } else {
            cacheStorage = this.publicStorageNew;
        }
        if (listCacheControl.contains(cacheControl.getNO_STORE$ktor_client_core()) || listCacheControl2.contains(cacheControl.getNO_STORE$ktor_client_core())) {
            return null;
        }
        return HttpCacheStorageKt.store(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), this.isSharedClient, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findAndRefresh(HttpRequest httpRequest, HttpResponse httpResponse, Continuation<? super HttpResponse> continuation) throws Throwable {
        C101591 c101591;
        CacheStorage cacheStorage;
        HttpCache httpCache;
        HttpRequest httpRequest2;
        Map<String, String> varyKeys;
        HttpResponse httpResponse2;
        CacheStorage cacheStorage2;
        CachedResponseData cachedResponseData;
        HttpResponse httpResponse3;
        HttpRequest httpRequest3;
        if (continuation instanceof C101591) {
            c101591 = (C101591) continuation;
            int i = c101591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101591.label = i - Integer.MIN_VALUE;
            } else {
                c101591 = new C101591(continuation);
            }
        }
        Object obj = c101591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Url url = httpResponse.getCall().getRequest().getUrl();
            boolean zContains = HttpMessagePropertiesKt.cacheControl(httpResponse).contains(CacheControl.INSTANCE.getPRIVATE$ktor_client_core());
            if (zContains && this.isSharedClient) {
                return null;
            }
            if (zContains) {
                cacheStorage = this.privateStorageNew;
            } else {
                cacheStorage = this.publicStorageNew;
            }
            Map<String, String> mapVaryKeys = HttpCacheEntryKt.varyKeys(httpResponse);
            c101591.L$0 = this;
            c101591.L$1 = httpRequest;
            c101591.L$2 = httpResponse;
            c101591.L$3 = cacheStorage;
            c101591.L$4 = mapVaryKeys;
            c101591.label = 1;
            Object objFindResponse = findResponse(cacheStorage, mapVaryKeys, url, httpRequest, c101591);
            if (objFindResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpCache = this;
            httpRequest2 = httpRequest;
            varyKeys = mapVaryKeys;
            httpResponse2 = httpResponse;
            cacheStorage2 = cacheStorage;
            obj = objFindResponse;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cachedResponseData = (CachedResponseData) c101591.L$2;
                httpResponse3 = (HttpResponse) c101591.L$1;
                httpRequest3 = (HttpRequest) c101591.L$0;
                ResultKt.throwOnFailure(obj);
                return HttpCacheStorageKt.createResponse(cachedResponseData, httpRequest3.getCall().getClient(), httpRequest3, httpResponse3.getCoroutineContext());
            }
            varyKeys = (Map) c101591.L$4;
            cacheStorage2 = (CacheStorage) c101591.L$3;
            httpResponse2 = (HttpResponse) c101591.L$2;
            httpRequest2 = (HttpRequest) c101591.L$1;
            httpCache = (HttpCache) c101591.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CachedResponseData cachedResponseData2 = (CachedResponseData) obj;
        if (cachedResponseData2 == null) {
            return null;
        }
        if (varyKeys.isEmpty()) {
            varyKeys = cachedResponseData2.getVaryKeys();
        }
        Url url2 = httpRequest2.getUrl();
        CachedResponseData cachedResponseDataCopy$ktor_client_core = cachedResponseData2.copy$ktor_client_core(varyKeys, HttpCacheEntryKt.cacheExpires$default(httpResponse2, httpCache.isSharedClient, null, 2, null));
        c101591.L$0 = httpRequest2;
        c101591.L$1 = httpResponse2;
        c101591.L$2 = cachedResponseData2;
        c101591.L$3 = null;
        c101591.L$4 = null;
        c101591.label = 2;
        if (cacheStorage2.store(url2, cachedResponseDataCopy$ktor_client_core, c101591) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cachedResponseData = cachedResponseData2;
        httpResponse3 = httpResponse2;
        httpRequest3 = httpRequest2;
        return HttpCacheStorageKt.createResponse(cachedResponseData, httpRequest3.getCall().getClient(), httpRequest3, httpResponse3.getCoroutineContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findResponse(CacheStorage cacheStorage, Map<String, String> map, Url url, HttpRequest httpRequest, Continuation<? super CachedResponseData> continuation) throws Throwable {
        C101601 c101601;
        Function1<String, String> function1;
        Iterator it;
        Object next;
        if (continuation instanceof C101601) {
            c101601 = (C101601) continuation;
            int i = c101601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101601.label = i - Integer.MIN_VALUE;
            } else {
                c101601 = new C101601(continuation);
            }
        }
        Object objFindAll = c101601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFindAll);
            if (!map.isEmpty()) {
                c101601.label = 1;
                objFindAll = cacheStorage.find(url, map, c101601);
                return objFindAll == coroutine_suspended ? coroutine_suspended : objFindAll;
            }
            Function1<String, String> function1MergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new HttpCache$findResponse$requestHeaders$1(httpRequest.getHeaders()), new HttpCache$findResponse$requestHeaders$2(httpRequest.getHeaders()));
            c101601.L$0 = function1MergedHeadersLookup;
            c101601.label = 2;
            objFindAll = cacheStorage.findAll(url, c101601);
            if (objFindAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function1MergedHeadersLookup;
            it = CollectionsKt___CollectionsKt.sortedWith((Iterable) objFindAll, new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((CachedResponseData) t2).getResponseTime(), ((CachedResponseData) t).getResponseTime());
                }
            }).iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                }
            }
            return (CachedResponseData) next;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objFindAll);
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function1) c101601.L$0;
        ResultKt.throwOnFailure(objFindAll);
        it = CollectionsKt___CollectionsKt.sortedWith((Iterable) objFindAll, new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((CachedResponseData) t2).getResponseTime(), ((CachedResponseData) t).getResponseTime());
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = it.next();
                Map<String, String> varyKeys = ((CachedResponseData) next).getVaryKeys();
                if (!varyKeys.isEmpty()) {
                    for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                        if (!Intrinsics.areEqual(function1.invoke(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            next = null;
            break;
        }
        return (CachedResponseData) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findResponse(HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent, Continuation<? super CachedResponseData> continuation) throws Throwable {
        C101614 c101614;
        Function1<String, String> function1MergedHeadersLookup;
        HttpCache httpCache;
        Url url;
        Function1<String, String> function1;
        Set set;
        if (continuation instanceof C101614) {
            c101614 = (C101614) continuation;
            int i = c101614.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101614.label = i - Integer.MIN_VALUE;
            } else {
                c101614 = new C101614(continuation);
            }
        }
        Object obj = c101614.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101614.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Url Url = URLUtilsKt.Url(httpRequestBuilder.getUrl());
            function1MergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(outgoingContent, new HttpCache$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new HttpCache$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
            CacheStorage cacheStorage = this.privateStorageNew;
            c101614.L$0 = this;
            c101614.L$1 = Url;
            c101614.L$2 = function1MergedHeadersLookup;
            c101614.label = 1;
            Object objFindAll = cacheStorage.findAll(Url, c101614);
            if (objFindAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpCache = this;
            obj = objFindAll;
            url = Url;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) c101614.L$1;
                function1 = (Function1) c101614.L$0;
                ResultKt.throwOnFailure(obj);
                for (CachedResponseData cachedResponseData : SetsKt___SetsKt.plus(set, (Iterable) obj)) {
                    Map<String, String> varyKeys = cachedResponseData.getVaryKeys();
                    if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                        for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                            String key2 = entry.getKey();
                            if (!Intrinsics.areEqual(function1.invoke(key2), entry.getValue())) {
                                break;
                            }
                        }
                    }
                    return cachedResponseData;
                }
                return null;
            }
            function1MergedHeadersLookup = (Function1) c101614.L$2;
            url = (Url) c101614.L$1;
            httpCache = (HttpCache) c101614.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Set set2 = (Set) obj;
        CacheStorage cacheStorage2 = httpCache.publicStorageNew;
        c101614.L$0 = function1MergedHeadersLookup;
        c101614.L$1 = set2;
        c101614.L$2 = null;
        c101614.label = 2;
        Object objFindAll2 = cacheStorage2.findAll(url, c101614);
        if (objFindAll2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        function1 = function1MergedHeadersLookup;
        set = set2;
        obj = objFindAll2;
        while (r9.hasNext()) {
        }
        return null;
    }
}
