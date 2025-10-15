package org.apache.http.conn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class HttpInetSocketAddress extends InetSocketAddress {
    public static final long serialVersionUID = -6650701828361907957L;
    public final HttpHost httphost;

    public HttpInetSocketAddress(HttpHost httpHost, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        Args.notNull(httpHost, "HTTP host");
        this.httphost = httpHost;
    }

    public HttpHost getHttpHost() {
        return this.httphost;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.httphost.getHostName() + StringUtils.PROCESS_POSTFIX_DELIMITER + getPort();
    }
}
