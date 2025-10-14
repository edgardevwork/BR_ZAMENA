package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.ByteChannelsKt;
import io.ktor.util.PlatformUtils;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterJob;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.apache.ivy.util.url.BasicURLHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

/* compiled from: DefaultTransform.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m7105d2 = {"LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "defaultTransformers", "", "Lio/ktor/client/HttpClient;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DefaultTransformKt {

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.defaultTransformers");

    /* compiled from: DefaultTransform.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "body"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", m7120f = "DefaultTransform.kt", m7121i = {}, m7122l = {57}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1 */
    /* loaded from: classes7.dex */
    public static final class C101341 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C101341(Continuation<? super C101341> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
            C101341 c101341 = new C101341(continuation);
            c101341.L$0 = pipelineContext;
            c101341.L$1 = obj;
            return c101341.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            OutgoingContent outgoingContentPlatformRequestDefaultTransform;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final PipelineContext pipelineContext = (PipelineContext) this.L$0;
                final Object obj2 = this.L$1;
                HeadersBuilder headers = ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                if (headers.get(httpHeaders.getAccept()) == null) {
                    ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().append(httpHeaders.getAccept(), BasicURLHandler.ACCEPT_HEADER_VALUE);
                }
                final ContentType contentType = HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (contentType == null) {
                        contentType = ContentType.Text.INSTANCE.getPlain();
                    }
                    outgoingContentPlatformRequestDefaultTransform = new TextContent(str, contentType, null, 4, null);
                } else if (obj2 instanceof byte[]) {
                    outgoingContentPlatformRequestDefaultTransform = new OutgoingContent.ByteArrayContent(contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$1
                        public final /* synthetic */ Object $body;
                        public final long contentLength;

                        @NotNull
                        public final ContentType contentType;

                        {
                            this.$body = obj2;
                            this.contentType = contentType == null ? ContentType.Application.INSTANCE.getOctetStream() : contentType;
                            this.contentLength = ((byte[]) obj2).length;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        @NotNull
                        public ContentType getContentType() {
                            return this.contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        @NotNull
                        public Long getContentLength() {
                            return Long.valueOf(this.contentLength);
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                        @NotNull
                        /* renamed from: bytes */
                        public byte[] getContent() {
                            return (byte[]) this.$body;
                        }
                    };
                } else if (obj2 instanceof ByteReadChannel) {
                    outgoingContentPlatformRequestDefaultTransform = new OutgoingContent.ReadChannelContent(pipelineContext, contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$2
                        public final /* synthetic */ Object $body;

                        @Nullable
                        public final Long contentLength;

                        @NotNull
                        public final ContentType contentType;

                        {
                            this.$body = obj2;
                            String str2 = pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                            this.contentLength = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                            this.contentType = contentType == null ? ContentType.Application.INSTANCE.getOctetStream() : contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        @Nullable
                        public Long getContentLength() {
                            return this.contentLength;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        @NotNull
                        public ContentType getContentType() {
                            return this.contentType;
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                        @NotNull
                        /* renamed from: readFrom */
                        public ByteReadChannel getChannel() {
                            return (ByteReadChannel) this.$body;
                        }
                    };
                } else {
                    outgoingContentPlatformRequestDefaultTransform = obj2 instanceof OutgoingContent ? (OutgoingContent) obj2 : DefaultTransformersJvmKt.platformRequestDefaultTransform(contentType, (HttpRequestBuilder) pipelineContext.getContext(), obj2);
                }
                if ((outgoingContentPlatformRequestDefaultTransform != null ? outgoingContentPlatformRequestDefaultTransform.getContentType() : null) != null) {
                    ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().remove(httpHeaders.getContentType());
                    DefaultTransformKt.LOGGER.trace("Transformed with default transformers request body for " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl() + " from " + Reflection.getOrCreateKotlinClass(obj2.getClass()));
                    this.L$0 = null;
                    this.label = 1;
                    if (pipelineContext.proceedWith(outgoingContentPlatformRequestDefaultTransform, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void defaultTransformers(@NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "<this>");
        httpClient.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new C101341(null));
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getParse(), new C101352(null));
        DefaultTransformersJvmKt.platformResponseDefaultTransformers(httpClient);
    }

    /* compiled from: DefaultTransform.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<name for destructuring parameter 0>"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", m7120f = "DefaultTransform.kt", m7121i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8}, m7122l = {68, 72, 72, 78, 78, 82, 90, 116, 121}, m7123m = "invokeSuspend", m7124n = {"$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "response", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDefaultTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTransform.kt\nio/ktor/client/plugins/DefaultTransformKt$defaultTransformers$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2 */
    /* loaded from: classes7.dex */
    public static final class C101352 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        public C101352(Continuation<? super C101352> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, @NotNull HttpResponseContainer httpResponseContainer, @Nullable Continuation<? super Unit> continuation) {
            C101352 c101352 = new C101352(continuation);
            c101352.L$0 = pipelineContext;
            c101352.L$1 = httpResponseContainer;
            return c101352.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x015e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0265 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02f8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            PipelineContext pipelineContext;
            TypeInfo expectedType;
            HttpResponse response;
            TypeInfo typeInfo;
            PipelineContext pipelineContext2;
            Object objProceedWith;
            PipelineContext pipelineContext3;
            Object objProceedWith2;
            Object byteArray;
            Object remaining$default;
            TypeInfo typeInfo2;
            PipelineContext pipelineContext4;
            Object remaining$default2;
            PipelineContext pipelineContext5;
            Object objProceedWith3;
            PipelineContext pipelineContext6;
            Object objProceedWith4;
            PipelineContext pipelineContext7;
            Object objProceedWith5;
            byte[] bArr;
            Long lContentLength;
            boolean z;
            Object objProceedWith6;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            HttpResponseContainer httpResponseContainer = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    pipelineContext = (PipelineContext) this.L$0;
                    HttpResponseContainer httpResponseContainer2 = (HttpResponseContainer) this.L$1;
                    expectedType = httpResponseContainer2.getExpectedType();
                    Object response2 = httpResponseContainer2.getResponse();
                    if (!(response2 instanceof ByteReadChannel)) {
                        return Unit.INSTANCE;
                    }
                    response = ((HttpClientCall) pipelineContext.getContext()).getResponse();
                    KClass<?> type = expectedType.getType();
                    if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Unit.class))) {
                        ByteReadChannelKt.cancel((ByteReadChannel) response2);
                        HttpResponseContainer httpResponseContainer3 = new HttpResponseContainer(expectedType, Unit.INSTANCE);
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.label = 1;
                        objProceedWith3 = pipelineContext.proceedWith(httpResponseContainer3, this);
                        if (objProceedWith3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pipelineContext6 = pipelineContext;
                        httpResponseContainer = (HttpResponseContainer) objProceedWith3;
                        pipelineContext2 = pipelineContext6;
                        if (httpResponseContainer != null) {
                            DefaultTransformKt.LOGGER.trace("Transformed with default transformers response body for " + ((HttpClientCall) pipelineContext2.getContext()).getRequest().getUrl() + " to " + expectedType.getType());
                        }
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.L$2 = pipelineContext;
                        this.L$3 = expectedType;
                        this.label = 2;
                        remaining$default2 = ByteReadChannel.DefaultImpls.readRemaining$default((ByteReadChannel) response2, 0L, this, 1, null);
                        if (remaining$default2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        typeInfo2 = expectedType;
                        pipelineContext5 = pipelineContext;
                        HttpResponseContainer httpResponseContainer4 = new HttpResponseContainer(expectedType, Boxing.boxInt(Integer.parseInt(Input.readText$default((Input) remaining$default2, 0, 0, 3, null))));
                        this.L$0 = pipelineContext;
                        this.L$1 = typeInfo2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        objProceedWith4 = pipelineContext5.proceedWith(httpResponseContainer4, this);
                        if (objProceedWith4 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pipelineContext7 = pipelineContext;
                        httpResponseContainer = (HttpResponseContainer) objProceedWith4;
                        pipelineContext2 = pipelineContext7;
                        expectedType = typeInfo2;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(ByteReadPacket.class)) ? true : Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Input.class))) {
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.L$2 = pipelineContext;
                        this.L$3 = expectedType;
                        this.label = 4;
                        remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default((ByteReadChannel) response2, 0L, this, 1, null);
                        if (remaining$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        typeInfo2 = expectedType;
                        pipelineContext4 = pipelineContext;
                        HttpResponseContainer httpResponseContainer5 = new HttpResponseContainer(expectedType, remaining$default);
                        this.L$0 = pipelineContext;
                        this.L$1 = typeInfo2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        objProceedWith5 = pipelineContext4.proceedWith(httpResponseContainer5, this);
                        if (objProceedWith5 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pipelineContext7 = pipelineContext;
                        httpResponseContainer = (HttpResponseContainer) objProceedWith5;
                        pipelineContext2 = pipelineContext7;
                        expectedType = typeInfo2;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(byte[].class))) {
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.L$2 = response;
                        this.label = 6;
                        byteArray = ByteChannelsKt.toByteArray((ByteReadChannel) response2, this);
                        if (byteArray == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bArr = (byte[]) byteArray;
                        lContentLength = HttpMessagePropertiesKt.contentLength(response);
                        z = PlatformUtils.INSTANCE.getIS_BROWSER() && response.getHeaders().get(HttpHeaders.INSTANCE.getContentEncoding()) == null;
                        boolean z2 = !Intrinsics.areEqual(((HttpClientCall) pipelineContext.getContext()).getRequest().getMethod(), HttpMethod.INSTANCE.getHead());
                        if (z && z2 && lContentLength != null && lContentLength.longValue() > 0) {
                            if (!(bArr.length == ((int) lContentLength.longValue()))) {
                                throw new IllegalStateException(("Expected " + lContentLength + ", actual " + bArr.length).toString());
                            }
                        }
                        HttpResponseContainer httpResponseContainer6 = new HttpResponseContainer(expectedType, bArr);
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.L$2 = null;
                        this.label = 7;
                        objProceedWith6 = pipelineContext.proceedWith(httpResponseContainer6, this);
                        if (objProceedWith6 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pipelineContext6 = pipelineContext;
                        httpResponseContainer = (HttpResponseContainer) objProceedWith6;
                        pipelineContext2 = pipelineContext6;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(ByteReadChannel.class))) {
                        final CompletableJob completableJobJob = JobKt.Job((Job) response.getCoroutineContext().get(Job.INSTANCE));
                        typeInfo = expectedType;
                        WriterJob writerJobWriter$default = CoroutinesKt.writer$default((CoroutineScope) pipelineContext, response.getCoroutineContext(), false, (Function2) new DefaultTransformKt$defaultTransformers$2$result$channel$1(response2, response, null), 2, (Object) null);
                        writerJobWriter$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Throwable th) {
                                completableJobJob.complete();
                            }
                        });
                        HttpResponseContainer httpResponseContainer7 = new HttpResponseContainer(typeInfo, writerJobWriter$default.getChannel());
                        this.L$0 = pipelineContext;
                        this.L$1 = typeInfo;
                        this.label = 8;
                        objProceedWith2 = pipelineContext.proceedWith(httpResponseContainer7, this);
                        if (objProceedWith2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pipelineContext3 = pipelineContext;
                        httpResponseContainer = (HttpResponseContainer) objProceedWith2;
                        pipelineContext2 = pipelineContext3;
                        expectedType = typeInfo;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    typeInfo = expectedType;
                    if (!Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(HttpStatusCode.class))) {
                        expectedType = typeInfo;
                        pipelineContext2 = pipelineContext;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    ByteReadChannelKt.cancel((ByteReadChannel) response2);
                    HttpResponseContainer httpResponseContainer8 = new HttpResponseContainer(typeInfo, response.getStatus());
                    this.L$0 = pipelineContext;
                    this.L$1 = typeInfo;
                    this.label = 9;
                    objProceedWith = pipelineContext.proceedWith(httpResponseContainer8, this);
                    if (objProceedWith == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext3 = pipelineContext;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith;
                    pipelineContext2 = pipelineContext3;
                    expectedType = typeInfo;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 1:
                    TypeInfo typeInfo3 = (TypeInfo) this.L$1;
                    pipelineContext6 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo3;
                    objProceedWith3 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith3;
                    pipelineContext2 = pipelineContext6;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    TypeInfo typeInfo4 = (TypeInfo) this.L$3;
                    pipelineContext5 = (PipelineContext) this.L$2;
                    typeInfo2 = (TypeInfo) this.L$1;
                    PipelineContext pipelineContext8 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo4;
                    pipelineContext = pipelineContext8;
                    remaining$default2 = obj;
                    HttpResponseContainer httpResponseContainer42 = new HttpResponseContainer(expectedType, Boxing.boxInt(Integer.parseInt(Input.readText$default((Input) remaining$default2, 0, 0, 3, null))));
                    this.L$0 = pipelineContext;
                    this.L$1 = typeInfo2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    objProceedWith4 = pipelineContext5.proceedWith(httpResponseContainer42, this);
                    if (objProceedWith4 != coroutine_suspended) {
                    }
                    break;
                case 3:
                    TypeInfo typeInfo5 = (TypeInfo) this.L$1;
                    pipelineContext7 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    typeInfo2 = typeInfo5;
                    objProceedWith4 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith4;
                    pipelineContext2 = pipelineContext7;
                    expectedType = typeInfo2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    TypeInfo typeInfo6 = (TypeInfo) this.L$3;
                    pipelineContext4 = (PipelineContext) this.L$2;
                    typeInfo2 = (TypeInfo) this.L$1;
                    PipelineContext pipelineContext9 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo6;
                    pipelineContext = pipelineContext9;
                    remaining$default = obj;
                    HttpResponseContainer httpResponseContainer52 = new HttpResponseContainer(expectedType, remaining$default);
                    this.L$0 = pipelineContext;
                    this.L$1 = typeInfo2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    objProceedWith5 = pipelineContext4.proceedWith(httpResponseContainer52, this);
                    if (objProceedWith5 != coroutine_suspended) {
                    }
                    break;
                case 5:
                    TypeInfo typeInfo7 = (TypeInfo) this.L$1;
                    pipelineContext7 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    typeInfo2 = typeInfo7;
                    objProceedWith5 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith5;
                    pipelineContext2 = pipelineContext7;
                    expectedType = typeInfo2;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    HttpResponse httpResponse = (HttpResponse) this.L$2;
                    TypeInfo typeInfo8 = (TypeInfo) this.L$1;
                    PipelineContext pipelineContext10 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo8;
                    pipelineContext = pipelineContext10;
                    response = httpResponse;
                    byteArray = obj;
                    bArr = (byte[]) byteArray;
                    lContentLength = HttpMessagePropertiesKt.contentLength(response);
                    if (PlatformUtils.INSTANCE.getIS_BROWSER()) {
                        boolean z22 = !Intrinsics.areEqual(((HttpClientCall) pipelineContext.getContext()).getRequest().getMethod(), HttpMethod.INSTANCE.getHead());
                        if (z) {
                            if (!(bArr.length == ((int) lContentLength.longValue()))) {
                            }
                            break;
                        }
                        HttpResponseContainer httpResponseContainer62 = new HttpResponseContainer(expectedType, bArr);
                        this.L$0 = pipelineContext;
                        this.L$1 = expectedType;
                        this.L$2 = null;
                        this.label = 7;
                        objProceedWith6 = pipelineContext.proceedWith(httpResponseContainer62, this);
                        if (objProceedWith6 != coroutine_suspended) {
                        }
                        break;
                    }
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    TypeInfo typeInfo9 = (TypeInfo) this.L$1;
                    pipelineContext6 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    expectedType = typeInfo9;
                    objProceedWith6 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith6;
                    pipelineContext2 = pipelineContext6;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    TypeInfo typeInfo10 = (TypeInfo) this.L$1;
                    pipelineContext3 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    typeInfo = typeInfo10;
                    objProceedWith2 = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith2;
                    pipelineContext2 = pipelineContext3;
                    expectedType = typeInfo;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    TypeInfo typeInfo11 = (TypeInfo) this.L$1;
                    pipelineContext3 = (PipelineContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    typeInfo = typeInfo11;
                    objProceedWith = obj;
                    httpResponseContainer = (HttpResponseContainer) objProceedWith;
                    pipelineContext2 = pipelineContext3;
                    expectedType = typeInfo;
                    if (httpResponseContainer != null) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
