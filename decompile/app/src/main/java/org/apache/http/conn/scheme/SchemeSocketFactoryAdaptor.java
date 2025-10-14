package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes5.dex */
public class SchemeSocketFactoryAdaptor implements SchemeSocketFactory {
    public final SocketFactory factory;

    public SchemeSocketFactoryAdaptor(SocketFactory socketFactory) {
        this.factory = socketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) throws IOException {
        InetAddress address;
        int port;
        String hostName = inetSocketAddress.getHostName();
        int port2 = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            address = inetSocketAddress2.getAddress();
            port = inetSocketAddress2.getPort();
        } else {
            address = null;
            port = 0;
        }
        return this.factory.connectSocket(socket, hostName, port2, address, port, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) throws IOException {
        return this.factory.createSocket();
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        return this.factory.isSecure(socket);
    }

    public SocketFactory getFactory() {
        return this.factory;
    }

    public boolean equals(Object obj) {
        SocketFactory socketFactory;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SchemeSocketFactoryAdaptor) {
            socketFactory = this.factory;
            obj = ((SchemeSocketFactoryAdaptor) obj).factory;
        } else {
            socketFactory = this.factory;
        }
        return socketFactory.equals(obj);
    }

    public int hashCode() {
        return this.factory.hashCode();
    }
}
