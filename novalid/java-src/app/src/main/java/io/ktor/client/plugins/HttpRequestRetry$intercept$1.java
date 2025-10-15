package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequestRetry.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.HttpRequestRetry$intercept$1", m7120f = "HttpRequestRetry.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m7122l = {298, 314}, m7123m = "invokeSuspend", m7124n = {"$this$intercept", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$intercept", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes7.dex */
public final class HttpRequestRetry$intercept$1 extends SuspendLambda implements Function3<Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    public final /* synthetic */ HttpClient $client;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ HttpRequestRetry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetry$intercept$1(HttpRequestRetry httpRequestRetry, HttpClient httpClient, Continuation<? super HttpRequestRetry$intercept$1> continuation) {
        super(3, continuation);
        this.this$0 = httpRequestRetry;
        this.$client = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull Sender sender, @NotNull HttpRequestBuilder httpRequestBuilder, @Nullable Continuation<? super HttpClientCall> continuation) {
        HttpRequestRetry$intercept$1 httpRequestRetry$intercept$1 = new HttpRequestRetry$intercept$1(this.this$0, this.$client, continuation);
        httpRequestRetry$intercept$1.L$0 = sender;
        httpRequestRetry$intercept$1.L$1 = httpRequestBuilder;
        return httpRequestRetry$intercept$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #0 {all -> 0x0078, blocks: (B:34:0x010d, B:35:0x0121, B:38:0x013c, B:41:0x0147, B:11:0x0071), top: B:52:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:34:0x010d, B:35:0x0121, B:38:0x013c, B:41:0x0147, B:11:0x0071), top: B:52:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cc A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01ca -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Function2 function2;
        Sender sender;
        HttpRequestBuilder httpRequestBuilder;
        int i;
        Function2 function22;
        HttpRequestRetry.RetryEventData retryEventData;
        Function3 function3;
        Function3 function32;
        int i2;
        HttpRequestBuilder httpRequestBuilderPrepareRequest;
        boolean zShouldRetryOnException;
        int i3;
        int i4;
        Function2 function23;
        Function2 function24;
        Function3 function33;
        Function3 function34;
        HttpRequestBuilder httpRequestBuilder2;
        Sender sender2;
        HttpRequestRetry.RetryEventData retryEventData2;
        Function2 function25;
        Object objInvoke;
        char c;
        Object objExecute;
        HttpClientCall httpClientCall;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            Sender sender3 = (Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder3 = (HttpRequestBuilder) this.L$1;
            Function3 function35 = (Function3) httpRequestBuilder3.getAttributes().getOrNull(HttpRequestRetryKt.ShouldRetryPerRequestAttributeKey);
            if (function35 == null) {
                function35 = this.this$0.shouldRetry;
            }
            Function3 function36 = (Function3) httpRequestBuilder3.getAttributes().getOrNull(HttpRequestRetryKt.ShouldRetryOnExceptionPerRequestAttributeKey);
            if (function36 == null) {
                function36 = this.this$0.shouldRetryOnException;
            }
            Integer num = (Integer) httpRequestBuilder3.getAttributes().getOrNull(HttpRequestRetryKt.MaxRetriesPerRequestAttributeKey);
            int iIntValue = num != null ? num.intValue() : this.this$0.maxRetries;
            function2 = (Function2) httpRequestBuilder3.getAttributes().getOrNull(HttpRequestRetryKt.RetryDelayPerRequestAttributeKey);
            if (function2 == null) {
                function2 = this.this$0.delayMillis;
            }
            Function2 function26 = (Function2) httpRequestBuilder3.getAttributes().getOrNull(HttpRequestRetryKt.ModifyRequestPerRequestAttributeKey);
            if (function26 == null) {
                function26 = this.this$0.modifyRequest;
            }
            sender = sender3;
            httpRequestBuilder = httpRequestBuilder3;
            i = iIntValue;
            function22 = function26;
            retryEventData = null;
            function3 = function36;
            function32 = function35;
            i2 = 0;
            httpRequestBuilderPrepareRequest = this.this$0.prepareRequest(httpRequestBuilder);
            if (retryEventData != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function32;
            this.L$3 = function3;
            this.L$4 = function2;
            this.L$5 = function22;
            this.L$6 = httpRequestBuilderPrepareRequest;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            objExecute = sender.execute(httpRequestBuilderPrepareRequest, this);
            if (objExecute == coroutine_suspended) {
            }
            httpClientCall = (HttpClientCall) objExecute;
            if (this.this$0.shouldRetry(i2, i, function32, httpClientCall)) {
            }
        } else if (i5 == 1) {
            i = this.I$1;
            i2 = this.I$0;
            httpRequestBuilderPrepareRequest = (HttpRequestBuilder) this.L$6;
            function22 = (Function2) this.L$5;
            function2 = (Function2) this.L$4;
            function3 = (Function3) this.L$3;
            function32 = (Function3) this.L$2;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            sender = (Sender) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objExecute = obj;
            } finally {
                if (zShouldRetryOnException) {
                    retryEventData2 = retryEventData;
                    this.$client.getMonitor().raise(HttpRequestRetry.INSTANCE.getHttpRequestRetryEvent(), retryEventData2);
                    HttpRequestRetry.DelayContext delayContext = new HttpRequestRetry.DelayContext(retryEventData2.getRequest(), retryEventData2.getResponse(), retryEventData2.getCause());
                    function25 = this.this$0.delay;
                    objInvoke = function24.invoke(delayContext, Boxing.boxInt(i4));
                    this.L$0 = sender2;
                    this.L$1 = httpRequestBuilder2;
                    this.L$2 = function34;
                    this.L$3 = function33;
                    this.L$4 = function24;
                    this.L$5 = function23;
                    this.L$6 = retryEventData2;
                    this.I$0 = i4;
                    this.I$1 = i3;
                    c = 2;
                    this.label = 2;
                    if (function25.invoke(objInvoke, this) == coroutine_suspended) {
                    }
                    Sender sender4 = sender2;
                    httpRequestBuilder = httpRequestBuilder2;
                    function32 = function34;
                    function3 = function33;
                    function2 = function24;
                    function22 = function23;
                    int i6 = i4;
                    i = i3;
                    retryEventData = retryEventData2;
                    i2 = i6;
                    HttpRequestRetryKt.LOGGER.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
                    sender = sender4;
                    httpRequestBuilderPrepareRequest = this.this$0.prepareRequest(httpRequestBuilder);
                    if (retryEventData != null) {
                    }
                    this.L$0 = sender;
                    this.L$1 = httpRequestBuilder;
                    this.L$2 = function32;
                    this.L$3 = function3;
                    this.L$4 = function2;
                    this.L$5 = function22;
                    this.L$6 = httpRequestBuilderPrepareRequest;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 1;
                    objExecute = sender.execute(httpRequestBuilderPrepareRequest, this);
                    if (objExecute == coroutine_suspended) {
                    }
                }
            }
            httpClientCall = (HttpClientCall) objExecute;
            if (this.this$0.shouldRetry(i2, i, function32, httpClientCall)) {
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.I$1;
            i4 = this.I$0;
            retryEventData2 = (HttpRequestRetry.RetryEventData) this.L$6;
            function23 = (Function2) this.L$5;
            function24 = (Function2) this.L$4;
            function33 = (Function3) this.L$3;
            function34 = (Function3) this.L$2;
            httpRequestBuilder2 = (HttpRequestBuilder) this.L$1;
            sender2 = (Sender) this.L$0;
            ResultKt.throwOnFailure(obj);
            c = 2;
            Sender sender42 = sender2;
            httpRequestBuilder = httpRequestBuilder2;
            function32 = function34;
            function3 = function33;
            function2 = function24;
            function22 = function23;
            int i62 = i4;
            i = i3;
            retryEventData = retryEventData2;
            i2 = i62;
            HttpRequestRetryKt.LOGGER.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
            sender = sender42;
            httpRequestBuilderPrepareRequest = this.this$0.prepareRequest(httpRequestBuilder);
            if (retryEventData != null) {
                function22.invoke(new HttpRequestRetry.ModifyRequestContext(httpRequestBuilder, retryEventData.getResponse(), retryEventData.getCause(), retryEventData.getRetryCount()), httpRequestBuilderPrepareRequest);
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function32;
            this.L$3 = function3;
            this.L$4 = function2;
            this.L$5 = function22;
            this.L$6 = httpRequestBuilderPrepareRequest;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            objExecute = sender.execute(httpRequestBuilderPrepareRequest, this);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientCall = (HttpClientCall) objExecute;
            if (this.this$0.shouldRetry(i2, i, function32, httpClientCall)) {
                return httpClientCall;
            }
            int i7 = i2 + 1;
            HttpRequestRetry.RetryEventData retryEventData3 = new HttpRequestRetry.RetryEventData(httpRequestBuilderPrepareRequest, i7, httpClientCall.getResponse(), null);
            i3 = i;
            i4 = i7;
            function23 = function22;
            function24 = function2;
            function33 = function3;
            function34 = function32;
            httpRequestBuilder2 = httpRequestBuilder;
            sender2 = sender;
            retryEventData2 = retryEventData3;
            this.$client.getMonitor().raise(HttpRequestRetry.INSTANCE.getHttpRequestRetryEvent(), retryEventData2);
            HttpRequestRetry.DelayContext delayContext2 = new HttpRequestRetry.DelayContext(retryEventData2.getRequest(), retryEventData2.getResponse(), retryEventData2.getCause());
            function25 = this.this$0.delay;
            objInvoke = function24.invoke(delayContext2, Boxing.boxInt(i4));
            this.L$0 = sender2;
            this.L$1 = httpRequestBuilder2;
            this.L$2 = function34;
            this.L$3 = function33;
            this.L$4 = function24;
            this.L$5 = function23;
            this.L$6 = retryEventData2;
            this.I$0 = i4;
            this.I$1 = i3;
            c = 2;
            this.label = 2;
            if (function25.invoke(objInvoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Sender sender422 = sender2;
            httpRequestBuilder = httpRequestBuilder2;
            function32 = function34;
            function3 = function33;
            function2 = function24;
            function22 = function23;
            int i622 = i4;
            i = i3;
            retryEventData = retryEventData2;
            i2 = i622;
            HttpRequestRetryKt.LOGGER.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
            sender = sender422;
            httpRequestBuilderPrepareRequest = this.this$0.prepareRequest(httpRequestBuilder);
            if (retryEventData != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function32;
            this.L$3 = function3;
            this.L$4 = function2;
            this.L$5 = function22;
            this.L$6 = httpRequestBuilderPrepareRequest;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            objExecute = sender.execute(httpRequestBuilderPrepareRequest, this);
            if (objExecute == coroutine_suspended) {
            }
            httpClientCall = (HttpClientCall) objExecute;
            if (this.this$0.shouldRetry(i2, i, function32, httpClientCall)) {
            }
        }
    }
}
