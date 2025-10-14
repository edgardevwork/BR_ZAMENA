package io.ktor.client;

import io.ktor.client.engine.HttpClientEngineFactory;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientJvm.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u00020\u00062\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\"\u0012\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"FACTORY", "Lio/ktor/client/engine/HttpClientEngineFactory;", "engines", "", "Lio/ktor/client/HttpClientEngineContainer;", "HttpClient", "Lio/ktor/client/HttpClient;", "block", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class HttpClientJvmKt {

    @NotNull
    public static final HttpClientEngineFactory<?> FACTORY;

    @NotNull
    public static final List<HttpClientEngineContainer> engines;

    @NotNull
    public static final HttpClient HttpClient(@NotNull Function1<? super HttpClientConfig<?>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return HttpClientKt.HttpClient(FACTORY, block);
    }

    public static /* synthetic */ HttpClient HttpClient$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<HttpClientConfig<?>, Unit>() { // from class: io.ktor.client.HttpClientJvmKt.HttpClient.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpClientConfig<?> httpClientConfig) {
                    Intrinsics.checkNotNullParameter(httpClientConfig, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpClientConfig<?> httpClientConfig) {
                    invoke2(httpClientConfig);
                    return Unit.INSTANCE;
                }
            };
        }
        return HttpClient(function1);
    }

    static {
        HttpClientEngineFactory<?> factory;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(HttpClientEngineContainer.class, HttpClientEngineContainer.class.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(it, it.classLoader)");
        List<HttpClientEngineContainer> list = CollectionsKt___CollectionsKt.toList(serviceLoaderLoad);
        engines = list;
        HttpClientEngineContainer httpClientEngineContainer = (HttpClientEngineContainer) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        if (httpClientEngineContainer == null || (factory = httpClientEngineContainer.getFactory()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html".toString());
        }
        FACTORY = factory;
    }
}
