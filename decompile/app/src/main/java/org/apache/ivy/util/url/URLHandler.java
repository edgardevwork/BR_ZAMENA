package org.apache.ivy.util.url;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.ivy.util.CopyProgressListener;

@Deprecated
/* loaded from: classes8.dex */
public interface URLHandler {
    public static final int REQUEST_METHOD_GET = 1;
    public static final int REQUEST_METHOD_HEAD = 2;
    public static final URLInfo UNAVAILABLE = new URLInfo(false, 0, 0);

    void download(URL url, File file, CopyProgressListener copyProgressListener) throws IOException;

    long getContentLength(URL url);

    long getContentLength(URL url, int i);

    long getLastModified(URL url);

    long getLastModified(URL url, int i);

    URLInfo getURLInfo(URL url);

    URLInfo getURLInfo(URL url, int i);

    boolean isReachable(URL url);

    boolean isReachable(URL url, int i);

    InputStream openStream(URL url) throws IOException;

    void setRequestMethod(int i);

    void upload(File file, URL url, CopyProgressListener copyProgressListener) throws IOException;

    public static class URLInfo {
        public boolean available;
        public String bodyCharset;
        public long contentLength;
        public long lastModified;

        public URLInfo(boolean z, long j, long j2) {
            this(z, j, j2, null);
        }

        public URLInfo(boolean z, long j, long j2, String str) {
            this.available = z;
            this.contentLength = j;
            this.lastModified = j2;
            this.bodyCharset = str;
        }

        public boolean isReachable() {
            return this.available;
        }

        public long getContentLength() {
            return this.contentLength;
        }

        public long getLastModified() {
            return this.lastModified;
        }

        public String getBodyCharset() {
            return this.bodyCharset;
        }
    }
}
