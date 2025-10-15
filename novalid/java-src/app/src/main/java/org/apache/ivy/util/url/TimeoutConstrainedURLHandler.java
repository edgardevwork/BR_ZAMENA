package org.apache.ivy.util.url;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.url.URLHandler;

/* loaded from: classes5.dex */
public interface TimeoutConstrainedURLHandler extends URLHandler {
    void download(URL url, File file, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException;

    long getContentLength(URL url, TimeoutConstraint timeoutConstraint);

    long getLastModified(URL url, TimeoutConstraint timeoutConstraint);

    URLHandler.URLInfo getURLInfo(URL url, TimeoutConstraint timeoutConstraint);

    boolean isReachable(URL url, TimeoutConstraint timeoutConstraint);

    InputStream openStream(URL url, TimeoutConstraint timeoutConstraint) throws IOException;

    void upload(File file, URL url, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException;
}
