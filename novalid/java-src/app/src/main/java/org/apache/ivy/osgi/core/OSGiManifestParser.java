package org.apache.ivy.osgi.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.jar.Manifest;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes7.dex */
public class OSGiManifestParser implements ModuleDescriptorParser {
    public static final OSGiManifestParser INSTANCE = new OSGiManifestParser();
    public ExecutionEnvironmentProfileProvider profileProvider = ExecutionEnvironmentProfileProvider.getInstance();

    public static OSGiManifestParser getInstance() {
        return INSTANCE;
    }

    public void add(ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        this.profileProvider = executionEnvironmentProfileProvider;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public boolean accept(Resource resource) {
        return (resource == null || StringUtils.isNullOrEmpty(resource.getName()) || !resource.getName().toUpperCase(Locale.US).endsWith("MANIFEST.MF")) ? false : true;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, Resource resource, boolean z) throws IOException, ParseException {
        InputStream inputStreamOpenStream = resource.openStream();
        try {
            Manifest manifest = new Manifest(inputStreamOpenStream);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            BundleInfo manifest2 = ManifestParser.parseManifest(manifest);
            try {
                manifest2.addArtifact(new BundleArtifact(false, url.toURI(), null));
                return BundleInfoAdapter.toModuleDescriptor(this, null, manifest2, manifest, this.profileProvider);
            } catch (URISyntaxException e) {
                throw new RuntimeException("Unsupported repository, resources names are not uris", e);
            }
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public void toIvyFile(InputStream inputStream, Resource resource, File file, ModuleDescriptor moduleDescriptor) throws IOException, ParseException {
        try {
            XmlModuleDescriptorWriter.write(moduleDescriptor, file);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, boolean z) throws IOException, ParseException {
        return parseDescriptor(parserSettings, url, new URLResource(url), z);
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public String getType() {
        return "manifest";
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public Artifact getMetadataArtifact(ModuleRevisionId moduleRevisionId, Resource resource) {
        return DefaultArtifact.newIvyArtifact(moduleRevisionId, new Date(resource.getLastModified()));
    }

    public String toString() {
        return "manifest parser";
    }
}
