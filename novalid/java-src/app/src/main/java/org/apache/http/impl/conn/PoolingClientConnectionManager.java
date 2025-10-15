package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes8.dex */
public class PoolingClientConnectionManager implements ClientConnectionManager, ConnPoolControl<HttpRoute> {
    public final DnsResolver dnsResolver;
    public final Log log;
    public final ClientConnectionOperator operator;
    public final HttpConnPool pool;
    public final SchemeRegistry schemeRegistry;

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS);
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS, dnsResolver);
    }

    public PoolingClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit) {
        this(schemeRegistry, j, timeUnit, new SystemDefaultDnsResolver());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit, DnsResolver dnsResolver) throws LogConfigurationException {
        Log log = LogFactory.getLog(getClass());
        this.log = log;
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = dnsResolver;
        ClientConnectionOperator clientConnectionOperatorCreateConnectionOperator = createConnectionOperator(schemeRegistry);
        this.operator = clientConnectionOperatorCreateConnectionOperator;
        this.pool = new HttpConnPool(log, clientConnectionOperatorCreateConnectionOperator, 2, 20, j, timeUnit);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry, this.dnsResolver);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    public final String format(HttpRoute httpRoute, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("[route: ");
        sb.append(httpRoute);
        sb.append("]");
        if (obj != null) {
            sb.append("[state: ");
            sb.append(obj);
            sb.append("]");
        }
        return sb.toString();
    }

    public final String formatStats(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        PoolStats totalStats = this.pool.getTotalStats();
        PoolStats stats = this.pool.getStats(httpRoute);
        sb.append("[total kept alive: ");
        sb.append(totalStats.getAvailable());
        sb.append("; ");
        sb.append("route allocated: ");
        sb.append(stats.getLeased() + stats.getAvailable());
        sb.append(" of ");
        sb.append(stats.getMax());
        sb.append("; ");
        sb.append("total allocated: ");
        sb.append(totalStats.getLeased() + totalStats.getAvailable());
        sb.append(" of ");
        sb.append(totalStats.getMax());
        sb.append("]");
        return sb.toString();
    }

    public final String format(HttpPoolEntry httpPoolEntry) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ");
        sb.append(httpPoolEntry.getId());
        sb.append("]");
        sb.append("[route: ");
        sb.append(httpPoolEntry.getRoute());
        sb.append("]");
        Object state = httpPoolEntry.getState();
        if (state != null) {
            sb.append("[state: ");
            sb.append(state);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connection request: " + format(httpRoute, obj) + formatStats(httpRoute));
        }
        final Future<HttpPoolEntry> futureLease = this.pool.lease(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.PoolingClientConnectionManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                futureLease.cancel(true);
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return PoolingClientConnectionManager.this.leaseConnection(futureLease, j, timeUnit);
            }
        };
    }

    public ManagedClientConnection leaseConnection(Future<HttpPoolEntry> future, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, ConnectionPoolTimeoutException, TimeoutException {
        try {
            HttpPoolEntry httpPoolEntry = future.get(j, timeUnit);
            if (httpPoolEntry == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            Asserts.check(httpPoolEntry.getConnection() != null, "Pool entry with no connection");
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection leased: " + format(httpPoolEntry) + formatStats(httpPoolEntry.getRoute()));
            }
            return new ManagedClientConnectionImpl(this, this.operator, httpPoolEntry);
        } catch (ExecutionException e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            this.log.error("Unexpected exception leasing connection from pool", e);
            throw new InterruptedException();
        } catch (TimeoutException unused) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x0020, TryCatch #0 {, blocks: (B:8:0x0018, B:10:0x001e, B:38:0x00a1, B:40:0x00b2, B:41:0x00d9, B:43:0x00db, B:44:0x00e4, B:14:0x0023, B:16:0x0029, B:18:0x002f, B:23:0x0037, B:25:0x003f, B:26:0x0046, B:31:0x0052, B:35:0x0063, B:37:0x007f, B:30:0x0050), top: B:47:0x0018, inners: #1 }] */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        String str;
        Args.check(managedClientConnection instanceof ManagedClientConnectionImpl, "Connection class mismatch, connection not obtained from this manager");
        ManagedClientConnectionImpl managedClientConnectionImpl = (ManagedClientConnectionImpl) managedClientConnection;
        Asserts.check(managedClientConnectionImpl.getManager() == this, "Connection not obtained from this manager");
        synchronized (managedClientConnectionImpl) {
            HttpPoolEntry httpPoolEntryDetach = managedClientConnectionImpl.detach();
            if (httpPoolEntryDetach == null) {
                return;
            }
            try {
                if (managedClientConnectionImpl.isOpen() && !managedClientConnectionImpl.isMarkedReusable()) {
                    try {
                        managedClientConnectionImpl.shutdown();
                    } catch (IOException e) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("I/O exception shutting down released connection", e);
                        }
                    }
                    if (managedClientConnectionImpl.isMarkedReusable()) {
                    }
                    this.pool.release((HttpConnPool) httpPoolEntryDetach, managedClientConnectionImpl.isMarkedReusable());
                    if (this.log.isDebugEnabled()) {
                    }
                    return;
                }
                if (managedClientConnectionImpl.isMarkedReusable()) {
                    httpPoolEntryDetach.updateExpiry(j, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                    if (this.log.isDebugEnabled()) {
                        if (j > 0) {
                            str = "for " + j + " " + timeUnit;
                        } else {
                            str = "indefinitely";
                        }
                        this.log.debug("Connection " + format(httpPoolEntryDetach) + " can be kept alive " + str);
                    }
                }
                this.pool.release((HttpConnPool) httpPoolEntryDetach, managedClientConnectionImpl.isMarkedReusable());
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Connection released: " + format(httpPoolEntryDetach) + formatStats(httpPoolEntryDetach.getRoute()));
                }
                return;
            } catch (Throwable th) {
                this.pool.release((HttpConnPool) httpPoolEntryDetach, managedClientConnectionImpl.isMarkedReusable());
                throw th;
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.log.debug("Connection manager is shutting down");
        try {
            this.pool.shutdown();
        } catch (IOException e) {
            this.log.debug("I/O exception shutting down connection manager", e);
        }
        this.log.debug("Connection manager shut down");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j + " " + timeUnit);
        }
        this.pool.closeIdle(j, timeUnit);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpired();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.pool.getMaxTotal();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i) {
        this.pool.setMaxTotal(i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.pool.getDefaultMaxPerRoute();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i) {
        this.pool.setDefaultMaxPerRoute(i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.pool.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i) {
        this.pool.setMaxPerRoute(httpRoute, i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.pool.getTotalStats();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.pool.getStats(httpRoute);
    }
}
