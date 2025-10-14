package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.UrlKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpRedirect.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"Lio/ktor/client/plugins/HttpRedirect;", "", "checkHttpMethod", "", "allowHttpsDowngrade", "(ZZ)V", "Config", "Plugin", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpRedirect {
    public final boolean allowHttpsDowngrade;
    public final boolean checkHttpMethod;

    /* renamed from: Plugin, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<HttpRedirect> key = new AttributeKey<>("HttpRedirect");

    @NotNull
    public static final EventDefinition<HttpResponse> HttpResponseRedirect = new EventDefinition<>();

    public /* synthetic */ HttpRedirect(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public HttpRedirect(boolean z, boolean z2) {
        this.checkHttpMethod = z;
        this.allowHttpsDowngrade = z2;
    }

    /* compiled from: HttpRedirect.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/plugins/HttpRedirect$Config;", "", "()V", "allowHttpsDowngrade", "", "getAllowHttpsDowngrade", "()Z", "setAllowHttpsDowngrade", "(Z)V", "checkHttpMethod", "getCheckHttpMethod", "setCheckHttpMethod", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {
        public boolean allowHttpsDowngrade;
        public boolean checkHttpMethod = true;

        public final boolean getCheckHttpMethod() {
            return this.checkHttpMethod;
        }

        public final void setCheckHttpMethod(boolean z) {
            this.checkHttpMethod = z;
        }

        public final boolean getAllowHttpsDowngrade() {
            return this.allowHttpsDowngrade;
        }

        public final void setAllowHttpsDowngrade(boolean z) {
            this.allowHttpsDowngrade = z;
        }
    }

    /* compiled from: HttpRedirect.kt */
    @Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J!\u0010\u0013\u001a\u00020\u00032\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0016H\u0016J5\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"Lio/ktor/client/plugins/HttpRedirect$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpRedirect$Config;", "Lio/ktor/client/plugins/HttpRedirect;", "()V", "HttpResponseRedirect", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "getHttpResponseRedirect", "()Lio/ktor/events/EventDefinition;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "handleCall", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "context", "Lio/ktor/client/request/HttpRequestBuilder;", "origin", "allowHttpsDowngrade", "", "client", "(Lio/ktor/client/plugins/Sender;Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/call/HttpClientCall;ZLio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nHttpRedirect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRedirect.kt\nio/ktor/client/plugins/HttpRedirect$Plugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
    /* renamed from: io.ktor.client.plugins.HttpRedirect$Plugin, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, HttpRedirect> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<HttpRedirect> getKey() {
            return HttpRedirect.key;
        }

        @NotNull
        public final EventDefinition<HttpResponse> getHttpResponseRedirect() {
            return HttpRedirect.HttpResponseRedirect;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public HttpRedirect prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpRedirect(config.getCheckHttpMethod(), config.getAllowHttpsDowngrade(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull HttpRedirect plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            ((HttpSend) HttpClientPluginKt.plugin(scope, HttpSend.INSTANCE)).intercept(new HttpRedirect$Plugin$install$1(plugin, scope, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Type inference failed for: r3v6, types: [T, io.ktor.client.request.HttpRequestBuilder] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01b0 -> B:35:0x01b6). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object handleCall(Sender sender, HttpRequestBuilder httpRequestBuilder, HttpClientCall httpClientCall, boolean z, HttpClient httpClient, Continuation<? super HttpClientCall> continuation) throws Throwable {
            HttpRedirect$Plugin$handleCall$1 httpRedirect$Plugin$handleCall$1;
            Companion companion;
            String authority;
            Companion companion2;
            Ref.ObjectRef objectRef;
            URLProtocol uRLProtocol;
            Sender sender2;
            Ref.ObjectRef objectRef2;
            HttpRedirect$Plugin$handleCall$1 httpRedirect$Plugin$handleCall$12;
            boolean z2;
            HttpClient httpClient2;
            HttpRequestBuilder httpRequestBuilder2;
            String str;
            ?? httpRequestBuilder3;
            Object objExecute;
            if (continuation instanceof HttpRedirect$Plugin$handleCall$1) {
                httpRedirect$Plugin$handleCall$1 = (HttpRedirect$Plugin$handleCall$1) continuation;
                int i = httpRedirect$Plugin$handleCall$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpRedirect$Plugin$handleCall$1.label = i - Integer.MIN_VALUE;
                    companion = this;
                } else {
                    companion = this;
                    httpRedirect$Plugin$handleCall$1 = new HttpRedirect$Plugin$handleCall$1(companion, continuation);
                }
            }
            Object obj = httpRedirect$Plugin$handleCall$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = httpRedirect$Plugin$handleCall$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!HttpRedirectKt.isRedirect(httpClientCall.getResponse().getStatus())) {
                    return httpClientCall;
                }
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = httpClientCall;
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                T t = httpRequestBuilder;
                objectRef4.element = t;
                URLProtocol protocol = httpClientCall.getRequest().getUrl().getProtocol();
                authority = UrlKt.getAuthority(httpClientCall.getRequest().getUrl());
                companion2 = companion;
                objectRef = objectRef4;
                uRLProtocol = protocol;
                sender2 = sender;
                objectRef2 = objectRef3;
                httpRedirect$Plugin$handleCall$12 = httpRedirect$Plugin$handleCall$1;
                z2 = z;
                httpClient2 = httpClient;
                httpRequestBuilder2 = t;
                httpClient2.getMonitor().raise(companion2.getHttpResponseRedirect(), ((HttpClientCall) objectRef2.element).getResponse());
                Headers headers = ((HttpClientCall) objectRef2.element).getResponse().getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                str = headers.get(httpHeaders.getLocation());
                HttpRedirectKt.LOGGER.trace("Received redirect response to " + str + " for request " + httpRequestBuilder2.getUrl());
                httpRequestBuilder3 = new HttpRequestBuilder();
                httpRequestBuilder3.takeFromWithExecutionContext((HttpRequestBuilder) objectRef.element);
                httpRequestBuilder3.getUrl().getParameters().clear();
                if (str != null) {
                }
                if (z2) {
                }
                if (!Intrinsics.areEqual(authority, URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                }
                objectRef.element = httpRequestBuilder3;
                httpRedirect$Plugin$handleCall$12.L$0 = companion2;
                httpRedirect$Plugin$handleCall$12.L$1 = sender2;
                httpRedirect$Plugin$handleCall$12.L$2 = httpRequestBuilder2;
                httpRedirect$Plugin$handleCall$12.L$3 = httpClient2;
                httpRedirect$Plugin$handleCall$12.L$4 = objectRef2;
                httpRedirect$Plugin$handleCall$12.L$5 = objectRef;
                httpRedirect$Plugin$handleCall$12.L$6 = uRLProtocol;
                httpRedirect$Plugin$handleCall$12.L$7 = authority;
                httpRedirect$Plugin$handleCall$12.L$8 = objectRef2;
                httpRedirect$Plugin$handleCall$12.Z$0 = z2;
                httpRedirect$Plugin$handleCall$12.label = 1;
                objExecute = sender2.execute(httpRequestBuilder3, httpRedirect$Plugin$handleCall$12);
                if (objExecute != coroutine_suspended) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z3 = httpRedirect$Plugin$handleCall$1.Z$0;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) httpRedirect$Plugin$handleCall$1.L$8;
                String str2 = (String) httpRedirect$Plugin$handleCall$1.L$7;
                URLProtocol uRLProtocol2 = (URLProtocol) httpRedirect$Plugin$handleCall$1.L$6;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) httpRedirect$Plugin$handleCall$1.L$5;
                Ref.ObjectRef objectRef7 = (Ref.ObjectRef) httpRedirect$Plugin$handleCall$1.L$4;
                HttpClient httpClient3 = (HttpClient) httpRedirect$Plugin$handleCall$1.L$3;
                HttpRequestBuilder httpRequestBuilder4 = (HttpRequestBuilder) httpRedirect$Plugin$handleCall$1.L$2;
                Sender sender3 = (Sender) httpRedirect$Plugin$handleCall$1.L$1;
                companion2 = (Companion) httpRedirect$Plugin$handleCall$1.L$0;
                ResultKt.throwOnFailure(obj);
                HttpRedirect$Plugin$handleCall$1 httpRedirect$Plugin$handleCall$13 = httpRedirect$Plugin$handleCall$1;
                boolean z4 = z3;
                Sender sender4 = sender3;
                authority = str2;
                HttpRequestBuilder httpRequestBuilder5 = httpRequestBuilder4;
                Ref.ObjectRef objectRef8 = objectRef6;
                uRLProtocol = uRLProtocol2;
                objectRef2 = objectRef7;
                T t2 = obj;
                objectRef5.element = t2;
                if (HttpRedirectKt.isRedirect(((HttpClientCall) objectRef2.element).getResponse().getStatus())) {
                    return objectRef2.element;
                }
                z2 = z4;
                httpRedirect$Plugin$handleCall$12 = httpRedirect$Plugin$handleCall$13;
                httpClient2 = httpClient3;
                objectRef = objectRef8;
                sender2 = sender4;
                httpRequestBuilder2 = httpRequestBuilder5;
                httpClient2.getMonitor().raise(companion2.getHttpResponseRedirect(), ((HttpClientCall) objectRef2.element).getResponse());
                Headers headers2 = ((HttpClientCall) objectRef2.element).getResponse().getHeaders();
                HttpHeaders httpHeaders2 = HttpHeaders.INSTANCE;
                str = headers2.get(httpHeaders2.getLocation());
                HttpRedirectKt.LOGGER.trace("Received redirect response to " + str + " for request " + httpRequestBuilder2.getUrl());
                httpRequestBuilder3 = new HttpRequestBuilder();
                httpRequestBuilder3.takeFromWithExecutionContext((HttpRequestBuilder) objectRef.element);
                httpRequestBuilder3.getUrl().getParameters().clear();
                if (str != null) {
                    URLParserKt.takeFrom(httpRequestBuilder3.getUrl(), str);
                }
                if (z2 && URLProtocolKt.isSecure(uRLProtocol) && !URLProtocolKt.isSecure(httpRequestBuilder3.getUrl().getProtocol())) {
                    HttpRedirectKt.LOGGER.trace("Can not redirect " + httpRequestBuilder2.getUrl() + " because of security downgrade");
                    return objectRef2.element;
                }
                if (!Intrinsics.areEqual(authority, URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                    httpRequestBuilder3.getHeaders().remove(httpHeaders2.getAuthorization());
                    HttpRedirectKt.LOGGER.trace("Removing Authorization header from redirect for " + httpRequestBuilder2.getUrl());
                }
                objectRef.element = httpRequestBuilder3;
                httpRedirect$Plugin$handleCall$12.L$0 = companion2;
                httpRedirect$Plugin$handleCall$12.L$1 = sender2;
                httpRedirect$Plugin$handleCall$12.L$2 = httpRequestBuilder2;
                httpRedirect$Plugin$handleCall$12.L$3 = httpClient2;
                httpRedirect$Plugin$handleCall$12.L$4 = objectRef2;
                httpRedirect$Plugin$handleCall$12.L$5 = objectRef;
                httpRedirect$Plugin$handleCall$12.L$6 = uRLProtocol;
                httpRedirect$Plugin$handleCall$12.L$7 = authority;
                httpRedirect$Plugin$handleCall$12.L$8 = objectRef2;
                httpRedirect$Plugin$handleCall$12.Z$0 = z2;
                httpRedirect$Plugin$handleCall$12.label = 1;
                objExecute = sender2.execute(httpRequestBuilder3, httpRedirect$Plugin$handleCall$12);
                if (objExecute != coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef8 = objectRef;
                httpClient3 = httpClient2;
                z4 = z2;
                t2 = objExecute;
                httpRedirect$Plugin$handleCall$13 = httpRedirect$Plugin$handleCall$12;
                objectRef5 = objectRef2;
                sender4 = sender2;
                httpRequestBuilder5 = httpRequestBuilder2;
                objectRef5.element = t2;
                if (HttpRedirectKt.isRedirect(((HttpClientCall) objectRef2.element).getResponse().getStatus())) {
                }
            }
        }
    }
}
