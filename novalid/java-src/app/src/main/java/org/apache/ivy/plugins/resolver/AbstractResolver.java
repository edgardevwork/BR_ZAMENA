package org.apache.ivy.plugins.resolver;

import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.RelativeUrlResolver;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.CacheDownloadOptions;
import org.apache.ivy.core.cache.CacheMetadataOptions;
import org.apache.ivy.core.cache.DownloadListener;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.event.download.EndArtifactDownloadEvent;
import org.apache.ivy.core.event.download.NeedArtifactEvent;
import org.apache.ivy.core.event.download.StartArtifactDownloadEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.core.settings.Validatable;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.resolver.ChainResolver;
import org.apache.ivy.plugins.resolver.util.HasLatestStrategy;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public abstract class AbstractResolver implements DependencyResolver, HasLatestStrategy, Validatable {
    public String cacheManagerName;
    public String changingMatcherName;
    public String changingPattern;
    public Boolean checkmodified;
    public LatestStrategy latestStrategy;
    public String latestStrategyName;
    public String name;
    public Namespace namespace;
    public String namespaceName;
    public RepositoryCacheManager repositoryCacheManager;
    public ResolverSettings settings;
    public TimeoutConstraint timeoutConstraint;
    public String timeoutConstraintName;
    public Boolean validate = null;
    public EventManager eventManager = null;

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void abortPublishTransaction() throws IOException {
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void beginPublishTransaction(ModuleRevisionId moduleRevisionId, boolean z) throws IOException {
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void commitPublishTransaction() throws IOException {
    }

    public String hidePassword(String str) {
        return str;
    }

    public ResolverSettings getSettings() {
        return this.settings;
    }

    public ParserSettings getParserSettings() {
        return new ResolverParserSettings();
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void setSettings(ResolverSettings resolverSettings) {
        this.settings = resolverSettings;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public String getName() {
        return this.name;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void setName(String str) {
        this.name = str;
    }

    public boolean doValidate(ResolveData resolveData) {
        Boolean bool = this.validate;
        if (bool != null) {
            return bool.booleanValue();
        }
        return resolveData.isValidate();
    }

    public boolean isValidate() {
        Boolean bool = this.validate;
        return bool == null || bool.booleanValue();
    }

    public void setValidate(boolean z) {
        this.validate = Boolean.valueOf(z);
    }

    public void checkInterrupted() {
        IvyContext.getContext().getIvy().checkInterrupted();
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure() {
        Message.verbose("no failure report implemented by " + getName());
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure(Artifact artifact) {
        Message.verbose("no failure report implemented by " + getName());
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public String[] listTokenValues(String str, Map<String, String> map) {
        return new String[0];
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public Map<String, String>[] listTokenValues(String[] strArr, Map<String, Object> map) {
        return new Map[0];
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public OrganisationEntry[] listOrganisations() {
        return new OrganisationEntry[0];
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ModuleEntry[] listModules(OrganisationEntry organisationEntry) {
        return new ModuleEntry[0];
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public RevisionEntry[] listRevisions(ModuleEntry moduleEntry) {
        return new RevisionEntry[0];
    }

    public String toString() {
        return getName();
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        Message.verbose("\t" + getName() + " [" + getTypeName() + "]");
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tcache: ");
        sb.append(this.cacheManagerName);
        Message.debug(sb.toString());
    }

    public String getTypeName() {
        return getClass().getName();
    }

    public TimeoutConstraint getTimeoutConstraint() {
        return this.timeoutConstraint;
    }

    public void setTimeoutConstraint(String str) {
        this.timeoutConstraintName = str;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactDownloadReport download(ArtifactOrigin artifactOrigin, DownloadOptions downloadOptions) {
        return download(new Artifact[]{artifactOrigin.getArtifact()}, downloadOptions).getArtifactReport(artifactOrigin.getArtifact());
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        return locate(artifact) != null;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        DownloadReport downloadReportDownload = download(new Artifact[]{artifact}, new DownloadOptions());
        if (downloadReportDownload == null) {
            throw new IllegalStateException("null download report returned by " + getName() + " (" + getClass().getName() + ") when trying to download " + artifact);
        }
        ArtifactDownloadReport artifactReport = downloadReportDownload.getArtifactReport(artifact);
        if (artifactReport.getDownloadStatus() == DownloadStatus.FAILED) {
            return null;
        }
        return artifactReport.getArtifactOrigin();
    }

    @Override // org.apache.ivy.plugins.resolver.util.HasLatestStrategy
    public LatestStrategy getLatestStrategy() {
        if (this.latestStrategy == null) {
            initLatestStrategyFromSettings();
        }
        return this.latestStrategy;
    }

    public final void initLatestStrategyFromSettings() {
        if (getSettings() != null) {
            String str = this.latestStrategyName;
            if (str != null && !"default".equals(str)) {
                LatestStrategy latestStrategy = getSettings().getLatestStrategy(this.latestStrategyName);
                this.latestStrategy = latestStrategy;
                if (latestStrategy != null) {
                    return;
                }
                throw new IllegalStateException("unknown latest strategy '" + this.latestStrategyName + "'");
            }
            this.latestStrategy = getSettings().getDefaultLatestStrategy();
            Message.debug(getName() + ": no latest strategy defined: using default");
            return;
        }
        throw new IllegalStateException("no ivy instance found: impossible to get a latest strategy without ivy instance");
    }

    @Override // org.apache.ivy.plugins.resolver.util.HasLatestStrategy
    public void setLatestStrategy(LatestStrategy latestStrategy) {
        this.latestStrategy = latestStrategy;
    }

    public void setLatest(String str) {
        this.latestStrategyName = str;
    }

    @Override // org.apache.ivy.plugins.resolver.util.HasLatestStrategy
    public String getLatest() {
        if (this.latestStrategyName == null) {
            this.latestStrategyName = "default";
        }
        return this.latestStrategyName;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public Namespace getNamespace() {
        if (this.namespace == null) {
            initNamespaceFromSettings();
        }
        return this.namespace;
    }

    public final void initNamespaceFromSettings() {
        if (getSettings() != null) {
            if (this.namespaceName != null) {
                Namespace namespace = getSettings().getNamespace(this.namespaceName);
                this.namespace = namespace;
                if (namespace != null) {
                    return;
                }
                throw new IllegalStateException("unknown namespace '" + this.namespaceName + "'");
            }
            this.namespace = getSettings().getSystemNamespace();
            Message.debug(getName() + ": no namespace defined: using system");
            return;
        }
        Message.verbose(getName() + ": no namespace defined nor ivy instance: using system namespace");
        this.namespace = Namespace.SYSTEM_NAMESPACE;
    }

    public void setNamespace(String str) {
        this.namespaceName = str;
    }

    public ModuleDescriptor toSystem(ModuleDescriptor moduleDescriptor) {
        return NameSpaceHelper.toSystem(moduleDescriptor, getNamespace());
    }

    public Artifact fromSystem(Artifact artifact) {
        return NameSpaceHelper.transform(artifact, getNamespace().getFromSystemTransformer());
    }

    public Artifact toSystem(Artifact artifact) {
        return NameSpaceHelper.transform(artifact, getNamespace().getToSystemTransformer());
    }

    public MetadataArtifactDownloadReport toSystem(MetadataArtifactDownloadReport metadataArtifactDownloadReport) {
        return NameSpaceHelper.transform(metadataArtifactDownloadReport, getNamespace().getToSystemTransformer());
    }

    public ResolvedModuleRevision toSystem(ResolvedModuleRevision resolvedModuleRevision) {
        return NameSpaceHelper.toSystem(resolvedModuleRevision, getNamespace());
    }

    public ModuleRevisionId toSystem(ModuleRevisionId moduleRevisionId) {
        return getNamespace().getToSystemTransformer().transform(moduleRevisionId);
    }

    public DependencyDescriptor fromSystem(DependencyDescriptor dependencyDescriptor) {
        return NameSpaceHelper.transform(dependencyDescriptor, getNamespace().getFromSystemTransformer(), true);
    }

    public DependencyDescriptor toSystem(DependencyDescriptor dependencyDescriptor) {
        return NameSpaceHelper.transform(dependencyDescriptor, getNamespace().getToSystemTransformer(), true);
    }

    public IvyNode getSystemNode(ResolveData resolveData, ModuleRevisionId moduleRevisionId) {
        return resolveData.getNode(toSystem(moduleRevisionId));
    }

    public ResolvedModuleRevision findModuleInCache(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        return findModuleInCache(dependencyDescriptor, resolveData, false);
    }

    public ResolvedModuleRevision findModuleInCache(DependencyDescriptor dependencyDescriptor, ResolveData resolveData, boolean z) {
        ResolvedModuleRevision resolvedModuleRevisionFindModuleInCache = getRepositoryCacheManager().findModuleInCache(dependencyDescriptor, dependencyDescriptor.getDependencyRevisionId(), getCacheOptions(resolveData), z ? null : getName());
        if (resolvedModuleRevisionFindModuleInCache == null) {
            return null;
        }
        if (resolveData.getReport() == null || !resolveData.isBlacklisted(resolveData.getReport().getConfiguration(), resolvedModuleRevisionFindModuleInCache.getId())) {
            return resolvedModuleRevisionFindModuleInCache;
        }
        Message.verbose("\t" + getName() + ": found revision in cache: " + resolvedModuleRevisionFindModuleInCache.getId() + " for " + dependencyDescriptor + ", but it is blacklisted");
        return null;
    }

    public void setChangingMatcher(String str) {
        this.changingMatcherName = str;
    }

    public String getChangingMatcherName() {
        return this.changingMatcherName;
    }

    public void setChangingPattern(String str) {
        this.changingPattern = str;
    }

    public String getChangingPattern() {
        return this.changingPattern;
    }

    public void setCheckmodified(boolean z) {
        this.checkmodified = Boolean.valueOf(z);
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public RepositoryCacheManager getRepositoryCacheManager() {
        if (this.repositoryCacheManager == null) {
            initRepositoryCacheManagerFromSettings();
        }
        return this.repositoryCacheManager;
    }

    public final void initRepositoryCacheManagerFromSettings() {
        String str = this.cacheManagerName;
        if (str == null) {
            RepositoryCacheManager defaultRepositoryCacheManager = this.settings.getDefaultRepositoryCacheManager();
            this.repositoryCacheManager = defaultRepositoryCacheManager;
            if (defaultRepositoryCacheManager == null) {
                throw new IllegalStateException("no default cache manager defined with current settings");
            }
            return;
        }
        RepositoryCacheManager repositoryCacheManager = this.settings.getRepositoryCacheManager(str);
        this.repositoryCacheManager = repositoryCacheManager;
        if (repositoryCacheManager != null) {
            return;
        }
        throw new IllegalStateException("unknown cache manager '" + this.cacheManagerName + "'. Available caches are " + Arrays.asList(this.settings.getRepositoryCacheManagers()));
    }

    public final void initTimeoutConstraintFromSettings() {
        String str = this.timeoutConstraintName;
        if (str == null) {
            return;
        }
        TimeoutConstraint timeoutConstraint = this.settings.getTimeoutConstraint(str);
        this.timeoutConstraint = timeoutConstraint;
        if (timeoutConstraint != null) {
            return;
        }
        throw new IllegalStateException("Unknown timeout constraint '" + this.timeoutConstraintName + "' on resolver '" + this.name + "'");
    }

    public void setRepositoryCacheManager(RepositoryCacheManager repositoryCacheManager) {
        this.cacheManagerName = repositoryCacheManager.getName();
        this.repositoryCacheManager = repositoryCacheManager;
    }

    public void setCache(String str) {
        this.cacheManagerName = str;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }

    @Override // org.apache.ivy.core.settings.Validatable
    public void validate() {
        initRepositoryCacheManagerFromSettings();
        initNamespaceFromSettings();
        initLatestStrategyFromSettings();
        initTimeoutConstraintFromSettings();
    }

    public CacheMetadataOptions getCacheOptions(ResolveData resolveData) {
        return (CacheMetadataOptions) new CacheMetadataOptions().setChangingMatcherName(getChangingMatcherName()).setChangingPattern(getChangingPattern()).setCheckTTL(!resolveData.getOptions().isUseCacheOnly()).setCheckmodified(resolveData.getOptions().isUseCacheOnly() ? Boolean.FALSE : this.checkmodified).setValidate(doValidate(resolveData)).setNamespace(getNamespace()).setUseCacheOnly(resolveData.getOptions().isUseCacheOnly()).setForce(resolveData.getOptions().isRefresh()).setListener(getDownloadListener(getDownloadOptions(resolveData.getOptions())));
    }

    public CacheDownloadOptions getCacheDownloadOptions(DownloadOptions downloadOptions) {
        CacheDownloadOptions cacheDownloadOptions = new CacheDownloadOptions();
        cacheDownloadOptions.setListener(getDownloadListener(downloadOptions));
        return cacheDownloadOptions;
    }

    public DownloadOptions getDownloadOptions(ResolveOptions resolveOptions) {
        return (DownloadOptions) new DownloadOptions().setLog(resolveOptions.getLog());
    }

    /* renamed from: org.apache.ivy.plugins.resolver.AbstractResolver$1 */
    public class C112551 implements DownloadListener {
        public final /* synthetic */ DownloadOptions val$options;

        public C112551(DownloadOptions downloadOptions) {
            downloadOptions = downloadOptions;
        }

        @Override // org.apache.ivy.core.cache.DownloadListener
        public void needArtifact(RepositoryCacheManager repositoryCacheManager, Artifact artifact) {
            if (AbstractResolver.this.eventManager != null) {
                AbstractResolver.this.eventManager.fireIvyEvent(new NeedArtifactEvent(AbstractResolver.this, artifact));
            }
        }

        @Override // org.apache.ivy.core.cache.DownloadListener
        public void startArtifactDownload(RepositoryCacheManager repositoryCacheManager, ResolvedResource resolvedResource, Artifact artifact, ArtifactOrigin artifactOrigin) {
            if (artifact.isMetadata() || LogOptions.LOG_QUIET.equals(downloadOptions.getLog())) {
                Message.verbose("downloading " + resolvedResource.getResource() + " ...");
            } else {
                Message.info("downloading " + resolvedResource.getResource() + " ...");
            }
            if (AbstractResolver.this.eventManager != null) {
                AbstractResolver.this.eventManager.fireIvyEvent(new StartArtifactDownloadEvent(AbstractResolver.this, artifact, artifactOrigin));
            }
        }

        @Override // org.apache.ivy.core.cache.DownloadListener
        public void endArtifactDownload(RepositoryCacheManager repositoryCacheManager, Artifact artifact, ArtifactDownloadReport artifactDownloadReport, File file) {
            if (AbstractResolver.this.eventManager != null) {
                AbstractResolver.this.eventManager.fireIvyEvent(new EndArtifactDownloadEvent(AbstractResolver.this, artifact, artifactDownloadReport, file));
            }
        }
    }

    public final DownloadListener getDownloadListener(DownloadOptions downloadOptions) {
        return new DownloadListener() { // from class: org.apache.ivy.plugins.resolver.AbstractResolver.1
            public final /* synthetic */ DownloadOptions val$options;

            public C112551(DownloadOptions downloadOptions2) {
                downloadOptions = downloadOptions2;
            }

            @Override // org.apache.ivy.core.cache.DownloadListener
            public void needArtifact(RepositoryCacheManager repositoryCacheManager, Artifact artifact) {
                if (AbstractResolver.this.eventManager != null) {
                    AbstractResolver.this.eventManager.fireIvyEvent(new NeedArtifactEvent(AbstractResolver.this, artifact));
                }
            }

            @Override // org.apache.ivy.core.cache.DownloadListener
            public void startArtifactDownload(RepositoryCacheManager repositoryCacheManager, ResolvedResource resolvedResource, Artifact artifact, ArtifactOrigin artifactOrigin) {
                if (artifact.isMetadata() || LogOptions.LOG_QUIET.equals(downloadOptions.getLog())) {
                    Message.verbose("downloading " + resolvedResource.getResource() + " ...");
                } else {
                    Message.info("downloading " + resolvedResource.getResource() + " ...");
                }
                if (AbstractResolver.this.eventManager != null) {
                    AbstractResolver.this.eventManager.fireIvyEvent(new StartArtifactDownloadEvent(AbstractResolver.this, artifact, artifactOrigin));
                }
            }

            @Override // org.apache.ivy.core.cache.DownloadListener
            public void endArtifactDownload(RepositoryCacheManager repositoryCacheManager, Artifact artifact, ArtifactDownloadReport artifactDownloadReport, File file) {
                if (AbstractResolver.this.eventManager != null) {
                    AbstractResolver.this.eventManager.fireIvyEvent(new EndArtifactDownloadEvent(AbstractResolver.this, artifact, artifactDownloadReport, file));
                }
            }
        };
    }

    public boolean isAfter(ResolvedModuleRevision resolvedModuleRevision, ResolvedModuleRevision resolvedModuleRevision2, Date date) {
        ArtifactInfo[] artifactInfoArr = {new ChainResolver.ResolvedModuleRevisionArtifactInfo(resolvedModuleRevision), new ChainResolver.ResolvedModuleRevisionArtifactInfo(resolvedModuleRevision2)};
        return getLatestStrategy().findLatest(artifactInfoArr, date) == artifactInfoArr[0];
    }

    public ResolvedModuleRevision checkLatest(DependencyDescriptor dependencyDescriptor, ResolvedModuleRevision resolvedModuleRevision, ResolveData resolveData) {
        Checks.checkNotNull(dependencyDescriptor, NativeKeys.DRAW_DISTANCE_NK);
        Checks.checkNotNull(resolveData, "data");
        saveModuleRevisionIfNeeded(dependencyDescriptor, resolvedModuleRevision);
        ResolvedModuleRevision currentResolvedModuleRevision = resolveData.getCurrentResolvedModuleRevision();
        String strDescribe = describe(resolvedModuleRevision);
        Message.debug("\tchecking " + strDescribe + " against " + describe(currentResolvedModuleRevision));
        if (currentResolvedModuleRevision == null) {
            Message.debug("\tmodule revision kept as first found: " + strDescribe);
            return resolvedModuleRevision;
        }
        if (isAfter(resolvedModuleRevision, currentResolvedModuleRevision, resolveData.getDate())) {
            Message.debug("\tmodule revision kept as younger: " + strDescribe);
            return resolvedModuleRevision;
        }
        if (!resolvedModuleRevision.getDescriptor().isDefault() && currentResolvedModuleRevision.getDescriptor().isDefault()) {
            Message.debug("\tmodule revision kept as better (not default): " + strDescribe);
            return resolvedModuleRevision;
        }
        Message.debug("\tmodule revision discarded as older: " + strDescribe);
        return currentResolvedModuleRevision;
    }

    public void saveModuleRevisionIfNeeded(DependencyDescriptor dependencyDescriptor, ResolvedModuleRevision resolvedModuleRevision) {
        if (resolvedModuleRevision == null || !getSettings().getVersionMatcher().isDynamic(dependencyDescriptor.getDependencyRevisionId())) {
            return;
        }
        getRepositoryCacheManager().saveResolvedRevision(getName(), dependencyDescriptor.getDependencyRevisionId(), resolvedModuleRevision.getId().getRevision());
    }

    public final String describe(ResolvedModuleRevision resolvedModuleRevision) {
        if (resolvedModuleRevision == null) {
            return "[none]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resolvedModuleRevision.getId());
        sb.append(resolvedModuleRevision.getDescriptor().isDefault() ? "[default]" : "");
        sb.append(" from ");
        sb.append(resolvedModuleRevision.getResolver().getName());
        return sb.toString();
    }

    public class ResolverParserSettings implements ParserSettings {
        public ResolverParserSettings() {
        }

        public /* synthetic */ ResolverParserSettings(AbstractResolver abstractResolver, C112551 c112551) {
            this();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public ConflictManager getConflictManager(String str) {
            return AbstractResolver.this.getSettings().getConflictManager(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Namespace getContextNamespace() {
            return AbstractResolver.this.getNamespace();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String getDefaultBranch(ModuleId moduleId) {
            return AbstractResolver.this.getSettings().getDefaultBranch(moduleId);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public PatternMatcher getMatcher(String str) {
            return AbstractResolver.this.getSettings().getMatcher(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Namespace getNamespace(String str) {
            return AbstractResolver.this.getSettings().getNamespace(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public RelativeUrlResolver getRelativeUrlResolver() {
            return AbstractResolver.this.getSettings().getRelativeUrlResolver();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public ResolutionCacheManager getResolutionCacheManager() {
            return AbstractResolver.this.getSettings().getResolutionCacheManager();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public DependencyResolver getResolver(ModuleRevisionId moduleRevisionId) {
            return AbstractResolver.this.getSettings().getResolver(moduleRevisionId);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public StatusManager getStatusManager() {
            return AbstractResolver.this.getSettings().getStatusManager();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public File resolveFile(String str) {
            return AbstractResolver.this.getSettings().resolveFile(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Map<String, String> substitute(Map<String, String> map) {
            return AbstractResolver.this.getSettings().substitute(map);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String substitute(String str) {
            return AbstractResolver.this.getSettings().substitute(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String getVariable(String str) {
            return AbstractResolver.this.getSettings().getVariable(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public TimeoutConstraint getTimeoutConstraint(String str) {
            return AbstractResolver.this.getSettings().getTimeoutConstraint(str);
        }
    }
}
