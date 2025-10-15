package io.ktor.client.engine.android;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.http.Headers;
import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.p050io.ByteReadChannel;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidClientEngine.kt */
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/client/engine/android/AndroidClientEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "config", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "(Lio/ktor/client/engine/android/AndroidEngineConfig;)V", "getConfig", "()Lio/ktor/client/engine/android/AndroidEngineConfig;", "supportedCapabilities", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "execute", "Lio/ktor/client/request/HttpResponseData;", "data", "Lio/ktor/client/request/HttpRequestData;", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProxyAwareConnection", "Ljava/net/HttpURLConnection;", "urlString", "", "ktor-client-android"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClientEngine.kt\nio/ktor/client/engine/android/AndroidClientEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* loaded from: classes8.dex */
public final class AndroidClientEngine extends HttpClientEngineBase {

    @NotNull
    public final AndroidEngineConfig config;

    @NotNull
    public final Set<HttpClientEngineCapability<?>> supportedCapabilities;

    /* compiled from: AndroidClientEngine.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.engine.android.AndroidClientEngine", m7120f = "AndroidClientEngine.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {35, 79, 82}, m7123m = "execute", m7124n = {"this", "data", "data", "callContext", "requestTime"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngine$execute$1 */
    public static final class C101231 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C101231(Continuation<? super C101231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidClientEngine.this.execute(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(@NotNull AndroidEngineConfig config) {
        super("ktor-android");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.supportedCapabilities = SetsKt__SetsJVMKt.setOf(HttpTimeout.INSTANCE);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @NotNull
    public AndroidEngineConfig getConfig() {
        return this.config;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    @NotNull
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196 A[PHI: r1
  0x0196: PHI (r1v11 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:105:0x0193, B:67:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0017  */
    @Override // io.ktor.client.engine.HttpClientEngine
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull HttpRequestData httpRequestData, @NotNull Continuation<? super HttpResponseData> continuation) throws Throwable {
        C101231 c101231;
        HttpRequestData httpRequestData2;
        Object objCallContext;
        AndroidClientEngine androidClientEngine;
        CoroutineContext coroutineContext;
        GMTDate gMTDateGMTDate$default;
        final HttpURLConnection proxyAwareConnection;
        Unit unit;
        HttpRequestData httpRequestData3;
        CoroutineContext coroutineContext2;
        GMTDate gMTDate;
        HttpURLConnection httpURLConnection;
        if (continuation instanceof C101231) {
            c101231 = (C101231) continuation;
            int i = c101231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101231.label = i - Integer.MIN_VALUE;
            } else {
                c101231 = new C101231(continuation);
            }
        }
        Object objTimeoutAwareConnection = c101231.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTimeoutAwareConnection);
            c101231.L$0 = this;
            httpRequestData2 = httpRequestData;
            c101231.L$1 = httpRequestData2;
            c101231.label = 1;
            objCallContext = UtilsKt.callContext(c101231);
            if (objCallContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidClientEngine = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(objTimeoutAwareConnection);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                httpURLConnection = (HttpURLConnection) c101231.L$3;
                gMTDate = (GMTDate) c101231.L$2;
                coroutineContext2 = (CoroutineContext) c101231.L$1;
                httpRequestData3 = (HttpRequestData) c101231.L$0;
                ResultKt.throwOnFailure(objTimeoutAwareConnection);
                proxyAwareConnection = httpURLConnection;
                gMTDateGMTDate$default = gMTDate;
                coroutineContext = coroutineContext2;
                httpRequestData2 = httpRequestData3;
                C101242 c101242 = new Function1<HttpURLConnection, HttpResponseData>() { // from class: io.ktor.client.engine.android.AndroidClientEngine.execute.2
                    public final /* synthetic */ HttpRequestData $data;
                    public final /* synthetic */ GMTDate $requestTime;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C101242(HttpRequestData httpRequestData22, GMTDate gMTDateGMTDate$default2) {
                        super(1);
                        httpRequestData = httpRequestData22;
                        gMTDate = gMTDateGMTDate$default2;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final HttpResponseData invoke(@NotNull HttpURLConnection current) throws IOException {
                        HttpStatusCode httpStatusCodeFromValue;
                        String lowerCase;
                        Intrinsics.checkNotNullParameter(current, "current");
                        int responseCode = current.getResponseCode();
                        String responseMessage = current.getResponseMessage();
                        if (responseMessage != null) {
                            httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
                        } else {
                            httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
                        }
                        HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
                        ByteReadChannel byteReadChannelContent = AndroidURLConnectionUtilsKt.content(current, coroutineContext, httpRequestData);
                        Map<String, List<String>> headerFields = current.getHeaderFields();
                        Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(headerFields.size()));
                        Iterator<T> it = headerFields.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String key = (String) entry.getKey();
                            if (key != null) {
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                Locale locale = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                                lowerCase = key.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                if (lowerCase == null) {
                                    lowerCase = "";
                                }
                            }
                            linkedHashMap.put(lowerCase, entry.getValue());
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            if (!StringsKt__StringsJVMKt.isBlank((CharSequence) entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        return new HttpResponseData(httpStatusCode, gMTDate, new HeadersImpl(linkedHashMap2), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), byteReadChannelContent, coroutineContext);
                    }
                };
                c101231.L$0 = null;
                c101231.L$1 = null;
                c101231.L$2 = null;
                c101231.L$3 = null;
                c101231.label = 3;
                objTimeoutAwareConnection = AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData22, c101242, c101231);
                return objTimeoutAwareConnection == coroutine_suspended ? coroutine_suspended : objTimeoutAwareConnection;
            }
            HttpRequestData httpRequestData4 = (HttpRequestData) c101231.L$1;
            androidClientEngine = (AndroidClientEngine) c101231.L$0;
            ResultKt.throwOnFailure(objTimeoutAwareConnection);
            objCallContext = objTimeoutAwareConnection;
            httpRequestData22 = httpRequestData4;
        }
        coroutineContext = (CoroutineContext) objCallContext;
        gMTDateGMTDate$default2 = DateJvmKt.GMTDate$default(null, 1, null);
        String urlString = httpRequestData22.getUrl().getUrlString();
        OutgoingContent body = httpRequestData22.getBody();
        Headers headers = httpRequestData22.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headers.get(httpHeaders.getContentLength());
        Long lBoxLong = str != null ? Boxing.boxLong(Long.parseLong(str)) : body.getContentLength();
        proxyAwareConnection = androidClientEngine.getProxyAwareConnection(urlString);
        proxyAwareConnection.setConnectTimeout(androidClientEngine.getConfig().getConnectTimeout());
        proxyAwareConnection.setReadTimeout(androidClientEngine.getConfig().getSocketTimeout());
        AndroidURLConnectionUtilsKt.setupTimeoutAttributes(proxyAwareConnection, httpRequestData22);
        if (proxyAwareConnection instanceof HttpsURLConnection) {
            androidClientEngine.getConfig().getSslManager().invoke(proxyAwareConnection);
        }
        proxyAwareConnection.setRequestMethod(httpRequestData22.getMethod().getValue());
        proxyAwareConnection.setUseCaches(false);
        proxyAwareConnection.setInstanceFollowRedirects(false);
        UtilsKt.mergeHeaders(httpRequestData22.getHeaders(), body, new Function2<String, String, Unit>() { // from class: io.ktor.client.engine.android.AndroidClientEngine$execute$connection$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str2, String str3) {
                invoke2(str2, str3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String key, @NotNull String value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                proxyAwareConnection.addRequestProperty(key, value);
            }
        });
        androidClientEngine.getConfig().getRequestConfig().invoke(proxyAwareConnection);
        if (AndroidClientEngineKt.METHODS_WITHOUT_BODY.contains(httpRequestData22.getMethod())) {
            if (!(body instanceof OutgoingContent.NoContent)) {
                throw new IllegalStateException(("Request of type " + httpRequestData22.getMethod() + " couldn't send a body with the [Android] engine.").toString());
            }
            C101242 c1012422 = new Function1<HttpURLConnection, HttpResponseData>() { // from class: io.ktor.client.engine.android.AndroidClientEngine.execute.2
                public final /* synthetic */ HttpRequestData $data;
                public final /* synthetic */ GMTDate $requestTime;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C101242(HttpRequestData httpRequestData22, GMTDate gMTDateGMTDate$default2) {
                    super(1);
                    httpRequestData = httpRequestData22;
                    gMTDate = gMTDateGMTDate$default2;
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final HttpResponseData invoke(@NotNull HttpURLConnection current) throws IOException {
                    HttpStatusCode httpStatusCodeFromValue;
                    String lowerCase;
                    Intrinsics.checkNotNullParameter(current, "current");
                    int responseCode = current.getResponseCode();
                    String responseMessage = current.getResponseMessage();
                    if (responseMessage != null) {
                        httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
                    } else {
                        httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
                    }
                    HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
                    ByteReadChannel byteReadChannelContent = AndroidURLConnectionUtilsKt.content(current, coroutineContext, httpRequestData);
                    Map<String, List<String>> headerFields = current.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(headerFields.size()));
                    Iterator<T> it = headerFields.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String key = (String) entry.getKey();
                        if (key != null) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                            lowerCase = key.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                        }
                        linkedHashMap.put(lowerCase, entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (!StringsKt__StringsJVMKt.isBlank((CharSequence) entry2.getKey())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    return new HttpResponseData(httpStatusCode, gMTDate, new HeadersImpl(linkedHashMap2), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), byteReadChannelContent, coroutineContext);
                }
            };
            c101231.L$0 = null;
            c101231.L$1 = null;
            c101231.L$2 = null;
            c101231.L$3 = null;
            c101231.label = 3;
            objTimeoutAwareConnection = AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData22, c1012422, c101231);
            if (objTimeoutAwareConnection == coroutine_suspended) {
            }
        } else {
            if (lBoxLong == null && proxyAwareConnection.getRequestProperty(httpHeaders.getTransferEncoding()) == null) {
                proxyAwareConnection.addRequestProperty(httpHeaders.getTransferEncoding(), HTTP.CHUNK_CODING);
            }
            if (lBoxLong != null) {
                proxyAwareConnection.setFixedLengthStreamingMode(lBoxLong.longValue());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                proxyAwareConnection.setChunkedStreamingMode(0);
            }
            proxyAwareConnection.setDoOutput(true);
            OutputStream outputStream = proxyAwareConnection.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "outputStream");
            c101231.L$0 = httpRequestData22;
            c101231.L$1 = coroutineContext;
            c101231.L$2 = gMTDateGMTDate$default2;
            c101231.L$3 = proxyAwareConnection;
            c101231.label = 2;
            if (AndroidClientEngineKt.writeTo(body, outputStream, coroutineContext, c101231) == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpRequestData3 = httpRequestData22;
            coroutineContext2 = coroutineContext;
            gMTDate = gMTDateGMTDate$default2;
            httpURLConnection = proxyAwareConnection;
            proxyAwareConnection = httpURLConnection;
            gMTDateGMTDate$default2 = gMTDate;
            coroutineContext = coroutineContext2;
            httpRequestData22 = httpRequestData3;
            C101242 c10124222 = new Function1<HttpURLConnection, HttpResponseData>() { // from class: io.ktor.client.engine.android.AndroidClientEngine.execute.2
                public final /* synthetic */ HttpRequestData $data;
                public final /* synthetic */ GMTDate $requestTime;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C101242(HttpRequestData httpRequestData22, GMTDate gMTDateGMTDate$default2) {
                    super(1);
                    httpRequestData = httpRequestData22;
                    gMTDate = gMTDateGMTDate$default2;
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final HttpResponseData invoke(@NotNull HttpURLConnection current) throws IOException {
                    HttpStatusCode httpStatusCodeFromValue;
                    String lowerCase;
                    Intrinsics.checkNotNullParameter(current, "current");
                    int responseCode = current.getResponseCode();
                    String responseMessage = current.getResponseMessage();
                    if (responseMessage != null) {
                        httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
                    } else {
                        httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
                    }
                    HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
                    ByteReadChannel byteReadChannelContent = AndroidURLConnectionUtilsKt.content(current, coroutineContext, httpRequestData);
                    Map<String, List<String>> headerFields = current.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(headerFields.size()));
                    Iterator<T> it = headerFields.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String key = (String) entry.getKey();
                        if (key != null) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                            lowerCase = key.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                        }
                        linkedHashMap.put(lowerCase, entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (!StringsKt__StringsJVMKt.isBlank((CharSequence) entry2.getKey())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    return new HttpResponseData(httpStatusCode, gMTDate, new HeadersImpl(linkedHashMap2), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), byteReadChannelContent, coroutineContext);
                }
            };
            c101231.L$0 = null;
            c101231.L$1 = null;
            c101231.L$2 = null;
            c101231.L$3 = null;
            c101231.label = 3;
            objTimeoutAwareConnection = AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData22, c10124222, c101231);
            if (objTimeoutAwareConnection == coroutine_suspended) {
            }
        }
    }

