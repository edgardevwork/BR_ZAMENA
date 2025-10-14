package org.apache.ivy.plugins.resolver;

import com.bumptech.glide.load.engine.GlideException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.ModuleDescriptorWriter;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.ivy.plugins.repository.ArtifactResourceResolver;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.ResourceDownloader;
import org.apache.ivy.plugins.repository.file.FileRepository;
import org.apache.ivy.plugins.repository.file.FileResource;
import org.apache.ivy.plugins.repository.url.URLRepository;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.plugins.resolver.util.MDResolvedResource;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.plugins.resolver.util.ResourceMDParser;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.ChecksumHelper;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.HostUtil;
import org.apache.ivy.util.Message;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public abstract class BasicResolver extends AbstractResolver {

    @Deprecated
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DateUtil.DATE_FORMAT_PATTERN);
    public static final String DESCRIPTOR_OPTIONAL = "optional";
    public static final String DESCRIPTOR_REQUIRED = "required";
    public boolean envDependent = true;
    public List<String> ivyattempts = new ArrayList();
    public Map<Artifact, List<String>> artattempts = new HashMap();
    public boolean checkconsistency = true;
    public boolean allownomd = true;
    public boolean force = false;
    public String checksums = null;
    public URLRepository extartifactrep = new URLRepository();
    public final ArtifactResourceResolver artifactResourceResolver = new ArtifactResourceResolver() { // from class: org.apache.ivy.plugins.resolver.BasicResolver.5
        public C112605() {
        }

        @Override // org.apache.ivy.plugins.repository.ArtifactResourceResolver
        public ResolvedResource resolve(Artifact artifact) {
            return BasicResolver.this.getArtifactRef(BasicResolver.this.fromSystem(artifact), null);
        }
    };
    public final ResourceDownloader downloader = new ResourceDownloader() { // from class: org.apache.ivy.plugins.resolver.BasicResolver.6
        public C112616() {
        }

        @Override // org.apache.ivy.plugins.repository.ResourceDownloader
        public void download(Artifact artifact, Resource resource, File file) throws IOException {
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(file.getAbsolutePath() + FileSystemResolver.TRANSACTION_DESTINATION_SUFFIX);
            if (resource.getName().equals(String.valueOf(artifact.getUrl()))) {
                if (file2.getParentFile() != null) {
                    file2.getParentFile().mkdirs();
                }
                BasicResolver.this.extartifactrep.get(resource.getName(), file2);
            } else {
                BasicResolver.this.getAndCheck(resource, file2);
            }
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("impossible to move part file to definitive one: " + file2 + " -> " + file);
        }
    };
    public String workspaceName = HostUtil.getLocalHostName();

    public boolean acceptLatest() {
        return true;
    }

    public abstract ResolvedResource findArtifactRef(Artifact artifact, Date date);

    public abstract Collection<String> findNames(Map<String, String> map, String str);

    public abstract long get(Resource resource, File file) throws IOException;

    public abstract Resource getResource(String str) throws IOException;

    /* loaded from: classes6.dex */
    public static class UnresolvedDependencyException extends RuntimeException {
        public static final long serialVersionUID = 1;
        public boolean error;

        public UnresolvedDependencyException() {
            this("", false);
        }

        public UnresolvedDependencyException(String str) {
            this(str, true);
        }

        public UnresolvedDependencyException(String str, boolean z) {
            super(str);
            this.error = z;
        }

        public boolean isError() {
            return this.error;
        }
    }

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public void setWorkspaceName(String str) {
        this.workspaceName = str;
    }

    public boolean isEnvDependent() {
        return this.envDependent;
    }

    public void setEnvDependent(boolean z) {
        this.envDependent = z;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        ModuleDescriptor system;
        ResolvedModuleRevision resolvedModuleRevision;
        DependencyDescriptor dependencyDescriptorClone = dependencyDescriptor;
        IvyContext ivyContextPushNewCopyContext = IvyContext.pushNewCopyContext();
        try {
            ResolvedModuleRevision currentResolvedModuleRevision = resolveData.getCurrentResolvedModuleRevision();
            if (currentResolvedModuleRevision != null && shouldReturnResolvedModule(dependencyDescriptorClone, currentResolvedModuleRevision)) {
                return currentResolvedModuleRevision;
            }
            if (isForce()) {
                dependencyDescriptorClone = dependencyDescriptorClone.clone(ModuleRevisionId.newInstance(dependencyDescriptor.getDependencyRevisionId(), "latest.integration"));
            }
            DependencyDescriptor dependencyDescriptorFromSystem = fromSystem(dependencyDescriptorClone);
            ivyContextPushNewCopyContext.setDependencyDescriptor(dependencyDescriptorClone);
            ivyContextPushNewCopyContext.setResolveData(resolveData);
            clearIvyAttempts();
            clearArtifactAttempts();
            ModuleRevisionId dependencyRevisionId = dependencyDescriptorClone.getDependencyRevisionId();
            ModuleRevisionId dependencyRevisionId2 = dependencyDescriptorFromSystem.getDependencyRevisionId();
            checkRevision(dependencyRevisionId);
            boolean andCheckIsDynamic = getAndCheckIsDynamic(dependencyRevisionId);
            ResolvedModuleRevision resolvedModuleRevisionFindModuleInCache = findModuleInCache(dependencyDescriptorClone, resolveData);
            if (resolvedModuleRevisionFindModuleInCache != null) {
                if (resolvedModuleRevisionFindModuleInCache.getDescriptor().isDefault() && resolvedModuleRevisionFindModuleInCache.getResolver() != this) {
                    Message.verbose("\t" + getName() + ": found revision in cache: " + dependencyRevisionId + " (resolved by " + resolvedModuleRevisionFindModuleInCache.getResolver().getName() + "): but it's a default one, maybe we can find a better one");
                } else {
                    if (!isForce() || resolvedModuleRevisionFindModuleInCache.getResolver() == this) {
                        Message.verbose("\t" + getName() + ": revision in cache: " + dependencyRevisionId);
                        return checkLatest(dependencyDescriptorClone, checkForcedResolvedModuleRevision(resolvedModuleRevisionFindModuleInCache), resolveData);
                    }
                    Message.verbose("\t" + getName() + ": found revision in cache: " + dependencyRevisionId + " (resolved by " + resolvedModuleRevisionFindModuleInCache.getResolver().getName() + "): but we are in force mode, let's try to find one ourselves");
                }
            }
            if (resolveData.getOptions().isUseCacheOnly()) {
                throw new UnresolvedDependencyException("\t" + getName() + " (useCacheOnly) : no ivy file found for " + dependencyRevisionId, false);
            }
            checkInterrupted();
            ResolvedResource resolvedResourceFindIvyFileRef = findIvyFileRef(dependencyDescriptorFromSystem, resolveData);
            checkInterrupted();
            if (resolvedResourceFindIvyFileRef != null) {
                if (resolvedResourceFindIvyFileRef instanceof MDResolvedResource) {
                    resolvedModuleRevisionFindModuleInCache = ((MDResolvedResource) resolvedResourceFindIvyFileRef).getResolvedModuleRevision();
                }
                if (resolvedModuleRevisionFindModuleInCache == null && (resolvedModuleRevisionFindModuleInCache = parse(resolvedResourceFindIvyFileRef, dependencyDescriptorClone, resolveData)) == null) {
                    throw new UnresolvedDependencyException();
                }
                if (!resolvedModuleRevisionFindModuleInCache.getReport().isDownloaded() && resolvedModuleRevisionFindModuleInCache.getReport().getLocalFile() != null) {
                    return checkLatest(dependencyDescriptorClone, checkForcedResolvedModuleRevision(resolvedModuleRevisionFindModuleInCache), resolveData);
                }
                ModuleDescriptor descriptor = resolvedModuleRevisionFindModuleInCache.getDescriptor();
                system = toSystem(descriptor);
                if (isCheckconsistency()) {
                    checkDescriptorConsistency(dependencyRevisionId, system, resolvedResourceFindIvyFileRef);
                    checkDescriptorConsistency(dependencyRevisionId2, descriptor, resolvedResourceFindIvyFileRef);
                } else if (system instanceof DefaultModuleDescriptor) {
                    DefaultModuleDescriptor defaultModuleDescriptor = (DefaultModuleDescriptor) system;
                    ModuleRevisionId revision = getRevision(resolvedResourceFindIvyFileRef, dependencyRevisionId, system);
                    defaultModuleDescriptor.setModuleRevisionId(revision);
                    defaultModuleDescriptor.setResolvedModuleRevisionId(revision);
                } else {
                    Message.warn("consistency disabled with instance of non DefaultModuleDescriptor... module info can't be updated, so consistency check will be done");
                    checkDescriptorConsistency(dependencyRevisionId2, descriptor, resolvedResourceFindIvyFileRef);
                    checkDescriptorConsistency(dependencyRevisionId, system, resolvedResourceFindIvyFileRef);
                }
                resolvedModuleRevision = new ResolvedModuleRevision(this, this, system, toSystem(resolvedModuleRevisionFindModuleInCache.getReport()), isForce());
            } else {
                if (!isAllownomd()) {
                    throw new UnresolvedDependencyException("\t" + getName() + ": no ivy file found for " + dependencyRevisionId, false);
                }
                DefaultModuleDescriptor defaultModuleDescriptorNewDefaultInstance = DefaultModuleDescriptor.newDefaultInstance(dependencyRevisionId2, dependencyDescriptorFromSystem.getAllDependencyArtifacts());
                ResolvedResource resolvedResourceFindFirstArtifactRef = findFirstArtifactRef(defaultModuleDescriptorNewDefaultInstance, dependencyDescriptorFromSystem, resolveData);
                checkInterrupted();
                if (resolvedResourceFindFirstArtifactRef == null) {
                    throw new UnresolvedDependencyException("\t" + getName() + ": no ivy file nor artifact found for " + dependencyRevisionId, false);
                }
                long lastModified = resolvedResourceFindFirstArtifactRef.getLastModified();
                if (lastModified != 0 && (defaultModuleDescriptorNewDefaultInstance instanceof DefaultModuleDescriptor)) {
                    defaultModuleDescriptorNewDefaultInstance.setLastModified(lastModified);
                }
                Message.verbose("\t" + getName() + ": no ivy file found for " + dependencyRevisionId + ": using default data");
                if (andCheckIsDynamic) {
                    defaultModuleDescriptorNewDefaultInstance.setResolvedModuleRevisionId(ModuleRevisionId.newInstance(dependencyRevisionId2, resolvedResourceFindFirstArtifactRef.getRevision()));
                }
                system = toSystem(defaultModuleDescriptorNewDefaultInstance);
                MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(system.getMetadataArtifact());
                metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                metadataArtifactDownloadReport.setSearched(true);
                resolvedModuleRevision = new ResolvedModuleRevision(this, this, system, metadataArtifactDownloadReport, isForce());
                getRepositoryCacheManager().cacheModuleDescriptor(this, resolvedResourceFindFirstArtifactRef, toSystem(dependencyDescriptorClone), system.getAllArtifacts()[0], null, getCacheOptions(resolveData));
            }
            resolveAndCheckRevision(system, dependencyRevisionId, resolvedResourceFindIvyFileRef, andCheckIsDynamic);
            resolveAndCheckPublicationDate(dependencyDescriptorClone, system, dependencyRevisionId, resolveData);
            checkNotConvertedExclusionRule(system, resolvedResourceFindIvyFileRef, resolveData);
            if (resolvedResourceFindIvyFileRef == null || resolvedResourceFindIvyFileRef.getResource() != null) {
                cacheModuleDescriptor(system, dependencyRevisionId, resolvedResourceFindIvyFileRef, resolvedModuleRevision);
            }
            return checkLatest(dependencyDescriptorClone, checkForcedResolvedModuleRevision(resolvedModuleRevision), resolveData);
        } catch (UnresolvedDependencyException e) {
            if (!e.getMessage().isEmpty()) {
                if (e.isError()) {
                    Message.error(e.getMessage());
                } else {
                    Message.verbose(e.getMessage());
                }
            }
            return resolveData.getCurrentResolvedModuleRevision();
        } finally {
            IvyContext.popContext();
        }
    }

    public boolean shouldReturnResolvedModule(DependencyDescriptor dependencyDescriptor, ResolvedModuleRevision resolvedModuleRevision) {
        return (((getSettings().getVersionMatcher().isDynamic(dependencyDescriptor.getDependencyRevisionId()) || resolvedModuleRevision.getDescriptor().isDefault()) ? false : true) | resolvedModuleRevision.isForce()) & (!isForce());
    }

    public final ResolvedModuleRevision checkForcedResolvedModuleRevision(ResolvedModuleRevision resolvedModuleRevision) {
        if (resolvedModuleRevision == null) {
            return null;
        }
        return (!isForce() || resolvedModuleRevision.isForce()) ? resolvedModuleRevision : new ResolvedModuleRevision(resolvedModuleRevision.getResolver(), resolvedModuleRevision.getArtifactResolver(), resolvedModuleRevision.getDescriptor(), resolvedModuleRevision.getReport(), true);
    }

    public final void cacheModuleDescriptor(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, ResolvedResource resolvedResource, ResolvedModuleRevision resolvedModuleRevision) {
        Artifact metadataArtifact;
        RepositoryCacheManager repositoryCacheManager = getRepositoryCacheManager();
        ModuleDescriptorParser parser = moduleDescriptor.getParser();
        if (resolvedResource == null) {
            metadataArtifact = moduleDescriptor.getMetadataArtifact();
        } else {
            metadataArtifact = parser.getMetadataArtifact(ModuleRevisionId.newInstance(moduleRevisionId, moduleDescriptor.getRevision()), resolvedResource.getResource());
        }
        repositoryCacheManager.originalToCachedModuleDescriptor(this, resolvedResource, metadataArtifact, resolvedModuleRevision, new ModuleDescriptorWriter() { // from class: org.apache.ivy.plugins.resolver.BasicResolver.1
            public final /* synthetic */ ModuleDescriptorParser val$parser;

            public C112561(ModuleDescriptorParser parser2) {
                moduleDescriptorParser = parser2;
            }

            @Override // org.apache.ivy.core.cache.ModuleDescriptorWriter
            public void write(ResolvedResource resolvedResource2, ModuleDescriptor moduleDescriptor2, File file, File file2) throws IOException, ParseException {
                if (resolvedResource2 == null) {
                    XmlModuleDescriptorWriter.write(moduleDescriptor2, file2);
                    return;
                }
                moduleDescriptorParser.toIvyFile(new FileInputStream(file), resolvedResource2.getResource(), file2, moduleDescriptor2);
                long lastModified = resolvedResource2.getLastModified();
                if (lastModified > 0) {
                    file2.setLastModified(lastModified);
                }
            }
        });
    }

    /* renamed from: org.apache.ivy.plugins.resolver.BasicResolver$1 */
    public class C112561 implements ModuleDescriptorWriter {
        public final /* synthetic */ ModuleDescriptorParser val$parser;

        public C112561(ModuleDescriptorParser parser2) {
            moduleDescriptorParser = parser2;
        }

        @Override // org.apache.ivy.core.cache.ModuleDescriptorWriter
        public void write(ResolvedResource resolvedResource2, ModuleDescriptor moduleDescriptor2, File file, File file2) throws IOException, ParseException {
            if (resolvedResource2 == null) {
                XmlModuleDescriptorWriter.write(moduleDescriptor2, file2);
                return;
            }
            moduleDescriptorParser.toIvyFile(new FileInputStream(file), resolvedResource2.getResource(), file2, moduleDescriptor2);
            long lastModified = resolvedResource2.getLastModified();
            if (lastModified > 0) {
                file2.setLastModified(lastModified);
            }
        }
    }

    public final void checkNotConvertedExclusionRule(ModuleDescriptor moduleDescriptor, ResolvedResource resolvedResource, ResolveData resolveData) {
        if (!getNamespace().equals(Namespace.SYSTEM_NAMESPACE) && !moduleDescriptor.isDefault() && resolveData.getSettings().logNotConvertedExclusionRule() && (moduleDescriptor instanceof DefaultModuleDescriptor) && ((DefaultModuleDescriptor) moduleDescriptor).isNamespaceUseful()) {
            Message.warn("the module descriptor " + resolvedResource.getResource() + " has information which can't be converted into the system namespace. It will require the availability of the namespace '" + getNamespace().getName() + "' to be fully usable.");
        }
    }

    public final void resolveAndCheckPublicationDate(DependencyDescriptor dependencyDescriptor, ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, ResolveData resolveData) {
        if (resolveData.getDate() == null) {
            return;
        }
        long publicationDate = getPublicationDate(moduleDescriptor, dependencyDescriptor, resolveData);
        if (publicationDate > resolveData.getDate().getTime()) {
            throw new UnresolvedDependencyException("\t" + getName() + ": unacceptable publication date => was=" + new Date(publicationDate) + " required=" + resolveData.getDate());
        }
        if (publicationDate == -1) {
            throw new UnresolvedDependencyException("\t" + getName() + ": impossible to guess publication date: artifact missing for " + moduleRevisionId);
        }
        moduleDescriptor.setResolvedPublicationDate(new Date(publicationDate));
    }

    public void checkModuleDescriptorRevision(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId) {
        if (getSettings().getVersionMatcher().accept(moduleRevisionId, moduleDescriptor)) {
            return;
        }
        throw new UnresolvedDependencyException("\t" + getName() + ": unacceptable revision => was=" + moduleDescriptor.getResolvedModuleRevisionId().getRevision() + " required=" + moduleRevisionId.getRevision());
    }

    public final boolean getAndCheckIsDynamic(ModuleRevisionId moduleRevisionId) {
        boolean zIsDynamic = getSettings().getVersionMatcher().isDynamic(moduleRevisionId);
        if (!zIsDynamic || acceptLatest()) {
            return zIsDynamic;
        }
        throw new UnresolvedDependencyException("dynamic revisions not handled by " + getClass().getName() + ". impossible to resolve " + moduleRevisionId);
    }

    public final void checkRevision(ModuleRevisionId moduleRevisionId) {
        int iIndexOf = moduleRevisionId.getRevision().indexOf(64);
        if (iIndexOf == -1 || moduleRevisionId.getRevision().substring(iIndexOf + 1).equals(this.workspaceName)) {
            return;
        }
        throw new UnresolvedDependencyException("\t" + getName() + ": unhandled revision => " + moduleRevisionId.getRevision());
    }

    public final void resolveAndCheckRevision(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, ResolvedResource resolvedResource, boolean z) {
        ModuleRevisionId resolvedModuleRevisionId = moduleDescriptor.getResolvedModuleRevisionId();
        if (resolvedModuleRevisionId.getRevision() == null || resolvedModuleRevisionId.getRevision().length() == 0 || resolvedModuleRevisionId.getRevision().startsWith("working@")) {
            if (!z) {
                resolvedModuleRevisionId = ModuleRevisionId.newInstance(resolvedModuleRevisionId, moduleRevisionId.getRevision());
            } else if (resolvedResource == null) {
                resolvedModuleRevisionId = moduleDescriptor.getMetadataArtifact().getModuleRevisionId();
            } else if (resolvedResource.getRevision() == null || resolvedResource.getRevision().length() == 0) {
                resolvedModuleRevisionId = ModuleRevisionId.newInstance(resolvedModuleRevisionId, "working@" + getName());
            } else {
                resolvedModuleRevisionId = ModuleRevisionId.newInstance(resolvedModuleRevisionId, resolvedResource.getRevision());
            }
        }
        if (z) {
            Message.verbose("\t\t[" + toSystem(resolvedModuleRevisionId).getRevision() + "] " + moduleRevisionId.getModuleId());
        }
        moduleDescriptor.setResolvedModuleRevisionId(resolvedModuleRevisionId);
        checkModuleDescriptorRevision(moduleDescriptor, moduleRevisionId);
    }

    public final ModuleRevisionId getRevision(ResolvedResource resolvedResource, ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor) {
        HashMap map = new HashMap();
        map.putAll(moduleDescriptor.getQualifiedExtraAttributes());
        map.putAll(moduleRevisionId.getQualifiedExtraAttributes());
        String revision = resolvedResource.getRevision();
        if (revision == null) {
            Message.debug("no revision found in reference for " + moduleRevisionId);
            if (getSettings().getVersionMatcher().isDynamic(moduleRevisionId)) {
                if (moduleDescriptor.getModuleRevisionId().getRevision() == null) {
                    revision = "working@" + getName();
                } else {
                    Message.debug("using " + moduleRevisionId);
                    revision = moduleRevisionId.getRevision();
                }
            } else {
                Message.debug("using " + moduleRevisionId);
                revision = moduleRevisionId.getRevision();
            }
        }
        return ModuleRevisionId.newInstance(moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getBranch(), revision, map);
    }

    public ResolvedModuleRevision parse(ResolvedResource resolvedResource, DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        IvyNode node;
        DependencyDescriptor system = toSystem(dependencyDescriptor);
        ModuleRevisionId dependencyRevisionId = system.getDependencyRevisionId();
        ModuleDescriptorParser parser = ModuleDescriptorParserRegistry.getInstance().getParser(resolvedResource.getResource());
        if (parser == null) {
            Message.warn("no module descriptor parser available for " + resolvedResource.getResource());
            return null;
        }
        Message.verbose("\t" + getName() + ": found md file for " + dependencyRevisionId);
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t=> ");
        sb.append(resolvedResource);
        Message.verbose(sb.toString());
        Message.debug("\tparser = " + parser);
        if (getSettings().getVersionMatcher().isDynamic(dependencyRevisionId) && (node = resolveData.getNode((dependencyRevisionId = ModuleRevisionId.newInstance(dependencyRevisionId, resolvedResource.getRevision())))) != null && node.getModuleRevision() != null) {
            if (node.getDescriptor() == null || !node.getDescriptor().isDefault()) {
                Message.verbose("\t" + getName() + ": revision already resolved: " + dependencyRevisionId);
                node.getModuleRevision().getReport().setSearched(true);
                return node.getModuleRevision();
            }
            Message.verbose("\t" + getName() + ": found already resolved revision: " + dependencyRevisionId + ": but it's a default one, maybe we can find a better one");
        }
        return getRepositoryCacheManager().cacheModuleDescriptor(this, resolvedResource, system, parser.getMetadataArtifact(dependencyRevisionId, resolvedResource.getResource()), this.downloader, getCacheOptions(resolveData));
    }

    /* renamed from: org.apache.ivy.plugins.resolver.BasicResolver$2 */
    public class C112572 implements ResourceMDParser {
        public final /* synthetic */ ResolveData val$data;
        public final /* synthetic */ DependencyDescriptor val$dd;

        public C112572(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
            dependencyDescriptor = dependencyDescriptor;
            resolveData = resolveData;
        }

        @Override // org.apache.ivy.plugins.resolver.util.ResourceMDParser
        public MDResolvedResource parse(Resource resource, String str) {
            try {
                ResolvedModuleRevision resolvedModuleRevision = BasicResolver.this.parse(new ResolvedResource(resource, str), dependencyDescriptor, resolveData);
                if (resolvedModuleRevision != null) {
                    return new MDResolvedResource(resource, str, resolvedModuleRevision);
                }
                return null;
            } catch (ParseException e) {
                Message.warn("Failed to parse the file '" + resource + "'", e);
                return null;
            }
        }
    }

    public ResourceMDParser getRMDParser(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        return new ResourceMDParser() { // from class: org.apache.ivy.plugins.resolver.BasicResolver.2
            public final /* synthetic */ ResolveData val$data;
            public final /* synthetic */ DependencyDescriptor val$dd;

            public C112572(DependencyDescriptor dependencyDescriptor2, ResolveData resolveData2) {
                dependencyDescriptor = dependencyDescriptor2;
                resolveData = resolveData2;
            }

            @Override // org.apache.ivy.plugins.resolver.util.ResourceMDParser
            public MDResolvedResource parse(Resource resource, String str) {
                try {
                    ResolvedModuleRevision resolvedModuleRevision = BasicResolver.this.parse(new ResolvedResource(resource, str), dependencyDescriptor, resolveData);
                    if (resolvedModuleRevision != null) {
                        return new MDResolvedResource(resource, str, resolvedModuleRevision);
                    }
                    return null;
                } catch (ParseException e) {
                    Message.warn("Failed to parse the file '" + resource + "'", e);
                    return null;
                }
            }
        };
    }

    /* renamed from: org.apache.ivy.plugins.resolver.BasicResolver$3 */
    public class C112583 implements ResourceMDParser {
        public final /* synthetic */ ModuleId val$mid;

        public C112583(ModuleId moduleId) {
            moduleId = moduleId;
        }

        @Override // org.apache.ivy.plugins.resolver.util.ResourceMDParser
        public MDResolvedResource parse(Resource resource, String str) {
            DefaultModuleDescriptor defaultModuleDescriptorNewDefaultInstance = DefaultModuleDescriptor.newDefaultInstance(new ModuleRevisionId(moduleId, str));
            MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(defaultModuleDescriptorNewDefaultInstance.getMetadataArtifact());
            metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
            metadataArtifactDownloadReport.setSearched(true);
            BasicResolver basicResolver = BasicResolver.this;
            return new MDResolvedResource(resource, str, new ResolvedModuleRevision(basicResolver, basicResolver, defaultModuleDescriptorNewDefaultInstance, metadataArtifactDownloadReport, basicResolver.isForce()));
        }
    }

    public ResourceMDParser getDefaultRMDParser(ModuleId moduleId) {
        return new ResourceMDParser() { // from class: org.apache.ivy.plugins.resolver.BasicResolver.3
            public final /* synthetic */ ModuleId val$mid;

            public C112583(ModuleId moduleId2) {
                moduleId = moduleId2;
            }

            @Override // org.apache.ivy.plugins.resolver.util.ResourceMDParser
            public MDResolvedResource parse(Resource resource, String str) {
                DefaultModuleDescriptor defaultModuleDescriptorNewDefaultInstance = DefaultModuleDescriptor.newDefaultInstance(new ModuleRevisionId(moduleId, str));
                MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(defaultModuleDescriptorNewDefaultInstance.getMetadataArtifact());
                metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                metadataArtifactDownloadReport.setSearched(true);
                BasicResolver basicResolver = BasicResolver.this;
                return new MDResolvedResource(resource, str, new ResolvedModuleRevision(basicResolver, basicResolver, defaultModuleDescriptorNewDefaultInstance, metadataArtifactDownloadReport, basicResolver.isForce()));
            }
        };
    }

    public final void checkDescriptorConsistency(ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor, ResolvedResource resolvedResource) throws ParseException {
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (moduleRevisionId.getOrganisation().equals(moduleDescriptor.getModuleRevisionId().getOrganisation())) {
            z = true;
        } else {
            Message.error(String.format("\t%s: bad organisation found in %s: expected='%s' found='%s'", getName(), resolvedResource.getResource(), moduleRevisionId.getOrganisation(), moduleDescriptor.getModuleRevisionId().getOrganisation()));
            sb.append("bad organisation: expected='");
            sb.append(moduleRevisionId.getOrganisation());
            sb.append("' found='");
            sb.append(moduleDescriptor.getModuleRevisionId().getOrganisation());
            sb.append("'; ");
            z = false;
        }
        if (!moduleRevisionId.getName().equals(moduleDescriptor.getModuleRevisionId().getName())) {
            Message.error(String.format("\t%s: bad module name found in %s: expected='%s found='%s'", getName(), resolvedResource.getResource(), moduleRevisionId.getName(), moduleDescriptor.getModuleRevisionId().getName()));
            sb.append("bad module name: expected='");
            sb.append(moduleRevisionId.getName());
            sb.append("' found='");
            sb.append(moduleDescriptor.getModuleRevisionId().getName());
            sb.append("'; ");
            z = false;
        }
        if (moduleRevisionId.getBranch() != null && !moduleRevisionId.getBranch().equals(moduleDescriptor.getModuleRevisionId().getBranch())) {
            Message.error(String.format("\t%s: bad branch name found in %s: expected='%s found='%s'", getName(), resolvedResource.getResource(), moduleRevisionId.getBranch(), moduleDescriptor.getModuleRevisionId().getBranch()));
            sb.append("bad branch name: expected='");
            sb.append(moduleRevisionId.getBranch());
            sb.append("' found='");
            sb.append(moduleDescriptor.getModuleRevisionId().getBranch());
            sb.append("'; ");
            z = false;
        }
        if (resolvedResource.getRevision() != null && !resolvedResource.getRevision().startsWith("working@") && !moduleRevisionId.getRevision().equals(moduleDescriptor.getModuleRevisionId().getRevision())) {
            if (!getSettings().getVersionMatcher().accept(ModuleRevisionId.newInstance(moduleRevisionId, moduleRevisionId.getRevision()), moduleDescriptor)) {
                Message.error(String.format("\t%s: bad revision found in %s: expected='%s found='%s'", getName(), resolvedResource.getResource(), resolvedResource.getRevision(), moduleDescriptor.getModuleRevisionId().getRevision()));
                sb.append("bad revision: expected='");
                sb.append(resolvedResource.getRevision());
                sb.append("' found='");
                sb.append(moduleDescriptor.getModuleRevisionId().getRevision());
                sb.append("'; ");
                z = false;
            }
        }
        if (!getSettings().getStatusManager().isStatus(moduleDescriptor.getStatus())) {
            Message.error(String.format("\t%s: bad status found in %s: '%s'", getName(), resolvedResource.getResource(), moduleDescriptor.getStatus()));
            sb.append("bad status: '");
            sb.append(moduleDescriptor.getStatus());
            sb.append("'; ");
            z = false;
        }
        for (Map.Entry<String, String> entry : moduleRevisionId.getExtraAttributes().entrySet()) {
            if (entry.getValue() != null && !entry.getValue().equals(moduleDescriptor.getExtraAttribute(entry.getKey()))) {
                String str = String.format("bad %s found in %s: expected='%s' found='%s'", entry.getKey(), resolvedResource.getResource(), entry.getValue(), moduleDescriptor.getExtraAttribute(entry.getKey()));
                Message.error("\t" + getName() + ": " + str);
                sb.append(str);
                sb.append(PropertiesParser.PROPS_SEPARATOR);
                z = false;
            }
        }
        if (z) {
            return;
        }
        throw new ParseException("inconsistent module descriptor file found in '" + resolvedResource.getResource() + "': " + ((Object) sb), 0);
    }

    public ResolvedResource findResource(ResolvedResource[] resolvedResourceArr, ResourceMDParser resourceMDParser, ModuleRevisionId moduleRevisionId, Date date) {
        ResolvedResource resolvedResource;
        String name = getName();
        VersionMatcher versionMatcher = getSettings().getVersionMatcher();
        List<ArtifactInfo> listSort = getLatestStrategy().sort(resolvedResourceArr);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IvyContext context = IvyContext.getContext();
        ListIterator<ArtifactInfo> listIterator = listSort.listIterator(listSort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                resolvedResource = null;
                break;
            }
            resolvedResource = (ResolvedResource) listIterator.previous();
            if (filterNames(new ArrayList(Collections.singleton(resolvedResource.getRevision()))).isEmpty()) {
                Message.debug("\t" + name + ": filtered by name: " + resolvedResource);
            } else {
                ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(moduleRevisionId, resolvedResource.getRevision());
                ResolveData resolveData = context.getResolveData();
                if (resolveData != null && resolveData.getReport() != null && resolveData.isBlacklisted(resolveData.getReport().getConfiguration(), moduleRevisionIdNewInstance)) {
                    Message.debug("\t" + name + ": blacklisted: " + resolvedResource);
                    StringBuilder sb = new StringBuilder();
                    sb.append(resolvedResource.getRevision());
                    sb.append(" (blacklisted)");
                    arrayList.add(sb.toString());
                    arrayList2.add(moduleRevisionIdNewInstance);
                } else if (!versionMatcher.accept(moduleRevisionId, moduleRevisionIdNewInstance)) {
                    Message.debug("\t" + name + ": rejected by version matcher: " + resolvedResource);
                    arrayList.add(resolvedResource.getRevision());
                } else if (resolvedResource.getResource() != null && !resolvedResource.getResource().exists()) {
                    Message.debug("\t" + name + ": unreachable: " + resolvedResource + "; res=" + resolvedResource.getResource());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(resolvedResource.getRevision());
                    sb2.append(" (unreachable)");
                    arrayList.add(sb2.toString());
                } else if (date != null && resolvedResource.getLastModified() > date.getTime()) {
                    Message.verbose("\t" + name + ": too young: " + resolvedResource);
                    arrayList.add(resolvedResource.getRevision() + " (" + resolvedResource.getLastModified() + ")");
                } else {
                    if (!versionMatcher.needModuleDescriptor(moduleRevisionId, moduleRevisionIdNewInstance)) {
                        break;
                    }
                    MDResolvedResource mDResolvedResource = resourceMDParser.parse(resolvedResource.getResource(), resolvedResource.getRevision());
                    if (mDResolvedResource == null) {
                        Message.debug("\t" + name + ": impossible to get module descriptor resource: " + resolvedResource);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(resolvedResource.getRevision());
                        sb3.append(" (no or bad MD)");
                        arrayList.add(sb3.toString());
                    } else {
                        ModuleDescriptor descriptor = mDResolvedResource.getResolvedModuleRevision().getDescriptor();
                        if (descriptor.isDefault()) {
                            Message.debug("\t" + name + ": default md rejected by version matcherrequiring module descriptor: " + resolvedResource);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(resolvedResource.getRevision());
                            sb4.append(" (MD)");
                            arrayList.add(sb4.toString());
                        } else {
                            if (versionMatcher.accept(moduleRevisionId, descriptor)) {
                                resolvedResource = mDResolvedResource;
                                break;
                            }
                            Message.debug("\t" + name + ": md rejected by version matcher: " + resolvedResource);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(resolvedResource.getRevision());
                            sb5.append(" (MD)");
                            arrayList.add(sb5.toString());
                        }
                    }
                }
            }
        }
        if (resolvedResource == null && !arrayList.isEmpty()) {
            logAttempt(arrayList.toString());
        }
        if (resolvedResource == null && !arrayList2.isEmpty()) {
            DependencyDescriptor dependencyDescriptor = context.getDependencyDescriptor();
            context.getResolveData().getNode(dependencyDescriptor.getParentRevisionId()).getConflictManager(moduleRevisionId.getModuleId()).handleAllBlacklistedRevisions(dependencyDescriptor, arrayList2);
        }
        return resolvedResource;
    }

    public Collection<String> filterNames(Collection<String> collection) {
        getSettings().filterIgnore(collection);
        return collection;
    }

    public void clearIvyAttempts() {
        this.ivyattempts.clear();
        clearArtifactAttempts();
    }

    public void logIvyAttempt(String str) {
        this.ivyattempts.add(str);
        Message.verbose("\t\ttried " + str);
    }

    public void logArtifactAttempt(Artifact artifact, String str) {
        List<String> arrayList = this.artattempts.get(artifact);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.artattempts.put(artifact, arrayList);
        }
        arrayList.add(str);
        Message.verbose("\t\ttried " + str);
    }

    public void logAttempt(String str) {
        Artifact artifact = (Artifact) IvyContext.getContext().get(getName() + ".artifact");
        if (artifact == null) {
            logIvyAttempt(str);
        } else {
            logArtifactAttempt(artifact, str);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure() {
        Message.warn("==== " + getName() + ": tried");
        Iterator<String> it = this.ivyattempts.iterator();
        while (it.hasNext()) {
            Message.warn(GlideException.IndentedAppendable.INDENT + it.next());
        }
        for (Map.Entry<Artifact, List<String>> entry : this.artattempts.entrySet()) {
            List<String> value = entry.getValue();
            if (value != null) {
                Message.warn("  -- artifact " + entry.getKey() + StringUtils.PROCESS_POSTFIX_DELIMITER);
                Iterator<String> it2 = value.iterator();
                while (it2.hasNext()) {
                    Message.warn(GlideException.IndentedAppendable.INDENT + it2.next());
                }
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure(Artifact artifact) {
        Message.warn("==== " + getName() + ": tried");
        List<String> list = this.artattempts.get(artifact);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Message.warn(GlideException.IndentedAppendable.INDENT + it.next());
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        RepositoryCacheManager repositoryCacheManager = getRepositoryCacheManager();
        clearArtifactAttempts();
        DownloadReport downloadReport = new DownloadReport();
        for (Artifact artifact : artifactArr) {
            ArtifactDownloadReport artifactDownloadReportDownload = repositoryCacheManager.download(artifact, this.artifactResourceResolver, this.downloader, getCacheDownloadOptions(downloadOptions));
            if (DownloadStatus.FAILED == artifactDownloadReportDownload.getDownloadStatus()) {
                if (!ArtifactDownloadReport.MISSING_ARTIFACT.equals(artifactDownloadReportDownload.getDownloadDetails())) {
                    Message.warn("\t" + artifactDownloadReportDownload);
                }
            } else if (DownloadStatus.f9964NO == artifactDownloadReportDownload.getDownloadStatus()) {
                Message.verbose("\t" + artifactDownloadReportDownload);
            } else if (LogOptions.LOG_QUIET.equals(downloadOptions.getLog())) {
                Message.verbose("\t" + artifactDownloadReportDownload);
            } else {
                Message.info("\t" + artifactDownloadReportDownload);
            }
            downloadReport.addArtifactReport(artifactDownloadReportDownload);
            checkInterrupted();
        }
        return downloadReport;
    }

    public void clearArtifactAttempts() {
        this.artattempts.clear();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactDownloadReport download(ArtifactOrigin artifactOrigin, DownloadOptions downloadOptions) {
        Checks.checkNotNull(artifactOrigin, "origin");
        return getRepositoryCacheManager().download(artifactOrigin.getArtifact(), new ArtifactResourceResolver() { // from class: org.apache.ivy.plugins.resolver.BasicResolver.4
            public final /* synthetic */ ArtifactOrigin val$origin;

            public C112594(ArtifactOrigin artifactOrigin2) {
                artifactOrigin = artifactOrigin2;
            }

            @Override // org.apache.ivy.plugins.repository.ArtifactResourceResolver
            public ResolvedResource resolve(Artifact artifact) {
                try {
                    Resource resource = BasicResolver.this.getResource(artifactOrigin.getLocation());
                    if (resource != null) {
                        return new ResolvedResource(resource, artifactOrigin.getArtifact().getModuleRevisionId().getRevision());
                    }
                    return null;
                } catch (IOException e) {
                    Message.debug(e);
                    return null;
                }
            }
        }, this.downloader, getCacheDownloadOptions(downloadOptions));
    }

    /* renamed from: org.apache.ivy.plugins.resolver.BasicResolver$4 */
    public class C112594 implements ArtifactResourceResolver {
        public final /* synthetic */ ArtifactOrigin val$origin;

        public C112594(ArtifactOrigin artifactOrigin2) {
            artifactOrigin = artifactOrigin2;
        }

        @Override // org.apache.ivy.plugins.repository.ArtifactResourceResolver
        public ResolvedResource resolve(Artifact artifact) {
            try {
                Resource resource = BasicResolver.this.getResource(artifactOrigin.getLocation());
                if (resource != null) {
                    return new ResolvedResource(resource, artifactOrigin.getArtifact().getModuleRevisionId().getRevision());
                }
                return null;
            } catch (IOException e) {
                Message.debug(e);
                return null;
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        ResolvedResource artifactRef = getArtifactRef(artifact, null);
        return artifactRef != null && artifactRef.getResource().exists();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        ArtifactOrigin savedArtifactOrigin = getRepositoryCacheManager().getSavedArtifactOrigin(toSystem(artifact));
        if (!ArtifactOrigin.isUnknown(savedArtifactOrigin)) {
            return savedArtifactOrigin;
        }
        ResolvedResource artifactRef = getArtifactRef(artifact, null);
        if (artifactRef == null || !artifactRef.getResource().exists()) {
            return null;
        }
        return new ArtifactOrigin(artifact, artifactRef.getResource().isLocal(), artifactRef.getResource().getName());
    }

    public long getPublicationDate(ModuleDescriptor moduleDescriptor, DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        if (moduleDescriptor.getPublicationDate() != null) {
            return moduleDescriptor.getPublicationDate().getTime();
        }
        ResolvedResource resolvedResourceFindFirstArtifactRef = findFirstArtifactRef(moduleDescriptor, dependencyDescriptor, resolveData);
        if (resolvedResourceFindFirstArtifactRef != null) {
            return resolvedResourceFindFirstArtifactRef.getLastModified();
        }
        return -1L;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver
    public String toString() {
        return getName();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public String[] listTokenValues(String str, Map<String, String> map) {
        Collection<String> collectionFindNames = findNames(map, str);
        return (String[]) collectionFindNames.toArray(new String[collectionFindNames.size()]);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public OrganisationEntry[] listOrganisations() {
        Collection<String> collectionFindNames = findNames(Collections.emptyMap(), IvyPatternHelper.ORGANISATION_KEY);
        ArrayList arrayList = new ArrayList(collectionFindNames.size());
        Iterator<String> it = collectionFindNames.iterator();
        while (it.hasNext()) {
            arrayList.add(new OrganisationEntry(this, it.next()));
        }
        return (OrganisationEntry[]) arrayList.toArray(new OrganisationEntry[collectionFindNames.size()]);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ModuleEntry[] listModules(OrganisationEntry organisationEntry) {
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, organisationEntry.getOrganisation());
        Collection<String> collectionFindNames = findNames(map, "module");
        ArrayList arrayList = new ArrayList(collectionFindNames.size());
        Iterator<String> it = collectionFindNames.iterator();
        while (it.hasNext()) {
            arrayList.add(new ModuleEntry(organisationEntry, it.next()));
        }
        return (ModuleEntry[]) arrayList.toArray(new ModuleEntry[collectionFindNames.size()]);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public RevisionEntry[] listRevisions(ModuleEntry moduleEntry) {
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, moduleEntry.getOrganisation());
        map.put("module", moduleEntry.getModule());
        Collection<String> collectionFindNames = findNames(map, IvyPatternHelper.REVISION_KEY);
        ArrayList arrayList = new ArrayList(collectionFindNames.size());
        Iterator<String> it = collectionFindNames.iterator();
        while (it.hasNext()) {
            arrayList.add(new RevisionEntry(moduleEntry, it.next()));
        }
        return (RevisionEntry[]) arrayList.toArray(new RevisionEntry[collectionFindNames.size()]);
    }

    public ResolvedResource findFirstArtifactRef(ModuleDescriptor moduleDescriptor, DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        for (String str : moduleDescriptor.getConfigurationsNames()) {
            for (Artifact artifact : moduleDescriptor.getArtifacts(str)) {
                ResolvedResource artifactRef = getArtifactRef(artifact, resolveData.getDate());
                if (artifactRef != null) {
                    return artifactRef;
                }
            }
        }
        return null;
    }

    public long getAndCheck(Resource resource, File file) throws IOException {
        long j = get(resource, file);
        String[] checksumAlgorithms = getChecksumAlgorithms();
        int length = checksumAlgorithms.length;
        for (int i = 0; i < length && !check(resource, file, checksumAlgorithms[i]); i++) {
        }
        return j;
    }

    public final boolean check(Resource resource, File file, String str) throws IOException {
        if (!ChecksumHelper.isKnownAlgorithm(str)) {
            throw new IllegalArgumentException("Unknown checksum algorithm: " + str);
        }
        Resource resourceClone = resource.clone(resource.getName() + "." + str);
        if (!resourceClone.exists()) {
            return false;
        }
        Message.debug(str + " file found for " + resource + ": checking...");
        File fileCreateTempFile = File.createTempFile("ivytmp", str);
        try {
            get(resourceClone, fileCreateTempFile);
            try {
                ChecksumHelper.check(file, fileCreateTempFile, str);
                Message.verbose(str + " OK for " + resource);
                fileCreateTempFile.delete();
                return true;
            } catch (IOException e) {
                file.delete();
                throw e;
            }
        } catch (Throwable th) {
            fileCreateTempFile.delete();
            throw th;
        }
    }

    public ResolvedResource getArtifactRef(Artifact artifact, Date date) {
        File file;
        Resource fileResource;
        IvyContext context = IvyContext.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(".artifact");
        context.set(sb.toString(), artifact);
        try {
            ResolvedResource resolvedResourceFindArtifactRef = findArtifactRef(artifact, date);
            if (resolvedResourceFindArtifactRef == null && artifact.getUrl() != null) {
                URL url = artifact.getUrl();
                Message.verbose("\tusing url for " + artifact + ": " + url);
                logArtifactAttempt(artifact, url.toExternalForm());
                if (PomReader.PomProfileElement.FILE.equals(url.getProtocol())) {
                    try {
                        file = new File(new URI(url.toExternalForm()));
                    } catch (URISyntaxException unused) {
                        file = new File(url.getPath());
                    }
                    fileResource = new FileResource(new FileRepository(), file);
                } else {
                    fileResource = new URLResource(url, getTimeoutConstraint());
                }
                resolvedResourceFindArtifactRef = new ResolvedResource(fileResource, artifact.getModuleRevisionId().getRevision());
            }
            return resolvedResourceFindArtifactRef;
        } finally {
            IvyContext.getContext().set(getName() + ".artifact", null);
        }
    }

    public ResolvedResource doFindArtifactRef(Artifact artifact, Date date) {
        return findArtifactRef(artifact, date);
    }

    public boolean isCheckconsistency() {
        return this.checkconsistency;
    }

    public void setCheckconsistency(boolean z) {
        this.checkconsistency = z;
    }

    public void setForce(boolean z) {
        this.force = z;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isAllownomd() {
        return this.allownomd;
    }

    public void setAllownomd(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("allownomd is deprecated, please use descriptor=\"");
        sb.append(z ? "optional" : "required");
        sb.append("\" instead");
        Message.deprecated(sb.toString());
        this.allownomd = z;
    }

    public void setDescriptor(String str) {
        str.hashCode();
        if (!str.equals("required")) {
            if (str.equals("optional")) {
                this.allownomd = true;
                return;
            }
            throw new IllegalArgumentException("unknown descriptor rule '" + str + "'. Allowed rules are: " + Arrays.asList("required", "optional"));
        }
        this.allownomd = false;
    }

    public String[] getChecksumAlgorithms() {
        String variable = this.checksums;
        if (variable == null) {
            variable = getSettings().getVariable("ivy.checksums");
        }
        if (variable == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : org.apache.ivy.util.StringUtils.splitToArray(variable)) {
            if (!str.isEmpty() && !"none".equals(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void setChecksums(String str) {
        this.checksums = str;
    }

    /* renamed from: org.apache.ivy.plugins.resolver.BasicResolver$5 */
    public class C112605 implements ArtifactResourceResolver {
        public C112605() {
        }

        @Override // org.apache.ivy.plugins.repository.ArtifactResourceResolver
        public ResolvedResource resolve(Artifact artifact) {
            return BasicResolver.this.getArtifactRef(BasicResolver.this.fromSystem(artifact), null);
        }
    }

    /* renamed from: org.apache.ivy.plugins.resolver.BasicResolver$6 */
    public class C112616 implements ResourceDownloader {
        public C112616() {
        }

        @Override // org.apache.ivy.plugins.repository.ResourceDownloader
        public void download(Artifact artifact, Resource resource, File file) throws IOException {
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(file.getAbsolutePath() + FileSystemResolver.TRANSACTION_DESTINATION_SUFFIX);
            if (resource.getName().equals(String.valueOf(artifact.getUrl()))) {
                if (file2.getParentFile() != null) {
                    file2.getParentFile().mkdirs();
                }
                BasicResolver.this.extartifactrep.get(resource.getName(), file2);
            } else {
                BasicResolver.this.getAndCheck(resource, file2);
            }
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("impossible to move part file to definitive one: " + file2 + " -> " + file);
        }
    }
}
