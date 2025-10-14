package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.logging.Log;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.p061io.HttpMessageParserFactory;
import org.apache.http.p061io.HttpMessageWriterFactory;

/* loaded from: classes7.dex */
public class LoggingManagedHttpClientConnection extends DefaultManagedHttpClientConnection {
    public final Log headerLog;
    public final Log log;
    public final Wire wire;

    public LoggingManagedHttpClientConnection(String str, Log log, Log log2, Log log3, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(str, i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.log = log;
        this.headerLog = log2;
        this.wire = new Wire(log3, str);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (super.isOpen()) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(getId() + ": Close connection");
            }
            super.close();
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void setSocketTimeout(int i) throws SocketException {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getId() + ": set socket timeout to " + i);
        }
        super.setSocketTimeout(i);
    }

    @Override // org.apache.http.impl.conn.DefaultManagedHttpClientConnection, org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getId() + ": Shutdown connection");
        }
        super.shutdown();
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public InputStream getSocketInputStream(Socket socket) throws IOException {
        InputStream socketInputStream = super.getSocketInputStream(socket);
        return this.wire.enabled() ? new LoggingInputStream(socketInputStream, this.wire) : socketInputStream;
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public OutputStream getSocketOutputStream(Socket socket) throws IOException {
        OutputStream socketOutputStream = super.getSocketOutputStream(socket);
        return this.wire.enabled() ? new LoggingOutputStream(socketOutputStream, this.wire) : socketOutputStream;
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onResponseReceived(HttpResponse httpResponse) {
        if (httpResponse == null || !this.headerLog.isDebugEnabled()) {
            return;
        }
        this.headerLog.debug(getId() + " << " + httpResponse.getStatusLine().toString());
        for (Header header : httpResponse.getAllHeaders()) {
            this.headerLog.debug(getId() + " << " + header.toString());
        }
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onRequestSubmitted(HttpRequest httpRequest) {
        if (httpRequest == null || !this.headerLog.isDebugEnabled()) {
            return;
        }
        this.headerLog.debug(getId() + " >> " + httpRequest.getRequestLine().toString());
        for (Header header : httpRequest.getAllHeaders()) {
            this.headerLog.debug(getId() + " >> " + header.toString());
        }
    }
}
