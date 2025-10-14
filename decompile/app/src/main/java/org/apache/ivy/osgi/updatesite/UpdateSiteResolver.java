package org.apache.ivy.osgi.updatesite;

import com.blackhub.bronline.game.core.constants.BuildTypeConstants;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import org.apache.ivy.ant.IvyBuildList;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.CacheResourceOptions;
import org.apache.ivy.core.cache.DownloadListener;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.osgi.repo.AbstractOSGiResolver;
import org.apache.ivy.osgi.repo.RepoDescriptor;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Message;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class UpdateSiteResolver extends AbstractOSGiResolver {
    public Boolean forceMetadataUpdate;
    public String logLevel;
    public Long metadataTtl;
    public String url;

    public void setUrl(String str) {
        this.url = str;
    }

    public void setMetadataTtl(Long l) {
        this.metadataTtl = l;
    }

    public void setForceMetadataUpdate(Boolean bool) {
        this.forceMetadataUpdate = bool;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    @Override // org.apache.ivy.osgi.repo.AbstractOSGiResolver
    public void init() {
        if (this.url == null) {
            throw new RuntimeException("Missing url");
        }
        CacheResourceOptions cacheResourceOptions = new CacheResourceOptions();
        Long l = this.metadataTtl;
        if (l != null) {
            cacheResourceOptions.setTtl(l.longValue());
        }
        Boolean bool = this.forceMetadataUpdate;
        if (bool != null) {
            cacheResourceOptions.setForce(bool.booleanValue());
        }
        String str = this.logLevel;
        final int i = 2;
        if (str != null) {
            if (BuildTypeConstants.DEBUG_TYPE.equalsIgnoreCase(str)) {
                i = 4;
            } else if ("verbose".equalsIgnoreCase(this.logLevel)) {
                i = 3;
            } else if (!"info".equalsIgnoreCase(this.logLevel)) {
                if (IvyBuildList.OnMissingDescriptor.WARN.equalsIgnoreCase(this.logLevel)) {
                    i = 1;
                } else {
                    if (!"error".equalsIgnoreCase(this.logLevel)) {
                        throw new RuntimeException("Unknown log level: " + this.logLevel);
                    }
                    i = 0;
                }
            }
        }
        cacheResourceOptions.setListener(new DownloadListener() { // from class: org.apache.ivy.osgi.updatesite.UpdateSiteResolver.1
            @Override // org.apache.ivy.core.cache.DownloadListener
            public void startArtifactDownload(RepositoryCacheManager repositoryCacheManager, ResolvedResource resolvedResource, Artifact artifact, ArtifactOrigin artifactOrigin) {
                if (i <= 2) {
                    Message.info("\tdownloading " + resolvedResource.getResource().getName());
                }
            }

            @Override // org.apache.ivy.core.cache.DownloadListener
            public void needArtifact(RepositoryCacheManager repositoryCacheManager, Artifact artifact) {
                if (i <= 3) {
                    Message.verbose("\ttrying to download " + artifact);
                }
            }

            @Override // org.apache.ivy.core.cache.DownloadListener
            public void endArtifactDownload(RepositoryCacheManager repositoryCacheManager, Artifact artifact, ArtifactDownloadReport artifactDownloadReport, File file) {
                if (i <= 3) {
                    if (artifactDownloadReport.isDownloaded()) {
                        Message.verbose("\tdownloaded to " + file.getAbsolutePath());
                        return;
                    }
                    Message.verbose("\tnothing to download");
                }
            }
        });
        UpdateSiteLoader updateSiteLoader = new UpdateSiteLoader(getRepositoryCacheManager(), getEventManager(), cacheResourceOptions, getTimeoutConstraint());
        updateSiteLoader.setLogLevel(i);
        try {
            RepoDescriptor repoDescriptorLoad = updateSiteLoader.load(new URI(this.url));
            if (repoDescriptorLoad == null) {
                setRepoDescriptor(AbstractOSGiResolver.FAILING_REPO_DESCRIPTOR);
                throw new RuntimeException("No update site was found at the location: " + this.url);
            }
            setRepoDescriptor(repoDescriptorLoad);
        } catch (IOException e) {
            throw new RuntimeException("IO issue while trying to read the update site (" + e.getMessage() + ")");
        } catch (URISyntaxException e2) {
            throw new RuntimeException("Ill-formed url (" + e2.getMessage() + ")", e2);
        } catch (ParseException e3) {
            throw new RuntimeException("Failed to parse the updatesite (" + e3.getMessage() + ")", e3);
        } catch (SAXException e4) {
            throw new RuntimeException("Ill-formed updatesite (" + e4.getMessage() + ")", e4);
        }
    }
}
