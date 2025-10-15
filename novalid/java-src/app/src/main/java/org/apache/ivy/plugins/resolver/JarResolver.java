package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.JarFile;
import org.apache.ivy.core.cache.CacheResourceOptions;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.plugins.repository.jar.JarRepository;
import org.apache.ivy.plugins.repository.url.URLRepository;
import org.apache.ivy.plugins.repository.url.URLResource;

/* loaded from: classes7.dex */
public class JarResolver extends RepositoryResolver {
    public URL url;

    public JarResolver() {
        setRepository(new JarRepository(new LazyTimeoutConstraint(this)));
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "jar";
    }

    public void setFile(String str) {
        setJarFile(new File(str));
    }

    public void setUrl(String str) {
        try {
            this.url = new URL(str);
        } catch (MalformedURLException e) {
            throw new RuntimeException("the jar repository " + getName() + " has an malformed url : " + str + " (" + e.getMessage() + ")");
        }
    }

    public JarRepository getJarRepository() {
        return (JarRepository) super.getRepository();
    }

    public final void setJarFile(File file) {
        try {
            getJarRepository().setJarFile(new JarFile(file));
        } catch (IOException e) {
            throw new RuntimeException("the jar repository " + getName() + " could not be read (" + e.getMessage() + ")", e);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void setSettings(ResolverSettings resolverSettings) {
        super.setSettings(resolverSettings);
        if (this.url == null) {
            return;
        }
        EventManager eventManager = getEventManager();
        if (eventManager != null) {
            try {
                getRepository().addTransferListener(eventManager);
            } catch (Throwable th) {
                if (eventManager != null) {
                    getRepository().removeTransferListener(eventManager);
                }
                throw th;
            }
        }
        ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource = getRepositoryCacheManager().downloadRepositoryResource(new URLResource(this.url, getTimeoutConstraint()), "jarrepository", "jar", "jar", new CacheResourceOptions(), new URLRepository());
        if (eventManager != null) {
            getRepository().removeTransferListener(eventManager);
        }
        if (artifactDownloadReportDownloadRepositoryResource.getDownloadStatus() == DownloadStatus.FAILED) {
            throw new RuntimeException("The jar file " + this.url.toExternalForm() + " could not be downloaded (" + artifactDownloadReportDownloadRepositoryResource.getDownloadDetails() + ")");
        }
        setJarFile(artifactDownloadReportDownloadRepositoryResource.getLocalFile());
    }
}
