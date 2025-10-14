package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.util.InternalAPI;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientEngineBase.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b&\u0018\u00002\u00020\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013¨\u0006\u0014"}, m7105d2 = {"Lio/ktor/client/engine/HttpClientEngineBase;", "", "engineName", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext$delegate", "Lkotlin/Lazy;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/String;", "ktor-client-core", "Lio/ktor/client/engine/HttpClientEngine;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public abstract class HttpClientEngineBase implements HttpClientEngine {
    public static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientEngineBase.class, "closed");

    @NotNull
    private volatile /* synthetic */ int closed;

    /* renamed from: coroutineContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy coroutineContext;

    @NotNull
    public final CoroutineDispatcher dispatcher;

    @NotNull
    public final String engineName;

    public HttpClientEngineBase(@NotNull String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.engineName = engineName;
        this.closed = 0;
        this.dispatcher = HttpClientEngineBase_jvmKt.ioDispatcher();
        this.coroutineContext = LazyKt__LazyJVMKt.lazy(new Function0<CoroutineContext>() { // from class: io.ktor.client.engine.HttpClientEngineBase$coroutineContext$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CoroutineContext invoke() {
                return CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null).plus(this.this$0.getDispatcher()).plus(new CoroutineName(this.this$0.engineName + "-context"));
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

    @Override // io.ktor.client.engine.HttpClientEngine
    @NotNull
    public CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.coroutineContext.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(Job.INSTANCE);
            CompletableJob completableJob = element instanceof CompletableJob ? (CompletableJob) element : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }
}
