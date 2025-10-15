package org.apache.ivy.plugins.repository;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public interface Resource {
    Resource clone(String str);

    boolean exists();

    long getContentLength();

    long getLastModified();

    String getName();

    boolean isLocal();

    InputStream openStream() throws IOException;
}
