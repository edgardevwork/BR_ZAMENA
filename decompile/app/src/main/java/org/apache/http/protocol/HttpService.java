package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpServerConnection;
import org.apache.http.HttpVersion;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.EncodingUtils;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes8.dex */
public class HttpService {
    public volatile ConnectionReuseStrategy connStrategy;
    public volatile HttpExpectationVerifier expectationVerifier;
    public volatile HttpRequestHandlerMapper handlerMapper;
    public volatile HttpParams params;
    public volatile HttpProcessor processor;
    public volatile HttpResponseFactory responseFactory;

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerResolver httpRequestHandlerResolver, HttpExpectationVerifier httpExpectationVerifier, HttpParams httpParams) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, new HttpRequestHandlerResolverAdapter(httpRequestHandlerResolver), httpExpectationVerifier);
        this.params = httpParams;
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerResolver httpRequestHandlerResolver, HttpParams httpParams) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, new HttpRequestHandlerResolverAdapter(httpRequestHandlerResolver), (HttpExpectationVerifier) null);
        this.params = httpParams;
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory) {
        this.params = null;
        this.processor = null;
        this.handlerMapper = null;
        this.connStrategy = null;
        this.responseFactory = null;
        this.expectationVerifier = null;
        setHttpProcessor(httpProcessor);
        setConnReuseStrategy(connectionReuseStrategy);
        setResponseFactory(httpResponseFactory);
    }

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerMapper httpRequestHandlerMapper, HttpExpectationVerifier httpExpectationVerifier) {
        this.params = null;
        this.processor = null;
        this.handlerMapper = null;
        this.connStrategy = null;
        this.responseFactory = null;
        this.expectationVerifier = null;
        this.processor = (HttpProcessor) Args.notNull(httpProcessor, "HTTP processor");
        this.connStrategy = connectionReuseStrategy == null ? DefaultConnectionReuseStrategy.INSTANCE : connectionReuseStrategy;
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.handlerMapper = httpRequestHandlerMapper;
        this.expectationVerifier = httpExpectationVerifier;
    }

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, httpRequestHandlerMapper, (HttpExpectationVerifier) null);
    }

    public HttpService(HttpProcessor httpProcessor, HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this(httpProcessor, (ConnectionReuseStrategy) null, (HttpResponseFactory) null, httpRequestHandlerMapper, (HttpExpectationVerifier) null);
    }

    @Deprecated
    public void setHttpProcessor(HttpProcessor httpProcessor) {
        Args.notNull(httpProcessor, "HTTP processor");
        this.processor = httpProcessor;
    }

    @Deprecated
    public void setConnReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        this.connStrategy = connectionReuseStrategy;
    }

    @Deprecated
    public void setResponseFactory(HttpResponseFactory httpResponseFactory) {
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
    }

    @Deprecated
    public void setParams(HttpParams httpParams) {
        this.params = httpParams;
    }

    @Deprecated
    public void setHandlerResolver(HttpRequestHandlerResolver httpRequestHandlerResolver) {
        this.handlerMapper = new HttpRequestHandlerResolverAdapter(httpRequestHandlerResolver);
    }

    @Deprecated
    public void setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.expectationVerifier = httpExpectationVerifier;
    }

    @Deprecated
    public HttpParams getParams() {
        return this.params;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleRequest(HttpServerConnection httpServerConnection, HttpContext httpContext) throws HttpException, IllegalStateException, IOException {
        HttpRequest httpRequestReceiveRequestHeader;
        HttpException e;
        httpContext.setAttribute("http.connection", httpServerConnection);
        HttpResponse httpResponseNewHttpResponse = null;
        try {
            httpRequestReceiveRequestHeader = httpServerConnection.receiveRequestHeader();
            try {
                if (httpRequestReceiveRequestHeader instanceof HttpEntityEnclosingRequest) {
                    if (((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader).expectContinue()) {
                        HttpResponse httpResponseNewHttpResponse2 = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_1, 100, httpContext);
                        if (this.expectationVerifier != null) {
                            try {
                                this.expectationVerifier.verify(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse2, httpContext);
                            } catch (HttpException e2) {
                                HttpResponse httpResponseNewHttpResponse3 = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpContext);
                                handleException(e2, httpResponseNewHttpResponse3);
                                httpResponseNewHttpResponse2 = httpResponseNewHttpResponse3;
                            }
                        }
                        if (httpResponseNewHttpResponse2.getStatusLine().getStatusCode() < 200) {
                            httpServerConnection.sendResponseHeader(httpResponseNewHttpResponse2);
                            httpServerConnection.flush();
                            httpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader);
                        } else {
                            httpResponseNewHttpResponse = httpResponseNewHttpResponse2;
                        }
                    } else {
                        httpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader);
                    }
                }
                httpContext.setAttribute("http.request", httpRequestReceiveRequestHeader);
                if (httpResponseNewHttpResponse == null) {
                    httpResponseNewHttpResponse = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_1, 200, httpContext);
                    this.processor.process(httpRequestReceiveRequestHeader, httpContext);
                    doService(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse, httpContext);
                }
                if (httpRequestReceiveRequestHeader instanceof HttpEntityEnclosingRequest) {
                    EntityUtils.consume(((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader).getEntity());
                }
            } catch (HttpException e3) {
                e = e3;
                HttpResponse httpResponseNewHttpResponse4 = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpContext);
                handleException(e, httpResponseNewHttpResponse4);
                httpResponseNewHttpResponse = httpResponseNewHttpResponse4;
                httpContext.setAttribute("http.response", httpResponseNewHttpResponse);
                this.processor.process(httpResponseNewHttpResponse, httpContext);
                httpServerConnection.sendResponseHeader(httpResponseNewHttpResponse);
                if (canResponseHaveBody(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse)) {
                }
                httpServerConnection.flush();
                if (this.connStrategy.keepAlive(httpResponseNewHttpResponse, httpContext)) {
                }
            }
        } catch (HttpException e4) {
            httpRequestReceiveRequestHeader = null;
            e = e4;
        }
        httpContext.setAttribute("http.response", httpResponseNewHttpResponse);
        this.processor.process(httpResponseNewHttpResponse, httpContext);
        httpServerConnection.sendResponseHeader(httpResponseNewHttpResponse);
        if (canResponseHaveBody(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse)) {
            httpServerConnection.sendResponseEntity(httpResponseNewHttpResponse);
        }
        httpServerConnection.flush();
        if (this.connStrategy.keepAlive(httpResponseNewHttpResponse, httpContext)) {
            httpServerConnection.close();
        }
    }

    public final boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return ((httpRequest != null && "HEAD".equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) || (statusCode = httpResponse.getStatusLine().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public void handleException(HttpException httpException, HttpResponse httpResponse) throws IllegalStateException {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.setStatusCode(501);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.setStatusCode(505);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.setStatusCode(400);
        } else {
            httpResponse.setStatusCode(500);
        }
        String message = httpException.getMessage();
        if (message == null) {
            message = httpException.toString();
        }
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(EncodingUtils.getAsciiBytes(message));
        byteArrayEntity.setContentType("text/plain; charset=US-ASCII");
        httpResponse.setEntity(byteArrayEntity);
    }

    public void doService(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IllegalStateException, IOException {
        HttpRequestHandler httpRequestHandlerLookup = this.handlerMapper != null ? this.handlerMapper.lookup(httpRequest) : null;
        if (httpRequestHandlerLookup != null) {
            httpRequestHandlerLookup.handle(httpRequest, httpResponse, httpContext);
        } else {
            httpResponse.setStatusCode(501);
        }
    }

    @Deprecated
    public static class HttpRequestHandlerResolverAdapter implements HttpRequestHandlerMapper {
        public final HttpRequestHandlerResolver resolver;

        public HttpRequestHandlerResolverAdapter(HttpRequestHandlerResolver httpRequestHandlerResolver) {
            this.resolver = httpRequestHandlerResolver;
        }

        @Override // org.apache.http.protocol.HttpRequestHandlerMapper
        public HttpRequestHandler lookup(HttpRequest httpRequest) {
            return this.resolver.lookup(httpRequest.getRequestLine().getUri());
        }
    }
}
