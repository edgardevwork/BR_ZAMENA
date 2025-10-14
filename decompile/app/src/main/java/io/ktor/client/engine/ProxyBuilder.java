package io.ktor.client.engine;

import io.ktor.http.Url;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProxyConfigJvm.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m7105d2 = {"Lio/ktor/client/engine/ProxyBuilder;", "", "()V", HttpHost.DEFAULT_SCHEME_NAME, "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "url", "Lio/ktor/http/Url;", "socks", "host", "", "port", "", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ProxyBuilder {

    @NotNull
    public static final ProxyBuilder INSTANCE = new ProxyBuilder();

    @NotNull
    public final Proxy http(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(url.getHost(), url.getPort()));
    }

    @NotNull
    public final Proxy socks(@NotNull String host, int port) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(host, port));
    }
}
