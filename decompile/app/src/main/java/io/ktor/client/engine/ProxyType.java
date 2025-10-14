package io.ktor.client.engine;

import kotlin.Metadata;
import org.apache.http.HttpVersion;
import org.apache.ivy.core.cache.ArtifactOrigin;

/* compiled from: ProxyConfig.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lio/ktor/client/engine/ProxyType;", "", "(Ljava/lang/String;I)V", "SOCKS", HttpVersion.HTTP, ArtifactOrigin.UNKNOWN, "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public enum ProxyType {
    SOCKS,
    HTTP,
    UNKNOWN
}
