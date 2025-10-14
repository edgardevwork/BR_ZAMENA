package org.apache.ivy.osgi.obr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.ivy.core.cache.CacheResourceOptions;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.apache.ivy.osgi.repo.AbstractOSGiResolver;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class OBRResolver extends AbstractOSGiResolver {
    public Boolean forceMetadataUpdate;
    public Long metadataTtl;
    public String repoXmlFile;
    public String repoXmlURL;

    public void setRepoXmlFile(String str) {
        this.repoXmlFile = str;
    }

    public void setRepoXmlURL(String str) {
        this.repoXmlURL = str;
    }

    public void setMetadataTtl(Long l) {
        this.metadataTtl = l;
    }

    public void setForceMetadataUpdate(Boolean bool) {
        this.forceMetadataUpdate = bool;
    }

    @Override // org.apache.ivy.osgi.repo.AbstractOSGiResolver
    public void init() throws IOException {
        String str = this.repoXmlFile;
        if (str != null && this.repoXmlURL != null) {
            throw new RuntimeException("The OBR repository resolver " + getName() + " couldn't be configured: repoXmlFile and repoXmlUrl cannot be set both");
        }
        if (str != null) {
            File file = new File(this.repoXmlFile);
            loadRepoFromFile(file.getParentFile().toURI(), file, this.repoXmlFile);
            return;
        }
        if (this.repoXmlURL != null) {
            try {
                URL url = new URL(this.repoXmlURL);
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
                URLResource uRLResource = new URLResource(url, getTimeoutConstraint());
                CacheResourceOptions cacheResourceOptions = new CacheResourceOptions();
                Long l = this.metadataTtl;
                if (l != null) {
                    cacheResourceOptions.setTtl(l.longValue());
                }
                Boolean bool = this.forceMetadataUpdate;
                if (bool != null) {
                    cacheResourceOptions.setForce(bool.booleanValue());
                }
                ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource = getRepositoryCacheManager().downloadRepositoryResource(uRLResource, "obr", "obr", "xml", cacheResourceOptions, getRepository());
                if (eventManager != null) {
                    getRepository().removeTransferListener(eventManager);
                }
                try {
                    loadRepoFromFile(new URI(this.repoXmlURL), artifactDownloadReportDownloadRepositoryResource.getLocalFile(), this.repoXmlURL);
                    return;
                } catch (URISyntaxException unused) {
                    throw new RuntimeException("illegal uri");
                }
            } catch (MalformedURLException unused2) {
                throw new RuntimeException("The OBR repository resolver " + getName() + " couldn't be configured: repoXmlURL '" + this.repoXmlURL + "' is not an URL");
            }
        }
        throw new RuntimeException("The OBR repository resolver " + getName() + " couldn't be configured: repoXmlFile or repoXmlUrl is missing");
    }

    public final void loadRepoFromFile(URI uri, File file, String str) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                setRepoDescriptor(OBRXMLParser.parse(uri, fileInputStream));
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
            } catch (IOException e) {
                throw new RuntimeException("The OBR repository resolver " + getName() + " couldn't be configured: the file " + str + " could not be read (" + e.getMessage() + ")", e);
            } catch (SAXException e2) {
                throw new RuntimeException("The OBR repository resolver " + getName() + " couldn't be configured: the file " + str + " has incorrect XML (" + e2.getMessage() + ")", e2);
            }
        } catch (FileNotFoundException unused2) {
            throw new RuntimeException("The OBR repository resolver " + getName() + " couldn't be configured: the file " + str + " was not found");
        }
    }
}
