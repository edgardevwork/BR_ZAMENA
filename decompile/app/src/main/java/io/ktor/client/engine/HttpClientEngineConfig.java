package io.ktor.client.engine;

import io.ktor.util.KtorDsl;
import java.net.Proxy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientEngineConfig.kt */
@KtorDsl
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m7105d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "", "()V", "pipelining", "", "getPipelining", "()Z", "setPipelining", "(Z)V", "proxy", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "getProxy", "()Ljava/net/Proxy;", "setProxy", "(Ljava/net/Proxy;)V", "threadsCount", "", "getThreadsCount$annotations", "getThreadsCount", "()I", "setThreadsCount", "(I)V", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public class HttpClientEngineConfig {
    public boolean pipelining;

    @Nullable
    public Proxy proxy;
    public int threadsCount = 4;

    @Deprecated(level = DeprecationLevel.WARNING, message = "The [threadsCount] property is deprecated. The [Dispatchers.IO] is used by default.")
    public static /* synthetic */ void getThreadsCount$annotations() {
    }

    public final int getThreadsCount() {
        return this.threadsCount;
    }

    public final void setThreadsCount(int i) {
        this.threadsCount = i;
    }

    public final boolean getPipelining() {
        return this.pipelining;
    }

    public final void setPipelining(boolean z) {
        this.pipelining = z;
    }

    @Nullable
    public final Proxy getProxy() {
        return this.proxy;
    }

    public final void setProxy(@Nullable Proxy proxy) {
        this.proxy = proxy;
    }
}
