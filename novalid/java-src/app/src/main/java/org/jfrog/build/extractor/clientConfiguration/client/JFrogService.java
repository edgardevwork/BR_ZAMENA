package org.jfrog.build.extractor.clientConfiguration.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.p059io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;

/* loaded from: classes7.dex */
public abstract class JFrogService<TResult> {
    public Header[] headers;
    public final Log log;
    public ObjectMapper mapper;
    public JFrogServiceResponseType responseType;
    public TResult result;
    public int statusCode;

    public abstract HttpRequestBase createRequest() throws IOException;

    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
    }

    public void handleEmptyEntity() throws IOException {
    }

    public abstract void setResponse(InputStream inputStream) throws IOException;

    public JFrogService(Log log) {
        this.log = log;
        this.responseType = JFrogServiceResponseType.OBJECT;
    }

    public JFrogService(Log log, JFrogServiceResponseType jFrogServiceResponseType) {
        this.log = log;
        this.responseType = jFrogServiceResponseType;
    }

    public static void throwException(HttpEntity httpEntity, int i) throws UnsupportedOperationException, IOException {
        if (httpEntity == null) {
            throw new IllegalArgumentException("JFrog service failed. Received " + i);
        }
        InputStream content = httpEntity.getContent();
        try {
            throw new IOException("JFrog service failed. Received " + i + ": " + IOUtils.toString(content, StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (content != null) {
                    try {
                        content.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public ObjectMapper getMapper() {
        if (this.mapper == null) {
            ObjectMapper objectMapperCreateMapper = BuildInfoExtractorUtils.createMapper();
            this.mapper = objectMapperCreateMapper;
            objectMapperCreateMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        }
        return this.mapper;
    }

    public TResult getResult() {
        return this.result;
    }

    public void setResult(TResult tresult) {
        this.result = tresult;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (httpEntity == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }
        throwException(httpEntity, getStatusCode());
    }

    public TResult execute(JFrogHttpClient jFrogHttpClient) throws IOException {
        ensureRequirements(jFrogHttpClient);
        CloseableHttpResponse closeableHttpResponseSendRequest = jFrogHttpClient.sendRequest(createRequest());
        if (closeableHttpResponseSendRequest == null) {
            if (closeableHttpResponseSendRequest == null) {
                return null;
            }
            closeableHttpResponseSendRequest.close();
            return null;
        }
        try {
            HttpEntity entity = closeableHttpResponseSendRequest.getEntity();
            try {
                setStatusCode(closeableHttpResponseSendRequest.getStatusLine().getStatusCode());
                setHeaders(closeableHttpResponseSendRequest.getAllHeaders());
                if (getStatusCode() >= 400) {
                    handleUnsuccessfulResponse(entity);
                } else {
                    processResponse(entity);
                }
                TResult result = getResult();
                if (entity != null) {
                    EntityUtils.consumeQuietly(entity);
                }
                closeableHttpResponseSendRequest.close();
                return result;
            } catch (Throwable th) {
                if (entity != null) {
                    EntityUtils.consumeQuietly(entity);
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    closeableHttpResponseSendRequest.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public final void processResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (this.responseType == JFrogServiceResponseType.EMPTY) {
            return;
        }
        if (httpEntity == null) {
            handleEmptyEntity();
            return;
        }
        InputStream content = httpEntity.getContent();
        try {
            setResponse(content);
            if (content != null) {
                content.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (content != null) {
                    try {
                        content.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public Header[] getHeaders() {
        return this.headers;
    }

    public void setHeaders(Header[] headerArr) {
        this.headers = headerArr;
    }
}
