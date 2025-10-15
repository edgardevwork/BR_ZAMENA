package coil.fetch;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSources;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.network.CacheResponse;
import coil.network.CacheStrategy;
import coil.network.HttpException;
import coil.request.Options;
import coil.util.Calls;
import coil.util.Utils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpUriFetcher.kt */
@Metadata(m7104d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0002\b J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002J.\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010%2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010)*\u00020%H\u0002J\f\u0010+\u001a\u00020,*\u00020\u0016H\u0002J\f\u0010-\u001a\u00020.*\u00020%H\u0002J\f\u0010-\u001a\u00020.*\u00020/H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, m7105d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/Fetcher;", "url", "", "options", "Lcoil/request/Options;", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "diskCache", "Lcoil/disk/DiskCache;", "respectCacheHeaders", "", "(Ljava/lang/String;Lcoil/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "diskCacheKey", "getDiskCacheKey", "()Ljava/lang/String;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "executeNetworkRequest", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMimeType", "contentType", "Lokhttp3/MediaType;", "getMimeType$coil_base_release", "isCacheable", "response", "newRequest", "readFromDiskCache", "Lcoil/disk/DiskCache$Snapshot;", "writeToDiskCache", "snapshot", "cacheResponse", "Lcoil/network/CacheResponse;", "toCacheResponse", "toDataSource", "Lcoil/decode/DataSource;", "toImageSource", "Lcoil/decode/ImageSource;", "Lokhttp3/ResponseBody;", "Companion", "Factory", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n+ 2 FileSystem.kt\nokio/FileSystem\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n80#2:305\n165#2:306\n81#2:307\n82#2:313\n80#2:340\n165#2:341\n81#2:342\n82#2:348\n80#2:375\n165#2:376\n81#2:377\n82#2:383\n67#2:414\n68#2:420\n52#3,5:308\n60#3,10:314\n57#3,16:324\n52#3,5:343\n60#3,10:349\n57#3,16:359\n52#3,5:378\n60#3,10:384\n57#3,16:394\n66#3:413\n52#3,5:415\n60#3,10:421\n57#3,2:431\n71#3,2:433\n215#4,2:410\n1#5:412\n*S KotlinDebug\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n*L\n162#1:305\n162#1:306\n162#1:307\n162#1:313\n167#1:340\n167#1:341\n167#1:342\n167#1:348\n170#1:375\n170#1:376\n170#1:377\n170#1:383\n255#1:414\n255#1:420\n162#1:308,5\n162#1:314,10\n162#1:324,16\n167#1:343,5\n167#1:349,10\n167#1:359,16\n170#1:378,5\n170#1:384,10\n170#1:394,16\n255#1:413\n255#1:415,5\n255#1:421,10\n255#1:431,2\n255#1:433,2\n190#1:410,2\n*E\n"})
/* loaded from: classes.dex */
public final class HttpUriFetcher implements Fetcher {

    @NotNull
    public static final String MIME_TYPE_TEXT_PLAIN = "text/plain";

    @NotNull
    public final Lazy<Call.Factory> callFactory;

    @NotNull
    public final Lazy<DiskCache> diskCache;

    @NotNull
    public final Options options;
    public final boolean respectCacheHeaders;

    @NotNull
    public final String url;

    @NotNull
    public static final CacheControl CACHE_CONTROL_FORCE_NETWORK_NO_CACHE = new CacheControl.Builder().noCache().noStore().build();

    @NotNull
    public static final CacheControl CACHE_CONTROL_NO_NETWORK_NO_CACHE = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.fetch.HttpUriFetcher", m7120f = "HttpUriFetcher.kt", m7121i = {}, m7122l = {224}, m7123m = "executeNetworkRequest", m7124n = {}, m7125s = {})
    /* renamed from: coil.fetch.HttpUriFetcher$executeNetworkRequest$1 */
    public static final class C34101 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C34101(Continuation<? super C34101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpUriFetcher.this.executeNetworkRequest(null, this);
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.fetch.HttpUriFetcher", m7120f = "HttpUriFetcher.kt", m7121i = {0, 0, 0, 1, 1, 1}, m7122l = {77, 106}, m7123m = RemoteConfigComponent.FETCH_FILE_NAME, m7124n = {"this", "snapshot", "cacheStrategy", "this", "snapshot", "response"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: coil.fetch.HttpUriFetcher$fetch$1 */
    public static final class C34111 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C34111(Continuation<? super C34111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpUriFetcher.this.fetch(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpUriFetcher(@NotNull String str, @NotNull Options options, @NotNull Lazy<? extends Call.Factory> lazy, @NotNull Lazy<? extends DiskCache> lazy2, boolean z) {
        this.url = str;
        this.options = options;
        this.callFactory = lazy;
        this.diskCache = lazy2;
        this.respectCacheHeaders = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil.fetch.Fetcher
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(@NotNull Continuation<? super FetchResult> continuation) throws Exception {
        C34111 c34111;
        DiskCache.Snapshot snapshot;
        Exception e;
        CacheStrategy cacheStrategyCompute;
        HttpUriFetcher httpUriFetcher;
        DiskCache.Snapshot snapshotWriteToDiskCache;
        CacheStrategy cacheStrategy;
        Response response;
        Response response2;
        Exception e2;
        HttpUriFetcher httpUriFetcher2;
        if (continuation instanceof C34111) {
            c34111 = (C34111) continuation;
            int i = c34111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34111.label = i - Integer.MIN_VALUE;
            } else {
                c34111 = new C34111(continuation);
            }
        }
        Object obj = c34111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34111.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                response2 = (Response) c34111.L$2;
                snapshotWriteToDiskCache = (DiskCache.Snapshot) c34111.L$1;
                httpUriFetcher2 = (HttpUriFetcher) c34111.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Response response3 = (Response) obj;
                    ResponseBody responseBodyRequireBody = Utils.requireBody(response3);
                    return new SourceResult(httpUriFetcher2.toImageSource(responseBodyRequireBody), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, responseBodyRequireBody.contentType()), httpUriFetcher2.toDataSource(response3));
                } catch (Exception e3) {
                    e2 = e3;
                    Utils.closeQuietly(response2);
                    throw e2;
                }
            }
            CacheStrategy cacheStrategy2 = (CacheStrategy) c34111.L$2;
            snapshot = (DiskCache.Snapshot) c34111.L$1;
            httpUriFetcher = (HttpUriFetcher) c34111.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cacheStrategy = cacheStrategy2;
                snapshotWriteToDiskCache = snapshot;
                try {
                    response = (Response) obj;
                    ResponseBody responseBodyRequireBody2 = Utils.requireBody(response);
                    try {
                        snapshotWriteToDiskCache = httpUriFetcher.writeToDiskCache(snapshotWriteToDiskCache, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                        if (snapshotWriteToDiskCache == null) {
                            ImageSource imageSource = httpUriFetcher.toImageSource(snapshotWriteToDiskCache);
                            String str = httpUriFetcher.url;
                            CacheResponse cacheResponse = httpUriFetcher.toCacheResponse(snapshotWriteToDiskCache);
                            return new SourceResult(imageSource, httpUriFetcher.getMimeType$coil_base_release(str, cacheResponse != null ? cacheResponse.getContentType() : null), DataSource.NETWORK);
                        }
                        if (responseBodyRequireBody2.getContentLength() > 0) {
                            return new SourceResult(httpUriFetcher.toImageSource(responseBodyRequireBody2), httpUriFetcher.getMimeType$coil_base_release(httpUriFetcher.url, responseBodyRequireBody2.contentType()), httpUriFetcher.toDataSource(response));
                        }
                        Utils.closeQuietly(response);
                        Request requestNewRequest = httpUriFetcher.newRequest();
                        c34111.L$0 = httpUriFetcher;
                        c34111.L$1 = snapshotWriteToDiskCache;
                        c34111.L$2 = response;
                        c34111.label = 2;
                        Object objExecuteNetworkRequest = httpUriFetcher.executeNetworkRequest(requestNewRequest, c34111);
                        if (objExecuteNetworkRequest == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        response2 = response;
                        obj = objExecuteNetworkRequest;
                        httpUriFetcher2 = httpUriFetcher;
                        Response response32 = (Response) obj;
                        ResponseBody responseBodyRequireBody3 = Utils.requireBody(response32);
                        return new SourceResult(httpUriFetcher2.toImageSource(responseBodyRequireBody3), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, responseBodyRequireBody3.contentType()), httpUriFetcher2.toDataSource(response32));
                    } catch (Exception e4) {
                        response2 = response;
                        e2 = e4;
                        Utils.closeQuietly(response2);
                        throw e2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    snapshot = snapshotWriteToDiskCache;
                    if (snapshot != null) {
                    }
                    throw e;
                }
            } catch (Exception e6) {
                e = e6;
                if (snapshot != null) {
                    Utils.closeQuietly(snapshot);
                }
                throw e;
            }
        }
        ResultKt.throwOnFailure(obj);
        DiskCache.Snapshot fromDiskCache = readFromDiskCache();
        try {
            if (fromDiskCache != null) {
                Long size = getFileSystem().metadata(fromDiskCache.getMetadata()).getSize();
                if (size != null && size.longValue() == 0) {
                    return new SourceResult(toImageSource(fromDiskCache), getMimeType$coil_base_release(this.url, null), DataSource.DISK);
                }
                if (this.respectCacheHeaders) {
                    cacheStrategyCompute = new CacheStrategy.Factory(newRequest(), toCacheResponse(fromDiskCache)).compute();
                    if (cacheStrategyCompute.getNetworkRequest() == null && cacheStrategyCompute.getCacheResponse() != null) {
                        return new SourceResult(toImageSource(fromDiskCache), getMimeType$coil_base_release(this.url, cacheStrategyCompute.getCacheResponse().getContentType()), DataSource.DISK);
                    }
                } else {
                    ImageSource imageSource2 = toImageSource(fromDiskCache);
                    String str2 = this.url;
                    CacheResponse cacheResponse2 = toCacheResponse(fromDiskCache);
                    return new SourceResult(imageSource2, getMimeType$coil_base_release(str2, cacheResponse2 != null ? cacheResponse2.getContentType() : null), DataSource.DISK);
                }
            } else {
                cacheStrategyCompute = new CacheStrategy.Factory(newRequest(), null).compute();
            }
            Request networkRequest = cacheStrategyCompute.getNetworkRequest();
            Intrinsics.checkNotNull(networkRequest);
            c34111.L$0 = this;
            c34111.L$1 = fromDiskCache;
            c34111.L$2 = cacheStrategyCompute;
            c34111.label = 1;
            Object objExecuteNetworkRequest2 = executeNetworkRequest(networkRequest, c34111);
            if (objExecuteNetworkRequest2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpUriFetcher = this;
            CacheStrategy cacheStrategy3 = cacheStrategyCompute;
            snapshotWriteToDiskCache = fromDiskCache;
            obj = objExecuteNetworkRequest2;
            cacheStrategy = cacheStrategy3;
            response = (Response) obj;
            ResponseBody responseBodyRequireBody22 = Utils.requireBody(response);
            snapshotWriteToDiskCache = httpUriFetcher.writeToDiskCache(snapshotWriteToDiskCache, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
            if (snapshotWriteToDiskCache == null) {
            }
        } catch (Exception e7) {
            snapshot = fromDiskCache;
            e = e7;
            if (snapshot != null) {
            }
            throw e;
        }
    }

    public final DiskCache.Snapshot readFromDiskCache() {
        DiskCache value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.openSnapshot(getDiskCacheKey());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[Catch: all -> 0x007e, Exception -> 0x0081, TRY_LEAVE, TryCatch #10 {Exception -> 0x0081, blocks: (B:15:0x002b, B:18:0x0036, B:37:0x0089, B:71:0x0103, B:38:0x008e, B:30:0x007a, B:39:0x008f, B:55:0x00c2, B:70:0x0100, B:74:0x010b, B:67:0x00f8, B:75:0x010c, B:52:0x00bb), top: B:99:0x002b, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c A[Catch: all -> 0x007e, Exception -> 0x0081, TRY_LEAVE, TryCatch #10 {Exception -> 0x0081, blocks: (B:15:0x002b, B:18:0x0036, B:37:0x0089, B:71:0x0103, B:38:0x008e, B:30:0x007a, B:39:0x008f, B:55:0x00c2, B:70:0x0100, B:74:0x010b, B:67:0x00f8, B:75:0x010c, B:52:0x00bb), top: B:99:0x002b, outer: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DiskCache.Snapshot writeToDiskCache(DiskCache.Snapshot snapshot, Request request, Response response, CacheResponse cacheResponse) throws IOException {
        DiskCache.Editor editorOpenEditor;
        Throwable th;
        Unit unit;
        Long lValueOf;
        Unit unit2;
        Throwable th2 = null;
        if (!isCacheable(request, response)) {
            if (snapshot != null) {
                Utils.closeQuietly(snapshot);
            }
            return null;
        }
        if (snapshot != null) {
            editorOpenEditor = snapshot.closeAndOpenEditor();
        } else {
            DiskCache value = this.diskCache.getValue();
            editorOpenEditor = value != null ? value.openEditor(getDiskCacheKey()) : null;
        }
        try {
            if (editorOpenEditor == null) {
                return null;
            }
            try {
                if (response.code() == 304 && cacheResponse != null) {
                    Response responseBuild = response.newBuilder().headers(CacheStrategy.INSTANCE.combineHeaders(cacheResponse.getResponseHeaders(), response.headers())).build();
                    BufferedSink bufferedSinkBuffer = Okio.buffer(getFileSystem().sink(editorOpenEditor.getMetadata(), false));
                    try {
                        new CacheResponse(responseBuild).writeTo(bufferedSinkBuffer);
                        unit2 = Unit.INSTANCE;
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        if (bufferedSinkBuffer != null) {
                            try {
                                bufferedSinkBuffer.close();
                            } catch (Throwable th5) {
                                ExceptionsKt__ExceptionsKt.addSuppressed(th4, th5);
                            }
                        }
                        th2 = th4;
                        unit2 = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    Intrinsics.checkNotNull(unit2);
                } else {
                    BufferedSink bufferedSinkBuffer2 = Okio.buffer(getFileSystem().sink(editorOpenEditor.getMetadata(), false));
                    try {
                        new CacheResponse(response).writeTo(bufferedSinkBuffer2);
                        unit = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        if (bufferedSinkBuffer2 != null) {
                            try {
                                bufferedSinkBuffer2.close();
                            } catch (Throwable th7) {
                                ExceptionsKt__ExceptionsKt.addSuppressed(th6, th7);
                            }
                        }
                        th = th6;
                        unit = null;
                    }
                    if (bufferedSinkBuffer2 != null) {
                        try {
                            bufferedSinkBuffer2.close();
                            th = null;
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        if (th == null) {
                            throw th;
                        }
                        Intrinsics.checkNotNull(unit);
                        BufferedSink bufferedSinkBuffer3 = Okio.buffer(getFileSystem().sink(editorOpenEditor.getData(), false));
                        try {
                            ResponseBody responseBodyBody = response.body();
                            Intrinsics.checkNotNull(responseBodyBody);
                            lValueOf = Long.valueOf(responseBodyBody.getSource().readAll(bufferedSinkBuffer3));
                            if (bufferedSinkBuffer3 != null) {
                                try {
                                    bufferedSinkBuffer3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            }
                        } catch (Throwable th10) {
                            if (bufferedSinkBuffer3 != null) {
                                try {
                                    bufferedSinkBuffer3.close();
                                } catch (Throwable th11) {
                                    ExceptionsKt__ExceptionsKt.addSuppressed(th10, th11);
                                }
                            }
                            th2 = th10;
                            lValueOf = null;
                        }
                        if (th2 != null) {
                            throw th2;
                        }
                        Intrinsics.checkNotNull(lValueOf);
                    } else {
                        th = null;
                        if (th == null) {
                        }
                    }
                }
                DiskCache.Snapshot snapshotCommitAndOpenSnapshot = editorOpenEditor.commitAndOpenSnapshot();
                Utils.closeQuietly(response);
                return snapshotCommitAndOpenSnapshot;
            } catch (Exception e) {
                Utils.abortQuietly(editorOpenEditor);
                throw e;
            }
        } catch (Throwable th12) {
            Utils.closeQuietly(response);
            throw th12;
        }
    }

    public final Request newRequest() {
        Request.Builder builderHeaders = new Request.Builder().url(this.url).headers(this.options.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : this.options.getTags().asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builderHeaders.tag(key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                builderHeaders.cacheControl(CACHE_CONTROL_NO_NETWORK_NO_CACHE);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(CACHE_CONTROL_FORCE_NETWORK_NO_CACHE);
        }
        return builderHeaders.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeNetworkRequest(Request request, Continuation<? super Response> continuation) throws Throwable {
        C34101 c34101;
        Response responseExecute;
        if (continuation instanceof C34101) {
            c34101 = (C34101) continuation;
            int i = c34101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34101.label = i - Integer.MIN_VALUE;
            } else {
                c34101 = new C34101(continuation);
            }
        }
        Object objAwait = c34101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (Utils.isMainThread()) {
                if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                    throw new NetworkOnMainThreadException();
                }
                responseExecute = FirebasePerfOkHttpClient.execute(this.callFactory.getValue().newCall(request));
                if (!responseExecute.isSuccessful() || responseExecute.code() == 304) {
                    return responseExecute;
                }
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody != null) {
                    Utils.closeQuietly(responseBodyBody);
                }
                throw new HttpException(responseExecute);
            }
            Call callNewCall = this.callFactory.getValue().newCall(request);
            c34101.label = 1;
            objAwait = Calls.await(callNewCall, c34101);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        responseExecute = (Response) objAwait;
        if (responseExecute.isSuccessful()) {
        }
        return responseExecute;
    }

    @VisibleForTesting
    @Nullable
    public final String getMimeType$coil_base_release(@NotNull String url, @Nullable MediaType contentType) {
        String mimeTypeFromUrl;
        String mediaType = contentType != null ? contentType.getMediaType() : null;
        if ((mediaType == null || StringsKt__StringsJVMKt.startsWith$default(mediaType, "text/plain", false, 2, null)) && (mimeTypeFromUrl = Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), url)) != null) {
            return mimeTypeFromUrl;
        }
        if (mediaType != null) {
            return StringsKt__StringsKt.substringBefore$default(mediaType, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    public final boolean isCacheable(Request request, Response response) {
        return this.options.getDiskCachePolicy().getWriteEnabled() && (!this.respectCacheHeaders || CacheStrategy.INSTANCE.isCacheable(request, response));
    }

    public final CacheResponse toCacheResponse(DiskCache.Snapshot snapshot) throws Throwable {
        Throwable th;
        CacheResponse cacheResponse;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(getFileSystem().source(snapshot.getMetadata()));
            try {
                cacheResponse = new CacheResponse(bufferedSourceBuffer);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                cacheResponse = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(cacheResponse);
            return cacheResponse;
        } catch (IOException unused) {
            return null;
        }
    }

    public final ImageSource toImageSource(DiskCache.Snapshot snapshot) {
        return ImageSources.create(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot);
    }

    public final ImageSource toImageSource(ResponseBody responseBody) {
        return ImageSources.create(responseBody.getSource(), this.options.getContext());
    }

    public final DataSource toDataSource(Response response) {
        return response.networkResponse() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    public final String getDiskCacheKey() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    public final FileSystem getFileSystem() {
        DiskCache value = this.diskCache.getValue();
        Intrinsics.checkNotNull(value);
        return value.getFileSystem();
    }

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"Lcoil/fetch/HttpUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "diskCache", "Lcoil/disk/DiskCache;", "respectCacheHeaders", "", "(Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {

        @NotNull
        public final Lazy<Call.Factory> callFactory;

        @NotNull
        public final Lazy<DiskCache> diskCache;
        public final boolean respectCacheHeaders;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(@NotNull Lazy<? extends Call.Factory> lazy, @NotNull Lazy<? extends DiskCache> lazy2, boolean z) {
            this.callFactory = lazy;
            this.diskCache = lazy2;
            this.respectCacheHeaders = z;
        }

        @Override // coil.fetch.Fetcher.Factory
        @Nullable
        public Fetcher create(@NotNull Uri data, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new HttpUriFetcher(data.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
            }
            return null;
        }

        private final boolean isApplicable(Uri data) {
            return Intrinsics.areEqual(data.getScheme(), HttpHost.DEFAULT_SCHEME_NAME) || Intrinsics.areEqual(data.getScheme(), "https");
        }
    }
}
