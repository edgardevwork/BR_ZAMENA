package io.ktor.client.engine;

import io.ktor.http.URLUtilsKt;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProxyConfig.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m7105d2 = {HttpHost.DEFAULT_SCHEME_NAME, "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "Lio/ktor/client/engine/ProxyBuilder;", "urlString", "", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ProxyConfigKt {
    @NotNull
    public static final Proxy http(@NotNull ProxyBuilder proxyBuilder, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(proxyBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return proxyBuilder.http(URLUtilsKt.Url(urlString));
    }
}
