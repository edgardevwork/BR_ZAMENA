package io.ktor.client.plugins.json;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.json.JsonPlugin;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p050io.ByteReadChannel;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonPlugin.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\u000bH\u0007\"\u001e\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m7105d2 = {"DefaultCommonIgnoredTypes", "", "Lkotlin/reflect/KClass;", "getDefaultCommonIgnoredTypes", "()Ljava/util/Set;", "Json", "", "Lio/ktor/client/HttpClientConfig;", "block", "Lkotlin/Function1;", "Lio/ktor/client/plugins/json/JsonPlugin$Config;", "Lkotlin/ExtensionFunctionType;", "ktor-client-json"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class JsonPluginKt {

    @NotNull
    public static final Set<KClass<?>> DefaultCommonIgnoredTypes = SetsKt__SetsKt.setOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(byte[].class), Reflection.getOrCreateKotlinClass(String.class), Reflection.getOrCreateKotlinClass(HttpStatusCode.class), Reflection.getOrCreateKotlinClass(ByteReadChannel.class), Reflection.getOrCreateKotlinClass(OutgoingContent.class)});

    @NotNull
    public static final Set<KClass<?>> getDefaultCommonIgnoredTypes() {
        return DefaultCommonIgnoredTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "Please use ContentNegotiation plugin: https://ktor.io/docs/migrating-2.html#serialization-client")
    public static final void Json(@NotNull HttpClientConfig<?> httpClientConfig, @NotNull Function1<? super JsonPlugin.Config, Unit> block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(JsonPlugin.INSTANCE, block);
    }
}
