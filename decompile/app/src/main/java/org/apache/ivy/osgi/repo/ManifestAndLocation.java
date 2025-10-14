package org.apache.ivy.osgi.repo;

import java.net.URI;
import java.util.jar.Manifest;

/* loaded from: classes5.dex */
public class ManifestAndLocation {
    public final Manifest manifest;
    public final URI sourceURI;
    public final URI uri;

    public ManifestAndLocation(Manifest manifest, URI uri, URI uri2) {
        this.manifest = manifest;
        this.uri = uri;
        this.sourceURI = uri2;
    }

    public URI getUri() {
        return this.uri;
    }

    public Manifest getManifest() {
        return this.manifest;
    }

    public URI getSourceURI() {
        return this.sourceURI;
    }
}
