package org.apache.ivy.osgi.repo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.resolver.util.ResolverHelper;

/* loaded from: classes5.dex */
public class RepositoryManifestIterable extends AbstractFSManifestIterable<String> {
    public final Repository repo;

    public RepositoryManifestIterable(Repository repository) {
        super("");
        this.repo = repository;
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public URI buildBundleURI(String str) throws IOException {
        Resource resource = this.repo.getResource(str);
        try {
            return new URI(resource.getName());
        } catch (URISyntaxException unused) {
            return new File(resource.getName()).toURI();
        }
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public InputStream getInputStream(String str) throws IOException {
        return this.repo.getResource(str).openStream();
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public List<String> listBundleFiles(String str) throws IOException {
        return asList(ResolverHelper.listAll(this.repo, str));
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public List<String> listDirs(String str) throws IOException {
        return asList(ResolverHelper.listAll(this.repo, str));
    }

    public final List<String> asList(String[] strArr) {
        if (strArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(strArr);
    }
}
