package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.InternalAPI;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientEngine.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@ø\u0001\u0000J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0017R\u000b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m7105d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "closed", "", "config", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "supportedCapabilities", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "checkExtensions", "", "requestData", "Lio/ktor/client/request/HttpRequestData;", "execute", "Lio/ktor/client/request/HttpResponseData;", "data", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithinCallContext", "install", "client", "Lio/ktor/client/HttpClient;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface HttpClientEngine extends CoroutineScope, Closeable {
    @InternalAPI
    @Nullable
    Object execute(@NotNull HttpRequestData httpRequestData, @NotNull Continuation<? super HttpResponseData> continuation);

    @NotNull
    HttpClientEngineConfig getConfig();

    @NotNull
    CoroutineDispatcher getDispatcher();

    @NotNull
    Set<HttpClientEngineCapability<?>> getSupportedCapabilities();

    @InternalAPI
    void install(@NotNull HttpClient client);

    /* compiled from: HttpClientEngine.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @NotNull
        public static Set<HttpClientEngineCapability<?>> getSupportedCapabilities(@NotNull HttpClientEngine httpClientEngine) {
            return SetsKt__SetsKt.emptySet();
        }

        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            return !(((Job) httpClientEngine.getCoroutineContext().get(Job.INSTANCE)) != null ? r1.isActive() : false);
        }

        @InternalAPI
        public static void install(@NotNull HttpClientEngine httpClientEngine, @NotNull HttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getEngine(), new C101151(client, httpClientEngine, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object executeWithinCallContext(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, Continuation<? super HttpResponseData> continuation) throws Throwable {
            HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            if (continuation instanceof HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (HttpClientEngine$executeWithinCallContext$1) continuation;
                int i = httpClientEngine$executeWithinCallContext$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.label = i - Integer.MIN_VALUE;
                } else {
                    httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(continuation);
                }
            }
            Object objCreateCallContext = httpClientEngine$executeWithinCallContext$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = httpClientEngine$executeWithinCallContext$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateCallContext);
                Job executionContext = httpRequestData.getExecutionContext();
                httpClientEngine$executeWithinCallContext$1.L$0 = httpClientEngine;
                httpClientEngine$executeWithinCallContext$1.L$1 = httpRequestData;
                httpClientEngine$executeWithinCallContext$1.label = 1;
                objCreateCallContext = HttpClientEngineKt.createCallContext(httpClientEngine, executionContext, httpClientEngine$executeWithinCallContext$1);
                if (objCreateCallContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(objCreateCallContext);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                httpRequestData = (HttpRequestData) httpClientEngine$executeWithinCallContext$1.L$1;
                httpClientEngine = (HttpClientEngine) httpClientEngine$executeWithinCallContext$1.L$0;
                ResultKt.throwOnFailure(objCreateCallContext);
            }
            HttpClientEngine httpClientEngine2 = httpClientEngine;
            CoroutineContext coroutineContext = (CoroutineContext) objCreateCallContext;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(httpClientEngine2, coroutineContext.plus(new KtorCallContextElement(coroutineContext)), null, new HttpClientEngine$executeWithinCallContext$2(httpClientEngine2, httpRequestData, null), 2, null);
            httpClientEngine$executeWithinCallContext$1.L$0 = null;
            httpClientEngine$executeWithinCallContext$1.L$1 = null;
            httpClientEngine$executeWithinCallContext$1.label = 2;
            objCreateCallContext = deferredAsync$default.await(httpClientEngine$executeWithinCallContext$1);
            return objCreateCallContext == coroutine_suspended ? coroutine_suspended : objCreateCallContext;
        }

        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData) {
            for (HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }
    }

    /* compiled from: HttpClientEngine.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.engine.HttpClientEngine$install$1", m7120f = "HttpClientEngine.kt", m7121i = {0, 0}, m7122l = {70, 82}, m7123m = "invokeSuspend", m7124n = {"$this$intercept", "requestData"}, m7125s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$install$1\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,163:1\n16#2,4:164\n21#2,10:171\n17#3,3:168\n*S KotlinDebug\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$install$1\n*L\n58#1:164,4\n58#1:171,10\n58#1:168,3\n*E\n"})
    /* renamed from: io.ktor.client.engine.HttpClientEngine$install$1 */
    public static final class C101151 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HttpClient $client;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;
        public final /* synthetic */ HttpClientEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101151(HttpClient httpClient, HttpClientEngine httpClientEngine, Continuation<? super C101151> continuation) {
            super(3, continuation);
            this.$client = httpClient;
            this.this$0 = httpClientEngine;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
            C101151 c101151 = new C101151(this.$client, this.this$0, continuation);
            c101151.L$0 = pipelineContext;
            c101151.L$1 = obj;
            return c101151.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HttpRequestData httpRequestDataBuild;
            PipelineContext pipelineContext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                Object obj2 = this.L$1;
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                httpRequestBuilder.takeFromWithExecutionContext((HttpRequestBuilder) pipelineContext2.getContext());
                if (obj2 == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    KType kTypeTypeOf = Reflection.typeOf(Object.class);
                    httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(Object.class), kTypeTypeOf));
                } else if (obj2 instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj2);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj2);
                    KType kTypeTypeOf2 = Reflection.typeOf(Object.class);
                    httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf2), Reflection.getOrCreateKotlinClass(Object.class), kTypeTypeOf2));
                }
                this.$client.getMonitor().raise(ClientEventsKt.getHttpRequestIsReadyForSending(), httpRequestBuilder);
                httpRequestDataBuild = httpRequestBuilder.build();
                httpRequestDataBuild.getAttributes().put(HttpClientEngineKt.getCLIENT_CONFIG(), this.$client.getConfig$ktor_client_core());
                HttpClientEngineKt.validateHeaders(httpRequestDataBuild);
                DefaultImpls.checkExtensions(this.this$0, httpRequestDataBuild);
                HttpClientEngine httpClientEngine = this.this$0;
                this.L$0 = pipelineContext2;
                this.L$1 = httpRequestDataBuild;
                this.label = 1;
                Object objExecuteWithinCallContext = DefaultImpls.executeWithinCallContext(httpClientEngine, httpRequestDataBuild, this);
                if (objExecuteWithinCallContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pipelineContext = pipelineContext2;
                obj = objExecuteWithinCallContext;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                httpRequestDataBuild = (HttpRequestData) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            HttpClientCall httpClientCall = new HttpClientCall(this.$client, httpRequestDataBuild, (HttpResponseData) obj);
            HttpResponse response = httpClientCall.getResponse();
            this.$client.getMonitor().raise(ClientEventsKt.getHttpResponseReceived(), response);
            JobKt.getJob(response.getCoroutineContext()).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.engine.HttpClientEngine.install.1.1
                public final /* synthetic */ HttpResponse $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(HttpResponse response2) {
                    super(1);
                    httpResponse = response2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@Nullable Throwable th) {
                    if (th != null) {
                        httpClient.getMonitor().raise(ClientEventsKt.getHttpResponseCancelled(), httpResponse);
                    }
                }
            });
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (pipelineContext.proceedWith(httpClientCall, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HttpClientEngine.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: io.ktor.client.engine.HttpClientEngine$install$1$1 */
        /* loaded from: classes8.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ HttpResponse $response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HttpResponse response2) {
                super(1);
                httpResponse = response2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) {
                if (th != null) {
                    httpClient.getMonitor().raise(ClientEventsKt.getHttpResponseCancelled(), httpResponse);
                }
            }
        }
    }
}
