package io.ktor.client.plugins.observer;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.ByteChannelsKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResponseObserver.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1", m7120f = "ResponseObserver.kt", m7121i = {0, 0, 0}, m7122l = {68, 77}, m7123m = "invokeSuspend", m7124n = {"$this$intercept", "newResponse", "sideResponse"}, m7125s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ResponseObserver$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponse, Unit>, HttpResponse, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ResponseObserver $plugin;
    public final /* synthetic */ HttpClient $scope;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseObserver$Plugin$install$1(ResponseObserver responseObserver, HttpClient httpClient, Continuation<? super ResponseObserver$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = responseObserver;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull PipelineContext<HttpResponse, Unit> pipelineContext, @NotNull HttpResponse httpResponse, @Nullable Continuation<? super Unit> continuation) {
        ResponseObserver$Plugin$install$1 responseObserver$Plugin$install$1 = new ResponseObserver$Plugin$install$1(this.$plugin, this.$scope, continuation);
        responseObserver$Plugin$install$1.L$0 = pipelineContext;
        responseObserver$Plugin$install$1.L$1 = httpResponse;
        return responseObserver$Plugin$install$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        HttpResponse httpResponse;
        PipelineContext pipelineContext;
        HttpResponse httpResponse2;
        HttpClient httpClient;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
            HttpResponse httpResponse3 = (HttpResponse) this.L$1;
            Function1 function1 = this.$plugin.filter;
            if (function1 != null && !((Boolean) function1.invoke(httpResponse3.getCall())).booleanValue()) {
                return Unit.INSTANCE;
            }
            Pair<ByteReadChannel, ByteReadChannel> pairSplit = ByteChannelsKt.split(httpResponse3.getContent(), httpResponse3);
            ByteReadChannel byteReadChannelComponent1 = pairSplit.component1();
            HttpResponse response = DelegatedCallKt.wrapWithContent(httpResponse3.getCall(), pairSplit.component2()).getResponse();
            HttpResponse response2 = DelegatedCallKt.wrapWithContent(httpResponse3.getCall(), byteReadChannelComponent1).getResponse();
            HttpClient httpClient2 = this.$scope;
            this.L$0 = pipelineContext2;
            this.L$1 = response;
            this.L$2 = response2;
            this.L$3 = httpClient2;
            this.label = 1;
            Object responseObserverContext = ResponseObserverContextJvmKt.getResponseObserverContext(this);
            if (responseObserverContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpResponse = response;
            pipelineContext = pipelineContext2;
            httpResponse2 = response2;
            obj = responseObserverContext;
            httpClient = httpClient2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ?? r1 = (CoroutineScope) this.L$3;
            HttpResponse httpResponse4 = (HttpResponse) this.L$2;
            HttpResponse httpResponse5 = (HttpResponse) this.L$1;
            PipelineContext pipelineContext3 = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
            httpResponse = httpResponse5;
            pipelineContext = pipelineContext3;
            httpClient = r1;
            httpResponse2 = httpResponse4;
        }
        BuildersKt__Builders_commonKt.launch$default(httpClient, (CoroutineContext) obj, null, new C101991(httpResponse2, this.$plugin, null), 2, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (pipelineContext.proceedWith(httpResponse, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ResponseObserver.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1", m7120f = "ResponseObserver.kt", m7121i = {0}, m7122l = {69, 73}, m7123m = "invokeSuspend", m7124n = {"$this$launch"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nResponseObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseObserver.kt\nio/ktor/client/plugins/observer/ResponseObserver$Plugin$install$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1 */
    public static final class C101991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ResponseObserver $plugin;
        public final /* synthetic */ HttpResponse $sideResponse;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101991(HttpResponse httpResponse, ResponseObserver responseObserver, Continuation<? super C101991> continuation) {
            super(2, continuation);
            this.$sideResponse = httpResponse;
            this.$plugin = responseObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C101991 c101991 = new C101991(this.$sideResponse, this.$plugin, continuation);
            c101991.L$0 = obj;
            return c101991;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C101991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m15699constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m15699constructorimpl(ResultKt.createFailure(th2));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ResponseObserver responseObserver = this.$plugin;
                HttpResponse httpResponse = this.$sideResponse;
                Result.Companion companion3 = Result.INSTANCE;
                Function2 function2 = responseObserver.responseHandler;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Result.m15699constructorimpl(Boxing.boxLong(((Number) obj).longValue()));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m15699constructorimpl(Unit.INSTANCE);
            ByteReadChannel content = this.$sideResponse.getContent();
            if (!content.isClosedForRead()) {
                Result.Companion companion4 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 2;
                obj = ByteReadChannelKt.discard(content, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m15699constructorimpl(Boxing.boxLong(((Number) obj).longValue()));
            }
            return Unit.INSTANCE;
        }
    }
}
