package org.apache.ivy.plugins.repository.url;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.repository.LocalizableResource;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.url.TimeoutConstrainedURLHandler;
import org.apache.ivy.util.url.URLHandler;
import org.apache.ivy.util.url.URLHandlerRegistry;

/* loaded from: classes5.dex */
public class URLResource implements LocalizableResource {
    public long contentLength;
    public boolean exists;
    public boolean init;
    public long lastModified;
    public final TimeoutConstraint timeoutConstraint;
    public final URL url;

    public URLResource(URL url) {
        this(url, null);
    }

    public URLResource(URL url, TimeoutConstraint timeoutConstraint) {
        this.init = false;
        this.url = url;
        this.timeoutConstraint = timeoutConstraint;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.url.toExternalForm();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        try {
            return new URLResource(new URL(str));
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException("bad clone name provided: not suitable for an URLResource: " + str);
        }
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        if (!this.init) {
            init();
        }
        return this.lastModified;
    }

    private void init() {
        URLHandler.URLInfo uRLInfo;
        URLHandler uRLHandler = URLHandlerRegistry.getDefault();
        if (uRLHandler instanceof TimeoutConstrainedURLHandler) {
            uRLInfo = ((TimeoutConstrainedURLHandler) uRLHandler).getURLInfo(this.url, this.timeoutConstraint);
        } else {
            uRLInfo = uRLHandler.getURLInfo(this.url);
        }
        this.contentLength = uRLInfo.getContentLength();
        this.lastModified = uRLInfo.getLastModified();
        this.exists = uRLInfo.isReachable();
        this.init = true;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        if (!this.init) {
            init();
        }
        return this.contentLength;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        if (!this.init) {
            init();
        }
        return this.exists;
    }

    public URL getURL() {
        return this.url;
    }

    public String toString() {
        return getName();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return this.url.getProtocol().equals(PomReader.PomProfileElement.FILE);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        URLHandler uRLHandler = URLHandlerRegistry.getDefault();
        if (uRLHandler instanceof TimeoutConstrainedURLHandler) {
            return ((TimeoutConstrainedURLHandler) uRLHandler).openStream(this.url, this.timeoutConstraint);
        }
        return uRLHandler.openStream(this.url);
    }

    @Override // org.apache.ivy.plugins.repository.LocalizableResource
    public File getFile() {
        if (!isLocal()) {
            throw new IllegalStateException("Cannot get the local file for the not local resource " + this.url);
        }
        try {
            return new File(this.url.toURI());
        } catch (URISyntaxException unused) {
            return new File(this.url.getPath());
        }
    }
}
