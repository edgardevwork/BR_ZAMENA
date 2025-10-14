package org.apache.ivy.osgi.updatesite.xml;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class UpdateSite {
    public URI digestUri;
    public List<EclipseFeature> features = new ArrayList();
    public String mirrorsURL;
    public boolean pack200;
    public URI uri;

    public void setAssociateSitesURL(String str) {
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public URI getUri() {
        return this.uri;
    }

    public void setMirrorsURL(String str) {
        this.mirrorsURL = str;
    }

    public void setPack200(boolean z) {
        this.pack200 = z;
    }

    public void setDigestUri(URI uri) {
        this.digestUri = uri;
    }

    public URI getDigestUri() {
        return this.digestUri;
    }

    public void addFeature(EclipseFeature eclipseFeature) {
        this.features.add(eclipseFeature);
    }

    public List<EclipseFeature> getFeatures() {
        return this.features;
    }
}
