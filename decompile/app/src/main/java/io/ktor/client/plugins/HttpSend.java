package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpSend.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J=\u0010\u000f\u001a\u00020\u00102-\u0010\u0011\u001a)\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0002\u0010\u0012JE\u0010\u000f\u001a\u00020\u001023\u0010\u0011\u001a/\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0014RD\u0010\u0005\u001a/\u0012+\u0012)\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\f0\u0006X\u0082\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m7105d2 = {"Lio/ktor/client/plugins/HttpSend;", "", "maxSendCount", "", "(I)V", "interceptors", "", "Lkotlin/Function3;", "Lio/ktor/client/plugins/Sender;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/client/call/HttpClientCall;", "Lkotlin/ExtensionFunctionType;", "getInterceptors$annotations", "()V", "intercept", "", "block", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function4;", "(Lkotlin/jvm/functions/Function4;)V", "Config", "DefaultSender", "InterceptedSender", "Plugin", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpSend {

    /* renamed from: Plugin, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<HttpSend> key = new AttributeKey<>("HttpSend");

    @NotNull
    public final List<Function3<Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object>> interceptors;
    public final int maxSendCount;

    public /* synthetic */ HttpSend(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ void getInterceptors$annotations() {
    }

    public HttpSend(int i) {
        this.maxSendCount = i;
        this.interceptors = new ArrayList();
    }

    public /* synthetic */ HttpSend(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 20 : i);
    }

    /* compiled from: HttpSend.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m7105d2 = {"Lio/ktor/client/plugins/HttpSend$Config;", "", "()V", "maxSendCount", "", "getMaxSendCount", "()I", "setMaxSendCount", "(I)V", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {
        public int maxSendCount = 20;

        public final int getMaxSendCount() {
            return this.maxSendCount;
        }

        public final void setMaxSendCount(int i) {
            this.maxSendCount = i;
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This interceptors do not allow to intercept first network call. Please use another overload and replace HttpClientCall parameter using `val call = execute(request)`")
    public final void intercept(@NotNull Function4<? super Sender, ? super HttpClientCall, ? super HttpRequestBuilder, ? super Continuation<? super HttpClientCall>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        throw new IllegalStateException("This interceptors do not allow to intercept original call. Please use another overload and call `this.execute(request)` manually".toString());
    }

    public final void intercept(@NotNull Function3<? super Sender, ? super HttpRequestBuilder, ? super Continuation<? super HttpClientCall>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.interceptors.add(block);
    }

    /* compiled from: HttpSend.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/HttpSend$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpSend$Config;", "Lio/ktor/client/plugins/HttpSend;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.HttpSend$Plugin, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, HttpSend> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<HttpSend> getKey() {
            return HttpSend.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public HttpSend prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpSend(config.getMaxSendCount(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull HttpSend plugin, @NotNull HttpClient httpClient) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(httpClient, "scope");
            httpClient.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getSend(), new HttpSend$Plugin$install$1(plugin, httpClient, null));
        }
    }

    /* compiled from: HttpSend.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B?\u0012-\u0010\u0002\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\u0006\u0010\t\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR:\u0010\u0002\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/client/plugins/HttpSend$InterceptedSender;", "Lio/ktor/client/plugins/Sender;", "interceptor", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/client/call/HttpClientCall;", "", "Lkotlin/ExtensionFunctionType;", "nextSender", "(Lkotlin/jvm/functions/Function3;Lio/ktor/client/plugins/Sender;)V", "Lkotlin/jvm/functions/Function3;", "execute", "requestBuilder", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class InterceptedSender implements Sender {

        @NotNull
        public final Function3<Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> interceptor;

        @NotNull
        public final Sender nextSender;

        /* JADX WARN: Multi-variable type inference failed */
        public InterceptedSender(@NotNull Function3<? super Sender, ? super HttpRequestBuilder, ? super Continuation<? super HttpClientCall>, ? extends Object> interceptor, @NotNull Sender nextSender) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(nextSender, "nextSender");
            this.interceptor = interceptor;
            this.nextSender = nextSender;
        }

        @Override // io.ktor.client.plugins.Sender
        @Nullable
        public Object execute(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpClientCall> continuation) {
            return this.interceptor.invoke(this.nextSender, httpRequestBuilder, continuation);
        }
    }

    /* compiled from: HttpSend.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m7105d2 = {"Lio/ktor/client/plugins/HttpSend$DefaultSender;", "Lio/ktor/client/plugins/Sender;", "maxSendCount", "", "client", "Lio/ktor/client/HttpClient;", "(ILio/ktor/client/HttpClient;)V", "currentCall", "Lio/ktor/client/call/HttpClientCall;", "sentCount", "execute", "requestBuilder", "Lio/ktor/client/request/HttpRequestBuilder;", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultSender implements Sender {

        @NotNull
        public final HttpClient client;

        @Nullable
        public HttpClientCall currentCall;
        public final int maxSendCount;
        public int sentCount;

        public DefaultSender(int i, @NotNull HttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.maxSendCount = i;
            this.client = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
        @Override // io.ktor.client.plugins.Sender
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object execute(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpClientCall> continuation) throws Throwable {
            HttpSend$DefaultSender$execute$1 httpSend$DefaultSender$execute$1;
            DefaultSender defaultSender;
            if (continuation instanceof HttpSend$DefaultSender$execute$1) {
                httpSend$DefaultSender$execute$1 = (HttpSend$DefaultSender$execute$1) continuation;
                int i = httpSend$DefaultSender$execute$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpSend$DefaultSender$execute$1.label = i - Integer.MIN_VALUE;
                } else {
                    httpSend$DefaultSender$execute$1 = new HttpSend$DefaultSender$execute$1(this, continuation);
                }
            }
            Object objExecute = httpSend$DefaultSender$execute$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = httpSend$DefaultSender$execute$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExecute);
                HttpClientCall httpClientCall = this.currentCall;
                if (httpClientCall != null) {
                    CoroutineScopeKt.cancel$default(httpClientCall, null, 1, null);
                }
                int i3 = this.sentCount;
                if (i3 >= this.maxSendCount) {
                    throw new SendCountExceedException("Max send count " + this.maxSendCount + " exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.sentCount = i3 + 1;
                HttpSendPipeline sendPipeline = this.client.getSendPipeline();
                Object body = httpRequestBuilder.getBody();
                httpSend$DefaultSender$execute$1.L$0 = this;
                httpSend$DefaultSender$execute$1.label = 1;
                objExecute = sendPipeline.execute(httpRequestBuilder, body, httpSend$DefaultSender$execute$1);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultSender = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defaultSender = (DefaultSender) httpSend$DefaultSender$execute$1.L$0;
                ResultKt.throwOnFailure(objExecute);
            }
            HttpClientCall httpClientCall2 = objExecute instanceof HttpClientCall ? (HttpClientCall) objExecute : null;
            if (httpClientCall2 == null) {
                throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objExecute).toString());
            }
            defaultSender.currentCall = httpClientCall2;
            return httpClientCall2;
        }
    }
}
