package org.apache.http.impl.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes5.dex */
public class BasicAuthCache implements AuthCache {
    public final Log log;
    public final Map<HttpHost, byte[]> map;
    public final SchemePortResolver schemePortResolver;

    public BasicAuthCache(SchemePortResolver schemePortResolver) {
        this.log = LogFactory.getLog(getClass());
        this.map = new ConcurrentHashMap();
        this.schemePortResolver = schemePortResolver == null ? DefaultSchemePortResolver.INSTANCE : schemePortResolver;
    }

    public BasicAuthCache() {
        this(null);
    }

    public HttpHost getKey(HttpHost httpHost) {
        if (httpHost.getPort() <= 0) {
            try {
                return new HttpHost(httpHost.getHostName(), this.schemePortResolver.resolve(httpHost), httpHost.getSchemeName());
            } catch (UnsupportedSchemeException unused) {
            }
        }
        return httpHost;
    }

    @Override // org.apache.http.client.AuthCache
    public void put(HttpHost httpHost, AuthScheme authScheme) throws IOException {
        Args.notNull(httpHost, "HTTP host");
        if (authScheme == null) {
            return;
        }
        if (authScheme instanceof Serializable) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(authScheme);
                objectOutputStream.close();
                this.map.put(getKey(httpHost), byteArrayOutputStream.toByteArray());
                return;
            } catch (IOException e) {
                if (this.log.isWarnEnabled()) {
                    this.log.warn("Unexpected I/O error while serializing auth scheme", e);
                    return;
                }
                return;
            }
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Auth scheme " + authScheme.getClass() + " is not serializable");
        }
    }

    @Override // org.apache.http.client.AuthCache
    public AuthScheme get(HttpHost httpHost) throws IOException {
        Args.notNull(httpHost, "HTTP host");
        byte[] bArr = this.map.get(getKey(httpHost));
        if (bArr == null) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            AuthScheme authScheme = (AuthScheme) objectInputStream.readObject();
            objectInputStream.close();
            return authScheme;
        } catch (IOException e) {
            if (!this.log.isWarnEnabled()) {
                return null;
            }
            this.log.warn("Unexpected I/O error while de-serializing auth scheme", e);
            return null;
        } catch (ClassNotFoundException e2) {
            if (!this.log.isWarnEnabled()) {
                return null;
            }
            this.log.warn("Unexpected error while de-serializing auth scheme", e2);
            return null;
        }
    }

    @Override // org.apache.http.client.AuthCache
    public void remove(HttpHost httpHost) {
        Args.notNull(httpHost, "HTTP host");
        this.map.remove(getKey(httpHost));
    }

    @Override // org.apache.http.client.AuthCache
    public void clear() {
        this.map.clear();
    }

    public String toString() {
        return this.map.toString();
    }
}
