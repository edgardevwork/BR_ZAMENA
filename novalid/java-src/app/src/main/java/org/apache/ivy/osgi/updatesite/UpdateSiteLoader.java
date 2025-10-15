package org.apache.ivy.osgi.updatesite;

import androidx.appcompat.widget.ActivityChooserModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.ivy.core.cache.CacheResourceOptions;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.apache.ivy.osgi.p063p2.P2Descriptor;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.apache.ivy.osgi.p063p2.XMLInputParser;
import org.apache.ivy.osgi.repo.RepoDescriptor;
import org.apache.ivy.osgi.updatesite.xml.EclipseFeature;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.apache.ivy.osgi.updatesite.xml.UpdateSite;
import org.apache.ivy.osgi.updatesite.xml.UpdateSiteDigestParser;
import org.apache.ivy.plugins.repository.url.URLRepository;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.Message;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class UpdateSiteLoader {
    public int logLevel;
    public final CacheResourceOptions options;
    public final RepositoryCacheManager repositoryCacheManager;
    public final TimeoutConstraint timeoutConstraint;
    public final URLRepository urlRepository;

    public UpdateSiteLoader(RepositoryCacheManager repositoryCacheManager, EventManager eventManager, CacheResourceOptions cacheResourceOptions, TimeoutConstraint timeoutConstraint) {
        URLRepository uRLRepository = new URLRepository();
        this.urlRepository = uRLRepository;
        this.logLevel = 2;
        this.repositoryCacheManager = repositoryCacheManager;
        this.options = cacheResourceOptions;
        this.timeoutConstraint = timeoutConstraint;
        if (eventManager != null) {
            uRLRepository.addTransferListener(eventManager);
        }
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public RepoDescriptor load(URI uri) throws SAXException, IOException, ParseException {
        if (!uri.toString().endsWith("/")) {
            try {
                uri = new URI(uri.toString() + "/");
            } catch (URISyntaxException unused) {
                throw new RuntimeException("Cannot make an uri for the repo");
            }
        }
        Message.info("Loading the update site " + uri);
        P2Descriptor p2DescriptorLoadP2 = loadP2(uri);
        if (p2DescriptorLoadP2 != null) {
            return p2DescriptorLoadP2;
        }
        Message.verbose("\tNo P2 artifacts, falling back on the old fashioned updatesite");
        UpdateSite updateSiteLoadSite = loadSite(uri);
        if (updateSiteLoadSite == null) {
            return null;
        }
        UpdateSiteDescriptor updateSiteDescriptorLoadFromDigest = loadFromDigest(updateSiteLoadSite);
        return updateSiteDescriptorLoadFromDigest != null ? updateSiteDescriptorLoadFromDigest : loadFromSite(updateSiteLoadSite);
    }

    public final P2Descriptor loadP2(URI uri) throws SAXException, IOException, ParseException {
        P2Descriptor p2Descriptor = new P2Descriptor(uri, ExecutionEnvironmentProfileProvider.getInstance());
        p2Descriptor.setLogLevel(this.logLevel);
        if (!populateP2Descriptor(uri, p2Descriptor)) {
            return null;
        }
        p2Descriptor.finish();
        return p2Descriptor;
    }

    public final boolean populateP2Descriptor(URI uri, P2Descriptor p2Descriptor) throws SAXException, IOException, ParseException {
        Message.verbose("Loading P2 repository " + uri);
        return readArtifacts(uri, p2Descriptor) || readContent(uri, p2Descriptor);
    }

    public final boolean readContent(URI uri, P2Descriptor p2Descriptor) throws SAXException, IOException, ParseException {
        boolean compositeContent = readCompositeContent(uri, "compositeContent", p2Descriptor);
        if (compositeContent) {
            return compositeContent;
        }
        P2MetadataParser p2MetadataParser = new P2MetadataParser(p2Descriptor);
        p2MetadataParser.setLogLevel(this.logLevel);
        return readJarOrXml(uri, "content", p2MetadataParser);
    }

    public final boolean readArtifacts(URI uri, P2Descriptor p2Descriptor) throws SAXException, IOException, ParseException {
        boolean compositeArtifact = readCompositeArtifact(uri, "compositeArtifacts", p2Descriptor);
        return !compositeArtifact ? readJarOrXml(uri, "artifacts", new P2ArtifactParser(p2Descriptor, uri.toURL().toExternalForm())) : compositeArtifact;
    }

    public final boolean readCompositeContent(URI uri, String str, P2Descriptor p2Descriptor) throws SAXException, IOException, ParseException {
        P2CompositeParser p2CompositeParser = new P2CompositeParser();
        boolean jarOrXml = readJarOrXml(uri, str, p2CompositeParser);
        if (jarOrXml) {
            for (String str2 : p2CompositeParser.getChildLocations()) {
                if (!str2.endsWith("/")) {
                    str2 = str2 + "/";
                }
                readContent(uri.resolve(str2), p2Descriptor);
            }
        }
        return jarOrXml;
    }

    public final boolean readCompositeArtifact(URI uri, String str, P2Descriptor p2Descriptor) throws SAXException, IOException, ParseException {
        P2CompositeParser p2CompositeParser = new P2CompositeParser();
        boolean jarOrXml = readJarOrXml(uri, str, p2CompositeParser);
        if (jarOrXml) {
            for (String str2 : p2CompositeParser.getChildLocations()) {
                if (!str2.endsWith("/")) {
                    str2 = str2 + "/";
                }
                readArtifacts(uri.resolve(str2), p2Descriptor);
            }
        }
        return jarOrXml;
    }

    public final boolean readJarOrXml(URI uri, String str, XMLInputParser xMLInputParser) throws SAXException, IOException, ParseException {
        InputStream inputStreamFindEntry;
        ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource = this.repositoryCacheManager.downloadRepositoryResource(new URLResource(uri.resolve(str + ".jar").toURL(), this.timeoutConstraint), str, str, "jar", this.options, this.urlRepository);
        DownloadStatus downloadStatus = artifactDownloadReportDownloadRepositoryResource.getDownloadStatus();
        DownloadStatus downloadStatus2 = DownloadStatus.FAILED;
        if (downloadStatus == downloadStatus2) {
            ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource2 = this.repositoryCacheManager.downloadRepositoryResource(new URLResource(uri.resolve(str + ActivityChooserModel.HISTORY_FILE_EXTENSION).toURL(), this.timeoutConstraint), str, str, "xml", this.options, this.urlRepository);
            if (artifactDownloadReportDownloadRepositoryResource2.getDownloadStatus() == downloadStatus2) {
                return false;
            }
            inputStreamFindEntry = new FileInputStream(artifactDownloadReportDownloadRepositoryResource2.getLocalFile());
        } else {
            FileInputStream fileInputStream = new FileInputStream(artifactDownloadReportDownloadRepositoryResource.getLocalFile());
            try {
                inputStreamFindEntry = findEntry(fileInputStream, str + ActivityChooserModel.HISTORY_FILE_EXTENSION);
                if (inputStreamFindEntry == null) {
                    fileInputStream.close();
                    return false;
                }
            } catch (IOException e) {
                fileInputStream.close();
                throw e;
            }
        }
        try {
            xMLInputParser.parse(inputStreamFindEntry);
            inputStreamFindEntry.close();
            return true;
        } catch (Throwable th) {
            inputStreamFindEntry.close();
            throw th;
        }
    }

    public final UpdateSite loadSite(URI uri) throws SAXException, IOException {
        URI uriNormalizeSiteUri = normalizeSiteUri(uri, null);
        ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource = this.repositoryCacheManager.downloadRepositoryResource(new URLResource(uriNormalizeSiteUri.resolve("site.xml").toURL(), this.timeoutConstraint), "site", "updatesite", "xml", this.options, this.urlRepository);
        if (artifactDownloadReportDownloadRepositoryResource.getDownloadStatus() == DownloadStatus.FAILED) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(artifactDownloadReportDownloadRepositoryResource.getLocalFile());
        try {
            UpdateSite updateSite = EclipseUpdateSiteParser.parse(fileInputStream);
            updateSite.setUri(normalizeSiteUri(updateSite.getUri(), uriNormalizeSiteUri));
            fileInputStream.close();
            return updateSite;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final URI normalizeSiteUri(URI uri, URI uri2) {
        if (uri == null) {
            return uri2;
        }
        String string = uri.toString();
        if (string.endsWith("site.xml")) {
            try {
                return new URI(string.substring(0, string.length() - 8));
            } catch (URISyntaxException e) {
                throw new RuntimeException("Illegal uri", e);
            }
        }
        if (string.endsWith("/")) {
            return uri;
        }
        try {
            return new URI(string + "/");
        } catch (URISyntaxException e2) {
            throw new RuntimeException("Illegal uri", e2);
        }
    }

    public final UpdateSiteDescriptor loadFromDigest(UpdateSite updateSite) throws SAXException, IOException {
        URI digestUri = updateSite.getDigestUri();
        if (digestUri == null) {
            digestUri = updateSite.getUri();
        } else if (!digestUri.isAbsolute()) {
            digestUri = updateSite.getUri().resolve(digestUri);
        }
        URL url = digestUri.resolve("digest.zip").toURL();
        Message.verbose("\tReading " + url);
        ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource = this.repositoryCacheManager.downloadRepositoryResource(new URLResource(url, this.timeoutConstraint), UpdateSiteDigestParser.DigestHandler.DIGEST, UpdateSiteDigestParser.DigestHandler.DIGEST, ArchiveStreamFactory.ZIP, this.options, this.urlRepository);
        if (artifactDownloadReportDownloadRepositoryResource.getDownloadStatus() == DownloadStatus.FAILED) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(artifactDownloadReportDownloadRepositoryResource.getLocalFile());
        try {
            ZipInputStream zipInputStreamFindEntry = findEntry(fileInputStream, "digest.xml");
            if (zipInputStreamFindEntry != null) {
                UpdateSiteDescriptor updateSiteDescriptor = UpdateSiteDigestParser.parse(zipInputStreamFindEntry, updateSite);
                fileInputStream.close();
                return updateSiteDescriptor;
            }
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final UpdateSiteDescriptor loadFromSite(UpdateSite updateSite) throws SAXException, IOException {
        UpdateSiteDescriptor updateSiteDescriptor = new UpdateSiteDescriptor(updateSite.getUri(), ExecutionEnvironmentProfileProvider.getInstance());
        for (EclipseFeature eclipseFeature : updateSite.getFeatures()) {
            ArtifactDownloadReport artifactDownloadReportDownloadRepositoryResource = this.repositoryCacheManager.downloadRepositoryResource(new URLResource(updateSite.getUri().resolve(eclipseFeature.getUrl()).toURL(), this.timeoutConstraint), eclipseFeature.getId(), "feature", "jar", this.options, this.urlRepository);
            if (artifactDownloadReportDownloadRepositoryResource.getDownloadStatus() == DownloadStatus.FAILED) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(artifactDownloadReportDownloadRepositoryResource.getLocalFile());
            try {
                ZipInputStream zipInputStreamFindEntry = findEntry(fileInputStream, "feature.xml");
                if (zipInputStreamFindEntry != null) {
                    EclipseFeature eclipseFeature2 = FeatureParser.parse(zipInputStreamFindEntry);
                    eclipseFeature2.setURL(eclipseFeature.getUrl());
                    updateSiteDescriptor.addFeature(eclipseFeature2);
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return updateSiteDescriptor;
    }

    public final ZipInputStream findEntry(InputStream inputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        while (nextEntry != null && !nextEntry.getName().equals(str)) {
            nextEntry = zipInputStream.getNextEntry();
        }
        if (nextEntry == null) {
            return null;
        }
        return zipInputStream;
    }
}
