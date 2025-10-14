package org.apache.ivy.util.url;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.url.URLHandler;

/* loaded from: classes5.dex */
public class URLHandlerDispatcher implements TimeoutConstrainedURLHandler {
    public final Map<String, URLHandler> handlers = new HashMap();
    public URLHandler defaultHandler = new BasicURLHandler();

    @Override // org.apache.ivy.util.url.URLHandler
    public boolean isReachable(URL url) {
        return isReachable(url, (TimeoutConstraint) null);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public boolean isReachable(URL url, int i) {
        return isReachable(url, createTimeoutConstraints(i));
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public boolean isReachable(URL url, TimeoutConstraint timeoutConstraint) {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            return ((TimeoutConstrainedURLHandler) handler).isReachable(url, timeoutConstraint);
        }
        return handler.isReachable(url, timeoutConstraint != null ? timeoutConstraint.getConnectionTimeout() : 0);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getContentLength(URL url) {
        return getContentLength(url, (TimeoutConstraint) null);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getContentLength(URL url, int i) {
        return getContentLength(url, createTimeoutConstraints(i));
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public long getContentLength(URL url, TimeoutConstraint timeoutConstraint) {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            return ((TimeoutConstrainedURLHandler) handler).getContentLength(url, timeoutConstraint);
        }
        return handler.getContentLength(url, timeoutConstraint != null ? timeoutConstraint.getConnectionTimeout() : 0);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getLastModified(URL url) {
        return getLastModified(url, (TimeoutConstraint) null);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public long getLastModified(URL url, int i) {
        return getLastModified(url, createTimeoutConstraints(i));
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public long getLastModified(URL url, TimeoutConstraint timeoutConstraint) {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            return ((TimeoutConstrainedURLHandler) handler).getLastModified(url, timeoutConstraint);
        }
        return handler.getLastModified(url, timeoutConstraint != null ? timeoutConstraint.getConnectionTimeout() : 0);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public URLHandler.URLInfo getURLInfo(URL url) {
        return getURLInfo(url, (TimeoutConstraint) null);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public URLHandler.URLInfo getURLInfo(URL url, int i) {
        return getURLInfo(url, createTimeoutConstraints(i));
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public URLHandler.URLInfo getURLInfo(URL url, TimeoutConstraint timeoutConstraint) {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            return ((TimeoutConstrainedURLHandler) handler).getURLInfo(url, timeoutConstraint);
        }
        return handler.getURLInfo(url, timeoutConstraint != null ? timeoutConstraint.getConnectionTimeout() : 0);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public InputStream openStream(URL url) throws IOException {
        return openStream(url, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public InputStream openStream(URL url, TimeoutConstraint timeoutConstraint) throws IOException {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            return ((TimeoutConstrainedURLHandler) handler).openStream(url, timeoutConstraint);
        }
        return handler.openStream(url);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void download(URL url, File file, CopyProgressListener copyProgressListener) throws IOException {
        download(url, file, copyProgressListener, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public void download(URL url, File file, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            ((TimeoutConstrainedURLHandler) handler).download(url, file, copyProgressListener, timeoutConstraint);
        } else {
            handler.download(url, file, copyProgressListener);
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void upload(File file, URL url, CopyProgressListener copyProgressListener) throws IOException {
        upload(file, url, copyProgressListener, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public void upload(File file, URL url, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException {
        URLHandler handler = getHandler(url.getProtocol());
        if (handler instanceof TimeoutConstrainedURLHandler) {
            ((TimeoutConstrainedURLHandler) handler).upload(file, url, copyProgressListener, timeoutConstraint);
        } else {
            handler.upload(file, url, copyProgressListener);
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void setRequestMethod(int i) {
        this.defaultHandler.setRequestMethod(i);
        Iterator<URLHandler> it = this.handlers.values().iterator();
        while (it.hasNext()) {
            it.next().setRequestMethod(i);
        }
    }

    public void setDownloader(String str, URLHandler uRLHandler) {
        this.handlers.put(str, uRLHandler);
    }

    public URLHandler getHandler(String str) {
        URLHandler uRLHandler = this.handlers.get(str);
        return uRLHandler == null ? this.defaultHandler : uRLHandler;
    }

    public URLHandler getDefault() {
        return this.defaultHandler;
    }

    public void setDefault(URLHandler uRLHandler) {
        this.defaultHandler = uRLHandler;
    }

    private static TimeoutConstraint createTimeoutConstraints(final int i) {
        return new TimeoutConstraint() { // from class: org.apache.ivy.util.url.URLHandlerDispatcher.1
            @Override // org.apache.ivy.core.settings.TimeoutConstraint
            public int getReadTimeout() {
                return -1;
            }

            @Override // org.apache.ivy.core.settings.TimeoutConstraint
            public int getConnectionTimeout() {
                return i;
            }
        };
    }
}
