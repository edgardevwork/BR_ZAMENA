package org.apache.http.impl.client;

import org.apache.http.conn.routing.HttpRoute;

@Deprecated
/* loaded from: classes8.dex */
public class RoutedRequest {
    public final RequestWrapper request;
    public final HttpRoute route;

    public RoutedRequest(RequestWrapper requestWrapper, HttpRoute httpRoute) {
        this.request = requestWrapper;
        this.route = httpRoute;
    }

    public final RequestWrapper getRequest() {
        return this.request;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }
}
