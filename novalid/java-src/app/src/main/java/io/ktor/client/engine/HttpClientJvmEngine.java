package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.util.InternalAPI;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientJvmEngine.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "Use HttpClientEngineBase instead.", replaceWith = @ReplaceWith(expression = "HttpClientEngineBase", imports = {}))
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\u00020\u0006H\u0084@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/client/engine/HttpClientJvmEngine;", "Lio/ktor/client/engine/HttpClientEngine;", "engineName", "", "(Ljava/lang/String;)V", "clientContext", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext$delegate", "Lkotlin/Lazy;", "close", "", "createCallContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpClientJvmEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientJvmEngine.kt\nio/ktor/client/engine/HttpClientJvmEngine\n+ 2 HttpClientJvmEngine.kt\nio/ktor/client/engine/HttpClientJvmEngineKt\n*L\n1#1,56:1\n55#2:57\n*S KotlinDebug\n*F\n+ 1 HttpClientJvmEngine.kt\nio/ktor/client/engine/HttpClientJvmEngine\n*L\n35#1:57\n*E\n"})
/* loaded from: classes8.dex */
public abstract class HttpClientJvmEngine implements HttpClientEngine {

    @NotNull
    public final CoroutineContext clientContext;

    /* renamed from: coroutineContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy coroutineContext;

    public HttpClientJvmEngine(@NotNull final String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.clientContext = CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null);
        this.coroutineContext = LazyKt__LazyJVMKt.lazy(new Function0<CoroutineContext>() { // from class: io.ktor.client.engine.HttpClientJvmEngine$coroutineContext$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CoroutineContext invoke() {
                return this.this$0.getDispatcher().plus(this.this$0.clientContext).plus(new CoroutineName(engineName + "-context"));
            }
        });
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @NotNull
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return HttpClientEngine.DefaultImpls.getSupportedCapabilities(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @InternalAPI
    public void install(@NotNull HttpClient httpClient) {
        HttpClientEngine.DefaultImpls.install(this, httpClient);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.coroutineContext.getValue();
    }

    @Nullable
    public final Object createCallContext(@NotNull Continuation<? super CoroutineContext> continuation) {
        CoroutineContext coroutineContext = this.clientContext;
        Job.Companion companion = Job.INSTANCE;
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(companion));
        final CoroutineContext coroutineContextPlus = getCoroutineContext().plus(completableJobJob);
        Job job = (Job) continuation.get$context().get(companion);
        final DisposableHandle disposableHandleInvokeOnCompletion$default = job != null ? Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new Function1<Throwable, Unit>() { // from class: io.ktor.client.engine.HttpClientJvmEngine$createCallContext$onParentCancelCleanupHandle$1
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
                if (th != null) {
                    JobKt__JobKt.cancel$default(coroutineContextPlus, (CancellationException) null, 1, (Object) null);
                }
            }
        }, 2, null) : null;
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.engine.HttpClientJvmEngine.createCallContext.2
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
                DisposableHandle disposableHandle = disposableHandleInvokeOnCompletion$default;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                }
            }
        });
        return coroutineContextPlus;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Job job = JobKt.getJob(this.clientContext);
        Intrinsics.checkNotNull(job, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((CompletableJob) job).complete();
    }
}
