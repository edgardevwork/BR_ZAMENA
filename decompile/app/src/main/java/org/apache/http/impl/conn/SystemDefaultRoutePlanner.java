package org.apache.http.impl.conn;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class SystemDefaultRoutePlanner extends DefaultRoutePlanner {
    public final ProxySelector proxySelector;

    public SystemDefaultRoutePlanner(SchemePortResolver schemePortResolver, ProxySelector proxySelector) {
        super(schemePortResolver);
        this.proxySelector = proxySelector;
    }

    public SystemDefaultRoutePlanner(ProxySelector proxySelector) {
        this(null, proxySelector);
    }

    @Override // org.apache.http.impl.conn.DefaultRoutePlanner
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        try {
            URI uri = new URI(httpHost.toURI());
            ProxySelector proxySelector = this.proxySelector;
            if (proxySelector == null) {
                proxySelector = ProxySelector.getDefault();
            }
            if (proxySelector == null) {
                return null;
            }
            Proxy proxyChooseProxy = chooseProxy(proxySelector.select(uri));
            if (proxyChooseProxy.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (!(proxyChooseProxy.address() instanceof InetSocketAddress)) {
                throw new HttpException("Unable to handle non-Inet proxy address: " + proxyChooseProxy.address());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyChooseProxy.address();
            return new HttpHost(getHost(inetSocketAddress), inetSocketAddress.getPort());
        } catch (URISyntaxException e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }

    private String getHost(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    public final Proxy chooseProxy(List<Proxy> list) {
        Proxy proxy = null;
        for (int i = 0; proxy == null && i < list.size(); i++) {
            Proxy proxy2 = list.get(i);
            int i2 = C111371.$SwitchMap$java$net$Proxy$Type[proxy2.type().ordinal()];
            if (i2 == 1 || i2 == 2) {
                proxy = proxy2;
            }
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }

    /* renamed from: org.apache.http.impl.conn.SystemDefaultRoutePlanner$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C111371 {
        public static final /* synthetic */ int[] $SwitchMap$java$net$Proxy$Type;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $SwitchMap$java$net$Proxy$Type = iArr;
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$net$Proxy$Type[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$net$Proxy$Type[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
