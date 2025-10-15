package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes5.dex */
public class BasicClientConnectionManager implements ClientConnectionManager {
    public static final AtomicLong COUNTER = new AtomicLong();
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    public ManagedClientConnectionImpl conn;
    public final ClientConnectionOperator connOperator;
    public final Log log;
    public HttpPoolEntry poolEntry;
    public final SchemeRegistry schemeRegistry;
    public volatile boolean shutdown;

    public BasicClientConnectionManager(SchemeRegistry schemeRegistry) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
    }

    public BasicClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.BasicClientConnectionManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return BasicClientConnectionManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    public final void assertNotShutdown() {
        Asserts.check(!this.shutdown, "Connection manager has been shut down");
    }

    public ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        ManagedClientConnectionImpl managedClientConnectionImpl;
        Args.notNull(httpRoute, "Route");
        synchronized (this) {
            try {
                assertNotShutdown();
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Get connection for route " + httpRoute);
                }
                Asserts.check(this.conn == null, MISUSE_MESSAGE);
                HttpPoolEntry httpPoolEntry = this.poolEntry;
                if (httpPoolEntry != null && !httpPoolEntry.getPlannedRoute().equals(httpRoute)) {
                    this.poolEntry.close();
                    this.poolEntry = null;
                }
                if (this.poolEntry == null) {
                    this.poolEntry = new HttpPoolEntry(this.log, Long.toString(COUNTER.getAndIncrement()), httpRoute, this.connOperator.createConnection(), 0L, TimeUnit.MILLISECONDS);
                }
                if (this.poolEntry.isExpired(System.currentTimeMillis())) {
                    this.poolEntry.close();
                    this.poolEntry.getTracker().reset();
                }
                managedClientConnectionImpl = new ManagedClientConnectionImpl(this, this.connOperator, this.poolEntry);
                this.conn = managedClientConnectionImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return managedClientConnectionImpl;
    }

    public final void shutdownConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.shutdown();
        } catch (IOException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("I/O exception shutting down connection", e);
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        String str;
        Args.check(managedClientConnection instanceof ManagedClientConnectionImpl, "Connection class mismatch, connection not obtained from this manager");
        ManagedClientConnectionImpl managedClientConnectionImpl = (ManagedClientConnectionImpl) managedClientConnection;
        synchronized (managedClientConnectionImpl) {
            try {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Releasing connection " + managedClientConnection);
                }
                if (managedClientConnectionImpl.getPoolEntry() == null) {
                    return;
                }
                Asserts.check(managedClientConnectionImpl.getManager() == this, "Connection not obtained from this manager");
                synchronized (this) {
                    if (this.shutdown) {
                        shutdownConnection(managedClientConnectionImpl);
                        return;
                    }
                    try {
                        if (managedClientConnectionImpl.isOpen() && !managedClientConnectionImpl.isMarkedReusable()) {
                            shutdownConnection(managedClientConnectionImpl);
                        }
                        if (managedClientConnectionImpl.isMarkedReusable()) {
                            this.poolEntry.updateExpiry(j, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                            if (this.log.isDebugEnabled()) {
                                if (j > 0) {
                                    str = "for " + j + " " + timeUnit;
                                } else {
                                    str = "indefinitely";
                                }
                                this.log.debug("Connection can be kept alive " + str);
                            }
                        }
                        managedClientConnectionImpl.detach();
                        this.conn = null;
                        if (this.poolEntry.isClosed()) {
                            this.poolEntry = null;
                        }
                    } catch (Throwable th) {
                        managedClientConnectionImpl.detach();
                        this.conn = null;
                        if (this.poolEntry.isClosed()) {
                            this.poolEntry = null;
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        synchronized (this) {
            try {
                assertNotShutdown();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HttpPoolEntry httpPoolEntry = this.poolEntry;
                if (httpPoolEntry != null && httpPoolEntry.isExpired(jCurrentTimeMillis)) {
                    this.poolEntry.close();
                    this.poolEntry.getTracker().reset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            try {
                assertNotShutdown();
                long millis = timeUnit.toMillis(j);
                if (millis < 0) {
                    millis = 0;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - millis;
                HttpPoolEntry httpPoolEntry = this.poolEntry;
                if (httpPoolEntry != null && httpPoolEntry.getUpdated() <= jCurrentTimeMillis) {
                    this.poolEntry.close();
                    this.poolEntry.getTracker().reset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        synchronized (this) {
            try {
                this.shutdown = true;
                try {
                    HttpPoolEntry httpPoolEntry = this.poolEntry;
                    if (httpPoolEntry != null) {
                        httpPoolEntry.close();
                    }
                } finally {
                    this.poolEntry = null;
                    this.conn = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
