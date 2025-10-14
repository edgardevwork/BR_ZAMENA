package io.ktor.client.engine;

import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProxyConfigJvm.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\b*\u00060\u0002j\u0002`\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005*\n\u0010\t\"\u00020\u00022\u00020\u0002¨\u0006\n"}, m7105d2 = {"type", "Lio/ktor/client/engine/ProxyType;", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "getType", "(Ljava/net/Proxy;)Lio/ktor/client/engine/ProxyType;", "resolveAddress", "Ljava/net/SocketAddress;", "Lio/ktor/util/network/NetworkAddress;", "ProxyConfig", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ProxyConfigJvmKt {

    /* compiled from: ProxyConfigJvm.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SocketAddress resolveAddress(@NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(proxy, "<this>");
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNullExpressionValue(socketAddressAddress, "address()");
        return socketAddressAddress;
    }

    @NotNull
    public static final ProxyType getType(@NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(proxy, "<this>");
        Proxy.Type type = proxy.type();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return ProxyType.SOCKS;
        }
        if (i == 2) {
            return ProxyType.HTTP;
        }
        return ProxyType.UNKNOWN;
    }
}
