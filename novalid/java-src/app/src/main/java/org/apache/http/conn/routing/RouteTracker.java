package org.apache.http.conn.routing;

import io.ktor.util.date.GMTDateParser;
import java.net.InetAddress;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

/* loaded from: classes5.dex */
public final class RouteTracker implements RouteInfo, Cloneable {
    public boolean connected;
    public RouteInfo.LayerType layered;
    public final InetAddress localAddress;
    public HttpHost[] proxyChain;
    public boolean secure;
    public final HttpHost targetHost;
    public RouteInfo.TunnelType tunnelled;

    public RouteTracker(HttpHost httpHost, InetAddress inetAddress) {
        Args.notNull(httpHost, "Target host");
        this.targetHost = httpHost;
        this.localAddress = inetAddress;
        this.tunnelled = RouteInfo.TunnelType.PLAIN;
        this.layered = RouteInfo.LayerType.PLAIN;
    }

    public void reset() {
        this.connected = false;
        this.proxyChain = null;
        this.tunnelled = RouteInfo.TunnelType.PLAIN;
        this.layered = RouteInfo.LayerType.PLAIN;
        this.secure = false;
    }

    public RouteTracker(HttpRoute httpRoute) {
        this(httpRoute.getTargetHost(), httpRoute.getLocalAddress());
    }

    public void connectTarget(boolean z) {
        Asserts.check(!this.connected, "Already connected");
        this.connected = true;
        this.secure = z;
    }

    public void connectProxy(HttpHost httpHost, boolean z) {
        Args.notNull(httpHost, "Proxy host");
        Asserts.check(!this.connected, "Already connected");
        this.connected = true;
        this.proxyChain = new HttpHost[]{httpHost};
        this.secure = z;
    }

    public void tunnelTarget(boolean z) {
        Asserts.check(this.connected, "No tunnel unless connected");
        Asserts.notNull(this.proxyChain, "No tunnel without proxy");
        this.tunnelled = RouteInfo.TunnelType.TUNNELLED;
        this.secure = z;
    }

    public void tunnelProxy(HttpHost httpHost, boolean z) {
        Args.notNull(httpHost, "Proxy host");
        Asserts.check(this.connected, "No tunnel unless connected");
        Asserts.notNull(this.proxyChain, "No tunnel without proxy");
        HttpHost[] httpHostArr = this.proxyChain;
        int length = httpHostArr.length;
        HttpHost[] httpHostArr2 = new HttpHost[length + 1];
        System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        httpHostArr2[length] = httpHost;
        this.proxyChain = httpHostArr2;
        this.secure = z;
    }

    public void layerProtocol(boolean z) {
        Asserts.check(this.connected, "No layered protocol unless connected");
        this.layered = RouteInfo.LayerType.LAYERED;
        this.secure = z;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getTargetHost() {
        return this.targetHost;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public InetAddress getLocalAddress() {
        return this.localAddress;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public int getHopCount() {
        if (!this.connected) {
            return 0;
        }
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            return 1;
        }
        return 1 + httpHostArr.length;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getHopTarget(int i) {
        Args.notNegative(i, "Hop index");
        int hopCount = getHopCount();
        Args.check(i < hopCount, "Hop index exceeds tracked route length");
        if (i < hopCount - 1) {
            return this.proxyChain[i];
        }
        return this.targetHost;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getProxyHost() {
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            return null;
        }
        return httpHostArr[0];
    }

    public boolean isConnected() {
        return this.connected;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.TunnelType getTunnelType() {
        return this.tunnelled;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isTunnelled() {
        return this.tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isLayered() {
        return this.layered == RouteInfo.LayerType.LAYERED;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isSecure() {
        return this.secure;
    }

    public HttpRoute toRoute() {
        if (this.connected) {
            return new HttpRoute(this.targetHost, this.localAddress, this.proxyChain, this.secure, this.tunnelled, this.layered);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RouteTracker)) {
            return false;
        }
        RouteTracker routeTracker = (RouteTracker) obj;
        return this.connected == routeTracker.connected && this.secure == routeTracker.secure && this.tunnelled == routeTracker.tunnelled && this.layered == routeTracker.layered && LangUtils.equals(this.targetHost, routeTracker.targetHost) && LangUtils.equals(this.localAddress, routeTracker.localAddress) && LangUtils.equals((Object[]) this.proxyChain, (Object[]) routeTracker.proxyChain);
    }

    public int hashCode() {
        int iHashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.targetHost), this.localAddress);
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                iHashCode = LangUtils.hashCode(iHashCode, httpHost);
            }
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(iHashCode, this.connected), this.secure), this.tunnelled), this.layered);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.connected) {
            sb.append('c');
        }
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append(GMTDateParser.SECONDS);
        }
        sb.append("}->");
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                sb.append(httpHost);
                sb.append("->");
            }
        }
        sb.append(this.targetHost);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
