package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.pool.PoolEntry;

@Deprecated
/* loaded from: classes8.dex */
public class HttpPoolEntry extends PoolEntry<HttpRoute, OperatedClientConnection> {
    public final Log log;
    public final RouteTracker tracker;

    public HttpPoolEntry(Log log, String str, HttpRoute httpRoute, OperatedClientConnection operatedClientConnection, long j, TimeUnit timeUnit) {
        super(str, httpRoute, operatedClientConnection, j, timeUnit);
        this.log = log;
        this.tracker = new RouteTracker(httpRoute);
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isExpired(long j) {
        boolean zIsExpired = super.isExpired(j);
        if (zIsExpired && this.log.isDebugEnabled()) {
            this.log.debug("Connection " + this + " expired @ " + new Date(getExpiry()));
        }
        return zIsExpired;
    }

    public RouteTracker getTracker() {
        return this.tracker;
    }

    public HttpRoute getPlannedRoute() {
        return getRoute();
    }

    public HttpRoute getEffectiveRoute() {
        return this.tracker.toRoute();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isClosed() {
        return !getConnection().isOpen();
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            getConnection().close();
        } catch (IOException e) {
            this.log.debug("I/O error closing connection", e);
        }
    }
}
