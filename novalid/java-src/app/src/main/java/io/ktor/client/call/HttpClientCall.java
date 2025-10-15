package io.ktor.client.call;

import io.ktor.client.HttpClient;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.NullBody;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.p050io.ByteReadChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientCall.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b\u0016\u0018\u0000 82\u00020::\u00018B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R*\u0010\u0014\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104\"\u0004\b\u0018\u0010\u0017R*\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00198\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u001a\u00105\u001a\u0004\b6\u00107\"\u0004\b\u001d\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m7105d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/HttpClient;", "client", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", SegmentConstantPool.INITSTRING, "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/reflect/TypeInfo;", "info", "", "body", "(Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bodyNullable", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "request", "", "setRequest$ktor_client_core", "(Lio/ktor/client/request/HttpRequest;)V", "setRequest", "Lio/ktor/client/statement/HttpResponse;", "response", "setResponse$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;)V", "setResponse", "", "toString", "()Ljava/lang/String;", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<set-?>", "Lio/ktor/client/request/HttpRequest;", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Companion", "ktor-client-core", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpClientCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
/* loaded from: classes7.dex */
public class HttpClientCall implements CoroutineScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<Object> CustomResponse = new AttributeKey<>("CustomResponse");
    public static final /* synthetic */ AtomicIntegerFieldUpdater received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    public final boolean allowDoubleReceive;

    @NotNull
    public final HttpClient client;

    @NotNull
    private volatile /* synthetic */ int received;
    public HttpRequest request;
    public HttpResponse response;

    /* compiled from: HttpClientCall.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.call.HttpClientCall", m7120f = "HttpClientCall.kt", m7121i = {}, m7122l = {115}, m7123m = "body", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.call.HttpClientCall$body$1 */
    /* loaded from: classes8.dex */
    public static final class C101121 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C101121(Continuation<? super C101121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.body(null, this);
        }
    }

    /* compiled from: HttpClientCall.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.call.HttpClientCall", m7120f = "HttpClientCall.kt", m7121i = {0, 0, 1, 1}, m7122l = {86, 89}, m7123m = "bodyNullable", m7124n = {"this", "info", "this", "info"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.call.HttpClientCall$bodyNullable$1 */
    /* loaded from: classes8.dex */
    public static final class C101131 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101131(Continuation<? super C101131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.bodyNullable(null, this);
        }
    }

    @Nullable
    public Object getResponseContent(@NotNull Continuation<? super ByteReadChannel> continuation) {
        return getResponseContent$suspendImpl(this, continuation);
    }

    public HttpClientCall(@NotNull HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        this.received = 0;
    }

    @NotNull
    public final HttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    @NotNull
    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    @NotNull
    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final void setRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    @NotNull
    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    public final void setResponse(@NotNull HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InternalAPI
    public HttpClientCall(@NotNull HttpClient client, @NotNull HttpRequestData requestData, @NotNull HttpResponseData responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        setRequest(new DefaultHttpRequest(this, requestData));
        setResponse(new DefaultHttpResponse(this, responseData));
        if (responseData.getBody() instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(CustomResponse, responseData.getBody());
    }

    public boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    public static /* synthetic */ Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, Continuation<? super ByteReadChannel> continuation) {
        return httpClientCall.getResponse().getContent();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bodyNullable(@NotNull TypeInfo typeInfo, @NotNull Continuation<Object> continuation) throws Throwable {
        C101131 c101131;
        HttpClientCall httpClientCall;
        HttpClientCall httpClientCall2;
        Object response;
        if (continuation instanceof C101131) {
            c101131 = (C101131) continuation;
            int i = c101131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101131.label = i - Integer.MIN_VALUE;
            } else {
                c101131 = new C101131(continuation);
            }
        }
        Object orNull = c101131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orNull);
            try {
                if (!TypeInfoJvmKt.instanceOf(getResponse(), typeInfo.getType())) {
                    if (!getAllowDoubleReceive() && !received$FU.compareAndSet(this, 0, 1)) {
                        throw new DoubleReceiveException(this);
                    }
                    orNull = getAttributes().getOrNull(CustomResponse);
                    if (orNull == null) {
                        c101131.L$0 = this;
                        c101131.L$1 = typeInfo;
                        c101131.label = 1;
                        orNull = getResponseContent(c101131);
                        if (orNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    httpClientCall2 = this;
                } else {
                    HttpResponse response2 = getResponse();
                    HttpResponseKt.complete(getResponse());
                    return response2;
                }
            } catch (Throwable th) {
                th = th;
                httpClientCall = this;
                CoroutineScopeKt.cancel(httpClientCall.getResponse(), "Receive failed", th);
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeInfo = (TypeInfo) c101131.L$1;
                httpClientCall = (HttpClientCall) c101131.L$0;
                try {
                    ResultKt.throwOnFailure(orNull);
                    response = ((HttpResponseContainer) orNull).getResponse();
                    if (!Intrinsics.areEqual(response, NullBody.INSTANCE)) {
                        response = null;
                    }
                    if (response != null && !TypeInfoJvmKt.instanceOf(response, typeInfo.getType())) {
                        throw new NoTransformationFoundException(httpClientCall.getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
                    }
                    return response;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        CoroutineScopeKt.cancel(httpClientCall.getResponse(), "Receive failed", th);
                        throw th;
                    } finally {
                        HttpResponseKt.complete(httpClientCall.getResponse());
                    }
                }
            }
            typeInfo = (TypeInfo) c101131.L$1;
            httpClientCall2 = (HttpClientCall) c101131.L$0;
            try {
                ResultKt.throwOnFailure(orNull);
            } catch (Throwable th3) {
                th = th3;
                httpClientCall = httpClientCall2;
                CoroutineScopeKt.cancel(httpClientCall.getResponse(), "Receive failed", th);
                throw th;
            }
        }
        HttpResponseContainer httpResponseContainer = new HttpResponseContainer(typeInfo, orNull);
        HttpResponsePipeline responsePipeline = httpClientCall2.client.getResponsePipeline();
        c101131.L$0 = httpClientCall2;
        c101131.L$1 = typeInfo;
        c101131.label = 2;
        orNull = responsePipeline.execute(httpClientCall2, httpResponseContainer, c101131);
        if (orNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        httpClientCall = httpClientCall2;
        response = ((HttpResponseContainer) orNull).getResponse();
        if (!Intrinsics.areEqual(response, NullBody.INSTANCE)) {
        }
        if (response != null) {
            throw new NoTransformationFoundException(httpClientCall.getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
        }
        return response;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object body(@NotNull TypeInfo typeInfo, @NotNull Continuation<Object> continuation) throws Throwable {
        C101121 c101121;
        if (continuation instanceof C101121) {
            c101121 = (C101121) continuation;
            int i = c101121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101121.label = i - Integer.MIN_VALUE;
            } else {
                c101121 = new C101121(continuation);
            }
        }
        Object objBodyNullable = c101121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            c101121.label = 1;
            objBodyNullable = bodyNullable(typeInfo, c101121);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objBodyNullable);
        }
        Intrinsics.checkNotNull(objBodyNullable);
        return objBodyNullable;
    }

    @NotNull
    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + AbstractJsonLexerKt.END_LIST;
    }

    public final void setResponse$ktor_client_core(@NotNull HttpResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        setResponse(response);
    }

    public final void setRequest$ktor_client_core(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        setRequest(request);
    }

    /* compiled from: HttpClientCall.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lio/ktor/client/call/HttpClientCall$Companion;", "", "()V", "CustomResponse", "Lio/ktor/util/AttributeKey;", "getCustomResponse$annotations", "getCustomResponse", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "This is going to be removed. Please file a ticket with clarification why and what for do you need it.")
        public static /* synthetic */ void getCustomResponse$annotations() {
        }

        public Companion() {
        }

        @NotNull
        public final AttributeKey<Object> getCustomResponse() {
            return HttpClientCall.CustomResponse;
        }
    }
}
