package org.apache.ivy.plugins.resolver.util;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.ivy.util.url.ApacheURLLister;

/* loaded from: classes5.dex */
public class ApacheHttpURLLister implements URLLister {
    public ApacheURLLister lister = new ApacheURLLister();

    @Override // org.apache.ivy.plugins.resolver.util.URLLister
    public boolean accept(String str) {
        return str.startsWith(HttpHost.DEFAULT_SCHEME_NAME);
    }

    @Override // org.apache.ivy.plugins.resolver.util.URLLister
    public List<URL> listAll(URL url) throws IOException {
        return this.lister.listAll(url);
    }

    public String toString() {
        return "apache http lister";
    }
}
