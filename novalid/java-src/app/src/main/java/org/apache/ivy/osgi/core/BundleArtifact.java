package org.apache.ivy.osgi.core;

import java.net.URI;

/* loaded from: classes5.dex */
public class BundleArtifact {
    public String format;
    public boolean source;
    public URI uri;

    public BundleArtifact(boolean z, URI uri, String str) {
        this.source = z;
        this.uri = uri;
        this.format = str;
    }

    public boolean isSource() {
        return this.source;
    }

    public URI getUri() {
        return this.uri;
    }

    public String getFormat() {
        return this.format;
    }
}
