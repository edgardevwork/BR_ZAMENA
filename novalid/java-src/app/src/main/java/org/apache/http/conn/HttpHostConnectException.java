package org.apache.http.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.util.Arrays;
import org.apache.http.HttpHost;

/* loaded from: classes6.dex */
public class HttpHostConnectException extends ConnectException {
    public static final long serialVersionUID = -3194482710275220224L;
    public final HttpHost host;

    @Deprecated
    public HttpHostConnectException(HttpHost httpHost, ConnectException connectException) {
        this(connectException, httpHost, null);
    }

    public HttpHostConnectException(IOException iOException, HttpHost httpHost, InetAddress... inetAddressArr) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Connect to ");
        sb.append(httpHost != null ? httpHost.toHostString() : "remote host");
        if (inetAddressArr == null || inetAddressArr.length <= 0) {
            str = "";
        } else {
            str = " " + Arrays.asList(inetAddressArr);
        }
        sb.append(str);
        if (iOException == null || iOException.getMessage() == null) {
            str2 = " refused";
        } else {
            str2 = " failed: " + iOException.getMessage();
        }
        sb.append(str2);
        super(sb.toString());
        this.host = httpHost;
        initCause(iOException);
    }

    public HttpHost getHost() {
        return this.host;
    }
}