    /* compiled from: AndroidClientEngine.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Lio/ktor/client/request/HttpResponseData;", "current", "Ljava/net/HttpURLConnection;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClientEngine.kt\nio/ktor/client/engine/android/AndroidClientEngine$execute$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1#2:131\n457#3:132\n403#3:133\n515#3:138\n500#3,6:139\n1238#4,4:134\n*S KotlinDebug\n*F\n+ 1 AndroidClientEngine.kt\nio/ktor/client/engine/android/AndroidClientEngine$execute$2\n*L\n90#1:132\n90#1:133\n91#1:138\n91#1:139,6\n90#1:134,4\n*E\n"})
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngine$execute$2 */
    public static final class C101242 extends Lambda implements Function1<HttpURLConnection, HttpResponseData> {
        public final /* synthetic */ HttpRequestData $data;
        public final /* synthetic */ GMTDate $requestTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101242(HttpRequestData httpRequestData22, GMTDate gMTDateGMTDate$default2) {
            super(1);
            httpRequestData = httpRequestData22;
            gMTDate = gMTDateGMTDate$default2;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final HttpResponseData invoke(@NotNull HttpURLConnection current) throws IOException {
            HttpStatusCode httpStatusCodeFromValue;
            String lowerCase;
            Intrinsics.checkNotNullParameter(current, "current");
            int responseCode = current.getResponseCode();
            String responseMessage = current.getResponseMessage();
            if (responseMessage != null) {
                httpStatusCodeFromValue = new HttpStatusCode(responseCode, responseMessage);
            } else {
                httpStatusCodeFromValue = HttpStatusCode.INSTANCE.fromValue(responseCode);
            }
            HttpStatusCode httpStatusCode = httpStatusCodeFromValue;
            ByteReadChannel byteReadChannelContent = AndroidURLConnectionUtilsKt.content(current, coroutineContext, httpRequestData);
            Map<String, List<String>> headerFields = current.getHeaderFields();
            Intrinsics.checkNotNullExpressionValue(headerFields, "current.headerFields");
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(headerFields.size()));
            Iterator<T> it = headerFields.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                if (key != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    lowerCase = key.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase == null) {
                        lowerCase = "";
                    }
                }
                linkedHashMap.put(lowerCase, entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!StringsKt__StringsJVMKt.isBlank((CharSequence) entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return new HttpResponseData(httpStatusCode, gMTDate, new HeadersImpl(linkedHashMap2), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), byteReadChannelContent, coroutineContext);
        }
    }

    public final HttpURLConnection getProxyAwareConnection(String urlString) {
        URL url = new URL(urlString);
        Proxy proxy = getConfig().getProxy();
        URLConnection uRLConnection = proxy != null ? (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)) : null;
        if (uRLConnection == null) {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Intrinsics.checkNotNullExpressionValue(uRLConnection, "url.openConnection()");
        }
        return (HttpURLConnection) uRLConnection;
    }
}
