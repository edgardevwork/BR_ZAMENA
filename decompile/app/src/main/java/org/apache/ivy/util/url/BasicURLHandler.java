package org.apache.ivy.util.url;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.HttpHost;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.url.URLHandler;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class BasicURLHandler extends AbstractURLHandler implements TimeoutConstrainedURLHandler {
    public static final String ACCEPT_HEADER_VALUE = "*/*";
    public static final int BUFFER_SIZE = 65536;

    /* loaded from: classes8.dex */
    public static final class HttpStatus {
        public static final int SC_OK = 200;
        public static final int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public URLHandler.URLInfo getURLInfo(URL url) {
        return getURLInfo(url, (TimeoutConstraint) null);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public URLHandler.URLInfo getURLInfo(URL url, int i) {
        return getURLInfo(url, AbstractURLHandler.createTimeoutConstraints(i));
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public boolean isReachable(URL url, TimeoutConstraint timeoutConstraint) {
        return getURLInfo(url, timeoutConstraint).isReachable();
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public long getContentLength(URL url, TimeoutConstraint timeoutConstraint) {
        return getURLInfo(url, timeoutConstraint).getContentLength();
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public long getLastModified(URL url, TimeoutConstraint timeoutConstraint) {
        return getURLInfo(url, timeoutConstraint).getLastModified();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0072: MOVE (r13 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:27:0x0072 */
    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public URLHandler.URLInfo getURLInfo(URL url, TimeoutConstraint timeoutConstraint) throws Throwable {
        URLConnection uRLConnection;
        IOException e;
        UnknownHostException e2;
        URLConnection uRLConnection2;
        URL urlNormalizeToURL;
        if (HttpHost.DEFAULT_SCHEME_NAME.equals(url.getProtocol()) || "https".equals(url.getProtocol())) {
            IvyAuthenticator.install();
        }
        int readTimeout = 0;
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        if (timeoutConstraint != null && timeoutConstraint.getReadTimeout() >= 0) {
            readTimeout = timeoutConstraint.getReadTimeout();
        }
        URLConnection uRLConnection3 = null;
        try {
            try {
                urlNormalizeToURL = normalizeToURL(url);
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(urlNormalizeToURL.openConnection());
            } catch (UnknownHostException e3) {
                uRLConnection = null;
                e2 = e3;
            } catch (IOException e4) {
                uRLConnection = null;
                e = e4;
            } catch (Throwable th) {
                th = th;
                disconnect(uRLConnection3);
                throw th;
            }
            try {
                uRLConnection.setConnectTimeout(connectionTimeout);
                uRLConnection.setReadTimeout(readTimeout);
                uRLConnection.setRequestProperty("User-Agent", getUserAgent());
                uRLConnection.setRequestProperty("Accept", ACCEPT_HEADER_VALUE);
            } catch (UnknownHostException e5) {
                e2 = e5;
                Message.warn("Host " + e2.getMessage() + " not found. url=" + url);
                Message.info("You probably access the destination server through a proxy server that is not well configured.");
                disconnect(uRLConnection);
                return URLHandler.UNAVAILABLE;
            } catch (IOException e6) {
                e = e6;
                Message.error("Server access error at url " + url, e);
                disconnect(uRLConnection);
                return URLHandler.UNAVAILABLE;
            }
            if (!(uRLConnection instanceof HttpURLConnection)) {
                int contentLength = uRLConnection.getContentLength();
                if (contentLength <= 0) {
                    URLHandler.URLInfo uRLInfo = URLHandler.UNAVAILABLE;
                    disconnect(uRLConnection);
                    return uRLInfo;
                }
                URLHandler.URLInfo uRLInfo2 = new URLHandler.URLInfo(true, contentLength, uRLConnection.getLastModified(), getCharSetFromContentType(uRLConnection.getContentType()));
                disconnect(uRLConnection);
                return uRLInfo2;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if (getRequestMethod() == 2) {
                httpURLConnection.setRequestMethod("HEAD");
            }
            if (checkStatusCode(urlNormalizeToURL, httpURLConnection)) {
                URLHandler.URLInfo uRLInfo3 = new URLHandler.URLInfo(true, httpURLConnection.getContentLength(), uRLConnection.getLastModified(), getCharSetFromContentType(uRLConnection.getContentType()));
                disconnect(uRLConnection);
                return uRLInfo3;
            }
            disconnect(uRLConnection);
            return URLHandler.UNAVAILABLE;
        } catch (Throwable th2) {
            th = th2;
            uRLConnection3 = uRLConnection2;
            disconnect(uRLConnection3);
            throw th;
        }
    }

    public static String getCharSetFromContentType(String str) {
        String strSubstring = null;
        if (str != null) {
            for (String str2 : str.split(PropertiesParser.PROPS_SEPARATOR)) {
                String strTrim = str2.trim();
                if (strTrim.toLowerCase().startsWith("charset=")) {
                    strSubstring = strTrim.substring(8);
                }
            }
        }
        return (strSubstring == null || strSubstring.length() == 0) ? "ISO-8859-1" : strSubstring;
    }

    public final boolean checkStatusCode(URL url, HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return true;
        }
        if ("HEAD".equals(httpURLConnection.getRequestMethod()) && responseCode == 204) {
            return true;
        }
        Message.debug("HTTP response status: " + responseCode + " url=" + url);
        if (responseCode == 407) {
            Message.warn("Your proxy requires authentication.");
            return false;
        }
        if (String.valueOf(responseCode).startsWith("4")) {
            Message.verbose("CLIENT ERROR: " + httpURLConnection.getResponseMessage() + " url=" + url);
            return false;
        }
        if (!String.valueOf(responseCode).startsWith(YouTubePlayerBridge.ERROR_HTML_5_PLAYER)) {
            return false;
        }
        Message.error("SERVER ERROR: " + httpURLConnection.getResponseMessage() + " url=" + url);
        return false;
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public InputStream openStream(URL url) throws IOException {
        return openStream(url, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public InputStream openStream(URL url, TimeoutConstraint timeoutConstraint) throws Throwable {
        URL urlNormalizeToURL;
        URLConnection uRLConnection;
        if (HttpHost.DEFAULT_SCHEME_NAME.equals(url.getProtocol()) || "https".equals(url.getProtocol())) {
            IvyAuthenticator.install();
        }
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        int readTimeout = (timeoutConstraint == null || timeoutConstraint.getReadTimeout() < 0) ? 0 : timeoutConstraint.getReadTimeout();
        URLConnection uRLConnection2 = null;
        try {
            urlNormalizeToURL = normalizeToURL(url);
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(urlNormalizeToURL.openConnection());
        } catch (Throwable th) {
            th = th;
        }
        try {
            uRLConnection.setConnectTimeout(connectionTimeout);
            uRLConnection.setReadTimeout(readTimeout);
            uRLConnection.setRequestProperty("User-Agent", getUserAgent());
            uRLConnection.setRequestProperty("Accept", ACCEPT_HEADER_VALUE);
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip,deflate");
            if ((uRLConnection instanceof HttpURLConnection) && !checkStatusCode(urlNormalizeToURL, (HttpURLConnection) uRLConnection)) {
                throw new IOException("The HTTP response code for " + urlNormalizeToURL + " did not indicate a success. See log for more detail.");
            }
            InputStream decodingInputStream = getDecodingInputStream(uRLConnection.getContentEncoding(), uRLConnection.getInputStream());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[65536];
            while (true) {
                int i = decodingInputStream.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    disconnect(uRLConnection);
                    return byteArrayInputStream;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            uRLConnection2 = uRLConnection;
            disconnect(uRLConnection2);
            throw th;
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void download(URL url, File file, CopyProgressListener copyProgressListener) throws Throwable {
        download(url, file, copyProgressListener, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public void download(URL url, File file, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws Throwable {
        if (HttpHost.DEFAULT_SCHEME_NAME.equals(url.getProtocol()) || "https".equals(url.getProtocol())) {
            IvyAuthenticator.install();
        }
        int readTimeout = 0;
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        if (timeoutConstraint != null && timeoutConstraint.getReadTimeout() >= 0) {
            readTimeout = timeoutConstraint.getReadTimeout();
        }
        URLConnection uRLConnection = null;
        try {
            URL urlNormalizeToURL = normalizeToURL(url);
            URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(urlNormalizeToURL.openConnection());
            try {
                uRLConnection2.setConnectTimeout(connectionTimeout);
                uRLConnection2.setReadTimeout(readTimeout);
                uRLConnection2.setRequestProperty("User-Agent", getUserAgent());
                uRLConnection2.setRequestProperty("Accept", ACCEPT_HEADER_VALUE);
                uRLConnection2.setRequestProperty("Accept-Encoding", "gzip,deflate");
                if ((uRLConnection2 instanceof HttpURLConnection) && !checkStatusCode(urlNormalizeToURL, (HttpURLConnection) uRLConnection2)) {
                    throw new IOException("The HTTP response code for " + urlNormalizeToURL + " did not indicate a success. See log for more detail.");
                }
                FileUtil.copy(getDecodingInputStream(uRLConnection2.getContentEncoding(), uRLConnection2.getInputStream()), file, copyProgressListener);
                if (uRLConnection2.getContentEncoding() == null) {
                    int contentLength = uRLConnection2.getContentLength();
                    long length = file.length();
                    if (contentLength != -1 && length != contentLength) {
                        file.delete();
                        throw new IOException("Downloaded file size (" + length + ") doesn't match expected Content Length (" + contentLength + ") for " + urlNormalizeToURL + ". Please retry.");
                    }
                }
                long lastModified = uRLConnection2.getLastModified();
                if (lastModified > 0) {
                    file.setLastModified(lastModified);
                }
                disconnect(uRLConnection2);
            } catch (Throwable th) {
                th = th;
                uRLConnection = uRLConnection2;
                disconnect(uRLConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void upload(File file, URL url, CopyProgressListener copyProgressListener) throws Throwable {
        upload(file, url, copyProgressListener, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public void upload(File file, URL url, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws Throwable {
        if (!HttpHost.DEFAULT_SCHEME_NAME.equals(url.getProtocol()) && !"https".equals(url.getProtocol())) {
            throw new UnsupportedOperationException("URL repository only support HTTP PUT at the moment");
        }
        IvyAuthenticator.install();
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        URLConnection uRLConnection = null;
        try {
            URL urlNormalizeToURL = normalizeToURL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(urlNormalizeToURL.openConnection()));
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setConnectTimeout(connectionTimeout);
                httpURLConnection.setRequestMethod("PUT");
                httpURLConnection.setRequestProperty("User-Agent", getUserAgent());
                httpURLConnection.setRequestProperty("Content-type", "application/octet-stream");
                httpURLConnection.setRequestProperty("Content-length", Long.toString(file.length()));
                httpURLConnection.setInstanceFollowRedirects(true);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileUtil.copy(fileInputStream, httpURLConnection.getOutputStream(), copyProgressListener);
                    fileInputStream.close();
                    validatePutStatusCode(urlNormalizeToURL, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
                    disconnect(httpURLConnection);
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                uRLConnection = httpURLConnection;
                disconnect(uRLConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void disconnect(URLConnection uRLConnection) throws IOException {
        if (uRLConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if (!"HEAD".equals(httpURLConnection.getRequestMethod())) {
                readResponseBody(httpURLConnection);
            }
            httpURLConnection.disconnect();
            return;
        }
        if (uRLConnection != null) {
            try {
                uRLConnection.getInputStream().close();
            } catch (IOException unused) {
            }
        }
    }

    public final void readResponseBody(HttpURLConnection httpURLConnection) throws IOException {
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            do {
                try {
                } finally {
                }
            } while (inputStream.read(bArr) > 0);
            inputStream.close();
        } catch (IOException unused) {
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            do {
                try {
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    try {
                        errorStream.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            } while (errorStream.read(bArr) > 0);
            try {
                errorStream.close();
            } catch (IOException unused4) {
            }
        }
    }
}
