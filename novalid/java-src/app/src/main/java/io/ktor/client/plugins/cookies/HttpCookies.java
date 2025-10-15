package io.ktor.client.plugins.cookies;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.Cookie;
import io.ktor.http.CookieKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.Url;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCookies.kt */
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00060\u0001j\u0002`\u0002:\u0002#$BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012-\u0010\u0005\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000b0\u0006ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001b\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\tH\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0015R8\u0010\u0005\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000b0\u0006X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m7105d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "storage", "Lio/ktor/client/plugins/cookies/CookiesStorage;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "initializer", "Lkotlinx/coroutines/Job;", "getInitializer$annotations", "()V", "captureHeaderCookies", "builder", "Lio/ktor/client/request/HttpRequestBuilder;", "captureHeaderCookies$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "get", "Lio/ktor/http/Cookie;", "requestUrl", "Lio/ktor/http/Url;", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCookiesFrom", "response", "Lio/ktor/client/statement/HttpResponse;", "saveCookiesFrom$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCookiesWith", "sendCookiesWith$ktor_client_core", "Companion", "Config", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n125#2:149\n152#2,3:150\n1855#3,2:153\n1855#3,2:155\n1855#3,2:157\n*S KotlinDebug\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies\n*L\n52#1:149\n52#1:150,3\n54#1:153,2\n74#1:155,2\n77#1:157,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpCookies implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<HttpCookies> key = new AttributeKey<>("HttpCookies");

    @NotNull
    public final List<Function2<CookiesStorage, Continuation<? super Unit>, Object>> defaults;

    @NotNull
    public final Job initializer;

    @NotNull
    public final CookiesStorage storage;

    /* compiled from: HttpCookies.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cookies.HttpCookies", m7120f = "HttpCookies.kt", m7121i = {0, 0}, m7122l = {39, 40}, m7123m = "get", m7124n = {"this", "requestUrl"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookies$get$1 */
    /* loaded from: classes7.dex */
    public static final class C101821 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101821(Continuation<? super C101821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookies.this.get(null, this);
        }
    }

    public static /* synthetic */ void getInitializer$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(@NotNull CookiesStorage storage, @NotNull List<? extends Function2<? super CookiesStorage, ? super Continuation<? super Unit>, ? extends Object>> defaults) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        this.storage = storage;
        this.defaults = defaults;
        this.initializer = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new HttpCookies$initializer$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@NotNull Url url, @NotNull Continuation<? super List<Cookie>> continuation) {
        C101821 c101821;
        HttpCookies httpCookies;
        if (continuation instanceof C101821) {
            c101821 = (C101821) continuation;
            int i = c101821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101821.label = i - Integer.MIN_VALUE;
            } else {
                c101821 = new C101821(continuation);
            }
        }
        Object obj = c101821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Job job = this.initializer;
            c101821.L$0 = this;
            c101821.L$1 = url;
            c101821.label = 1;
            if (job.join(c101821) == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpCookies = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c101821.L$1;
            httpCookies = (HttpCookies) c101821.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CookiesStorage cookiesStorage = httpCookies.storage;
        c101821.L$0 = null;
        c101821.L$1 = null;
        c101821.label = 2;
        obj = cookiesStorage.get(url, c101821);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object captureHeaderCookies$ktor_client_core(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        HttpCookies$captureHeaderCookies$1 httpCookies$captureHeaderCookies$1;
        HttpCookies httpCookies;
        Iterator it;
        Url url;
        HttpCookies httpCookies2;
        if (continuation instanceof HttpCookies$captureHeaderCookies$1) {
            httpCookies$captureHeaderCookies$1 = (HttpCookies$captureHeaderCookies$1) continuation;
            int i = httpCookies$captureHeaderCookies$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCookies$captureHeaderCookies$1.label = i - Integer.MIN_VALUE;
                httpCookies = this;
            } else {
                httpCookies = this;
                httpCookies$captureHeaderCookies$1 = new HttpCookies$captureHeaderCookies$1(httpCookies, continuation);
            }
        }
        Object obj = httpCookies$captureHeaderCookies$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = httpCookies$captureHeaderCookies$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Url urlBuild = URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
            String str = httpRequestBuilder.getHeaders().get(HttpHeaders.INSTANCE.getCookie());
            ArrayList arrayList = null;
            if (str != null) {
                HttpCookiesKt.LOGGER.trace("Saving cookie " + str + " for " + httpRequestBuilder.getUrl());
                Map clientCookiesHeader$default = CookieKt.parseClientCookiesHeader$default(str, false, 2, null);
                arrayList = new ArrayList(clientCookiesHeader$default.size());
                for (Map.Entry entry : clientCookiesHeader$default.entrySet()) {
                    arrayList.add(new Cookie((String) entry.getKey(), (String) entry.getValue(), null, 0, null, null, null, false, false, null, 1020, null));
                }
            }
            if (arrayList != null) {
                it = arrayList.iterator();
                url = urlBuild;
                httpCookies2 = httpCookies;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) httpCookies$captureHeaderCookies$1.L$2;
        url = (Url) httpCookies$captureHeaderCookies$1.L$1;
        httpCookies2 = (HttpCookies) httpCookies$captureHeaderCookies$1.L$0;
        ResultKt.throwOnFailure(obj);
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            CookiesStorage cookiesStorage = httpCookies2.storage;
            httpCookies$captureHeaderCookies$1.L$0 = httpCookies2;
            httpCookies$captureHeaderCookies$1.L$1 = url;
            httpCookies$captureHeaderCookies$1.L$2 = it;
            httpCookies$captureHeaderCookies$1.label = 1;
            if (cookiesStorage.addCookie(url, cookie, httpCookies$captureHeaderCookies$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendCookiesWith$ktor_client_core(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        HttpCookies$sendCookiesWith$1 httpCookies$sendCookiesWith$1;
        if (continuation instanceof HttpCookies$sendCookiesWith$1) {
            httpCookies$sendCookiesWith$1 = (HttpCookies$sendCookiesWith$1) continuation;
            int i = httpCookies$sendCookiesWith$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCookies$sendCookiesWith$1.label = i - Integer.MIN_VALUE;
            } else {
                httpCookies$sendCookiesWith$1 = new HttpCookies$sendCookiesWith$1(this, continuation);
            }
        }
        Object obj = httpCookies$sendCookiesWith$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = httpCookies$sendCookiesWith$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Url urlBuild = URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
            httpCookies$sendCookiesWith$1.L$0 = httpRequestBuilder;
            httpCookies$sendCookiesWith$1.label = 1;
            obj = get(urlBuild, httpCookies$sendCookiesWith$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpRequestBuilder = (HttpRequestBuilder) httpCookies$sendCookiesWith$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            String strRenderClientCookies = HttpCookiesKt.renderClientCookies(list);
            httpRequestBuilder.getHeaders().set(HttpHeaders.INSTANCE.getCookie(), strRenderClientCookies);
            HttpCookiesKt.LOGGER.trace("Sending cookie " + strRenderClientCookies + " for " + httpRequestBuilder.getUrl());
        } else {
            httpRequestBuilder.getHeaders().remove(HttpHeaders.INSTANCE.getCookie());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveCookiesFrom$ktor_client_core(@NotNull HttpResponse httpResponse, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        HttpCookies$saveCookiesFrom$1 httpCookies$saveCookiesFrom$1;
        Iterator it;
        HttpCookies httpCookies;
        Url url;
        if (continuation instanceof HttpCookies$saveCookiesFrom$1) {
            httpCookies$saveCookiesFrom$1 = (HttpCookies$saveCookiesFrom$1) continuation;
            int i = httpCookies$saveCookiesFrom$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCookies$saveCookiesFrom$1.label = i - Integer.MIN_VALUE;
            } else {
                httpCookies$saveCookiesFrom$1 = new HttpCookies$saveCookiesFrom$1(this, continuation);
            }
        }
        Object obj = httpCookies$saveCookiesFrom$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = httpCookies$saveCookiesFrom$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Url url2 = HttpResponseKt.getRequest(httpResponse).getUrl();
            List<String> all = httpResponse.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
            if (all != null) {
                for (String str : all) {
                    HttpCookiesKt.LOGGER.trace("Received cookie " + str + " in response for " + httpResponse.getCall().getRequest().getUrl());
                }
            }
            it = HttpMessagePropertiesKt.setCookie(httpResponse).iterator();
            httpCookies = this;
            url = url2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) httpCookies$saveCookiesFrom$1.L$2;
            url = (Url) httpCookies$saveCookiesFrom$1.L$1;
            httpCookies = (HttpCookies) httpCookies$saveCookiesFrom$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            CookiesStorage cookiesStorage = httpCookies.storage;
            httpCookies$saveCookiesFrom$1.L$0 = httpCookies;
            httpCookies$saveCookiesFrom$1.L$1 = url;
            httpCookies$saveCookiesFrom$1.L$2 = it;
            httpCookies$saveCookiesFrom$1.label = 1;
            if (cookiesStorage.addCookie(url, cookie, httpCookies$saveCookiesFrom$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.storage.close();
    }

    /* compiled from: HttpCookies.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J7\u0010\u0012\u001a\u00020\b2'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\u0014R8\u0010\u0003\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0002\b\t0\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "", "()V", RemoteConfigComponent.DEFAULTS_FILE_NAME, "", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "storage", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V", "build", "Lio/ktor/client/plugins/cookies/HttpCookies;", "build$ktor_client_core", "default", "block", "(Lkotlin/jvm/functions/Function2;)V", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {

        @NotNull
        public final List<Function2<CookiesStorage, Continuation<? super Unit>, Object>> defaults = new ArrayList();

        @NotNull
        public CookiesStorage storage = new AcceptAllCookiesStorage();

        @NotNull
        public final CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(@NotNull CookiesStorage cookiesStorage) {
            Intrinsics.checkNotNullParameter(cookiesStorage, "<set-?>");
            this.storage = cookiesStorage;
        }

        /* renamed from: default, reason: not valid java name */
        public final void m15395default(@NotNull Function2<? super CookiesStorage, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.defaults.add(block);
        }

        @NotNull
        public final HttpCookies build$ktor_client_core() {
            return new HttpCookies(this.storage, this.defaults);
        }
    }

    /* compiled from: HttpCookies.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, HttpCookies> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public HttpCookies prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<HttpCookies> getKey() {
            return HttpCookies.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull HttpCookies plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getState(), new HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getState(), new HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getState(), new HttpCookies$Companion$install$3(plugin, null));
        }
    }
}
