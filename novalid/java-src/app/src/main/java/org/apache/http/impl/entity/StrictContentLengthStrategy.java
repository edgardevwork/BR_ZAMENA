package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes8.dex */
public class StrictContentLengthStrategy implements ContentLengthStrategy {
    public static final StrictContentLengthStrategy INSTANCE = new StrictContentLengthStrategy();
    public final int implicitLen;

    public StrictContentLengthStrategy(int i) {
        this.implicitLen = i;
    }

    public StrictContentLengthStrategy() {
        this(-1);
    }

    @Override // org.apache.http.entity.ContentLengthStrategy
    public long determineLength(HttpMessage httpMessage) throws HttpException, NumberFormatException {
        Args.notNull(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (HTTP.CHUNK_CODING.equalsIgnoreCase(value)) {
                if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    return -2L;
                }
                throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
            }
            if (HTTP.IDENTITY_CODING.equalsIgnoreCase(value)) {
                return -1L;
            }
            throw new ProtocolException("Unsupported transfer encoding: " + value);
        }
        Header firstHeader2 = httpMessage.getFirstHeader("Content-Length");
        if (firstHeader2 != null) {
            String value2 = firstHeader2.getValue();
            try {
                long j = Long.parseLong(value2);
                if (j >= 0) {
                    return j;
                }
                throw new ProtocolException("Negative content length: " + value2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Invalid content length: " + value2);
            }
        }
        return this.implicitLen;
    }
}
