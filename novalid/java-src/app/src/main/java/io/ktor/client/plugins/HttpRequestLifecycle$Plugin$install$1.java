package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequestLifecycle.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", m7120f = "HttpRequestLifecycle.kt", m7121i = {0}, m7122l = {38}, m7123m = "invokeSuspend", m7124n = {"executionContext"}, m7125s = {"L$0"})
/* loaded from: classes7.dex */
public final class HttpRequestLifecycle$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
    public final /* synthetic */ HttpClient $scope;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycle$Plugin$install$1(HttpClient httpClient, Continuation<? super HttpRequestLifecycle$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        HttpRequestLifecycle$Plugin$install$1 httpRequestLifecycle$Plugin$install$1 = new HttpRequestLifecycle$Plugin$install$1(this.$scope, continuation);
        httpRequestLifecycle$Plugin$install$1.L$0 = pipelineContext;
        return httpRequestLifecycle$Plugin$install$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CompletableJob completableJob;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = (CompletableJob) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                completableJob.complete();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                try {
                    completableJob.completeExceptionally(th);
                    throw th;
                } catch (Throwable th2) {
                    completableJob.complete();
                    throw th2;
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        CompletableJob completableJobSupervisorJob = SupervisorKt.SupervisorJob(((HttpRequestBuilder) pipelineContext.getContext()).getExecutionContext());
        CoroutineContext.Element element = this.$scope.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        HttpRequestLifecycleKt.attachToClientEngineJob(completableJobSupervisorJob, (Job) element);
        try {
            ((HttpRequestBuilder) pipelineContext.getContext()).setExecutionContext$ktor_client_core(completableJobSupervisorJob);
            this.L$0 = completableJobSupervisorJob;
            this.label = 1;
            if (pipelineContext.proceed(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            completableJob = completableJobSupervisorJob;
            completableJob.complete();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            completableJob = completableJobSupervisorJob;
            completableJob.completeExceptionally(th);
            throw th;
        }
    }
}
