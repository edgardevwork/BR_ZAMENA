package org.apache.ivy.util.url;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.http.HttpHost;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.settings.TimeoutConstraint;

/* loaded from: classes5.dex */
public abstract class AbstractURLHandler implements URLHandler {
    public static final Pattern ESCAPE_PATTERN = Pattern.compile("%25([0-9a-fA-F][0-9a-fA-F])");
    public static int requestMethod = 2;

    @Override // org.apache.ivy.util.url.URLHandler
    public boolean isReachable(URL url) {
        return getURLInfo(url).isReachable();
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public boolean isReachable(URL url, int i) {
        return getURLInfo(url, i).isReachable();
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getContentLength(URL url) {
        return getURLInfo(url).getContentLength();
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getContentLength(URL url, int i) {
        return getURLInfo(url, i).getContentLength();
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getLastModified(URL url) {
        return getURLInfo(url).getLastModified();
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getLastModified(URL url, int i) {
        return getURLInfo(url, i).getLastModified();
    }

    public String getUserAgent() {
        return System.getProperty("http.agent", "Apache Ivy/" + Ivy.getIvyVersion());
    }

    public void validatePutStatusCode(URL url, int i, String str) throws IOException {
        if (i != 204) {
            String str2 = "";
            if (i == 401 || i == 403) {
                StringBuilder sb = new StringBuilder();
                sb.append("Access to URL ");
                sb.append(url);
                sb.append(" was refused by the server");
                if (str != null) {
                    str2 = ": " + str;
                }
                sb.append(str2);
                throw new IOException(sb.toString());
            }
            switch (i) {
                case 200:
                case 201:
                case 202:
                    return;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PUT operation to URL ");
                    sb2.append(url);
                    sb2.append(" failed with status code ");
                    sb2.append(i);
                    if (str != null) {
                        str2 = ": " + str;
                    }
                    sb2.append(str2);
                    throw new IOException(sb2.toString());
            }
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void setRequestMethod(int i) {
        requestMethod = i;
    }

    public int getRequestMethod() {
        return requestMethod;
    }

    public String normalizeToString(URL url) throws IOException {
        if (!HttpHost.DEFAULT_SCHEME_NAME.equals(url.getProtocol()) && !"https".equals(url.getProtocol())) {
            return url.toExternalForm();
        }
        try {
            return ESCAPE_PATTERN.matcher(new URI(url.getProtocol(), url.getAuthority(), url.getPath(), url.getQuery(), url.getRef()).normalize().toASCIIString().replaceAll("\\+", "%2B")).replaceAll("%$1");
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException("Couldn't convert '" + url.toString() + "' to a valid URI");
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    public URL normalizeToURL(URL url) throws IOException {
        return (HttpHost.DEFAULT_SCHEME_NAME.equals(url.getProtocol()) || "https".equals(url.getProtocol())) ? new URL(normalizeToString(url)) : url;
    }

    public InputStream getDecodingInputStream(String str, InputStream inputStream) throws IOException {
        InflaterInputStream inflaterInputStream;
        if (str == null) {
            return inputStream;
        }
        switch (str) {
            case "x-gzip":
            case "gzip":
                return new GZIPInputStream(inputStream);
            case "deflate":
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedInputStream.mark(100);
                byte[] bArr = new byte[100];
                int i = bufferedInputStream.read(bArr);
                bufferedInputStream.reset();
                Inflater inflater = new Inflater();
                inflater.setInput(bArr, 0, i);
                try {
                    try {
                        inflater.inflate(new byte[1000]);
                        inflaterInputStream = new InflaterInputStream(bufferedInputStream);
                    } catch (DataFormatException unused) {
                        inflaterInputStream = new InflaterInputStream(bufferedInputStream, new Inflater(true));
                    }
                    return inflaterInputStream;
                } finally {
                    inflater.end();
                }
            default:
                return inputStream;
        }
    }

    /* renamed from: org.apache.ivy.util.url.AbstractURLHandler$1 */
    public class C112711 implements TimeoutConstraint {
        public final /* synthetic */ int val$connectionTimeout;

        @Override // org.apache.ivy.core.settings.TimeoutConstraint
        public int getReadTimeout() {
            return -1;
        }

        public C112711(int i) {
            i = i;
        }

        @Override // org.apache.ivy.core.settings.TimeoutConstraint
        public int getConnectionTimeout() {
            return i;
        }
    }

    public static TimeoutConstraint createTimeoutConstraints(int i) {
        return new TimeoutConstraint() { // from class: org.apache.ivy.util.url.AbstractURLHandler.1
            public final /* synthetic */ int val$connectionTimeout;

            @Override // org.apache.ivy.core.settings.TimeoutConstraint
            public int getReadTimeout() {
                return -1;
            }

            public C112711(int i2) {
                i = i2;
            }

            @Override // org.apache.ivy.core.settings.TimeoutConstraint
            public int getConnectionTimeout() {
                return i;
            }
        };
    }
}
