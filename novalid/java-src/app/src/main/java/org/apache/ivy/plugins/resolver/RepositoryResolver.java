package org.apache.ivy.plugins.resolver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.plugins.resolver.util.ResolverHelper;
import org.apache.ivy.plugins.resolver.util.ResourceMDParser;
import org.apache.ivy.plugins.signer.SignatureGenerator;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.ChecksumHelper;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes5.dex */
public class RepositoryResolver extends AbstractPatternsBasedResolver {
    public Repository repository;
    public Boolean alwaysCheckExactRevision = null;
    public String signerName = null;

    public Repository getRepository() {
        return this.repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void setName(String str) {
        super.setName(str);
        Repository repository = this.repository;
        if (repository instanceof AbstractRepository) {
            ((AbstractRepository) repository).setName(str);
        }
    }

    public void setSigner(String str) {
        this.signerName = str;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public ResolvedResource findResourceUsingPattern(ModuleRevisionId moduleRevisionId, String str, Artifact artifact, ResourceMDParser resourceMDParser, Date date) throws IOException {
        String revision;
        String name = getName();
        VersionMatcher versionMatcher = getSettings().getVersionMatcher();
        try {
            if (versionMatcher.isDynamic(moduleRevisionId) && !isAlwaysCheckExactRevision()) {
                return findDynamicResourceUsingPattern(resourceMDParser, moduleRevisionId, str, artifact, date);
            }
            String strSubstitute = IvyPatternHelper.substitute(str, moduleRevisionId, artifact);
            Message.debug("\t trying " + strSubstitute);
            logAttempt(strSubstitute);
            Resource resource = this.repository.getResource(strSubstitute);
            if (resource.exists()) {
                if (str.contains(IvyPatternHelper.REVISION_KEY)) {
                    revision = moduleRevisionId.getRevision();
                } else if (ClientConfigurationFields.IVY.equals(artifact.getType()) || "pom".equals(artifact.getType())) {
                    File fileCreateTempFile = File.createTempFile(ClientConfigurationFields.IVY, artifact.getExt());
                    fileCreateTempFile.deleteOnExit();
                    this.repository.get(resource.getName(), fileCreateTempFile);
                    revision = ModuleDescriptorParserRegistry.getInstance().getParser(resource).parseDescriptor(getParserSettings(), fileCreateTempFile.toURI().toURL(), resource, false).getRevision();
                    if (StringUtils.isNullOrEmpty(revision)) {
                        revision = "working@" + name;
                    }
                } else {
                    revision = "working@" + name;
                }
                return new ResolvedResource(resource, revision);
            }
            if (versionMatcher.isDynamic(moduleRevisionId)) {
                return findDynamicResourceUsingPattern(resourceMDParser, moduleRevisionId, str, artifact, date);
            }
            Message.debug("\t" + name + ": resource not reachable for " + moduleRevisionId + ": res=" + resource);
            return null;
        } catch (IOException e) {
            e = e;
            throw new RuntimeException(name + ": unable to get resource for " + moduleRevisionId + ": res=" + IvyPatternHelper.substitute(str, moduleRevisionId, artifact) + ": " + e, e);
        } catch (ParseException e2) {
            e = e2;
            throw new RuntimeException(name + ": unable to get resource for " + moduleRevisionId + ": res=" + IvyPatternHelper.substitute(str, moduleRevisionId, artifact) + ": " + e, e);
        }
    }

    public final ResolvedResource findDynamicResourceUsingPattern(ResourceMDParser resourceMDParser, ModuleRevisionId moduleRevisionId, String str, Artifact artifact, Date date) {
        String name = getName();
        logAttempt(IvyPatternHelper.substitute(str, ModuleRevisionId.newInstance(moduleRevisionId, IvyPatternHelper.getTokenString(IvyPatternHelper.REVISION_KEY)), artifact));
        ResolvedResource[] resolvedResourceArrListResources = listResources(this.repository, moduleRevisionId, str, artifact);
        if (resolvedResourceArrListResources == null) {
            Message.debug("\t" + name + ": unable to list resources for " + moduleRevisionId + ": pattern=" + str);
            return null;
        }
        ResolvedResource resolvedResourceFindResource = findResource(resolvedResourceArrListResources, resourceMDParser, moduleRevisionId, date);
        if (resolvedResourceFindResource == null) {
            Message.debug("\t" + name + ": no resource found for " + moduleRevisionId + ": pattern=" + str);
        }
        return resolvedResourceFindResource;
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public Resource getResource(String str) throws IOException {
        return this.repository.getResource(str);
    }

    public ResolvedResource[] listResources(Repository repository, ModuleRevisionId moduleRevisionId, String str, Artifact artifact) {
        return ResolverHelper.findAll(repository, moduleRevisionId, str, artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public long get(Resource resource, File file) throws IOException {
        Message.verbose("\t" + getName() + ": downloading " + resource.getName());
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tto ");
        sb.append(file);
        Message.debug(sb.toString());
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        this.repository.get(resource.getName(), file);
        return file.length();
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void publish(Artifact artifact, File file, boolean z) throws IOException {
        String str;
        if (ClientConfigurationFields.IVY.equals(artifact.getType()) && !getIvyPatterns().isEmpty()) {
            str = getIvyPatterns().get(0);
        } else if (!getArtifactPatterns().isEmpty()) {
            str = getArtifactPatterns().get(0);
        } else {
            throw new IllegalStateException("impossible to publish " + artifact + " using " + this + ": no artifact pattern defined");
        }
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        if (isM2compatible()) {
            moduleRevisionId = convertM2IdForResourceSearch(moduleRevisionId);
        }
        String destination = getDestination(str, artifact, moduleRevisionId);
        put(artifact, file, destination, z);
        Message.info("\tpublished " + artifact.getName() + " to " + hidePassword(this.repository.standardize(destination)));
    }

    public String getDestination(String str, Artifact artifact, ModuleRevisionId moduleRevisionId) {
        return IvyPatternHelper.substitute(str, moduleRevisionId, artifact);
    }

    public void put(Artifact artifact, File file, String str, boolean z) throws IOException {
        String[] checksumAlgorithms = getChecksumAlgorithms();
        for (String str2 : checksumAlgorithms) {
            if (!ChecksumHelper.isKnownAlgorithm(str2)) {
                throw new IllegalArgumentException("Unknown checksum algorithm: " + str2);
            }
        }
        this.repository.put(artifact, file, str, z);
        for (String str3 : checksumAlgorithms) {
            putChecksum(artifact, file, str, z, str3);
        }
        if (this.signerName != null) {
            putSignature(artifact, file, str, z);
        }
    }

    public void putChecksum(Artifact artifact, File file, String str, boolean z, String str2) throws IOException {
        File fileCreateTempFile = File.createTempFile("ivytemp", str2);
        try {
            FileUtil.copy(new ByteArrayInputStream(ChecksumHelper.computeAsString(file, str2).getBytes()), fileCreateTempFile, (CopyProgressListener) null);
            this.repository.put(DefaultArtifact.cloneWithAnotherTypeAndExt(artifact, str2, artifact.getExt() + "." + str2), fileCreateTempFile, chopQuery(str, str2), z);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    public void putSignature(Artifact artifact, File file, String str, boolean z) throws IOException {
        SignatureGenerator signatureGenerator = getSettings().getSignatureGenerator(this.signerName);
        if (signatureGenerator == null) {
            throw new IllegalArgumentException("Couldn't sign the artifacts! Unknown signer name: '" + this.signerName + "'");
        }
        File fileCreateTempFile = File.createTempFile("ivytemp", signatureGenerator.getExtension());
        try {
            signatureGenerator.sign(file, fileCreateTempFile);
            this.repository.put(DefaultArtifact.cloneWithAnotherTypeAndExt(artifact, signatureGenerator.getExtension(), artifact.getExt() + "." + signatureGenerator.getExtension()), fileCreateTempFile, chopQuery(str, signatureGenerator.getExtension()), z);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    public final String chopQuery(String str, String str2) {
        if (!str.contains("?")) {
            return str + "." + str2;
        }
        try {
            String query = new URL(str).getQuery();
            if (query == null) {
                query = "";
            }
            return str.replace("?" + query, "") + "." + str2;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        EventManager eventManager = getEventManager();
        if (eventManager != null) {
            try {
                this.repository.addTransferListener(eventManager);
            } catch (Throwable th) {
                if (eventManager != null) {
                    this.repository.removeTransferListener(eventManager);
                }
                throw th;
            }
        }
        DownloadReport downloadReportDownload = super.download(artifactArr, downloadOptions);
        if (eventManager != null) {
            this.repository.removeTransferListener(eventManager);
        }
        return downloadReportDownload;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void findTokenValues(Collection<String> collection, List<String> list, Map<String, String> map, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String[] strArrListTokenValues = ResolverHelper.listTokenValues(this.repository, IvyPatternHelper.substituteTokens(it.next(), map), str);
            if (strArrListTokenValues != null) {
                collection.addAll(filterNames(new ArrayList(Arrays.asList(strArrListTokenValues))));
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public String[] listTokenValues(String str, String str2) {
        return ResolverHelper.listTokenValues(this.repository, str, str2);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public boolean exist(String str) {
        try {
            return this.repository.getResource(str).exists();
        } catch (IOException e) {
            Message.debug(e);
            return false;
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "repository";
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        super.dumpSettings();
        Message.debug("\t\trepository: " + getRepository());
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void setSettings(ResolverSettings resolverSettings) {
        super.setSettings(resolverSettings);
        if (resolverSettings == null || this.alwaysCheckExactRevision != null) {
            return;
        }
        this.alwaysCheckExactRevision = Boolean.valueOf(resolverSettings.getVariable("ivy.default.always.check.exact.revision"));
    }

    public boolean isAlwaysCheckExactRevision() {
        Boolean bool = this.alwaysCheckExactRevision;
        return bool == null || bool.booleanValue();
    }

    public void setAlwaysCheckExactRevision(boolean z) {
        this.alwaysCheckExactRevision = Boolean.valueOf(z);
    }
}
