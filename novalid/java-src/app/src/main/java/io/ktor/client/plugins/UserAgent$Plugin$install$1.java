package io.ktor.client.plugins;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserAgent.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.UserAgent$Plugin$install$1", m7120f = "UserAgent.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class UserAgent$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
    public final /* synthetic */ UserAgent $plugin;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgent$Plugin$install$1(UserAgent userAgent, Continuation<? super UserAgent$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = userAgent;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        UserAgent$Plugin$install$1 userAgent$Plugin$install$1 = new UserAgent$Plugin$install$1(this.$plugin, continuation);
        userAgent$Plugin$install$1.L$0 = pipelineContext;
        return userAgent$Plugin$install$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            UserAgentKt.LOGGER.trace("Adding User-Agent header: " + this.$plugin.getAgent() + " for " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
            UtilsKt.header((HttpMessageBuilder) pipelineContext.getContext(), HttpHeaders.INSTANCE.getUserAgent(), this.$plugin.getAgent());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
