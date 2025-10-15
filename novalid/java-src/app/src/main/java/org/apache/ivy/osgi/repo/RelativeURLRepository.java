package org.apache.ivy.osgi.repo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.url.URLRepository;
import org.apache.ivy.plugins.repository.url.URLResource;

/* loaded from: classes7.dex */
public class RelativeURLRepository extends URLRepository {
    public final URL baseUrl;
    public Map<String, Resource> resourcesCache;

    public RelativeURLRepository() {
        this.resourcesCache = new HashMap();
        this.baseUrl = null;
    }

    @Deprecated
    public RelativeURLRepository(URL url) {
        this(url, null);
    }

    public RelativeURLRepository(URL url, TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.resourcesCache = new HashMap();
        this.baseUrl = url;
    }

    @Override // org.apache.ivy.plugins.repository.url.URLRepository, org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        URI uri;
        String strEncode = encode(str);
        Resource uRLResource = this.resourcesCache.get(strEncode);
        if (uRLResource == null) {
            try {
                uri = new URI(strEncode);
            } catch (URISyntaxException unused) {
                uri = null;
            }
            if (uri == null || uri.isAbsolute()) {
                uRLResource = new URLResource(new URL(strEncode), getTimeoutConstraint());
            } else {
                uRLResource = new URLResource(new URL(this.baseUrl + strEncode), getTimeoutConstraint());
            }
            this.resourcesCache.put(strEncode, uRLResource);
        }
        return uRLResource;
    }

    public static String encode(String str) {
        return str.trim().replaceAll(" ", "%20");
    }
}
