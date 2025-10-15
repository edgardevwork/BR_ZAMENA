package org.apache.ivy.plugins.repository.url;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.RepositoryCopyProgressListener;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.url.ApacheURLLister;

/* loaded from: classes5.dex */
public class URLRepository extends AbstractRepository {
    public ApacheURLLister lister;
    public RepositoryCopyProgressListener progress;
    public final Map<String, Resource> resourcesCache;

    public URLRepository() {
        this.progress = new RepositoryCopyProgressListener(this);
        this.resourcesCache = new HashMap();
        this.lister = new ApacheURLLister();
    }

    public URLRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.progress = new RepositoryCopyProgressListener(this);
        this.resourcesCache = new HashMap();
        this.lister = new ApacheURLLister();
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        Resource resource = this.resourcesCache.get(str);
        if (resource != null) {
            return resource;
        }
        URLResource uRLResource = new URLResource(new URL(str), getTimeoutConstraint());
        this.resourcesCache.put(str, uRLResource);
        return uRLResource;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws IOException {
        fireTransferInitiated(getResource(str), 5);
        try {
            try {
                long contentLength = getResource(str).getContentLength();
                if (contentLength > 0) {
                    this.progress.setTotalLength(Long.valueOf(contentLength));
                }
                FileUtil.copy(new URL(str), file, this.progress, getTimeoutConstraint());
                this.progress.setTotalLength(null);
            } catch (IOException e) {
                e = e;
                fireTransferError(e);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                fireTransferError(e);
                throw e;
            }
        } catch (Throwable th) {
            this.progress.setTotalLength(null);
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public void put(File file, String str, boolean z) throws IOException {
        if (!z && getResource(str).exists()) {
            throw new IOException("destination file exists and overwrite == false");
        }
        fireTransferInitiated(getResource(str), 6);
        try {
            try {
                long length = file.length();
                if (length > 0) {
                    this.progress.setTotalLength(Long.valueOf(length));
                }
                FileUtil.copy(file, new URL(str), this.progress, getTimeoutConstraint());
                this.progress.setTotalLength(null);
            } catch (IOException e) {
                e = e;
                fireTransferError(e);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                fireTransferError(e);
                throw e;
            }
        } catch (Throwable th) {
            this.progress.setTotalLength(null);
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        String path;
        if (str.startsWith(HttpHost.DEFAULT_SCHEME_NAME)) {
            List<URL> listListAll = this.lister.listAll(new URL(str));
            if (listListAll == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(listListAll.size());
            Iterator<URL> it = listListAll.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toExternalForm());
            }
            return arrayList;
        }
        if (!str.startsWith(PomReader.PomProfileElement.FILE)) {
            return null;
        }
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                path = uri.getSchemeSpecificPart();
            } else {
                path = uri.getPath();
            }
            File file = new File(path);
            if (file.exists() && file.isDirectory()) {
                String[] list = file.list();
                ArrayList arrayList2 = new ArrayList(list.length);
                URL url = path.endsWith("/") ? new URL(str) : new URL(str + "/");
                for (String str2 : list) {
                    arrayList2.add(new URL(url, str2).toExternalForm());
                }
                return arrayList2;
            }
            return Collections.emptyList();
        } catch (URISyntaxException e) {
            throw new IOException("Couldn't list content of '" + str + "'", e);
        }
    }
}
