package io.ktor.client.engine;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpHeaders;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.util.AttributeKey;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientEngine.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u000e2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m7105d2 = {"CALL_COROUTINE", "Lkotlinx/coroutines/CoroutineName;", "getCALL_COROUTINE", "()Lkotlinx/coroutines/CoroutineName;", "CLIENT_CONFIG", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClientConfig;", "getCLIENT_CONFIG", "()Lio/ktor/util/AttributeKey;", "validateHeaders", "", "request", "Lio/ktor/client/request/HttpRequestData;", "config", "Lio/ktor/client/engine/HttpClientEngineFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/client/engine/HttpClientEngineConfig;", "nested", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "createCallContext", "Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/client/engine/HttpClientEngine;", "parentJob", "Lkotlinx/coroutines/Job;", "(Lio/ktor/client/engine/HttpClientEngine;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngineKt\n+ 2 Utils.kt\nio/ktor/client/engine/UtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n94#2,11:164\n766#3:175\n857#3,2:176\n*S KotlinDebug\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngineKt\n*L\n146#1:164,11\n156#1:175\n156#1:176,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpClientEngineKt {

    @NotNull
    public static final CoroutineName CALL_COROUTINE = new CoroutineName("call-context");

    @NotNull
    public static final AttributeKey<HttpClientConfig<?>> CLIENT_CONFIG = new AttributeKey<>("client-config");

    @NotNull
    public static final CoroutineName getCALL_COROUTINE() {
        return CALL_COROUTINE;
    }

    @NotNull
    public static final AttributeKey<HttpClientConfig<?>> getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    /* compiled from: HttpClientEngine.kt */
    @Metadata(m7104d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¨\u0006\b"}, m7105d2 = {"io/ktor/client/engine/HttpClientEngineKt$config$1", "Lio/ktor/client/engine/HttpClientEngineFactory;", "create", "Lio/ktor/client/engine/HttpClientEngine;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.engine.HttpClientEngineKt$config$1 */
    /* loaded from: classes7.dex */
    public static final class C101171<T> implements HttpClientEngineFactory<T> {
        public final /* synthetic */ Function1<T, Unit> $nested;
        public final /* synthetic */ HttpClientEngineFactory<T> $parent;

        /* JADX WARN: Multi-variable type inference failed */
        public C101171(HttpClientEngineFactory<? extends T> httpClientEngineFactory, Function1<? super T, Unit> function1) {
            httpClientEngineFactory = httpClientEngineFactory;
            function1 = function1;
        }

        @Override // io.ktor.client.engine.HttpClientEngineFactory
        @NotNull
        public HttpClientEngine create(@NotNull final Function1<? super T, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            HttpClientEngineFactory<T> httpClientEngineFactory = httpClientEngineFactory;
            final Function1<T, Unit> function1 = function1;
            return httpClientEngineFactory.create(new Function1<T, Unit>() { // from class: io.ktor.client.engine.HttpClientEngineKt$config$1$create$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((HttpClientEngineConfig) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void invoke(@NotNull HttpClientEngineConfig create) {
                    Intrinsics.checkNotNullParameter(create, "$this$create");
                    function1.invoke(create);
                    block.invoke(create);
                }
            });
        }
    }

    @NotNull
    public static final <T extends HttpClientEngineConfig> HttpClientEngineFactory<T> config(@NotNull HttpClientEngineFactory<? extends T> httpClientEngineFactory, @NotNull Function1<? super T, Unit> nested) {
        Intrinsics.checkNotNullParameter(httpClientEngineFactory, "<this>");
        Intrinsics.checkNotNullParameter(nested, "nested");
        return new HttpClientEngineFactory<T>() { // from class: io.ktor.client.engine.HttpClientEngineKt.config.1
            public final /* synthetic */ Function1<T, Unit> $nested;
            public final /* synthetic */ HttpClientEngineFactory<T> $parent;

            /* JADX WARN: Multi-variable type inference failed */
            public C101171(HttpClientEngineFactory<? extends T> httpClientEngineFactory2, Function1<? super T, Unit> nested2) {
                httpClientEngineFactory = httpClientEngineFactory2;
                function1 = nested2;
            }

            @Override // io.ktor.client.engine.HttpClientEngineFactory
            @NotNull
            public HttpClientEngine create(@NotNull final Function1<? super T, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                HttpClientEngineFactory<T> httpClientEngineFactory2 = httpClientEngineFactory;
                final Function1<? super T, Unit> function1 = function1;
                return httpClientEngineFactory2.create(new Function1<T, Unit>() { // from class: io.ktor.client.engine.HttpClientEngineKt$config$1$create$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke((HttpClientEngineConfig) obj);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                    public final void invoke(@NotNull HttpClientEngineConfig create) {
                        Intrinsics.checkNotNullParameter(create, "$this$create");
                        function1.invoke(create);
                        block.invoke(create);
                    }
                });
            }
        };
    }

    @Nullable
    public static final Object createCallContext(@NotNull HttpClientEngine httpClientEngine, @NotNull Job job, @NotNull Continuation<? super CoroutineContext> continuation) {
        CompletableJob completableJobJob = JobKt.Job(job);
        CoroutineContext coroutineContextPlus = httpClientEngine.getCoroutineContext().plus(completableJobJob).plus(CALL_COROUTINE);
        Job job2 = (Job) continuation.getContext().get(Job.INSTANCE);
        if (job2 != null) {
            completableJobJob.invokeOnCompletion(new UtilsKt.C101202(Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new UtilsKt$attachToUserJob$cleanupHandler$1(completableJobJob), 2, null)));
        }
        return coroutineContextPlus;
    }

    public static final void validateHeaders(HttpRequestData httpRequestData) {
        Set<String> setNames = httpRequestData.getHeaders().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (HttpHeaders.INSTANCE.getUnsafeHeadersList().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
